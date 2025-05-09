package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ji implements jn<ji, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1416a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1417a;

    /* renamed from: a  reason: collision with other field name */
    public String f1418a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1419a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1420a = true;

    /* renamed from: b  reason: collision with other field name */
    public String f1421b;

    /* renamed from: c  reason: collision with other field name */
    public String f1422c;

    /* renamed from: d  reason: collision with other field name */
    public String f1423d;

    /* renamed from: e  reason: collision with other field name */
    public String f1424e;

    /* renamed from: f  reason: collision with other field name */
    public String f1425f;

    /* renamed from: g  reason: collision with other field name */
    public String f1426g;

    /* renamed from: h  reason: collision with other field name */
    public String f1427h;

    /* renamed from: i  reason: collision with other field name */
    public String f1428i;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1415a = new kd("XmPushActionUnRegistration");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14979a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 2, 11);
    private static final jv l = new jv("", (byte) 10, 12);

    /* renamed from: a */
    public int compareTo(ji jiVar) {
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
        if (!getClass().equals(jiVar.getClass())) {
            return getClass().getName().compareTo(jiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m918a()).compareTo(Boolean.valueOf(jiVar.m918a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m918a() && (a13 = jo.a(this.f1418a, jiVar.f1418a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jiVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a12 = jo.a(this.f1417a, jiVar.f1417a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jiVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a11 = jo.a(this.f1421b, jiVar.f1421b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jiVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a10 = jo.a(this.f1422c, jiVar.f1422c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jiVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a9 = jo.a(this.f1423d, jiVar.f1423d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jiVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a8 = jo.a(this.f1424e, jiVar.f1424e)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jiVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a7 = jo.a(this.f1425f, jiVar.f1425f)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jiVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a6 = jo.a(this.f1426g, jiVar.f1426g)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jiVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a5 = jo.a(this.f1427h, jiVar.f1427h)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jiVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a4 = jo.a(this.f1428i, jiVar.f1428i)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jiVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a3 = jo.a(this.f1420a, jiVar.f1420a)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jiVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!l() || (a2 = jo.a(this.f1416a, jiVar.f1416a)) == 0) {
            return 0;
        }
        return a2;
    }

    public ji b(String str) {
        this.f1422c = str;
        return this;
    }

    public ji c(String str) {
        this.f1423d = str;
        return this;
    }

    public ji d(String str) {
        this.f1425f = str;
        return this;
    }

    public ji e(String str) {
        this.f1426g = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ji)) {
            return m919a((ji) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1424e != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1425f != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1426g != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1427h != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f1428i != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        return this.f1419a.get(0);
    }

    public boolean l() {
        return this.f1419a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z2 = false;
        if (m918a()) {
            sb.append("debug:");
            String str = this.f1418a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1417a;
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
        String str2 = this.f1421b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1422c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("regId:");
            String str4 = this.f1423d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str5 = this.f1424e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f1425f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            String str7 = this.f1426g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str8 = this.f1427h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f1428i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f1420a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f1416a);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public ji a(String str) {
        this.f1421b = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1415a);
        if (this.f1418a != null && m918a()) {
            jyVar.a(f14979a);
            jyVar.a(this.f1418a);
            jyVar.b();
        }
        if (this.f1417a != null && b()) {
            jyVar.a(b);
            this.f1417a.b(jyVar);
            jyVar.b();
        }
        if (this.f1421b != null) {
            jyVar.a(c);
            jyVar.a(this.f1421b);
            jyVar.b();
        }
        if (this.f1422c != null) {
            jyVar.a(d);
            jyVar.a(this.f1422c);
            jyVar.b();
        }
        if (this.f1423d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f1423d);
            jyVar.b();
        }
        if (this.f1424e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1424e);
            jyVar.b();
        }
        if (this.f1425f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1425f);
            jyVar.b();
        }
        if (this.f1426g != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1426g);
            jyVar.b();
        }
        if (this.f1427h != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1427h);
            jyVar.b();
        }
        if (this.f1428i != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f1428i);
            jyVar.b();
        }
        if (k()) {
            jyVar.a(k);
            jyVar.a(this.f1420a);
            jyVar.b();
        }
        if (l()) {
            jyVar.a(l);
            jyVar.a(this.f1416a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        return this.f1421b != null;
    }

    public boolean d() {
        return this.f1422c != null;
    }

    public boolean e() {
        return this.f1423d != null;
    }

    public void a() {
        if (this.f1421b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1422c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    public void b(boolean z) {
        this.f1419a.set(1, z);
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                a();
                return;
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1418a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1417a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1421b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1422c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1423d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f1424e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1425f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1426g = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1427h = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1428i = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f1420a = jyVar.m954a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 10) {
                        this.f1416a = jyVar.m944a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, b2);
            jyVar.g();
        }
    }

    public boolean b() {
        return this.f1417a != null;
    }

    public void a(boolean z) {
        this.f1419a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m918a() {
        return this.f1418a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m919a(ji jiVar) {
        if (jiVar == null) {
            return false;
        }
        boolean a2 = m918a();
        boolean a3 = jiVar.m918a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1418a.equals(jiVar.f1418a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jiVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1417a.m831a(jiVar.f1417a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jiVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1421b.equals(jiVar.f1421b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jiVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1422c.equals(jiVar.f1422c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jiVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1423d.equals(jiVar.f1423d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jiVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1424e.equals(jiVar.f1424e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jiVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1425f.equals(jiVar.f1425f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jiVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1426g.equals(jiVar.f1426g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jiVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1427h.equals(jiVar.f1427h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jiVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1428i.equals(jiVar.f1428i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jiVar.k();
        if ((k2 || k3) && (!k2 || !k3 || this.f1420a != jiVar.f1420a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jiVar.l();
        if (l2 || l3) {
            return l2 && l3 && this.f1416a == jiVar.f1416a;
        }
        return true;
    }
}
