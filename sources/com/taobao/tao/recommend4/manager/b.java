package com.taobao.tao.recommend4.manager;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.revision.Revision;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.tao.recommend4.recyclerview.NestedStaggeredGridLayoutManager;
import com.taobao.tao.recommend4.recyclerview.SlideUpAnimationLogic;
import com.taobao.tao.recommend4.recyclerview.a;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b11;
import tb.bgt;
import tb.bqa;
import tb.cgt;
import tb.ctn;
import tb.cw6;
import tb.d11;
import tb.dve;
import tb.e6d;
import tb.e7c;
import tb.e8e;
import tb.ejb;
import tb.f4b;
import tb.fve;
import tb.get;
import tb.hon;
import tb.iue;
import tb.j0b;
import tb.j4d;
import tb.khd;
import tb.kmn;
import tb.knn;
import tb.kqb;
import tb.l9t;
import tb.mhd;
import tb.n2c;
import tb.n9t;
import tb.nh0;
import tb.oqb;
import tb.ph0;
import tb.q92;
import tb.rjj;
import tb.ron;
import tb.sad;
import tb.ssd;
import tb.t2o;
import tb.u7d;
import tb.uve;
import tb.uyt;
import tb.uzc;
import tb.vma;
import tb.vnn;
import tb.wue;
import tb.xue;
import tb.xxd;
import tb.yft;
import tb.z4a;
import tb.zn4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b extends com.taobao.tao.recommend4.manager.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_INFO = "apiInfo";
    public static final int DEFAULT_COLUMN_COUNT = 2;
    public static final String KEY_IS_PREFETCH = "isDressUpPrefetch";
    public static final String KEY_IS_PULL_REFRESH = "isPullRefresh";
    public khd A;
    public WeakReference<Context> b;
    public z4a c;
    public JSONObject d;
    public JSONObject e;
    public d11 f;
    public int g;
    public final DinamicXEngine h;
    public SlideUpAnimationLogic i;
    public RecyclerView j;
    public final List<ISubService> k;
    public xue l;
    public n2c m;
    public e6d n;
    public ejb o;
    public uzc p;
    public kqb q;
    public e7c r;
    public e8e s;
    public xxd t;
    public oqb u;
    public u7d v;
    public sad w;
    public ssd x;
    public j4d y;
    public IAddViewCallbackService.a z;
    public boolean W = false;
    public boolean B = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IContainerDataService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(b bVar) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
        public void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
            } else {
                hon.e(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.recommend4.manager.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0721b implements IAddViewCallbackService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ khd f12675a;

        public C0721b(khd khdVar) {
            this.f12675a = khdVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService.a
        public void onSuccess() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            khd khdVar = this.f12675a;
            if (khdVar != null) {
                khdVar.onSuccess();
            }
            if (b.P(b.this) && b.e0(b.this)) {
                if (this.f12675a == null) {
                    z = true;
                }
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_new_framework", "add_rv_success", String.valueOf(z), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12676a;

        public c(Context context) {
            this.f12676a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f12676a, "命中购后新架构了，开始创建新架构容器", 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12677a;

        public d(Context context) {
            this.f12677a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f12677a, "命中购后新架构了，开始创建新架构容器", 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements NestedStaggeredGridLayoutManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.e f12678a;

        public e(a.e eVar) {
            this.f12678a = eVar;
        }

        public void a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ab2fb3", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else if (z) {
                this.f12678a.a((int) ctn.a(b.f0(b.this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            throw new RuntimeException("非法调用，请检查" + Arrays.toString(Thread.currentThread().getStackTrace()));
        }
    }

    static {
        t2o.a(729809946);
        W();
    }

    public b(z4a z4aVar, List<ISubService> list) {
        vnn.a(z4aVar.b(), this);
        if (!R()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.h = knn.g().d(z4aVar.b());
            fve.k("RecommendManagerImpl", "构建DX耗时： " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        if (list != null && !list.isEmpty()) {
            this.k = list;
        }
        Y(z4aVar);
        Z(z4aVar);
        fve.e("RecommendManagerImpl", "create NewRecommendManagerImpl: " + hashCode());
    }

    public static /* synthetic */ boolean P(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ef148f6", new Object[]{bVar})).booleanValue();
        }
        return bVar.W;
    }

    public static String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcc83ca", new Object[0]);
        }
        return "recommend_home_main";
    }

    public static /* synthetic */ boolean e0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b920d115", new Object[]{bVar})).booleanValue();
        }
        return bVar.g0();
    }

    public static /* synthetic */ RecyclerView f0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("f800bf57", new Object[]{bVar});
        }
        return bVar.j;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/manager/NewRecommendManagerImpl");
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7e486c", new Object[]{this});
            return;
        }
        IContainerDataModel<?> a2 = this.q.a(this.c.f32522a);
        if (a2 instanceof AwesomeGetContainerData) {
            AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) a2;
            awesomeGetContainerData.base = null;
            awesomeGetContainerData.delta = null;
            awesomeGetContainerData.totalSectionList.clear();
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73a1e84", new Object[]{this});
        } else {
            this.p.c("LoadCache", U(this.e, -1));
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void C(d11 d11Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984c3ee", new Object[]{this, d11Var, jSONObject});
            return;
        }
        if (d11Var == null || d11Var.c()) {
            this.f = null;
        } else {
            this.f = d11Var;
        }
        a(jSONObject);
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340f8e2", new Object[]{this, jSONObject});
            return;
        }
        JSONObject V = V();
        if (V != null) {
            JSONObject jSONObject2 = V.getJSONObject("bizParam");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.putAll(jSONObject);
            z4a z4aVar = this.c;
            if (z4aVar != null) {
                V.put("containerId", (Object) z4aVar.f32522a);
            }
            this.p.c("PullToRefresh", V);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419fa3d3", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a291138d", new Object[]{this, str});
        } else {
            this.u.c(str);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void G(a.AbstractC0720a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb83085e", new Object[]{this, aVar});
        } else if (this.j != null) {
            this.i = new SlideUpAnimationLogic(this.j, this.c.b(), this.r, aVar);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c14273c", new Object[]{this, new Integer(i)});
            return;
        }
        bqa.d("RecommendManagerImpl", "setBottomOffset : " + i);
        this.g = i;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c782b44", new Object[]{this, new Integer(i)});
        } else {
            d0("setCustomContainerWidth");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void J(a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129092a0", new Object[]{this, eVar});
            return;
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof NestedStaggeredGridLayoutManager) {
                ((NestedStaggeredGridLayoutManager) layoutManager).H(new e(eVar));
            }
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof NestedStaggeredGridLayoutManager) {
                ((NestedStaggeredGridLayoutManager) layoutManager).D(z);
            }
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void M(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb065cc3", new Object[]{this, z4aVar});
            return;
        }
        SlideUpAnimationLogic slideUpAnimationLogic = this.i;
        if (slideUpAnimationLogic != null) {
            slideUpAnimationLogic.z(this.c);
        }
        this.x.updateContainerType(new nh0(this.c));
        xxd xxdVar = this.t;
        if (xxdVar != null) {
            xxdVar.onPageSelected();
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView instanceof NestedScrollRecyclerView) {
            ((NestedScrollRecyclerView) recyclerView).updateContainerType(new nh0(this.c));
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bf5038", new Object[]{this});
        } else {
            d0("WeexNestedRecommend");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9c5abf", new Object[]{this});
        } else {
            d0("weexNestedRecommendWillReachTop");
        }
    }

    public RecyclerView Q(Context context, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("302e907b", new Object[]{this, context, new Boolean(z)});
        }
        if (cw6.b()) {
            get.a().h(new c(context));
        }
        this.b = new WeakReference<>(context);
        View c2 = this.m.c(context);
        if (c2 instanceof RecyclerView) {
            this.j = (RecyclerView) c2;
            b0();
            fve.e("RecommendManagerImpl", "createAfterBuyInfoFlowContainer success");
            if (z) {
                B();
            }
            if (g0()) {
                this.W = true;
                if (this.j != null) {
                    z2 = false;
                }
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_new_framework", "createContainer", String.valueOf(z2), null);
            }
            return this.j;
        } else if (c2 instanceof ViewGroup) {
            T((ViewGroup) c2);
            b0();
            fve.e("RecommendManagerImpl", "createAfterBuyInfoFlowContainer success");
            if (z) {
                B();
            }
            if (g0()) {
                this.W = true;
                if (this.j != null) {
                    z2 = false;
                }
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_new_framework", "createContainer", String.valueOf(z2), null);
            }
            return this.j;
        } else {
            fve.e("RecommendManagerImpl", "create AfterBuyInfoFlow error");
            if (!g0()) {
                return null;
            }
            this.W = true;
            if (this.j != null) {
                z2 = false;
            }
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_new_framework", "createContainer", String.valueOf(z2), null);
            return null;
        }
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43a927d", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableDelayCreateAfterBuyDxEngine", true);
    }

    public final b11 S(d11 d11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b11) ipChange.ipc$dispatch("1c340bb", new Object[]{this, d11Var});
        }
        if (d11Var != null) {
            return new b11(d11Var.a(), d11Var.b());
        }
        return null;
    }

    public final void T(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1c1fe0", new Object[]{this, viewGroup});
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                this.j = (RecyclerView) childAt;
            }
        }
    }

    public final JSONObject V() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("851967ea", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.d;
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
            jSONObject.put("bizParam", (Object) jSONObject2);
        }
        if (Localization.o()) {
            this.f = uyt.a();
            StringBuilder sb = new StringBuilder("海外多语言问海外要对应的api,api是: ");
            d11 d11Var = this.f;
            if (d11Var != null) {
                str = d11Var.a();
            } else {
                str = "";
            }
            sb.append(str);
            bqa.d("RecommendManagerImpl", sb.toString());
        }
        b11 S = S(this.f);
        if (S != null && !S.c()) {
            jSONObject.put("apiInfo", (Object) S);
        }
        return jSONObject;
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e22f106", new Object[]{this})).booleanValue();
        }
        if (this.p == null || this.y.getPrefetchDataModel() == null) {
            return false;
        }
        return true;
    }

    public final void Y(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17488b93", new Object[]{this, z4aVar});
            return;
        }
        this.c = z4aVar;
        JSONObject jSONObject = new JSONObject();
        this.e = jSONObject;
        jSONObject.put("containerId", (Object) this.c.f32522a);
    }

    public final void Z(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a092d5", new Object[]{this, z4aVar});
            return;
        }
        fve.e("RecommendManagerImpl", "initInfoFlowEngine");
        l9t.a(new dve.b(new yft()).D(new bgt()).M(new iue()).L(new j0b()).B(new cgt()).I(new n9t()).E(new wue()));
        nh0 nh0Var = new nh0(z4aVar);
        xue c2 = new xue.b(nh0Var).d(ph0.a(nh0Var, this.k)).c();
        this.l = c2;
        n2c b = c2.b();
        this.m = b;
        this.n = b.e();
        ejb b2 = this.m.b();
        this.o = b2;
        this.p = b2.getNetRequestInvoke();
        this.q = this.o.getContainerDataInvoker();
        this.r = this.o.getFirstScreenConfigInvoker();
        this.s = this.o.getUtInvoker();
        this.t = this.m.d();
        this.u = this.o.getContainerInvoker();
        this.w = this.o.getPopInvoker();
        this.v = this.o.getPassParamsInvoker();
        this.x = this.o.getStayTimeInvoker();
        this.y = this.o.getOrderPreRequestInvoker();
        this.p.a(new a(this));
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189685df", new Object[]{this});
            return;
        }
        JSONObject U = U(this.e, -1);
        U.put(IOrderListPrefetchService.NEED_SAVE_BIZ_PARAMS, "true");
        this.p.c("PageEnter", U);
    }

    @Override // com.taobao.tao.recommend4.manager.d, tb.nhd
    public void b(khd khdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c035d38", new Object[]{this, khdVar});
        } else if (khdVar != null) {
            this.A = khdVar;
            C0721b bVar = new C0721b(khdVar);
            this.z = bVar;
            uzc uzcVar = this.p;
            if (uzcVar != null) {
                uzcVar.b(bVar);
            }
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1de0f2", new Object[]{this});
        } else if (this.j != null) {
            z4a z4aVar = this.c;
            if (z4aVar != null && zn4.c(z4aVar.f32522a)) {
                this.j.setItemViewCacheSize(10);
            }
            this.j.setBackgroundResource(R.color.rec4_background_color);
            int i = 2;
            this.j.setOverScrollMode(2);
            RecyclerView.LayoutManager layoutManager = this.j.getLayoutManager();
            if (layoutManager instanceof InfoFlowStaggeredGridLayoutManager) {
                i = ((InfoFlowStaggeredGridLayoutManager) layoutManager).getSpanCount();
            }
            c0(i, this.j);
            this.u.d(this.g);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, tb.nhd
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e268c27", new Object[]{this, jSONObject});
            return;
        }
        a(jSONObject);
        this.B = true;
    }

    public final void c0(int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db2f141", new Object[]{this, new Integer(i), recyclerView});
            return;
        }
        NestedStaggeredGridLayoutManager nestedStaggeredGridLayoutManager = new NestedStaggeredGridLayoutManager(i, 1);
        z4a z4aVar = this.c;
        if (z4aVar != null && zn4.c(z4aVar.f32522a)) {
            nestedStaggeredGridLayoutManager.setGapStrategy(0);
        }
        nestedStaggeredGridLayoutManager.C(recyclerView);
        recyclerView.setLayoutManager(nestedStaggeredGridLayoutManager);
    }

    @Override // com.taobao.tao.recommend4.manager.d, tb.nhd
    public ViewGroup d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6cc4cd67", new Object[]{this, context, new Boolean(z)});
        }
        if (cw6.b()) {
            get.a().h(new d(context));
        }
        this.b = new WeakReference<>(context);
        View c2 = this.m.c(context);
        if (c2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) c2;
            T(viewGroup);
            b0();
            fve.e("RecommendManagerImpl", "createAfterBuyInfoFlowContainer success");
            if (z) {
                B();
            }
            return viewGroup;
        }
        fve.e("RecommendManagerImpl", "createAfterBuyInfoFlow error");
        return null;
    }

    public final void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e018b6", new Object[]{this, str});
            return;
        }
        fve.e("RecommendManagerImpl", str);
        if (cw6.b()) {
            get.a().e(new f());
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public RecyclerView e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ef4e8da7", new Object[]{this, context});
        }
        return Q(context, false);
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        d0("getDinamicXEngine");
        return this.h;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f9d31c7", new Object[]{this})).intValue();
        }
        d0("getAdaptiveColumnCount");
        return 2;
    }

    public final boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a68828cc", new Object[]{this})).booleanValue();
        }
        z4a z4aVar = this.c;
        if (z4aVar == null) {
            return false;
        }
        return TextUtils.equals(z4a.REC_ORDER_LIST.f32522a, z4aVar.f32522a);
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.c.f32522a;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public z4a getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("acca2aa6", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        d0("getExt");
        return null;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public AwesomeGetPageData getPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("8667d832", new Object[]{this});
        }
        d0("getPageParams");
        return null;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.j;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0b739e", new Object[]{this, jSONObject});
        } else {
            d0("NotifyItemClicked");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2889a22", new Object[]{this});
        } else {
            d0("requestNextPageData");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        d0("isAdaptHudScreen");
        return false;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public boolean isLastPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3afa9a", new Object[]{this})).booleanValue();
        }
        d0("isLastPage");
        return false;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e389cb4e", new Object[]{this, jSONObject});
        } else {
            d0("requestNewInteractiveData");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void l(rjj rjjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe22137a", new Object[]{this, rjjVar, jSONObject});
        } else {
            d0("replaceRequest");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public d11 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d11) ipChange.ipc$dispatch("4332921f", new Object[]{this});
        }
        return this.f;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6fd718", new Object[]{this});
        } else {
            d0("retryRequestData");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public List<SectionModel> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a50ccf7e", new Object[]{this});
        }
        IContainerDataModel<?> a2 = this.q.a(this.c.f32522a);
        if (!(a2 instanceof IContainerDataModel)) {
            return null;
        }
        List<?> totalData = a2.getTotalData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : totalData) {
            if (obj instanceof SectionModel) {
                arrayList.add((SectionModel) obj);
            }
        }
        return arrayList;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public mhd p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhd) ipChange.ipc$dispatch("38ecf3b8", new Object[]{this});
        }
        fve.e("RecommendManagerImpl", "getRecommendLifeCycleReport");
        return null;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed34e23e", new Object[]{this, jSONObject});
        } else {
            d0("delDataByObject");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        vnn.c(this.c.f32522a, this);
        this.n.onDestroyView();
        this.n.onDestroy();
        xue xueVar = this.l;
        if (xueVar != null) {
            xueVar.a();
            this.l = null;
        }
        bqa.d("RecommendManagerImpl", "destroy RecommendManagerImpl: " + hashCode());
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public String s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f316ffc", new Object[]{this, str, str2});
        }
        d0("getValueByPassParams");
        return null;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f3aa2a", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void y(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20cc848", new Object[]{this, map});
            return;
        }
        this.n.onResume();
        if (ron.d(this)) {
            this.p.c("PageBack", U(this.e, -1));
        }
    }

    public final JSONObject U(JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f966dc55", new Object[]{this, jSONObject, new Integer(i)});
        }
        JSONObject V = V();
        String str = this.c.f32522a;
        V.put("containerId", (Object) str);
        if (V.getJSONObject("bizParam") != null) {
            jSONObject2 = V.getJSONObject("bizParam");
        } else {
            JSONObject jSONObject3 = new JSONObject();
            V.put("bizParam", (Object) jSONObject3);
            jSONObject2 = jSONObject3;
        }
        String str2 = kmn.f22763a;
        if (V.getString(str2) != null) {
            jSONObject2.put(str2, (Object) V.getString(str2));
        }
        if (i >= 0) {
            jSONObject2.put("tabIndex", (Object) Integer.valueOf(i + 1));
        }
        if (jSONObject != null) {
            jSONObject2.put("appId", (Object) jSONObject.getString("appId"));
        }
        jSONObject2.put("new2021UIEnable", (Object) Boolean.valueOf(Revision.b().g()));
        jSONObject2.put(q92.IS_COMPLEX_TEXTURE, (Object) Boolean.valueOf(q92.a()));
        String a2 = vma.a(str);
        if (!TextUtils.isEmpty(a2)) {
            jSONObject2.put("guessModelVersion", (Object) a2);
        }
        return V;
    }

    @Override // com.taobao.tao.recommend4.manager.d, tb.nhd
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fecb010", new Object[]{this, jSONObject});
        } else if (zn4.c(this.c.f32522a) && jSONObject != null && jSONObject.getBooleanValue(KEY_IS_PULL_REFRESH)) {
            D(jSONObject);
        } else if (this.B) {
            this.B = false;
        } else {
            if (jSONObject != null) {
                this.B = jSONObject.getBooleanValue(KEY_IS_PREFETCH);
            }
            this.d = jSONObject;
            if (jSONObject == null) {
                this.d = new JSONObject();
            }
            if (ron.a(this)) {
                this.d.put("isNeedSubSelectionData", (Object) Boolean.TRUE);
            } else {
                this.d.put("isNeedSubSelectionData", (Object) Boolean.FALSE);
            }
            this.q.b(this.c.f32522a, "manualRequest");
            if (this.c.f32522a.contains(OrderBizCode.orderList) && X() && this.y.hasSwitchTab()) {
                if (jSONObject == null || !jSONObject.containsKey("orderIdsStr")) {
                    this.y.consumePrefetchData(0, this.z);
                    this.y.resetSwitchTabStatus();
                    return;
                }
                String string = jSONObject.getString("orderIdsStr");
                if (!TextUtils.isEmpty(string)) {
                    String[] split = string.split(",");
                    if (split.length < 3) {
                        this.y.consumePrefetchData(split.length, this.z);
                        this.y.resetSwitchTabStatus();
                        return;
                    }
                }
            }
            a0();
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73b2f286", new Object[]{this})).intValue();
        }
        fve.e("RecommendManagerImpl", "新架构调用getCustomContainerWidth");
        return 0;
    }
}
