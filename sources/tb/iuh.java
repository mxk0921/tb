package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iuh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int END_STATUS_ERROR = -1;
    public static final int END_STATUS_OK = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f21589a;
    public long b;
    public long c;
    public int d;
    public String e;
    public int f;
    public int g = 1;
    public long h;
    public long i;
    public quh j;
    public uuh k;
    public uuh l;
    public boolean m;
    public fvh n;
    public fvh o;
    public fvh p;
    public fvh q;
    public ArrayList<iuh> r;
    public iuh s;
    public fvh t;
    public fvh u;
    public JSONObject v;
    public String w;

    public static iuh B(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("353d482b", new Object[]{fvhVar});
        }
        iuh iuhVar = new iuh();
        iuhVar.t = fvhVar;
        return iuhVar;
    }

    public long A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f970731", new Object[]{this})).longValue();
        }
        if (!g()) {
            return this.c;
        }
        if (this.j.s() == null) {
            return Long.MIN_VALUE;
        }
        return k() - this.j.s().k();
    }

    public void C(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df6a1fe", new Object[]{this, str, obj});
            return;
        }
        if (this.v == null) {
            this.v = new JSONObject();
        }
        this.v.put(str, obj);
    }

    public void D(uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85e05", new Object[]{this, uuhVar});
        } else {
            this.k = uuhVar;
        }
    }

    public void E(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a259d0e", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c3401f", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void G(uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eccccb7", new Object[]{this, uuhVar});
        } else {
            this.l = uuhVar;
        }
    }

    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c35a3d1", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void I(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da76540", new Object[]{this, new Long(j)});
        } else {
            this.h = j - this.b;
        }
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1df028", new Object[]{this, str});
        } else {
            this.f21589a = str;
        }
    }

    public void K(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ad92bd", new Object[]{this, quhVar});
        } else {
            this.j = quhVar;
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void M(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d63144", new Object[]{this, iuhVar});
        } else {
            this.s = iuhVar;
        }
    }

    public void N(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0723540", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3542d2", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public void Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b993b10f", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void R(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba20f09b", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public fvh S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("5d5aee90", new Object[]{this});
        }
        fvh a2 = gvh.a();
        a2.m("duration", Long.valueOf(n()));
        b(a2);
        a2.m("state", Integer.valueOf(x()));
        a2.m("endStatus", Integer.valueOf(p()));
        fvh d = d();
        JSONArray jSONArray = null;
        JSONObject p = d == null ? null : d.p();
        fvh h = h();
        JSONObject p2 = h == null ? null : h.p();
        if (p != null) {
            a2.m("beginFeatures", p);
        }
        if (p2 != null) {
            a2.m("endFeatures", p2);
        }
        a2.m("name", t());
        a2.m("attrs", i().p());
        ArrayList<iuh> arrayList = this.r;
        if (arrayList != null && arrayList.size() > 0) {
            jSONArray = new JSONArray();
            Iterator<iuh> it = this.r.iterator();
            while (it.hasNext()) {
                JSONObject p3 = it.next().S().p();
                if (p3 != null) {
                    jSONArray.add(p3);
                }
            }
        }
        if (jSONArray != null) {
            a2.m("children", jSONArray);
        }
        return a2;
    }

    public void T(fvh fvhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db68f8e5", new Object[]{this, fvhVar, str});
            return;
        }
        int i = this.g;
        if (i == 2) {
            if (this.n == null) {
                this.n = gvh.a();
            }
            this.n.k(str, fvhVar);
        } else if (i == 3) {
            if (this.o == null) {
                this.o = gvh.a();
            }
            this.o.k(str, fvhVar);
        }
    }

    public void U(DecimalFormat decimalFormat) {
        fvh l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d648b8", new Object[]{this, decimalFormat});
            return;
        }
        fvh fvhVar = this.q;
        if (!(fvhVar == null || this.p == null || fvhVar.i() || this.p.i() || (l = this.q.l(this.p, decimalFormat)) == null)) {
            for (String str : l.j()) {
                T(l.g(str), str);
            }
        }
    }

    public void V(fvh fvhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271a4504", new Object[]{this, fvhVar, str});
            return;
        }
        int i = this.g;
        if (i == 2) {
            if (this.p == null) {
                this.p = gvh.a();
            }
            this.p.k(str, fvhVar);
        } else if (i == 3) {
            if (this.q == null) {
                this.q = gvh.a();
            }
            this.q.k(str, fvhVar);
        }
    }

    public void a(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb0613b", new Object[]{this, iuhVar});
            return;
        }
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        this.r.add(iuhVar);
    }

    public final void b(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7e431f", new Object[]{this, fvhVar});
        } else if (g()) {
            if (this.j.s() == null) {
                guh.a(guh.TAG, "appendValidTimeOffset 异常。无法获取 meter 对象。name:" + t() + " begin:" + k());
                return;
            }
            fvhVar.m("beginTimeOffset", Long.valueOf(k() - this.j.s().k()));
        } else if (A() == Long.MIN_VALUE) {
            guh.a(guh.TAG, "appendValidTimeOffset 异常。offset 为无效值。name:" + t() + " begin:" + k());
        } else {
            fvhVar.m("beginTimeOffset", Long.valueOf(A()));
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0abb78b", new Object[]{this, jSONObject});
        } else if (A() == Long.MIN_VALUE) {
            guh.a(guh.TAG, "appendValidTimeOffsetV2 error。offset invalid。name:" + t() + " begin:" + k());
        } else {
            jSONObject.put("timeoffset", (Object) Long.valueOf(A()));
        }
    }

    public fvh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("3a334025", new Object[]{this});
        }
        return this.n;
    }

    public fvh e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("740a99a7", new Object[]{this});
        }
        return this.u;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1681c7c9", new Object[]{this});
            return;
        }
        this.p = null;
        this.q = null;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1596899b", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public fvh h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("49206457", new Object[]{this});
        }
        return this.o;
    }

    public fvh i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("b5af866c", new Object[]{this});
        }
        if (this.u == null) {
            this.u = gvh.a();
        }
        return this.u;
    }

    public uuh j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuh) ipChange.ipc$dispatch("8f167e03", new Object[]{this});
        }
        return this.k;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79ac665e", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public iuh l(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("2d43f2a8", new Object[]{this, str, new Integer(i)});
        }
        ArrayList<iuh> arrayList = this.r;
        if (arrayList == null) {
            return null;
        }
        Iterator<iuh> it = arrayList.iterator();
        while (it.hasNext()) {
            iuh next = it.next();
            if (TextUtils.equals(next.t(), str) && next.z() == i) {
                return next;
            }
        }
        return null;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fef994bf", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.v;
        if (jSONObject2 != null) {
            jSONObject.putAll(jSONObject2);
        }
        jSONObject.put("status", (Object) y());
        jSONObject.put("timestamp", (Object) Long.valueOf(k()));
        jSONObject.put("duration", (Object) Long.valueOf(n()));
        return jSONObject;
    }

    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1d4e6ab", new Object[]{this})).longValue();
        }
        return this.h;
    }

    public uuh o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuh) ipChange.ipc$dispatch("661b9e11", new Object[]{this});
        }
        return this.l;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d44416f1", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3831a76", new Object[]{this});
        }
        String str = this.f21589a;
        return str == null ? "unknownId" : str;
    }

    public quh s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (quh) ipChange.ipc$dispatch("29778915", new Object[]{this});
        }
        return this.j;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.e;
    }

    public iuh u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("9d6a5292", new Object[]{this});
        }
        return this.s;
    }

    public long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab4bcf84", new Object[]{this})).longValue();
        }
        return this.i;
    }

    public fvh w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("e145f110", new Object[]{this});
        }
        return this.t;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6750685b", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public JSONObject y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d65d485d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.g != 3) {
            jSONObject.put("name", (Object) pg1.ATOM_EXT_unset);
        } else if (this.d == 1) {
            jSONObject.put("name", (Object) "ok");
        } else {
            jSONObject.put("name", (Object) "error");
        }
        if (!TextUtils.isEmpty(this.w)) {
            jSONObject.put("code", (Object) this.w);
        }
        return jSONObject;
    }

    public fvh q() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("3480053e", new Object[]{this});
        }
        fvh a2 = gvh.a();
        fvh d = d();
        JSONObject jSONObject = null;
        JSONObject p = d == null ? null : d.p();
        fvh h = h();
        JSONObject p2 = h == null ? null : h.p();
        if (p != null) {
            a2.m("beginFeatures", p);
        }
        if (p2 != null) {
            a2.m("endFeatures", p2);
        }
        ArrayList<iuh> arrayList = this.r;
        if (arrayList != null && arrayList.size() > 0) {
            jSONObject = new JSONObject();
            Iterator<iuh> it = this.r.iterator();
            while (it.hasNext()) {
                iuh next = it.next();
                if (!TextUtils.isEmpty(next.t())) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", (Object) next.t());
                    c(jSONObject2);
                    if (next.x() == 3) {
                        jSONObject2.put("duration", (Object) Long.valueOf(next.n()));
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject2.put("ended", (Object) Boolean.valueOf(z));
                    jSONObject2.put("status", (Object) next.y());
                    jSONObject.put(next.t(), (Object) jSONObject2);
                }
            }
        }
        if (jSONObject != null) {
            a2.m("slicesMap", jSONObject);
        }
        return a2;
    }
}
