package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.DetailRecyclerViewAdapter;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class quh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public vuh f26937a;
    public final String b;
    public Map<String, iuh> d;
    public List<cuh> e;
    public List<cuh> f;
    public ith g;
    public iuh h;
    public final fvh j;
    public boolean k;
    public final fvh i = gvh.a();
    public String c = o();

    public quh(String str, String str2, fvh fvhVar) {
        this.b = str;
        this.j = fvhVar;
        I();
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ceb4b0a", new Object[0]);
        }
        return fuh.a();
    }

    public void A(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49507e69", new Object[]{this, fvhVar});
            return;
        }
        iuh iuhVar = this.h;
        if (iuhVar != null && iuhVar.x() != 3) {
            this.i.n(fvhVar);
        }
    }

    public void B(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec273edc", new Object[]{this, str, obj});
        } else {
            i(str, obj, true, null);
        }
    }

    public void C(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ff471d", new Object[]{this, str, obj});
        } else {
            i(str, obj, false, null);
        }
    }

    public void D(String str, Object obj, avh avhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e18b29c", new Object[]{this, str, obj, avhVar});
        } else {
            i(str, obj, false, avhVar);
        }
    }

    public void E(List<cuh> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af5ad58f", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    public void F(ouh ouhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b8956", new Object[]{this, ouhVar});
        }
    }

    public void G(vuh vuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8158d1aa", new Object[]{this, vuhVar});
        } else {
            this.f26937a = vuhVar;
        }
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3076073f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        this.g = lth.a(this.j);
        this.d = new HashMap();
    }

    public void J(uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e88268", new Object[]{this, uuhVar});
        } else if (this.h == null) {
            this.k = true;
            iuh a2 = a(kuh.a(1), o(), 1, uuhVar);
            if (a2 != null) {
                this.h = a2;
            }
        }
    }

    public void K(int i, uuh uuhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e852a3", new Object[]{this, new Integer(i), uuhVar, str});
            return;
        }
        iuh iuhVar = this.h;
        if (iuhVar != null && iuhVar.x() != 3) {
            j(this.h.r(), 1, uuhVar, i, str);
            n();
        }
    }

    public final iuh a(String str, String str2, int i, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("74f8551f", new Object[]{this, str, str2, new Integer(i), uuhVar});
        }
        return b(str, str2, i, uuhVar, null);
    }

    public void c(String str, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f96c525", new Object[]{this, str, uuhVar});
        } else if (!TextUtils.isEmpty(str) && w(str) == null) {
            a(str, o(), 2, uuhVar);
        }
    }

    public void e(String str, String str2, String str3, uuh uuhVar) {
        iuh iuhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac18a1f2", new Object[]{this, str, str2, str3, uuhVar});
        } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3) && (iuhVar = (iuh) ((HashMap) this.d).get(str3)) != null && iuhVar.x() != 3) {
            b(str2, str, 3, uuhVar, iuhVar);
        }
    }

    public void f(String str, String str2, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f7bc68", new Object[]{this, str, str2, uuhVar});
        } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            a(str2, str, 3, uuhVar);
        }
    }

    public long g(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac4e0daf", new Object[]{this, new Long(j), new Integer(i)})).longValue();
        }
        if (!this.k) {
            return Long.MIN_VALUE;
        }
        if (i == 1) {
            return 0L;
        }
        iuh iuhVar = this.h;
        if (iuhVar == null) {
            return Long.MIN_VALUE;
        }
        return j - iuhVar.k();
    }

    public final iuh h(String str, String str2, int i, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("f6c47894", new Object[]{this, str, str2, new Integer(i), uuhVar});
        }
        long a2 = uuhVar.a();
        iuh B = iuh.B(this.i);
        B.J(str2);
        B.E(a2);
        B.D(uuhVar);
        B.L(str);
        if (!this.k) {
            B.F(true);
        }
        B.Q(i);
        B.O(2);
        B.N(a2);
        B.R(g(a2, i));
        B.K(this);
        B.i().m("id", str2);
        return B;
    }

    public final void i(String str, Object obj, boolean z, avh avhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b535ccb", new Object[]{this, str, obj, new Boolean(z), avhVar});
            return;
        }
        iuh iuhVar = this.h;
        if (iuhVar != null && iuhVar.x() != 3) {
            if (avhVar != null) {
                try {
                    obj = ((DetailRecyclerViewAdapter.a) avhVar).a(str, obj);
                } catch (Exception e) {
                    guh.a(guh.TAG, Log.getStackTraceString(e));
                }
            }
            if (!z || !this.i.a(str)) {
                this.i.m(str, obj);
            }
        }
    }

    public final void j(String str, int i, uuh uuhVar, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da3b0c0", new Object[]{this, str, new Integer(i), uuhVar, new Integer(i2), str2});
        } else if (!TextUtils.isEmpty(str)) {
            iuh iuhVar = (iuh) ((HashMap) this.d).get(str);
            if (iuhVar == null) {
                TLog.loge("MTSMetricMeter", "endMeasureWithId error mtsMeasurement is null");
            } else if (iuhVar.x() == 3) {
                TLog.loge("MTSMetricMeter", "endMeasureWithId error mtsMeasurement is end");
            } else {
                long a2 = uuhVar.a();
                iuhVar.O(3);
                iuhVar.N(a2);
                iuhVar.I(a2);
                iuhVar.G(uuhVar);
                iuhVar.H(i2);
                iuhVar.P(str2);
                this.g.x(iuhVar);
            }
        }
    }

    public void k(String str, int i, uuh uuhVar, String str2) {
        iuh w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a74918", new Object[]{this, str, new Integer(i), uuhVar, str2});
        } else if (!TextUtils.isEmpty(str) && (w = w(str)) != null) {
            j(w.r(), 2, uuhVar, i, str2);
        }
    }

    public void l(String str, String str2, int i, uuh uuhVar) {
        iuh iuhVar;
        iuh l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47017381", new Object[]{this, str, str2, new Integer(i), uuhVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (iuhVar = (iuh) ((HashMap) this.d).get(str2)) != null && iuhVar.x() != 3 && (l = iuhVar.l(str, 2)) != null && l.x() != 3) {
            long a2 = uuhVar.a();
            l.O(3);
            l.H(i);
            l.G(uuhVar);
            l.I(a2);
            l.N(a2);
            this.g.x(l);
        }
    }

    public void m(String str, int i, uuh uuhVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb89a99b", new Object[]{this, str, new Integer(i), uuhVar, str2});
        } else if (!TextUtils.isEmpty(str)) {
            j(str, 3, uuhVar, i, str2);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4960b647", new Object[]{this});
        } else {
            ((HashMap) this.d).clear();
        }
    }

    public List<cuh> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1d9bd1ca", new Object[]{this});
        }
        return this.e;
    }

    public List<cuh> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8b26f275", new Object[]{this});
        }
        return this.f;
    }

    public List<iuh> r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8520edd8", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (iuh iuhVar : ((HashMap) this.d).values()) {
            if (iuhVar.z() == i) {
                arrayList.add(iuhVar);
            }
        }
        return arrayList;
    }

    public iuh s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("6f6e7d4c", new Object[]{this});
        }
        return this.h;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4f47748", new Object[]{this});
        }
        return this.b;
    }

    public fvh u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("c7b10bf3", new Object[]{this});
        }
        return this.i;
    }

    public vuh v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vuh) ipChange.ipc$dispatch("3fcd88e8", new Object[]{this});
        }
        return this.f26937a;
    }

    public final iuh w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("32e8ccd7", new Object[]{this, str});
        }
        for (iuh iuhVar : ((HashMap) this.d).values()) {
            if (TextUtils.equals(iuhVar.t(), str)) {
                return iuhVar;
            }
        }
        return null;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4faa1617", new Object[]{this});
        }
        return this.c;
    }

    public void y(cuh cuhVar) {
        iuh iuhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375aa18b", new Object[]{this, cuhVar});
        } else if (cuhVar != null && (iuhVar = this.h) != null && iuhVar.x() != 3) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            ((ArrayList) this.e).add(cuhVar);
            this.g.w(cuhVar);
        }
    }

    public void z(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2012ff", new Object[]{this, str, str2, str3});
            return;
        }
        iuh iuhVar = (iuh) ((HashMap) this.d).get(str3);
        if (iuhVar != null) {
            iuhVar.i().m(str, str2);
        }
    }

    public final iuh b(String str, String str2, int i, uuh uuhVar, iuh iuhVar) {
        iuh iuhVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuh) ipChange.ipc$dispatch("1f74d38", new Object[]{this, str, str2, new Integer(i), uuhVar, iuhVar});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i != 1 && (iuhVar2 = this.h) != null && iuhVar2.x() == 3) {
            TLog.loge("MTSMetricMeter", "Metric is end " + str);
            return null;
        } else if (((HashMap) this.d).containsKey(str2)) {
            return null;
        } else {
            iuh h = h(str, str2, i, uuhVar);
            if (iuhVar != null) {
                h.M(iuhVar);
                h.i().m("parentId", iuhVar.r());
            }
            ((HashMap) this.d).put(str2, h);
            this.g.x(h);
            return h;
        }
    }

    public void d(String str, String str2, uuh uuhVar) {
        iuh iuhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60f67ee", new Object[]{this, str, str2, uuhVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (iuhVar = (iuh) ((HashMap) this.d).get(str2)) != null && iuhVar.x() != 3 && iuhVar.l(str, 2) == null) {
            iuh h = h(str, o(), 2, uuhVar);
            h.M(iuhVar);
            h.i().m("parentId", iuhVar.r());
            iuhVar.a(h);
            this.g.x(h);
        }
    }
}
