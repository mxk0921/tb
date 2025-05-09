package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.taobao.weex.common.Constants;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.k68;
import tb.o78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f14970a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, m> f1299a = null;
    private static int b = -1;

    public static int a() {
        int i;
        if (f14970a == 0) {
            try {
            } catch (Throwable th) {
                b.a("get isMIUI failed", th);
                f14970a = 0;
            }
            if (TextUtils.isEmpty(m866a("ro.miui.ui.version.code")) && TextUtils.isEmpty(m866a("ro.miui.ui.version.name"))) {
                i = 2;
                f14970a = i;
                b.b("isMIUI's value is: " + f14970a);
            }
            i = 1;
            f14970a = i;
            b.b("isMIUI's value is: " + f14970a);
        }
        return f14970a;
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String c() {
        return m866a("ro.miui.ui.version.name");
    }

    public static String d() {
        return m866a("ro.build.characteristics");
    }

    public static String e() {
        return m866a("ro.product.manufacturer");
    }

    public static int a(Context context) {
        String a2 = m866a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(a2) || !TextUtils.isDigitsOnly(a2)) {
            return 0;
        }
        return Integer.parseInt(a2);
    }

    private static m b(String str) {
        m867a();
        return f1299a.get(str.toUpperCase());
    }

    /* renamed from: c  reason: collision with other method in class */
    public static boolean m873c() {
        if (b < 0) {
            b = !m875e() ? 1 : 0;
        }
        return b > 0;
    }

    /* renamed from: d  reason: collision with other method in class */
    public static boolean m874d() {
        return !m.China.name().equalsIgnoreCase(a(b()).name());
    }

    /* renamed from: e  reason: collision with other method in class */
    public static boolean m875e() {
        String str = "";
        try {
            str = q.a("ro.miui.ui.version.code", str);
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(str);
    }

    public static m a(String str) {
        m b2 = b(str);
        return b2 == null ? m.Global : b2;
    }

    public static String b() {
        String a2 = q.a("ro.miui.region", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = m871b(q.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a2)) {
            b.m410a("get region from system, region = " + a2);
        }
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String country = Locale.getDefault().getCountry();
        b.m410a("locale.default.country = " + country);
        return country;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m865a() {
        int a2 = r.a();
        return (!m868a() || a2 <= 0) ? "" : a2 < 2 ? "alpha" : a2 < 3 ? "development" : Constants.Name.STABLE;
    }

    /* renamed from: b  reason: collision with other method in class */
    private static String m871b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split = str.split("-");
        return split.length > 0 ? split[0] : str;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + a(intent.getExtras());
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m872b() {
        return a() == 2;
    }

    public static String a(Bundle bundle) {
        String a2;
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    a2 = Arrays.toString((int[]) obj);
                } else if (obj instanceof byte[]) {
                    a2 = Arrays.toString((byte[]) obj);
                } else if (obj instanceof boolean[]) {
                    a2 = Arrays.toString((boolean[]) obj);
                } else if (obj instanceof short[]) {
                    a2 = Arrays.toString((short[]) obj);
                } else if (obj instanceof long[]) {
                    a2 = Arrays.toString((long[]) obj);
                } else if (obj instanceof float[]) {
                    a2 = Arrays.toString((float[]) obj);
                } else if (obj instanceof double[]) {
                    a2 = Arrays.toString((double[]) obj);
                } else if (obj instanceof String[]) {
                    a2 = Arrays.toString((String[]) obj);
                } else if (obj instanceof CharSequence[]) {
                    a2 = Arrays.toString((CharSequence[]) obj);
                } else if (obj instanceof Parcelable[]) {
                    a2 = Arrays.toString((Parcelable[]) obj);
                } else if (obj instanceof Bundle) {
                    a2 = a((Bundle) obj);
                } else {
                    sb.append(obj);
                    z = false;
                }
                sb.append(a2);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m866a(String str) {
        try {
            try {
                return (String) bh.a("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                b.d("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m867a() {
        if (f1299a == null) {
            HashMap hashMap = new HashMap();
            f1299a = hashMap;
            hashMap.put(o78.CHINA_MAINLAND, m.China);
            Map<String, m> map = f1299a;
            m mVar = m.Europe;
            map.put("FI", mVar);
            f1299a.put("SE", mVar);
            f1299a.put("NO", mVar);
            f1299a.put("FO", mVar);
            f1299a.put("EE", mVar);
            f1299a.put("LV", mVar);
            f1299a.put("LT", mVar);
            f1299a.put("BY", mVar);
            f1299a.put("MD", mVar);
            f1299a.put("UA", mVar);
            f1299a.put(AmnetMonitorLoggerListener.LogModel.PORT_LOCAL, mVar);
            f1299a.put("CZ", mVar);
            f1299a.put("SK", mVar);
            f1299a.put("HU", mVar);
            f1299a.put("DE", mVar);
            f1299a.put("AT", mVar);
            f1299a.put("CH", mVar);
            f1299a.put("LI", mVar);
            f1299a.put("GB", mVar);
            f1299a.put("IE", mVar);
            f1299a.put("NL", mVar);
            f1299a.put("BE", mVar);
            f1299a.put("LU", mVar);
            f1299a.put("FR", mVar);
            f1299a.put("RO", mVar);
            f1299a.put("BG", mVar);
            f1299a.put("RS", mVar);
            f1299a.put("MK", mVar);
            f1299a.put("AL", mVar);
            f1299a.put("GR", mVar);
            f1299a.put("SI", mVar);
            f1299a.put("HR", mVar);
            f1299a.put("IT", mVar);
            f1299a.put("SM", mVar);
            f1299a.put("MT", mVar);
            f1299a.put("ES", mVar);
            f1299a.put("PT", mVar);
            f1299a.put("AD", mVar);
            f1299a.put("CY", mVar);
            f1299a.put("DK", mVar);
            f1299a.put(AmnetMonitorLoggerListener.LogModel.IP_SERVER, mVar);
            f1299a.put("UK", mVar);
            f1299a.put("EL", mVar);
            f1299a.put("RU", m.Russia);
            f1299a.put(k68.OP_IN, m.India);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m868a() {
        return a() == 1;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m869a(Context context) {
        return context != null && m870a(context.getPackageName());
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m870a(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }
}
