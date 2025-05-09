package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class in implements jn<in, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f1170a;

    /* renamed from: a  reason: collision with other field name */
    public long f1171a;

    /* renamed from: a  reason: collision with other field name */
    public String f1172a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1173a = new BitSet(6);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1174a;

    /* renamed from: b  reason: collision with other field name */
    public int f1175b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f1176b;

    /* renamed from: c  reason: collision with other field name */
    public int f1177c;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1169a = new kd("OnlineConfigItem");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14957a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 8, 2);
    private static final jv c = new jv("", (byte) 2, 3);
    private static final jv d = new jv("", (byte) 8, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 2, 7);

    public int a() {
        return this.f1170a;
    }

    public int b() {
        return this.f1175b;
    }

    public int c() {
        return this.f1177c;
    }

    public void d(boolean z) {
        this.f1173a.set(3, z);
    }

    public void e(boolean z) {
        this.f1173a.set(4, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof in)) {
            return m808a((in) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f1173a.set(5, z);
    }

    public boolean g() {
        return this.f1176b;
    }

    public boolean h() {
        return this.f1173a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m807a()) {
            sb.append("key:");
            sb.append(this.f1170a);
            z = false;
        } else {
            z = true;
        }
        if (m809b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f1175b);
            z = false;
        }
        if (m810c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f1174a);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f1177c);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f1171a);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f1172a;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
        } else {
            z2 = z;
        }
        if (h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f1176b);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    /* renamed from: a */
    public int compareTo(in inVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(inVar.getClass())) {
            return getClass().getName().compareTo(inVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m807a()).compareTo(Boolean.valueOf(inVar.m807a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m807a() && (a8 = jo.a(this.f1170a, inVar.f1170a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(m809b()).compareTo(Boolean.valueOf(inVar.m809b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m809b() && (a7 = jo.a(this.f1175b, inVar.f1175b)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(m810c()).compareTo(Boolean.valueOf(inVar.m810c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m810c() && (a6 = jo.a(this.f1174a, inVar.f1174a)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(inVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = jo.a(this.f1177c, inVar.f1177c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(inVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = jo.a(this.f1171a, inVar.f1171a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(inVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = jo.a(this.f1172a, inVar.f1172a)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(inVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!h() || (a2 = jo.a(this.f1176b, inVar.f1176b)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m806a();
        jyVar.a(f1169a);
        if (m807a()) {
            jyVar.a(f14957a);
            jyVar.mo941a(this.f1170a);
            jyVar.b();
        }
        if (m809b()) {
            jyVar.a(b);
            jyVar.mo941a(this.f1175b);
            jyVar.b();
        }
        if (m810c()) {
            jyVar.a(c);
            jyVar.a(this.f1174a);
            jyVar.b();
        }
        if (d()) {
            jyVar.a(d);
            jyVar.mo941a(this.f1177c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f1171a);
            jyVar.b();
        }
        if (this.f1172a != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1172a);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(g);
            jyVar.a(this.f1176b);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1173a.set(2, z);
    }

    public boolean d() {
        return this.f1173a.get(3);
    }

    public boolean e() {
        return this.f1173a.get(4);
    }

    public boolean f() {
        return this.f1172a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m804a() {
        return this.f1171a;
    }

    public void b(boolean z) {
        this.f1173a.set(1, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m810c() {
        return this.f1173a.get(2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m805a() {
        return this.f1172a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m809b() {
        return this.f1173a.get(1);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m806a() {
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                m806a();
                return;
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 8) {
                        this.f1170a = jyVar.m943a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 8) {
                        this.f1175b = jyVar.m943a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 2) {
                        this.f1174a = jyVar.m954a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 8) {
                        this.f1177c = jyVar.m943a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f1171a = jyVar.m944a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f1172a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 2) {
                        this.f1176b = jyVar.m954a();
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

    public void a(boolean z) {
        this.f1173a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m807a() {
        return this.f1173a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m808a(in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean a2 = m807a();
        boolean a3 = inVar.m807a();
        if ((a2 || a3) && (!a2 || !a3 || this.f1170a != inVar.f1170a)) {
            return false;
        }
        boolean b2 = m809b();
        boolean b3 = inVar.m809b();
        if ((b2 || b3) && (!b2 || !b3 || this.f1175b != inVar.f1175b)) {
            return false;
        }
        boolean c2 = m810c();
        boolean c3 = inVar.m810c();
        if ((c2 || c3) && (!c2 || !c3 || this.f1174a != inVar.f1174a)) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = inVar.d();
        if ((d2 || d3) && (!d2 || !d3 || this.f1177c != inVar.f1177c)) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = inVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f1171a != inVar.f1171a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = inVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1172a.equals(inVar.f1172a))) {
            return false;
        }
        boolean h = h();
        boolean h2 = inVar.h();
        if (h || h2) {
            return h && h2 && this.f1176b == inVar.f1176b;
        }
        return true;
    }
}
