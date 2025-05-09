package com.alibaba.poplayer.layermanager;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.a;
import com.alibaba.poplayer.layermanager.c;
import com.alibaba.poplayer.layermanager.view.Canvas;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.dua;
import tb.hst;
import tb.t2o;
import tb.wdm;
import tb.wgm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f2529a = new CopyOnWriteArrayList();
    public Canvas b;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.poplayer.layermanager.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class RunnableC0092a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0092a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View i;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Canvas f = a.this.f();
            if (f == null) {
                wdm.d("%s. updateCanvas ,but lose canvas.", toString());
                return;
            }
            for (c cVar : a.c(a.this)) {
                PopRequest d = cVar.d();
                if (cVar.k()) {
                    View findViewByLevel = f.findViewByLevel(cVar.g());
                    if (findViewByLevel != null) {
                        f.removeView(findViewByLevel);
                        if (findViewByLevel instanceof PopLayerBaseView) {
                            ((PopLayerBaseView) findViewByLevel).onViewUIRemoved();
                        }
                    }
                    if (d.i() == null) {
                        d.E(findViewByLevel);
                    }
                } else if (cVar.j()) {
                    View findViewByLevel2 = f.findViewByLevel(cVar.g());
                    if (findViewByLevel2 != null) {
                        f.removeView(findViewByLevel2);
                        if (findViewByLevel2 instanceof PopLayerBaseView) {
                            ((PopLayerBaseView) findViewByLevel2).onViewUIRemoved();
                        }
                        wdm.d("%s. remove Layer {level:%s}.", toString(), Integer.valueOf(cVar.g()));
                    }
                    if (!(d == null || (i = d.i()) == null)) {
                        if (i.getParent() != null) {
                            ((ViewGroup) i.getParent()).removeView(i);
                        }
                        boolean z2 = i instanceof PopLayerBaseView;
                        if (z2) {
                            z = ((PopLayerBaseView) i).shouldViewUIAdd();
                        } else {
                            z = true;
                        }
                        if (z) {
                            f.addViewByLevel(d, i, cVar.g());
                            if (z2) {
                                ((PopLayerBaseView) i).onViewUIAdded();
                            }
                            wgm.a(d, PopRequest.Status.SHOWING);
                            wdm.d("%s. add Layer {level:%s}.", toString(), Integer.valueOf(cVar.g()));
                        } else {
                            wdm.d("%s. add Layer cancel {level:%s}.shouldViewUIAdd=false", toString(), Integer.valueOf(cVar.g()));
                        }
                    }
                    cVar.b();
                }
            }
        }
    }

    static {
        t2o.a(625999944);
    }

    public static /* synthetic */ List c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e8c83a44", new Object[]{aVar});
        }
        return aVar.f2529a;
    }

    public static /* synthetic */ int i(c cVar, c cVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26ac79be", new Object[]{cVar, cVar2})).intValue();
        }
        return cVar.g() - cVar2.g();
    }

    public synchronized void b(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bea6664", new Object[]{this, list});
            return;
        }
        dua<c, PopRequest> d = d(list);
        for (c cVar : d.b().keySet()) {
            cVar.a(d.a(cVar));
        }
        n();
    }

    public final dua<c, PopRequest> d(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dua) ipChange.ipc$dispatch("1e74ac2e", new Object[]{this, list});
        }
        dua<c, PopRequest> duaVar = new dua<>();
        for (PopRequest popRequest : list) {
            duaVar.c(e(((b) popRequest.m()).d), popRequest);
        }
        return duaVar;
    }

    public final c e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("22f6578c", new Object[]{this, new Integer(i)});
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2529a).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.g() == i) {
                return cVar;
            }
        }
        c cVar2 = new c(i);
        ((CopyOnWriteArrayList) this.f2529a).add(cVar2);
        ArrayList arrayList = new ArrayList(this.f2529a);
        Collections.sort(arrayList, new Comparator() { // from class: tb.v33
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i2;
                i2 = a.i((c) obj, (c) obj2);
                return i2;
            }
        });
        ((CopyOnWriteArrayList) this.f2529a).clear();
        ((CopyOnWriteArrayList) this.f2529a).addAll(arrayList);
        return cVar2;
    }

    public Canvas f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Canvas) ipChange.ipc$dispatch("dcb0be09", new Object[]{this});
        }
        return this.b;
    }

    public synchronized void g(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2da8b5", new Object[]{this, list});
            return;
        }
        dua<c, PopRequest> d = d(list);
        for (c cVar : d.b().keySet()) {
            cVar.h(d.a(cVar).get(0));
        }
        n();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7743a6d", new Object[]{this})).booleanValue();
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2529a).iterator();
        while (it.hasNext()) {
            if (((c) it.next()).i()) {
                return true;
            }
        }
        return false;
    }

    public int j(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91e52d3f", new Object[]{this, popRequest})).intValue();
        }
        return e(((b) popRequest.m()).d).l();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bff04c7", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2529a).iterator();
        while (it.hasNext()) {
            ((c) it.next()).m();
        }
    }

    public synchronized void l(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20dd7e0", new Object[]{this, list});
            return;
        }
        dua<c, PopRequest> d = d(list);
        for (c cVar : d.b().keySet()) {
            cVar.o(d.a(cVar));
        }
        n();
    }

    public void m(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34730083", new Object[]{this, canvas});
        } else {
            this.b = canvas;
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1fb88", new Object[]{this});
        } else {
            hst.c(new RunnableC0092a());
        }
    }

    public void o(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38bd3b7a", new Object[]{this, popRequest});
            return;
        }
        c e = e(((b) popRequest.m()).d);
        if (e.d() != popRequest) {
            wdm.d("%s.viewReadyNotify=>request not match!", toString());
            return;
        }
        wdm.d("%s.viewReadyNotify=>readyToShow!", toString());
        e.n();
        n();
    }
}
