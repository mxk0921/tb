package com.taobao.android.meta.logic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.Map;
import tb.acx;
import tb.asi;
import tb.bsi;
import tb.ckf;
import tb.d1a;
import tb.frk;
import tb.iuc;
import tb.kae;
import tb.ksi;
import tb.njg;
import tb.osi;
import tb.t2o;
import tb.tnd;
import tb.tnl;
import tb.vtc;
import tb.xno;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class BaseMetaPageController<D extends a<C, R>, C extends asi, R extends MetaResult<C>> implements vtc<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public D f8936a;
    public ksi<D, C, ? extends bsi, R> b;
    public final njg c = kotlin.a.b(new d1a() { // from class: tb.czy
        @Override // tb.d1a
        public final Object invoke() {
            tnl e;
            e = BaseMetaPageController.e(BaseMetaPageController.this);
            return e;
        }
    });
    public final njg d = kotlin.a.b(new d1a() { // from class: tb.dzy
        @Override // tb.d1a
        public final Object invoke() {
            acx d;
            d = BaseMetaPageController.d(BaseMetaPageController.this);
            return d;
        }
    });

    static {
        t2o.a(993001493);
        t2o.a(993001495);
    }

    public static final acx d(BaseMetaPageController baseMetaPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("6f5c0745", new Object[]{baseMetaPageController});
        }
        ckf.g(baseMetaPageController, "this$0");
        return baseMetaPageController.z(baseMetaPageController.r());
    }

    public static final tnl e(BaseMetaPageController baseMetaPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnl) ipChange.ipc$dispatch("5012ea9d", new Object[]{baseMetaPageController});
        }
        ckf.g(baseMetaPageController, "this$0");
        return baseMetaPageController.A(baseMetaPageController.r(), baseMetaPageController.x());
    }

    public final tnl<D> A(D d, tnd tndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnl) ipChange.ipc$dispatch("ab1a5865", new Object[]{this, d, tndVar});
        }
        ckf.g(d, "initDataSource");
        ckf.g(tndVar, "searchContext");
        return new tnl<>(d, tndVar);
    }

    public void B(D d, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3cf16f", new Object[]{this, d, metaChildPageWidget});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        v().o(d);
    }

    public final void D(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963a1809", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        MetaChildPageWidget p = p(i);
        if (p != null) {
            p.j3(i2, i3, z);
        }
    }

    public final void E(D d, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdece43", new Object[]{this, d, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        ckf.g(d, "scopeDataSource");
        MetaChildPageWidget q = q(d);
        if (q != null) {
            q.j3(i, i2, z);
        }
    }

    public final void F(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad79e0", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        MetaChildPageWidget p = p(i);
        if (p != null) {
            p.k3(i2, z);
        }
    }

    public final void G(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53efcc2b", new Object[]{this, d});
            return;
        }
        ckf.g(d, "<set-?>");
        this.f8936a = d;
    }

    public final void I(ksi<D, C, ? extends bsi, R> ksiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82407980", new Object[]{this, ksiVar});
            return;
        }
        ckf.g(ksiVar, "<set-?>");
        this.b = ksiVar;
    }

    public void J(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd87109", new Object[]{this, d});
            return;
        }
        ckf.g(d, "scopeDataSource");
        MetaChildPageWidget F2 = w().F2(d.getIndex());
        if (F2 != null) {
            F2.p3();
        }
        MetaChildPageWidget q = q(d);
        if (q != null) {
            q.x();
        }
    }

    public final void K(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951a5ee4", new Object[]{this, d});
            return;
        }
        ckf.g(d, "ds");
        G(d);
    }

    @Override // tb.vtc
    public void b(D d, C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679fd022", new Object[]{this, d, c, new Boolean(z), map});
            return;
        }
        ckf.g(d, "scopeDataSource");
        if (c == null) {
            return;
        }
        if (z) {
            c.P(MetaState.LOADING_MORE);
        } else {
            c.P(MetaState.UPDATING);
        }
    }

    @Override // tb.vtc
    public void h(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1649746", new Object[]{this, d});
            return;
        }
        ckf.g(d, "scopeDataSource");
        J(d);
    }

    @Override // tb.vtc
    public void k(D d, C c, boolean z, boolean z2, osi<C> osiVar) {
        MetaState metaState;
        MetaState metaState2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fad2f0e", new Object[]{this, d, c, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(osiVar, "config");
        if (c == null) {
            return;
        }
        if (z) {
            if (z2) {
                metaState2 = MetaState.DEFAULT;
            } else {
                metaState2 = MetaState.LOAD_MORE_ERROR;
            }
            c.P(metaState2);
            MetaChildPageWidget q = q(d);
            if (q != null) {
                q.q3();
                return;
            }
            return;
        }
        if (!z2) {
            metaState = MetaState.UPDATE_ERROR;
        } else if (c.u()) {
            metaState = MetaState.DEFAULT;
        } else {
            metaState = MetaState.EMPTY;
        }
        c.P(metaState);
    }

    @Override // tb.vtc
    public void l(D d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b57ff2", new Object[]{this, d, new Boolean(z)});
            return;
        }
        ckf.g(d, "initDataSource");
        MetaResult<C> metaResult = (MetaResult) d.getTotalSearchResult();
        if (metaResult == null || !z) {
            w().R2();
            xno srpLifeCycleWatcher = d.getSrpLifeCycleWatcher();
            if (srpLifeCycleWatcher != null) {
                srpLifeCycleWatcher.g(null);
                return;
            }
            return;
        }
        w().Q2(metaResult);
    }

    public void n(ksi<D, C, ? extends bsi, R> ksiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d84b9d1", new Object[]{this, ksiVar});
            return;
        }
        ckf.g(ksiVar, "widget");
        I(ksiVar);
        w().S2();
        r().setFlow(this);
    }

    public final MetaChildPageWidget p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("405a96a5", new Object[]{this, new Integer(i)});
        }
        return w().F2(i);
    }

    public final MetaChildPageWidget q(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("183910ab", new Object[]{this, d});
        }
        ckf.g(d, "scopeDataSource");
        return p(d.getIndex());
    }

    public final D r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (D) ((a) ipChange.ipc$dispatch("ff5b9c8b", new Object[]{this}));
        }
        D d = this.f8936a;
        if (d != null) {
            return d;
        }
        ckf.y("initDataSource");
        throw null;
    }

    public final acx<D> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("962fe565", new Object[]{this});
        }
        return t();
    }

    public final acx<D> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("47523195", new Object[]{this});
        }
        return (acx) this.d.getValue();
    }

    public final acx<D> u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("fafebc24", new Object[]{this, new Integer(i)});
        }
        if (a(i, r())) {
            r().setIndex(i);
            return t();
        }
        acx<D> c = c(i, ((iuc) w().u2()).H(i), r());
        c.e().setFlow(this);
        c.e().setInitDataSource(false);
        c.e().setIndex(i);
        return c;
    }

    public final tnl<D> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnl) ipChange.ipc$dispatch("1c77a5ac", new Object[]{this});
        }
        return (tnl) this.c.getValue();
    }

    public final ksi<D, C, ? extends bsi, R> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksi) ipChange.ipc$dispatch("e2b81bdc", new Object[]{this});
        }
        ksi<D, C, ? extends bsi, R> ksiVar = this.b;
        if (ksiVar != null) {
            return ksiVar;
        }
        ckf.y("pageWidget");
        throw null;
    }

    public abstract tnd x();

    public void y(D d, C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d85c9ac", new Object[]{this, d, c});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(c, "combo");
        d.doLoadMore(c, null);
    }

    public acx<D> z(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("2b4637bf", new Object[]{this, d});
        }
        ckf.g(d, "initDataSource");
        return new acx<>(v(), d);
    }

    public void C(D d, kae<?, ?> kaeVar, boolean z, frk frkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9d4d15", new Object[]{this, d, kaeVar, new Boolean(z), frkVar});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(kaeVar, "widget");
        MetaChildPageWidget q = q(d);
        if (q != null) {
            q.i3(kaeVar, z, frkVar, 0);
        }
    }

    public boolean H(D d, C c, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ef7af2c", new Object[]{this, d, c, listStyle})).booleanValue();
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(c, "combo");
        ckf.g(listStyle, "newStyle");
        c.N(listStyle);
        MetaChildPageWidget F2 = w().F2(d.getIndex());
        if (F2 != null) {
            F2.r0(listStyle);
        }
        return true;
    }

    @Override // tb.vtc
    public void f(D d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6b9b53", new Object[]{this, d, new Boolean(z)});
            return;
        }
        ckf.g(d, "scopeDataSource");
        MetaChildPageWidget F2 = w().F2(d.getIndex());
        if (F2 == null) {
            return;
        }
        if (z) {
            F2.f3(true);
            F2.x();
            return;
        }
        F2.n3();
        xno srpLifeCycleWatcher = d.getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher != null) {
            srpLifeCycleWatcher.g(null);
        }
    }

    public final boolean o(D d, C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f6926f1", new Object[]{this, d, c})).booleanValue();
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(c, "combo");
        if (c.s() != MetaState.DEFAULT || c.w()) {
            return false;
        }
        y(d, c);
        c.P(MetaState.LOADING_MORE);
        return true;
    }
}
