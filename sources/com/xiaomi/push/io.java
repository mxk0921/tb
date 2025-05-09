package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class io implements jn<io, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1179a;

    /* renamed from: a  reason: collision with other field name */
    public ip f1180a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1181a;

    /* renamed from: a  reason: collision with other field name */
    public String f1182a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1183a = new BitSet(4);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1184a = false;

    /* renamed from: b  reason: collision with other field name */
    public long f1185b;

    /* renamed from: b  reason: collision with other field name */
    public String f1186b;

    /* renamed from: c  reason: collision with other field name */
    public long f1187c;

    /* renamed from: c  reason: collision with other field name */
    public String f1188c;

    /* renamed from: d  reason: collision with other field name */
    public String f1189d;

    /* renamed from: e  reason: collision with other field name */
    public String f1190e;

    /* renamed from: f  reason: collision with other field name */
    public String f1191f;

    /* renamed from: g  reason: collision with other field name */
    public String f1192g;

    /* renamed from: h  reason: collision with other field name */
    public String f1193h;

    /* renamed from: i  reason: collision with other field name */
    public String f1194i;

    /* renamed from: j  reason: collision with other field name */
    public String f1195j;

    /* renamed from: k  reason: collision with other field name */
    public String f1196k;

    /* renamed from: l  reason: collision with other field name */
    public String f1197l;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1178a = new kd("PushMessage");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14958a = new jv("", (byte) 12, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 10, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 11, 11);
    private static final jv l = new jv("", (byte) 12, 12);
    private static final jv m = new jv("", (byte) 11, 13);
    private static final jv n = new jv("", (byte) 2, 14);
    private static final jv o = new jv("", (byte) 11, 15);
    private static final jv p = new jv("", (byte) 10, 16);
    private static final jv q = new jv("", (byte) 11, 20);
    private static final jv r = new jv("", (byte) 11, 21);

    /* renamed from: a */
    public int compareTo(io ioVar) {
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
        if (!getClass().equals(ioVar.getClass())) {
            return getClass().getName().compareTo(ioVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m813a()).compareTo(Boolean.valueOf(ioVar.m813a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m813a() && (a19 = jo.a(this.f1181a, ioVar.f1181a)) != 0) {
            return a19;
        }
        int compareTo2 = Boolean.valueOf(m815b()).compareTo(Boolean.valueOf(ioVar.m815b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m815b() && (a18 = jo.a(this.f1182a, ioVar.f1182a)) != 0) {
            return a18;
        }
        int compareTo3 = Boolean.valueOf(m816c()).compareTo(Boolean.valueOf(ioVar.m816c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m816c() && (a17 = jo.a(this.f1186b, ioVar.f1186b)) != 0) {
            return a17;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ioVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a16 = jo.a(this.f1188c, ioVar.f1188c)) != 0) {
            return a16;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ioVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a15 = jo.a(this.f1179a, ioVar.f1179a)) != 0) {
            return a15;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ioVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a14 = jo.a(this.f1185b, ioVar.f1185b)) != 0) {
            return a14;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ioVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a13 = jo.a(this.f1189d, ioVar.f1189d)) != 0) {
            return a13;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ioVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a12 = jo.a(this.f1190e, ioVar.f1190e)) != 0) {
            return a12;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ioVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a11 = jo.a(this.f1191f, ioVar.f1191f)) != 0) {
            return a11;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ioVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a10 = jo.a(this.f1192g, ioVar.f1192g)) != 0) {
            return a10;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ioVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a9 = jo.a(this.f1193h, ioVar.f1193h)) != 0) {
            return a9;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ioVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a8 = jo.a(this.f1180a, ioVar.f1180a)) != 0) {
            return a8;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ioVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a7 = jo.a(this.f1194i, ioVar.f1194i)) != 0) {
            return a7;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ioVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a6 = jo.a(this.f1184a, ioVar.f1184a)) != 0) {
            return a6;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(ioVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a5 = jo.a(this.f1195j, ioVar.f1195j)) != 0) {
            return a5;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(ioVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a4 = jo.a(this.f1187c, ioVar.f1187c)) != 0) {
            return a4;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(ioVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a3 = jo.a(this.f1196k, ioVar.f1196k)) != 0) {
            return a3;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(ioVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!r() || (a2 = jo.a(this.f1197l, ioVar.f1197l)) == 0) {
            return 0;
        }
        return a2;
    }

    public String b() {
        return this.f1186b;
    }

    public String c() {
        return this.f1188c;
    }

    public void d(boolean z) {
        this.f1183a.set(3, z);
    }

    public boolean e() {
        return this.f1183a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof io)) {
            return m814a((io) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f1183a.get(1);
    }

    public boolean g() {
        if (this.f1189d != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1190e != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1191f != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f1192g != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f1193h != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.f1180a != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.f1194i != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.f1183a.get(2);
    }

    public boolean o() {
        if (this.f1195j != null) {
            return true;
        }
        return false;
    }

    public boolean p() {
        return this.f1183a.get(3);
    }

    public boolean q() {
        if (this.f1196k != null) {
            return true;
        }
        return false;
    }

    public boolean r() {
        if (this.f1197l != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m813a()) {
            sb.append("to:");
            ir irVar = this.f1181a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f1182a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f1186b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f1188c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f1179a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f1185b);
        }
        if (g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f1189d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f1190e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f1191f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f1192g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f1193h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            ip ipVar = this.f1180a;
            if (ipVar == null) {
                sb.append("null");
            } else {
                sb.append(ipVar);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f1194i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f1184a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f1195j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f1187c);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f1196k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f1197l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public long a() {
        return this.f1179a;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m812a();
        jyVar.a(f1178a);
        if (this.f1181a != null && m813a()) {
            jyVar.a(f14958a);
            this.f1181a.b(jyVar);
            jyVar.b();
        }
        if (this.f1182a != null) {
            jyVar.a(b);
            jyVar.a(this.f1182a);
            jyVar.b();
        }
        if (this.f1186b != null) {
            jyVar.a(c);
            jyVar.a(this.f1186b);
            jyVar.b();
        }
        if (this.f1188c != null) {
            jyVar.a(d);
            jyVar.a(this.f1188c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f1179a);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.a(this.f1185b);
            jyVar.b();
        }
        if (this.f1189d != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1189d);
            jyVar.b();
        }
        if (this.f1190e != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f1190e);
            jyVar.b();
        }
        if (this.f1191f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1191f);
            jyVar.b();
        }
        if (this.f1192g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f1192g);
            jyVar.b();
        }
        if (this.f1193h != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f1193h);
            jyVar.b();
        }
        if (this.f1180a != null && l()) {
            jyVar.a(l);
            this.f1180a.b(jyVar);
            jyVar.b();
        }
        if (this.f1194i != null && m()) {
            jyVar.a(m);
            jyVar.a(this.f1194i);
            jyVar.b();
        }
        if (n()) {
            jyVar.a(n);
            jyVar.a(this.f1184a);
            jyVar.b();
        }
        if (this.f1195j != null && o()) {
            jyVar.a(o);
            jyVar.a(this.f1195j);
            jyVar.b();
        }
        if (p()) {
            jyVar.a(p);
            jyVar.a(this.f1187c);
            jyVar.b();
        }
        if (this.f1196k != null && q()) {
            jyVar.a(q);
            jyVar.a(this.f1196k);
            jyVar.b();
        }
        if (this.f1197l != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f1197l);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1183a.set(2, z);
    }

    public boolean d() {
        return this.f1188c != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m811a() {
        return this.f1182a;
    }

    public void b(boolean z) {
        this.f1183a.set(1, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m816c() {
        return this.f1186b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m812a() {
        if (this.f1182a == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1186b == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f1188c == null) {
            throw new jz("Required field 'payload' was not present! Struct: " + toString());
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m815b() {
        return this.f1182a != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                m812a();
                return;
            }
            short s = a2.f1470a;
            if (s == 20) {
                if (b2 == 11) {
                    this.f1196k = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s != 21) {
                switch (s) {
                    case 1:
                        if (b2 == 12) {
                            ir irVar = new ir();
                            this.f1181a = irVar;
                            irVar.a(jyVar);
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 2:
                        if (b2 == 11) {
                            this.f1182a = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 3:
                        if (b2 == 11) {
                            this.f1186b = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 4:
                        if (b2 == 11) {
                            this.f1188c = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 5:
                        if (b2 == 10) {
                            this.f1179a = jyVar.m944a();
                            a(true);
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 6:
                        if (b2 == 10) {
                            this.f1185b = jyVar.m944a();
                            b(true);
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 7:
                        if (b2 == 11) {
                            this.f1189d = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 8:
                        if (b2 == 11) {
                            this.f1190e = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 9:
                        if (b2 == 11) {
                            this.f1191f = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 10:
                        if (b2 == 11) {
                            this.f1192g = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 11:
                        if (b2 == 11) {
                            this.f1193h = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 12:
                        if (b2 == 12) {
                            ip ipVar = new ip();
                            this.f1180a = ipVar;
                            ipVar.a(jyVar);
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 13:
                        if (b2 == 11) {
                            this.f1194i = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 14:
                        if (b2 == 2) {
                            this.f1184a = jyVar.m954a();
                            c(true);
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 15:
                        if (b2 == 11) {
                            this.f1195j = jyVar.m950a();
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    case 16:
                        if (b2 == 10) {
                            this.f1187c = jyVar.m944a();
                            d(true);
                            break;
                        }
                        kb.a(jyVar, b2);
                        break;
                    default:
                        kb.a(jyVar, b2);
                        break;
                }
                jyVar.g();
            } else {
                if (b2 == 11) {
                    this.f1197l = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
    }

    public void a(boolean z) {
        this.f1183a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m813a() {
        return this.f1181a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m814a(io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean a2 = m813a();
        boolean a3 = ioVar.m813a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1181a.m831a(ioVar.f1181a))) {
            return false;
        }
        boolean b2 = m815b();
        boolean b3 = ioVar.m815b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1182a.equals(ioVar.f1182a))) {
            return false;
        }
        boolean c2 = m816c();
        boolean c3 = ioVar.m816c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1186b.equals(ioVar.f1186b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ioVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1188c.equals(ioVar.f1188c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ioVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f1179a != ioVar.f1179a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ioVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f1185b != ioVar.f1185b)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ioVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1189d.equals(ioVar.f1189d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ioVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1190e.equals(ioVar.f1190e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ioVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1191f.equals(ioVar.f1191f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ioVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1192g.equals(ioVar.f1192g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ioVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f1193h.equals(ioVar.f1193h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = ioVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f1180a.m823a(ioVar.f1180a))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ioVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f1194i.equals(ioVar.f1194i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = ioVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f1184a != ioVar.f1184a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = ioVar.o();
        if ((o2 || o3) && (!o2 || !o3 || !this.f1195j.equals(ioVar.f1195j))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = ioVar.p();
        if ((p2 || p3) && (!p2 || !p3 || this.f1187c != ioVar.f1187c)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = ioVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f1196k.equals(ioVar.f1196k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = ioVar.r();
        if (r2 || r3) {
            return r2 && r3 && this.f1197l.equals(ioVar.f1197l);
        }
        return true;
    }
}
