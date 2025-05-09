package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.taobao.weex.common.Constants;
import com.taobao.weex.utils.TBWXConfigManger;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gw;
import com.xiaomi.push.ih;
import com.xiaomi.push.j;
import com.xiaomi.push.m;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile p f15119a;

    /* renamed from: a  reason: collision with other field name */
    private long f1635a;

    /* renamed from: a  reason: collision with other field name */
    private final Context f1636a;

    /* renamed from: a  reason: collision with other field name */
    private final SharedPreferences f1637a;

    /* renamed from: b  reason: collision with other field name */
    private final boolean f1643b;

    /* renamed from: c  reason: collision with other field name */
    private final boolean f1644c;

    /* renamed from: a  reason: collision with other field name */
    private final AtomicInteger f1639a = new AtomicInteger(0);

    /* renamed from: a  reason: collision with other field name */
    private String f1638a = null;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f1640a = false;

    /* renamed from: b  reason: collision with other field name */
    private String f1641b = null;

    /* renamed from: b  reason: collision with other field name */
    private final AtomicInteger f1642b = new AtomicInteger(0);
    private final AtomicInteger c = new AtomicInteger(0);

    /* renamed from: a  reason: collision with other field name */
    private int f1634a = -1;
    private long b = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {
        public static String a() {
            return "support_wifi_digest";
        }

        public static String b() {
            return "record_support_wifi_digest_reported";
        }

        public static String c() {
            return "record_hb_count_start";
        }

        public static String d() {
            return "record_short_hb_count";
        }

        public static String e() {
            return "record_long_hb_count";
        }

        public static String f() {
            return "record_hb_change";
        }

        public static String g() {
            return "record_mobile_ptc";
        }

        public static String h() {
            return "record_wifi_ptc";
        }

        public static String i() {
            return "record_ptc_start";
        }

        public static String j() {
            return "keep_short_hb_effective_time";
        }

        public static String a(String str) {
            return "HB_" + str;
        }

        public static String b(String str) {
            return "HB_dead_time_" + str;
        }
    }

    private p(Context context) {
        this.f1636a = context;
        this.f1644c = j.m869a(context);
        this.f1643b = az.a(context).a(ih.IntelligentHeartbeatSwitchBoolean.a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f1637a = sharedPreferences;
        long currentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(a.c(), -1L) == -1) {
            sharedPreferences.edit().putLong(a.c(), currentTimeMillis).apply();
        }
        long j = sharedPreferences.getLong(a.i(), -1L);
        this.f1635a = j;
        if (j == -1) {
            this.f1635a = currentTimeMillis;
            sharedPreferences.edit().putLong(a.i(), currentTimeMillis).apply();
        }
    }

    private int a() {
        if (TextUtils.isEmpty(this.f1638a)) {
            return -1;
        }
        try {
            return this.f1637a.getInt(a.a(this.f1638a), -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private long c() {
        return this.f1637a.getLong(a.j(), -1L);
    }

    private long d() {
        return az.a(this.f1636a).a(ih.ShortHeartbeatEffectivePeriodMsLong.a(), 777600000L);
    }

    private void e() {
        if (!this.f1637a.getBoolean(a.a(), false)) {
            this.f1637a.edit().putBoolean(a.a(), true).apply();
        }
    }

    private void f() {
        int i = this.f1634a;
        String h = i != 0 ? i != 1 ? null : a.h() : a.g();
        if (!TextUtils.isEmpty(h)) {
            if (this.f1637a.getLong(a.i(), -1L) == -1) {
                this.f1635a = System.currentTimeMillis();
                this.f1637a.edit().putLong(a.i(), this.f1635a).apply();
            }
            this.f1637a.edit().putInt(h, this.f1637a.getInt(h, 0) + 1).apply();
        }
    }

    private void g() {
        int i;
        String[] split;
        String[] split2;
        if (m1075c()) {
            String string = this.f1637a.getString(a.f(), null);
            char c = 1;
            char c2 = 0;
            if (!TextUtils.isEmpty(string) && (split = string.split("###")) != null) {
                int i2 = 0;
                while (i2 < split.length) {
                    if (!TextUtils.isEmpty(split[i2]) && (split2 = split[i2].split(":::")) != null && split2.length >= 4) {
                        String str = split2[c2];
                        String str2 = split2[c];
                        String str3 = split2[2];
                        String str4 = split2[3];
                        HashMap hashMap = new HashMap();
                        hashMap.put("event", "change");
                        hashMap.put("model", Build.MODEL);
                        hashMap.put("net_type", str2);
                        hashMap.put("net_name", str);
                        hashMap.put(Constants.Name.INTERVAL, str3);
                        hashMap.put("timestamp", str4);
                        a("category_hb_change", null, hashMap);
                        b.m410a("[HB] report hb changed events.");
                    }
                    i2++;
                    c = 1;
                    c2 = 0;
                }
                this.f1637a.edit().remove(a.f()).apply();
            }
            if (this.f1637a.getBoolean(a.a(), false) && !this.f1637a.getBoolean(a.b(), false)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("event", TBWXConfigManger.WX_SUPPORT_KEY);
                hashMap2.put("model", Build.MODEL);
                hashMap2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                a("category_hb_change", null, hashMap2);
                b.m410a("[HB] report support wifi digest events.");
                this.f1637a.edit().putBoolean(a.b(), true).apply();
            }
            if (m1077e()) {
                int i3 = this.f1637a.getInt(a.d(), 0);
                int i4 = this.f1637a.getInt(a.e(), 0);
                if (i3 > 0 || i4 > 0) {
                    long j = this.f1637a.getLong(a.c(), -1L);
                    String valueOf = String.valueOf(235000);
                    String valueOf2 = String.valueOf(j);
                    String valueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.Name.INTERVAL, valueOf);
                        jSONObject.put("c_short", String.valueOf(i3));
                        jSONObject.put("c_long", String.valueOf(i4));
                        jSONObject.put("count", String.valueOf(i3 + i4));
                        jSONObject.put("start_time", valueOf2);
                        jSONObject.put(ExperimentDO.COLUMN_END_TIME, valueOf3);
                        String jSONObject2 = jSONObject.toString();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("event", "long_and_short_hb_count");
                        a("category_hb_count", jSONObject2, hashMap3);
                        b.m410a("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f1637a.edit().putInt(a.d(), 0).putInt(a.e(), 0).putLong(a.c(), System.currentTimeMillis()).apply();
            }
            if (m1078f()) {
                String valueOf4 = String.valueOf(this.f1635a);
                String valueOf5 = String.valueOf(System.currentTimeMillis());
                int i5 = this.f1637a.getInt(a.g(), 0);
                if (i5 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("net_type", "M");
                        jSONObject3.put("ptc", i5);
                        jSONObject3.put("start_time", valueOf4);
                        jSONObject3.put(ExperimentDO.COLUMN_END_TIME, valueOf5);
                        String jSONObject4 = jSONObject3.toString();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("event", "ptc_event");
                        a("category_lc_ptc", jSONObject4, hashMap4);
                        b.m410a("[HB] report ping timeout count events of mobile network.");
                        this.f1637a.edit().putInt(a.g(), 0).apply();
                    } catch (Throwable unused2) {
                        i = 0;
                        this.f1637a.edit().putInt(a.g(), 0).apply();
                    }
                }
                i = 0;
                int i6 = this.f1637a.getInt(a.h(), i);
                if (i6 > 0) {
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("net_type", "W");
                        jSONObject5.put("ptc", i6);
                        jSONObject5.put("start_time", valueOf4);
                        jSONObject5.put(ExperimentDO.COLUMN_END_TIME, valueOf5);
                        String jSONObject6 = jSONObject5.toString();
                        HashMap hashMap5 = new HashMap();
                        hashMap5.put("event", "ptc_event");
                        a("category_lc_ptc", jSONObject6, hashMap5);
                        b.m410a("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f1637a.edit().putInt(a.h(), 0).apply();
                }
                this.f1635a = System.currentTimeMillis();
                this.f1637a.edit().putLong(a.i(), this.f1635a).apply();
            }
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public long m1082b() {
        return this.b;
    }

    /* renamed from: e  reason: collision with other method in class */
    private boolean m1077e() {
        long j = this.f1637a.getLong(a.c(), -1L);
        if (j == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    /* renamed from: f  reason: collision with other method in class */
    private boolean m1078f() {
        if (this.f1635a == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f1635a;
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m1079a() {
        int a2;
        long b = gw.b();
        boolean z = true;
        if (this.f1644c && !b() && ((az.a(this.f1636a).a(ih.IntelligentHeartbeatSwitchBoolean.a(), true) || c() >= System.currentTimeMillis()) && (a2 = a()) != -1)) {
            b = a2;
        }
        if (!TextUtils.isEmpty(this.f1638a) && !"WIFI-ID-UNKNOWN".equals(this.f1638a) && this.f1634a == 1) {
            if (b >= 300000) {
                z = false;
            }
            a(z);
        }
        this.b = b;
        b.m410a("[HB] ping interval:" + b);
        return b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1083b() {
        if (m1076d()) {
            f();
            if (this.f1640a && !TextUtils.isEmpty(this.f1638a) && this.f1638a.equals(this.f1641b)) {
                this.f1639a.getAndIncrement();
                b.m410a("[HB] ping timeout count:" + this.f1639a);
                if (m1074a()) {
                    b.m410a("[HB] change hb interval for net:" + this.f1638a);
                    c(this.f1638a);
                    this.f1640a = false;
                    this.f1639a.getAndSet(0);
                    d(this.f1638a);
                }
            }
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m1084c() {
        if (m1076d()) {
            this.f1641b = this.f1638a;
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m1085d() {
        if (m1076d()) {
            g();
            if (this.f1640a) {
                this.f1639a.getAndSet(0);
            }
        }
    }

    public static p a(Context context) {
        if (f15119a == null) {
            synchronized (p.class) {
                try {
                    if (f15119a == null) {
                        f15119a = new p(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15119a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "WIFI-ID-UNKNOWN"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0016
            java.lang.String r10 = r9.f1638a
            if (r10 == 0) goto L_0x0015
            java.lang.String r0 = "W-"
            boolean r10 = r10.startsWith(r0)
            if (r10 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r10 = 0
        L_0x0016:
            r9.f1638a = r10
        L_0x0018:
            android.content.SharedPreferences r10 = r9.f1637a
            java.lang.String r0 = r9.f1638a
            java.lang.String r0 = com.xiaomi.push.service.p.a.a(r0)
            r1 = -1
            int r10 = r10.getInt(r0, r1)
            android.content.SharedPreferences r0 = r9.f1637a
            java.lang.String r2 = r9.f1638a
            java.lang.String r2 = com.xiaomi.push.service.p.a.b(r2)
            r3 = -1
            long r5 = r0.getLong(r2, r3)
            long r7 = java.lang.System.currentTimeMillis()
            if (r10 == r1) goto L_0x0075
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x0056
            android.content.SharedPreferences r10 = r9.f1637a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f1638a
            java.lang.String r0 = com.xiaomi.push.service.p.a.b(r0)
            long r2 = r9.d()
            long r7 = r7 + r2
            android.content.SharedPreferences$Editor r10 = r10.putLong(r0, r7)
        L_0x0052:
            r10.apply()
            goto L_0x0075
        L_0x0056:
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0075
            android.content.SharedPreferences r10 = r9.f1637a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f1638a
            java.lang.String r0 = com.xiaomi.push.service.p.a.a(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            java.lang.String r0 = r9.f1638a
            java.lang.String r0 = com.xiaomi.push.service.p.a.b(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            goto L_0x0052
        L_0x0075:
            java.util.concurrent.atomic.AtomicInteger r10 = r9.f1639a
            r0 = 0
            r10.getAndSet(r0)
            java.lang.String r10 = r9.f1638a
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x008e
            int r10 = r9.a()
            if (r10 == r1) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            r10 = 1
            r9.f1640a = r10
            goto L_0x0090
        L_0x008e:
            r9.f1640a = r0
        L_0x0090:
            java.lang.String r10 = r9.f1638a
            boolean r0 = r9.f1640a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[HB] network changed, netid:"
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = ", "
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            com.xiaomi.channel.commonutils.logger.b.m410a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.p.b(java.lang.String):void");
    }

    private void c(String str) {
        if (a(str)) {
            this.f1637a.edit().putInt(a.a(str), 235000).apply();
            this.f1637a.edit().putLong(a.b(this.f1638a), System.currentTimeMillis() + d()).apply();
        }
    }

    private void d(String str) {
        String str2;
        String str3;
        if (m1075c() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = "W";
            } else if (str.startsWith("M-")) {
                str2 = "M";
            } else {
                return;
            }
            String valueOf = String.valueOf(235000);
            String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":::");
            sb.append(str2);
            sb.append(":::");
            sb.append(valueOf);
            sb.append(":::");
            sb.append(valueOf2);
            String string = this.f1637a.getString(a.f(), null);
            if (TextUtils.isEmpty(string)) {
                str3 = sb.toString();
            } else {
                str3 = string + "###" + sb.toString();
            }
            this.f1637a.edit().putString(a.f(), str3).apply();
        }
    }

    private boolean b() {
        return !TextUtils.isEmpty(this.f1638a) && this.f1638a.startsWith("M-") && !az.a(this.f1636a).a(ih.IntelligentHeartbeatUseInMobileNetworkBoolean.a(), false);
    }

    /* renamed from: c  reason: collision with other method in class */
    private boolean m1075c() {
        return m1076d() && az.a(this.f1636a).a(ih.IntelligentHeartbeatDataCollectSwitchBoolean.a(), true) && m.China.name().equals(com.xiaomi.push.service.a.a(this.f1636a).a());
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m1076d() {
        boolean z = c() >= System.currentTimeMillis();
        if (this.f1644c) {
            return this.f1643b || z;
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1080a() {
    }

    public void a(int i) {
        this.f1637a.edit().putLong(a.j(), System.currentTimeMillis() + (i * 1000)).apply();
    }

    public synchronized void a(NetworkInfo networkInfo) {
        try {
            if (m1076d()) {
                String str = null;
                if (networkInfo == null) {
                    b(null);
                } else if (networkInfo.getType() == 0) {
                    String subtypeName = networkInfo.getSubtypeName();
                    if (!TextUtils.isEmpty(subtypeName) && !"UNKNOWN".equalsIgnoreCase(subtypeName)) {
                        str = "M-" + subtypeName;
                    }
                    b(str);
                    this.f1634a = 0;
                } else {
                    if (!(networkInfo.getType() == 1 || networkInfo.getType() == 6)) {
                        b(null);
                    }
                    b("WIFI-ID-UNKNOWN");
                    this.f1634a = 1;
                }
                this.f1634a = -1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1081a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                e();
            }
            if (m1076d() && !TextUtils.isEmpty(str)) {
                b("W-" + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r3 = this;
            com.xiaomi.push.ig r0 = new com.xiaomi.push.ig
            r0.<init>()
            r0.d(r4)
            java.lang.String r4 = "hb_name"
            r0.c(r4)
            java.lang.String r4 = "hb_channel"
            r0.a(r4)
            r1 = 1
            r0.a(r1)
            r0.b(r5)
            r4 = 0
            r0.a(r4)
            long r1 = java.lang.System.currentTimeMillis()
            r0.b(r1)
            android.content.Context r5 = r3.f1636a
            java.lang.String r5 = r5.getPackageName()
            r0.g(r5)
            java.lang.String r5 = "com.xiaomi.xmsf"
            r0.e(r5)
            if (r6 != 0) goto L_0x003a
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
        L_0x003a:
            android.content.Context r5 = r3.f1636a
            com.xiaomi.push.service.u r5 = com.xiaomi.push.service.v.m1097a(r5)
            if (r5 == 0) goto L_0x0058
            java.lang.String r1 = r5.f1658a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0058
            java.lang.String r5 = r5.f1658a
            java.lang.String r1 = "@"
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            if (r1 <= 0) goto L_0x0058
            r4 = r5[r4]
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            java.lang.String r5 = "uuid"
            r6.put(r5, r4)
            java.lang.String r4 = "model"
            java.lang.String r5 = android.os.Build.MODEL
            r6.put(r4, r5)
            android.content.Context r4 = r3.f1636a
            java.lang.String r5 = r4.getPackageName()
            int r4 = com.xiaomi.push.g.a(r4, r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "avc"
            r6.put(r5, r4)
            r4 = 50300(0xc47c, float:7.0485E-41)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "pvc"
            r6.put(r5, r4)
            r4 = 48
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "cvc"
            r6.put(r5, r4)
            r0.a(r6)
            android.content.Context r4 = r3.f1636a
            com.xiaomi.push.ia r4 = com.xiaomi.push.ia.a(r4)
            if (r4 == 0) goto L_0x00a6
            android.content.Context r5 = r3.f1636a
            java.lang.String r5 = r5.getPackageName()
            r4.a(r0, r5)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.p.a(java.lang.String, java.lang.String, java.util.Map):void");
    }

    private void a(boolean z) {
        if (m1075c()) {
            int incrementAndGet = (z ? this.f1642b : this.c).incrementAndGet();
            String str = "long";
            String str2 = z ? "short" : str;
            b.b("[HB] " + str2 + " ping interval count: " + incrementAndGet);
            if (incrementAndGet >= 5) {
                String d = z ? a.d() : a.e();
                int i = this.f1637a.getInt(d, 0) + incrementAndGet;
                this.f1637a.edit().putInt(d, i).apply();
                if (z) {
                    str = "short";
                }
                b.m410a("[HB] accumulate " + str + " hb count(" + i + ") and write to file. ");
                (z ? this.f1642b : this.c).set(0);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m1074a() {
        return this.f1639a.get() >= Math.max(az.a(this.f1636a).a(ih.IntelligentHeartbeatNATCountInt.a(), 5), 3);
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }
}
