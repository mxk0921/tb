package com.taobao.live.home.business;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseListRequest implements IMTOPDataObject {
    private String API_NAME;
    private String VERSION;
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public long s = 0;
    public long n = 0;
    public boolean mNeedCache = true;

    static {
        t2o.a(806355353);
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

    public boolean needCache() {
        return this.mNeedCache;
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

    public String toString() {
        return "BaseListRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', NEED_ECODE=" + this.NEED_ECODE + ", NEED_SESSION=" + this.NEED_SESSION + ", s=" + this.s + ", n=" + this.n + '}';
    }
}
