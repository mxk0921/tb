package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iy implements jn<iy, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ic f1288a;

    /* renamed from: a  reason: collision with other field name */
    public ip f1289a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1290a;

    /* renamed from: a  reason: collision with other field name */
    public String f1291a;

    /* renamed from: a  reason: collision with other field name */
    public ByteBuffer f1292a;

    /* renamed from: b  reason: collision with other field name */
    public String f1295b;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1287a = new kd("XmPushActionContainer");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14968a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 2, 2);
    private static final jv c = new jv("", (byte) 2, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 12, 7);
    private static final jv h = new jv("", (byte) 12, 8);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1293a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1294a = true;

    /* renamed from: b  reason: collision with other field name */
    public boolean f1296b = true;

    /* renamed from: a */
    public int compareTo(iy iyVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(iyVar.getClass())) {
            return getClass().getName().compareTo(iyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m857a()).compareTo(Boolean.valueOf(iyVar.m857a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m857a() && (a9 = jo.a(this.f1288a, iyVar.f1288a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iyVar.c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (c() && (a8 = jo.a(this.f1294a, iyVar.f1294a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iyVar.d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (d() && (a7 = jo.a(this.f1296b, iyVar.f1296b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iyVar.e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (e() && (a6 = jo.a(this.f1292a, iyVar.f1292a)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iyVar.f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (f() && (a5 = jo.a(this.f1291a, iyVar.f1291a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iyVar.g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (g() && (a4 = jo.a(this.f1295b, iyVar.f1295b)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iyVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (h() && (a3 = jo.a(this.f1290a, iyVar.f1290a)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iyVar.i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!i() || (a2 = jo.a(this.f1289a, iyVar.f1289a)) == 0) {
            return 0;
        }
        return a2;
    }

    public iy b(String str) {
        this.f1295b = str;
        return this;
    }

    public boolean c() {
        return this.f1293a.get(0);
    }

    public boolean d() {
        return this.f1293a.get(1);
    }

    public boolean e() {
        if (this.f1292a != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iy)) {
            return m858a((iy) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1291a != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1295b != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f1290a != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        if (this.f1289a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(action:");
        ic icVar = this.f1288a;
        if (icVar == null) {
            sb.append("null");
        } else {
            sb.append(icVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f1294a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f1296b);
        if (f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f1291a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f1295b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        ir irVar = this.f1290a;
        if (irVar == null) {
            sb.append("null");
        } else {
            sb.append(irVar);
        }
        if (i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            ip ipVar = this.f1289a;
            if (ipVar == null) {
                sb.append("null");
            } else {
                sb.append(ipVar);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public ic a() {
        return this.f1288a;
    }

    public iy b(boolean z) {
        this.f1296b = z;
        m860b(true);
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ip m853a() {
        return this.f1289a;
    }

    public String b() {
        return this.f1295b;
    }

    public iy a(ic icVar) {
        this.f1288a = icVar;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m855a();
        jyVar.a(f1287a);
        if (this.f1288a != null) {
            jyVar.a(f14968a);
            jyVar.mo941a(this.f1288a.a());
            jyVar.b();
        }
        jyVar.a(b);
        jyVar.a(this.f1294a);
        jyVar.b();
        jyVar.a(c);
        jyVar.a(this.f1296b);
        jyVar.b();
        if (this.f1292a != null) {
            jyVar.a(d);
            jyVar.a(this.f1292a);
            jyVar.b();
        }
        if (this.f1291a != null && f()) {
            jyVar.a(e);
            jyVar.a(this.f1291a);
            jyVar.b();
        }
        if (this.f1295b != null && g()) {
            jyVar.a(f);
            jyVar.a(this.f1295b);
            jyVar.b();
        }
        if (this.f1290a != null) {
            jyVar.a(g);
            this.f1290a.b(jyVar);
            jyVar.b();
        }
        if (this.f1289a != null && i()) {
            jyVar.a(h);
            this.f1289a.b(jyVar);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public iy a(ip ipVar) {
        this.f1289a = ipVar;
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m860b(boolean z) {
        this.f1293a.set(1, z);
    }

    public iy a(ir irVar) {
        this.f1290a = irVar;
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m861b() {
        return this.f1294a;
    }

    public iy a(String str) {
        this.f1291a = str;
        return this;
    }

    public iy a(ByteBuffer byteBuffer) {
        this.f1292a = byteBuffer;
        return this;
    }

    public iy a(boolean z) {
        this.f1294a = z;
        m856a(true);
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m854a() {
        return this.f1291a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m855a() {
        if (this.f1288a == null) {
            throw new jz("Required field 'action' was not present! Struct: " + toString());
        } else if (this.f1292a == null) {
            throw new jz("Required field 'pushAction' was not present! Struct: " + toString());
        } else if (this.f1290a == null) {
            throw new jz("Required field 'target' was not present! Struct: " + toString());
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
                if (!c()) {
                    throw new jz("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                } else if (d()) {
                    m855a();
                    return;
                } else {
                    throw new jz("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
            } else {
                switch (a2.f1470a) {
                    case 1:
                        if (b2 == 8) {
                            this.f1288a = ic.a(jyVar.m943a());
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 2:
                        if (b2 == 2) {
                            this.f1294a = jyVar.m954a();
                            m856a(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 3:
                        if (b2 == 2) {
                            this.f1296b = jyVar.m954a();
                            m860b(true);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 4:
                        if (b2 == 11) {
                            this.f1292a = jyVar.m951a();
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 5:
                        if (b2 == 11) {
                            this.f1291a = jyVar.m950a();
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 6:
                        if (b2 == 11) {
                            this.f1295b = jyVar.m950a();
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 7:
                        if (b2 == 12) {
                            ir irVar = new ir();
                            this.f1290a = irVar;
                            irVar.a(jyVar);
                            continue;
                            jyVar.g();
                        }
                        break;
                    case 8:
                        if (b2 == 12) {
                            ip ipVar = new ip();
                            this.f1289a = ipVar;
                            ipVar.a(jyVar);
                            continue;
                            jyVar.g();
                        }
                        break;
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m856a(boolean z) {
        this.f1293a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m857a() {
        return this.f1288a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m858a(iy iyVar) {
        if (iyVar == null) {
            return false;
        }
        boolean a2 = m857a();
        boolean a3 = iyVar.m857a();
        if (((a2 || a3) && (!a2 || !a3 || !this.f1288a.equals(iyVar.f1288a))) || this.f1294a != iyVar.f1294a || this.f1296b != iyVar.f1296b) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iyVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1292a.equals(iyVar.f1292a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iyVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1291a.equals(iyVar.f1291a))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iyVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1295b.equals(iyVar.f1295b))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iyVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f1290a.m831a(iyVar.f1290a))) {
            return false;
        }
        boolean i = i();
        boolean i2 = iyVar.i();
        if (i || i2) {
            return i && i2 && this.f1289a.m823a(iyVar.f1289a);
        }
        return true;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m859a() {
        a(jo.a(this.f1292a));
        return this.f1292a.array();
    }
}
