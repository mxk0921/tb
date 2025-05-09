package com.ali.user.open.ucc.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ApplyTokenRequest implements Serializable {
    public String appName;
    public String appVersion;
    public String deviceTokenKey;
    public String deviceTokenSign;
    public String sdkVersion;
    public String sid;
    public int site;
    public long t;
    public boolean useDeviceToken = true;

    static {
        t2o.a(76546149);
    }
}
