package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.e5e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b6v implements e5e, f5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<e5e.a> f16220a = new CopyOnWriteArrayList();

    static {
        t2o.a(729809977);
        t2o.a(729809986);
        t2o.a(729809991);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.f16220a).clear();
        }
    }

    @Override // tb.e5e
    public void c(e5e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70f359", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArrayList) this.f16220a).add(aVar);
        }
    }

    @Override // tb.f5e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8049d3", new Object[]{this});
        } else if (!((CopyOnWriteArrayList) this.f16220a).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f16220a).iterator();
            while (it.hasNext()) {
                ((e5e.a) it.next()).onError();
            }
        }
    }

    @Override // tb.e5e
    public void i(e5e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33d7c7c", new Object[]{this, aVar});
        } else if (!((CopyOnWriteArrayList) this.f16220a).isEmpty() && aVar != null) {
            ((CopyOnWriteArrayList) this.f16220a).remove(aVar);
        }
    }

    @Override // tb.f5e
    public void j(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480e1108", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!((CopyOnWriteArrayList) this.f16220a).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f16220a).iterator();
            while (it.hasNext()) {
                ((e5e.a) it.next()).a(z, z2, z3);
            }
        }
    }
}
