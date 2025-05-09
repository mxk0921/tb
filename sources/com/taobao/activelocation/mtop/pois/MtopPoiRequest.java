package com.taobao.activelocation.mtop.pois;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopPoiRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.regeo.getDetailPois";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String keywords = null;
    private long radius = 0;
    private double longitude = vu3.b.GEO_NOT_SUPPORT;
    private double latitude = vu3.b.GEO_NOT_SUPPORT;
    private String types = null;

    static {
        t2o.a(789577750);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public long getRadius() {
        return this.radius;
    }

    public String getTypes() {
        return this.types;
    }

    public String getVERSION() {
        return this.VERSION;
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

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setRadius(long j) {
        this.radius = j;
    }

    public void setTypes(String str) {
        this.types = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
