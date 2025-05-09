package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.i6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class inl implements m6d, i6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<i6d.a> f21451a = new CopyOnWriteArrayList();
    public List<i6d.b> b = new CopyOnWriteArrayList();
    public List<i6d.c> c = new CopyOnWriteArrayList();

    static {
        t2o.a(729809975);
        t2o.a(729809988);
        t2o.a(729809978);
    }

    @Override // tb.i6d
    public void a(i6d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3f4379", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.f21451a.remove(aVar);
        }
    }

    @Override // tb.i6d
    public void b(i6d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee580656", new Object[]{this, aVar});
            return;
        }
        if (this.f21451a == null) {
            this.f21451a = new CopyOnWriteArrayList();
        }
        this.f21451a.add(aVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f21451a.clear();
        this.b.clear();
        this.c.clear();
    }

    @Override // tb.m6d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7339c67", new Object[]{this, view});
            return;
        }
        List<i6d.a> list = this.f21451a;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f21451a).iterator();
            while (it.hasNext()) {
                ((i6d.a) it.next()).onChildViewDetachedFromWindow(view);
            }
        }
    }

    @Override // tb.i6d
    public void e(i6d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5f8152", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.c.remove(cVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbfa2e3", new Object[]{this});
            return;
        }
        List<i6d.b> list = this.b;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((i6d.b) it.next()).a();
            }
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e60cb97", new Object[]{this});
            return;
        }
        List<i6d.b> list = this.b;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((i6d.b) it.next()).destroyContainer();
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce048aa4", new Object[]{this});
            return;
        }
        List<i6d.c> list = this.c;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((i6d.c) it.next()).a();
            }
        }
    }

    @Override // tb.i6d
    public void k(i6d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838b9e2f", new Object[]{this, cVar});
            return;
        }
        if (this.c == null) {
            this.c = new CopyOnWriteArrayList();
        }
        this.c.add(cVar);
    }

    @Override // tb.i6d
    public void l(i6d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6cff97", new Object[]{this, bVar});
            return;
        }
        if (this.b == null) {
            this.b = new CopyOnWriteArrayList();
        }
        this.b.add(bVar);
    }

    @Override // tb.i6d
    public void n(i6d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414592fa", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.b.remove(bVar);
        }
    }

    @Override // tb.m6d
    public void q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe09044", new Object[]{this, view});
            return;
        }
        List<i6d.a> list = this.f21451a;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f21451a).iterator();
            while (it.hasNext()) {
                ((i6d.a) it.next()).onChildViewAttachedToWindow(view);
            }
        }
    }

    @Override // tb.m6d
    public void s(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed21d9f", new Object[]{this, new Long(j)});
            return;
        }
        List<i6d.c> list = this.c;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((i6d.c) it.next()).b(j);
            }
        }
    }
}
