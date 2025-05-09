package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iz implements jn<iz, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<in> f1298a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1297a = new kd("XmPushActionCustomConfig");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14969a = new jv("", (byte) 15, 1);

    /* renamed from: a */
    public int compareTo(iz izVar) {
        int a2;
        if (!getClass().equals(izVar.getClass())) {
            return getClass().getName().compareTo(izVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m863a()).compareTo(Boolean.valueOf(izVar.m863a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m863a() || (a2 = jo.a(this.f1298a, izVar.f1298a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m862a();
        jyVar.a(f1297a);
        if (this.f1298a != null) {
            jyVar.a(f14969a);
            jyVar.a(new jw((byte) 12, this.f1298a.size()));
            for (in inVar : this.f1298a) {
                inVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iz)) {
            return m864a((iz) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(customConfigs:");
        List<in> list = this.f1298a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public List<in> a() {
        return this.f1298a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m862a() {
        if (this.f1298a == null) {
            throw new jz("Required field 'customConfigs' was not present! Struct: " + toString());
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
                m862a();
                return;
            }
            if (a2.f1470a == 1 && b == 15) {
                jw a3 = jyVar.m946a();
                this.f1298a = new ArrayList(a3.f1471a);
                for (int i = 0; i < a3.f1471a; i++) {
                    in inVar = new in();
                    inVar.a(jyVar);
                    this.f1298a.add(inVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, b);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m863a() {
        return this.f1298a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m864a(iz izVar) {
        if (izVar == null) {
            return false;
        }
        boolean a2 = m863a();
        boolean a3 = izVar.m863a();
        if (a2 || a3) {
            return a2 && a3 && this.f1298a.equals(izVar.f1298a);
        }
        return true;
    }
}
