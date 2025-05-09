package com.xiaomi.push;

import com.xiaomi.push.service.bc;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jc implements jn<jc, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f1320a;

    /* renamed from: a  reason: collision with other field name */
    public long f1321a;

    /* renamed from: a  reason: collision with other field name */
    public iq f1322a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1323a;

    /* renamed from: a  reason: collision with other field name */
    public String f1324a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f1326a;

    /* renamed from: b  reason: collision with other field name */
    public int f1328b;

    /* renamed from: b  reason: collision with other field name */
    public long f1329b;

    /* renamed from: b  reason: collision with other field name */
    public String f1330b;

    /* renamed from: c  reason: collision with other field name */
    public int f1332c;

    /* renamed from: c  reason: collision with other field name */
    public String f1333c;

    /* renamed from: d  reason: collision with other field name */
    public String f1335d;

    /* renamed from: e  reason: collision with other field name */
    public String f1336e;

    /* renamed from: f  reason: collision with other field name */
    public String f1337f;

    /* renamed from: g  reason: collision with other field name */
    public String f1338g;

    /* renamed from: h  reason: collision with other field name */
    public String f1339h;

    /* renamed from: i  reason: collision with other field name */
    public String f1340i;

    /* renamed from: j  reason: collision with other field name */
    public String f1341j;

    /* renamed from: k  reason: collision with other field name */
    public String f1342k;

    /* renamed from: l  reason: collision with other field name */
    public String f1343l;

    /* renamed from: m  reason: collision with other field name */
    public String f1344m;

    /* renamed from: n  reason: collision with other field name */
    public String f1345n;

    /* renamed from: o  reason: collision with other field name */
    public String f1346o;

    /* renamed from: p  reason: collision with other field name */
    public String f1347p;

    /* renamed from: q  reason: collision with other field name */
    public String f1348q;

    /* renamed from: r  reason: collision with other field name */
    public String f1349r;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1319a = new kd("XmPushActionRegistration");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14973a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 11, 11);
    private static final jv l = new jv("", (byte) 11, 12);
    private static final jv m = new jv("", (byte) 8, 13);
    private static final jv n = new jv("", (byte) 8, 14);
    private static final jv o = new jv("", (byte) 11, 15);
    private static final jv p = new jv("", (byte) 11, 16);
    private static final jv q = new jv("", (byte) 11, 17);
    private static final jv r = new jv("", (byte) 11, 18);
    private static final jv s = new jv("", (byte) 8, 19);
    private static final jv t = new jv("", (byte) 8, 20);
    private static final jv u = new jv("", (byte) 2, 21);
    private static final jv v = new jv("", (byte) 10, 22);
    private static final jv w = new jv("", (byte) 10, 23);
    private static final jv x = new jv("", (byte) 11, 24);
    private static final jv y = new jv("", (byte) 11, 25);
    private static final jv z = new jv("", (byte) 2, 26);
    private static final jv A = new jv("", (byte) 13, 100);
    private static final jv B = new jv("", (byte) 2, 101);
    private static final jv C = new jv("", (byte) 11, 102);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1325a = new BitSet(8);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1327a = true;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1334c = false;

    /* renamed from: b  reason: collision with other field name */
    public boolean f1331b = false;

    public boolean A() {
        if (this.f1326a != null) {
            return true;
        }
        return false;
    }

    public boolean B() {
        return this.f1325a.get(7);
    }

    public boolean C() {
        if (this.f1349r != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(jc jcVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        int a20;
        int a21;
        int a22;
        int a23;
        int a24;
        int a25;
        int a26;
        int a27;
        int a28;
        int a29;
        int a30;
        if (!getClass().equals(jcVar.getClass())) {
            return getClass().getName().compareTo(jcVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m889a()).compareTo(Boolean.valueOf(jcVar.m889a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m889a() && (a30 = jo.a(this.f1324a, jcVar.f1324a)) != 0) {
            return a30;
        }
        int compareTo2 = Boolean.valueOf(m891b()).compareTo(Boolean.valueOf(jcVar.m891b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m891b() && (a29 = jo.a(this.f1323a, jcVar.f1323a)) != 0) {
            return a29;
        }
        int compareTo3 = Boolean.valueOf(m892c()).compareTo(Boolean.valueOf(jcVar.m892c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m892c() && (a28 = jo.a(this.f1330b, jcVar.f1330b)) != 0) {
            return a28;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jcVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a27 = jo.a(this.f1333c, jcVar.f1333c)) != 0) {
            return a27;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jcVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a26 = jo.a(this.f1335d, jcVar.f1335d)) != 0) {
            return a26;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jcVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a25 = jo.a(this.f1336e, jcVar.f1336e)) != 0) {
            return a25;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jcVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a24 = jo.a(this.f1337f, jcVar.f1337f)) != 0) {
            return a24;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jcVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a23 = jo.a(this.f1338g, jcVar.f1338g)) != 0) {
            return a23;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jcVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a22 = jo.a(this.f1339h, jcVar.f1339h)) != 0) {
            return a22;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jcVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a21 = jo.a(this.f1340i, jcVar.f1340i)) != 0) {
            return a21;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jcVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a20 = jo.a(this.f1341j, jcVar.f1341j)) != 0) {
            return a20;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jcVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a19 = jo.a(this.f1342k, jcVar.f1342k)) != 0) {
            return a19;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jcVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a18 = jo.a(this.f1320a, jcVar.f1320a)) != 0) {
            return a18;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jcVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a17 = jo.a(this.f1328b, jcVar.f1328b)) != 0) {
            return a17;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jcVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a16 = jo.a(this.f1343l, jcVar.f1343l)) != 0) {
            return a16;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jcVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a15 = jo.a(this.f1344m, jcVar.f1344m)) != 0) {
            return a15;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jcVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a14 = jo.a(this.f1345n, jcVar.f1345n)) != 0) {
            return a14;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jcVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a13 = jo.a(this.f1346o, jcVar.f1346o)) != 0) {
            return a13;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jcVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a12 = jo.a(this.f1332c, jcVar.f1332c)) != 0) {
            return a12;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jcVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (t() && (a11 = jo.a(this.f1322a, jcVar.f1322a)) != 0) {
            return a11;
        }
        int compareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(jcVar.u()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (u() && (a10 = jo.a(this.f1327a, jcVar.f1327a)) != 0) {
            return a10;
        }
        int compareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(jcVar.v()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (v() && (a9 = jo.a(this.f1321a, jcVar.f1321a)) != 0) {
            return a9;
        }
        int compareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(jcVar.w()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (w() && (a8 = jo.a(this.f1329b, jcVar.f1329b)) != 0) {
            return a8;
        }
        int compareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(jcVar.x()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (x() && (a7 = jo.a(this.f1347p, jcVar.f1347p)) != 0) {
            return a7;
        }
        int compareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(jcVar.y()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (y() && (a6 = jo.a(this.f1348q, jcVar.f1348q)) != 0) {
            return a6;
        }
        int compareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(jcVar.z()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (z() && (a5 = jo.a(this.f1331b, jcVar.f1331b)) != 0) {
            return a5;
        }
        int compareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(jcVar.A()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (A() && (a4 = jo.a(this.f1326a, jcVar.f1326a)) != 0) {
            return a4;
        }
        int compareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(jcVar.B()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (B() && (a3 = jo.a(this.f1334c, jcVar.f1334c)) != 0) {
            return a3;
        }
        int compareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(jcVar.C()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (!C() || (a2 = jo.a(this.f1349r, jcVar.f1349r)) == 0) {
            return 0;
        }
        return a2;
    }

    public jc b(int i2) {
        this.f1328b = i2;
        b(true);
        return this;
    }

    public jc c(int i2) {
        this.f1332c = i2;
        c(true);
        return this;
    }

    public jc d(String str) {
        this.f1336e = str;
        return this;
    }

    public jc e(String str) {
        this.f1337f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jc)) {
            return m890a((jc) obj);
        }
        return false;
    }

    public jc f(String str) {
        this.f1338g = str;
        return this;
    }

    public jc g(String str) {
        this.f1339h = str;
        return this;
    }

    public jc h(String str) {
        this.f1342k = str;
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public jc i(String str) {
        this.f1346o = str;
        return this;
    }

    public boolean j() {
        if (this.f1340i != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f1341j != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.f1342k != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.f1325a.get(0);
    }

    public boolean n() {
        return this.f1325a.get(1);
    }

    public boolean o() {
        if (this.f1343l != null) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f1344m != null) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if (this.f1345n != null) {
            return true;
        }
        return false;
    }

    public boolean r() {
        if (this.f1346o != null) {
            return true;
        }
        return false;
    }

    public boolean s() {
        return this.f1325a.get(2);
    }

    public boolean t() {
        if (this.f1322a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z3 = false;
        if (m889a()) {
            sb.append("debug:");
            String str = this.f1324a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m891b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1323a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
        } else {
            z3 = z2;
        }
        if (!z3) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f1330b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(bc.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1333c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str4 = this.f1335d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f1336e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(", ");
        sb.append("token:");
        String str6 = this.f1337f;
        if (str6 == null) {
            sb.append("null");
        } else {
            sb.append(str6);
        }
        if (h()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str7 = this.f1338g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str8 = this.f1339h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            String str9 = this.f1340i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str10 = this.f1341j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            String str11 = this.f1342k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f1320a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f1328b);
        }
        if (o()) {
            sb.append(", ");
            sb.append("androidId:");
            String str12 = this.f1343l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("imei:");
            String str13 = this.f1344m;
            if (str13 == null) {
                sb.append("null");
            } else {
                sb.append(str13);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("serial:");
            String str14 = this.f1345n;
            if (str14 == null) {
                sb.append("null");
            } else {
                sb.append(str14);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str15 = this.f1346o;
            if (str15 == null) {
                sb.append("null");
            } else {
                sb.append(str15);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f1332c);
        }
        if (t()) {
            sb.append(", ");
            sb.append("reason:");
            iq iqVar = this.f1322a;
            if (iqVar == null) {
                sb.append("null");
            } else {
                sb.append(iqVar);
            }
        }
        if (u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f1327a);
        }
        if (v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f1321a);
        }
        if (w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f1329b);
        }
        if (x()) {
            sb.append(", ");
            sb.append("subImei:");
            String str16 = this.f1347p;
            if (str16 == null) {
                sb.append("null");
            } else {
                sb.append(str16);
            }
        }
        if (y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            String str17 = this.f1348q;
            if (str17 == null) {
                sb.append("null");
            } else {
                sb.append(str17);
            }
        }
        if (z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f1331b);
        }
        if (A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            Map<String, String> map = this.f1326a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f1334c);
        }
        if (C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            String str18 = this.f1349r;
            if (str18 == null) {
                sb.append("null");
            } else {
                sb.append(str18);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public boolean u() {
        return this.f1325a.get(3);
    }

    public boolean v() {
        return this.f1325a.get(4);
    }

    public boolean w() {
        return this.f1325a.get(5);
    }

    public boolean x() {
        if (this.f1347p != null) {
            return true;
        }
        return false;
    }

    public boolean y() {
        if (this.f1348q != null) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.f1325a.get(6);
    }

    public jc a(int i2) {
        this.f1320a = i2;
        a(true);
        return this;
    }

    public jc b(String str) {
        this.f1333c = str;
        return this;
    }

    public jc c(String str) {
        this.f1335d = str;
        return this;
    }

    public void d(boolean z2) {
        this.f1325a.set(3, z2);
    }

    public void e(boolean z2) {
        this.f1325a.set(4, z2);
    }

    public void f(boolean z2) {
        this.f1325a.set(5, z2);
    }

    public void g(boolean z2) {
        this.f1325a.set(6, z2);
    }

    public void h(boolean z2) {
        this.f1325a.set(7, z2);
    }

    public boolean i() {
        return this.f1339h != null;
    }

    public jc a(iq iqVar) {
        this.f1322a = iqVar;
        return this;
    }

    public String b() {
        return this.f1333c;
    }

    public String c() {
        return this.f1337f;
    }

    public boolean d() {
        return this.f1333c != null;
    }

    public boolean e() {
        return this.f1335d != null;
    }

    public boolean f() {
        return this.f1336e != null;
    }

    public boolean g() {
        return this.f1337f != null;
    }

    public boolean h() {
        return this.f1338g != null;
    }

    public jc a(String str) {
        this.f1330b = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m888a();
        jyVar.a(f1319a);
        if (this.f1324a != null && m889a()) {
            jyVar.a(f14973a);
            jyVar.a(this.f1324a);
            jyVar.b();
        }
        if (this.f1323a != null && m891b()) {
            jyVar.a(b);
            this.f1323a.b(jyVar);
            jyVar.b();
        }
        if (this.f1330b != null) {
            jyVar.a(c);
            jyVar.a(this.f1330b);
            jyVar.b();
        }
        if (this.f1333c != null) {
            jyVar.a(d);
            jyVar.a(this.f1333c);
            jyVar.b();
        }
        if (this.f1335d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f1335d);
            jyVar.b();
        }
        if (this.f1336e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1336e);
            jyVar.b();
        }
        if (this.f1337f != null) {
            jyVar.a(g);
            jyVar.a(this.f1337f);
            jyVar.b();
        }
        if (this.f1338g != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1338g);
            jyVar.b();
        }
        if (this.f1339h != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1339h);
            jyVar.b();
        }
        if (this.f1340i != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f1340i);
            jyVar.b();
        }
        if (this.f1341j != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f1341j);
            jyVar.b();
        }
        if (this.f1342k != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f1342k);
            jyVar.b();
        }
        if (m()) {
            jyVar.a(m);
            jyVar.mo941a(this.f1320a);
            jyVar.b();
        }
        if (n()) {
            jyVar.a(n);
            jyVar.mo941a(this.f1328b);
            jyVar.b();
        }
        if (this.f1343l != null && o()) {
            jyVar.a(o);
            jyVar.a(this.f1343l);
            jyVar.b();
        }
        if (this.f1344m != null && p()) {
            jyVar.a(p);
            jyVar.a(this.f1344m);
            jyVar.b();
        }
        if (this.f1345n != null && q()) {
            jyVar.a(q);
            jyVar.a(this.f1345n);
            jyVar.b();
        }
        if (this.f1346o != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f1346o);
            jyVar.b();
        }
        if (s()) {
            jyVar.a(s);
            jyVar.mo941a(this.f1332c);
            jyVar.b();
        }
        if (this.f1322a != null && t()) {
            jyVar.a(t);
            jyVar.mo941a(this.f1322a.a());
            jyVar.b();
        }
        if (u()) {
            jyVar.a(u);
            jyVar.a(this.f1327a);
            jyVar.b();
        }
        if (v()) {
            jyVar.a(v);
            jyVar.a(this.f1321a);
            jyVar.b();
        }
        if (w()) {
            jyVar.a(w);
            jyVar.a(this.f1329b);
            jyVar.b();
        }
        if (this.f1347p != null && x()) {
            jyVar.a(x);
            jyVar.a(this.f1347p);
            jyVar.b();
        }
        if (this.f1348q != null && y()) {
            jyVar.a(y);
            jyVar.a(this.f1348q);
            jyVar.b();
        }
        if (z()) {
            jyVar.a(z);
            jyVar.a(this.f1331b);
            jyVar.b();
        }
        if (this.f1326a != null && A()) {
            jyVar.a(A);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1326a.size()));
            for (Map.Entry<String, String> entry : this.f1326a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (B()) {
            jyVar.a(B);
            jyVar.a(this.f1334c);
            jyVar.b();
        }
        if (this.f1349r != null && C()) {
            jyVar.a(C);
            jyVar.a(this.f1349r);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z2) {
        this.f1325a.set(2, z2);
    }

    public String a() {
        return this.f1330b;
    }

    public void b(boolean z2) {
        this.f1325a.set(1, z2);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m892c() {
        return this.f1330b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m888a() {
        if (this.f1330b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1333c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f1337f == null) {
            throw new jz("Required field 'token' was not present! Struct: " + toString());
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m891b() {
        return this.f1323a != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                m888a();
                return;
            }
            short s2 = a2.f1470a;
            switch (s2) {
                case 1:
                    if (b2 == 11) {
                        this.f1324a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1323a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1330b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1333c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1335d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f1336e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1337f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1338g = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1339h = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1340i = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f1341j = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f1342k = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (b2 == 8) {
                        this.f1320a = jyVar.m943a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (b2 == 8) {
                        this.f1328b = jyVar.m943a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (b2 == 11) {
                        this.f1343l = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 16:
                    if (b2 == 11) {
                        this.f1344m = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 17:
                    if (b2 == 11) {
                        this.f1345n = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 18:
                    if (b2 == 11) {
                        this.f1346o = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 19:
                    if (b2 == 8) {
                        this.f1332c = jyVar.m943a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (b2 == 8) {
                        this.f1322a = iq.a(jyVar.m943a());
                        continue;
                        jyVar.g();
                    }
                    break;
                case 21:
                    if (b2 == 2) {
                        this.f1327a = jyVar.m954a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 22:
                    if (b2 == 10) {
                        this.f1321a = jyVar.m944a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 23:
                    if (b2 == 10) {
                        this.f1329b = jyVar.m944a();
                        f(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 24:
                    if (b2 == 11) {
                        this.f1347p = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 25:
                    if (b2 == 11) {
                        this.f1348q = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 26:
                    if (b2 == 2) {
                        this.f1331b = jyVar.m954a();
                        g(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                default:
                    switch (s2) {
                        case 100:
                            if (b2 == 13) {
                                jx a3 = jyVar.m947a();
                                this.f1326a = new HashMap(a3.f1472a * 2);
                                for (int i2 = 0; i2 < a3.f1472a; i2++) {
                                    this.f1326a.put(jyVar.m950a(), jyVar.m950a());
                                }
                                jyVar.h();
                                break;
                            }
                            break;
                        case 101:
                            if (b2 == 2) {
                                this.f1334c = jyVar.m954a();
                                h(true);
                                break;
                            }
                            break;
                        case 102:
                            if (b2 == 11) {
                                this.f1349r = jyVar.m950a();
                                continue;
                            }
                            break;
                    }
                    jyVar.g();
                    break;
            }
            kb.a(jyVar, b2);
            jyVar.g();
        }
    }

    public void a(boolean z2) {
        this.f1325a.set(0, z2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m889a() {
        return this.f1324a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m890a(jc jcVar) {
        if (jcVar == null) {
            return false;
        }
        boolean a2 = m889a();
        boolean a3 = jcVar.m889a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1324a.equals(jcVar.f1324a))) {
            return false;
        }
        boolean b2 = m891b();
        boolean b3 = jcVar.m891b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1323a.m831a(jcVar.f1323a))) {
            return false;
        }
        boolean c2 = m892c();
        boolean c3 = jcVar.m892c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1330b.equals(jcVar.f1330b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jcVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1333c.equals(jcVar.f1333c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jcVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1335d.equals(jcVar.f1335d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jcVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1336e.equals(jcVar.f1336e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jcVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1337f.equals(jcVar.f1337f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jcVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1338g.equals(jcVar.f1338g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jcVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1339h.equals(jcVar.f1339h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jcVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1340i.equals(jcVar.f1340i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jcVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f1341j.equals(jcVar.f1341j))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jcVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f1342k.equals(jcVar.f1342k))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jcVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f1320a != jcVar.f1320a)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jcVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f1328b != jcVar.f1328b)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jcVar.o();
        if ((o2 || o3) && (!o2 || !o3 || !this.f1343l.equals(jcVar.f1343l))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = jcVar.p();
        if ((p2 || p3) && (!p2 || !p3 || !this.f1344m.equals(jcVar.f1344m))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = jcVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f1345n.equals(jcVar.f1345n))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = jcVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f1346o.equals(jcVar.f1346o))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = jcVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f1332c != jcVar.f1332c)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = jcVar.t();
        if ((t2 || t3) && (!t2 || !t3 || !this.f1322a.equals(jcVar.f1322a))) {
            return false;
        }
        boolean u2 = u();
        boolean u3 = jcVar.u();
        if ((u2 || u3) && (!u2 || !u3 || this.f1327a != jcVar.f1327a)) {
            return false;
        }
        boolean v2 = v();
        boolean v3 = jcVar.v();
        if ((v2 || v3) && (!v2 || !v3 || this.f1321a != jcVar.f1321a)) {
            return false;
        }
        boolean w2 = w();
        boolean w3 = jcVar.w();
        if ((w2 || w3) && (!w2 || !w3 || this.f1329b != jcVar.f1329b)) {
            return false;
        }
        boolean x2 = x();
        boolean x3 = jcVar.x();
        if ((x2 || x3) && (!x2 || !x3 || !this.f1347p.equals(jcVar.f1347p))) {
            return false;
        }
        boolean y2 = y();
        boolean y3 = jcVar.y();
        if ((y2 || y3) && (!y2 || !y3 || !this.f1348q.equals(jcVar.f1348q))) {
            return false;
        }
        boolean z2 = z();
        boolean z3 = jcVar.z();
        if ((z2 || z3) && (!z2 || !z3 || this.f1331b != jcVar.f1331b)) {
            return false;
        }
        boolean A2 = A();
        boolean A3 = jcVar.A();
        if ((A2 || A3) && (!A2 || !A3 || !this.f1326a.equals(jcVar.f1326a))) {
            return false;
        }
        boolean B2 = B();
        boolean B3 = jcVar.B();
        if ((B2 || B3) && (!B2 || !B3 || this.f1334c != jcVar.f1334c)) {
            return false;
        }
        boolean C2 = C();
        boolean C3 = jcVar.C();
        if (C2 || C3) {
            return C2 && C3 && this.f1349r.equals(jcVar.f1349r);
        }
        return true;
    }
}
