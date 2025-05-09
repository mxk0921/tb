package tb;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class esh extends rz<FrameLayout, muc> implements nuc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout d;
    public ViewGroup f;
    public View i;
    public MetaState e = MetaState.DEFAULT;
    public final krh g = new krh();
    public boolean h = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(815792913);
            int[] iArr = new int[MetaState.values().length];
            try {
                iArr[MetaState.UPDATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetaState.UPDATE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(815792912);
        t2o.a(993001549);
    }

    public static final void c(esh eshVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca169805", new Object[]{eshVar, view});
            return;
        }
        ckf.g(eshVar, "this$0");
        eshVar.G1(MetaState.UPDATING);
        muc P = eshVar.P();
        ckf.e(P, "null cannot be cast to non-null type com.taobao.android.meta.structure.state.page.MetaPageStatePresenter");
        ((com.taobao.android.meta.data.a) ((acx) ((jsi) P).getWidget().getModel()).e()).doNewSearch();
    }

    public static final void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c94ffd3", new Object[]{view});
        }
    }

    public static /* synthetic */ Object ipc$super(esh eshVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/state/MStateView");
    }

    @Override // tb.nuc
    public void L(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac51d95", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        View view = this.i;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65468cb2", new Object[]{this});
        } else if (S().getParent() == null) {
            ViewGroup viewGroup = this.f;
            if (viewGroup != null) {
                viewGroup.addView(S(), new ViewGroup.LayoutParams(-1, -1));
            } else {
                ckf.y("container");
                throw null;
            }
        }
    }

    /* renamed from: R */
    public FrameLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("59aa5e3a", new Object[]{this, context, viewGroup});
        }
        ckf.d(viewGroup);
        this.f = viewGroup;
        W(new FrameLayout(context));
        return S();
    }

    public final FrameLayout S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    /* renamed from: T */
    public FrameLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        return S();
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66490a14", new Object[]{this})).booleanValue();
        }
        muc P = P();
        ckf.e(P, "null cannot be cast to non-null type com.taobao.android.meta.structure.state.page.MetaPageStatePresenter");
        tnd f = ((acx) ((jsi) P).getWidget().getModel()).f();
        ckf.e(f, "null cannot be cast to non-null type com.taobao.search.sf.context.CommonSearchContext");
        return ((CommonSearchContext) f).isGallerySrp();
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efb967eb", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final void W(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76050b3", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.d = frameLayout;
    }

    public final void X() {
        ResultError resultError;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        krh krhVar = this.g;
        Context context = S().getContext();
        ckf.f(context, "getContext(...)");
        muc P = P();
        ckf.e(P, "null cannot be cast to non-null type com.taobao.android.meta.structure.state.page.MetaPageStatePresenter");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.a) ((acx) ((jsi) P).getWidget().getModel()).e()).getLastSearchResult();
        if (metaResult != null) {
            resultError = metaResult.getError();
        } else {
            resultError = null;
        }
        S().addView(krhVar.a(context, resultError, new View.OnClickListener() { // from class: tb.gdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                esh.c(esh.this, view);
            }
        }));
        Q();
    }

    @Override // tb.luc
    public void G1(MetaState metaState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3cb697", new Object[]{this, metaState});
            return;
        }
        ckf.g(metaState, "state");
        if (this.e != metaState) {
            this.e = metaState;
            S().removeAllViews();
            int i = a.$EnumSwitchMapping$0[metaState.ordinal()];
            if (i == 1) {
                showLoading();
            } else if (i != 2) {
                ViewGroup viewGroup = this.f;
                if (viewGroup != null) {
                    viewGroup.removeView(S());
                } else {
                    ckf.y("container");
                    throw null;
                }
            } else {
                X();
            }
        }
    }

    public void showLoading() {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        if (!ckf.b("degrade", downgradeStrategy != null ? downgradeStrategy.getTacticsPerformance() : null) || !o4p.C1("loadngNoAnim")) {
            z = false;
        }
        LayoutInflater from = LayoutInflater.from(S().getContext());
        if (!z) {
            i = R.layout.sf_tbsearch_ms_loading;
        } else {
            i = R.layout.sf_tbsearch_ms_loading_low;
        }
        View inflate = from.inflate(i, (ViewGroup) S(), false);
        ViewProxy.setOnClickListener(inflate, new View.OnClickListener() { // from class: tb.fdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                esh.e(view);
            }
        });
        S().addView(inflate);
        Q();
        if (U()) {
            inflate.setBackgroundColor(0);
        } else {
            Activity activity = this.c;
            ckf.f(activity, "mActivity");
            ckf.d(inflate);
            prh.b(activity, inflate);
        }
        this.i = inflate;
        if (!V()) {
            inflate.setVisibility(4);
        }
    }
}
