package com.taobao.android.sso.v2.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ApplySsoTokenRequest implements Serializable {
    public String appVersion;
    public String deviceTokenKey;
    public String deviceTokenSign;
    public String hid;
    public String masterAppKey;
    public long masterT;
    public String sdkVersion;
    public String sid;
    public String sign;
    public String slaveAppKey;
    public String slaveBundleId;
    public long slaveT;
    public String ssoVersion;
    public String targetUrl;
    public String uuidKey;

    static {
        t2o.a(69206260);
    }
}
