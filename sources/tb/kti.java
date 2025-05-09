package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import java.util.HashSet;
import java.util.Map;
import tb.k04;
import tb.kti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class kti<TCollector extends k04<CollectResult>, CollectResult> implements n3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MetricContext f22911a;
    public final c0c b;
    public final TCollector c;
    private zd1<CollectResult> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements zd1<CollectResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final /* synthetic */ void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dda2507d", new Object[]{this, obj});
            } else {
                kti.this.a(obj);
            }
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            }
        }

        public void d(final CollectResult collectresult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, collectresult});
                return;
            }
            ae1 ae1Var = (ae1) kti.this.c;
            if (ae1Var.f().getLooper().getThread() == Thread.currentThread()) {
                kti.this.a(collectresult);
            } else {
                ae1Var.f().post(new Runnable() { // from class: tb.jti
                    @Override // java.lang.Runnable
                    public final void run() {
                        kti.a.this.b(collectresult);
                    }
                });
            }
        }
    }

    public kti(MetricContext metricContext, c0c c0cVar, TCollector tcollector) {
        this.f22911a = metricContext;
        this.b = c0cVar;
        this.c = tcollector;
        d(metricContext);
        g(metricContext);
    }

    public abstract void a(CollectResult collectresult);

    public h3c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3c) ipChange.ipc$dispatch("6a72feb2", new Object[]{this});
        }
        return null;
    }

    public abstract int[] c();

    public void d(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7de89c3", new Object[]{this, metricContext});
        } else if (this.c instanceof ae1) {
            this.d = new a();
        }
    }

    public boolean e(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44ab3bf6", new Object[]{this, new Integer(i), map})).booleanValue();
        }
        h3c b = b();
        if (b == null || !b.a(i, map)) {
            return false;
        }
        return true;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
            return;
        }
        EventCenter eventCenter = this.f22911a.getEventCenter();
        eventCenter.j(c(), this);
        TCollector tcollector = this.c;
        if (tcollector != null) {
            eventCenter.j(tcollector.b(), this);
            this.c.c();
        }
    }

    public void g(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8965214c", new Object[]{this, metricContext});
            return;
        }
        HashSet hashSet = new HashSet();
        rz3.a(hashSet, c());
        rz3.a(hashSet, this.c.b());
        metricContext.getEventCenter().d(rz3.d(hashSet), this);
    }

    @Override // tb.n3c
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (!e(i, map)) {
            if (rz3.c(this.c.b(), i)) {
                this.c.d(i, map);
                return;
            }
            TCollector tcollector = this.c;
            if (tcollector instanceof ae1) {
                ((ae1) tcollector).e(i, map, this.d);
            } else {
                a(tcollector.a(i, map));
            }
        }
    }
}
