package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f78<T> implements p1c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f19064a;
    public final List<q2d<T>> b = new ArrayList();

    static {
        t2o.a(511705454);
        t2o.a(511705456);
    }

    @Override // tb.n2d
    public void b(q2d<T> q2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c5163", new Object[]{this, q2dVar});
        } else if (((ArrayList) this.b).contains(q2dVar)) {
            ((ArrayList) this.b).remove(q2dVar);
        }
    }

    @Override // tb.n2d
    public void c(q2d<T> q2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c455f526", new Object[]{this, q2dVar});
        } else if (!((ArrayList) this.b).contains(q2dVar)) {
            ((ArrayList) this.b).add(q2dVar);
        }
    }

    @Override // tb.p1c
    public T get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return this.f19064a;
    }

    @Override // tb.p1c
    public void set(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, t});
            return;
        }
        this.f19064a = t;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((q2d) it.next()).a(this);
        }
    }
}
