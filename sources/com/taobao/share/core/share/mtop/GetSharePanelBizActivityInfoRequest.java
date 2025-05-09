package com.taobao.share.core.share.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetSharePanelBizActivityInfoRequest implements IMTOPDataObject {
    public String bizCode;
    public String bizParams;
    public String targetUrl;
    public String title;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String API_NAME = "mtop.taobao.sharepassword.getSharePanelBizActivityInfo";

    static {
        t2o.a(664797275);
        t2o.a(589299906);
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public String getBizParams() {
        return this.bizParams;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public void setBizParams(String str) {
        this.bizParams = str;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
