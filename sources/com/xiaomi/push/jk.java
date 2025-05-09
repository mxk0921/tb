package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jk implements jn<jk, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ir f1441a;

    /* renamed from: a  reason: collision with other field name */
    public String f1442a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f1443a;

    /* renamed from: b  reason: collision with other field name */
    public String f1444b;

    /* renamed from: c  reason: collision with other field name */
    public String f1445c;

    /* renamed from: d  reason: collision with other field name */
    public String f1446d;

    /* renamed from: e  reason: collision with other field name */
    public String f1447e;

    /* renamed from: f  reason: collision with other field name */
    public String f1448f;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1440a = new kd("XmPushActionUnSubscription");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14981a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 15, 8);

    /* renamed from: a */
    public int compareTo(jk jkVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(jkVar.getClass())) {
            return getClass().getName().compareTo(jkVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m923a()).compareTo(Boolean.valueOf(jkVar.m923a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m923a() && (a9 = jo.a(this.f1442a, jkVar.f1442a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jkVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = jo.a(this.f1441a, jkVar.f1441a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jkVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = jo.a(this.f1444b, jkVar.f1444b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jkVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = jo.a(this.f1445c, jkVar.f1445c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jkVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = jo.a(this.f1446d, jkVar.f1446d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jkVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = jo.a(this.f1447e, jkVar.f1447e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jkVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = jo.a(this.f1448f, jkVar.f1448f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jkVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a2 = jo.a(this.f1443a, jkVar.f1443a)) == 0) {
            return 0;
        }
        return a2;
    }

    public jk b(String str) {
        this.f1445c = str;
        return this;
    }

    public jk c(String str) {
        this.f1446d = str;
        return this;
    }

    public jk d(String str) {
        this.f1447e = str;
        return this;
    }

    public jk e(String str) {
        this.f1448f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jk)) {
            return m924a((jk) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1447e != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1448f != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1443a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (m923a()) {
            sb.append("debug:");
            String str = this.f1442a;
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
            ir irVar = this.f1441a;
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
        String str2 = this.f1444b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1445c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f1446d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f1447e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f1448f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f1443a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public jk a(String str) {
        this.f1444b = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1440a);
        if (this.f1442a != null && m923a()) {
            jyVar.a(f14981a);
            jyVar.a(this.f1442a);
            jyVar.b();
        }
        if (this.f1441a != null && b()) {
            jyVar.a(b);
            this.f1441a.b(jyVar);
            jyVar.b();
        }
        if (this.f1444b != null) {
            jyVar.a(c);
            jyVar.a(this.f1444b);
            jyVar.b();
        }
        if (this.f1445c != null) {
            jyVar.a(d);
            jyVar.a(this.f1445c);
            jyVar.b();
        }
        if (this.f1446d != null) {
            jyVar.a(e);
            jyVar.a(this.f1446d);
            jyVar.b();
        }
        if (this.f1447e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1447e);
            jyVar.b();
        }
        if (this.f1448f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1448f);
            jyVar.b();
        }
        if (this.f1443a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jw((byte) 11, this.f1443a.size()));
            for (String str : this.f1443a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        return this.f1444b != null;
    }

    public boolean d() {
        return this.f1445c != null;
    }

    public boolean e() {
        return this.f1446d != null;
    }

    public void a() {
        if (this.f1444b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1445c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f1446d == null) {
            throw new jz("Required field 'topic' was not present! Struct: " + toString());
        }
    }

    public boolean b() {
        return this.f1441a != null;
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
                        this.f1442a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1441a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1444b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1445c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1446d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f1447e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1448f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 15) {
                        jw a3 = jyVar.m946a();
                        this.f1443a = new ArrayList(a3.f1471a);
                        for (int i = 0; i < a3.f1471a; i++) {
                            this.f1443a.add(jyVar.m950a());
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

    /* renamed from: a  reason: collision with other method in class */
    public boolean m923a() {
        return this.f1442a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m924a(jk jkVar) {
        if (jkVar == null) {
            return false;
        }
        boolean a2 = m923a();
        boolean a3 = jkVar.m923a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1442a.equals(jkVar.f1442a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jkVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1441a.m831a(jkVar.f1441a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jkVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1444b.equals(jkVar.f1444b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jkVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1445c.equals(jkVar.f1445c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jkVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1446d.equals(jkVar.f1446d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jkVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1447e.equals(jkVar.f1447e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jkVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1448f.equals(jkVar.f1448f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jkVar.h();
        if (h2 || h3) {
            return h2 && h3 && this.f1443a.equals(jkVar.f1443a);
        }
        return true;
    }
}
