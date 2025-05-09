package com.taobao.taobao.scancode.common.mtop.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PailitaoRecommendRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.relationrecommend.PailitaoRecommend.recommend";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private long appId = 0;
    private String params = null;

    static {
        t2o.a(760217646);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getParams() {
        return this.params;
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

    public void setAppId(long j) {
        this.appId = j;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
