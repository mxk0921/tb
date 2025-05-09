package com.xiaomi.push;

import com.xiaomi.push.service.bc;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ip implements jn<ip, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f1199a;

    /* renamed from: a  reason: collision with other field name */
    public long f1200a;

    /* renamed from: a  reason: collision with other field name */
    public String f1201a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f1202a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f1203a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f1204a;

    /* renamed from: b  reason: collision with other field name */
    public int f1205b;

    /* renamed from: b  reason: collision with other field name */
    public String f1206b;

    /* renamed from: b  reason: collision with other field name */
    public Map<String, String> f1207b;

    /* renamed from: c  reason: collision with other field name */
    public int f1208c;

    /* renamed from: c  reason: collision with other field name */
    public String f1209c;

    /* renamed from: c  reason: collision with other field name */
    public Map<String, String> f1210c;

    /* renamed from: d  reason: collision with other field name */
    public String f1211d;

    /* renamed from: e  reason: collision with other field name */
    public String f1212e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f1198a = new kd("PushMetaInfo");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f14959a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 10, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 8, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 8, 8);
    private static final jv i = new jv("", (byte) 8, 9);
    private static final jv j = new jv("", (byte) 13, 10);
    private static final jv k = new jv("", (byte) 13, 11);
    private static final jv l = new jv("", (byte) 2, 12);
    private static final jv m = new jv("", (byte) 13, 13);

    public ip() {
        this.f1202a = new BitSet(5);
        this.f1204a = false;
    }

    public int a() {
        return this.f1199a;
    }

    public int b() {
        return this.f1205b;
    }

    public int c() {
        return this.f1208c;
    }

    public ip d(String str) {
        this.f1211d = str;
        return this;
    }

    public void e(boolean z) {
        this.f1202a.set(4, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ip)) {
            return m823a((ip) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f1202a.get(1);
    }

    public boolean g() {
        if (this.f1212e != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.f1202a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f1202a.get(3);
    }

    public boolean j() {
        if (this.f1203a != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f1207b != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.f1204a;
    }

    public boolean m() {
        return this.f1202a.get(4);
    }

    public boolean n() {
        if (this.f1210c != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(id:");
        String str = this.f1201a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(bc.a(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f1200a);
        if (m828c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f1206b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m829d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f1209c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f1211d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f1199a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f1212e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f1205b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f1208c);
        }
        if (j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f1203a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f1207b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f1204a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f1210c;
            if (map3 == null) {
                sb.append("null");
            } else {
                sb.append(map3);
            }
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public ip(ip ipVar) {
        BitSet bitSet = new BitSet(5);
        this.f1202a = bitSet;
        bitSet.clear();
        this.f1202a.or(ipVar.f1202a);
        if (ipVar.m822a()) {
            this.f1201a = ipVar.f1201a;
        }
        this.f1200a = ipVar.f1200a;
        if (ipVar.m828c()) {
            this.f1206b = ipVar.f1206b;
        }
        if (ipVar.m829d()) {
            this.f1209c = ipVar.f1209c;
        }
        if (ipVar.e()) {
            this.f1211d = ipVar.f1211d;
        }
        this.f1199a = ipVar.f1199a;
        if (ipVar.g()) {
            this.f1212e = ipVar.f1212e;
        }
        this.f1205b = ipVar.f1205b;
        this.f1208c = ipVar.f1208c;
        if (ipVar.j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : ipVar.f1203a.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f1203a = hashMap;
        }
        if (ipVar.k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : ipVar.f1207b.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.f1207b = hashMap2;
        }
        this.f1204a = ipVar.f1204a;
        if (ipVar.n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, String> entry3 : ipVar.f1210c.entrySet()) {
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            this.f1210c = hashMap3;
        }
    }

    /* renamed from: a */
    public int compareTo(ip ipVar) {
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
        int a12;
        int a13;
        int a14;
        if (!getClass().equals(ipVar.getClass())) {
            return getClass().getName().compareTo(ipVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m822a()).compareTo(Boolean.valueOf(ipVar.m822a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m822a() && (a14 = jo.a(this.f1201a, ipVar.f1201a)) != 0) {
            return a14;
        }
        int compareTo2 = Boolean.valueOf(m826b()).compareTo(Boolean.valueOf(ipVar.m826b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m826b() && (a13 = jo.a(this.f1200a, ipVar.f1200a)) != 0) {
            return a13;
        }
        int compareTo3 = Boolean.valueOf(m828c()).compareTo(Boolean.valueOf(ipVar.m828c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m828c() && (a12 = jo.a(this.f1206b, ipVar.f1206b)) != 0) {
            return a12;
        }
        int compareTo4 = Boolean.valueOf(m829d()).compareTo(Boolean.valueOf(ipVar.m829d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m829d() && (a11 = jo.a(this.f1209c, ipVar.f1209c)) != 0) {
            return a11;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ipVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a10 = jo.a(this.f1211d, ipVar.f1211d)) != 0) {
            return a10;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ipVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a9 = jo.a(this.f1199a, ipVar.f1199a)) != 0) {
            return a9;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ipVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a8 = jo.a(this.f1212e, ipVar.f1212e)) != 0) {
            return a8;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ipVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a7 = jo.a(this.f1205b, ipVar.f1205b)) != 0) {
            return a7;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ipVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a6 = jo.a(this.f1208c, ipVar.f1208c)) != 0) {
            return a6;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ipVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a5 = jo.a(this.f1203a, ipVar.f1203a)) != 0) {
            return a5;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ipVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a4 = jo.a(this.f1207b, ipVar.f1207b)) != 0) {
            return a4;
        }
        int compareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ipVar.m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m() && (a3 = jo.a(this.f1204a, ipVar.f1204a)) != 0) {
            return a3;
        }
        int compareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ipVar.n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (!n() || (a2 = jo.a(this.f1210c, ipVar.f1210c)) == 0) {
            return 0;
        }
        return a2;
    }

    public ip b(int i2) {
        this.f1205b = i2;
        c(true);
        return this;
    }

    public ip c(int i2) {
        this.f1208c = i2;
        d(true);
        return this;
    }

    public String d() {
        return this.f1211d;
    }

    public boolean e() {
        return this.f1211d != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m817a() {
        return this.f1200a;
    }

    public ip b(String str) {
        this.f1206b = str;
        return this;
    }

    public ip c(String str) {
        this.f1209c = str;
        return this;
    }

    public void d(boolean z) {
        this.f1202a.set(3, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public ip m818a() {
        return new ip(this);
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m824b() {
        return this.f1206b;
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m827c() {
        return this.f1209c;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m829d() {
        return this.f1209c != null;
    }

    public ip a(int i2) {
        this.f1199a = i2;
        b(true);
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public Map<String, String> m825b() {
        return this.f1207b;
    }

    public void c(boolean z) {
        this.f1202a.set(2, z);
    }

    public ip a(String str) {
        this.f1201a = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m821a();
        jyVar.a(f1198a);
        if (this.f1201a != null) {
            jyVar.a(f14959a);
            jyVar.a(this.f1201a);
            jyVar.b();
        }
        jyVar.a(b);
        jyVar.a(this.f1200a);
        jyVar.b();
        if (this.f1206b != null && m828c()) {
            jyVar.a(c);
            jyVar.a(this.f1206b);
            jyVar.b();
        }
        if (this.f1209c != null && m829d()) {
            jyVar.a(d);
            jyVar.a(this.f1209c);
            jyVar.b();
        }
        if (this.f1211d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f1211d);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.mo941a(this.f1199a);
            jyVar.b();
        }
        if (this.f1212e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f1212e);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(h);
            jyVar.mo941a(this.f1205b);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.mo941a(this.f1208c);
            jyVar.b();
        }
        if (this.f1203a != null && j()) {
            jyVar.a(j);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1203a.size()));
            for (Map.Entry<String, String> entry : this.f1203a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f1207b != null && k()) {
            jyVar.a(k);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1207b.size()));
            for (Map.Entry<String, String> entry2 : this.f1207b.entrySet()) {
                jyVar.a(entry2.getKey());
                jyVar.a(entry2.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (m()) {
            jyVar.a(l);
            jyVar.a(this.f1204a);
            jyVar.b();
        }
        if (this.f1210c != null && n()) {
            jyVar.a(m);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f1210c.size()));
            for (Map.Entry<String, String> entry3 : this.f1210c.entrySet()) {
                jyVar.a(entry3.getKey());
                jyVar.a(entry3.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m953a();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m828c() {
        return this.f1206b != null;
    }

    public ip a(Map<String, String> map) {
        this.f1203a = map;
        return this;
    }

    public void b(String str, String str2) {
        if (this.f1207b == null) {
            this.f1207b = new HashMap();
        }
        this.f1207b.put(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m819a() {
        return this.f1201a;
    }

    public void b(boolean z) {
        this.f1202a.set(1, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m820a() {
        return this.f1203a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m826b() {
        return this.f1202a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m821a() {
        if (this.f1201a == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m949a();
        while (true) {
            jv a2 = jyVar.m945a();
            byte b2 = a2.f14988a;
            if (b2 == 0) {
                jyVar.f();
                if (m826b()) {
                    m821a();
                    return;
                }
                throw new jz("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i2 = 0;
            switch (a2.f1470a) {
                case 1:
                    if (b2 == 11) {
                        this.f1201a = jyVar.m950a();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 2:
                    if (b2 == 10) {
                        this.f1200a = jyVar.m944a();
                        a(true);
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f1206b = jyVar.m950a();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f1209c = jyVar.m950a();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f1211d = jyVar.m950a();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 6:
                    if (b2 == 8) {
                        this.f1199a = jyVar.m943a();
                        b(true);
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f1212e = jyVar.m950a();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 8:
                    if (b2 == 8) {
                        this.f1205b = jyVar.m943a();
                        c(true);
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 9:
                    if (b2 == 8) {
                        this.f1208c = jyVar.m943a();
                        d(true);
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 10:
                    if (b2 == 13) {
                        jx a3 = jyVar.m947a();
                        this.f1203a = new HashMap(a3.f1472a * 2);
                        while (i2 < a3.f1472a) {
                            this.f1203a.put(jyVar.m950a(), jyVar.m950a());
                            i2++;
                        }
                        jyVar.h();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 11:
                    if (b2 == 13) {
                        jx a4 = jyVar.m947a();
                        this.f1207b = new HashMap(a4.f1472a * 2);
                        while (i2 < a4.f1472a) {
                            this.f1207b.put(jyVar.m950a(), jyVar.m950a());
                            i2++;
                        }
                        jyVar.h();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 12:
                    if (b2 == 2) {
                        this.f1204a = jyVar.m954a();
                        e(true);
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                case 13:
                    if (b2 == 13) {
                        jx a5 = jyVar.m947a();
                        this.f1210c = new HashMap(a5.f1472a * 2);
                        while (i2 < a5.f1472a) {
                            this.f1210c.put(jyVar.m950a(), jyVar.m950a());
                            i2++;
                        }
                        jyVar.h();
                        break;
                    }
                    kb.a(jyVar, b2);
                    break;
                default:
                    kb.a(jyVar, b2);
                    break;
            }
            jyVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f1203a == null) {
            this.f1203a = new HashMap();
        }
        this.f1203a.put(str, str2);
    }

    public void a(boolean z) {
        this.f1202a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m822a() {
        return this.f1201a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m823a(ip ipVar) {
        if (ipVar == null) {
            return false;
        }
        boolean a2 = m822a();
        boolean a3 = ipVar.m822a();
        if (((a2 || a3) && (!a2 || !a3 || !this.f1201a.equals(ipVar.f1201a))) || this.f1200a != ipVar.f1200a) {
            return false;
        }
        boolean c2 = m828c();
        boolean c3 = ipVar.m828c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f1206b.equals(ipVar.f1206b))) {
            return false;
        }
        boolean d2 = m829d();
        boolean d3 = ipVar.m829d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f1209c.equals(ipVar.f1209c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ipVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f1211d.equals(ipVar.f1211d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ipVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f1199a != ipVar.f1199a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ipVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f1212e.equals(ipVar.f1212e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ipVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f1205b != ipVar.f1205b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ipVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f1208c != ipVar.f1208c)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ipVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f1203a.equals(ipVar.f1203a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ipVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f1207b.equals(ipVar.f1207b))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ipVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f1204a != ipVar.f1204a)) {
            return false;
        }
        boolean n = n();
        boolean n2 = ipVar.n();
        if (n || n2) {
            return n && n2 && this.f1210c.equals(ipVar.f1210c);
        }
        return true;
    }
}
