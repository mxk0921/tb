package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jh implements jn<jh, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1405a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1406a;

    /* renamed from: a  reason: collision with other field name */
    public String f1407a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1408a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f1409b;

    /* renamed from: c  reason: collision with other field name */
    public String f1410c;

    /* renamed from: d  reason: collision with other field name */
    public String f1411d;

    /* renamed from: e  reason: collision with other field name */
    public String f1412e;

    /* renamed from: f  reason: collision with other field name */
    public String f1413f;

    /* renamed from: g  reason: collision with other field name */
    public String f1414g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1404a = new kd("XmPushActionSubscriptionResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14978a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 11, 9);
    private static final jv i = new jv("", (byte) 11, 10);

    /* renamed from: a */
    public int compareTo(jh jhVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jhVar.getClass())) {
            return getClass().getName().compareTo(jhVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m914a()).compareTo(Boolean.valueOf(jhVar.m914a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m914a() && (a10 = jo.a(this.f1407a, jhVar.f1407a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m916b()).compareTo(Boolean.valueOf(jhVar.m916b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m916b() && (a9 = jo.a(this.f1406a, jhVar.f1406a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m917c()).compareTo(Boolean.valueOf(jhVar.m917c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m917c() && (a8 = jo.a(this.f1409b, jhVar.f1409b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jhVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jo.a(this.f1410c, jhVar.f1410c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jhVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jo.a(this.f1405a, jhVar.f1405a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jhVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jo.a(this.f1411d, jhVar.f1411d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jhVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jo.a(this.f1412e, jhVar.f1412e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jhVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jo.a(this.f1413f, jhVar.f1413f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jhVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = jo.a(this.f1414g, jhVar.f1414g)) == 0) {
            return 0;
        }
        return a2;
    }

    public String b() {
        return this.f1412e;
    }

    public String c() {
        return this.f1414g;
    }

    public boolean d() {
        if (this.f1410c != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f1408a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jh)) {
            return m915a((jh) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1411d != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1412e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1413f != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1414g != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (m914a()) {
            sb.append("debug:");
            String str = this.f1407a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m916b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1406a;
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
        String str2 = this.f1409b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f1410c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f1405a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f1411d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f1412e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f1413f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f1414g;
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
        return this.f1409b;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m913a();
        jyVar.a(f1404a);
        if (this.f1407a != null && m914a()) {
            jyVar.a(f14978a);
            jyVar.a(this.f1407a);
            jyVar.b();
        }
        if (this.f1406a != null && m916b()) {
            jyVar.a(b);
            this.f1406a.b(jyVar);
            jyVar.b();
        }
        if (this.f1409b != null) {
            jyVar.a(c);
            jyVar.a(this.f1409b);
            jyVar.b();
        }
        if (this.f1410c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f1410c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f1405a);
            jyVar.b();
        }
        if (this.f1411d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1411d);
            jyVar.b();
        }
        if (this.f1412e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1412e);
            jyVar.b();
        }
        if (this.f1413f != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1413f);
            jyVar.b();
        }
        if (this.f1414g != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1414g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m917c() {
        return this.f1409b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m913a() {
        if (this.f1409b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m916b() {
        return this.f1406a != null;
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                m913a();
                return;
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1407a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1406a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1409b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1410c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f1405a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1411d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1412e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1413f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1414g = jyVar.m950a();
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
        this.f1408a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m914a() {
        return this.f1407a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m915a(jh jhVar) {
        if (jhVar == null) {
            return false;
        }
        boolean a2 = m914a();
        boolean a3 = jhVar.m914a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1407a.equals(jhVar.f1407a))) {
            return false;
        }
        boolean b2 = m916b();
        boolean b3 = jhVar.m916b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1406a.m831a(jhVar.f1406a))) {
            return false;
        }
        boolean c2 = m917c();
        boolean c3 = jhVar.m917c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1409b.equals(jhVar.f1409b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jhVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1410c.equals(jhVar.f1410c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jhVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f1405a != jhVar.f1405a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jhVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1411d.equals(jhVar.f1411d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jhVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1412e.equals(jhVar.f1412e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jhVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1413f.equals(jhVar.f1413f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jhVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f1414g.equals(jhVar.f1414g);
        }
        return true;
    }
}
