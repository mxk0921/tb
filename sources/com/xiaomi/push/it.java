package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class it implements jn<it, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ir f1247a;

    /* renamed from: a  reason: collision with other field name */
    public String f1248a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f1250a;

    /* renamed from: b  reason: collision with other field name */
    public String f1251b;

    /* renamed from: c  reason: collision with other field name */
    public String f1252c;

    /* renamed from: d  reason: collision with other field name */
    public String f1253d;

    /* renamed from: e  reason: collision with other field name */
    public String f1254e;

    /* renamed from: f  reason: collision with other field name */
    public String f1255f;

    /* renamed from: g  reason: collision with other field name */
    public String f1256g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1245a = new kd("XmPushActionAckNotification");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14963a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 10, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 13, 9);
    private static final jv i = new jv("", (byte) 11, 10);
    private static final jv j = new jv("", (byte) 11, 11);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1249a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public long f1246a = 0;

    /* renamed from: a */
    public int compareTo(it itVar) {
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
        if (!getClass().equals(itVar.getClass())) {
            return getClass().getName().compareTo(itVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m836a()).compareTo(Boolean.valueOf(itVar.m836a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m836a() && (a11 = jo.a(this.f1248a, itVar.f1248a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m838b()).compareTo(Boolean.valueOf(itVar.m838b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m838b() && (a10 = jo.a(this.f1247a, itVar.f1247a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(itVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jo.a(this.f1251b, itVar.f1251b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(itVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f1252c, itVar.f1252c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(itVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f1253d, itVar.f1253d)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(itVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f1246a, itVar.f1246a)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(itVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f1254e, itVar.f1254e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(itVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f1250a, itVar.f1250a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(itVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f1255f, itVar.f1255f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(itVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jo.a(this.f1256g, itVar.f1256g)) == 0) {
            return 0;
        }
        return a2;
    }

    public it b(String str) {
        this.f1252c = str;
        return this;
    }

    public it c(String str) {
        this.f1253d = str;
        return this;
    }

    public it d(String str) {
        this.f1254e = str;
        return this;
    }

    public it e(String str) {
        this.f1255f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof it)) {
            return m837a((it) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f1249a.get(0);
    }

    public boolean g() {
        if (this.f1254e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1250a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1255f != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f1256g != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (m836a()) {
            sb.append("debug:");
            String str = this.f1248a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m838b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1247a;
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
        String str2 = this.f1251b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f1252c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f1253d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f1246a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f1254e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f1250a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f1255f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f1256g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public it a(long j2) {
        this.f1246a = j2;
        a(true);
        return this;
    }

    public String b() {
        return this.f1253d;
    }

    public boolean c() {
        return this.f1251b != null;
    }

    public boolean d() {
        return this.f1252c != null;
    }

    public boolean e() {
        return this.f1253d != null;
    }

    public it a(ir irVar) {
        this.f1247a = irVar;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m835a();
        jyVar.a(f1245a);
        if (this.f1248a != null && m836a()) {
            jyVar.a(f14963a);
            jyVar.a(this.f1248a);
            jyVar.b();
        }
        if (this.f1247a != null && m838b()) {
            jyVar.a(b);
            this.f1247a.b(jyVar);
            jyVar.b();
        }
        if (this.f1251b != null) {
            jyVar.a(c);
            jyVar.a(this.f1251b);
            jyVar.b();
        }
        if (this.f1252c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f1252c);
            jyVar.b();
        }
        if (this.f1253d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f1253d);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.a(this.f1246a);
            jyVar.b();
        }
        if (this.f1254e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1254e);
            jyVar.b();
        }
        if (this.f1250a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1250a.size()));
            for (Map.Entry<String, String> entry : this.f1250a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f1255f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1255f);
            jyVar.b();
        }
        if (this.f1256g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f1256g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public it a(String str) {
        this.f1251b = str;
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m838b() {
        return this.f1247a != null;
    }

    public String a() {
        return this.f1251b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m834a() {
        return this.f1250a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m835a() {
        if (this.f1251b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
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
                m835a();
                return;
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1248a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1247a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1251b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1252c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1253d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f1246a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1254e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 13) {
                        jx a3 = jyVar.m947a();
                        this.f1250a = new HashMap(a3.f1472a * 2);
                        for (int i2 = 0; i2 < a3.f1472a; i2++) {
                            this.f1250a.put(jyVar.m950a(), jyVar.m950a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1255f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f1256g = jyVar.m950a();
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
        this.f1249a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m836a() {
        return this.f1248a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m837a(it itVar) {
        if (itVar == null) {
            return false;
        }
        boolean a2 = m836a();
        boolean a3 = itVar.m836a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1248a.equals(itVar.f1248a))) {
            return false;
        }
        boolean b2 = m838b();
        boolean b3 = itVar.m838b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1247a.m831a(itVar.f1247a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = itVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1251b.equals(itVar.f1251b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = itVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1252c.equals(itVar.f1252c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = itVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1253d.equals(itVar.f1253d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = itVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f1246a != itVar.f1246a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = itVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1254e.equals(itVar.f1254e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = itVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1250a.equals(itVar.f1250a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = itVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1255f.equals(itVar.f1255f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = itVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f1256g.equals(itVar.f1256g);
        }
        return true;
    }
}
