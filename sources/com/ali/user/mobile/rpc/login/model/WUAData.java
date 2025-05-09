package com.ali.user.mobile.rpc.login.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WUAData implements Serializable {
    public String appKey;
    public String t;
    public String wua;

    static {
        t2o.a(68157592);
    }

    public WUAData(String str, String str2, String str3) {
        this.appKey = str;
        this.t = str2;
        this.wua = str3;
    }

    public WUAData() {
    }
}
