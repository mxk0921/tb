package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jg implements jn<jg, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ir f1396a;

    /* renamed from: a  reason: collision with other field name */
    public String f1397a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f1398a;

    /* renamed from: b  reason: collision with other field name */
    public String f1399b;

    /* renamed from: c  reason: collision with other field name */
    public String f1400c;

    /* renamed from: d  reason: collision with other field name */
    public String f1401d;

    /* renamed from: e  reason: collision with other field name */
    public String f1402e;

    /* renamed from: f  reason: collision with other field name */
    public String f1403f;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1395a = new kd("XmPushActionSubscription");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14977a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 15, 8);

    /* renamed from: a */
    public int compareTo(jg jgVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(jgVar.getClass())) {
            return getClass().getName().compareTo(jgVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m911a()).compareTo(Boolean.valueOf(jgVar.m911a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m911a() && (a9 = jo.a(this.f1397a, jgVar.f1397a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jgVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = jo.a(this.f1396a, jgVar.f1396a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jgVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = jo.a(this.f1399b, jgVar.f1399b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jgVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = jo.a(this.f1400c, jgVar.f1400c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jgVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = jo.a(this.f1401d, jgVar.f1401d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jgVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = jo.a(this.f1402e, jgVar.f1402e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jgVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = jo.a(this.f1403f, jgVar.f1403f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jgVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a2 = jo.a(this.f1398a, jgVar.f1398a)) == 0) {
            return 0;
        }
        return a2;
    }

    public jg b(String str) {
        this.f1400c = str;
        return this;
    }

    public jg c(String str) {
        this.f1401d = str;
        return this;
    }

    public jg d(String str) {
        this.f1402e = str;
        return this;
    }

    public jg e(String str) {
        this.f1403f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jg)) {
            return m912a((jg) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1402e != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1403f != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1398a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (m911a()) {
            sb.append("debug:");
            String str = this.f1397a;
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
            ir irVar = this.f1396a;
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
        String str2 = this.f1399b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1400c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f1401d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f1402e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f1403f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f1398a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public jg a(String str) {
        this.f1399b = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1395a);
        if (this.f1397a != null && m911a()) {
            jyVar.a(f14977a);
            jyVar.a(this.f1397a);
            jyVar.b();
        }
        if (this.f1396a != null && b()) {
            jyVar.a(b);
            this.f1396a.b(jyVar);
            jyVar.b();
        }
        if (this.f1399b != null) {
            jyVar.a(c);
            jyVar.a(this.f1399b);
            jyVar.b();
        }
        if (this.f1400c != null) {
            jyVar.a(d);
            jyVar.a(this.f1400c);
            jyVar.b();
        }
        if (this.f1401d != null) {
            jyVar.a(e);
            jyVar.a(this.f1401d);
            jyVar.b();
        }
        if (this.f1402e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1402e);
            jyVar.b();
        }
        if (this.f1403f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1403f);
            jyVar.b();
        }
        if (this.f1398a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jw((byte) 11, this.f1398a.size()));
            for (String str : this.f1398a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        return this.f1399b != null;
    }

    public boolean d() {
        return this.f1400c != null;
    }

    public boolean e() {
        return this.f1401d != null;
    }

    public void a() {
        if (this.f1399b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1400c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f1401d == null) {
            throw new jz("Required field 'topic' was not present! Struct: " + toString());
        }
    }

    public boolean b() {
        return this.f1396a != null;
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
                        this.f1397a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1396a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1399b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1400c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1401d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f1402e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1403f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 15) {
                        jw a3 = jyVar.m946a();
                        this.f1398a = new ArrayList(a3.f1471a);
                        for (int i = 0; i < a3.f1471a; i++) {
                            this.f1398a.add(jyVar.m950a());
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
    public boolean m911a() {
        return this.f1397a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m912a(jg jgVar) {
        if (jgVar == null) {
            return false;
        }
        boolean a2 = m911a();
        boolean a3 = jgVar.m911a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1397a.equals(jgVar.f1397a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jgVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1396a.m831a(jgVar.f1396a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jgVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1399b.equals(jgVar.f1399b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jgVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1400c.equals(jgVar.f1400c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jgVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1401d.equals(jgVar.f1401d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jgVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1402e.equals(jgVar.f1402e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jgVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1403f.equals(jgVar.f1403f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jgVar.h();
        if (h2 || h3) {
            return h2 && h3 && this.f1398a.equals(jgVar.f1398a);
        }
        return true;
    }
}
