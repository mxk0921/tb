package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class is implements jn<is, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f1224a;

    /* renamed from: a  reason: collision with other field name */
    public long f1225a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1226a;

    /* renamed from: a  reason: collision with other field name */
    public jf f1227a;

    /* renamed from: a  reason: collision with other field name */
    public String f1228a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f1230a;

    /* renamed from: a  reason: collision with other field name */
    public short f1231a;

    /* renamed from: b  reason: collision with other field name */
    public String f1233b;

    /* renamed from: b  reason: collision with other field name */
    public short f1234b;

    /* renamed from: c  reason: collision with other field name */
    public String f1235c;

    /* renamed from: d  reason: collision with other field name */
    public String f1236d;

    /* renamed from: e  reason: collision with other field name */
    public String f1237e;

    /* renamed from: f  reason: collision with other field name */
    public String f1238f;

    /* renamed from: g  reason: collision with other field name */
    public String f1239g;

    /* renamed from: h  reason: collision with other field name */
    public String f1240h;

    /* renamed from: i  reason: collision with other field name */
    public String f1241i;

    /* renamed from: j  reason: collision with other field name */
    public String f1242j;

    /* renamed from: k  reason: collision with other field name */
    public String f1243k;

    /* renamed from: l  reason: collision with other field name */
    public String f1244l;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1223a = new kd("XmPushActionAckMessage");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14962a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 12, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 2, 11);
    private static final jv l = new jv("", (byte) 11, 12);
    private static final jv m = new jv("", (byte) 11, 13);
    private static final jv n = new jv("", (byte) 11, 14);
    private static final jv o = new jv("", (byte) 6, 15);
    private static final jv p = new jv("", (byte) 6, 16);
    private static final jv q = new jv("", (byte) 11, 20);
    private static final jv r = new jv("", (byte) 11, 21);
    private static final jv s = new jv("", (byte) 8, 22);
    private static final jv t = new jv("", (byte) 13, 23);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1229a = new BitSet(5);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1232a = false;

    /* renamed from: a */
    public int compareTo(is isVar) {
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
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        int a20;
        int a21;
        if (!getClass().equals(isVar.getClass())) {
            return getClass().getName().compareTo(isVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m832a()).compareTo(Boolean.valueOf(isVar.m832a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m832a() && (a21 = jo.a(this.f1228a, isVar.f1228a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(isVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a20 = jo.a(this.f1226a, isVar.f1226a)) != 0) {
            return a20;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(isVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a19 = jo.a(this.f1233b, isVar.f1233b)) != 0) {
            return a19;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(isVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a18 = jo.a(this.f1235c, isVar.f1235c)) != 0) {
            return a18;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(isVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a17 = jo.a(this.f1225a, isVar.f1225a)) != 0) {
            return a17;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(isVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a16 = jo.a(this.f1236d, isVar.f1236d)) != 0) {
            return a16;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(isVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a15 = jo.a(this.f1237e, isVar.f1237e)) != 0) {
            return a15;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(isVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a14 = jo.a(this.f1227a, isVar.f1227a)) != 0) {
            return a14;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(isVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a13 = jo.a(this.f1238f, isVar.f1238f)) != 0) {
            return a13;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(isVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a12 = jo.a(this.f1239g, isVar.f1239g)) != 0) {
            return a12;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(isVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a11 = jo.a(this.f1232a, isVar.f1232a)) != 0) {
            return a11;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(isVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a10 = jo.a(this.f1240h, isVar.f1240h)) != 0) {
            return a10;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(isVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a9 = jo.a(this.f1241i, isVar.f1241i)) != 0) {
            return a9;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(isVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a8 = jo.a(this.f1242j, isVar.f1242j)) != 0) {
            return a8;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(isVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a7 = jo.a(this.f1231a, isVar.f1231a)) != 0) {
            return a7;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(isVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a6 = jo.a(this.f1234b, isVar.f1234b)) != 0) {
            return a6;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(isVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a5 = jo.a(this.f1243k, isVar.f1243k)) != 0) {
            return a5;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(isVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a4 = jo.a(this.f1244l, isVar.f1244l)) != 0) {
            return a4;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(isVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a3 = jo.a(this.f1224a, isVar.f1224a)) != 0) {
            return a3;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(isVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!t() || (a2 = jo.a(this.f1230a, isVar.f1230a)) == 0) {
            return 0;
        }
        return a2;
    }

    public is b(String str) {
        this.f1235c = str;
        return this;
    }

    public is c(String str) {
        this.f1236d = str;
        return this;
    }

    public is d(String str) {
        this.f1237e = str;
        return this;
    }

    public void e(boolean z) {
        this.f1229a.set(4, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof is)) {
            return m833a((is) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1236d != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1237e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1227a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1238f != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f1239g != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        return this.f1229a.get(1);
    }

    public boolean l() {
        if (this.f1240h != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.f1241i != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f1242j != null) {
            return true;
        }
        return false;
    }

    public boolean o() {
        return this.f1229a.get(2);
    }

    public boolean p() {
        return this.f1229a.get(3);
    }

    public boolean q() {
        if (this.f1243k != null) {
            return true;
        }
        return false;
    }

    public boolean r() {
        if (this.f1244l != null) {
            return true;
        }
        return false;
    }

    public boolean s() {
        return this.f1229a.get(4);
    }

    public boolean t() {
        if (this.f1230a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (m832a()) {
            sb.append("debug:");
            String str = this.f1228a;
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
            ir irVar = this.f1226a;
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
        String str2 = this.f1233b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1235c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f1225a);
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f1236d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f1237e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("request:");
            jf jfVar = this.f1227a;
            if (jfVar == null) {
                sb.append("null");
            } else {
                sb.append(jfVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f1238f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f1239g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f1232a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f1240h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f1241i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f1242j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f1231a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f1234b);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f1243k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f1244l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f1224a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f1230a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public is a(long j2) {
        this.f1225a = j2;
        a(true);
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1223a);
        if (this.f1228a != null && m832a()) {
            jyVar.a(f14962a);
            jyVar.a(this.f1228a);
            jyVar.b();
        }
        if (this.f1226a != null && b()) {
            jyVar.a(b);
            this.f1226a.b(jyVar);
            jyVar.b();
        }
        if (this.f1233b != null) {
            jyVar.a(c);
            jyVar.a(this.f1233b);
            jyVar.b();
        }
        if (this.f1235c != null) {
            jyVar.a(d);
            jyVar.a(this.f1235c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f1225a);
        jyVar.b();
        if (this.f1236d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1236d);
            jyVar.b();
        }
        if (this.f1237e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1237e);
            jyVar.b();
        }
        if (this.f1227a != null && h()) {
            jyVar.a(h);
            this.f1227a.b(jyVar);
            jyVar.b();
        }
        if (this.f1238f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1238f);
            jyVar.b();
        }
        if (this.f1239g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f1239g);
            jyVar.b();
        }
        if (k()) {
            jyVar.a(k);
            jyVar.a(this.f1232a);
            jyVar.b();
        }
        if (this.f1240h != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f1240h);
            jyVar.b();
        }
        if (this.f1241i != null && m()) {
            jyVar.a(m);
            jyVar.a(this.f1241i);
            jyVar.b();
        }
        if (this.f1242j != null && n()) {
            jyVar.a(n);
            jyVar.a(this.f1242j);
            jyVar.b();
        }
        if (o()) {
            jyVar.a(o);
            jyVar.a(this.f1231a);
            jyVar.b();
        }
        if (p()) {
            jyVar.a(p);
            jyVar.a(this.f1234b);
            jyVar.b();
        }
        if (this.f1243k != null && q()) {
            jyVar.a(q);
            jyVar.a(this.f1243k);
            jyVar.b();
        }
        if (this.f1244l != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f1244l);
            jyVar.b();
        }
        if (s()) {
            jyVar.a(s);
            jyVar.mo941a(this.f1224a);
            jyVar.b();
        }
        if (this.f1230a != null && t()) {
            jyVar.a(t);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1230a.size()));
            for (Map.Entry<String, String> entry : this.f1230a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1229a.set(2, z);
    }

    public void d(boolean z) {
        this.f1229a.set(3, z);
    }

    public boolean e() {
        return this.f1229a.get(0);
    }

    public is a(String str) {
        this.f1233b = str;
        return this;
    }

    public void b(boolean z) {
        this.f1229a.set(1, z);
    }

    public boolean c() {
        return this.f1233b != null;
    }

    public boolean d() {
        return this.f1235c != null;
    }

    public is a(short s2) {
        this.f1231a = s2;
        c(true);
        return this;
    }

    public boolean b() {
        return this.f1226a != null;
    }

    public void a() {
        if (this.f1233b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1235c == null) {
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
                if (e()) {
                    a();
                    return;
                }
                throw new jz("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1228a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1226a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1233b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1235c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f1225a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f1236d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1237e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        jf jfVar = new jf();
                        this.f1227a = jfVar;
                        jfVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1238f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1239g = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f1232a = jyVar.m954a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f1240h = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f1241i = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (b2 == 11) {
                        this.f1242j = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (b2 == 6) {
                        this.f1231a = jyVar.m952a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 16:
                    if (b2 == 6) {
                        this.f1234b = jyVar.m952a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (b2 == 11) {
                        this.f1243k = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 21:
                    if (b2 == 11) {
                        this.f1244l = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 22:
                    if (b2 == 8) {
                        this.f1224a = jyVar.m943a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 23:
                    if (b2 == 13) {
                        jx a3 = jyVar.m947a();
                        this.f1230a = new HashMap(a3.f1472a * 2);
                        for (int i2 = 0; i2 < a3.f1472a; i2++) {
                            this.f1230a.put(jyVar.m950a(), jyVar.m950a());
                        }
                        jyVar.h();
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
        this.f1229a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m832a() {
        return this.f1228a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m833a(is isVar) {
        if (isVar == null) {
            return false;
        }
        boolean a2 = m832a();
        boolean a3 = isVar.m832a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1228a.equals(isVar.f1228a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = isVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1226a.m831a(isVar.f1226a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = isVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1233b.equals(isVar.f1233b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = isVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f1235c.equals(isVar.f1235c))) || this.f1225a != isVar.f1225a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = isVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1236d.equals(isVar.f1236d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = isVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1237e.equals(isVar.f1237e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = isVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1227a.m905a(isVar.f1227a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = isVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1238f.equals(isVar.f1238f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = isVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1239g.equals(isVar.f1239g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = isVar.k();
        if ((k2 || k3) && (!k2 || !k3 || this.f1232a != isVar.f1232a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = isVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f1240h.equals(isVar.f1240h))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = isVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f1241i.equals(isVar.f1241i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = isVar.n();
        if ((n2 || n3) && (!n2 || !n3 || !this.f1242j.equals(isVar.f1242j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = isVar.o();
        if ((o2 || o3) && (!o2 || !o3 || this.f1231a != isVar.f1231a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = isVar.p();
        if ((p2 || p3) && (!p2 || !p3 || this.f1234b != isVar.f1234b)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = isVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f1243k.equals(isVar.f1243k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = isVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f1244l.equals(isVar.f1244l))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = isVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f1224a != isVar.f1224a)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = isVar.t();
        if (t2 || t3) {
            return t2 && t3 && this.f1230a.equals(isVar.f1230a);
        }
        return true;
    }
}
