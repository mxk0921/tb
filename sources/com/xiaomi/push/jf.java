package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jf implements jn<jf, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public io f1382a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1383a;

    /* renamed from: a  reason: collision with other field name */
    public String f1384a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f1386a;

    /* renamed from: b  reason: collision with other field name */
    public String f1388b;

    /* renamed from: c  reason: collision with other field name */
    public String f1389c;

    /* renamed from: d  reason: collision with other field name */
    public String f1390d;

    /* renamed from: e  reason: collision with other field name */
    public String f1391e;

    /* renamed from: f  reason: collision with other field name */
    public String f1392f;

    /* renamed from: g  reason: collision with other field name */
    public String f1393g;

    /* renamed from: h  reason: collision with other field name */
    public String f1394h;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1381a = new kd("XmPushActionSendMessage");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14976a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 12, 8);
    private static final jv i = new jv("", (byte) 2, 9);
    private static final jv j = new jv("", (byte) 13, 10);
    private static final jv k = new jv("", (byte) 11, 11);
    private static final jv l = new jv("", (byte) 11, 12);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1385a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1387a = true;

    /* renamed from: a */
    public int compareTo(jf jfVar) {
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
        if (!getClass().equals(jfVar.getClass())) {
            return getClass().getName().compareTo(jfVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m904a()).compareTo(Boolean.valueOf(jfVar.m904a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m904a() && (a13 = jo.a(this.f1384a, jfVar.f1384a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(m906b()).compareTo(Boolean.valueOf(jfVar.m906b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m906b() && (a12 = jo.a(this.f1383a, jfVar.f1383a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(m907c()).compareTo(Boolean.valueOf(jfVar.m907c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m907c() && (a11 = jo.a(this.f1388b, jfVar.f1388b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(m908d()).compareTo(Boolean.valueOf(jfVar.m908d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m908d() && (a10 = jo.a(this.f1389c, jfVar.f1389c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(m909e()).compareTo(Boolean.valueOf(jfVar.m909e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m909e() && (a9 = jo.a(this.f1390d, jfVar.f1390d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(m910f()).compareTo(Boolean.valueOf(jfVar.m910f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m910f() && (a8 = jo.a(this.f1391e, jfVar.f1391e)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jfVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a7 = jo.a(this.f1392f, jfVar.f1392f)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jfVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a6 = jo.a(this.f1382a, jfVar.f1382a)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jfVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a5 = jo.a(this.f1387a, jfVar.f1387a)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jfVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a4 = jo.a(this.f1386a, jfVar.f1386a)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jfVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a3 = jo.a(this.f1393g, jfVar.f1393g)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jfVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!l() || (a2 = jo.a(this.f1394h, jfVar.f1394h)) == 0) {
            return 0;
        }
        return a2;
    }

    public String b() {
        return this.f1389c;
    }

    public String c() {
        return this.f1391e;
    }

    public String d() {
        return this.f1392f;
    }

    public String e() {
        return this.f1393g;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jf)) {
            return m905a((jf) obj);
        }
        return false;
    }

    public String f() {
        return this.f1394h;
    }

    public boolean g() {
        if (this.f1392f != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1382a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f1385a.get(0);
    }

    public boolean j() {
        if (this.f1386a != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f1393g != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.f1394h != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (m904a()) {
            sb.append("debug:");
            String str = this.f1384a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m906b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1383a;
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
        String str2 = this.f1388b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1389c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m909e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f1390d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m910f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f1391e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f1392f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("message:");
            io ioVar = this.f1382a;
            if (ioVar == null) {
                sb.append("null");
            } else {
                sb.append(ioVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f1387a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f1386a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f1393g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f1394h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public io a() {
        return this.f1382a;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m903a();
        jyVar.a(f1381a);
        if (this.f1384a != null && m904a()) {
            jyVar.a(f14976a);
            jyVar.a(this.f1384a);
            jyVar.b();
        }
        if (this.f1383a != null && m906b()) {
            jyVar.a(b);
            this.f1383a.b(jyVar);
            jyVar.b();
        }
        if (this.f1388b != null) {
            jyVar.a(c);
            jyVar.a(this.f1388b);
            jyVar.b();
        }
        if (this.f1389c != null) {
            jyVar.a(d);
            jyVar.a(this.f1389c);
            jyVar.b();
        }
        if (this.f1390d != null && m909e()) {
            jyVar.a(e);
            jyVar.a(this.f1390d);
            jyVar.b();
        }
        if (this.f1391e != null && m910f()) {
            jyVar.a(f);
            jyVar.a(this.f1391e);
            jyVar.b();
        }
        if (this.f1392f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1392f);
            jyVar.b();
        }
        if (this.f1382a != null && h()) {
            jyVar.a(h);
            this.f1382a.b(jyVar);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.a(this.f1387a);
            jyVar.b();
        }
        if (this.f1386a != null && j()) {
            jyVar.a(j);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1386a.size()));
            for (Map.Entry<String, String> entry : this.f1386a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f1393g != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f1393g);
            jyVar.b();
        }
        if (this.f1394h != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f1394h);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m907c() {
        return this.f1388b != null;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m908d() {
        return this.f1389c != null;
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m909e() {
        return this.f1390d != null;
    }

    /* renamed from: f  reason: collision with other method in class */
    public boolean m910f() {
        return this.f1391e != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m902a() {
        return this.f1388b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m906b() {
        return this.f1383a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m903a() {
        if (this.f1388b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1389c == null) {
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
                m903a();
                return;
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1384a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1383a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1388b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1389c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1390d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f1391e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1392f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        io ioVar = new io();
                        this.f1382a = ioVar;
                        ioVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 2) {
                        this.f1387a = jyVar.m954a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        jx a3 = jyVar.m947a();
                        this.f1386a = new HashMap(a3.f1472a * 2);
                        for (int i2 = 0; i2 < a3.f1472a; i2++) {
                            this.f1386a.put(jyVar.m950a(), jyVar.m950a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f1393g = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f1394h = jyVar.m950a();
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
        this.f1385a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m904a() {
        return this.f1384a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m905a(jf jfVar) {
        if (jfVar == null) {
            return false;
        }
        boolean a2 = m904a();
        boolean a3 = jfVar.m904a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1384a.equals(jfVar.f1384a))) {
            return false;
        }
        boolean b2 = m906b();
        boolean b3 = jfVar.m906b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1383a.m831a(jfVar.f1383a))) {
            return false;
        }
        boolean c2 = m907c();
        boolean c3 = jfVar.m907c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1388b.equals(jfVar.f1388b))) {
            return false;
        }
        boolean d2 = m908d();
        boolean d3 = jfVar.m908d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1389c.equals(jfVar.f1389c))) {
            return false;
        }
        boolean e2 = m909e();
        boolean e3 = jfVar.m909e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1390d.equals(jfVar.f1390d))) {
            return false;
        }
        boolean f2 = m910f();
        boolean f3 = jfVar.m910f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1391e.equals(jfVar.f1391e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jfVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1392f.equals(jfVar.f1392f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jfVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1382a.m814a(jfVar.f1382a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jfVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f1387a != jfVar.f1387a)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jfVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1386a.equals(jfVar.f1386a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jfVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f1393g.equals(jfVar.f1393g))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jfVar.l();
        if (l2 || l3) {
            return l2 && l3 && this.f1394h.equals(jfVar.f1394h);
        }
        return true;
    }
}
