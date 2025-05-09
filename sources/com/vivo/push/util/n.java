package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.perf.Constants;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n {
    private static Method f;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f14669a = ag.b("ro.vivo.product.overseas", "no").equals(Constants.VAL_YES);
    public static final boolean b = b("rom_1.0");
    public static final boolean c = b("rom_2.0");
    public static final boolean d = b("rom_2.5");
    public static final boolean e = b("rom_3.0");
    private static String g = null;
    private static String h = null;

    public static String a(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    private static boolean b(String str) {
        String b2 = ag.b("ro.vivo.rom", "");
        String b3 = ag.b("ro.vivo.rom.version", "");
        u.d("Device", "ro.vivo.rom = " + b2 + " ; ro.vivo.rom.version = " + b3);
        if (b2 == null || !b2.contains(str)) {
            return b3 != null && b3.contains(str);
        }
        return true;
    }

    public static synchronized String a() {
        synchronized (n.class) {
            if (g == null && h == null) {
                try {
                    Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
                    f = declaredMethod;
                    declaredMethod.setAccessible(true);
                    g = (String) f.invoke(null, "ro.vivo.rom", "@><@");
                    h = (String) f.invoke(null, "ro.vivo.rom.version", "@><@");
                } catch (Exception unused) {
                    u.b("Device", "getRomCode error");
                }
            }
            u.d("Device", "sRomProperty1 : " + g + " ; sRomProperty2 : " + h);
            String a2 = a(g);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            String a3 = a(h);
            if (!TextUtils.isEmpty(a3)) {
                return a3;
            }
            return null;
        }
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            u.d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        u.d("Device", "Build.MANUFACTURER is " + str);
        return str.toLowerCase().contains("bbk") || str.toLowerCase().startsWith("vivo");
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(matcher.group(1));
        sb.append(TextUtils.isEmpty(matcher.group(2)) ? "0" : matcher.group(2).substring(0, 1));
        return sb.toString();
    }
}
