package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iv implements jn<iv, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<ik> f1262a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1261a = new kd("XmPushActionCollectData");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14965a = new jv("", (byte) 15, 1);

    /* renamed from: a */
    public int compareTo(iv ivVar) {
        int a2;
        if (!getClass().equals(ivVar.getClass())) {
            return getClass().getName().compareTo(ivVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m841a()).compareTo(Boolean.valueOf(ivVar.m841a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m841a() || (a2 = jo.a(this.f1262a, ivVar.f1262a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1261a);
        if (this.f1262a != null) {
            jyVar.a(f14965a);
            jyVar.a(new jw((byte) 12, this.f1262a.size()));
            for (ik ikVar : this.f1262a) {
                ikVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iv)) {
            return m842a((iv) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(dataCollectionItems:");
        List<ik> list = this.f1262a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public iv a(List<ik> list) {
        this.f1262a = list;
        return this;
    }

    public void a() {
        if (this.f1262a == null) {
            throw new jz("Required field 'dataCollectionItems' was not present! Struct: " + toString());
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
                a();
                return;
            }
            if (a2.f1470a == 1 && b == 15) {
                jw a3 = jyVar.m946a();
                this.f1262a = new ArrayList(a3.f1471a);
                for (int i = 0; i < a3.f1471a; i++) {
                    ik ikVar = new ik();
                    ikVar.a(jyVar);
                    this.f1262a.add(ikVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, b);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m841a() {
        return this.f1262a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m842a(iv ivVar) {
        if (ivVar == null) {
            return false;
        }
        boolean a2 = m841a();
        boolean a3 = ivVar.m841a();
        if (a2 || a3) {
            return a2 && a3 && this.f1262a.equals(ivVar.f1262a);
        }
        return true;
    }
}
