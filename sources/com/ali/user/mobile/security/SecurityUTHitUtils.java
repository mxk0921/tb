package com.ali.user.mobile.security;

import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SecurityUTHitUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157602);
    }

    public static void utHit(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359e9699", new Object[]{str, str2, str3});
            return;
        }
        try {
            Properties properties = new Properties();
            properties.setProperty("errorCode", str + "");
            properties.setProperty("cause", str2 + "");
            UserTrackAdapter.sendUT(str3, properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
