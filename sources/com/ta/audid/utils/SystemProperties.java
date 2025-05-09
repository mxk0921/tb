package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SystemProperties {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787096);
    }

    @Deprecated
    public static String get(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            UtdidLogger.se("", e, new Object[0]);
            return "";
        }
    }

    @Deprecated
    public static String get(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            UtdidLogger.se("", e, new Object[0]);
            return str2;
        }
    }
}
