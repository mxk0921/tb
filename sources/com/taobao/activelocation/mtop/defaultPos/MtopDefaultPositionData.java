package com.taobao.activelocation.mtop.defaultPos;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopDefaultPositionData implements IMTOPDataObject {
    private String cityCode = null;
    private String cityLatitude = null;
    private String cityLongitude = null;
    private String cityName = null;
    private String msgCode = null;
    private String msgInfo = null;

    static {
        t2o.a(789577747);
        t2o.a(589299906);
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCityLatitude() {
        return this.cityLatitude;
    }

    public String getCityLongitude() {
        return this.cityLongitude;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public String getMsgInfo() {
        return this.msgInfo;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setCityLatitude(String str) {
        this.cityLatitude = str;
    }

    public void setCityLongitude(String str) {
        this.cityLongitude = str;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setMsgCode(String str) {
        this.msgCode = str;
    }

    public void setMsgInfo(String str) {
        this.msgInfo = str;
    }
}
