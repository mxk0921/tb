package com.xiaomi.push;

import com.xiaomi.push.service.bc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jd implements jn<jd, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f1351a;

    /* renamed from: a  reason: collision with other field name */
    public long f1352a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1353a;

    /* renamed from: a  reason: collision with other field name */
    public String f1354a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f1356a;

    /* renamed from: b  reason: collision with other field name */
    public int f1358b;

    /* renamed from: b  reason: collision with other field name */
    public long f1359b;

    /* renamed from: b  reason: collision with other field name */
    public String f1360b;

    /* renamed from: c  reason: collision with other field name */
    public long f1361c;

    /* renamed from: c  reason: collision with other field name */
    public String f1362c;

    /* renamed from: d  reason: collision with other field name */
    public String f1363d;

    /* renamed from: e  reason: collision with other field name */
    public String f1364e;

    /* renamed from: f  reason: collision with other field name */
    public String f1365f;

    /* renamed from: g  reason: collision with other field name */
    public String f1366g;

    /* renamed from: h  reason: collision with other field name */
    public String f1367h;

    /* renamed from: i  reason: collision with other field name */
    public String f1368i;

    /* renamed from: j  reason: collision with other field name */
    public String f1369j;

    /* renamed from: k  reason: collision with other field name */
    public String f1370k;

    /* renamed from: l  reason: collision with other field name */
    public String f1371l;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1350a = new kd("XmPushActionRegistrationResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14974a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 11, 9);
    private static final jv i = new jv("", (byte) 11, 10);
    private static final jv j = new jv("", (byte) 10, 11);
    private static final jv k = new jv("", (byte) 11, 12);
    private static final jv l = new jv("", (byte) 11, 13);
    private static final jv m = new jv("", (byte) 10, 14);
    private static final jv n = new jv("", (byte) 11, 15);
    private static final jv o = new jv("", (byte) 8, 16);
    private static final jv p = new jv("", (byte) 11, 17);
    private static final jv q = new jv("", (byte) 8, 18);
    private static final jv r = new jv("", (byte) 11, 19);
    private static final jv s = new jv("", (byte) 2, 20);
    private static final jv t = new jv("", (byte) 15, 21);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1355a = new BitSet(6);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1357a = false;

    /* renamed from: a */
    public int compareTo(jd jdVar) {
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
        if (!getClass().equals(jdVar.getClass())) {
            return getClass().getName().compareTo(jdVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m896a()).compareTo(Boolean.valueOf(jdVar.m896a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m896a() && (a21 = jo.a(this.f1354a, jdVar.f1354a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(m898b()).compareTo(Boolean.valueOf(jdVar.m898b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m898b() && (a20 = jo.a(this.f1353a, jdVar.f1353a)) != 0) {
            return a20;
        }
        int compareTo3 = Boolean.valueOf(m899c()).compareTo(Boolean.valueOf(jdVar.m899c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m899c() && (a19 = jo.a(this.f1360b, jdVar.f1360b)) != 0) {
            return a19;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jdVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a18 = jo.a(this.f1362c, jdVar.f1362c)) != 0) {
            return a18;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jdVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a17 = jo.a(this.f1352a, jdVar.f1352a)) != 0) {
            return a17;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jdVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a16 = jo.a(this.f1363d, jdVar.f1363d)) != 0) {
            return a16;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jdVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a15 = jo.a(this.f1364e, jdVar.f1364e)) != 0) {
            return a15;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jdVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a14 = jo.a(this.f1365f, jdVar.f1365f)) != 0) {
            return a14;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jdVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a13 = jo.a(this.f1366g, jdVar.f1366g)) != 0) {
            return a13;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jdVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a12 = jo.a(this.f1359b, jdVar.f1359b)) != 0) {
            return a12;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jdVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a11 = jo.a(this.f1367h, jdVar.f1367h)) != 0) {
            return a11;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jdVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a10 = jo.a(this.f1368i, jdVar.f1368i)) != 0) {
            return a10;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jdVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a9 = jo.a(this.f1361c, jdVar.f1361c)) != 0) {
            return a9;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jdVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a8 = jo.a(this.f1369j, jdVar.f1369j)) != 0) {
            return a8;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jdVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a7 = jo.a(this.f1351a, jdVar.f1351a)) != 0) {
            return a7;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jdVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a6 = jo.a(this.f1370k, jdVar.f1370k)) != 0) {
            return a6;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jdVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a5 = jo.a(this.f1358b, jdVar.f1358b)) != 0) {
            return a5;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jdVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a4 = jo.a(this.f1371l, jdVar.f1371l)) != 0) {
            return a4;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jdVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a3 = jo.a(this.f1357a, jdVar.f1357a)) != 0) {
            return a3;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jdVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!t() || (a2 = jo.a(this.f1356a, jdVar.f1356a)) == 0) {
            return 0;
        }
        return a2;
    }

    public String b() {
        return this.f1365f;
    }

    public String c() {
        return this.f1366g;
    }

    public void d(boolean z) {
        this.f1355a.set(3, z);
    }

    public void e(boolean z) {
        this.f1355a.set(4, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jd)) {
            return m897a((jd) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f1355a.set(5, z);
    }

    public boolean g() {
        if (this.f1364e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1365f != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1366g != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return this.f1355a.get(1);
    }

    public boolean k() {
        if (this.f1367h != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.f1368i != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.f1355a.get(2);
    }

    public boolean n() {
        if (this.f1369j != null) {
            return true;
        }
        return false;
    }

    public boolean o() {
        return this.f1355a.get(3);
    }

    public boolean p() {
        if (this.f1370k != null) {
            return true;
        }
        return false;
    }

    public boolean q() {
        return this.f1355a.get(4);
    }

    public boolean r() {
        if (this.f1371l != null) {
            return true;
        }
        return false;
    }

    public boolean s() {
        return this.f1355a.get(5);
    }

    public boolean t() {
        if (this.f1356a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z2 = false;
        if (m896a()) {
            sb.append("debug:");
            String str = this.f1354a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m898b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1353a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f1360b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(bc.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1362c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f1352a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f1363d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.f1364e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f1366g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f1359b);
        }
        if (k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.f1367h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.f1368i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f1361c);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.f1369j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f1351a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.f1370k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f1358b);
        }
        if (r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.f1371l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f1357a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            List<String> list = this.f1356a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public long a() {
        return this.f1352a;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m895a();
        jyVar.a(f1350a);
        if (this.f1354a != null && m896a()) {
            jyVar.a(f14974a);
            jyVar.a(this.f1354a);
            jyVar.b();
        }
        if (this.f1353a != null && m898b()) {
            jyVar.a(b);
            this.f1353a.b(jyVar);
            jyVar.b();
        }
        if (this.f1360b != null) {
            jyVar.a(c);
            jyVar.a(this.f1360b);
            jyVar.b();
        }
        if (this.f1362c != null) {
            jyVar.a(d);
            jyVar.a(this.f1362c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f1352a);
        jyVar.b();
        if (this.f1363d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1363d);
            jyVar.b();
        }
        if (this.f1364e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1364e);
            jyVar.b();
        }
        if (this.f1365f != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1365f);
            jyVar.b();
        }
        if (this.f1366g != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1366g);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.a(this.f1359b);
            jyVar.b();
        }
        if (this.f1367h != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f1367h);
            jyVar.b();
        }
        if (this.f1368i != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f1368i);
            jyVar.b();
        }
        if (m()) {
            jyVar.a(m);
            jyVar.a(this.f1361c);
            jyVar.b();
        }
        if (this.f1369j != null && n()) {
            jyVar.a(n);
            jyVar.a(this.f1369j);
            jyVar.b();
        }
        if (o()) {
            jyVar.a(o);
            jyVar.mo941a(this.f1351a);
            jyVar.b();
        }
        if (this.f1370k != null && p()) {
            jyVar.a(p);
            jyVar.a(this.f1370k);
            jyVar.b();
        }
        if (q()) {
            jyVar.a(q);
            jyVar.mo941a(this.f1358b);
            jyVar.b();
        }
        if (this.f1371l != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f1371l);
            jyVar.b();
        }
        if (s()) {
            jyVar.a(s);
            jyVar.a(this.f1357a);
            jyVar.b();
        }
        if (this.f1356a != null && t()) {
            jyVar.a(t);
            jyVar.a(new jw((byte) 11, this.f1356a.size()));
            for (String str : this.f1356a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1355a.set(2, z);
    }

    public boolean d() {
        return this.f1362c != null;
    }

    public boolean e() {
        return this.f1355a.get(0);
    }

    public boolean f() {
        return this.f1363d != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m893a() {
        return this.f1360b;
    }

    public void b(boolean z) {
        this.f1355a.set(1, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m899c() {
        return this.f1360b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public List<String> m894a() {
        return this.f1356a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m898b() {
        return this.f1353a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m895a() {
        if (this.f1360b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1362c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                if (e()) {
                    m895a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1354a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1353a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1360b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1362c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f1352a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1363d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1364e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1365f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1366g = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 10) {
                        this.f1359b = jyVar.m944a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f1367h = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f1368i = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (b2 == 10) {
                        this.f1361c = jyVar.m944a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (b2 == 11) {
                        this.f1369j = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 16:
                    if (b2 == 8) {
                        this.f1351a = jyVar.m943a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 17:
                    if (b2 == 11) {
                        this.f1370k = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 18:
                    if (b2 == 8) {
                        this.f1358b = jyVar.m943a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 19:
                    if (b2 == 11) {
                        this.f1371l = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (b2 == 2) {
                        this.f1357a = jyVar.m954a();
                        f(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 21:
                    if (b2 == 15) {
                        jw a3 = jyVar.m946a();
                        this.f1356a = new ArrayList(a3.f1471a);
                        for (int i2 = 0; i2 < a3.f1471a; i2++) {
                            this.f1356a.add(jyVar.m950a());
                        }
                        jyVar.i();
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, b2);
            jyVar.g();
        }
    }

    public void a(boolean z) {
        this.f1355a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m896a() {
        return this.f1354a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m897a(jd jdVar) {
        if (jdVar == null) {
            return false;
        }
        boolean a2 = m896a();
        boolean a3 = jdVar.m896a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1354a.equals(jdVar.f1354a))) {
            return false;
        }
        boolean b2 = m898b();
        boolean b3 = jdVar.m898b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1353a.m831a(jdVar.f1353a))) {
            return false;
        }
        boolean c2 = m899c();
        boolean c3 = jdVar.m899c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1360b.equals(jdVar.f1360b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jdVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f1362c.equals(jdVar.f1362c))) || this.f1352a != jdVar.f1352a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jdVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1363d.equals(jdVar.f1363d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jdVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1364e.equals(jdVar.f1364e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jdVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1365f.equals(jdVar.f1365f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jdVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1366g.equals(jdVar.f1366g))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jdVar.j();
        if ((j2 || j3) && (!j2 || !j3 || this.f1359b != jdVar.f1359b)) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jdVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f1367h.equals(jdVar.f1367h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jdVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f1368i.equals(jdVar.f1368i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jdVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f1361c != jdVar.f1361c)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jdVar.n();
        if ((n2 || n3) && (!n2 || !n3 || !this.f1369j.equals(jdVar.f1369j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jdVar.o();
        if ((o2 || o3) && (!o2 || !o3 || this.f1351a != jdVar.f1351a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = jdVar.p();
        if ((p2 || p3) && (!p2 || !p3 || !this.f1370k.equals(jdVar.f1370k))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = jdVar.q();
        if ((q2 || q3) && (!q2 || !q3 || this.f1358b != jdVar.f1358b)) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = jdVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f1371l.equals(jdVar.f1371l))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = jdVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f1357a != jdVar.f1357a)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = jdVar.t();
        if (t2 || t3) {
            return t2 && t3 && this.f1356a.equals(jdVar.f1356a);
        }
        return true;
    }
}
