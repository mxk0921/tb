package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.model.Metric;
import com.alibaba.appmonitor.model.UTDimensionValueSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fl8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static fl8 g;
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);
    public final SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    public final Map<UTDimensionValueSet, nti> b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, u08> f19384a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f19385a;

        public a(Map map) {
            this.f19385a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                j4v.d(this.f19385a);
            }
        }
    }

    static {
        t2o.a(962593033);
    }

    public static synchronized fl8 s() {
        synchronized (fl8.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fl8) ipChange.ipc$dispatch("eead1cb4", new Object[0]);
            }
            if (g == null) {
                g = new fl8();
            }
            return g;
        }
    }

    public void a(int i, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c29be73", new Object[]{this, new Integer(i), str, str2, str3, str4, str5});
        } else {
            b(i, str, str2, str3, str4, str5, null, null, null);
        }
    }

    public void b(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78f4c6", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, l, str6, str7});
            return;
        }
        UTDimensionValueSet p = p(i, l, str6, str7);
        jj0 jj0Var = (jj0) r(p, str, str2, str3, jj0.class);
        if (jj0Var != null) {
            jj0Var.d(l);
            jj0Var.c(str4, str5);
        }
        if (o2w.k().E()) {
            jj0 jj0Var2 = (jj0) to1.a().d(jj0.class, Integer.valueOf(i), str, str2, str3);
            jj0Var2.d(l);
            jj0Var2.c(str4, str5);
            j4v.b(p, jj0Var2);
        }
        g(EventType.getEventType(i), this.c);
    }

    public void c(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2efabb0c", new Object[]{this, new Integer(i), str, str2, str3});
        } else {
            d(i, str, str2, str3, null, null, null);
        }
    }

    public void d(int i, String str, String str2, String str3, Long l, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41806df", new Object[]{this, new Integer(i), str, str2, str3, l, str4, str5});
            return;
        }
        UTDimensionValueSet p = p(i, l, str4, str5);
        jj0 jj0Var = (jj0) r(p, str, str2, str3, jj0.class);
        if (jj0Var != null) {
            jj0Var.e(l);
        }
        if (o2w.k().E()) {
            jj0 jj0Var2 = (jj0) to1.a().d(jj0.class, Integer.valueOf(i), str, str2, str3);
            jj0Var2.e(l);
            j4v.b(p, jj0Var2);
        }
        g(EventType.getEventType(i), this.c);
    }

    public void e(Integer num, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6ffd91", new Object[]{this, num, str, str2, str3});
            return;
        }
        String t = t(str, str2);
        if (t != null) {
            f(t, num, str, str2, str3);
        }
    }

    public void f(String str, Integer num, String str2, String str3, String str4) {
        u08 u08Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fce007", new Object[]{this, str, num, str2, str3, str4});
            return;
        }
        Metric c = lti.d().c(str2, str3);
        if (c == null || c.getMeasureSet() == null) {
            nhh.i("log discard!,metric is null,please call AppMonitor.register() once before Transaction.begin(measure)", new Object[0]);
        } else if (c.getMeasureSet().getMeasure(str4) != null) {
            synchronized (u08.class) {
                try {
                    u08Var = (u08) ((ConcurrentHashMap) this.f19384a).get(str);
                    if (u08Var == null) {
                        u08Var = (u08) to1.a().d(u08.class, num, str2, str3);
                        ((ConcurrentHashMap) this.f19384a).put(str, u08Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            u08Var.h(str4);
        }
    }

    public final void g(EventType eventType, AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9293457d", new Object[]{this, eventType, atomicInteger});
        } else if (atomicInteger.incrementAndGet() >= eventType.getTriggerCount()) {
            nhh.f("EventRepo", eventType.toString(), " event size exceed trigger count.");
            w(eventType.getEventId());
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812014e5", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.f19384a).keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            u08 u08Var = (u08) ((ConcurrentHashMap) this.f19384a).get(str);
            if (u08Var != null && u08Var.g()) {
                ((ConcurrentHashMap) this.f19384a).remove(str);
            }
        }
    }

    public void i(String str, Integer num, String str2, String str3, DimensionValueSet dimensionValueSet) {
        u08 u08Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36180cdd", new Object[]{this, str, num, str2, str3, dimensionValueSet});
            return;
        }
        synchronized (u08.class) {
            try {
                u08Var = (u08) ((ConcurrentHashMap) this.f19384a).get(str);
                if (u08Var == null) {
                    u08Var = (u08) to1.a().d(u08.class, num, str2, str3);
                    ((ConcurrentHashMap) this.f19384a).put(str, u08Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u08Var.c(dimensionValueSet);
    }

    public void j(int i, String str, String str2, MeasureValueSet measureValueSet, DimensionValueSet dimensionValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d48583b", new Object[]{this, new Integer(i), str, str2, measureValueSet, dimensionValueSet});
        } else {
            k(i, str, str2, measureValueSet, dimensionValueSet, null, null, null);
        }
    }

    public void l(int i, String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3778826", new Object[]{this, new Integer(i), str, str2, str3, new Double(d)});
        } else {
            m(i, str, str2, str3, d, null, null, null);
        }
    }

    public void m(int i, String str, String str2, String str3, double d, Long l, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aae5af9", new Object[]{this, new Integer(i), str, str2, str3, new Double(d), l, str4, str5});
            return;
        }
        UTDimensionValueSet p = p(i, l, str4, str5);
        bv4 bv4Var = (bv4) r(p, str, str2, str3, bv4.class);
        if (bv4Var != null) {
            bv4Var.c(d, l);
        }
        if (o2w.k().E()) {
            bv4 bv4Var2 = (bv4) to1.a().d(bv4.class, Integer.valueOf(i), str, str2, str3);
            bv4Var2.c(d, l);
            j4v.b(p, bv4Var2);
        }
        g(EventType.getEventType(i), this.d);
    }

    public void n(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e83570", new Object[]{this, str, str2, str3});
            return;
        }
        String t = t(str, str2);
        if (t != null) {
            o(t, str3, true);
        }
    }

    public void o(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a010e6e", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        u08 u08Var = (u08) ((ConcurrentHashMap) this.f19384a).get(str);
        if (u08Var != null && u08Var.d(str2)) {
            ((ConcurrentHashMap) this.f19384a).remove(str);
            if (z) {
                v(u08Var.f18612a, u08Var.b);
            }
            j(u08Var.d, u08Var.f18612a, u08Var.b, u08Var.f(), u08Var.e());
            to1.a().c(u08Var);
        }
    }

    public final UTDimensionValueSet p(int i, Long l, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTDimensionValueSet) ipChange.ipc$dispatch("5bca8c88", new Object[]{this, new Integer(i), l, str, str2});
        }
        UTDimensionValueSet uTDimensionValueSet = (UTDimensionValueSet) to1.a().d(UTDimensionValueSet.class, new Object[0]);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Context g2 = o2w.k().g();
            uTDimensionValueSet.setValue(oeh.ACCESS, NetworkUtil.c(g2));
            uTDimensionValueSet.setValue(oeh.ACCESS_SUBTYPE, NetworkUtil.d(g2));
        } else {
            uTDimensionValueSet.setValue(oeh.ACCESS, str);
            uTDimensionValueSet.setValue(oeh.ACCESS_SUBTYPE, str2);
        }
        uTDimensionValueSet.setValue("USERID", o2w.k().w());
        uTDimensionValueSet.setValue(oeh.USERNICK, o2w.k().x());
        uTDimensionValueSet.setValue(oeh.EVENTID, String.valueOf(i));
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        uTDimensionValueSet.setValue("commitDay", this.f.format(new Date(l.longValue() * 1000)));
        return uTDimensionValueSet;
    }

    public final AtomicInteger q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("8ff510c0", new Object[]{this, new Integer(i)});
        }
        if (65501 == i) {
            return this.c;
        }
        if (65502 == i) {
            return this.d;
        }
        if (65503 == i) {
            return this.e;
        }
        return null;
    }

    public final String t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("138f462", new Object[]{this, str, str2});
        }
        Metric c = lti.d().c(str, str2);
        if (c != null) {
            return c.getTransactionId();
        }
        return null;
    }

    public final void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f477a5", new Object[]{this, str, str2});
            return;
        }
        Metric c = lti.d().c(str, str2);
        if (c != null) {
            c.resetTransactionId();
        }
    }

    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de57b9e3", new Object[]{this, new Integer(i)});
        } else {
            zdt.c().f(new a(u(i)));
        }
    }

    public final ej8 r(UTDimensionValueSet uTDimensionValueSet, String str, String str2, String str3, Class<? extends ej8> cls) {
        Integer eventId;
        nti ntiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ej8) ipChange.ipc$dispatch("e2d52ef3", new Object[]{this, uTDimensionValueSet, str, str2, str3, cls});
        }
        if (!hsq.g(str) || !hsq.g(str2) || (eventId = uTDimensionValueSet.getEventId()) == null) {
            return null;
        }
        synchronized (this.b) {
            try {
                ntiVar = (nti) ((ConcurrentHashMap) this.b).get(uTDimensionValueSet);
                if (ntiVar == null) {
                    ntiVar = (nti) to1.a().d(nti.class, new Object[0]);
                    ((ConcurrentHashMap) this.b).put(uTDimensionValueSet, ntiVar);
                    nhh.f("EventRepo", "put in Map utDimensionValues", uTDimensionValueSet);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ntiVar.a(eventId, str, str2, str3, cls);
    }

    public Map<UTDimensionValueSet, List<ej8>> u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eddc63ce", new Object[]{this, new Integer(i)});
        }
        HashMap hashMap = new HashMap();
        synchronized (this.b) {
            try {
                Iterator it = ((ConcurrentHashMap) this.b).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    UTDimensionValueSet uTDimensionValueSet = (UTDimensionValueSet) entry.getKey();
                    nti ntiVar = (nti) entry.getValue();
                    if (uTDimensionValueSet.getEventId().intValue() == i) {
                        if (ntiVar != null) {
                            hashMap.put(uTDimensionValueSet, ntiVar.b());
                        } else {
                            nhh.f("error", "utDimensionValues", uTDimensionValueSet);
                        }
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q(i).set(0);
        return hashMap;
    }

    public void k(int i, String str, String str2, MeasureValueSet measureValueSet, DimensionValueSet dimensionValueSet, Long l, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4287ba8e", new Object[]{this, new Integer(i), str, str2, measureValueSet, dimensionValueSet, l, str3, str4});
            return;
        }
        Metric c = lti.d().c(str, str2);
        if (c != null) {
            if (c.getDimensionSet() != null) {
                c.getDimensionSet().setConstantValue(dimensionValueSet);
            }
            if (c.getMeasureSet() != null) {
                c.getMeasureSet().setConstantValue(measureValueSet);
            }
            UTDimensionValueSet p = p(i, l, str3, str4);
            miq miqVar = (miq) r(p, str, str2, null, miq.class);
            if (miqVar != null) {
                miqVar.d(dimensionValueSet, measureValueSet);
            }
            if (o2w.k().E()) {
                miq miqVar2 = (miq) to1.a().d(miq.class, Integer.valueOf(i), str, str2);
                miqVar2.d(dimensionValueSet, measureValueSet);
                j4v.b(p, miqVar2);
            }
            g(EventType.getEventType(i), this.e);
            return;
        }
        nhh.i("metric is null,stat commit failed,please call AppMonitor.register() once before AppMonitor.STAT.commit()", new Object[0]);
    }
}
