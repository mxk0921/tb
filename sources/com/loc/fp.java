package com.loc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fp {
    protected static String I;
    protected static String K;

    /* renamed from: a  reason: collision with root package name */
    public String f5706a = "1";
    protected short b = 0;
    protected String c = null;
    protected String d = null;
    protected String e = null;
    protected String f = null;
    protected String g = null;
    public String h = null;
    public String i = null;
    protected String j = null;
    protected String k = null;
    protected String l = null;
    protected String m = null;
    protected String n = null;
    protected String o = null;
    protected String p = null;
    protected String q = null;
    protected String r = null;
    protected String s = null;
    protected String t = null;
    protected String u = null;
    protected String v = null;
    protected String w = null;
    protected String x = null;
    protected String y = null;
    protected int z = 0;
    protected ArrayList<fa> A = new ArrayList<>();
    protected ArrayList<fa> B = new ArrayList<>();
    protected String C = null;
    protected String D = null;
    protected ArrayList<eg> E = new ArrayList<>();
    protected String F = null;
    protected String G = null;
    protected byte[] H = null;
    private byte[] Q = null;
    private int R = 0;
    protected String J = null;
    protected String L = null;
    protected String M = null;
    protected String N = null;
    protected int O = 0;
    private List<fc> S = null;
    private List<fa> T = Collections.synchronizedList(new ArrayList());
    final int P = 3;

    private static int a(String str, byte[] bArr, int i) {
        try {
        } catch (Throwable th) {
            fr.a(th, "Req", "copyContentWithByteLen");
            bArr[i] = 0;
        }
        if (TextUtils.isEmpty(str)) {
            bArr[i] = 0;
            return i + 1;
        }
        byte[] bytes = str.getBytes(Constants.DEFAULT_CHARSET);
        int length = bytes.length;
        if (length > 127) {
            length = 127;
        }
        bArr[i] = (byte) length;
        int i2 = i + 1;
        System.arraycopy(bytes, 0, bArr, i2, length);
        return i2 + length;
    }

    private void b() {
        String[] strArr = new String[27];
        strArr[0] = this.f5706a;
        strArr[1] = this.c;
        strArr[2] = this.d;
        strArr[3] = this.e;
        strArr[4] = this.f;
        strArr[5] = this.g;
        strArr[6] = this.h;
        strArr[7] = this.i;
        strArr[8] = this.l;
        strArr[9] = this.m;
        strArr[10] = this.n;
        strArr[11] = this.o;
        strArr[12] = this.p;
        strArr[13] = this.q;
        strArr[14] = this.r;
        strArr[15] = this.s;
        strArr[16] = this.t;
        strArr[17] = this.u;
        strArr[18] = this.v;
        strArr[19] = this.w;
        strArr[20] = this.x;
        strArr[21] = this.D;
        strArr[22] = this.F;
        strArr[23] = this.G;
        strArr[24] = I;
        strArr[25] = this.M;
        strArr[26] = this.N;
        for (int i = 0; i < 27; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                strArr[i] = "";
            }
        }
        if (TextUtils.isEmpty(this.j) || (!"0".equals(this.j) && !"2".equals(this.j))) {
            this.j = "0";
        }
        if (TextUtils.isEmpty(this.k) || (!"0".equals(this.k) && !"1".equals(this.k))) {
            this.k = "0";
        }
        if (TextUtils.isEmpty(this.y) || (!"1".equals(this.y) && !"2".equals(this.y))) {
            this.y = "0";
        }
        if (!fb.a(this.z)) {
            this.z = 0;
        }
        if (this.H == null) {
            this.H = new byte[0];
        }
    }

    public final void a(Context context, boolean z, boolean z2, fb fbVar, ff ffVar, ConnectivityManager connectivityManager, String str, fd fdVar) {
        String str2;
        String str3;
        StringBuilder sb;
        NetworkInfo networkInfo;
        String str4;
        String str5;
        ArrayList<eg> arrayList;
        int i;
        String f = l.f(context);
        int d = fy.d();
        this.J = str;
        this.S = null;
        if (!z2) {
            str2 = "UC_nlp_20131029";
            str3 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        } else {
            str2 = "api_serverSDK_130905";
            str3 = "S128DF1572465B890OE3F7A13167KLEI";
        }
        StringBuilder sb2 = new StringBuilder();
        int g = fbVar.g();
        int h = fbVar.h();
        TelephonyManager i2 = fbVar.i();
        ArrayList<fa> c = fbVar.c();
        ArrayList<fa> d2 = fbVar.d();
        ArrayList<eg> e = ffVar.e();
        String str6 = h == 2 ? "1" : "0";
        if (i2 != null) {
            if (TextUtils.isEmpty(fr.g)) {
                try {
                    fr.g = o.k();
                } catch (Throwable th) {
                    str4 = "1";
                    fr.a(th, "Aps", "getApsReq part4");
                }
            }
            str4 = "1";
            sb = sb2;
            if (TextUtils.isEmpty(fr.g) && Build.VERSION.SDK_INT < 29) {
                fr.g = "888888888888888";
            }
            if (TextUtils.isEmpty(fr.h)) {
                try {
                    fr.h = o.n();
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    fr.a(th2, "Aps", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(fr.h) && Build.VERSION.SDK_INT < 29) {
                fr.h = "888888888888888";
            }
        } else {
            sb = sb2;
            str4 = "1";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th3) {
            fr.a(th3, "Aps", "getApsReq part");
            networkInfo = null;
        }
        boolean a2 = ffVar.a(connectivityManager);
        if (fy.a(networkInfo) != -1) {
            str5 = fy.a(context, i2);
            if (a2) {
                str4 = "2";
            }
        } else {
            str5 = "";
            str4 = str5;
        }
        if ((g & 4) != 4 || d2.isEmpty()) {
            this.B.clear();
        } else {
            this.B.clear();
            this.B.addAll(d2);
        }
        this.A.clear();
        this.A.addAll(c);
        StringBuilder sb3 = new StringBuilder();
        if (ffVar.k()) {
            if (a2) {
                WifiInfo m = ffVar.m();
                if (ff.a(m)) {
                    sb3.append(m.getBSSID());
                    sb3.append(",");
                    int rssi = m.getRssi();
                    if (rssi < -128 || rssi > 127) {
                        rssi = 0;
                    }
                    sb3.append(rssi);
                    sb3.append(",");
                    String ssid = m.getSSID();
                    try {
                        i = m.getSSID().getBytes("UTF-8").length;
                    } catch (Exception unused2) {
                        i = 32;
                    }
                    if (i >= 32) {
                        ssid = "unkwn";
                    }
                    sb3.append(ssid.replace("*", "."));
                }
            }
            if (!(e == null || (arrayList = this.E) == null)) {
                arrayList.clear();
                this.E.addAll(e);
            }
        } else {
            ffVar.g();
            ArrayList<eg> arrayList2 = this.E;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        this.b = (short) 0;
        if (!z) {
            this.b = (short) 2;
        }
        this.c = str2;
        this.d = str3;
        this.f = Build.MODEL;
        this.g = "android" + Build.VERSION.RELEASE;
        this.h = fy.b(context);
        this.i = str6;
        this.j = "0";
        this.k = "0";
        this.l = "0";
        this.m = "0";
        this.n = "0";
        this.o = f;
        this.p = fr.g;
        this.q = fr.h;
        this.s = String.valueOf(d);
        this.t = fy.i(context);
        this.v = "6.2.0";
        this.w = null;
        this.u = "";
        this.x = str5;
        this.y = str4;
        this.z = g;
        this.C = fbVar.l();
        this.F = ff.p();
        this.D = sb3.toString();
        this.O = (int) ((fy.b() - ffVar.q()) / 1000);
        try {
            if (TextUtils.isEmpty(I)) {
                I = o.f(context);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (TextUtils.isEmpty(K)) {
                K = o.a(context);
            }
        } catch (Throwable unused4) {
        }
        try {
            if (TextUtils.isEmpty(this.M)) {
                this.M = o.f();
            }
        } catch (Throwable unused5) {
        }
        try {
            if (TextUtils.isEmpty(this.N)) {
                this.N = o.e(context);
            }
        } catch (Throwable unused6) {
        }
        try {
            this.S = fdVar.a(this.B, this.E);
            a(this.A, this.B);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        sb.delete(0, sb.length());
        sb3.delete(0, sb3.length());
    }

    private static void a(fa faVar, List<fa> list) {
        if (faVar != null && list != null) {
            int size = list.size();
            if (size == 0) {
                list.add(faVar);
                return;
            }
            int i = -1;
            long j = Long.MAX_VALUE;
            int i2 = 0;
            int i3 = -1;
            while (true) {
                if (i2 >= size) {
                    i = i3;
                    break;
                }
                fa faVar2 = list.get(i2);
                if (faVar.c() == null || !faVar.c().equals(faVar2.c())) {
                    j = Math.min(j, faVar2.t);
                    if (j == faVar2.t) {
                        i3 = i2;
                    }
                    i2++;
                } else {
                    int i4 = faVar.s;
                    if (i4 != faVar2.s) {
                        faVar2.t = faVar.t;
                        faVar2.s = i4;
                    }
                }
            }
            if (i < 0) {
                return;
            }
            if (size < 3) {
                list.add(faVar);
            } else if (faVar.t > j && i < size) {
                list.remove(i);
                list.add(faVar);
            }
        }
    }

    private void a(ArrayList<fa> arrayList, ArrayList<fa> arrayList2) {
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<fa> it = arrayList2.iterator();
            while (it.hasNext()) {
                fa next = it.next();
                if (next.r && next.n) {
                    a(next, this.T);
                    return;
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            a(arrayList.get(0), this.T);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(49:14|15|21|(17:24|(1:26)(1:27)|28|(7:30|(1:32)(1:33)|34|(1:36)(1:37)|38|(1:40)(1:41)|42)(12:(11:45|(1:47)(1:48)|49|(1:51)(1:52)|53|(1:55)(1:56)|57|(1:59)(1:60)|61|(1:63)(1:64)|65)|66|(1:68)(1:69)|(1:71)|73|(1:75)(1:76)|77|(1:79)|80|(1:82)(1:83)|84|(2:86|(2:88|89)(3:90|(11:92|(1:94)(1:95)|96|(1:98)(1:99)|100|(1:102)(1:104)|103|(1:106)|108|(9:110|(1:112)(1:114)|113|115|(1:117)|118|(1:120)(1:121)|122|393)(2:123|392)|124)|391))(1:(2:126|89)(1:127)))|43|66|(0)(0)|(0)|71|73|(0)(0)|77|(0)|80|(0)(0)|84|(0)(0))|128|(43:377|132|133|135|(1:197)(4:138|(12:140|(4:145|158|(1:160)|161)(1:(3:147|(1:149)|150)(6:152|(3:154|(1:156)|157)|162|(1:164)|167|(4:185|(5:187|(1:189)|(1:191)|192|(2:194|183))|184|195)(4:173|(5:177|(1:179)|(1:181)|182|183)|184|195)))|151|162|(1:165)|164|167|(1:169)|185|(0)|184|195)|394|196)|198|(1:225)(15:202|367|203|204|387|205|(1:207)|208|209|210|(5:213|(1:215)|216|(2:218|219)|221)|212|216|(0)|221)|226|(1:228)(7:229|(1:231)(1:232)|(1:234)|235|(10:237|385|238|239|241|(1:243)(2:244|(1:246))|247|(1:251)|(2:253|396)(1:397)|254)|395|255)|256|376|257|(1:259)|(1:261)(2:264|265)|262|263|267|374|268|(1:270)|271|273|274|(3:383|276|277)|278|371|280|281|381|282|283|(1:285)(1:287)|286|288|(1:290)|291|(5:293|(1:295)(1:296)|297|(5:379|299|(5:302|(7:308|326|(1:328)|329|330|369|331)(2:309|(3:311|(1:313)|314)(2:316|(6:318|(1:320)|321|322|389|323)(1:325)))|332|333|300)|398|334)(1:336)|337)(1:338)|339|(4:341|(1:343)(1:344)|345|(3:347|(6:350|(1:352)|353|(2:355|400)(1:401)|356|348)|399))|357|(1:359)|360|361)|134|135|(0)|197|198|(1:200)|225|226|(0)(0)|256|376|257|(0)|(0)(0)|262|263|267|374|268|(0)|271|273|274|(0)|278|371|280|281|381|282|283|(0)(0)|286|288|(0)|291|(0)(0)|339|(0)|357|(0)|360|361) */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06c8, code lost:
        r11[r0] = 0;
        r2 = 1;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x06e7, code lost:
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06fd, code lost:
        r0 = r0 + 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05af A[Catch: all -> 0x05bc, TRY_LEAVE, TryCatch #12 {all -> 0x05bc, blocks: (B:210:0x057f, B:216:0x0590, B:218:0x05af, B:205:0x0559, B:208:0x0566), top: B:387:0x0559 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06b2 A[Catch: all -> 0x06c8, TryCatch #5 {all -> 0x06c8, blocks: (B:257:0x06a4, B:261:0x06b2, B:264:0x06ba), top: B:376:0x06a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06ba A[Catch: all -> 0x06c8, TRY_LEAVE, TryCatch #5 {all -> 0x06c8, blocks: (B:257:0x06a4, B:261:0x06b2, B:264:0x06ba), top: B:376:0x06a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06db A[Catch: all -> 0x06e7, TryCatch #4 {all -> 0x06e7, blocks: (B:268:0x06d3, B:270:0x06db, B:273:0x06e9), top: B:374:0x06d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a() {
        /*
            Method dump skipped, instructions count: 2329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fp.a():byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000c, B:9:0x0012, B:11:0x0017, B:13:0x001f, B:15:0x0022, B:17:0x002b, B:18:0x0033), top: B:22:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r7.split(r0)
            r1 = 6
            byte[] r2 = new byte[r1]
            r3 = 0
            if (r0 == 0) goto L_0x0012
            int r4 = r0.length     // Catch: all -> 0x0010
            if (r4 == r1) goto L_0x001e
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            goto L_0x0041
        L_0x0012:
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: all -> 0x0010
            r4 = 0
        L_0x0015:
            if (r4 >= r1) goto L_0x001e
            java.lang.String r5 = "0"
            r0[r4] = r5     // Catch: all -> 0x0010
            int r4 = r4 + 1
            goto L_0x0015
        L_0x001e:
            r1 = 0
        L_0x001f:
            int r4 = r0.length     // Catch: all -> 0x0010
            if (r1 >= r4) goto L_0x0052
            r4 = r0[r1]     // Catch: all -> 0x0010
            int r4 = r4.length()     // Catch: all -> 0x0010
            r5 = 2
            if (r4 <= r5) goto L_0x0033
            r4 = r0[r1]     // Catch: all -> 0x0010
            java.lang.String r4 = r4.substring(r3, r5)     // Catch: all -> 0x0010
            r0[r1] = r4     // Catch: all -> 0x0010
        L_0x0033:
            r4 = r0[r1]     // Catch: all -> 0x0010
            r5 = 16
            int r4 = java.lang.Integer.parseInt(r4, r5)     // Catch: all -> 0x0010
            byte r4 = (byte) r4     // Catch: all -> 0x0010
            r2[r1] = r4     // Catch: all -> 0x0010
            int r1 = r1 + 1
            goto L_0x001f
        L_0x0041:
            java.lang.String r1 = "getMacBa "
            java.lang.String r7 = r1.concat(r7)
            java.lang.String r1 = "Req"
            com.loc.fr.a(r0, r1, r7)
            java.lang.String r7 = "00:00:00:00:00:00"
            byte[] r2 = r6.a(r7)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fp.a(java.lang.String):byte[]");
    }
}
