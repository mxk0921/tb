package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iw implements jn<iw, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f1264a;

    /* renamed from: a  reason: collision with other field name */
    public ir f1265a;

    /* renamed from: a  reason: collision with other field name */
    public String f1266a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f1268a;

    /* renamed from: b  reason: collision with other field name */
    public String f1270b;

    /* renamed from: c  reason: collision with other field name */
    public String f1272c;

    /* renamed from: d  reason: collision with other field name */
    public String f1273d;

    /* renamed from: e  reason: collision with other field name */
    public String f1274e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1263a = new kd("XmPushActionCommand");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14966a = new jv("", (byte) 12, 2);
    private static final jv b = new jv("", (byte) 11, 3);
    private static final jv c = new jv("", (byte) 11, 4);
    private static final jv d = new jv("", (byte) 11, 5);
    private static final jv e = new jv("", (byte) 15, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 9);
    private static final jv h = new jv("", (byte) 2, 10);
    private static final jv i = new jv("", (byte) 2, 11);
    private static final jv j = new jv("", (byte) 10, 12);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1267a = new BitSet(3);

    /* renamed from: a  reason: collision with other field name */
    public boolean f1269a = false;

    /* renamed from: b  reason: collision with other field name */
    public boolean f1271b = true;

    /* renamed from: a */
    public int compareTo(iw iwVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        if (!getClass().equals(iwVar.getClass())) {
            return getClass().getName().compareTo(iwVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m845a()).compareTo(Boolean.valueOf(iwVar.m845a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m845a() && (a11 = jo.a(this.f1265a, iwVar.f1265a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iwVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = jo.a(this.f1266a, iwVar.f1266a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iwVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jo.a(this.f1270b, iwVar.f1270b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iwVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f1272c, iwVar.f1272c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iwVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f1268a, iwVar.f1268a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iwVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f1273d, iwVar.f1273d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iwVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f1274e, iwVar.f1274e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iwVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f1269a, iwVar.f1269a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iwVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f1271b, iwVar.f1271b)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(iwVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jo.a(this.f1264a, iwVar.f1264a)) == 0) {
            return 0;
        }
        return a2;
    }

    public iw b(String str) {
        this.f1270b = str;
        return this;
    }

    public iw c(String str) {
        this.f1272c = str;
        return this;
    }

    public iw d(String str) {
        this.f1273d = str;
        return this;
    }

    public iw e(String str) {
        this.f1274e = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iw)) {
            return m846a((iw) obj);
        }
        return false;
    }

    public boolean f() {
        if (this.f1273d != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1274e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.f1267a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f1267a.get(1);
    }

    public boolean j() {
        return this.f1267a.get(2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m845a()) {
            sb.append("target:");
            ir irVar = this.f1265a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f1266a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f1270b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f1272c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f1268a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f1273d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f1274e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f1269a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f1271b);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f1264a);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public iw a(String str) {
        this.f1266a = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m843a();
        jyVar.a(f1263a);
        if (this.f1265a != null && m845a()) {
            jyVar.a(f14966a);
            this.f1265a.b(jyVar);
            jyVar.b();
        }
        if (this.f1266a != null) {
            jyVar.a(b);
            jyVar.a(this.f1266a);
            jyVar.b();
        }
        if (this.f1270b != null) {
            jyVar.a(c);
            jyVar.a(this.f1270b);
            jyVar.b();
        }
        if (this.f1272c != null) {
            jyVar.a(d);
            jyVar.a(this.f1272c);
            jyVar.b();
        }
        if (this.f1268a != null && e()) {
            jyVar.a(e);
            jyVar.a(new jw((byte) 11, this.f1268a.size()));
            for (String str : this.f1268a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        if (this.f1273d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f1273d);
            jyVar.b();
        }
        if (this.f1274e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1274e);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(h);
            jyVar.a(this.f1269a);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.a(this.f1271b);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.a(this.f1264a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    public void c(boolean z) {
        this.f1267a.set(2, z);
    }

    public boolean d() {
        return this.f1272c != null;
    }

    public boolean e() {
        return this.f1268a != null;
    }

    public String a() {
        return this.f1272c;
    }

    public void b(boolean z) {
        this.f1267a.set(1, z);
    }

    public boolean c() {
        return this.f1270b != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m843a() {
        if (this.f1266a == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f1270b == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f1272c == null) {
            throw new jz("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }

    public boolean b() {
        return this.f1266a != null;
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                m843a();
                return;
            }
            switch (a2.f1470a) {
                case 2:
                    if (b2 == 12) {
                        ir irVar = new ir();
                        this.f1265a = irVar;
                        irVar.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1266a = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1270b = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1272c = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (b2 == 15) {
                        jw a3 = jyVar.m946a();
                        this.f1268a = new ArrayList(a3.f1471a);
                        for (int i2 = 0; i2 < a3.f1471a; i2++) {
                            this.f1268a.add(jyVar.m950a());
                        }
                        jyVar.i();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1273d = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f1274e = jyVar.m950a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (b2 == 2) {
                        this.f1269a = jyVar.m954a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f1271b = jyVar.m954a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (b2 == 10) {
                        this.f1264a = jyVar.m944a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, b2);
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m844a(String str) {
        if (this.f1268a == null) {
            this.f1268a = new ArrayList();
        }
        this.f1268a.add(str);
    }

    public void a(boolean z) {
        this.f1267a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m845a() {
        return this.f1265a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m846a(iw iwVar) {
        if (iwVar == null) {
            return false;
        }
        boolean a2 = m845a();
        boolean a3 = iwVar.m845a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f1265a.m831a(iwVar.f1265a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = iwVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f1266a.equals(iwVar.f1266a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = iwVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1270b.equals(iwVar.f1270b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = iwVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1272c.equals(iwVar.f1272c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iwVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1268a.equals(iwVar.f1268a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iwVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f1273d.equals(iwVar.f1273d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iwVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1274e.equals(iwVar.f1274e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iwVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f1269a != iwVar.f1269a)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = iwVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f1271b != iwVar.f1271b)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = iwVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f1264a == iwVar.f1264a;
        }
        return true;
    }
}
