package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static int f14736a = -1;

    public static ag a(Context context) {
        return m479a(context) ? ag.HUAWEI : c(context) ? ag.OPPO : d(context) ? ag.VIVO : ag.OTHER;
    }

    public static boolean b(Context context) {
        boolean z;
        int i;
        Object a2 = bh.a(bh.a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a3 = bh.a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a3 == null || !(a3 instanceof Integer)) {
            b.c("google service is not avaliable");
            f14736a = 0;
            return false;
        }
        int intValue = ((Integer) Integer.class.cast(a3)).intValue();
        if (a2 != null) {
            if (a2 instanceof Integer) {
                if (((Integer) Integer.class.cast(a2)).intValue() == intValue) {
                    i = 1;
                } else {
                    i = 0;
                }
                f14736a = i;
            } else {
                f14736a = 0;
                b.c("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder("is google service can be used");
        if (f14736a > 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        b.c(sb.toString());
        if (f14736a > 0) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        boolean z = false;
        Object a2 = bh.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a2)).booleanValue();
        }
        b.c("color os push  is avaliable ? :" + z);
        return z;
    }

    public static boolean d(Context context) {
        boolean z = false;
        Object a2 = bh.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a2)).booleanValue();
        }
        b.c("fun touch os push  is avaliable ? :" + z);
        return z;
    }

    private static boolean a() {
        try {
            String str = (String) bh.a("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            if (!TextUtils.isEmpty(str)) {
                if (Integer.parseInt(str) >= 9) {
                    return true;
                }
            }
        } catch (Exception e) {
            b.a(e);
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m479a(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null) {
                if (a()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
