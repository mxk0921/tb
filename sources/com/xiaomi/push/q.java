package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q {
    public static String a(String str, String str2) {
        try {
            return (String) r.a(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            b.m410a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
