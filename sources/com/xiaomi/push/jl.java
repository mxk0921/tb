package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jl implements jn<jl, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1450a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1451a;

    /* renamed from: a  reason: collision with other field name */
    public String f1452a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1453a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f1454b;

    /* renamed from: c  reason: collision with other field name */
    public String f1455c;

    /* renamed from: d  reason: collision with other field name */
    public String f1456d;

    /* renamed from: e  reason: collision with other field name */
    public String f1457e;

    /* renamed from: f  reason: collision with other field name */
    public String f1458f;

    /* renamed from: g  reason: collision with other field name */
    public String f1459g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1449a = new kd("XmPushActionUnSubscriptionResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14982a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 11, 9);
    private static final jv i = new jv("", (byte) 11, 10);

    /* renamed from: a */
    public int compareTo(jl jlVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jlVar.getClass())) {
            return getClass().getName().compareTo(jlVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m926a()).compareTo(Boolean.valueOf(jlVar.m926a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m926a() && (a10 = jo.a(this.f1452a, jlVar.f1452a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m928b()).compareTo(Boolean.valueOf(jlVar.m928b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m928b() && (a9 = jo.a(this.f1451a, jlVar.f1451a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m929c()).compareTo(Boolean.valueOf(jlVar.m929c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m929c() && (a8 = jo.a(this.f1454b, jlVar.f1454b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jlVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jo.a(this.f1455c, jlVar.f1455c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jlVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jo.a(this.f1450a, jlVar.f1450a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jlVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jo.a(this.f1456d, jlVar.f1456d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jlVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jo.a(this.f1457e, jlVar.f1457e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jlVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jo.a(this.f1458f, jlVar.f1458f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jlVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = jo.a(this.f1459g, jlVar.f1459g)) == 0) {
            return 0;
        }
        return a2;
    }

    public String b() {
        return this.f1457e;
    }

    public String c() {
        return this.f1459g;
    }

    public boolean d() {
        if (this.f1455c != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f1453a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jl)) {
            return m927a((jl) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1456d != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1457e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1458f != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1459g != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (m926a()) {
            sb.append("debug:");
            String str = this.f1452a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m928b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1451a;
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
        String str2 = this.f1454b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f1455c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f1450a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f1456d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f1457e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f1458f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f1459g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public String a() {
        return this.f1454b;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m925a();
        jyVar.a(f1449a);
        if (this.f1452a != null && m926a()) {
            jyVar.a(f14982a);
            jyVar.a(this.f1452a);
            jyVar.b();
        }
        if (this.f1451a != null && m928b()) {
            jyVar.a(b);
            this.f1451a.b(jyVar);
            jyVar.b();
        }
        if (this.f1454b != null) {
            jyVar.a(c);
            jyVar.a(this.f1454b);
            jyVar.b();
        }
        if (this.f1455c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f1455c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f1450a);
            jyVar.b();
        }
        if (this.f1456d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1456d);
            jyVar.b();
        }
        if (this.f1457e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1457e);
            jyVar.b();
        }
        if (this.f1458f != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1458f);
            jyVar.b();
        }
        if (this.f1459g != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1459g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m929c() {
        return this.f1454b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m925a() {
        if (this.f1454b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m928b() {
        return this.f1451a != null;
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                m925a();
                return;
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1452a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1451a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1454b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1455c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f1450a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1456d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1457e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1458f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1459g = jyVar.m950a();
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
        this.f1453a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m926a() {
        return this.f1452a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m927a(jl jlVar) {
        if (jlVar == null) {
            return false;
        }
        boolean a2 = m926a();
        boolean a3 = jlVar.m926a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1452a.equals(jlVar.f1452a))) {
            return false;
        }
        boolean b2 = m928b();
        boolean b3 = jlVar.m928b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1451a.m831a(jlVar.f1451a))) {
            return false;
        }
        boolean c2 = m929c();
        boolean c3 = jlVar.m929c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1454b.equals(jlVar.f1454b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jlVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1455c.equals(jlVar.f1455c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jlVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f1450a != jlVar.f1450a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jlVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1456d.equals(jlVar.f1456d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jlVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1457e.equals(jlVar.f1457e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jlVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1458f.equals(jlVar.f1458f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jlVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f1459g.equals(jlVar.f1459g);
        }
        return true;
    }
}
