package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ix implements jn<ix, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1276a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1277a;

    /* renamed from: a  reason: collision with other field name */
    public String f1278a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f1280a;

    /* renamed from: b  reason: collision with other field name */
    public String f1282b;

    /* renamed from: c  reason: collision with other field name */
    public String f1283c;

    /* renamed from: d  reason: collision with other field name */
    public String f1284d;

    /* renamed from: e  reason: collision with other field name */
    public String f1285e;

    /* renamed from: f  reason: collision with other field name */
    public String f1286f;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1275a = new kd("XmPushActionCommandResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14967a = new jv("", (byte) 12, 2);
    private static final jv b = new jv("", (byte) 11, 3);
    private static final jv c = new jv("", (byte) 11, 4);
    private static final jv d = new jv("", (byte) 11, 5);
    private static final jv e = new jv("", (byte) 10, 7);
    private static final jv f = new jv("", (byte) 11, 8);
    private static final jv g = new jv("", (byte) 11, 9);
    private static final jv h = new jv("", (byte) 15, 10);
    private static final jv i = new jv("", (byte) 11, 12);
    private static final jv j = new jv("", (byte) 2, 13);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1279a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1281a = true;

    /* renamed from: a */
    public int compareTo(ix ixVar) {
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
        if (!getClass().equals(ixVar.getClass())) {
            return getClass().getName().compareTo(ixVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m849a()).compareTo(Boolean.valueOf(ixVar.m849a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m849a() && (a11 = jo.a(this.f1277a, ixVar.f1277a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m851b()).compareTo(Boolean.valueOf(ixVar.m851b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m851b() && (a10 = jo.a(this.f1278a, ixVar.f1278a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(m852c()).compareTo(Boolean.valueOf(ixVar.m852c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m852c() && (a9 = jo.a(this.f1282b, ixVar.f1282b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ixVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f1283c, ixVar.f1283c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ixVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f1276a, ixVar.f1276a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ixVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f1284d, ixVar.f1284d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ixVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f1285e, ixVar.f1285e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ixVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f1280a, ixVar.f1280a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ixVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f1286f, ixVar.f1286f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ixVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jo.a(this.f1281a, ixVar.f1281a)) == 0) {
            return 0;
        }
        return a2;
    }

    public String b() {
        return this.f1283c;
    }

    public String c() {
        return this.f1286f;
    }

    public boolean d() {
        if (this.f1283c != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f1279a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ix)) {
            return m850a((ix) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1284d != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1285e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1280a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1286f != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return this.f1279a.get(1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m849a()) {
            sb.append("target:");
            ir irVar = this.f1277a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f1278a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f1282b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f1283c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f1276a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f1284d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f1285e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f1280a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f1286f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f1281a);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public String a() {
        return this.f1278a;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m848a();
        jyVar.a(f1275a);
        if (this.f1277a != null && m849a()) {
            jyVar.a(f14967a);
            this.f1277a.b(jyVar);
            jyVar.b();
        }
        if (this.f1278a != null) {
            jyVar.a(b);
            jyVar.a(this.f1278a);
            jyVar.b();
        }
        if (this.f1282b != null) {
            jyVar.a(c);
            jyVar.a(this.f1282b);
            jyVar.b();
        }
        if (this.f1283c != null) {
            jyVar.a(d);
            jyVar.a(this.f1283c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f1276a);
        jyVar.b();
        if (this.f1284d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1284d);
            jyVar.b();
        }
        if (this.f1285e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1285e);
            jyVar.b();
        }
        if (this.f1280a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jw((byte) 11, this.f1280a.size()));
            for (String str : this.f1280a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        if (this.f1286f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1286f);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.a(this.f1281a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m852c() {
        return this.f1282b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public List<String> m847a() {
        return this.f1280a;
    }

    public void b(boolean z) {
        this.f1279a.set(1, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m848a() {
        if (this.f1278a == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1282b == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f1283c == null) {
            throw new jz("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m851b() {
        return this.f1278a != null;
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
                    m848a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (a2.f1470a) {
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1277a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1278a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1282b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1283c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f1276a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1284d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1285e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 15) {
                        jw a3 = jyVar.m946a();
                        this.f1280a = new ArrayList(a3.f1471a);
                        for (int i2 = 0; i2 < a3.f1471a; i2++) {
                            this.f1280a.add(jyVar.m950a());
                        }
                        jyVar.i();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f1286f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (b2 == 2) {
                        this.f1281a = jyVar.m954a();
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

    public void a(boolean z) {
        this.f1279a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m849a() {
        return this.f1277a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m850a(ix ixVar) {
        if (ixVar == null) {
            return false;
        }
        boolean a2 = m849a();
        boolean a3 = ixVar.m849a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1277a.m831a(ixVar.f1277a))) {
            return false;
        }
        boolean b2 = m851b();
        boolean b3 = ixVar.m851b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1278a.equals(ixVar.f1278a))) {
            return false;
        }
        boolean c2 = m852c();
        boolean c3 = ixVar.m852c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1282b.equals(ixVar.f1282b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ixVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f1283c.equals(ixVar.f1283c))) || this.f1276a != ixVar.f1276a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ixVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1284d.equals(ixVar.f1284d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ixVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1285e.equals(ixVar.f1285e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ixVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1280a.equals(ixVar.f1280a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ixVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1286f.equals(ixVar.f1286f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ixVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f1281a == ixVar.f1281a;
        }
        return true;
    }
}
