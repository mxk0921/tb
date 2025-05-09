package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jj implements jn<jj, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1430a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1431a;

    /* renamed from: a  reason: collision with other field name */
    public String f1432a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1433a = new BitSet(3);

    /* renamed from: b  reason: collision with other field name */
    public long f1434b;

    /* renamed from: b  reason: collision with other field name */
    public String f1435b;

    /* renamed from: c  reason: collision with other field name */
    public long f1436c;

    /* renamed from: c  reason: collision with other field name */
    public String f1437c;

    /* renamed from: d  reason: collision with other field name */
    public String f1438d;

    /* renamed from: e  reason: collision with other field name */
    public String f1439e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1429a = new kd("XmPushActionUnRegistrationResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14980a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 10, 9);
    private static final jv i = new jv("", (byte) 10, 10);

    /* renamed from: a */
    public int compareTo(jj jjVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jjVar.getClass())) {
            return getClass().getName().compareTo(jjVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m921a()).compareTo(Boolean.valueOf(jjVar.m921a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m921a() && (a10 = jo.a(this.f1432a, jjVar.f1432a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jjVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a9 = jo.a(this.f1431a, jjVar.f1431a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jjVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a8 = jo.a(this.f1435b, jjVar.f1435b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jjVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jo.a(this.f1437c, jjVar.f1437c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jjVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jo.a(this.f1430a, jjVar.f1430a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jjVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jo.a(this.f1438d, jjVar.f1438d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jjVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jo.a(this.f1439e, jjVar.f1439e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jjVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jo.a(this.f1434b, jjVar.f1434b)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jjVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = jo.a(this.f1436c, jjVar.f1436c)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m920a();
        jyVar.a(f1429a);
        if (this.f1432a != null && m921a()) {
            jyVar.a(f14980a);
            jyVar.a(this.f1432a);
            jyVar.b();
        }
        if (this.f1431a != null && b()) {
            jyVar.a(b);
            this.f1431a.b(jyVar);
            jyVar.b();
        }
        if (this.f1435b != null) {
            jyVar.a(c);
            jyVar.a(this.f1435b);
            jyVar.b();
        }
        if (this.f1437c != null) {
            jyVar.a(d);
            jyVar.a(this.f1437c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f1430a);
        jyVar.b();
        if (this.f1438d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1438d);
            jyVar.b();
        }
        if (this.f1439e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1439e);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(h);
            jyVar.a(this.f1434b);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.a(this.f1436c);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1433a.set(2, z);
    }

    public boolean d() {
        if (this.f1437c != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f1433a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jj)) {
            return m922a((jj) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1438d != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1439e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.f1433a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f1433a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (m921a()) {
            sb.append("debug:");
            String str = this.f1432a;
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
            ir irVar = this.f1431a;
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
        String str2 = this.f1435b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1437c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f1430a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f1438d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f1439e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f1434b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f1436c);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public String a() {
        return this.f1439e;
    }

    public void b(boolean z) {
        this.f1433a.set(1, z);
    }

    public boolean c() {
        return this.f1435b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m920a() {
        if (this.f1435b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1437c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    public boolean b() {
        return this.f1431a != null;
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
                    m920a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1432a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1431a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1435b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1437c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f1430a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1438d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1439e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 10) {
                        this.f1434b = jyVar.m944a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 10) {
                        this.f1436c = jyVar.m944a();
                        c(true);
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
        this.f1433a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m921a() {
        return this.f1432a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m922a(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        boolean a2 = m921a();
        boolean a3 = jjVar.m921a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1432a.equals(jjVar.f1432a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jjVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1431a.m831a(jjVar.f1431a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jjVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1435b.equals(jjVar.f1435b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jjVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f1437c.equals(jjVar.f1437c))) || this.f1430a != jjVar.f1430a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jjVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1438d.equals(jjVar.f1438d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jjVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1439e.equals(jjVar.f1439e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jjVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f1434b != jjVar.f1434b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jjVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f1436c == jjVar.f1436c;
        }
        return true;
    }
}
