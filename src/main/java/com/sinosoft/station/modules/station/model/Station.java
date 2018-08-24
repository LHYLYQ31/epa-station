/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.modules.station.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月6日
 */
//@Entity
//@Table(name = "MOBILE_PDF")
public class Station implements Serializable {
    /** CVEHICLECODE，CVEHICLEKIND,CNUMBERPLATE,CPLATETYPE，CVIN，NODOMETER，CNEARUNITCODE，EXT_COL10，EXCHANGE */
    private static final long serialVersionUID = 7609300414148405265L;
    private String Id;
    private String CVEHICLECODE;
    private String CVEHICLEKIND;
    private String CNUMBERPLATE;
    private String CPLATETYPE;
    private String CVIN;

    //    private Timestamp DREGISTER;
    //    private String CUSER;
    //    private String CADDRESS;
    //    private String CPHONE;
    //    private String CVEHICLEICARDD;

    //    private String CENGINENO;
    private Long NODOMETER;
    //    private String NVEHICLEMODELID;
    //    private String CNAME;
    //    private String NSTANDARDID;
    //
    //    private String CVEHICLESTYLE;
    //    private Long NMAXWEIGHT;
    //    private Long NSTDWEIGHT;
    //    private String CDRIVEFORM;
    //    private String CGEARBOXTYPE;
    //
    //    private String CFUELTYPE;
    //    private String CSUPPLYMODE;
    //    private String BHASODB;
    //    private String BHASPURGE;
    //    private String BISDIANPEN;
    //
    //    private String COGRMODEL;
    //    private String CCARORTRUCK;
    //    private Long NSEATORTONNAGE;
    //    private String CPURGEMODEL1;
    //    private String CPURGEMODEL2;
    //
    //    private String COSENSORMODEL1;
    //    private String COSENSORMODEL2;
    //    private String CSPURTPUMP;
    //    private String CSPURTSET;
    //    private String CSUPERCHARGER;
    //
    //    private String CENGINEMODEL;
    //    private Long NORDAINREV;
    //    private Long NLETOUT;
    //    private Long NORDAINPOWER;
    //    private Long NCYLINDER;
    //
    //    private String CADMISSION;
    //    private Long NBIGPOWER24;
    //    private Long NSMALLPOWER24;
    //    private Long NBIGPOWER40;
    //    private Long NSMALLPOWER40;
    //
    //    private Long NPOWERSCANSCOPE;
    //    private String CPURPOSEID;
    //    private String BISREBUILD;
    //    private String BWORKCAR;
    //    private String BISSPECIALTIES;
    //
    //    private String BISSPECIALTIESSETTINGS;
    //    private String NSPECIALSIGNTYPEID;
    //    private String BISSTAYREPEAL;
    //    private String BISAVOIDCHECK;
    //    private String CREPEALYEAR;
    //
    //    private String NSUPREPEALYEAR;
    //    private Long NNOCHECKOUTTIMES;
    //    private String BISCHECKOUT;
    //    private String BISSENDSIGN;
    //    private Timestamp DSIGNDATE;
    //
    //    private String CVALIDDATE;
    //    private String CCHECKPERSONCODE;
    //    private String CUNITCODE;
    private String CNEARUNITCODE;
    //    private String CRFIDUNITCODE;
    //
    //    private String CSIMPLEMORE;
    //    private String CJGVEHICLEKIND;
    //    private String BJGWORKCAR;
    //    private Long NLIMITVALUEID;
    //    private String CPURPOSEID2;
    //
    //    private String CPURPOSEID3;
    //    private String CENGINEMADEFACTORY;
    //    private String CVEHICLEMADEFACTORY;
    //    private String CCHFACENO;
    //    private Long NWEIGHT;
    //
    //    private String NSPECIALCHECKPERIODID;
    //    private String ISSPECIALCARREASON;
    //    private String EXT_COL1;
    //    private String EXT_COL2;
    //    private String EXT_COL3;
    //
    //    private Long EXT_COL4;
    //    private String COUNTRY;
    //    private String ORIGINAL_SIGNCODE;
    //    private Timestamp DWQCHECKDATE;
    //    private String EXT_COL5;
    //
    //    private String EXT_COL6;
    //    private String EXT_COL7;
    //    private String EXT_COL8;
    //    private String EXT_COL9;
    private String EXT_COL10;
    //
    //    private String NSIGNTYPEFB;
    //    private Long PERIODCHECKS;
    //    private Long PERIODCHECKTIMES;
    //    private String ISORIGINALISCHECKOUT;
    //    private String TECHNOLOGYPSNCODE;
    //
    //    private String ISCHANGESIGN;
    //    private String SIGNSTATUS;
    //    private String VEHICLECLASSIFICATION;
    private Timestamp EXCHANGE;

    //    private Timestamp DMANUFACTUREDATE;
    //
    //    private String ZMFS;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCVEHICLECODE() {
        return CVEHICLECODE;
    }

    public String getCVEHICLEKIND() {
        return CVEHICLEKIND;
    }

    public String getCNUMBERPLATE() {
        return CNUMBERPLATE;
    }

    public String getCPLATETYPE() {
        return CPLATETYPE;
    }

    public String getCVIN() {
        return CVIN;
    }

    public Long getNODOMETER() {
        return NODOMETER;
    }

    public String getCNEARUNITCODE() {
        return CNEARUNITCODE;
    }

    public String getEXT_COL10() {
        return EXT_COL10;
    }

    public Timestamp getEXCHANGE() {
        return EXCHANGE;
    }

    public void setCVEHICLECODE(String cVEHICLECODE) {
        CVEHICLECODE = cVEHICLECODE;
    }

    public void setCVEHICLEKIND(String cVEHICLEKIND) {
        CVEHICLEKIND = cVEHICLEKIND;
    }

    public void setCNUMBERPLATE(String cNUMBERPLATE) {
        CNUMBERPLATE = cNUMBERPLATE;
    }

    public void setCPLATETYPE(String cPLATETYPE) {
        CPLATETYPE = cPLATETYPE;
    }

    public void setCVIN(String cVIN) {
        CVIN = cVIN;
    }

    public void setNODOMETER(Long nODOMETER) {
        NODOMETER = nODOMETER;
    }

    public void setCNEARUNITCODE(String cNEARUNITCODE) {
        CNEARUNITCODE = cNEARUNITCODE;
    }

    public void setEXT_COL10(String eXT_COL10) {
        EXT_COL10 = eXT_COL10;
    }

    public void setEXCHANGE(Timestamp eXCHANGE) {
        EXCHANGE = eXCHANGE;
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Station [CVEHICLECODE=" + CVEHICLECODE + ", CVEHICLEKIND=" + CVEHICLEKIND + ", CNUMBERPLATE="
                + CNUMBERPLATE + ", CPLATETYPE=" + CPLATETYPE + ", CVIN=" + CVIN + ", NODOMETER=" + NODOMETER
                + ", CNEARUNITCODE=" + CNEARUNITCODE + ", EXT_COL10=" + EXT_COL10 + ", EXCHANGE=" + EXCHANGE + "]";
    }

}
