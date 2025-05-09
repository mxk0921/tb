package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.request.params.RecommendRequestParams;
import com.taobao.android.detail.ttdetail.skeleton.recommend.RecommendRecyclerAdapter;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bw7;
import tb.f6j;
import tb.hi8;
import tb.hrj;
import tb.ion;
import tb.j1k;
import tb.mr7;
import tb.nb4;
import tb.t2o;
import tb.tgh;
import tb.u5o;
import tb.xon;
import tb.xsk;
import tb.y0q;
import tb.yc4;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewTTDetailRecommendComponent extends hrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context c;
    public FrameLayout d;
    public RecyclerView e;
    public RecommendRecyclerAdapter f;
    public boolean g;
    public ImageView h;
    public View i;
    public TTDetailErrorView j;
    public boolean k;
    public final JSONObject l = new JSONObject();
    public int m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements xsk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7b92c05", new Object[]{this, jSONObject});
            } else {
                NewTTDetailRecommendComponent.z(NewTTDetailRecommendComponent.this, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IRemoteBaseListener f6942a;

        public b(IRemoteBaseListener iRemoteBaseListener) {
            this.f6942a = iRemoteBaseListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            f6j f6jVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (DataUtils.U(NewTTDetailRecommendComponent.J(NewTTDetailRecommendComponent.this))) {
                NewTTDetailRecommendComponent.K(NewTTDetailRecommendComponent.this).put("appId", (Object) "47843");
                f6jVar = new j1k(new RecommendRequestParams(NewTTDetailRecommendComponent.K(NewTTDetailRecommendComponent.this)));
            } else {
                f6jVar = new ion(new RecommendRequestParams(NewTTDetailRecommendComponent.K(NewTTDetailRecommendComponent.this)));
            }
            f6jVar.n(u5o.c()).q(this.f6942a).c();
            tgh.b("NewTTDetailRecommendComponent", "isPagingRequest=" + NewTTDetailRecommendComponent.L(NewTTDetailRecommendComponent.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xon f6943a;
        public final /* synthetic */ List b;

        public c(xon xonVar, List list) {
            this.f6943a = xonVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NewTTDetailRecommendComponent.M(NewTTDetailRecommendComponent.this).setVisibility(8);
            if (NewTTDetailRecommendComponent.N(NewTTDetailRecommendComponent.this) != null) {
                NewTTDetailRecommendComponent.N(NewTTDetailRecommendComponent.this).setVisibility(8);
            }
            int itemCount = NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).getItemCount();
            NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).W(this.f6943a);
            NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).U(false);
            if (NewTTDetailRecommendComponent.L(NewTTDetailRecommendComponent.this)) {
                NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).S();
                int i = itemCount - 1;
                NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).notifyItemRemoved(i);
                NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).X(this.b);
                NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).notifyItemRangeInserted(i, this.f6943a.b().size() + 1);
                return;
            }
            NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).X(this.b);
            NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).notifyDataSetChanged();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6944a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements TTDetailErrorView.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView.a
            public void b(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c8acbb51", new Object[]{this, view});
                } else if (NewTTDetailRecommendComponent.D(NewTTDetailRecommendComponent.this) >= 4) {
                    NewTTDetailRecommendComponent.B(NewTTDetailRecommendComponent.this).loadEmpty();
                } else {
                    NewTTDetailRecommendComponent.F(NewTTDetailRecommendComponent.this);
                    NewTTDetailRecommendComponent.M(NewTTDetailRecommendComponent.this).setVisibility(0);
                    NewTTDetailRecommendComponent.N(NewTTDetailRecommendComponent.this).setVisibility(8);
                    NewTTDetailRecommendComponent.E(NewTTDetailRecommendComponent.this);
                }
            }
        }

        public d(boolean z) {
            this.f6944a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NewTTDetailRecommendComponent.L(NewTTDetailRecommendComponent.this)) {
                NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).U(true);
                NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).notifyItemChanged(NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).getItemCount() - 1);
            } else {
                ViewStub viewStub = (ViewStub) NewTTDetailRecommendComponent.A(NewTTDetailRecommendComponent.this).findViewById(R.id.vs_recommend_error_view_container);
                if (viewStub != null) {
                    NewTTDetailRecommendComponent.O(NewTTDetailRecommendComponent.this, viewStub.inflate());
                } else {
                    NewTTDetailRecommendComponent newTTDetailRecommendComponent = NewTTDetailRecommendComponent.this;
                    NewTTDetailRecommendComponent.O(newTTDetailRecommendComponent, NewTTDetailRecommendComponent.A(newTTDetailRecommendComponent).findViewById(R.id.recommend_error_view_container));
                }
                NewTTDetailRecommendComponent newTTDetailRecommendComponent2 = NewTTDetailRecommendComponent.this;
                NewTTDetailRecommendComponent.C(newTTDetailRecommendComponent2, (TTDetailErrorView) NewTTDetailRecommendComponent.N(newTTDetailRecommendComponent2).findViewById(R.id.recommend_error_view));
                NewTTDetailRecommendComponent.B(NewTTDetailRecommendComponent.this).setOnReloadButtonClickListener(new a());
                if (this.f6944a) {
                    NewTTDetailRecommendComponent.B(NewTTDetailRecommendComponent.this).loadEmpty();
                }
                NewTTDetailRecommendComponent.M(NewTTDetailRecommendComponent.this).setVisibility(8);
                NewTTDetailRecommendComponent.N(NewTTDetailRecommendComponent.this).setVisibility(0);
            }
        }
    }

    static {
        t2o.a(912262626);
    }

    public NewTTDetailRecommendComponent(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        this.c = context;
        R(nb4Var);
    }

    public static /* synthetic */ FrameLayout A(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("401149ce", new Object[]{newTTDetailRecommendComponent});
        }
        return newTTDetailRecommendComponent.d;
    }

    public static /* synthetic */ TTDetailErrorView B(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailErrorView) ipChange.ipc$dispatch("36e599a5", new Object[]{newTTDetailRecommendComponent});
        }
        return newTTDetailRecommendComponent.j;
    }

    public static /* synthetic */ TTDetailErrorView C(NewTTDetailRecommendComponent newTTDetailRecommendComponent, TTDetailErrorView tTDetailErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailErrorView) ipChange.ipc$dispatch("24ce2cee", new Object[]{newTTDetailRecommendComponent, tTDetailErrorView});
        }
        newTTDetailRecommendComponent.j = tTDetailErrorView;
        return tTDetailErrorView;
    }

    public static /* synthetic */ int D(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b429adc", new Object[]{newTTDetailRecommendComponent})).intValue();
        }
        return newTTDetailRecommendComponent.m;
    }

    public static /* synthetic */ int E(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac973d4", new Object[]{newTTDetailRecommendComponent})).intValue();
        }
        int i = newTTDetailRecommendComponent.m;
        newTTDetailRecommendComponent.m = 1 + i;
        return i;
    }

    public static /* synthetic */ void F(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a692a48", new Object[]{newTTDetailRecommendComponent});
        } else {
            newTTDetailRecommendComponent.V();
        }
    }

    public static /* synthetic */ void G(NewTTDetailRecommendComponent newTTDetailRecommendComponent, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da97a7d", new Object[]{newTTDetailRecommendComponent, mtopResponse});
        } else {
            newTTDetailRecommendComponent.Q(mtopResponse);
        }
    }

    public static /* synthetic */ boolean H(NewTTDetailRecommendComponent newTTDetailRecommendComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17388b23", new Object[]{newTTDetailRecommendComponent, new Boolean(z)})).booleanValue();
        }
        newTTDetailRecommendComponent.getClass();
        return z;
    }

    public static /* synthetic */ void I(NewTTDetailRecommendComponent newTTDetailRecommendComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708ed61e", new Object[]{newTTDetailRecommendComponent, new Boolean(z)});
        } else {
            newTTDetailRecommendComponent.P(z);
        }
    }

    public static /* synthetic */ ze7 J(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("2493dbc5", new Object[]{newTTDetailRecommendComponent});
        }
        return newTTDetailRecommendComponent.mDetailContext;
    }

    public static /* synthetic */ JSONObject K(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25114554", new Object[]{newTTDetailRecommendComponent});
        }
        return newTTDetailRecommendComponent.l;
    }

    public static /* synthetic */ boolean L(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e84ef997", new Object[]{newTTDetailRecommendComponent})).booleanValue();
        }
        return newTTDetailRecommendComponent.k;
    }

    public static /* synthetic */ ImageView M(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("486e8ade", new Object[]{newTTDetailRecommendComponent});
        }
        return newTTDetailRecommendComponent.h;
    }

    public static /* synthetic */ View N(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ac2d9e53", new Object[]{newTTDetailRecommendComponent});
        }
        return newTTDetailRecommendComponent.i;
    }

    public static /* synthetic */ View O(NewTTDetailRecommendComponent newTTDetailRecommendComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c593ef65", new Object[]{newTTDetailRecommendComponent, view});
        }
        newTTDetailRecommendComponent.i = view;
        return view;
    }

    public static /* synthetic */ Object ipc$super(NewTTDetailRecommendComponent newTTDetailRecommendComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/recommend/NewTTDetailRecommendComponent");
    }

    public static /* synthetic */ RecommendRecyclerAdapter y(NewTTDetailRecommendComponent newTTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendRecyclerAdapter) ipChange.ipc$dispatch("be306c35", new Object[]{newTTDetailRecommendComponent});
        }
        return newTTDetailRecommendComponent.f;
    }

    public static /* synthetic */ void z(NewTTDetailRecommendComponent newTTDetailRecommendComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5796cb7", new Object[]{newTTDetailRecommendComponent, jSONObject});
        } else {
            newTTDetailRecommendComponent.U(jSONObject);
        }
    }

    public final void P(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8faa6d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mDetailContext.h().g(new d(z));
        int i = z ? -300020 : -300019;
        if (z) {
            str = "推荐请求数据为空";
        } else {
            str = "推荐请求回调失败";
        }
        HashMap hashMap = new HashMap();
        ze7 ze7Var = this.mDetailContext;
        if (ze7Var != null) {
            hashMap.put("itemId", ze7Var.i().c("requestItemId"));
            hashMap.put("sellerId", this.mDetailContext.i().c("sellerId"));
        }
        bw7.b(hashMap, i, str);
    }

    public void R(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63be2b8b", new Object[]{this, nb4Var});
            return;
        }
        JSONObject f = nb4Var.f();
        if (f != null) {
            T(f);
            S();
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de57be5c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(R.layout.tt_detail_recommend_container, (ViewGroup) null);
        this.d = frameLayout;
        this.e = (RecyclerView) frameLayout.findViewById(R.id.rv_recommend_container);
        RecommendRecyclerAdapter recommendRecyclerAdapter = new RecommendRecyclerAdapter(this.c, this.mDetailContext);
        this.f = recommendRecyclerAdapter;
        this.e.setAdapter(recommendRecyclerAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.c, 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.NewTTDetailRecommendComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/recommend/NewTTDetailRecommendComponent$1");
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
                }
                if (NewTTDetailRecommendComponent.y(NewTTDetailRecommendComponent.this).getItemViewType(i) != 2) {
                    return 2;
                }
                return 1;
            }
        });
        this.e.setLayoutManager(gridLayoutManager);
        this.e.addItemDecoration(new RecommendRecyclerAdapter.RecommendItemDecoration(mr7.a(8.0f)));
        this.e.setOverScrollMode(2);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setFocusable(false);
        this.e.setDescendantFocusability(393216);
        this.f.V(new a());
    }

    public final void T(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2de54a4", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("payload");
        if (!(jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("tppParams")) == null)) {
            this.l.putAll(jSONObject2);
        }
        this.l.put("itemId", this.mDetailContext.i().c("requestItemId"));
        this.l.put("sellerId", (Object) DataUtils.E((Seller) this.mDetailContext.e().f(Seller.class), ""));
    }

    public final void U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fecb010", new Object[]{this, jSONObject});
            return;
        }
        IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.NewTTDetailRecommendComponent.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tgh.b("NewTTDetailRecommendComponent", "RecommendCallback onError");
                NewTTDetailRecommendComponent.I(NewTTDetailRecommendComponent.this, false);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                tgh.b("NewTTDetailRecommendComponent", "RecommendCallback onSuccess");
                NewTTDetailRecommendComponent.G(NewTTDetailRecommendComponent.this, mtopResponse);
                NewTTDetailRecommendComponent.H(NewTTDetailRecommendComponent.this, true);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tgh.b("NewTTDetailRecommendComponent", "RecommendCallback onSystemError");
                NewTTDetailRecommendComponent.I(NewTTDetailRecommendComponent.this, false);
            }
        };
        if (jSONObject != null) {
            this.k = true;
            this.l.putAll(jSONObject);
        }
        this.g = true;
        u5o.a(new b(iRemoteBaseListener));
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1e6e0", new Object[]{this});
            return;
        }
        tgh.b("NewTTDetailRecommendComponent", "recommend start request");
        if (!this.l.isEmpty()) {
            if (this.h == null) {
                ImageView imageView = (ImageView) this.d.findViewById(R.id.iv_recommend_skeleton);
                this.h = imageView;
                imageView.setImageDrawable(new y0q());
            }
            U(null);
        }
    }

    @Override // tb.hrj, tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
        } else if (!this.g) {
            V();
        }
    }

    @Override // tb.hrj, tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
        } else if (this.f.getItemCount() <= 0) {
        } else {
            if (i == Integer.MAX_VALUE) {
                this.e.scrollToPosition(this.f.getItemCount() - 1);
            } else {
                this.e.scrollToPosition(i);
            }
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        RecommendRecyclerAdapter recommendRecyclerAdapter = this.f;
        if (recommendRecyclerAdapter != null) {
            yc4.a(-1, recommendRecyclerAdapter.Q());
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        this.f20842a = true;
        if (!this.g) {
            a();
        }
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
        } else {
            this.f20842a = false;
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.d;
    }

    @Override // tb.hrj, tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.hrj
    public TTDetailScrollerLayout.LayoutParams u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        return new TTDetailScrollerLayout.LayoutParams(-1, -1);
    }

    public final void Q(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4382e3a8", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
            tgh.b("NewTTDetailRecommendComponent", "mtopResponse is null");
            P(false);
        } else if (hi8.b(mtopResponse)) {
            tgh.b("NewTTDetailRecommendComponent", "防刷限流回调失败处理");
            P(false);
        } else {
            JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            if (parseObject == null || parseObject.isEmpty()) {
                tgh.b("NewTTDetailRecommendComponent", "mtopData is null");
                P(false);
                return;
            }
            JSONObject jSONObject = parseObject.getJSONObject("data");
            if (jSONObject == null || jSONObject.isEmpty()) {
                tgh.b("NewTTDetailRecommendComponent", "rawData is null");
                P(false);
                return;
            }
            xon xonVar = new xon(this.c, this.mDetailContext, jSONObject);
            List<DinamicXComponent> b2 = xonVar.b();
            if (b2.isEmpty()) {
                tgh.b("NewTTDetailRecommendComponent", "recommendComponents is null");
                P(true);
                return;
            }
            this.mDetailContext.h().g(new c(xonVar, b2));
        }
    }
}
