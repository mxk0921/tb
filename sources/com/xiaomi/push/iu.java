package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iu implements jn<iu, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f1258a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1259a = new BitSet(2);

    /* renamed from: b  reason: collision with other field name */
    public int f1260b;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1257a = new kd("XmPushActionCheckClientInfo");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14964a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 8, 2);

    /* renamed from: a */
    public int compareTo(iu iuVar) {
        int a2;
        int a3;
        if (!getClass().equals(iuVar.getClass())) {
            return getClass().getName().compareTo(iuVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m839a()).compareTo(Boolean.valueOf(iuVar.m839a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m839a() && (a3 = jo.a(this.f1258a, iuVar.f1258a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iuVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!b() || (a2 = jo.a(this.f1260b, iuVar.f1260b)) == 0) {
            return 0;
        }
        return a2;
    }

    public iu b(int i) {
        this.f1260b = i;
        b(true);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iu)) {
            return m840a((iu) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f1258a + ", pluginConfigVersion:" + this.f1260b + f7l.BRACKET_END_STR;
    }

    public iu a(int i) {
        this.f1258a = i;
        a(true);
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1257a);
        jyVar.a(f14964a);
        jyVar.mo941a(this.f1258a);
        jyVar.b();
        jyVar.a(b);
        jyVar.mo941a(this.f1260b);
        jyVar.b();
        jyVar.c();
        jyVar.m953a();
    }

    public void a() {
    }

    public void b(boolean z) {
        this.f1259a.set(1, z);
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
            if (s != 1) {
                if (s == 2 && b2 == 8) {
                    this.f1260b = jyVar.m943a();
                    b(true);
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else {
                if (b2 == 8) {
                    this.f1258a = jyVar.m943a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
        jyVar.f();
        if (!m839a()) {
            throw new jz("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        } else if (b()) {
            a();
        } else {
            throw new jz("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
    }

    public boolean b() {
        return this.f1259a.get(1);
    }

    public void a(boolean z) {
        this.f1259a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m839a() {
        return this.f1259a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m840a(iu iuVar) {
        return iuVar != null && this.f1258a == iuVar.f1258a && this.f1260b == iuVar.f1260b;
    }
}
