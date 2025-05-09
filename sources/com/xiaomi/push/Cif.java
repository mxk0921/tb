package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* renamed from: com.xiaomi.push.if  reason: invalid class name */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Cif implements jn<Cif, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<ig> f1137a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1136a = new kd("ClientUploadData");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14949a = new jv("", (byte) 15, 1);

    public int a() {
        List<ig> list = this.f1137a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m784a();
        jyVar.a(f1136a);
        if (this.f1137a != null) {
            jyVar.a(f14949a);
            jyVar.a(new jw((byte) 12, this.f1137a.size()));
            for (ig igVar : this.f1137a) {
                igVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Cif)) {
            return m786a((Cif) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(uploadDataItems:");
        List<ig> list = this.f1137a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    /* renamed from: a */
    public int compareTo(Cif ifVar) {
        int a2;
        if (!getClass().equals(ifVar.getClass())) {
            return getClass().getName().compareTo(ifVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m785a()).compareTo(Boolean.valueOf(ifVar.m785a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m785a() || (a2 = jo.a(this.f1137a, ifVar.f1137a)) == 0) {
            return 0;
        }
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m784a() {
        if (this.f1137a == null) {
            throw new jz("Required field 'uploadDataItems' was not present! Struct: " + toString());
        }
    }

    public void a(ig igVar) {
        if (this.f1137a == null) {
            this.f1137a = new ArrayList();
        }
        this.f1137a.add(igVar);
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b = a2.f14988a;
            if (b == 0) {
                jyVar.f();
                m784a();
                return;
            }
            if (a2.f1470a == 1 && b == 15) {
                jw a3 = jyVar.m946a();
                this.f1137a = new ArrayList(a3.f1471a);
                for (int i = 0; i < a3.f1471a; i++) {
                    ig igVar = new ig();
                    igVar.a(jyVar);
                    this.f1137a.add(igVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, b);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m785a() {
        return this.f1137a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m786a(Cif ifVar) {
        if (ifVar == null) {
            return false;
        }
        boolean a2 = m785a();
        boolean a3 = ifVar.m785a();
        if (a2 || a3) {
            return a2 && a3 && this.f1137a.equals(ifVar.f1137a);
        }
        return true;
    }
}
