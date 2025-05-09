package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ig implements jn<ig, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1139a;

    /* renamed from: a  reason: collision with other field name */
    public String f1140a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1141a = new BitSet(3);

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f1142a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f1143a;

    /* renamed from: b  reason: collision with other field name */
    public long f1144b;

    /* renamed from: b  reason: collision with other field name */
    public String f1145b;

    /* renamed from: c  reason: collision with other field name */
    public String f1146c;

    /* renamed from: d  reason: collision with other field name */
    public String f1147d;

    /* renamed from: e  reason: collision with other field name */
    public String f1148e;

    /* renamed from: f  reason: collision with other field name */
    public String f1149f;

    /* renamed from: g  reason: collision with other field name */
    public String f1150g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1138a = new kd("ClientUploadDataItem");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14950a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 10, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 2, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 13, 10);
    private static final jv k = new jv("", (byte) 11, 11);

    /* renamed from: a */
    public int compareTo(ig igVar) {
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
        if (!getClass().equals(igVar.getClass())) {
            return getClass().getName().compareTo(igVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m791a()).compareTo(Boolean.valueOf(igVar.m791a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m791a() && (a12 = jo.a(this.f1140a, igVar.f1140a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(m793b()).compareTo(Boolean.valueOf(igVar.m793b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m793b() && (a11 = jo.a(this.f1145b, igVar.f1145b)) != 0) {
            return a11;
        }
        int compareTo3 = Boolean.valueOf(m794c()).compareTo(Boolean.valueOf(igVar.m794c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m794c() && (a10 = jo.a(this.f1146c, igVar.f1146c)) != 0) {
            return a10;
        }
        int compareTo4 = Boolean.valueOf(m795d()).compareTo(Boolean.valueOf(igVar.m795d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m795d() && (a9 = jo.a(this.f1139a, igVar.f1139a)) != 0) {
            return a9;
        }
        int compareTo5 = Boolean.valueOf(m796e()).compareTo(Boolean.valueOf(igVar.m796e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m796e() && (a8 = jo.a(this.f1144b, igVar.f1144b)) != 0) {
            return a8;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(igVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a7 = jo.a(this.f1143a, igVar.f1143a)) != 0) {
            return a7;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(igVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a6 = jo.a(this.f1147d, igVar.f1147d)) != 0) {
            return a6;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(igVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a5 = jo.a(this.f1148e, igVar.f1148e)) != 0) {
            return a5;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(igVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a4 = jo.a(this.f1149f, igVar.f1149f)) != 0) {
            return a4;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(igVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a3 = jo.a(this.f1142a, igVar.f1142a)) != 0) {
            return a3;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(igVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (!k() || (a2 = jo.a(this.f1150g, igVar.f1150g)) == 0) {
            return 0;
        }
        return a2;
    }

    public ig b(long j2) {
        this.f1144b = j2;
        b(true);
        return this;
    }

    public ig c(String str) {
        this.f1146c = str;
        return this;
    }

    public ig d(String str) {
        this.f1147d = str;
        return this;
    }

    public ig e(String str) {
        this.f1148e = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ig)) {
            return m792a((ig) obj);
        }
        return false;
    }

    public ig f(String str) {
        this.f1149f = str;
        return this;
    }

    public ig g(String str) {
        this.f1150g = str;
        return this;
    }

    public boolean h() {
        if (this.f1148e != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1149f != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f1142a != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f1150g != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (m791a()) {
            sb.append("channel:");
            String str = this.f1140a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m793b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f1145b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m794c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f1146c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m795d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f1139a);
            z = false;
        }
        if (m796e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f1144b);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f1143a);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f1147d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f1148e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f1149f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f1142a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f1150g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public long a() {
        return this.f1144b;
    }

    public ig b(String str) {
        this.f1145b = str;
        return this;
    }

    public String c() {
        return this.f1148e;
    }

    public String d() {
        return this.f1149f;
    }

    public String e() {
        return this.f1150g;
    }

    public boolean f() {
        return this.f1141a.get(2);
    }

    public boolean g() {
        return this.f1147d != null;
    }

    public ig a(long j2) {
        this.f1139a = j2;
        m790a(true);
        return this;
    }

    public String b() {
        return this.f1146c;
    }

    public void c(boolean z) {
        this.f1141a.set(2, z);
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m795d() {
        return this.f1141a.get(0);
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m796e() {
        return this.f1141a.get(1);
    }

    public ig a(String str) {
        this.f1140a = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m789a();
        jyVar.a(f1138a);
        if (this.f1140a != null && m791a()) {
            jyVar.a(f14950a);
            jyVar.a(this.f1140a);
            jyVar.b();
        }
        if (this.f1145b != null && m793b()) {
            jyVar.a(b);
            jyVar.a(this.f1145b);
            jyVar.b();
        }
        if (this.f1146c != null && m794c()) {
            jyVar.a(c);
            jyVar.a(this.f1146c);
            jyVar.b();
        }
        if (m795d()) {
            jyVar.a(d);
            jyVar.a(this.f1139a);
            jyVar.b();
        }
        if (m796e()) {
            jyVar.a(e);
            jyVar.a(this.f1144b);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.a(this.f1143a);
            jyVar.b();
        }
        if (this.f1147d != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1147d);
            jyVar.b();
        }
        if (this.f1148e != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1148e);
            jyVar.b();
        }
        if (this.f1149f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1149f);
            jyVar.b();
        }
        if (this.f1142a != null && j()) {
            jyVar.a(j);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1142a.size()));
            for (Map.Entry<String, String> entry : this.f1142a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f1150g != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f1150g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m794c() {
        return this.f1146c != null;
    }

    public ig a(Map<String, String> map) {
        this.f1142a = map;
        return this;
    }

    public void b(boolean z) {
        this.f1141a.set(1, z);
    }

    public ig a(boolean z) {
        this.f1143a = z;
        c(true);
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m793b() {
        return this.f1145b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m787a() {
        return this.f1140a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m788a() {
        return this.f1142a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m789a() {
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                m789a();
                return;
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1140a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 11) {
                        this.f1145b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1146c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 10) {
                        this.f1139a = jyVar.m944a();
                        m790a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f1144b = jyVar.m944a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 2) {
                        this.f1143a = jyVar.m954a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1147d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1148e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1149f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        jx a3 = jyVar.m947a();
                        this.f1142a = new HashMap(a3.f1472a * 2);
                        for (int i2 = 0; i2 < a3.f1472a; i2++) {
                            this.f1142a.put(jyVar.m950a(), jyVar.m950a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f1150g = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, b2);
            jyVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f1142a == null) {
            this.f1142a = new HashMap();
        }
        this.f1142a.put(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m790a(boolean z) {
        this.f1141a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m791a() {
        return this.f1140a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m792a(ig igVar) {
        if (igVar == null) {
            return false;
        }
        boolean a2 = m791a();
        boolean a3 = igVar.m791a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1140a.equals(igVar.f1140a))) {
            return false;
        }
        boolean b2 = m793b();
        boolean b3 = igVar.m793b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1145b.equals(igVar.f1145b))) {
            return false;
        }
        boolean c2 = m794c();
        boolean c3 = igVar.m794c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1146c.equals(igVar.f1146c))) {
            return false;
        }
        boolean d2 = m795d();
        boolean d3 = igVar.m795d();
        if ((d2 || d3) && (!d2 || !d3 || this.f1139a != igVar.f1139a)) {
            return false;
        }
        boolean e2 = m796e();
        boolean e3 = igVar.m796e();
        if ((e2 || e3) && (!e2 || !e3 || this.f1144b != igVar.f1144b)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = igVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f1143a != igVar.f1143a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = igVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1147d.equals(igVar.f1147d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = igVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1148e.equals(igVar.f1148e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = igVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1149f.equals(igVar.f1149f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = igVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1142a.equals(igVar.f1142a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = igVar.k();
        if (k2 || k3) {
            return k2 && k3 && this.f1150g.equals(igVar.f1150g);
        }
        return true;
    }
}
