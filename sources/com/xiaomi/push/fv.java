package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fv implements jn<fv, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public String f1009a;

    /* renamed from: a  reason: collision with other field name */
    public List<fu> f1010a;

    /* renamed from: b  reason: collision with other field name */
    public String f1011b;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1008a = new kd("StatsEvents");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14887a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 15, 3);

    public fv() {
    }

    /* renamed from: a */
    public int compareTo(fv fvVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(fvVar.getClass())) {
            return getClass().getName().compareTo(fvVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m696a()).compareTo(Boolean.valueOf(fvVar.m696a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m696a() && (a4 = jo.a(this.f1009a, fvVar.f1009a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fvVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jo.a(this.f1011b, fvVar.f1011b)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fvVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = jo.a(this.f1010a, fvVar.f1010a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1008a);
        if (this.f1009a != null) {
            jyVar.a(f14887a);
            jyVar.a(this.f1009a);
            jyVar.b();
        }
        if (this.f1011b != null && b()) {
            jyVar.a(b);
            jyVar.a(this.f1011b);
            jyVar.b();
        }
        if (this.f1010a != null) {
            jyVar.a(c);
            jyVar.a(new jw((byte) 12, this.f1010a.size()));
            for (fu fuVar : this.f1010a) {
                fuVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        if (this.f1010a != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fv)) {
            return m697a((fv) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(uuid:");
        String str = this.f1009a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f1011b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<fu> list = this.f1010a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public fv(String str, List<fu> list) {
        this();
        this.f1009a = str;
        this.f1010a = list;
    }

    public fv a(String str) {
        this.f1011b = str;
        return this;
    }

    public boolean b() {
        return this.f1011b != null;
    }

    public void a() {
        if (this.f1009a == null) {
            throw new jz("Required field 'uuid' was not present! Struct: " + toString());
        } else if (this.f1010a == null) {
            throw new jz("Required field 'events' was not present! Struct: " + toString());
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
                a();
                return;
            }
            short s = a2.f1470a;
            if (s == 1) {
                if (b2 == 11) {
                    this.f1009a = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else if (s != 2) {
                if (s == 3 && b2 == 15) {
                    jw a3 = jyVar.m946a();
                    this.f1010a = new ArrayList(a3.f1471a);
                    for (int i = 0; i < a3.f1471a; i++) {
                        fu fuVar = new fu();
                        fuVar.a(jyVar);
                        this.f1010a.add(fuVar);
                    }
                    jyVar.i();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            } else {
                if (b2 == 11) {
                    this.f1011b = jyVar.m950a();
                    jyVar.g();
                }
                kb.a(jyVar, b2);
                jyVar.g();
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m696a() {
        return this.f1009a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m697a(fv fvVar) {
        if (fvVar == null) {
            return false;
        }
        boolean a2 = m696a();
        boolean a3 = fvVar.m696a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1009a.equals(fvVar.f1009a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = fvVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1011b.equals(fvVar.f1011b))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = fvVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f1010a.equals(fvVar.f1010a);
        }
        return true;
    }
}
