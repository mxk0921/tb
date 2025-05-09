package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ik implements jn<ik, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1158a;

    /* renamed from: a  reason: collision with other field name */
    public ie f1159a;

    /* renamed from: a  reason: collision with other field name */
    public String f1160a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1161a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1157a = new kd("DataCollectionItem");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14954a = new jv("", (byte) 10, 1);
    private static final jv b = new jv("", (byte) 8, 2);
    private static final jv c = new jv("", (byte) 11, 3);

    /* renamed from: a */
    public int compareTo(ik ikVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(ikVar.getClass())) {
            return getClass().getName().compareTo(ikVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m798a()).compareTo(Boolean.valueOf(ikVar.m798a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m798a() && (a4 = jo.a(this.f1158a, ikVar.f1158a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ikVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jo.a(this.f1159a, ikVar.f1159a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ikVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = jo.a(this.f1160a, ikVar.f1160a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m797a();
        jyVar.a(f1157a);
        jyVar.a(f14954a);
        jyVar.a(this.f1158a);
        jyVar.b();
        if (this.f1159a != null) {
            jyVar.a(b);
            jyVar.mo941a(this.f1159a.a());
            jyVar.b();
        }
        if (this.f1160a != null) {
            jyVar.a(c);
            jyVar.a(this.f1160a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        if (this.f1160a != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ik)) {
            return m799a((ik) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(collectedAt:");
        sb.append(this.f1158a);
        sb.append(", ");
        sb.append("collectionType:");
        ie ieVar = this.f1159a;
        if (ieVar == null) {
            sb.append("null");
        } else {
            sb.append(ieVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f1160a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public ik a(long j) {
        this.f1158a = j;
        a(true);
        return this;
    }

    public boolean b() {
        return this.f1159a != null;
    }

    public ik a(ie ieVar) {
        this.f1159a = ieVar;
        return this;
    }

    public ik a(String str) {
        this.f1160a = str;
        return this;
    }

    public String a() {
        return this.f1160a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m797a() {
        if (this.f1159a == null) {
            throw new jz("Required field 'collectionType' was not present! Struct: " + toString());
        } else if (this.f1160a == null) {
            throw new jz("Required field 'content' was not present! Struct: " + toString());
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
                if (b2 == 10) {
                    this.f1158a = jyVar.m944a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s != 2) {
                if (s == 3 && b2 == 11) {
                    this.f1160a = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else {
                if (b2 == 8) {
                    this.f1159a = ie.a(jyVar.m943a());
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
        jyVar.f();
        if (m798a()) {
            m797a();
            return;
        }
        throw new jz("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.f1161a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m798a() {
        return this.f1161a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m799a(ik ikVar) {
        if (ikVar == null || this.f1158a != ikVar.f1158a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ikVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1159a.equals(ikVar.f1159a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ikVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f1160a.equals(ikVar.f1160a);
        }
        return true;
    }
}
