package com.taobao.themis.web.runtime;

import android.webkit.JavascriptInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebViewInitDataInterface implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject mInitData;

    static {
        t2o.a(850395186);
    }

    public WebViewInitDataInterface(JSONObject jSONObject) {
        this.mInitData = jSONObject;
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String getInitData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbad42a9", new Object[]{this});
        }
        try {
            return this.mInitData.toJSONString();
        } catch (Exception unused) {
            return "";
        }
    }
}
