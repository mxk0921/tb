package com.alipay.mobile.verifyidentity.utils;

import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BuildConfigUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_RPC_TYPE = "RPC_TYPE";
    public static final String K_RPC_TYPE_DEF = "RPC_TYPE_DEF";
    public static final String K_RPC_TYPE_TB = "RPC_TYPE_TB";

    /* renamed from: a  reason: collision with root package name */
    public static Class f4474a;

    public static String getString(String str, String str2, String str3) {
        try {
            if (f4474a == null) {
                ClassLoader classLoader = BuildConfigUtils.class.getClassLoader();
                f4474a = classLoader.loadClass(str + ".BuildConfig");
            }
        } catch (Throwable unused) {
        }
        Class cls = f4474a;
        if (cls == null) {
            return str3;
        }
        try {
            return (String) cls.getField(str2).get(null);
        } catch (Throwable unused2) {
            return str3;
        }
    }

    public static String getString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str}) : getString(BuildConfig.APPLICATION_ID, str, "");
    }
}
