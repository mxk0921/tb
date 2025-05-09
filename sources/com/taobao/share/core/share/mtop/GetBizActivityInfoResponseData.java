package com.taobao.share.core.share.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetBizActivityInfoResponseData implements IMTOPDataObject {
    public String bizcode;
    public boolean isChangeParams;
    public boolean showActivity;
    public String targetUrl;
    public String title;

    static {
        t2o.a(664797274);
        t2o.a(589299906);
    }

    public String getBizcode() {
        return this.bizcode;
    }

    public boolean getShowActivity() {
        return this.showActivity;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setBizcode(String str) {
        this.bizcode = str;
    }

    public void setShowActivity(boolean z) {
        this.showActivity = z;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
