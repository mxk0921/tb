package com.taobao.themis.kernel.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class RequestParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String accountSite;
    public String api;
    private final String appId;
    public Map<String, String> headers;
    public String method = "GET";
    public boolean needLogin;
    public String oriUrl;
    public String traceId;
    public String version;

    static {
        t2o.a(839909853);
    }

    public RequestParams(String str) {
        this.appId = str;
    }

    public final String getAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        return this.appId;
    }

    public abstract Map<String, Object> toMap();
}
