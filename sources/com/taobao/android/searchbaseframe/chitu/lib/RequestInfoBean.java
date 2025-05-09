package com.taobao.android.searchbaseframe.chitu.lib;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RequestInfoBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String request;
    public String response;

    static {
        t2o.a(993001732);
    }

    public RequestInfoBean(String str, String str2) {
        this.request = str;
        this.response = str2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }
}
