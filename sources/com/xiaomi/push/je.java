package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class je implements jn<je, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1373a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1374a;

    /* renamed from: a  reason: collision with other field name */
    public String f1375a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1376a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f1377b;

    /* renamed from: c  reason: collision with other field name */
    public String f1378c;

    /* renamed from: d  reason: collision with other field name */
    public String f1379d;

    /* renamed from: e  reason: collision with other field name */
    public String f1380e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1372a = new kd("XmPushActionSendFeedbackResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14975a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);

    /* renamed from: a */
    public int compareTo(je jeVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(jeVar.getClass())) {
            return getClass().getName().compareTo(jeVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m900a()).compareTo(Boolean.valueOf(jeVar.m900a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m900a() && (a8 = jo.a(this.f1375a, jeVar.f1375a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jeVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a7 = jo.a(this.f1374a, jeVar.f1374a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jeVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a6 = jo.a(this.f1377b, jeVar.f1377b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jeVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = jo.a(this.f1378c, jeVar.f1378c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jeVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = jo.a(this.f1373a, jeVar.f1373a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jeVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = jo.a(this.f1379d, jeVar.f1379d)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jeVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!g() || (a2 = jo.a(this.f1380e, jeVar.f1380e)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f1372a);
        if (this.f1375a != null && m900a()) {
            jyVar.a(f14975a);
            jyVar.a(this.f1375a);
            jyVar.b();
        }
        if (this.f1374a != null && b()) {
            jyVar.a(b);
            this.f1374a.b(jyVar);
            jyVar.b();
        }
        if (this.f1377b != null) {
            jyVar.a(c);
            jyVar.a(this.f1377b);
            jyVar.b();
        }
        if (this.f1378c != null) {
            jyVar.a(d);
            jyVar.a(this.f1378c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f1373a);
        jyVar.b();
        if (this.f1379d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1379d);
            jyVar.b();
        }
        if (this.f1380e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1380e);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public boolean c() {
        if (this.f1377b != null) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.f1378c != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f1376a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof je)) {
            return m901a((je) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1379d != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1380e != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (m900a()) {
            sb.append("debug:");
            String str = this.f1375a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f1374a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f1377b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f1378c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f1373a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f1379d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f1380e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public void a() {
        if (this.f1377b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1378c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    public boolean b() {
        return this.f1374a != null;
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                if (e()) {
                    a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1375a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1374a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1377b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1378c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f1373a = jyVar.m944a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1379d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f1380e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, b2);
            jyVar.g();
        }
    }

    public void a(boolean z) {
        this.f1376a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m900a() {
        return this.f1375a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m901a(je jeVar) {
        if (jeVar == null) {
            return false;
        }
        boolean a2 = m900a();
        boolean a3 = jeVar.m900a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1375a.equals(jeVar.f1375a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jeVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1374a.m831a(jeVar.f1374a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jeVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1377b.equals(jeVar.f1377b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jeVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f1378c.equals(jeVar.f1378c))) || this.f1373a != jeVar.f1373a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jeVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1379d.equals(jeVar.f1379d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jeVar.g();
        if (g2 || g3) {
            return g2 && g3 && this.f1380e.equals(jeVar.f1380e);
        }
        return true;
    }
}
