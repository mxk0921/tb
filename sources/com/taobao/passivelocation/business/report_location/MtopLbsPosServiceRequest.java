package com.taobao.passivelocation.business.report_location;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopLbsPosServiceRequest implements IMTOPDataObject {
    private String locVersion;
    private String API_NAME = "mtop.taobao.lbs.posService";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String loc = null;

    static {
        t2o.a(789577833);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getLoc() {
        return this.loc;
    }

    public String getLocVersion() {
        return this.locVersion;
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

    public void setLoc(String str) {
        this.loc = str;
    }

    public void setLocVersion(String str) {
        this.locVersion = str;
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
}
