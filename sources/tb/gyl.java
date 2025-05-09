package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import java.util.HashSet;
import java.util.Map;
import tb.k04;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class gyl<TCollector extends k04<CollectResult>, CollectResult> extends kti<TCollector, CollectResult> implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int e;
    private Map<String, ?> f;

    public gyl(MetricContext metricContext, c0c c0cVar, TCollector tcollector) {
        super(metricContext, c0cVar, tcollector);
    }

    private void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991bffcd", new Object[]{this, new Integer(i)});
            return;
        }
        long i2 = i(i);
        if (i2 > 0) {
            this.f22911a.getDefaultInnerHandler().postDelayed(this, i2 * 1000);
            return;
        }
        throw new RuntimeException("repeatInterval must be > 0");
    }

    public static /* synthetic */ Object ipc$super(gyl gylVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244337372) {
            super.onEvent(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        } else if (hashCode == 1373314399) {
            super.f();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/metrickit/processor/PeriodMetricProcessor");
        }
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[0];
    }

    @Override // tb.kti
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
            return;
        }
        super.f();
        EventCenter eventCenter = this.f22911a.getEventCenter();
        eventCenter.j(j(), this);
        eventCenter.j(k(), this);
        this.f22911a.getDefaultInnerHandler().removeCallbacks(this);
    }

    @Override // tb.kti
    public final void g(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8965214c", new Object[]{this, metricContext});
            return;
        }
        HashSet hashSet = new HashSet();
        rz3.a(hashSet, c());
        rz3.a(hashSet, this.c.b());
        rz3.a(hashSet, j());
        rz3.a(hashSet, k());
        metricContext.getEventCenter().d(rz3.d(hashSet), this);
    }

    public abstract long i(int i);

    public abstract int[] j();

    public abstract int[] k();

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d45ba8a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33018feb", new Object[]{this});
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08b2329", new Object[]{this});
        }
    }

    @Override // tb.kti, tb.n3c
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
            return;
        }
        if (rz3.c(this.c.b(), i)) {
            super.onEvent(i, map);
        }
        if (rz3.c(c(), i)) {
            super.onEvent(i, map);
        }
        if (rz3.c(k(), i)) {
            this.f22911a.getDefaultInnerHandler().removeCallbacks(this);
            n();
            this.f = null;
        }
        if (rz3.c(j(), i)) {
            this.e = i;
            this.f = map;
            m();
            if (l()) {
                run();
            } else {
                h(i);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        h(this.e);
        a(this.c.a(this.e, this.f));
    }
}
