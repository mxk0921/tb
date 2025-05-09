package com.ali.user.mobile.rpc.login.model;

import com.ali.user.mobile.info.AppInfo;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MemberRequestBase implements Serializable {
    public String appName;
    public String appVersion = AppInfo.getInstance().getAndroidAppVersion();
    public String deviceId;
    public Map<String, String> ext;
    public String locale;
    public String sdkVersion;
    public int site;
    public String ttid;
    public String utdid;

    static {
        t2o.a(68157582);
    }
}
