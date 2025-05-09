package com.meizu.cloud.pushsdk.d;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.d.l.a;
import com.meizu.cloud.pushsdk.d.l.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static String f5781a;
    private static String b;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f5781a)) {
            return f5781a;
        }
        String c = c(context);
        f5781a = c;
        if (!TextUtils.isEmpty(c)) {
            return f5781a;
        }
        try {
            f5781a = (String) Class.forName("com.meizu.cloud.utils.AppDeviceUtils").getDeclaredMethod("getId", Context.class).invoke(null, context);
        } catch (Exception e) {
            DebugLogger.e("DeviceUtils", "getDeviceId error " + e.getMessage());
            f5781a = "";
        }
        if (f5781a == null) {
            f5781a = "";
        }
        return f5781a;
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        try {
            b = (String) Class.forName("com.meizu.cloud.utils.AppDeviceUtils").getDeclaredMethod("getFdId", Context.class).invoke(null, context);
        } catch (Exception e) {
            DebugLogger.e("DeviceUtils", "getFdId error " + e.getMessage());
            b = "";
        }
        if (b == null) {
            b = "";
        }
        return b;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:16:0x0052). Please submit an issue!!! */
    private static String c(Context context) {
        d a2;
        try {
            a2 = a.a("android.telephony.MzTelephonyManager").a("getDeviceId", new Class[0]).a(new Object[0]);
        } catch (Exception e) {
            DebugLogger.e("DeviceUtils", "getDeviceId error " + e.getMessage());
        }
        if (a2.f5794a && !TextUtils.isEmpty((CharSequence) a2.b)) {
            return (String) a2.b;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager);
        }
        return null;
    }
}
