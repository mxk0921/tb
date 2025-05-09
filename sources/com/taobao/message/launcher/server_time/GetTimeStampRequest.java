package com.taobao.message.launcher.server_time;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GetTimeStampRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.common.getTimestamp";
    public boolean NEED_ECODE = false;
    private String VERSION = "*";
    private boolean NEED_SESSION = true;

    static {
        t2o.a(529531035);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
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
