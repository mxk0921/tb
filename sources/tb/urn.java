package tb;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.h6c;
import tb.lgc;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class urn implements g6c<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<h6c.a<RecyclerView>> f29571a;
    public List<h6c.c<RecyclerView>> b;
    public List<View.OnAttachStateChangeListener> c;
    public List<sgc.b> d;
    public List<sgc.a> e;
    public List<h6c.e> f;
    public List<wu> g;
    public List<lgc.a> h;
    public List<h6c.b> i;
    public List<h6c.d> j;

    static {
        t2o.a(486539706);
        t2o.a(488636466);
    }

    @Override // tb.mgc
    public void A(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124a18eb", new Object[]{this, viewHolder});
            return;
        }
        List<lgc.a> list = this.h;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                lgc.a aVar = (lgc.a) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar.k(viewHolder);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyItemRemoveStarting " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.sgc
    public void B(sgc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2f7c44", new Object[]{this, aVar});
            return;
        }
        List<sgc.a> list = this.e;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // tb.sgc
    public void C(sgc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a0c621", new Object[]{this, aVar});
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArrayList();
        }
        this.e.add(aVar);
    }

    @Override // tb.k6c
    public void D(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46b8c8e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                h6c.c cVar = (h6c.c) it.next();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                cVar.n(z, z2);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyEdgeSate " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms");
                }
            }
            if (eue.b()) {
                fve.k("RecycleViewLifeCycleCenter", "notifyReachEdge  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            }
        }
    }

    @Override // tb.b6c
    public void E(wu wuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1971cda5", new Object[]{this, wuVar});
            return;
        }
        List<wu> list = this.g;
        if (list != null) {
            list.remove(wuVar);
        }
    }

    @Override // tb.h6c
    public void F(h6c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5969f1c", new Object[]{this, aVar});
            return;
        }
        List<h6c.a<RecyclerView>> list = this.f29571a;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // tb.c6c
    public void G(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb21d5", new Object[]{this, new Integer(i), new Integer(i2), obj});
            return;
        }
        List<wu> list = this.g;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                wu wuVar = (wu) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                wuVar.d(i, i2, obj);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyOnItemRangeChanged 2 " + wuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.k6c
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a067a6", new Object[]{this});
            return;
        }
        List<h6c.b> list = this.i;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((h6c.b) it.next()).c();
            }
        }
    }

    @Override // tb.mgc
    public void I(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8b0cc2", new Object[]{this, viewHolder});
            return;
        }
        List<lgc.a> list = this.h;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                lgc.a aVar = (lgc.a) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar.e(viewHolder);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyItemAddFinished " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.b6c
    public void J(wu wuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981126a8", new Object[]{this, wuVar});
            return;
        }
        if (this.g == null) {
            this.g = new CopyOnWriteArrayList();
        }
        this.g.add(wuVar);
    }

    @Override // tb.c6c
    public void K(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef0738b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        List<wu> list = this.g;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                wu wuVar = (wu) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                wuVar.f(i, i2, i3);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyOnItemRangeMoved 2 " + wuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.h6c
    public void L(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef335c71", new Object[]{this, onAttachStateChangeListener});
            return;
        }
        List<View.OnAttachStateChangeListener> list = this.c;
        if (list != null) {
            list.remove(onAttachStateChangeListener);
        }
    }

    @Override // tb.h6c
    public void M(h6c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc999160", new Object[]{this, bVar});
            return;
        }
        if (this.i == null) {
            this.i = new CopyOnWriteArrayList();
        }
        this.i.add(bVar);
    }

    @Override // tb.k6c
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4b909c", new Object[]{this});
            return;
        }
        List<h6c.d> list = this.j;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((h6c.d) it.next()).a();
            }
        }
    }

    @Override // tb.ugc
    public void O(boolean z, int i, BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece5e228", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            return;
        }
        List<sgc.a> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                sgc.a aVar = (sgc.a) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar.b(z, i, baseSectionModel, view);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyOnBindDataEnd " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.ugc
    public void P(int i, View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c08d2e5", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (this.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
            while (it.hasNext()) {
                sgc.b bVar = (sgc.b) it.next();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                bVar.h(i, view, baseSectionModel);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "itemDisAppear " + bVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms");
                }
            }
            if (eue.b()) {
                fve.k("RecycleViewLifeCycleCenter", "notifyItemDisAppear  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            }
        }
    }

    @Override // tb.h6c
    public void Q(h6c.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d5c762", new Object[]{this, eVar});
            return;
        }
        if (this.f == null) {
            this.f = new CopyOnWriteArrayList();
        }
        this.f.add(eVar);
    }

    @Override // tb.ugc
    public void R(int i, View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b993396f", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (this.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
            while (it.hasNext()) {
                sgc.b bVar = (sgc.b) it.next();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                bVar.o(i, view, baseSectionModel);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "itemAppear " + bVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms");
                }
            }
            if (eue.b()) {
                fve.k("RecycleViewLifeCycleCenter", "notifyItemAppear  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            }
        }
    }

    @Override // tb.k6c
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd23e5d", new Object[]{this});
            return;
        }
        List<h6c.b> list = this.i;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((h6c.b) it.next()).d();
            }
        }
    }

    @Override // tb.ugc
    public void U(int i, BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db78e21", new Object[]{this, new Integer(i), baseSectionModel, view});
            return;
        }
        List<sgc.a> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                sgc.a aVar = (sgc.a) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar.a(i, baseSectionModel, view);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "onBindDataStart " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    /* renamed from: V */
    public void S(Canvas canvas, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ccb031", new Object[]{this, canvas, recyclerView});
            return;
        }
        List<h6c.a<RecyclerView>> list = this.f29571a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((h6c.a) it.next()).b(canvas, recyclerView);
            }
        }
    }

    /* renamed from: W */
    public void e(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd210eb", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        List<h6c.c<RecyclerView>> list = this.b;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                h6c.c cVar = (h6c.c) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cVar.onScrollStateChanged(recyclerView, i);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "onScrollStateChanged " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    /* renamed from: X */
    public void d(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c12d1c", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (this.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                h6c.c cVar = (h6c.c) it.next();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                cVar.onScrolled(recyclerView, i, i2);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "onScrolled " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms");
                }
            }
            if (eue.b()) {
                fve.k("RecycleViewLifeCycleCenter", "notifyOnScrolled  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            }
        }
    }

    @Override // tb.k6c
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae14516f", new Object[]{this, view});
            return;
        }
        List<View.OnAttachStateChangeListener> list = this.c;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                onAttachStateChangeListener.onViewAttachedToWindow(view);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "onViewAttachedToWindow " + onAttachStateChangeListener.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.ugc
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31dcf3e2", new Object[]{this, view});
            return;
        }
        List<sgc.b> list = this.d;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                sgc.b bVar = (sgc.b) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bVar.a(view);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "onCreateView " + bVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.ugc
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c265e124", new Object[]{this, new Boolean(z)});
            return;
        }
        List<h6c.e> list = this.f;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((h6c.e) it.next()).b(z);
            }
        }
    }

    @Override // tb.h6c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<h6c.a<RecyclerView>> list = this.f29571a;
        if (list != null) {
            list.clear();
            this.f29571a = null;
        }
        List<h6c.c<RecyclerView>> list2 = this.b;
        if (list2 != null) {
            list2.clear();
            this.b = null;
        }
        List<View.OnAttachStateChangeListener> list3 = this.c;
        if (list3 != null) {
            list3.clear();
            this.c = null;
        }
        List<sgc.b> list4 = this.d;
        if (list4 != null) {
            list4.clear();
            this.d = null;
        }
        List<sgc.a> list5 = this.e;
        if (list5 != null) {
            list5.clear();
            this.e = null;
        }
        List<wu> list6 = this.g;
        if (list6 != null) {
            list6.clear();
            this.g = null;
        }
        List<h6c.b> list7 = this.i;
        if (list7 != null) {
            list7.clear();
            this.i = null;
        }
    }

    @Override // tb.k6c
    public void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7bbed2", new Object[]{this, view});
            return;
        }
        List<View.OnAttachStateChangeListener> list = this.c;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                onAttachStateChangeListener.onViewDetachedFromWindow(view);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "onViewDetachedFromWindow " + onAttachStateChangeListener.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.h6c
    public void g(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b7dce", new Object[]{this, onAttachStateChangeListener});
            return;
        }
        if (this.c == null) {
            this.c = new CopyOnWriteArrayList();
        }
        this.c.add(onAttachStateChangeListener);
    }

    @Override // tb.h6c
    public void h(h6c.c<RecyclerView> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2abf2c", new Object[]{this, cVar});
            return;
        }
        if (this.b == null) {
            this.b = new CopyOnWriteArrayList();
        }
        this.b.add(cVar);
    }

    @Override // tb.h6c
    public void i(h6c.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2aa6cd2", new Object[]{this, dVar});
            return;
        }
        if (this.j == null) {
            this.j = new CopyOnWriteArrayList();
        }
        this.j.add(dVar);
    }

    @Override // tb.c6c
    public void j(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83679aa1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<wu> list = this.g;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                wu wuVar = (wu) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                wuVar.e(i, i2);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyOnItemRangeInserted " + wuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.h6c
    public void k(h6c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfb3ddd", new Object[]{this, bVar});
            return;
        }
        List<h6c.b> list = this.i;
        if (list != null) {
            list.remove(bVar);
        }
    }

    @Override // tb.ugc
    public void l(boolean z, int i, BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4701a05", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            return;
        }
        List<sgc.b> list = this.d;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                sgc.b bVar = (sgc.b) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bVar.i(z, i, baseSectionModel, view);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "onBindData " + bVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.h6c
    public void m(h6c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e09791f", new Object[]{this, aVar});
            return;
        }
        if (this.f29571a == null) {
            this.f29571a = new CopyOnWriteArrayList();
        }
        this.f29571a.add(aVar);
    }

    @Override // tb.lgc
    public void n(lgc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d519b861", new Object[]{this, aVar});
            return;
        }
        List<lgc.a> list = this.h;
        if (list != null) {
            ((CopyOnWriteArrayList) list).remove(aVar);
        }
    }

    @Override // tb.h6c
    public void o(h6c.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1155e45", new Object[]{this, eVar});
            return;
        }
        List<h6c.e> list = this.f;
        if (list != null) {
            ((CopyOnWriteArrayList) list).remove(eVar);
        }
    }

    @Override // tb.k6c
    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc97734", new Object[]{this, new Integer(i)});
            return;
        }
        List<h6c.a<RecyclerView>> list = this.f29571a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((h6c.a) it.next()).a(i);
            }
        }
    }

    @Override // tb.sgc
    public void q(sgc.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116dd724", new Object[]{this, bVar});
            return;
        }
        List<sgc.b> list = this.d;
        if (list != null) {
            list.remove(bVar);
        }
    }

    @Override // tb.c6c
    public void r(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd3b2e5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<wu> list = this.g;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                wu wuVar = (wu) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                wuVar.g(i, i2);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyOnItemRangeRemoved " + wuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.h6c
    public void s(h6c.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127aed8f", new Object[]{this, dVar});
            return;
        }
        List<h6c.d> list = this.j;
        if (list != null) {
            ((CopyOnWriteArrayList) list).remove(dVar);
        }
    }

    @Override // tb.c6c
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253a6d13", new Object[]{this});
            return;
        }
        List<wu> list = this.g;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                wu wuVar = (wu) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                wuVar.b();
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyOnChanged " + wuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.c6c
    public void u(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc36ee39", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<wu> list = this.g;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                wu wuVar = (wu) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                wuVar.c(i, i2);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyOnItemRangeChanged " + wuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.h6c
    public void v(h6c.c<RecyclerView> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95babcf", new Object[]{this, cVar});
            return;
        }
        List<h6c.c<RecyclerView>> list = this.b;
        if (list != null) {
            list.remove(cVar);
        }
    }

    @Override // tb.mgc
    public void w(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4452f10", new Object[]{this, viewHolder});
            return;
        }
        List<lgc.a> list = this.h;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                lgc.a aVar = (lgc.a) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar.f(viewHolder);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyItemAddStarting " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }

    @Override // tb.lgc
    public void x(lgc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd1aa24", new Object[]{this, aVar});
            return;
        }
        if (this.h == null) {
            this.h = new CopyOnWriteArrayList();
        }
        this.h.add(aVar);
    }

    @Override // tb.sgc
    public void y(sgc.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53cea81", new Object[]{this, bVar});
            return;
        }
        if (this.d == null) {
            this.d = new CopyOnWriteArrayList();
        }
        this.d.add(bVar);
    }

    @Override // tb.mgc
    public void z(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8ff69d", new Object[]{this, viewHolder});
            return;
        }
        List<lgc.a> list = this.h;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                lgc.a aVar = (lgc.a) it.next();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar.g(viewHolder);
                if (eue.b()) {
                    fve.k("RecycleViewLifeCycleCenter", "notifyItemRemoveFinished " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
        }
    }
}
