package com.taobao.tao.channel.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.bwr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetNewBizConfigRequest implements IMTOPDataObject {
    public String bizCode;
    public String targetUrl;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String API_NAME = bwr.GETBIZCONFIG;

    static {
        t2o.a(666894381);
        t2o.a(589299906);
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }
}
