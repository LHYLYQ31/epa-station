/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.modules.timer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sinosoft.station.modules.station.model.Station;
import com.sinosoft.station.modules.station.service.StationService;

import net.sf.json.JSONObject;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年1月18日
 */
@Component //当组件不好归类的时候，我们可以使用这个注解进行标注。
@Configurable //自动注入bean
@EnableScheduling //开启计划任务的支持。
public class TimerTask {
    static Integer STATION_NUM = 23;
    private final static Logger logger = LoggerFactory.getLogger(TimerTask.class);
    public Station station;
    //public Integer i = 1;
    @Autowired
    StationService stationService;

    @Scheduled(cron = "0 0/1 * * * ?") //每个一分钟执行
    private void initialStatistics() throws IOException {
        logger.info("======timerStart===============");
        Long time = System.currentTimeMillis();
        List<Station> list = stationService.findAllByTime(time);
        if (list != null) {
            logger.info("查询出来的数据个数,{}", list.size());
            //处理数据
            for (int i = 0; i < list.size(); i++) {
                station = list.get(i);
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            timerTask(station);
                        }
                        catch (Exception e) {
                            logger.error("执行定时任务报错：" + e.getStackTrace()[0]);
                            e.printStackTrace();
                        }
                    }
                });
                t.start();
            }
        }
        else {
            logger.info("+++++++++++查询出来的数据个数为零条+++++++++++");
        }
    }

    /**
     * 
     * <B>方法名称：timerTask</B><BR>
     * <B>概要说明：定时器任务</B><BR>
     * 
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     *
     * @author：lihaiyi
     * @cretetime:2018年8月9日 下午3:58:11 void
     */
    public void timerTask(Station s) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, Exception {
        if (s != null && StringUtils.isNotBlank(s.getCVEHICLECODE())) {
            int count = 0;
            String station = "";
            File file = new File("D:\\server\\station.txt");
            if (file.exists()) {
                InputStream in = new FileInputStream(file);
                byte[] body = new byte[in.available()];
                if (body.length > 0) {
                    in.read(body);
                    in.close();
                    String station_num = new String(body);
                    String[] nums = station_num.split(",");
                    for (int j = 0; j < nums.length; j++) {
                        if (StringUtils.isNotBlank(nums[j])) {
                            logger.info("需要更新的站的：" + nums[j] + "=========================");
                            String findByOne = "findByOne";
                            String update = "update";

                            Class<?> clazz = stationService.getClass();
                            Method findMethod = clazz.getMethod(findByOne + nums[j], new Class<?>[] { String.class });
                            Object findValue = findMethod.invoke(stationService, new Object[] { s.getCVEHICLECODE() });
                            if (findValue != null) {
                                logger.info("查询到station的数据：{}", findValue.toString());
                                if (isSame(findValue, JSONObject.fromObject(s))) {
                                    logger.info("++++当前站的数据与环保局的数据不一样，需要更新+++++++++++++++");
                                    Method updateMethod = clazz.getMethod(update + nums[j], new Class<?>[] {
                                            Station.class });
                                    Object updateValue = updateMethod.invoke(stationService, new Object[] { s });
                                    logger.info("查询到station更新结果：{}", updateValue.toString());

                                    if ("true".equals(updateValue.toString())) {
                                        count++;
                                        station += "" + nums[j];
                                        station += ",";
                                    }
                                }
                            }
                        }

                    }
                    //一次轮训完成，就把数据删除
                    Boolean flag = stationService.delete(s.getId());
                    logger.info("删除数据结果：{}", flag);
                }
            }
            else {
                for (int i = 1; i <= STATION_NUM; i++) {
                    if (i == 15) {
                        continue;
                    }
                    String findByOne = "findByOne";
                    String update = "update";
                    Class<?> clazz = stationService.getClass();
                    Method findMethod = clazz.getMethod(findByOne + i, new Class<?>[] { String.class });
                    Object findValue = findMethod.invoke(stationService, new Object[] { s.getCVEHICLECODE() });
                    if (findValue != null) {
                        logger.info("查询到station的数据：{}", findValue.toString());
                        if (isSame(findValue, JSONObject.fromObject(s))) {
                            Method updateMethod = clazz.getMethod(update + i, new Class<?>[] { Station.class });
                            Object updateValue = updateMethod.invoke(stationService, new Object[] { s });
                            logger.info("查询到station更新结果：{}", updateValue.toString());

                            if ("true".equals(updateValue.toString())) {
                                Boolean flag = stationService.delete(s.getCVEHICLECODE());
                                logger.info("删除数据结果：{}", flag);
                                count++;
                                station += "" + i;
                                station += ",";
                            }
                        }
                    }

                }
                //一次轮训完成，就把数据删除
                Boolean flag = stationService.delete(s.getId());
                logger.info("删除数据结果：{}", flag);
            }

            logger.info("修改成功的个数：{}", count);
            logger.info("修改成功的站：{}", station);
        }
    }

    /**
     * 
     * <B>方法名称：判断是否修改库</B><BR>
     * <B>概要说明：</B><BR>
     *
     * @author：lihaiyi
     * @cretetime:2018年8月11日 上午11:15:17
     * @param one
     * @param json
     * @return Boolean
     */
    private Boolean isSame(Object one, JSONObject json) {
        JSONObject oneJson = JSONObject.fromObject(one);
        String sql = "UPDATE TVEHICLE SET  = ?,  = ?, = ?, = ? , = ?, = ? , = ? WHERE CVEHICLECODE = ?";
        if (!oneJson.getString("CVEHICLEKIND").equals(json.getString("CVEHICLEKIND")) || !oneJson.getString(
                "CNUMBERPLATE").equals(json.getString("CNUMBERPLATE")) || !oneJson.getString("CPLATETYPE").equals(json
                        .getString("CPLATETYPE")) || !oneJson.getString("CVIN").equals(json.getString("CVIN"))
                || !oneJson.getString("NODOMETER").equals(json.getString("NODOMETER")) || !oneJson.getString(
                        "CNEARUNITCODE").equals(json.getString("CNEARUNITCODE")) || !oneJson.getString("EXT_COL10")
                                .equals(json.getString("EXT_COL10"))) {
            return true;
        }
        else {
            return false;
        }
    }
}
