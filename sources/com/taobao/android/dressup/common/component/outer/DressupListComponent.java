package com.taobao.android.dressup.common.component.outer;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.base.infoflow.IDressUpHostService;
import com.taobao.android.dressup.common.component.layout.CommonListLayoutComponent;
import com.taobao.android.dressup.common.model.CardModel;
import com.taobao.android.dressup.common.prefetch.DressUpMtopRequest;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.b7d;
import tb.byb;
import tb.ckf;
import tb.eyb;
import tb.fwa;
import tb.g1c;
import tb.jpu;
import tb.khd;
import tb.nhd;
import tb.njg;
import tb.qpu;
import tb.rcd;
import tb.t2o;
import tb.tqm;
import tb.uun;
import tb.vjc;
import tb.z4a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/taobao/android/dressup/common/component/outer/DressupListComponent;", "Ltb/fwa;", "", "Lcom/taobao/android/dressup/common/model/CardModel;", "Landroid/view/View;", "Ltb/eyb;", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressupListComponent extends fwa<List<? extends CardModel>, View> implements eyb, RecyclerView.OnChildAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_DRESS_UP_DETAIL = "dressUpDetail";
    public static final String BIZ_DRESS_UP_FLOW = "dressUpFeed";
    public static final a Companion = new a(null);
    public RecyclerView e;
    public int g;
    public boolean h;
    public final njg j;
    public final njg k;
    public final njg l;
    public IDressUpHostService v;
    public final Map<String, z4a> i = kotlin.collections.a.j(jpu.a(BIZ_DRESS_UP_FLOW, z4a.REC_DAILY_OUTFIT), jpu.a(BIZ_DRESS_UP_DETAIL, z4a.REC_OUTFIT_TREND));
    public final DressUpMtopRequest m = new DressUpMtopRequest();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552648);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552647);
        t2o.a(919601268);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DressupListComponent(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
        this.j = kotlin.a.b(new DressupListComponent$pageBusinessId$2(qpuVar));
        this.k = kotlin.a.b(new DressupListComponent$bottomContainerLinkable$2(qpuVar));
        this.l = kotlin.a.b(new DressupListComponent$recommendContainer$2(this, qpuVar));
    }

    public static final /* synthetic */ void a(DressupListComponent dressupListComponent, IDressUpHostService iDressUpHostService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f729bb08", new Object[]{dressupListComponent, iDressUpHostService});
        } else {
            dressupListComponent.v = iDressUpHostService;
        }
    }

    public static /* synthetic */ Object ipc$super(DressupListComponent dressupListComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -128189347) {
            super.onCreate(objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
            return null;
        } else if (hashCode == 916714806) {
            super.updateDataImpl(objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dressup/common/component/outer/DressupListComponent");
        }
    }

    public static final /* synthetic */ Map s(DressupListComponent dressupListComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("28596842", new Object[]{dressupListComponent});
        }
        return dressupListComponent.i;
    }

    public static final /* synthetic */ String u(DressupListComponent dressupListComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a37da6c5", new Object[]{dressupListComponent});
        }
        return dressupListComponent.z();
    }

    public final nhd A() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("1ab41b72", new Object[]{this});
        } else {
            value = this.l.getValue();
        }
        return (nhd) value;
    }

    @Override // tb.eyb
    public void B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0098e0", new Object[]{this, obj});
        } else if (ckf.b(z(), BIZ_DRESS_UP_DETAIL)) {
            Map<String, Object> c = o().a().c();
            if (!((c != null ? c.get(tqm.CONFIG_RECOMMEND_MANAGER) : null) instanceof nhd)) {
                I();
            }
        }
    }

    public final RecyclerView C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.e;
    }

    public final void D(fwa<?, ?> fwaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d3b70f", new Object[]{this, fwaVar, new Boolean(z)});
        } else if (((b7d) o().getService(b7d.class)).getPageState() == 2) {
            if (z) {
                if (fwaVar != null) {
                    fwaVar.onStart(IComponentLifecycle$TriggerType.UNSPECIFIED);
                }
                if (fwaVar != null) {
                    fwaVar.onResume(IComponentLifecycle$TriggerType.UNSPECIFIED);
                    return;
                }
                return;
            }
            if (fwaVar != null) {
                fwaVar.onPause(IComponentLifecycle$TriggerType.UNSPECIFIED);
            }
            if (fwaVar != null) {
                fwaVar.onStop(IComponentLifecycle$TriggerType.UNSPECIFIED);
            }
        }
    }

    /* renamed from: F */
    public void onCreate(List<? extends CardModel> list, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6aa5668", new Object[]{this, list, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(list, iComponentLifecycle$TriggerType);
        if (TextUtils.equals(z(), BIZ_DRESS_UP_DETAIL)) {
            ((byb) o().getService(byb.class)).r(this);
        }
    }

    public final void G(khd khdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c189e18", new Object[]{this, khdVar});
            return;
        }
        ckf.g(khdVar, "callback");
        A().b(khdVar);
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d42406", new Object[]{this});
            return;
        }
        String z = z();
        if (z.hashCode() == 1979012080 && z.equals(BIZ_DRESS_UP_FLOW)) {
            this.m.requestFeedRecommendData(A(), false, null, true);
        } else {
            this.m.requestDetailRecommendData(A(), o().a().h(), false);
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e107653e", new Object[]{this});
            return;
        }
        String z = z();
        if (z.hashCode() == 1979012080 && z.equals(BIZ_DRESS_UP_FLOW)) {
            this.m.requestFeedRecommendData(A(), false, null, false);
        } else {
            this.m.requestDetailRecommendData(A(), o().a().h(), false);
        }
    }

    public final void J() {
        RecyclerView recyclerView;
        fwa<CardModel, View> s;
        View view;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0d14bd", new Object[]{this});
        } else if (this.g > 0 && y() && (recyclerView = this.e) != null) {
            boolean z = this.h;
            boolean E = E(recyclerView, this.g);
            this.h = E;
            if (z != E) {
                fwa I = ((vjc) o().getService(vjc.class)).I();
                if (!(I instanceof CommonListLayoutComponent)) {
                    I = null;
                }
                CommonListLayoutComponent commonListLayoutComponent = (CommonListLayoutComponent) I;
                if (commonListLayoutComponent != null && (s = commonListLayoutComponent.s()) != null && (view = s.getView()) != null) {
                    if (this.h) {
                        f = view.getHeight();
                    } else {
                        f = 0.0f;
                    }
                    view.animate().translationY(f).setDuration(300L).setInterpolator(new FastOutSlowInInterpolator()).start();
                }
            }
        }
    }

    /* renamed from: K */
    public void updateDataImpl(List<? extends CardModel> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36420cb", new Object[]{this, list});
            return;
        }
        ckf.g(list, "data");
        super.updateDataImpl(list);
        fwa I = ((vjc) o().getService(vjc.class)).I();
        if (!(I instanceof uun)) {
            I = null;
        }
        uun uunVar = (uun) I;
        if (uunVar != null) {
            z = uunVar.G();
        }
        IDressUpHostService iDressUpHostService = this.v;
        if (iDressUpHostService != null) {
            iDressUpHostService.notifyDataSetChanged(z);
        } else {
            ckf.y("dressupHostService");
            throw null;
        }
    }

    @Override // tb.fwa
    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return "list";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517542da", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            D(w(view), true);
            if (this.g <= 0) {
                IDressUpHostService iDressUpHostService = this.v;
                if (iDressUpHostService != null) {
                    this.g = iDressUpHostService.getHostDataSet().size();
                } else {
                    ckf.y("dressupHostService");
                    throw null;
                }
            }
            RecyclerView recyclerView = this.e;
            ckf.d(recyclerView);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition > this.g) {
                RecyclerView recyclerView2 = this.e;
                ckf.d(recyclerView2);
                ((rcd) o().getService(rcd.class)).c(childAdapterPosition, recyclerView2);
            }
            J();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            D(w(view), false);
            J();
        }
    }

    public final fwa<?, ?> w(View view) {
        View childAt;
        Object tag;
        Object tag2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("7afaecd2", new Object[]{this, view});
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        View childAt2 = viewGroup.getChildAt(0);
        if (childAt2 != null && (tag2 = childAt2.getTag(R.id.turbo_tag_dresslist_component)) != null && (tag2 instanceof fwa)) {
            return (fwa) tag2;
        }
        View childAt3 = viewGroup.getChildAt(0);
        if (!(childAt3 instanceof ViewGroup)) {
            childAt3 = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) childAt3;
        if (viewGroup2 == null || (childAt = viewGroup2.getChildAt(0)) == null || (tag = childAt.getTag(R.id.turbo_tag_dresslist_component)) == null || !(tag instanceof fwa)) {
            return null;
        }
        return (fwa) tag;
    }

    public final RecyclerView x(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("d4a663ec", new Object[]{this, viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
        }
        return null;
    }

    public final boolean y() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("a3cf9b5f", new Object[]{this});
        } else {
            value = this.k.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public final String z() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("a4e75d19", new Object[]{this});
        } else {
            value = this.j.getValue();
        }
        return (String) value;
    }

    @Override // tb.eyb
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e1d39a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public ViewGroup createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("eb9b458d", new Object[]{this});
        }
        boolean equals = TextUtils.equals(BIZ_DRESS_UP_FLOW, z());
        ViewGroup d = A().d(getContext(), equals);
        if (equals) {
            I();
        }
        ckf.f(d, "infoRecyclerViewContainer");
        RecyclerView x = x(d);
        this.e = x;
        if (x != null) {
            x.addOnChildAttachStateChangeListener(this);
        }
        RecyclerView recyclerView = this.e;
        ckf.d(recyclerView);
        ((g1c) o().getService(g1c.class)).setRecyclerView(recyclerView);
        return d;
    }

    public final boolean E(RecyclerView recyclerView, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2211751", new Object[]{this, recyclerView, new Integer(i)})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int spanCount = staggeredGridLayoutManager.getSpanCount();
            int[] iArr = new int[spanCount];
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            for (int i2 = 0; i2 < spanCount; i2++) {
                if (iArr[i2] >= i) {
                    return true;
                }
            }
            for (int i3 = 0; i3 < spanCount; i3++) {
                if (i == iArr[i3] && (findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i)) != null && findViewByPosition.getTop() <= recyclerView.getPaddingTop()) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
    }
}
