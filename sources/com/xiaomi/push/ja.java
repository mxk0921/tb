package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ja implements jn<ja, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<il> f1301a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1300a = new kd("XmPushActionNormalConfig");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14971a = new jv("", (byte) 15, 1);

    /* renamed from: a */
    public int compareTo(ja jaVar) {
        int a2;
        if (!getClass().equals(jaVar.getClass())) {
            return getClass().getName().compareTo(jaVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m877a()).compareTo(Boolean.valueOf(jaVar.m877a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m877a() || (a2 = jo.a(this.f1301a, jaVar.f1301a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m876a();
        jyVar.a(f1300a);
        if (this.f1301a != null) {
            jyVar.a(f14971a);
            jyVar.a(new jw((byte) 12, this.f1301a.size()));
            for (il ilVar : this.f1301a) {
                ilVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ja)) {
            return m878a((ja) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(normalConfigs:");
        List<il> list = this.f1301a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public List<il> a() {
        return this.f1301a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m876a() {
        if (this.f1301a == null) {
            throw new jz("Required field 'normalConfigs' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b = a2.f14988a;
            if (b == 0) {
                jyVar.f();
                m876a();
                return;
            }
            if (a2.f1470a == 1 && b == 15) {
                jw a3 = jyVar.m946a();
                this.f1301a = new ArrayList(a3.f1471a);
                for (int i = 0; i < a3.f1471a; i++) {
                    il ilVar = new il();
                    ilVar.a(jyVar);
                    this.f1301a.add(ilVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, b);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m877a() {
        return this.f1301a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m878a(ja jaVar) {
        if (jaVar == null) {
            return false;
        }
        boolean a2 = m877a();
        boolean a3 = jaVar.m877a();
        if (a2 || a3) {
            return a2 && a3 && this.f1301a.equals(jaVar.f1301a);
        }
        return true;
    }
}
