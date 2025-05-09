package com.uc.webview.export;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebMessage {
    private String mData;
    private WebMessagePort[] mPorts;

    public WebMessage(String str) {
        this.mData = str;
    }

    public String getData() {
        return this.mData;
    }

    public WebMessagePort[] getPorts() {
        return this.mPorts;
    }

    public WebMessage(String str, WebMessagePort[] webMessagePortArr) {
        this.mData = str;
        this.mPorts = webMessagePortArr;
    }
}
