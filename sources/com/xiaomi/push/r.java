package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.m;
import com.huawei.hms.android.SystemUtils;
import com.taobao.weex.utils.tools.TimeCalculator;
import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static Context f15006a;

    /* renamed from: a  reason: collision with other field name */
    private static String f1487a;

    public static int a() {
        try {
            Class<?> a2 = a(null, "miui.os.Build");
            if (a2.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return a2.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String b() {
        String a2 = q.a(m.v, "");
        f1487a = a2;
        return a2;
    }

    private static String c() {
        String a2 = q.a(m.y, "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("ColorOS_")) {
            f1487a = "ColorOS_".concat(a2);
        }
        return f1487a;
    }

    private static String d() {
        String a2 = q.a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("FuntouchOS_")) {
            f1487a = "FuntouchOS_".concat(a2);
        }
        return f1487a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Context m963a() {
        return f15006a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m967b() {
        try {
            return a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            b.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            b.a(e);
            return false;
        }
    }

    public static Class<?> a(Context context, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z = context != null;
        if (z && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            b.m410a("loadClass fail hasContext= " + z + ", errMsg = " + localizedMessage);
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized String m964a() {
        synchronized (r.class) {
            try {
                String str = f1487a;
                if (str != null) {
                    return str;
                }
                String str2 = Build.VERSION.INCREMENTAL;
                if (a() <= 0) {
                    str2 = b();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = c();
                        if (TextUtils.isEmpty(str2)) {
                            str2 = d();
                            if (TextUtils.isEmpty(str2)) {
                                str2 = String.valueOf(q.a(SystemUtils.PRODUCT_BRAND, TimeCalculator.PLATFORM_ANDROID) + "_" + str2);
                            }
                        }
                    }
                }
                f1487a = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context) {
        f15006a = context.getApplicationContext();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m965a() {
        return TextUtils.equals((String) bh.a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m966a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            b.a(e);
            return false;
        }
    }
}
