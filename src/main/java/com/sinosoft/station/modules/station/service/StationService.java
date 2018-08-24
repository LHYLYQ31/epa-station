/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.modules.station.service;

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
public interface StationService {
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

    /** 默认库 */
    Station findByOne(String id);

    /** 第一 **/
    Boolean update1(Station s);

    Station findByOne1(String id);

    /** 第二 **/

    Boolean update2(Station s);

    Station findByOne2(String id);

    /** 第三 **/

    Boolean update3(Station s);

    Station findByOne3(String id);

    /** 4 **/

    Boolean update4(Station s);

    Station findByOne4(String id);

    /** 第5 **/

    Boolean update5(Station s);

    Station findByOne5(String id);

    /** 第6 **/

    Boolean update6(Station s);

    Station findByOne6(String id);

    /** 第7 **/

    Boolean update7(Station s);

    Station findByOne7(String id);

    /** 第8 **/

    Boolean update8(Station s);

    Station findByOne8(String id);

    /** 第9 **/

    Boolean update9(Station s);

    Station findByOne9(String id);

    /** 第10 **/

    Boolean update10(Station s);

    Station findByOne10(String id);

    /** 第11 **/

    Boolean update11(Station s);

    Station findByOne11(String id);

    /** 第12 **/

    Boolean update12(Station s);

    Station findByOne12(String id);

    /** 第13 **/

    Boolean update13(Station s);

    Station findByOne13(String id);

    /** 第14 **/

    Boolean update14(Station s);

    Station findByOne14(String id);

    /** 第15 **/

    Boolean update15(Station s);

    Station findByOne15(String id);

    /** 第16 **/

    Boolean update16(Station s);

    Station findByOne16(String id);

    /** 第17 **/

    Boolean update17(Station s);

    Station findByOne17(String id);

    /** 第18 **/

    Boolean update18(Station s);

    Station findByOne18(String id);

    /** 第19 **/

    Boolean update19(Station s);

    Station findByOne19(String id);

    /** 第20 **/

    Boolean update20(Station s);

    Station findByOne20(String id);

    /** 第21 **/

    Boolean update21(Station s);

    Station findByOne21(String id);

    /** 第22 **/

    Boolean update22(Station s);

    Station findByOne22(String id);

    /** 第23 **/

    Boolean update23(Station s);

    Station findByOne23(String id);

}
