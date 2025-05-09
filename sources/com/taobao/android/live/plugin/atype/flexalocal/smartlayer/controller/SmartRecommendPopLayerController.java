package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.controller;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.FrameLayoutScroll;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartErrorCode;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.recommend.SmartLayerRecommendPopTemplateProcessor;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.recommend.SmartRecommendPopViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import java.util.ArrayList;
import java.util.List;
import tb.brd;
import tb.bvb;
import tb.f5q;
import tb.g6q;
import tb.l6q;
import tb.ll6;
import tb.lvs;
import tb.n6q;
import tb.nw0;
import tb.p6q;
import tb.q5q;
import tb.t2o;
import tb.u6q;
import tb.ub5;
import tb.uc6;
import tb.wc6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartRecommendPopLayerController extends n6q implements RecommendRecyclerView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final q5q m = new q5q();
    public ViewGroup n;
    public FrameLayout o;
    public DXRootView p;
    public DXRootView q;
    public DXRootView r;
    public RecommendRecyclerView s;
    public ItemListPopAdapter t;
    public List<ListItemInfo> u;
    public final ub5 v;
    public SmartLayerRecommendPopTemplateProcessor w;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ItemListPopAdapter extends RecyclerView.Adapter<ItemListPopHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699769);
        }

        public ItemListPopAdapter() {
        }

        public static /* synthetic */ Object ipc$super(ItemListPopAdapter itemListPopAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/controller/SmartRecommendPopLayerController$ItemListPopAdapter");
        }

        /* renamed from: M */
        public void onBindViewHolder(ItemListPopHolder itemListPopHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("801713ef", new Object[]{this, itemListPopHolder, new Integer(i)});
                return;
            }
            ListItemInfo listItemInfo = (ListItemInfo) SmartRecommendPopLayerController.B(SmartRecommendPopLayerController.this).get(itemListPopHolder.getAdapterPosition());
            if (listItemInfo != null && (itemListPopHolder.itemView instanceof DXRootView)) {
                ll6.d(SmartRecommendPopLayerController.A(SmartRecommendPopLayerController.this), (DXRootView) itemListPopHolder.itemView, listItemInfo.ori, null);
                SmartLayerViewModel smartLayerViewModel = SmartRecommendPopLayerController.this.c;
                if (smartLayerViewModel instanceof SmartRecommendPopViewModel) {
                    ((SmartRecommendPopViewModel) smartLayerViewModel).trackShowUT("Newfans_exposure_item", listItemInfo);
                }
            }
        }

        /* renamed from: N */
        public ItemListPopHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ItemListPopHolder) ipChange.ipc$dispatch("a1320dc5", new Object[]{this, viewGroup, new Integer(i)});
            }
            View a2 = ll6.a(SmartRecommendPopLayerController.A(SmartRecommendPopLayerController.this), SmartRecommendPopLayerController.this.b.a(), "tblive_new_user_item_4_item_list");
            if (a2 == null) {
                a2 = new View(SmartRecommendPopLayerController.this.b.a());
            }
            return new ItemListPopHolder(a2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return SmartRecommendPopLayerController.B(SmartRecommendPopLayerController.this).size();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ItemListPopHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(295699770);
        }

        public ItemListPopHolder(View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ListItemInfo extends ItemInfo {
        public String itemId;
        public JSONObject ori;

        static {
            t2o.a(295699771);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SmartRecommendPopLayerController smartRecommendPopLayerController) {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            SmartRecommendPopLayerController.this.o();
            SmartLayerViewModel smartLayerViewModel = SmartRecommendPopLayerController.this.c;
            if (smartLayerViewModel instanceof SmartRecommendPopViewModel) {
                ((SmartRecommendPopViewModel) smartLayerViewModel).sampleSkipToGoodsDetail("", null, false, false, "close");
                ((SmartRecommendPopViewModel) SmartRecommendPopLayerController.this.c).trackClickUT("item_right_popview_close_click", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements bvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8664a;

        public c(int i) {
            this.f8664a = i;
        }

        @Override // tb.bvb
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c512be4", new Object[]{this, dXRootView});
            } else if (dXRootView == null) {
                p6q.e(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, SmartRecommendPopLayerController.this.f24542a, n6q.TAG, "onLayerCreated", "DX TopBar创建失败", false);
                SmartRecommendPopLayerController smartRecommendPopLayerController = SmartRecommendPopLayerController.this;
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RENDER_DX_ERROR;
                smartRecommendPopLayerController.d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
            } else {
                p6q.d(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, SmartRecommendPopLayerController.this.f24542a, n6q.TAG, "onLayerCreated-DX TopBar创建成功");
                SmartRecommendPopLayerController.this.p = dXRootView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f8664a);
                layoutParams.gravity = 48;
                SmartRecommendPopLayerController.this.p.setLayoutParams(layoutParams);
                SmartRecommendPopLayerController smartRecommendPopLayerController2 = SmartRecommendPopLayerController.this;
                smartRecommendPopLayerController2.o.addView(smartRecommendPopLayerController2.p);
                SmartRecommendPopLayerController.this.n();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f8665a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.smartlayer.controller.SmartRecommendPopLayerController$d$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC0451a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.smartlayer.controller.SmartRecommendPopLayerController$d$a$a$a  reason: collision with other inner class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
                public class RunnableC0452a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public RunnableC0452a() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d dVar = d.this;
                        ViewGroup viewGroup = SmartRecommendPopLayerController.this.n;
                        if (viewGroup != null) {
                            viewGroup.removeView(dVar.f8665a);
                        }
                    }
                }

                public RunnableC0451a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SmartRecommendPopLayerController.this.q.animate().setStartDelay(1000L).setDuration(1000L).translationX(nw0.a(74.0f)).translationY(-nw0.a(90.0f)).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).withEndAction(new RunnableC0452a());
                    }
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SmartRecommendPopLayerController.this.q.animate().scaleXBy(0.05f).scaleYBy(0.05f).setDuration(166L).withEndAction(new RunnableC0451a());
                }
            }
        }

        public d(FrameLayout frameLayout) {
            this.f8665a = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SmartRecommendPopLayerController.this.q.animate().scaleXBy(-0.15f).scaleYBy(-0.15f).setDuration(166L).withEndAction(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SmartRecommendPopLayerController smartRecommendPopLayerController = SmartRecommendPopLayerController.this;
            DXRootView dXRootView = smartRecommendPopLayerController.r;
            if (dXRootView != null && (viewGroup = smartRecommendPopLayerController.n) != null) {
                viewGroup.removeView(dXRootView);
            }
        }
    }

    static {
        t2o.a(295699760);
        t2o.a(295699698);
    }

    public SmartRecommendPopLayerController(g6q g6qVar, l6q l6qVar, SmartLayerViewModel smartLayerViewModel, brd brdVar) {
        super(g6qVar, l6qVar, smartLayerViewModel, brdVar);
        u6q u6qVar;
        if (l6qVar != null && (u6qVar = l6qVar.y) != null) {
            this.v = u6qVar.u();
        }
    }

    public static /* synthetic */ ub5 A(SmartRecommendPopLayerController smartRecommendPopLayerController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ub5) ipChange.ipc$dispatch("2cb1b3c5", new Object[]{smartRecommendPopLayerController});
        }
        return smartRecommendPopLayerController.v;
    }

    public static /* synthetic */ List B(SmartRecommendPopLayerController smartRecommendPopLayerController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bc640647", new Object[]{smartRecommendPopLayerController});
        }
        return smartRecommendPopLayerController.u;
    }

    public static /* synthetic */ Object ipc$super(SmartRecommendPopLayerController smartRecommendPopLayerController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1863795066:
                super.w();
                return null;
            case -1430643477:
                super.v();
                return null;
            case -914273135:
                super.u();
                return null;
            case -791824069:
                super.x();
                return null;
            case 954953613:
                super.t();
                return null;
            case 1971471181:
                super.q();
                return null;
            case 1987381597:
                super.r();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/controller/SmartRecommendPopLayerController");
        }
    }

    public void C(List<ListItemInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17b7953", new Object[]{this, list});
            return;
        }
        List<ListItemInfo> list2 = this.u;
        if (list2 != null) {
            ((ArrayList) list2).addAll(list);
            ItemListPopAdapter itemListPopAdapter = this.t;
            if (itemListPopAdapter != null) {
                itemListPopAdapter.notifyDataSetChanged();
            }
        }
    }

    public void D(f5q f5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a659821", new Object[]{this, f5qVar});
        } else if (f5qVar != null && !TextUtils.isEmpty(f5qVar.b())) {
            this.m.b(f5qVar.b(), f5qVar);
        }
    }

    public void E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e10d5b", new Object[]{this, jSONObject});
            return;
        }
        if (this.r == null) {
            this.r = ll6.a(this.v, this.b.a(), "tblive_new_user_simple_red_packet_4_item_list");
        }
        if (this.r != null && this.n != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.n.addView(this.r, layoutParams);
            ll6.d(this.v, this.r, jSONObject, null);
            this.r.postDelayed(new e(), lvs.s());
        }
    }

    public void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfb9ecd", new Object[]{this, jSONObject});
            return;
        }
        if (this.q == null) {
            this.q = ll6.a(this.v, this.b.a(), "tblive_new_user_red_packet_4_item_list");
        }
        if (this.q != null && this.n != null && this.b != null) {
            FrameLayout frameLayout = new FrameLayout(this.b.a());
            frameLayout.setBackgroundColor(Color.parseColor("#80000000"));
            this.n.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            frameLayout.addView(this.q, layoutParams);
            ll6.d(this.v, this.q, jSONObject, null);
            this.q.setScaleX(0.0f);
            this.q.setScaleY(0.0f);
            this.q.animate().scaleXBy(1.1f).scaleYBy(1.1f).setDuration(166L).withEndAction(new d(frameLayout));
        }
    }

    public void G(JSONObject jSONObject, List<ListItemInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a918efec", new Object[]{this, jSONObject, list});
            return;
        }
        DXRootView dXRootView = this.p;
        if (dXRootView != null && jSONObject != null) {
            ll6.d(this.v, dXRootView, jSONObject, null);
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            p6q.e(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, this.f24542a, n6q.TAG, "updateView", "DX TopBar Data is null", false);
            SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTAINER_VIEW_DATA_EMPTY;
            d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
        }
        if (list == null || list.isEmpty()) {
            p6q.e(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, this.f24542a, n6q.TAG, "updateView", "DX list Data is null", false);
            SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode2 = SmartLayerConstant$SmartErrorCode.ERROR_CONTAINER_VIEW_DATA_EMPTY;
            d(smartLayerConstant$SmartErrorCode2.errorCode, smartLayerConstant$SmartErrorCode2.errorMessage);
            return;
        }
        this.u = new ArrayList(list);
        ItemListPopAdapter itemListPopAdapter = this.t;
        if (itemListPopAdapter != null) {
            itemListPopAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendRecyclerView.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e067b313", new Object[]{this, new Boolean(z)});
            return;
        }
        SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor = this.w;
        if (smartLayerRecommendPopTemplateProcessor != null) {
            smartLayerRecommendPopTemplateProcessor.loadMore();
        }
    }

    @Override // tb.n6q
    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.n6q
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7582434d", new Object[]{this});
            return;
        }
        super.q();
        SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor = this.w;
        if (smartLayerRecommendPopTemplateProcessor != null) {
            smartLayerRecommendPopTemplateProcessor.onUpdate();
        }
    }

    @Override // tb.n6q
    public void t() {
        ub5 ub5Var;
        super.t();
        ViewGroup viewGroup = this.n;
        if (viewGroup != null && (ub5Var = this.v) != null) {
            viewGroup.setClickable(true);
            ub5Var.c(uc6.DX_EVENT_SMARTHANDLER, new uc6(this.m));
            ub5Var.d(wc6.DXSMARTLAYERCOUNTDOWNTEXTVIEW_SMARTLAYERCOUNTDOWNTEXTVIEW, new wc6());
            g6q g6qVar = this.f24542a;
            try {
                this.w = (SmartLayerRecommendPopTemplateProcessor) g6qVar.j.getConstructor(SmartRecommendPopLayerController.class).newInstance(this);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.w == null) {
                p6q.e(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, this.f24542a, n6q.TAG, "loadContent", "Plugin创建失败", false);
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RENDER_TEMPLATE_EMPTY;
                d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                return;
            }
            p6q.d(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, g6qVar, n6q.TAG, "loadContent-Plugin创建成功");
            this.w.onLoad();
        }
    }

    @Override // tb.n6q
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9814c91", new Object[]{this});
            return;
        }
        super.u();
        SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor = this.w;
        if (smartLayerRecommendPopTemplateProcessor != null) {
            smartLayerRecommendPopTemplateProcessor.onLayerDidShow();
        }
    }

    @Override // tb.n6q
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaba1ceb", new Object[]{this});
        } else {
            super.v();
        }
    }

    @Override // tb.n6q
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e8be86", new Object[]{this});
        } else {
            super.w();
        }
    }

    @Override // tb.n6q
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cdb93b", new Object[]{this});
        } else {
            super.x();
        }
    }

    @Override // tb.n6q
    public void r() {
        g6q g6qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7675095d", new Object[]{this});
            return;
        }
        super.r();
        if (this.v != null && this.b != null && (g6qVar = this.f24542a) != null && !TextUtils.isEmpty(g6qVar.g)) {
            int e2 = (int) (nw0.e(false) * 0.72d);
            int b2 = nw0.b(98.0f);
            this.o = new FrameLayout(this.b.a());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, e2);
            layoutParams.gravity = 80;
            this.o.setLayoutParams(layoutParams);
            this.o.setOnClickListener(new a(this));
            FrameLayoutScroll frameLayoutScroll = new FrameLayoutScroll(this.b.a());
            this.n = frameLayoutScroll;
            frameLayoutScroll.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.n.addView(this.o);
            this.n.setOnClickListener(new b());
            RecommendRecyclerView recommendRecyclerView = new RecommendRecyclerView(this.b.a());
            this.s = recommendRecyclerView;
            recommendRecyclerView.setLoadMoreListener(this);
            this.s.setLayoutManager(new LinearLayoutManager(this.b.a()));
            RecommendRecyclerView recommendRecyclerView2 = this.s;
            ItemListPopAdapter itemListPopAdapter = new ItemListPopAdapter();
            this.t = itemListPopAdapter;
            recommendRecyclerView2.setAdapter(itemListPopAdapter);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, e2 - b2);
            layoutParams2.gravity = 81;
            this.s.setLayoutParams(layoutParams2);
            this.o.addView(this.s);
            ll6.c(this.v, this.b.a(), "tblive_new_user_top_4_item_list", new c(b2));
        }
    }
}
