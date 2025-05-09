package com.taobao.client.isv.config.manager.person;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopLbsConfigRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.lbsConfig.getSdkConfig";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String cellType = null;
    private short mcc = 0;
    private short mnc = 0;
    private double longitude = vu3.b.GEO_NOT_SUPPORT;
    private String cellInfo = null;
    private double latitude = vu3.b.GEO_NOT_SUPPORT;
    private String wifiInfos = null;

    static {
        t2o.a(789577777);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getCellInfo() {
        return this.cellInfo;
    }

    public String getCellType() {
        return this.cellType;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public short getMcc() {
        return this.mcc;
    }

    public short getMnc() {
        return this.mnc;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public String getWifiInfos() {
        return this.wifiInfos;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setCellInfo(String str) {
        this.cellInfo = str;
    }

    public void setCellType(String str) {
        this.cellType = str;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setMcc(short s) {
        this.mcc = s;
    }

    public void setMnc(short s) {
        this.mnc = s;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public void setWifiInfos(String str) {
        this.wifiInfos = str;
    }
}
