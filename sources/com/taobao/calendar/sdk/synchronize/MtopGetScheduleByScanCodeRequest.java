package com.taobao.calendar.sdk.synchronize;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopGetScheduleByScanCodeRequest implements IMTOPDataObject {
    private String code;
    private String API_NAME = "mtop.cal.remind.findQrcodeInfo";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        t2o.a(414187597);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getCode() {
        return this.code;
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

    public void setCode(String str) {
        this.code = str;
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
