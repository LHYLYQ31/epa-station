/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.modules.station.dao;

import java.io.IOException;
import java.util.List;

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
public interface StationDao {

    Boolean save(Station s);

    /**
     * 
     * <B>方法名称：更新数据</B><BR>
     * <B>概要说明：</B><BR>
     *
     * @author：lihaiyi
     * @cretetime:2018年8月14日 上午8:57:19
     * @param s
     * @return Boolean
     */
    Boolean update(Station s);

    /**
     * 
     * <B>方法名称：findByOne</B><BR>
     * <B>概要说明：根据id查询数据</B><BR>
     *
     * @author：lihaiyi
     * @cretetime:2018年8月14日 上午8:56:52
     * @param id
     * @return Station
     */
    Station findByOne(String id);

    /**
     * 
     * <B>方法名称：findAllByTime</B><BR>
     * <B>概要说明：查询当前时间的前3分钟数据</B><BR>
     *
     * @author：lihaiyi
     * @cretetime:2018年8月14日 上午8:56:08
     * @param time
     * @return List<Station>
     */
    List<Station> findAllByTime(Long time) throws IOException;

    /**
     * 
     * <B>方法名称：删除同步完成的数据</B><BR>
     * <B>概要说明：</B><BR>
     *
     * @author：lihaiyi
     * @cretetime:2018年8月21日 上午9:47:04
     * @param id 数据主键
     * @return Boolean
     */
    Boolean delete(String id);
}
