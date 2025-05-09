package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fu implements jn<fu, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public byte f997a;

    /* renamed from: a  reason: collision with other field name */
    public int f998a;

    /* renamed from: a  reason: collision with other field name */
    public String f999a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1000a = new BitSet(6);

    /* renamed from: b  reason: collision with other field name */
    public int f1001b;

    /* renamed from: b  reason: collision with other field name */
    public String f1002b;

    /* renamed from: c  reason: collision with other field name */
    public int f1003c;

    /* renamed from: c  reason: collision with other field name */
    public String f1004c;

    /* renamed from: d  reason: collision with other field name */
    public int f1005d;

    /* renamed from: d  reason: collision with other field name */
    public String f1006d;

    /* renamed from: e  reason: collision with other field name */
    public int f1007e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f996a = new kd("StatsEvent");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14886a = new jv("", (byte) 3, 1);
    private static final jv b = new jv("", (byte) 8, 2);
    private static final jv c = new jv("", (byte) 8, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 8, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 8, 9);
    private static final jv j = new jv("", (byte) 8, 10);

    /* renamed from: a */
    public int compareTo(fu fuVar) {
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
        if (!getClass().equals(fuVar.getClass())) {
            return getClass().getName().compareTo(fuVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m694a()).compareTo(Boolean.valueOf(fuVar.m694a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m694a() && (a11 = jo.a(this.f997a, fuVar.f997a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fuVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = jo.a(this.f998a, fuVar.f998a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fuVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jo.a(this.f1001b, fuVar.f1001b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(fuVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f999a, fuVar.f999a)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(fuVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f1002b, fuVar.f1002b)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(fuVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f1003c, fuVar.f1003c)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(fuVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f1004c, fuVar.f1004c)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(fuVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f1006d, fuVar.f1006d)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(fuVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f1005d, fuVar.f1005d)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(fuVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jo.a(this.f1007e, fuVar.f1007e)) == 0) {
            return 0;
        }
        return a2;
    }

    public fu b(int i2) {
        this.f1001b = i2;
        c(true);
        return this;
    }

    public fu c(int i2) {
        this.f1003c = i2;
        d(true);
        return this;
    }

    public fu d(int i2) {
        this.f1005d = i2;
        e(true);
        return this;
    }

    public void e(boolean z) {
        this.f1000a.set(4, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fu)) {
            return m695a((fu) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f1000a.set(5, z);
    }

    public boolean g() {
        if (this.f1004c != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1006d != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f1000a.get(4);
    }

    public boolean j() {
        return this.f1000a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(chid:");
        sb.append((int) this.f997a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f998a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f1001b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f999a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f1002b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f1003c);
        }
        if (g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f1004c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f1006d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f1005d);
        }
        if (j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f1007e);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public fu a(byte b2) {
        this.f997a = b2;
        a(true);
        return this;
    }

    public fu b(String str) {
        this.f1002b = str;
        return this;
    }

    public fu c(String str) {
        this.f1004c = str;
        return this;
    }

    public fu d(String str) {
        this.f1006d = str;
        return this;
    }

    public boolean e() {
        return this.f1002b != null;
    }

    public boolean f() {
        return this.f1000a.get(3);
    }

    public fu a(int i2) {
        this.f998a = i2;
        b(true);
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f996a);
        jyVar.a(f14886a);
        jyVar.a(this.f997a);
        jyVar.b();
        jyVar.a(b);
        jyVar.mo941a(this.f998a);
        jyVar.b();
        jyVar.a(c);
        jyVar.mo941a(this.f1001b);
        jyVar.b();
        if (this.f999a != null) {
            jyVar.a(d);
            jyVar.a(this.f999a);
            jyVar.b();
        }
        if (this.f1002b != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f1002b);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.mo941a(this.f1003c);
            jyVar.b();
        }
        if (this.f1004c != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1004c);
            jyVar.b();
        }
        if (this.f1006d != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1006d);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.mo941a(this.f1005d);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.mo941a(this.f1007e);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1000a.set(2, z);
    }

    public void d(boolean z) {
        this.f1000a.set(3, z);
    }

    public fu a(String str) {
        this.f999a = str;
        return this;
    }

    public void b(boolean z) {
        this.f1000a.set(1, z);
    }

    public boolean c() {
        return this.f1000a.get(2);
    }

    public boolean d() {
        return this.f999a != null;
    }

    public void a() {
        if (this.f999a == null) {
            throw new jz("Required field 'connpt' was not present! Struct: " + toString());
        }
    }

    public boolean b() {
        return this.f1000a.get(1);
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                if (!m694a()) {
                    throw new jz("Required field 'chid' was not found in serialized data! Struct: " + toString());
                } else if (!b()) {
                    throw new jz("Required field 'type' was not found in serialized data! Struct: " + toString());
                } else if (c()) {
                    a();
                    return;
                } else {
                    throw new jz("Required field 'value' was not found in serialized data! Struct: " + toString());
                }
            } else {
                switch (a2.f1470a) {
                    case 1:
                        if (b2 == 3) {
                            this.f997a = jyVar.mo957a();
                            a(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 2:
                        if (b2 == 8) {
                            this.f998a = jyVar.m943a();
                            b(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 3:
                        if (b2 == 8) {
                            this.f1001b = jyVar.m943a();
                            c(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 4:
                        if (b2 == 11) {
                            this.f999a = jyVar.m950a();
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 5:
                        if (b2 == 11) {
                            this.f1002b = jyVar.m950a();
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 6:
                        if (b2 == 8) {
                            this.f1003c = jyVar.m943a();
                            d(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 7:
                        if (b2 == 11) {
                            this.f1004c = jyVar.m950a();
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 8:
                        if (b2 == 11) {
                            this.f1006d = jyVar.m950a();
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 9:
                        if (b2 == 8) {
                            this.f1005d = jyVar.m943a();
                            e(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 10:
                        if (b2 == 8) {
                            this.f1007e = jyVar.m943a();
                            f(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
    }

    public void a(boolean z) {
        this.f1000a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m694a() {
        return this.f1000a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m695a(fu fuVar) {
        if (fuVar == null || this.f997a != fuVar.f997a || this.f998a != fuVar.f998a || this.f1001b != fuVar.f1001b) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = fuVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f999a.equals(fuVar.f999a))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = fuVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1002b.equals(fuVar.f1002b))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = fuVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f1003c != fuVar.f1003c)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = fuVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1004c.equals(fuVar.f1004c))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = fuVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1006d.equals(fuVar.f1006d))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = fuVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f1005d != fuVar.f1005d)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = fuVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f1007e == fuVar.f1007e;
        }
        return true;
    }
}
