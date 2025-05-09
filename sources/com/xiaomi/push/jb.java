package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jb implements jn<jb, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1303a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1304a;

    /* renamed from: a  reason: collision with other field name */
    public String f1305a;

    /* renamed from: a  reason: collision with other field name */
    public ByteBuffer f1306a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1307a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f1308a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f1309a;

    /* renamed from: b  reason: collision with other field name */
    public String f1310b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f1311b;

    /* renamed from: c  reason: collision with other field name */
    public String f1312c;

    /* renamed from: d  reason: collision with other field name */
    public String f1313d;

    /* renamed from: e  reason: collision with other field name */
    public String f1314e;

    /* renamed from: f  reason: collision with other field name */
    public String f1315f;

    /* renamed from: g  reason: collision with other field name */
    public String f1316g;

    /* renamed from: h  reason: collision with other field name */
    public String f1317h;

    /* renamed from: i  reason: collision with other field name */
    public String f1318i;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1302a = new kd("XmPushActionNotification");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14972a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 2, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 13, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 11, 12);
    private static final jv l = new jv("", (byte) 11, 13);
    private static final jv m = new jv("", (byte) 11, 14);
    private static final jv n = new jv("", (byte) 10, 15);
    private static final jv o = new jv("", (byte) 2, 20);

    public jb() {
        this.f1307a = new BitSet(3);
        this.f1309a = true;
        this.f1311b = false;
    }

    /* renamed from: a */
    public int compareTo(jb jbVar) {
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
        if (!getClass().equals(jbVar.getClass())) {
            return getClass().getName().compareTo(jbVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m883a()).compareTo(Boolean.valueOf(jbVar.m883a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m883a() && (a16 = jo.a(this.f1305a, jbVar.f1305a)) != 0) {
            return a16;
        }
        int compareTo2 = Boolean.valueOf(m886b()).compareTo(Boolean.valueOf(jbVar.m886b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m886b() && (a15 = jo.a(this.f1304a, jbVar.f1304a)) != 0) {
            return a15;
        }
        int compareTo3 = Boolean.valueOf(m887c()).compareTo(Boolean.valueOf(jbVar.m887c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m887c() && (a14 = jo.a(this.f1310b, jbVar.f1310b)) != 0) {
            return a14;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jbVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a13 = jo.a(this.f1312c, jbVar.f1312c)) != 0) {
            return a13;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jbVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a12 = jo.a(this.f1313d, jbVar.f1313d)) != 0) {
            return a12;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jbVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a11 = jo.a(this.f1309a, jbVar.f1309a)) != 0) {
            return a11;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jbVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a10 = jo.a(this.f1314e, jbVar.f1314e)) != 0) {
            return a10;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jbVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a9 = jo.a(this.f1308a, jbVar.f1308a)) != 0) {
            return a9;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jbVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a8 = jo.a(this.f1315f, jbVar.f1315f)) != 0) {
            return a8;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jbVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a7 = jo.a(this.f1316g, jbVar.f1316g)) != 0) {
            return a7;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jbVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a6 = jo.a(this.f1317h, jbVar.f1317h)) != 0) {
            return a6;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jbVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a5 = jo.a(this.f1318i, jbVar.f1318i)) != 0) {
            return a5;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jbVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a4 = jo.a(this.f1306a, jbVar.f1306a)) != 0) {
            return a4;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jbVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a3 = jo.a(this.f1303a, jbVar.f1303a)) != 0) {
            return a3;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jbVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (!o() || (a2 = jo.a(this.f1311b, jbVar.f1311b)) == 0) {
            return 0;
        }
        return a2;
    }

    public jb b(String str) {
        this.f1312c = str;
        return this;
    }

    public jb c(String str) {
        this.f1313d = str;
        return this;
    }

    public jb d(String str) {
        this.f1315f = str;
        return this;
    }

    public boolean e() {
        if (this.f1313d != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jb)) {
            return m884a((jb) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f1307a.get(0);
    }

    public boolean g() {
        if (this.f1314e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1308a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1315f != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f1316g != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f1317h != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.f1318i != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.f1306a != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.f1307a.get(1);
    }

    public boolean o() {
        return this.f1307a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (m883a()) {
            sb.append("debug:");
            String str = this.f1305a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m886b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1304a;
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
        String str2 = this.f1310b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f1312c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f1313d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f1309a);
        if (g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f1314e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f1308a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f1315f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f1316g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f1317h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f1318i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f1306a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                jo.a(byteBuffer, sb);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f1303a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f1311b);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public jb(String str, boolean z) {
        this();
        this.f1310b = str;
        this.f1309a = z;
        m882a(true);
    }

    public ir a() {
        return this.f1304a;
    }

    public String b() {
        return this.f1312c;
    }

    public String c() {
        return this.f1315f;
    }

    public boolean d() {
        return this.f1312c != null;
    }

    public jb a(String str) {
        this.f1310b = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m881a();
        jyVar.a(f1302a);
        if (this.f1305a != null && m883a()) {
            jyVar.a(f14972a);
            jyVar.a(this.f1305a);
            jyVar.b();
        }
        if (this.f1304a != null && m886b()) {
            jyVar.a(b);
            this.f1304a.b(jyVar);
            jyVar.b();
        }
        if (this.f1310b != null) {
            jyVar.a(c);
            jyVar.a(this.f1310b);
            jyVar.b();
        }
        if (this.f1312c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f1312c);
            jyVar.b();
        }
        if (this.f1313d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f1313d);
            jyVar.b();
        }
        jyVar.a(f);
        jyVar.a(this.f1309a);
        jyVar.b();
        if (this.f1314e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1314e);
            jyVar.b();
        }
        if (this.f1308a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1308a.size()));
            for (Map.Entry<String, String> entry : this.f1308a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f1315f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f1315f);
            jyVar.b();
        }
        if (this.f1316g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f1316g);
            jyVar.b();
        }
        if (this.f1317h != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f1317h);
            jyVar.b();
        }
        if (this.f1318i != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f1318i);
            jyVar.b();
        }
        if (this.f1306a != null && m()) {
            jyVar.a(m);
            jyVar.a(this.f1306a);
            jyVar.b();
        }
        if (n()) {
            jyVar.a(n);
            jyVar.a(this.f1303a);
            jyVar.b();
        }
        if (o()) {
            jyVar.a(o);
            jyVar.a(this.f1311b);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1307a.set(2, z);
    }

    public jb a(ByteBuffer byteBuffer) {
        this.f1306a = byteBuffer;
        return this;
    }

    public void b(boolean z) {
        this.f1307a.set(1, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m887c() {
        return this.f1310b != null;
    }

    public jb a(Map<String, String> map) {
        this.f1308a = map;
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m886b() {
        return this.f1304a != null;
    }

    public jb a(boolean z) {
        this.f1309a = z;
        m882a(true);
        return this;
    }

    public jb a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m879a() {
        return this.f1310b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m880a() {
        return this.f1308a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m881a() {
        if (this.f1310b == null) {
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
                if (f()) {
                    m881a();
                    return;
                }
                throw new jz("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1305a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1304a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1310b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1312c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1313d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 2) {
                        this.f1309a = jyVar.m954a();
                        m882a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1314e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 13) {
                        jx a3 = jyVar.m947a();
                        this.f1308a = new HashMap(a3.f1472a * 2);
                        for (int i2 = 0; i2 < a3.f1472a; i2++) {
                            this.f1308a.put(jyVar.m950a(), jyVar.m950a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1315f = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f1316g = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f1317h = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f1318i = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (b2 == 11) {
                        this.f1306a = jyVar.m951a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (b2 == 10) {
                        this.f1303a = jyVar.m944a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (b2 == 2) {
                        this.f1311b = jyVar.m954a();
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

    public void a(String str, String str2) {
        if (this.f1308a == null) {
            this.f1308a = new HashMap();
        }
        this.f1308a.put(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m882a(boolean z) {
        this.f1307a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m883a() {
        return this.f1305a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m884a(jb jbVar) {
        if (jbVar == null) {
            return false;
        }
        boolean a2 = m883a();
        boolean a3 = jbVar.m883a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1305a.equals(jbVar.f1305a))) {
            return false;
        }
        boolean b2 = m886b();
        boolean b3 = jbVar.m886b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1304a.m831a(jbVar.f1304a))) {
            return false;
        }
        boolean c2 = m887c();
        boolean c3 = jbVar.m887c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1310b.equals(jbVar.f1310b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jbVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1312c.equals(jbVar.f1312c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jbVar.e();
        if (((e2 || e3) && (!e2 || !e3 || !this.f1313d.equals(jbVar.f1313d))) || this.f1309a != jbVar.f1309a) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jbVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1314e.equals(jbVar.f1314e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jbVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1308a.equals(jbVar.f1308a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jbVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f1315f.equals(jbVar.f1315f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jbVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1316g.equals(jbVar.f1316g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jbVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f1317h.equals(jbVar.f1317h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jbVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f1318i.equals(jbVar.f1318i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jbVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f1306a.equals(jbVar.f1306a))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jbVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f1303a != jbVar.f1303a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jbVar.o();
        if (o2 || o3) {
            return o2 && o3 && this.f1311b == jbVar.f1311b;
        }
        return true;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m885a() {
        a(jo.a(this.f1306a));
        return this.f1306a.array();
    }
}
