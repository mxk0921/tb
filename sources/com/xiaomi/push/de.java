package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.taobao.accs.utl.BaseMonitor;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class de {

    /* renamed from: a  reason: collision with root package name */
    private static int f14821a;

    private static int a(Context context) {
        if (f14821a <= 0) {
            f14821a = j.b(context);
        }
        return f14821a;
    }

    private static void b(Context context) {
        db.a("resetAfterUpload");
        m585a(context).edit().putString("host", null).putString("network_state", null).putString("reason", null).putString(BaseMonitor.COUNT_PING_INTERVAL, null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
        if (r3 >= 10) goto L_0x008a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void c(android.content.Context r10, long r11) {
        /*
            java.lang.Class<com.xiaomi.push.de> r0 = com.xiaomi.push.de.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = m585a(r10)     // Catch: all -> 0x003d
            java.lang.String r2 = "start_time_for_day"
            r3 = 0
            long r5 = r1.getLong(r2, r3)     // Catch: all -> 0x003d
            r2 = 0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x003f
            android.content.SharedPreferences$Editor r10 = r1.edit()     // Catch: all -> 0x003d
            java.lang.String r1 = "start_time_for_day"
            android.content.SharedPreferences$Editor r10 = r10.putLong(r1, r11)     // Catch: all -> 0x003d
            java.lang.String r11 = "last_discnt_time"
            android.content.SharedPreferences$Editor r10 = r10.putLong(r11, r3)     // Catch: all -> 0x003d
            java.lang.String r11 = "discnt_count_in_day"
            android.content.SharedPreferences$Editor r10 = r10.putInt(r11, r2)     // Catch: all -> 0x003d
            java.lang.String r11 = "discnt_count"
            android.content.SharedPreferences$Editor r10 = r10.putInt(r11, r2)     // Catch: all -> 0x003d
            java.lang.String r11 = "cnt_count"
            android.content.SharedPreferences$Editor r10 = r10.putInt(r11, r2)     // Catch: all -> 0x003d
            r10.apply()     // Catch: all -> 0x003d
            monitor-exit(r0)
            return
        L_0x003d:
            r10 = move-exception
            goto L_0x0095
        L_0x003f:
            java.lang.String r3 = "discnt_count"
            int r3 = r1.getInt(r3, r2)     // Catch: all -> 0x003d
            java.lang.String r4 = "cnt_count"
            int r4 = r1.getInt(r4, r2)     // Catch: all -> 0x003d
            if (r3 <= r4) goto L_0x006d
            int r4 = r4 + 1
            java.lang.String r7 = "connected_time"
            r8 = 0
            java.lang.String r7 = r1.getString(r7, r8)     // Catch: all -> 0x003d
            java.lang.String r7 = a(r7, r11)     // Catch: all -> 0x003d
            android.content.SharedPreferences$Editor r8 = r1.edit()     // Catch: all -> 0x003d
            java.lang.String r9 = "cnt_count"
            android.content.SharedPreferences$Editor r4 = r8.putInt(r9, r4)     // Catch: all -> 0x003d
            java.lang.String r8 = "connected_time"
            android.content.SharedPreferences$Editor r4 = r4.putString(r8, r7)     // Catch: all -> 0x003d
            r4.apply()     // Catch: all -> 0x003d
        L_0x006d:
            long r4 = r11 - r5
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x008e
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: all -> 0x003d
            java.lang.String r3 = "start_time_for_day"
            android.content.SharedPreferences$Editor r11 = r1.putLong(r3, r11)     // Catch: all -> 0x003d
            java.lang.String r12 = "discnt_count_in_day"
            android.content.SharedPreferences$Editor r11 = r11.putInt(r12, r2)     // Catch: all -> 0x003d
            r11.apply()     // Catch: all -> 0x003d
        L_0x008a:
            m587a(r10)     // Catch: all -> 0x003d
            goto L_0x0093
        L_0x008e:
            r11 = 10
            if (r3 < r11) goto L_0x0093
            goto L_0x008a
        L_0x0093:
            monitor-exit(r0)
            return
        L_0x0095:
            monitor-exit(r0)     // Catch: all -> 0x003d
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.de.c(android.content.Context, long):void");
    }

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        synchronized (de.class) {
            SharedPreferences a2 = m585a(context);
            long j3 = a2.getLong("start_time_for_day", 0L);
            if (j3 == 0) {
                db.a("recordDisconnection not initialized");
            } else if (j - a2.getLong("last_discnt_time", 0L) < 60000) {
                db.a("recordDisconnection anti-shake");
            } else {
                if (j - j3 < 86400000) {
                    int i4 = a2.getInt("discnt_count_in_day", 0);
                    if (i4 > 100) {
                        db.a("recordDisconnection count > 100 in 24H cycle,abandon.");
                        return;
                    } else {
                        a2.edit().putInt("discnt_count_in_day", i4 + 1).apply();
                    }
                } else {
                    db.a("recordDisconnection with the current time exceeds 24H cycle, go on.");
                }
                int i5 = a2.getInt("discnt_count", 0);
                if (i5 == a2.getInt("cnt_count", 0)) {
                    a(context, str, a(z), j, i, j2, i2, str2, i3);
                    a2.edit().putLong("last_discnt_time", j).putInt("discnt_count", i5 + 1).apply();
                }
                db.a("recordDisconnection complete");
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static SharedPreferences m585a(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    private static String a(String str, int i) {
        return a(str, String.valueOf(i));
    }

    private static String a(String str, long j) {
        return a(str, String.valueOf(j));
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = "null";
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + ";" + str2;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static List<dc> m586a(Context context) {
        String str;
        SharedPreferences a2 = m585a(context);
        String[] a3 = a(a2.getString("host", null));
        if (a3 == null || a3.length <= 0) {
            str = "DisconnectStatsSP Cached hosts data is empty,drop.";
        } else {
            String[] a4 = a(a2.getString("network_state", null));
            String[] a5 = a(a2.getString("reason", null));
            String[] a6 = a(a2.getString(BaseMonitor.COUNT_PING_INTERVAL, null));
            String[] a7 = a(a2.getString("network_type", null));
            String[] a8 = a(a2.getString("wifi_digest", null));
            String[] a9 = a(a2.getString("connected_network_type", null));
            String[] a10 = a(a2.getString("disconnect_time", null));
            String[] a11 = a(a2.getString("connected_time", null));
            String[] a12 = a(a2.getString("xmsf_vc", null));
            String[] a13 = a(a2.getString("android_vc", null));
            if (a4 == null || a5 == null || a6 == null || a7 == null || a8 == null || a9 == null || a10 == null || a11 == null || a12 == null || a13 == null || a3.length != a4.length || a3.length != a5.length || a3.length != a6.length || a3.length != a7.length || a3.length != a8.length || a3.length != a9.length || a3.length != a10.length || a3.length != a11.length || a3.length != a12.length || a3.length != a13.length) {
                str = "DisconnectStatsSP Cached data incorrect,drop.";
            } else {
                ArrayList arrayList = new ArrayList(a3.length);
                int i = 0;
                while (i < a3.length) {
                    dc dcVar = new dc();
                    dcVar.a(1);
                    dcVar.a(a3[i]);
                    dcVar.b(s.a(a4[i], -1));
                    dcVar.c(s.a(a5[i], -1));
                    dcVar.a(s.a(a6[i], -1L));
                    dcVar.d(s.a(a7[i], -1));
                    dcVar.b(a8[i]);
                    dcVar.e(s.a(a9[i], -1));
                    long a14 = s.a(a10[i], -1L);
                    long a15 = s.a(a11[i], -1L);
                    dcVar.b(a15 - a14);
                    dcVar.c(a14);
                    dcVar.d(a15);
                    dcVar.f(s.a(a12[i], -1));
                    dcVar.g(s.a(a13[i], -1));
                    arrayList.add(dcVar);
                    i++;
                    a4 = a4;
                    arrayList = arrayList;
                    a6 = a6;
                    a5 = a5;
                    a3 = a3;
                    a7 = a7;
                }
                return arrayList;
            }
        }
        b.m410a(str);
        return null;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m587a(Context context) {
        db.a("upload");
        new dd().a(context, m586a(context));
        b(context);
    }

    public static void a(Context context, long j) {
        ah.a(context).a(new dg(context, j));
    }

    private static void a(Context context, String str, int i, long j, int i2, long j2, int i3, String str2, int i4) {
        Locale locale = Locale.US;
        db.a("recordDisconnectInfo host=" + str + ", netState=" + i + ", currentTimeMillis=" + j + ", reason=" + i2 + ", pingInterval=" + j2 + ", netType=" + i3 + ", wifiDigest=" + str2 + ", connectedNetType=" + i4);
        SharedPreferences a2 = m585a(context);
        String string = a2.getString("host", null);
        String string2 = a2.getString("network_state", null);
        String string3 = a2.getString("reason", null);
        String string4 = a2.getString(BaseMonitor.COUNT_PING_INTERVAL, null);
        String string5 = a2.getString("network_type", null);
        String string6 = a2.getString("wifi_digest", null);
        String string7 = a2.getString("connected_network_type", null);
        String string8 = a2.getString("disconnect_time", null);
        String string9 = a2.getString("xmsf_vc", null);
        String string10 = a2.getString("android_vc", null);
        String a3 = a(string, str);
        String a4 = a(string2, i);
        String a5 = a(string3, i2);
        String a6 = a(string4, j2);
        String a7 = a(string5, i3);
        String a8 = a(string6, str2);
        String a9 = a(string7, i4);
        String a10 = a(string8, j);
        String a11 = a(string9, a(context));
        a2.edit().putString("host", a3).putString("network_state", a4).putString("reason", a5).putString(BaseMonitor.COUNT_PING_INTERVAL, a6).putString("network_type", a7).putString("wifi_digest", a8).putString("connected_network_type", a9).putString("disconnect_time", a10).putString("xmsf_vc", a11).putString("android_vc", a(string10, Build.VERSION.SDK_INT)).apply();
    }

    public static void a(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        ah.a(context).a(new df(context, str, z, j, i, j2, i2, str2, i3));
    }

    private static String[] a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(";");
    }
}
