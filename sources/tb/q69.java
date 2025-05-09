package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q69 implements m6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<l6c> f26541a = new CopyOnWriteArrayList();

    static {
        t2o.a(729810194);
        t2o.a(729810198);
    }

    @Override // tb.m6c
    public void a(l6c l6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f665d7", new Object[]{this, l6cVar});
        } else {
            ((CopyOnWriteArrayList) this.f26541a).add(l6cVar);
        }
    }

    @Override // tb.m6c
    public void b(l6c l6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c94194", new Object[]{this, l6cVar});
        } else if (!((CopyOnWriteArrayList) this.f26541a).isEmpty()) {
            ((CopyOnWriteArrayList) this.f26541a).remove(l6cVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.f26541a).clear();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f935d2f8", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f26541a).iterator();
        while (it.hasNext()) {
            ((l6c) it.next()).onFestivalChanged();
        }
    }
}
