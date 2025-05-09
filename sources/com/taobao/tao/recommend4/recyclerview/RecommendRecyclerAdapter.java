package com.taobao.tao.recommend4.recyclerview;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.home.component.view.NestedEmptyView;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.homepage.view.widgets.CustomErrorView;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import com.taobao.tao.recommend3.container.RecommendDiffCallback;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.refresh.TBDefaultLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.b9b;
import tb.ddv;
import tb.f4b;
import tb.fl6;
import tb.s5a;
import tb.t2o;
import tb.tit;
import tb.wzn;
import tb.yon;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendRecyclerAdapter extends RecyclerView.Adapter<RecommendViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12701a;
    public yon b;
    public final RecommendItemDecoration e;
    public final com.taobao.tao.recommend4.manager.a f;
    public TBLoadMoreFooter.LoadMoreState g;
    public List<SectionModel> h;
    public final SectionModel i;
    public final SectionModel j;
    public int n;
    public int o;
    public int k = 10;
    public int l = -1;
    public int m = 0;
    public final g d = new g();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class RecommendViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f12702a;

        static {
            t2o.a(729810052);
        }

        public RecommendViewHolder(View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(RecommendRecyclerAdapter recommendRecyclerAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBErrorView f12703a;

        public b(TBErrorView tBErrorView) {
            this.f12703a = tBErrorView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RecommendRecyclerAdapter.a(RecommendRecyclerAdapter.this, this.f12703a, true);
            RecommendRecyclerAdapter.this.f.n();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(RecommendRecyclerAdapter recommendRecyclerAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomErrorView f12704a;

        public d(CustomErrorView customErrorView) {
            this.f12704a = customErrorView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RecommendRecyclerAdapter.b(RecommendRecyclerAdapter.this, this.f12704a, true);
            RecommendRecyclerAdapter.this.f.n();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBLoadMoreFooter tBLoadMoreFooter = (TBLoadMoreFooter) view;
            if (tBLoadMoreFooter.getCurrentState() == TBLoadMoreFooter.LoadMoreState.NONE) {
                tBLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
                RecommendRecyclerAdapter.this.f.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12706a;

        static {
            t2o.a(729810051);
        }

        public g() {
            this.f12706a = false;
            this.f12706a = f4b.b("enableUserContextRend", true);
        }

        public void a(RecommendViewHolder recommendViewHolder, JSONObject jSONObject, fl6 fl6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a7dc276", new Object[]{this, recommendViewHolder, jSONObject, fl6Var});
                return;
            }
            View view = recommendViewHolder.itemView;
            if (view instanceof FrameLayout) {
                View childAt = ((FrameLayout) view).getChildAt(0);
                if (childAt instanceof DXRootView) {
                    DXRootView dXRootView = (DXRootView) childAt;
                    if (this.f12706a) {
                        wzn.b(RecommendRecyclerAdapter.this.f.f(), dXRootView, jSONObject, fl6Var, RecommendRecyclerAdapter.c(RecommendRecyclerAdapter.this));
                    } else {
                        wzn.a(RecommendRecyclerAdapter.this.f.f(), dXRootView, jSONObject);
                    }
                }
            }
        }

        public View b(Context context, ViewGroup viewGroup, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("65c81a13", new Object[]{this, context, viewGroup, dXTemplateItem});
            }
            return RecommendRecyclerAdapter.this.f.f().o(context, RecommendRecyclerAdapter.this.f.f().u(dXTemplateItem)).f7291a;
        }
    }

    static {
        t2o.a(729810045);
    }

    public RecommendRecyclerAdapter(com.taobao.tao.recommend4.manager.a aVar, RecommendItemDecoration recommendItemDecoration) {
        this.f = aVar;
        this.e = recommendItemDecoration;
        new Handler();
        this.b = new yon(aVar.getContainerType());
        this.f12701a = b9b.a(aVar.getContext()) / 2;
        SectionModel sectionModel = new SectionModel();
        this.i = sectionModel;
        sectionModel.put("sectionBizCode", (Object) "error");
        SectionModel sectionModel2 = new SectionModel();
        this.j = sectionModel2;
        sectionModel2.put("sectionBizCode", (Object) "loading");
        aVar.isAdaptHudScreen();
    }

    public static /* synthetic */ void a(RecommendRecyclerAdapter recommendRecyclerAdapter, TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811a22ad", new Object[]{recommendRecyclerAdapter, tBErrorView, new Boolean(z)});
        } else {
            recommendRecyclerAdapter.k0(tBErrorView, z);
        }
    }

    public static /* synthetic */ void b(RecommendRecyclerAdapter recommendRecyclerAdapter, CustomErrorView customErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1381ee84", new Object[]{recommendRecyclerAdapter, customErrorView, new Boolean(z)});
        } else {
            recommendRecyclerAdapter.j0(customErrorView, z);
        }
    }

    public static /* synthetic */ int c(RecommendRecyclerAdapter recommendRecyclerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f91aa13", new Object[]{recommendRecyclerAdapter})).intValue();
        }
        return recommendRecyclerAdapter.o;
    }

    public static /* synthetic */ Object ipc$super(RecommendRecyclerAdapter recommendRecyclerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/RecommendRecyclerAdapter");
    }

    public final void P(int i) {
        List<SectionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfd64e8", new Object[]{this, new Integer(i)});
        } else if (!this.f.isLastPage() && this.m > 1 && this.h.size() < 10 && i == 0) {
            this.l = i;
            this.f.i();
        } else if (!this.f.isLastPage() && this.m > 1 && (list = this.h) != null && list.size() - i == this.k) {
            this.l = i;
            this.f.i();
        }
    }

    public final View Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("de68d57a", new Object[]{this});
        }
        if (f4b.b("enableCustomizedErrorView", true)) {
            CustomErrorView customErrorView = new CustomErrorView(this.f.getContext());
            customErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            customErrorView.setButtonVisibility(CustomErrorView.ButtonType.BUTTON_RIGHT, 8);
            j0(customErrorView, true);
            customErrorView.setButtonVisibility(CustomErrorView.ButtonType.BUTTON_LEFT, 8);
            return customErrorView;
        }
        TBErrorView tBErrorView = new TBErrorView(this.f.getContext());
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        k0(tBErrorView, true);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return tBErrorView;
    }

    public final FrameLayout S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("eebb3776", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.f.getContext());
        TBDefaultLoadMoreFooter tBDefaultLoadMoreFooter = new TBDefaultLoadMoreFooter(this.f.getContext());
        tBDefaultLoadMoreFooter.setLoadMoreTips(T());
        tBDefaultLoadMoreFooter.setBackgroundColor(0);
        tBDefaultLoadMoreFooter.setOnClickListener(new e());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) ((tBDefaultLoadMoreFooter.getResources().getDisplayMetrics().density * 50.0f) + this.n));
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        tBDefaultLoadMoreFooter.setLayoutParams(layoutParams);
        tBDefaultLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
        frameLayout.addView(tBDefaultLoadMoreFooter);
        return frameLayout;
    }

    public final String[] T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a615b3e3", new Object[]{this});
        }
        return new String[]{Localization.q(R.string.taobao_app_1000_1_16155), Localization.q(R.string.app_release_to_reload), Localization.q(R.string.taobao_app_1000_1_16160), Localization.q(R.string.taobao_app_1000_1_16147)};
    }

    public final String U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        com.taobao.tao.recommend4.manager.a aVar = this.f;
        if (aVar != null) {
            return aVar.getContainerId();
        }
        return "";
    }

    public final fl6 V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fl6) ipChange.ipc$dispatch("4ed427d5", new Object[]{this});
        }
        RecommendDxUserContext addContext = RecommendDxUserContext.newInstance().addContext("containerId", U());
        com.taobao.tao.recommend4.manager.a aVar = this.f;
        return addContext.addContext("apiInfo", aVar == null ? null : aVar.m()).addContext("rmd_container", new WeakReference(this.f));
    }

    public JSONObject W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("993c8893", new Object[]{this, new Integer(i)});
        }
        List<SectionModel> list = this.h;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.h.get(i);
    }

    public final int X(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692007b1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        if (view.getTag(i) == null) {
            return i2;
        }
        return ((Integer) view.getTag(i)).intValue();
    }

    /* renamed from: b0 */
    public RecommendViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        RecyclerView.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendViewHolder) ipChange.ipc$dispatch("6d0dabf1", new Object[]{this, viewGroup, new Integer(i)});
        }
        tit.a a2 = this.b.a(i);
        if (i == -2) {
            view = Q();
        } else if (i == -3) {
            view = S();
        } else if (i == -1 || a2 == null) {
            view = null;
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (a2.h()) {
                view = this.d.b(viewGroup.getContext(), viewGroup, a2.b());
            } else {
                view = null;
            }
            if (view != null) {
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.addView(view);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view = frameLayout;
            }
            ddv.d("RecommendRecyclerAdapter_" + a2.d(), SystemClock.uptimeMillis() - uptimeMillis, null);
        }
        if (view == null) {
            view = new NestedEmptyView(viewGroup.getContext());
        }
        RecyclerView recyclerView = this.f.getRecyclerView();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams = recyclerView.getLayoutManager().generateLayoutParams(layoutParams2);
        } else {
            layoutParams = recyclerView.getLayoutManager().generateDefaultLayoutParams();
        }
        view.setLayoutParams(layoutParams);
        return new RecommendViewHolder(view);
    }

    public void c0(int i) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d95d57", new Object[]{this, new Integer(i)});
            return;
        }
        List<SectionModel> list = this.h;
        List<SectionModel> o = this.f.o();
        if (o == null || o.isEmpty()) {
            arrayList = new ArrayList(1);
            arrayList.add(this.i);
        } else {
            arrayList = new ArrayList(o.size() + 1);
            arrayList.addAll(o);
            if (!this.f.isLastPage()) {
                arrayList.add(this.j);
                this.g = TBLoadMoreFooter.LoadMoreState.LOADING;
            }
        }
        this.h = arrayList;
        this.e.g(arrayList);
        l0();
        if (i == 0) {
            notifyDataSetChanged();
        } else {
            DiffUtil.calculateDiff(new RecommendDiffCallback(list, arrayList), false).dispatchUpdatesTo(this);
        }
    }

    public void d0() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21284014", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.manager.a aVar = this.f;
        if (!(aVar == null || (recyclerView = aVar.getRecyclerView()) == null)) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                if (childViewHolder instanceof RecommendViewHolder) {
                    ((RecommendViewHolder) childViewHolder).f12702a = null;
                }
            }
            int i2 = this.o;
            if (i2 > 0) {
                this.f12701a = i2 / 2;
            } else {
                this.f12701a = b9b.a(recyclerView.getContext()) / 2;
            }
            recyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    public void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a06ae27", new Object[]{this, new Boolean(z)});
        }
    }

    public void g0(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c6da75", new Object[]{this, z4aVar});
        } else {
            this.b = new yon(z4aVar);
        }
    }

    public List<SectionModel> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<SectionModel> list = this.h;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void h0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c14273c", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.n = i;
        }
    }

    public void i0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c782b44", new Object[]{this, new Integer(i)});
            return;
        }
        this.o = i;
        this.f12701a = i / 2;
    }

    public final void j0(CustomErrorView customErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc255a8", new Object[]{this, customErrorView, new Boolean(z)});
        } else if (z) {
            customErrorView.setTitle(Localization.q(R.string.taobao_app_1000_1_16165), true);
            customErrorView.setSubTitle(Localization.q(R.string.taobao_app_1000_1_16166), true);
            CustomErrorView.ButtonType buttonType = CustomErrorView.ButtonType.BUTTON_LEFT;
            customErrorView.setButton(buttonType, Localization.q(R.string.app_loading), new c(this));
            customErrorView.setButtonVisibility(buttonType, 4);
        } else {
            customErrorView.setTitle(Localization.q(R.string.taobao_app_1000_1_16148));
            customErrorView.setSubTitle(Localization.q(R.string.taobao_app_1000_1_16140));
            CustomErrorView.ButtonType buttonType2 = CustomErrorView.ButtonType.BUTTON_LEFT;
            customErrorView.setButton(buttonType2, Localization.q(R.string.app_refresh), new d(customErrorView));
            customErrorView.setButtonVisibility(buttonType2, 0);
        }
    }

    public final void k0(TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80388e8", new Object[]{this, tBErrorView, new Boolean(z)});
        } else if (z) {
            tBErrorView.setTitle(Localization.q(R.string.taobao_app_1000_1_16165));
            tBErrorView.setSubTitle(Localization.q(R.string.taobao_app_1000_1_16166));
            TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
            tBErrorView.setButton(buttonType, Localization.q(R.string.app_loading), new a(this));
            tBErrorView.setButtonVisibility(buttonType, 4);
        } else {
            tBErrorView.setTitle(Localization.q(R.string.taobao_app_1000_1_16148));
            tBErrorView.setSubTitle(Localization.q(R.string.taobao_app_1000_1_16140));
            TBErrorView.ButtonType buttonType2 = TBErrorView.ButtonType.BUTTON_LEFT;
            tBErrorView.setButton(buttonType2, Localization.q(R.string.app_refresh), new b(tBErrorView));
            tBErrorView.setButtonVisibility(buttonType2, 0);
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e52c9be", new Object[]{this});
            return;
        }
        AwesomeGetPageData pageParams = this.f.getPageParams();
        if (pageParams != null) {
            this.k = pageParams.requestInAdvance;
        }
    }

    public final void m0(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689943e9", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (view instanceof CustomErrorView) {
            j0((CustomErrorView) view, z);
        }
        if (view instanceof TBErrorView) {
            k0((TBErrorView) view, z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<SectionModel> list = this.h;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            this.h = arrayList;
            arrayList.add(this.i);
            return -2;
        }
        SectionModel sectionModel = this.h.get(i);
        if (sectionModel == null) {
            return -1;
        }
        if (sectionModel == this.i) {
            return -2;
        }
        if (sectionModel == this.j) {
            return -3;
        }
        if (sectionModel.getJSONObject("ext") == null || !sectionModel.getJSONObject("ext").getBooleanValue("hidden")) {
            return this.b.b(sectionModel.getJSONObject("template"));
        }
        return -1;
    }

    public final boolean Y(JSONObject jSONObject, ViewGroup.LayoutParams layoutParams, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a1d807f", new Object[]{this, jSONObject, layoutParams, view})).booleanValue();
        }
        if (jSONObject == null || layoutParams == null || view == null) {
            return false;
        }
        if (TextUtils.equals(jSONObject.getString("sectionBizCode"), "error") || TextUtils.equals(jSONObject.getString("sectionBizCode"), "loading")) {
            return true;
        }
        return (jSONObject.getJSONObject("template") != null && TextUtils.equals("one", tit.c(jSONObject.getJSONObject("template")))) || X(view, R.id.tag_recommend_decoration_width, layoutParams.width) > this.f12701a;
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673be38c", new Object[]{this})).booleanValue();
        }
        com.taobao.tao.recommend4.manager.a aVar = this.f;
        if (aVar == null || TextUtils.isEmpty(aVar.getContainerId())) {
            return false;
        }
        boolean contains = this.f.getContainerId().contains(NativeContainerProvider.MULTI_NATIVE_INFOFLOW_CID_PREFIX);
        int i = this.l;
        return contains && (i > 0 && i == this.h.size() - this.k);
    }

    /* renamed from: a0 */
    public void onBindViewHolder(RecommendViewHolder recommendViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797eae87", new Object[]{this, recommendViewHolder, new Integer(i)});
            return;
        }
        List<SectionModel> list = this.h;
        if (list != null && !list.isEmpty() && recommendViewHolder.itemView != null) {
            SectionModel sectionModel = this.h.get(i);
            boolean z = recommendViewHolder.itemView instanceof NestedEmptyView;
            String string = sectionModel.getString("sectionBizCode");
            if (!z && i > 0) {
                this.m++;
                if (TextUtils.equals(string, "loading")) {
                    TextUtils.equals(string, "error");
                }
            }
            if (!s5a.k(recommendViewHolder.f12702a, sectionModel)) {
                if (TextUtils.equals(string, "loading")) {
                    ((TBLoadMoreFooter) ((FrameLayout) recommendViewHolder.itemView).getChildAt(0)).changeToState(this.g);
                    if (this.m > 1 && !Z()) {
                        this.f.i();
                    }
                } else if (!TextUtils.equals(string, "error") && !z) {
                    if (tit.b(sectionModel.getJSONObject("template")).h()) {
                        this.d.a(recommendViewHolder, sectionModel, V());
                    }
                    recommendViewHolder.f12702a = sectionModel;
                    com.taobao.tao.recommend4.manager.a aVar = this.f;
                    if (aVar instanceof com.taobao.tao.recommend4.manager.d) {
                        recommendViewHolder.itemView.setTag(R.id.tag_recommend_containerId, aVar.getContainerId());
                        recommendViewHolder.itemView.setTag(R.id.tag_recommend_tabIndex, -1);
                        recommendViewHolder.itemView.setTag(R.id.tag_recommend_container, this.f);
                    } else {
                        recommendViewHolder.itemView.setTag(R.id.tag_recommend_datasource, aVar);
                    }
                }
            }
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) recommendViewHolder.itemView.getLayoutParams();
            boolean Y = Y(sectionModel, layoutParams, recommendViewHolder.itemView);
            if (!(layoutParams == null || layoutParams.isFullSpan() == Y)) {
                layoutParams.setFullSpan(Y);
            }
            P(i);
        }
    }

    public void e0() {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        View view;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36fdc5", new Object[]{this});
            return;
        }
        List<SectionModel> list = this.h;
        if (list != null && !list.isEmpty()) {
            RecyclerView recyclerView = this.f.getRecyclerView();
            SectionModel sectionModel = this.h.get(0);
            String str = "";
            if (TextUtils.equals(sectionModel != null ? sectionModel.getString("sectionBizCode") : str, "error")) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(0);
                if (findViewHolderForAdapterPosition2 != null && (view2 = findViewHolderForAdapterPosition2.itemView) != null) {
                    m0(view2, false);
                }
            } else if (this.h.size() > 1) {
                List<SectionModel> list2 = this.h;
                SectionModel sectionModel2 = list2.get(list2.size() - 1);
                if (sectionModel2 != null) {
                    str = sectionModel2.getString("sectionBizCode");
                }
                if (TextUtils.equals(str, "loading")) {
                    this.g = TBLoadMoreFooter.LoadMoreState.NONE;
                    int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPositions(null);
                    if (findLastVisibleItemPositions[0] == this.h.size() - 1 && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findLastVisibleItemPositions[0])) != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                        ((TBLoadMoreFooter) ((FrameLayout) view).getChildAt(0)).changeToState(this.g);
                    }
                }
            }
        }
    }
}
