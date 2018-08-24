/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.modules.station.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinosoft.station.common.utils.BeanToMapUtil;
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
@Repository
public class StationDaoImpl implements StationDao {
    private final static Logger logger = LoggerFactory.getLogger(StationDaoImpl.class);
    @Autowired

    private JdbcTemplate jdbcTemplate;

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.dao.StationDao#save(com.sinososft.inspectionstation.modules.station.model.Station)
     */
    @Override
    public Boolean save(Station s) {
        String sql = "INSERT INTO TVEHICLE (CVEHICLECODE, CVEHICLEKIND, CNUMBERPLATE, CPLATETYPE, CVIN";
        sql += " DREGISTER, CUSER, CADDRESS, CPHONE, CVEHICLEICARDD ";
        sql += "  CENGINENO, NODOMETER, NVEHICLEMODELID, CNAME, NSTANDARDID ";
        sql += "  CVEHICLESTYLE, NMAXWEIGHT, NSTDWEIGHT, CDRIVEFORM, CGEARBOXTYPE ";
        sql += "  CFUELTYPE, CSUPPLYMODE, BHASODB, BHASPURGE, BISDIANPEN ";

        sql += " COGRMODEL, CCARORTRUCK, NSEATORTONNAGE, CPURGEMODEL1, CPURGEMODEL2 ";
        sql += " COSENSORMODEL1, COSENSORMODEL2, CSPURTPUMP, CSPURTSET, CSUPERCHARGER ";
        sql += " CENGINEMODEL, NORDAINREV, NLETOUT, NORDAINPOWER, NCYLINDER ";
        sql += " CADMISSION, CPURPOSEID, BISREBUILD, BWORKCAR, BISSPECIALTIES ";
        sql += " BISSPECIALTIESSETT, NSPECIALSIGNTYPEID, BISSTAYREPEAL, BISAVOIDCHECK, CREPEALYEAR ";

        sql += " NSUPREPEALYEAR, NNOCHECKOUTTIMES, BISCHECKOUT, BISSENDSIGN, DSIGNDATE ";
        sql += " CVALIDDATE, CCHECKPERSONCODE, CUNITCODE, CNEARUNITCODE, CRFIDUNITCODE ";
        sql += " CSIMPLEMORE, NLIMITVALUEID, CENGINEMADEFACTORY, CVEHICLEMADEFACTOR, NWEIGHT ";
        sql += " NSPECIALCHECKPERIO, ISSPECIALCARREASON, EXT_COL1, EXT_COL2, EXT_COL3 ";
        sql += " EXT_COL4, COUNTRY, ORIGINAL_SIGNCODE, DWQCHECKDATE, EXT_COL5 ";

        sql += " EXT_COL6, EXT_COL7, EXT_COL8, EXT_COL9, EXT_COL10 ";
        sql += " NSIGNTYPEFB, PERIODCHECKS, PERIODCHECKTIMES, TECHNOLOGYPSNCODE, SIGNSTATUS ";
        sql += " ISBLACKLIST, ASSIGNUNIT, EXCHANGE, CPURPOSEID2, SLIDINGDEVICE ";
        sql += " CPLATECODE, BHASEGR, BHASPURGETYPE, CENGINEMANUF, MDATE ";
        sql += " DMANUFACTUREDATE, ZMFS) ";

        sql += " VALUES (?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";

        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";

        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";

        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ?, ?, ?, ? ";
        sql += " ,?, ? )";
        List<Object> list = new ArrayList<Object>();
        Map<String, Object> map = BeanToMapUtil.object2Map(s);
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
            // it.remove(); 删除元素
            list.add(entry.getValue());
        }
        Integer code = jdbcTemplate.update(sql, list.toArray());
        if (code == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * <B>方法名称：update</B><BR>
     * <B>概要说明：修改库中的字段</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.dao.StationDao#update(com.sinososft.inspectionstation.modules.station.model.Station)
     */
    @Override
    public Boolean update(Station s) {
        try {
            String sql = "UPDATE TVEHICLE SET CVEHICLEKIND = ?, CNUMBERPLATE = ?,CPLATETYPE = ?,CVIN = ? ,NODOMETER = ?,CNEARUNITCODE = ? ,EXT_COL10 = ? WHERE CVEHICLECODE = ?";
            Object[] objs = new Object[] { s.getCVEHICLEKIND(), s.getCNUMBERPLATE(), s
                    .getCPLATETYPE(), s.getCVIN(), s.getNODOMETER(), s.getCNEARUNITCODE(), s.getEXT_COL10(), s
                            .getCVEHICLECODE() };
            Integer code = jdbcTemplate.update(sql, objs);
            if (code == 1) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception e) {
            logger.error("更新数据失败++++++++++++++++++++" + e.getStackTrace()[0]);
        }
        return false;

    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinososft.inspectionstation.modules.station.dao.StationDao#findByOne(java.lang.String)
     */
    @Override
    public Station findByOne(String id) {
        try {
            String sql = "select * from TVEHICLE where CVEHICLECODE=?";
            List<Station> list = jdbcTemplate.query(sql, new String[] { id }, new BeanPropertyRowMapper(Station.class));
            if (list != null && list.size() >= 1) {
                return list.get(0);
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            logger.error("查询数据失败++++++++++++++++++++" + e.getStackTrace()[0]);
        }
        return null;

    }

    /**
     * <B>方法名称：findAllByTime</B><BR>
     * <B>概要说明：查询与当前时间间隔超过30分钟或配置文件中配置的时间</B><BR>
     * 
     * @throws IOException
     * 
     * @see com.sinosoft.station.modules.station.dao.StationDao#findAllByTime(java.lang.Long)
     */
    @Override
    public List<Station> findAllByTime(Long time) throws IOException {
        File file = new File("D:\\server\\station-time.txt");
        String station_time = "";
        if (file.exists()) {
            InputStream in = new FileInputStream(file);
            byte[] body = new byte[in.available()];
            if (body.length > 0) {
                in.read(body);
                station_time = new String(body);
            }
            in.close();
        }
        List<Station> list = new ArrayList<>();
        if (StringUtils.isBlank(station_time)) {
            station_time = "30";
        }
        Integer m_time = Integer.parseInt(station_time);
        Long param_time = time - m_time * 60 * 1000;
        Timestamp tt = new Timestamp(param_time);//5 * 60 * 1000
        String sql = "select * from TVEHICLE_TEMP where EXCHANGE  <  ?";
        list = jdbcTemplate.query(sql, new Timestamp[] { tt }, new BeanPropertyRowMapper(
                Station.class));
        return list;
    }

    /**
     * <B>方法名称：delete</B><BR>
     * <B>概要说明：删除同步完成的数据</B><BR>
     * 
     * @see com.sinosoft.station.modules.station.dao.StationDao#delete(java.lang.String)
     */
    @Override
    public Boolean delete(String id) {
        try {
            String sql = "delete  from TVEHICLE_TEMP where id = ? ";
            Integer code = jdbcTemplate.update(sql, new Object[] { id });
            if (code == 1) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

}
