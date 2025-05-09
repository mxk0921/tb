package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.page.MetaPagePresenter;
import com.taobao.android.meta.structure.page.MetaPageView;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.meta.structure.state.page.MetaPageStateWidget;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.Iterator;
import java.util.List;
import tb.asi;
import tb.bsi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ksi<T extends com.taobao.android.meta.data.a<D, R>, D extends asi, C extends bsi, R extends MetaResult<D>> extends b12<FrameLayout, juc, iuc, acx<T>, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final C c;
    public boolean d;
    public BaseMetaPageController<T, D, R> e;
    public MetaPageStateWidget f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ksi<T, D, C, R> f22890a;

        public a(ksi<T, D, C, R> ksiVar) {
            this.f22890a = ksiVar;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            ckf.g(view, "componentView");
            ((juc) this.f22890a.t2()).getView().addView(view);
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                ckf.g(view, "componentView");
            }
        }
    }

    static {
        t2o.a(993001544);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksi(C c, Activity activity, ude udeVar, acx<T> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        Intent intent;
        ckf.g(c, "metaConfig");
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "modelAdapter");
        this.c = c;
        ((juc) t2()).m(c);
        ((acx) getModel()).k(c);
        if (acxVar.d().c() == null && (intent = getActivity().getIntent()) != null && intent.getData() != null) {
            acxVar.d().n(intent.getData().toString());
        }
    }

    public static /* synthetic */ Object ipc$super(ksi ksiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 1280906097) {
            super.onCtxStop();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/meta/structure/page/MetaPageWidget");
        }
    }

    public final MetaChildPageWidget A2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("69413f36", new Object[]{this, new Integer(i)});
        }
        x02 v2 = v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.e = new k4k();
        v2.c = G2().u(i);
        Object a2 = this.c.g().a(v2);
        ckf.f(a2, "create(...)");
        return (MetaChildPageWidget) a2;
    }

    public final MetaChildPageWidget B2(acx<com.taobao.android.meta.data.a<? extends asi, ? extends MetaResult<? extends asi>>> acxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("5019cde", new Object[]{this, acxVar});
        }
        ckf.g(acxVar, "model");
        x02 v2 = v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.e = new k4k();
        v2.c = acxVar;
        Object a2 = this.c.g().a(v2);
        ckf.f(a2, "create(...)");
        return (MetaChildPageWidget) a2;
    }

    /* renamed from: C2 */
    public iuc q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuc) ipChange.ipc$dispatch("f3f17f1b", new Object[]{this});
        }
        return new MetaPagePresenter();
    }

    /* renamed from: D2 */
    public juc s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (juc) ipChange.ipc$dispatch("c73bd7", new Object[]{this});
        }
        return new MetaPageView();
    }

    public final MetaPageStateWidget E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaPageStateWidget) ipChange.ipc$dispatch("14b7ad33", new Object[]{this});
        }
        x02 v2 = v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.d = ((juc) t2()).getView();
        v2.e = new k4k();
        Activity activity = v2.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = v2.b;
        ckf.f(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = v2.c;
        ckf.e(acxVar, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
        MetaPageStateWidget metaPageStateWidget = new MetaPageStateWidget(activity, udeVar, acxVar, v2.d, v2.e);
        metaPageStateWidget.attachToContainer();
        return metaPageStateWidget;
    }

    public final void F(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb958ab", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c.y().g(Integer.valueOf(i));
        this.c.x().g(Integer.valueOf(i2));
    }

    public final MetaChildPageWidget F2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("405a96a5", new Object[]{this, new Integer(i)});
        }
        return ((iuc) u2()).y(i);
    }

    public final BaseMetaPageController<T, D, R> G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseMetaPageController) ipChange.ipc$dispatch("45eb52c3", new Object[]{this});
        }
        BaseMetaPageController<T, D, R> baseMetaPageController = this.e;
        if (baseMetaPageController != null) {
            return baseMetaPageController;
        }
        ckf.y("controller");
        throw null;
    }

    public final MetaChildPageWidget H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("6d0218d", new Object[]{this});
        }
        return ((iuc) u2()).V();
    }

    public final boolean I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7ed9c", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final C J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((bsi) ipChange.ipc$dispatch("3ffbf943", new Object[]{this}));
        }
        return this.c;
    }

    public final MetaPageStateWidget K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaPageStateWidget) ipChange.ipc$dispatch("2fefd78d", new Object[]{this});
        }
        if (this.c.e0() == null) {
            return null;
        }
        if (this.f == null) {
            this.f = E2();
        }
        return this.f;
    }

    public final void L0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e98e38", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c.D().g(Integer.valueOf(i));
        this.c.C().g(Integer.valueOf(i2));
    }

    public final void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        MetaPageStateWidget K2 = K2();
        if (K2 != null) {
            K2.G1(MetaState.DEFAULT);
        }
    }

    public final void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7bbd6f", new Object[]{this});
        } else if (!this.d) {
            ((iuc) u2()).M();
        }
    }

    public final void O2(BaseMetaPageController<T, D, R> baseMetaPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2485f14b", new Object[]{this, baseMetaPageController});
            return;
        }
        ckf.g(baseMetaPageController, "<set-?>");
        this.e = baseMetaPageController;
    }

    public final void P2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2abebb0", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        MetaPageStateWidget K2 = K2();
        if (K2 != null) {
            K2.G1(MetaState.UPDATE_ERROR);
        }
    }

    public final void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        MetaPageStateWidget K2 = K2();
        if (K2 != null) {
            K2.G1(MetaState.UPDATING);
        }
    }

    public final void T(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37f6c5d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c.w().g(Integer.valueOf(i));
        this.c.v().g(Integer.valueOf(i2));
    }

    public final void T2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84321ed6", new Object[]{this, new Integer(i)});
        } else {
            e1(i, false);
        }
    }

    public void a(MetaResult<D> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1310f7a", new Object[]{this, metaResult});
        } else {
            ckf.g(metaResult, "result");
        }
    }

    public final void e1(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2126ebe", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            ((juc) t2()).getViewPager().setCurrentItem(i, z);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MetaPageWidget";
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        MetaChildPageWidget V = ((iuc) u2()).V();
        if (V != null) {
            V.b3();
        }
    }

    @Override // tb.abx
    public void onCtxStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c591371", new Object[]{this});
            return;
        }
        super.onCtxStop();
        MetaChildPageWidget V = ((iuc) u2()).V();
        if (V != null) {
            V.c3();
        }
    }

    public void x2(BaseMetaPageController<T, D, R> baseMetaPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ece1ae", new Object[]{this, baseMetaPageController});
            return;
        }
        ckf.g(baseMetaPageController, "controller");
        O2(baseMetaPageController);
        baseMetaPageController.n(this);
        ((acx) getModel()).d().q("controller", baseMetaPageController);
    }

    public final void y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3ebfb3", new Object[]{this});
        } else {
            ((iuc) u2()).E();
        }
    }

    public void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c11854", new Object[]{this});
        } else {
            new dr3(getActivity(), this, null, new a(this));
        }
    }

    public final void Q2(MetaResult<D> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d52ab7e", new Object[]{this, metaResult});
            return;
        }
        ckf.g(metaResult, "result");
        if (!this.d) {
            this.d = true;
            M2(metaResult);
            z2();
        }
    }

    public void M2(MetaResult<D> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad683d", new Object[]{this, metaResult});
            return;
        }
        ckf.g(metaResult, "result");
        L2();
        List<TabBean> tabs = metaResult.getTabs();
        if (tabs != null) {
            Iterator<T> it = tabs.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                i++;
                if (((TabBean) it.next()).isSelected) {
                    break;
                }
            }
            ((iuc) u2()).f0(i);
            ((iuc) u2()).c0(tabs);
            if (i > 0) {
                ((juc) t2()).getViewPager().setCurrentItem(i, false);
            }
            ((iuc) u2()).f0(-1);
        }
        a(metaResult);
    }
}
