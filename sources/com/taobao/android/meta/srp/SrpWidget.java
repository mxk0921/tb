package com.taobao.android.meta.srp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.srp.SrpWidget;
import com.taobao.android.meta.structure.state.page.MetaPageStateWidget;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import java.util.ArrayList;
import java.util.Iterator;
import tb.acx;
import tb.ckf;
import tb.d1a;
import tb.esi;
import tb.hfn;
import tb.iuc;
import tb.juc;
import tb.k4k;
import tb.kae;
import tb.ksi;
import tb.neq;
import tb.njg;
import tb.pqs;
import tb.r4p;
import tb.t2o;
import tb.ude;
import tb.vfw;
import tb.vrd;
import tb.woz;
import tb.x02;
import tb.y64;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class SrpWidget<D extends a<C, R>, C extends y64, R extends MetaResult<C>> extends ksi<D, C, neq, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final neq h;
    public pqs i;
    public esi j;
    public final ArrayList<ytc> k = new ArrayList<>();
    public final njg l = kotlin.a.b(new d1a() { // from class: tb.toz
        @Override // tb.d1a
        public final Object invoke() {
            kae m;
            m = SrpWidget.m(SrpWidget.this);
            return m;
        }
    });
    public final njg m = kotlin.a.b(new d1a() { // from class: tb.uoz
        @Override // tb.d1a
        public final Object invoke() {
            vrd n;
            n = SrpWidget.n(SrpWidget.this);
            return n;
        }
    });

    static {
        t2o.a(993001502);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SrpWidget(neq neqVar, Activity activity, ude udeVar, acx<D> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(neqVar, activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(neqVar, "config");
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        this.h = neqVar;
    }

    public static /* synthetic */ void d(SrpWidget srpWidget) {
        j(srpWidget);
    }

    public static final void i(SrpWidget srpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0bb922", new Object[]{srpWidget});
            return;
        }
        ckf.g(srpWidget, "this$0");
        ((iuc) srpWidget.u2()).b(srpWidget.m3());
        MetaPageStateWidget K2 = srpWidget.K2();
        if (K2 != null) {
            K2.A2(srpWidget.f3());
        }
    }

    public static /* synthetic */ Object ipc$super(SrpWidget srpWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1444093522) {
            super.x2((BaseMetaPageController) objArr[0]);
            return null;
        } else if (hashCode == 581789757) {
            super.M2((MetaResult) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/meta/srp/SrpWidget");
        }
    }

    public static final void j(SrpWidget srpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff82281", new Object[]{srpWidget});
            return;
        }
        ckf.g(srpWidget, "this$0");
        ((iuc) srpWidget.u2()).u(-((juc) srpWidget.t2()).j().getHiddenHeight());
    }

    public static final void k(SrpWidget srpWidget, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7bf3ac4", new Object[]{srpWidget, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            return;
        }
        ckf.g(srpWidget, "this$0");
        if (((juc) srpWidget.t2()).j().getListStart() != srpWidget.f3()) {
            MetaPageStateWidget K2 = srpWidget.K2();
            if (K2 != null) {
                K2.A2(srpWidget.f3());
            }
            ((juc) srpWidget.t2()).j().setListStart(srpWidget.f3());
        }
    }

    public static final void l(SrpWidget srpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a1562d", new Object[]{srpWidget});
            return;
        }
        ckf.g(srpWidget, "this$0");
        srpWidget.g3().attachToContainer();
    }

    public static final kae m(SrpWidget srpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("5a92c2b4", new Object[]{srpWidget});
        }
        ckf.g(srpWidget, "this$0");
        x02 v2 = srpWidget.v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.e = new k4k();
        Object a2 = srpWidget.J2().k1().a(v2);
        ckf.f(a2, "create(...)");
        return (kae) a2;
    }

    public static final vrd n(SrpWidget srpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrd) ipChange.ipc$dispatch("2e73ac2b", new Object[]{srpWidget});
        }
        ckf.g(srpWidget, "this$0");
        return srpWidget.p3();
    }

    @Override // tb.ksi
    public void M2(MetaResult<C> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad683d", new Object[]{this, metaResult});
            return;
        }
        ckf.g(metaResult, "result");
        if (this.h.l1()) {
            ((iuc) u2()).b(m3());
        } else {
            ((iuc) u2()).b(f3() + i3());
        }
        if (this.h.f1()) {
            a3(g3(), metaResult);
        }
        super.M2(metaResult);
        Z2(metaResult);
        ((acx) getModel()).f().setParam(r4p.KEY_HAS_TAB, String.valueOf(I2()));
        ((a) ((acx) getModel()).b()).setParam(r4p.KEY_HAS_TAB, String.valueOf(I2()));
        ((juc) t2()).commit();
    }

    public void a3(kae<?, ?> kaeVar, MetaResult<C> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6a79a", new Object[]{this, kaeVar, metaResult});
            return;
        }
        ckf.g(kaeVar, "searchBarWidget");
        ckf.g(metaResult, "result");
    }

    public final void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b3e825", new Object[]{this});
            return;
        }
        ((juc) t2()).j().clearHeaders(true);
        this.k.clear();
    }

    public final void c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c307d2", new Object[]{this});
            return;
        }
        esi esiVar = this.j;
        if (esiVar != null) {
            ((juc) t2()).j().addHeader(esiVar);
        }
        Iterator<ytc> it = this.k.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            ytc next = it.next();
            ckf.f(next, "next(...)");
            ((juc) t2()).j().addHeader(next);
        }
        pqs pqsVar = this.i;
        if (pqsVar != null) {
            ((juc) t2()).j().addHeader(pqsVar);
        }
        ((juc) t2()).j().commit(true);
        q3();
    }

    public final esi e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esi) ipChange.ipc$dispatch("b56547ee", new Object[]{this});
        }
        return this.j;
    }

    public final int f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de96", new Object[]{this})).intValue();
        }
        if (!this.h.f1()) {
            return 0;
        }
        View view = g3().getView();
        ckf.d(view);
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight != 0) {
            return measuredHeight;
        }
        View view2 = g3().getView();
        ckf.d(view2);
        view2.measure(View.MeasureSpec.makeMeasureSpec(getActivity().getWindow().getDecorView().getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        View view3 = g3().getView();
        ckf.d(view3);
        return view3.getMeasuredHeight();
    }

    public final kae<?, ?> g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("f067a8fc", new Object[]{this});
        }
        return (kae) this.l.getValue();
    }

    public final pqs h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqs) ipChange.ipc$dispatch("71f2a9f0", new Object[]{this});
        }
        return this.i;
    }

    public int i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a2fcbe0", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final vrd j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrd) ipChange.ipc$dispatch("2522194e", new Object[]{this});
        }
        return (vrd) this.m.getValue();
    }

    public final ArrayList<ytc> k3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d87a9e48", new Object[]{this});
        }
        return this.k;
    }

    public final int l3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe0bb5e8", new Object[]{this})).intValue();
        }
        Iterator<ytc> it = this.k.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            ytc next = it.next();
            ckf.f(next, "next(...)");
            i += next.getHeight();
        }
        return i;
    }

    public final int m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b76e4f", new Object[]{this})).intValue();
        }
        return hfn.c(i3() + f3(), i3() + l3());
    }

    public final boolean n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b1db9b6", new Object[]{this})).booleanValue();
        }
        if (this.k.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af05d65f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract vrd p3();

    public void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1456210c", new Object[]{this});
        }
    }

    @Override // tb.ksi
    public void x2(BaseMetaPageController<D, C, R> baseMetaPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ece1ae", new Object[]{this, baseMetaPageController});
            return;
        }
        ckf.g(baseMetaPageController, "controller");
        super.x2(baseMetaPageController);
        ((juc) t2()).j().setHeaderChangeListener(new MetaLayout.f() { // from class: tb.voz
            @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.f
            public final void m() {
                SrpWidget.i(SrpWidget.this);
            }
        });
        ((juc) t2()).j().setOnHeaderScrollListener(new woz(this));
    }

    public final void d3() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2cccb6", new Object[]{this});
        } else if (this.h.f1()) {
            g3().ensureView();
            if (!this.h.l1()) {
                esi esiVar = new esi(g3(), this.h.o());
                this.j = esiVar;
                esiVar.r(true);
                esi esiVar2 = this.j;
                ckf.d(esiVar2);
                if (this.h.m1()) {
                    str = "sticky";
                } else {
                    str = ytc.TYPE_HALF_STICKY_SEARCHBAR;
                }
                esiVar2.t(str);
                ((juc) t2()).j().addHeader(this.j);
            } else {
                View view = g3().getView();
                ckf.d(view);
                if (!(view.getParent() instanceof ViewGroup)) {
                    ((juc) t2()).getView().addView(g3().getView());
                    View view2 = g3().getView();
                    if (view2 != null) {
                        view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.roz
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                SrpWidget.k(SrpWidget.this, view3, i, i2, i3, i4, i5, i6, i7, i8);
                            }
                        });
                    }
                } else {
                    return;
                }
            }
            getActivity().runOnUiThread(new Runnable() { // from class: tb.soz
                @Override // java.lang.Runnable
                public final void run() {
                    SrpWidget.l(SrpWidget.this);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r2.size() > 1) goto L_0x0030;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z2(com.taobao.android.meta.data.MetaResult<C> r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.meta.srp.SrpWidget.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "640af3f6"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            java.lang.String r2 = "result"
            tb.ckf.g(r6, r2)
            java.util.List r2 = r6.getTabs()
            if (r2 == 0) goto L_0x002f
            java.util.List r2 = r6.getTabs()
            tb.ckf.d(r2)
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r5.P2(r0)
            tb.neq r0 = r5.h
            boolean r0 = r0.l1()
            if (r0 == 0) goto L_0x0049
            tb.ddd r0 = r5.u2()
            tb.iuc r0 = (tb.iuc) r0
            int r1 = r5.m3()
            r0.b(r1)
            goto L_0x005b
        L_0x0049:
            tb.ddd r0 = r5.u2()
            tb.iuc r0 = (tb.iuc) r0
            int r1 = r5.f3()
            int r2 = r5.i3()
            int r1 = r1 + r2
            r0.b(r1)
        L_0x005b:
            tb.vrd r0 = r5.j3()
            tb.p9e r1 = r5.t2()
            tb.juc r1 = (tb.juc) r1
            androidx.viewpager.widget.ViewPager r1 = r1.getViewPager()
            r0.D0(r6, r1)
            int r6 = r5.i3()
            if (r6 <= 0) goto L_0x0094
            tb.pqs r6 = new tb.pqs
            tb.vrd r0 = r5.j3()
            android.view.View r0 = r0.getView()
            boolean r1 = r5.o3()
            r6.<init>(r0, r1)
            r5.i = r6
            tb.p9e r6 = r5.t2()
            tb.juc r6 = (tb.juc) r6
            com.taobao.android.searchbaseframe.meta.uikit.MetaLayout r6 = r6.j()
            tb.pqs r0 = r5.i
            r6.addHeader(r0)
        L_0x0094:
            r5.q3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.meta.srp.SrpWidget.Z2(com.taobao.android.meta.data.MetaResult):void");
    }
}
