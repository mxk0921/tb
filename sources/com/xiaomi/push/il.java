package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class il implements jn<il, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f1163a;

    /* renamed from: a  reason: collision with other field name */
    public ii f1164a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1165a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public List<in> f1166a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1162a = new kd("NormalConfig");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14955a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 15, 2);
    private static final jv c = new jv("", (byte) 8, 3);

    public int a() {
        return this.f1163a;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m801a();
        jyVar.a(f1162a);
        jyVar.a(f14955a);
        jyVar.mo941a(this.f1163a);
        jyVar.b();
        if (this.f1166a != null) {
            jyVar.a(b);
            jyVar.a(new jw((byte) 12, this.f1166a.size()));
            for (in inVar : this.f1166a) {
                inVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        if (this.f1164a != null && c()) {
            jyVar.a(c);
            jyVar.mo941a(this.f1164a.a());
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        if (this.f1164a != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof il)) {
            return m803a((il) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(version:");
        sb.append(this.f1163a);
        sb.append(", ");
        sb.append("configItems:");
        List<in> list = this.f1166a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (c()) {
            sb.append(", ");
            sb.append("type:");
            ii iiVar = this.f1164a;
            if (iiVar == null) {
                sb.append("null");
            } else {
                sb.append(iiVar);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    /* renamed from: a */
    public int compareTo(il ilVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(ilVar.getClass())) {
            return getClass().getName().compareTo(ilVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m802a()).compareTo(Boolean.valueOf(ilVar.m802a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m802a() && (a4 = jo.a(this.f1163a, ilVar.f1163a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ilVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jo.a(this.f1166a, ilVar.f1166a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ilVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = jo.a(this.f1164a, ilVar.f1164a)) == 0) {
            return 0;
        }
        return a2;
    }

    public boolean b() {
        return this.f1166a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ii m800a() {
        return this.f1164a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m801a() {
        if (this.f1166a == null) {
            throw new jz("Required field 'configItems' was not present! Struct: " + toString());
        }
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
                if (b2 == 8) {
                    this.f1163a = jyVar.m943a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s != 2) {
                if (s == 3 && b2 == 8) {
                    this.f1164a = ii.a(jyVar.m943a());
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else {
                if (b2 == 15) {
                    jw a3 = jyVar.m946a();
                    this.f1166a = new ArrayList(a3.f1471a);
                    for (int i = 0; i < a3.f1471a; i++) {
                        in inVar = new in();
                        inVar.a(jyVar);
                        this.f1166a.add(inVar);
                    }
                    jyVar.i();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
        jyVar.f();
        if (m802a()) {
            m801a();
            return;
        }
        throw new jz("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.f1165a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m802a() {
        return this.f1165a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m803a(il ilVar) {
        if (ilVar == null || this.f1163a != ilVar.f1163a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ilVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1166a.equals(ilVar.f1166a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ilVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f1164a.equals(ilVar.f1164a);
        }
        return true;
    }
}
