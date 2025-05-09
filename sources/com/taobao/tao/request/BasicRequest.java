package com.taobao.tao.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BasicRequest implements IMTOPDataObject {
    protected String API_NAME;
    protected boolean NEED_ECODE;
    protected boolean NEED_SESSION;
    protected boolean ORIGINALJSON = true;
    protected String VERSION;
    protected String sid;

    static {
        t2o.a(764412110);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getSid() {
        return this.sid;
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

    public boolean isORIGINALJSON() {
        return this.ORIGINALJSON;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setORIGINALJSON(boolean z) {
        this.ORIGINALJSON = z;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
