package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.b;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HMSLog {

    /* renamed from: a  reason: collision with root package name */
    private static final b f5489a = new b();

    private static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + f7l.BRACKET_START_STR + packageInfo.versionCode + f7l.BRACKET_END_STR;
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        f5489a.a(3, str, str2);
    }

    public static void e(String str, String str2) {
        f5489a.a(6, str, str2);
    }

    public static void i(String str, String str2) {
        f5489a.a(4, str, str2);
    }

    public static void init(Context context, int i, String str) {
        b bVar = f5489a;
        bVar.a(context, i, str);
        bVar.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f5489a.a(6);
    }

    public static boolean isInfoEnable() {
        return f5489a.a(4);
    }

    public static boolean isWarnEnable() {
        return f5489a.a(5);
    }

    public static void w(String str, String str2) {
        f5489a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        f5489a.b(6, str, str2, th);
    }

    public static void e(String str, long j, String str2) {
        b bVar = f5489a;
        bVar.a(6, str, "[" + j + "] " + str2);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z) throws IllegalArgumentException {
        if (hMSExtLogger != null) {
            a aVar = new a(hMSExtLogger);
            if (z) {
                f5489a.a(aVar);
            } else {
                f5489a.a().a(aVar);
            }
        } else {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
    }

    public static void e(String str, long j, String str2, Throwable th) {
        b bVar = f5489a;
        bVar.b(6, str, "[" + j + "] " + str2, th);
    }
}
