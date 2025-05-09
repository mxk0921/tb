package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.turbo.monitor.Monitor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class plk<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f26155a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601225);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601224);
    }

    public final void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5de3fa", new Object[]{this, t});
        } else if (!b(t)) {
            ((CopyOnWriteArrayList) this.f26155a).add(t);
        }
    }

    public final boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0570437", new Object[]{this, t})).booleanValue();
        }
        return ((CopyOnWriteArrayList) this.f26155a).contains(t);
    }

    public final void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a8b49d", new Object[]{this, t});
        } else {
            ((CopyOnWriteArrayList) this.f26155a).remove(t);
        }
    }

    public final void d(g1a<? super T, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fefd80b", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "traverseAction");
        Iterator it = ((CopyOnWriteArrayList) this.f26155a).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                try {
                    g1aVar.invoke(next);
                } catch (Exception e) {
                    Map<String, ? extends Object> j = kotlin.collections.a.j(jpu.a("eventName", g1aVar.getClass().getName()), jpu.a(FluidException.OBSERVER_NAME, next.getClass().getName()));
                    gi8 gi8Var = gi8.INSTANCE;
                    gi8Var.a("traversal error, observer " + next, j, Monitor.Type.FRAMEWORK, Monitor.Code.NOTIFY_ERROR, true, e);
                }
            }
        }
    }
}
