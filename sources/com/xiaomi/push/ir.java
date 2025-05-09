package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ir implements jn<ir, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public String f1217a;

    /* renamed from: d  reason: collision with other field name */
    public String f1222d;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1215a = new kd("Target");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14961a = new jv("", (byte) 10, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 2, 5);
    private static final jv f = new jv("", (byte) 11, 7);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1218a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public long f1216a = 5;

    /* renamed from: b  reason: collision with other field name */
    public String f1220b = "xiaomi.com";

    /* renamed from: c  reason: collision with other field name */
    public String f1221c = "";

    /* renamed from: a  reason: collision with other field name */
    public boolean f1219a = false;

    /* renamed from: a */
    public int compareTo(ir irVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!getClass().equals(irVar.getClass())) {
            return getClass().getName().compareTo(irVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m830a()).compareTo(Boolean.valueOf(irVar.m830a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m830a() && (a7 = jo.a(this.f1216a, irVar.f1216a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(irVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a6 = jo.a(this.f1217a, irVar.f1217a)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(irVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a5 = jo.a(this.f1220b, irVar.f1220b)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(irVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a4 = jo.a(this.f1221c, irVar.f1221c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(irVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a3 = jo.a(this.f1219a, irVar.f1219a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(irVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!f() || (a2 = jo.a(this.f1222d, irVar.f1222d)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1215a);
        jyVar.a(f14961a);
        jyVar.a(this.f1216a);
        jyVar.b();
        if (this.f1217a != null) {
            jyVar.a(b);
            jyVar.a(this.f1217a);
            jyVar.b();
        }
        if (this.f1220b != null && c()) {
            jyVar.a(c);
            jyVar.a(this.f1220b);
            jyVar.b();
        }
        if (this.f1221c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f1221c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f1219a);
            jyVar.b();
        }
        if (this.f1222d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1222d);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        if (this.f1220b != null) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.f1221c != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f1218a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ir)) {
            return m831a((ir) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1222d != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(channelId:");
        sb.append(this.f1216a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f1217a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f1220b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f1221c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f1219a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f1222d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public void a() {
        if (this.f1217a == null) {
            throw new jz("Required field 'userId' was not present! Struct: " + toString());
        }
    }

    public void b(boolean z) {
        this.f1218a.set(1, z);
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                break;
            }
            short s = a2.f1470a;
            if (s == 1) {
                if (b2 == 10) {
                    this.f1216a = jyVar.m944a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s == 2) {
                if (b2 == 11) {
                    this.f1217a = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s == 3) {
                if (b2 == 11) {
                    this.f1220b = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s == 4) {
                if (b2 == 11) {
                    this.f1221c = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s != 5) {
                if (s == 7 && b2 == 11) {
                    this.f1222d = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else {
                if (b2 == 2) {
                    this.f1219a = jyVar.m954a();
                    b(true);
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
        jyVar.f();
        if (m830a()) {
            a();
            return;
        }
        throw new jz("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    public boolean b() {
        return this.f1217a != null;
    }

    public void a(boolean z) {
        this.f1218a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m830a() {
        return this.f1218a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m831a(ir irVar) {
        if (irVar == null || this.f1216a != irVar.f1216a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = irVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1217a.equals(irVar.f1217a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = irVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1220b.equals(irVar.f1220b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = irVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1221c.equals(irVar.f1221c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = irVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f1219a != irVar.f1219a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = irVar.f();
        if (f2 || f3) {
            return f2 && f3 && this.f1222d.equals(irVar.f1222d);
        }
        return true;
    }
}
