/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.modules.station.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.station.common.datasource.TargetDataSource;
import com.sinosoft.station.modules.station.dao.StationDao;
import com.sinosoft.station.modules.station.model.Station;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月8日
 */
@Service
//@EnableAutoConfiguration //此注释自动载入应用程序所需的所有Bean
public class StationServiceImpl implements StationService {

    @Autowired
    StationDao stationDao;
    //    @Resource
    //    CarInfoProvider carInfoProvider;

    /**
     * <B>方法名称：修改</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.service.StationService#update1(com.sinososft.inspectionstation.modules.station.model.Station)
     */
    @Override
    @TargetDataSource(value = "ds1")
    public Boolean update1(Station st) {
        System.out.println("查询要修改的数据" + st.toString());
        return stationDao.update(st);
    }

    /**
     * <B>方法名称：根据ID查找数据</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.service.StationService#findByOne1(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds1")
    public Station findByOne1(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.service.StationService#update2(com.sinososft.inspectionstation.modules.station.model.Station)
     */
    @Override
    @TargetDataSource(value = "ds2")
    public Boolean update2(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.service.StationService#findByOne2(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds2")
    public Station findByOne2(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.service.StationService#update3(com.sinososft.inspectionstation.modules.station.model.Station)
     */
    @Override
    @TargetDataSource(value = "ds3")
    public Boolean update3(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.service.StationService#findByOne3(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds3")
    public Station findByOne3(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update4(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds4")
    public Boolean update4(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne4(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds4")
    public Station findByOne4(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update5(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds5")
    public Boolean update5(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne5(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds5")
    public Station findByOne5(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update6(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds6")
    public Boolean update6(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne6(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds6")
    public Station findByOne6(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update7(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds7")
    public Boolean update7(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne7(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds7")
    public Station findByOne7(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update8(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds8")
    public Boolean update8(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne8(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds8")
    public Station findByOne8(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update9(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds9")
    public Boolean update9(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne9(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds9")
    public Station findByOne9(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update10(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds10")
    public Boolean update10(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne10(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds10")
    public Station findByOne10(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update11(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds11")
    public Boolean update11(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne11(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds11")
    public Station findByOne11(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update12(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds12")
    public Boolean update12(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne12(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds12")
    public Station findByOne12(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update13(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds13")
    public Boolean update13(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne13(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds13")
    public Station findByOne13(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update14(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds14")
    public Boolean update14(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne14(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds14")
    public Station findByOne14(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update15(java.lang.String)
     */
    @Override
    public Boolean update15(Station s) {
        return true;
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne15(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds15")
    public Station findByOne15(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update16(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds16")
    public Boolean update16(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne16(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds16")
    public Station findByOne16(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update17(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds17")
    public Boolean update17(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne17(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds17")
    public Station findByOne17(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update18(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds18")
    public Boolean update18(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne18(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds18")
    public Station findByOne18(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update19(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds19")
    public Boolean update19(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne19(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds19")
    public Station findByOne19(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update20(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds20")
    public Boolean update20(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne20(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds20")
    public Station findByOne20(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update21(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds21")
    public Boolean update21(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne21(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds21")
    public Station findByOne21(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update22(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds22")
    public Boolean update22(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne22(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds22")
    public Station findByOne22(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#update23(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds23")
    public Boolean update23(Station s) {
        return stationDao.update(s);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne23(java.lang.String)
     */
    @Override
    @TargetDataSource(value = "ds23")
    public Station findByOne23(String id) {
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.inspectionstation.modules.station.service.StationService#findByOne(java.lang.String)
     */
    @Override
    public Station findByOne(String id) {
        // TODO Auto-generated method stub
        return stationDao.findByOne(id);
    }

    /**
     * <B>方法名称：findAllByTime</B><BR>
     * <B>概要说明：查询与当期时间间隔大于某个时间的数据</B><BR>
     * 
     * @see com.sinosoft.station.modules.station.service.StationService#findAllByTime(java.lang.Long)
     */
    @Override
    public List<Station> findAllByTime(Long time) throws IOException {
        return stationDao.findAllByTime(time);
    }

    /**
     * <B>方法名称：delete</B><BR>
     * <B>概要说明：删除同步完成的数据</B><BR>
     * 
     * @see com.sinosoft.station.modules.station.service.StationService#delete(java.lang.String)
     */
    @Override
    public Boolean delete(String id) {
        return stationDao.delete(id);
    }

}
