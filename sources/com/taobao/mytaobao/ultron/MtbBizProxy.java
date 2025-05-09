package com.taobao.mytaobao.ultron;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.BasementViewController;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.ui.TitleBarHelper;
import com.taobao.mytaobao.ultron.MTBPresenter;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import com.taobao.mytaobao.ultron.utils.RecyclerViewScrollListenerExposure;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.oversea.mytaobao.OvsMTPtrRecyclerView;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.a4j;
import tb.b38;
import tb.cpt;
import tb.ew;
import tb.ggj;
import tb.hqb;
import tb.igj;
import tb.ijf;
import tb.ish;
import tb.jqw;
import tb.kgj;
import tb.ko5;
import tb.l3j;
import tb.lqw;
import tb.n78;
import tb.p3j;
import tb.qqr;
import tb.qsh;
import tb.s1c;
import tb.s32;
import tb.sb7;
import tb.sc;
import tb.sgj;
import tb.srk;
import tb.suv;
import tb.t1c;
import tb.t2o;
import tb.t32;
import tb.u3j;
import tb.uib;
import tb.uoc;
import tb.uv6;
import tb.uxo;
import tb.yot;
import tb.z6t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtbBizProxy extends ew implements View.OnClickListener, uoc, hqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = MtbBizProxy.class.getSimpleName();
    public s1c A;
    public LinearLayout f;
    public LinearLayout g;
    public qsh i;
    public TBSwipeRefreshLayout k;
    public RecyclerViewScrollListenerExposure l;
    public BroadcastReceiver o;
    public BroadcastReceiver p;
    public BasementViewController q;
    public boolean r;
    public long t;
    public View u;
    public MTBPresenter.j z;
    public final MTBPresenter h = new MTBPresenter();
    public final TitleBarHelper j = new TitleBarHelper();
    public boolean m = true;
    public boolean n = false;
    public boolean s = false;
    public boolean v = true;
    public final yot w = new yot();
    public final a4j x = new a4j();
    public final jqw y = new qqr();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class MyTaobaoPageBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745538074);
        }

        public MyTaobaoPageBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(MyTaobaoPageBroadcastReceiver myTaobaoPageBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MtbBizProxy$MyTaobaoPageBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !TextUtils.isEmpty(intent.getAction()) && !sgj.b(MtbBizProxy.this.i())) {
                String action = intent.getAction();
                if (MtbBizProxy.G(MtbBizProxy.this) == null) {
                    return;
                }
                if (!kgj.ACTION_REFRESH_PAGE_WHEN_SHOW.equals(action) || MtbBizProxy.K(MtbBizProxy.this)) {
                    MtbBizProxy.G(MtbBizProxy.this).M(action, intent);
                } else {
                    MtbBizProxy.J(MtbBizProxy.this, true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class PageBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745538075);
        }

        public PageBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(PageBroadcastReceiver pageBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MtbBizProxy$PageBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !TextUtils.isEmpty(intent.getAction()) && !sgj.b(MtbBizProxy.this.i())) {
                if (TextUtils.equals(cpt.ACTION_THEME_CHANGE, intent.getAction()) || TextUtils.equals(FestivalMgr.ACTION_FESTIVAL_CHANGE, intent.getAction())) {
                    MtbBizProxy.this.j.p();
                    if (System.currentTimeMillis() - MtbBizProxy.L(MtbBizProxy.this) >= 3000) {
                        MtbBizProxy.G(MtbBizProxy.this).i0();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f11343a;
        public final /* synthetic */ Activity b;

        public b(boolean z, Activity activity) {
            this.f11343a = z;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            uv6.k("进入异步1");
            l3j l3jVar = l3j.INSTANCE;
            l3jVar.r();
            uv6.k("进入异步2");
            l3jVar.v();
            uv6.k("进入异步3");
            b38.INSTANCE.a(MtbBizProxy.D(MtbBizProxy.this).f());
            uv6.k("进入异步4");
            if (!this.f11343a) {
                MtbBizProxy.this.n().l(this.b);
            }
            uv6.k("进入异步5");
            l3jVar.s();
            l3jVar.t();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtbBizProxy.E(MtbBizProxy.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            } else {
                MtbBizProxy.this.j.k(i * (-1));
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            MtbBizProxy.F(MtbBizProxy.this).setRefreshing(true);
            MtbBizProxy.G(MtbBizProxy.this).g0("action_pull_refresh");
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
            MtbBizProxy.this.l().smoothScrollToPosition(0);
            if (MtbBizProxy.this.l() instanceof OvsMTPtrRecyclerView) {
                ((OvsMTPtrRecyclerView) MtbBizProxy.this.l()).scrollChildRVToTop();
            }
            suv.d(u3j.b, "Page_MyTaobao_click-headbar", "a2141.7631743.1102.1", null, null);
            if (MtbBizProxy.H(MtbBizProxy.this) != null && MtbBizProxy.H(MtbBizProxy.this).a()) {
                MtbBizProxy.H(MtbBizProxy.this).F("headerTap");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements uxo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.uxo
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3df347ce", new Object[]{this, new Boolean(z)});
            } else if (MtbBizProxy.F(MtbBizProxy.this) != null) {
                MtbBizProxy.F(MtbBizProxy.this).enablePullRefresh(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ RecyclerView c;
        public final /* synthetic */ boolean d;

        public h(String str, RecyclerView recyclerView, boolean z) {
            this.b = str;
            this.c = recyclerView;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (MtbBizProxy.H(MtbBizProxy.this) != null && MtbBizProxy.H(MtbBizProxy.this).a()) {
                MtbBizProxy.H(MtbBizProxy.this).F(this.b);
            }
            RecyclerView recyclerView = this.c;
            if (recyclerView instanceof OvsMTPtrRecyclerView) {
                ((OvsMTPtrRecyclerView) recyclerView).scrollChildRVToTop();
            }
            if (this.d) {
                this.c.smoothScrollToPosition(0);
            } else if (this.c.getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) this.c.getLayoutManager()).scrollToPositionWithOffset(0, 0);
            } else {
                this.c.scrollToPosition(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements srk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.srk
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
            }
            if (!MtbBizProxy.this.m().isVisible() || keyEvent.getAction() != 0 || i != 4 || MtbBizProxy.H(MtbBizProxy.this) == null || !MtbBizProxy.H(MtbBizProxy.this).a()) {
                return false;
            }
            suv.d(u3j.b, "Page_MyTaobao_slide-basement", "a2141.7631743.567.1", null, null);
            MtbBizProxy.this.A("backPress", true);
            return true;
        }
    }

    static {
        t2o.a(745538064);
        t2o.a(745538144);
        t2o.a(745537605);
    }

    public MtbBizProxy(MyTaobaoFragment myTaobaoFragment) {
        super(myTaobaoFragment);
    }

    public static /* synthetic */ a4j D(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a4j) ipChange.ipc$dispatch("4b8881b8", new Object[]{mtbBizProxy});
        }
        return mtbBizProxy.x;
    }

    public static /* synthetic */ void E(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f994ea", new Object[]{mtbBizProxy});
        } else {
            mtbBizProxy.O();
        }
    }

    public static /* synthetic */ TBSwipeRefreshLayout F(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout) ipChange.ipc$dispatch("f239a526", new Object[]{mtbBizProxy});
        }
        return mtbBizProxy.k;
    }

    public static /* synthetic */ MTBPresenter G(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBPresenter) ipChange.ipc$dispatch("b52a9cb7", new Object[]{mtbBizProxy});
        }
        return mtbBizProxy.h;
    }

    public static /* synthetic */ BasementViewController H(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasementViewController) ipChange.ipc$dispatch("8e7526f0", new Object[]{mtbBizProxy});
        }
        return mtbBizProxy.q;
    }

    public static /* synthetic */ RecyclerViewScrollListenerExposure I(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewScrollListenerExposure) ipChange.ipc$dispatch("ad70641c", new Object[]{mtbBizProxy});
        }
        return mtbBizProxy.l;
    }

    public static /* synthetic */ boolean J(MtbBizProxy mtbBizProxy, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb1dffc7", new Object[]{mtbBizProxy, new Boolean(z)})).booleanValue();
        }
        mtbBizProxy.n = z;
        return z;
    }

    public static /* synthetic */ boolean K(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88d67a74", new Object[]{mtbBizProxy})).booleanValue();
        }
        return mtbBizProxy.Y();
    }

    public static /* synthetic */ long L(MtbBizProxy mtbBizProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe50a0a5", new Object[]{mtbBizProxy})).longValue();
        }
        return mtbBizProxy.t;
    }

    public static /* synthetic */ Object ipc$super(MtbBizProxy mtbBizProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MtbBizProxy");
    }

    @Override // tb.ew
    public void A(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce385b6", new Object[]{this, str, new Boolean(z)});
            return;
        }
        MTPtrRecyclerView l = l();
        if (l != null) {
            h hVar = new h(str, l, z);
            if (l.isAttachedToWindow()) {
                hVar.run();
            } else {
                l.post(hVar);
            }
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba51d528", new Object[]{this});
        } else {
            this.j.d(false, null);
        }
    }

    public void N(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03dd72a", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            this.w.a(z, jSONObject);
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf80d56", new Object[]{this});
            return;
        }
        lqw.d().b(this.y);
        Z();
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266728d7", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.k;
        if (tBSwipeRefreshLayout != null && tBSwipeRefreshLayout.isRefreshing()) {
            this.k.setRefreshing(false);
        }
        MTBPresenter.j jVar = this.z;
        if (jVar != null) {
            ((g) jVar).b(2, 0, 2, null);
        }
    }

    public void Q(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc3c6fb", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        a L = this.h.L();
        if (L != null) {
            if (z) {
                if (L.w() != null) {
                    L.w().k();
                }
                L.e0(jSONObject, this.h.c);
            } else {
                L.T(this.h.c);
            }
        }
        T();
        this.j.l(true);
        N(false, MTBPresenter.H(jSONObject.getJSONObject("data")));
        MTBPresenter.j jVar = this.z;
        if (jVar != null) {
            ((g) jVar).b(2, 0, 0, jSONObject);
        }
    }

    public BasementViewController R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasementViewController) ipChange.ipc$dispatch("1e46c170", new Object[]{this});
        }
        return this.q;
    }

    public uib S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uib) ipChange.ipc$dispatch("93904eb2", new Object[]{this});
        }
        return this.q;
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95399262", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.k;
        if (tBSwipeRefreshLayout != null && tBSwipeRefreshLayout.isRefreshing()) {
            this.k.setRefreshing(false);
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        X();
        V();
        a0();
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6ece9f", new Object[]{this});
        } else if (this.u != null && this.k != null) {
            TBOldRefreshHeader tBOldRefreshHeader = new TBOldRefreshHeader(this.u.getContext());
            tBOldRefreshHeader.setBackgroundColor(0);
            this.k.setHeaderView(tBOldRefreshHeader);
            int f2 = this.j.f();
            if (f2 != -1) {
                tBOldRefreshHeader.setRefreshTipColor(f2);
            }
            this.k.setCustomRefreshHeight(DensityUtil.dip2px(this.u.getContext(), 40.0f));
            BasementViewController basementViewController = this.q;
            if (basementViewController == null || !basementViewController.a()) {
                this.k.enablePullRefresh(true);
            } else {
                this.k.enablePullRefresh(false);
            }
            this.k.setDragRate(0.75f);
            this.k.setOnPullRefreshListener(new d());
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        sc.b(sc.initView);
        MTPtrRecyclerView mTPtrRecyclerView = (MTPtrRecyclerView) this.u.findViewById(R.id.recycler_view);
        C(mTPtrRecyclerView);
        mTPtrRecyclerView.setItemViewCacheSize(15);
        mTPtrRecyclerView.onScrollEnableChangeListener = new f();
        this.f = (LinearLayout) this.u.findViewById(R.id.top_layout);
        this.g = (LinearLayout) this.u.findViewById(R.id.bottom_layout);
        TBSwipeRefreshLayout tBSwipeRefreshLayout = (TBSwipeRefreshLayout) this.u.findViewById(R.id.mtb_refresh);
        this.k = tBSwipeRefreshLayout;
        tBSwipeRefreshLayout.enableLoadMore(false);
        uv6.l("before");
        UserHeaderBgLayout userHeaderBgLayout = (UserHeaderBgLayout) this.u.findViewById(R.id.mtb_head_layout);
        this.w.c(userHeaderBgLayout);
        this.j.h(this.u, mTPtrRecyclerView, this.k, userHeaderBgLayout);
        this.j.n(mTPtrRecyclerView);
        this.j.c(i());
        uv6.l("after initView 1");
        this.q = new BasementViewController(mTPtrRecyclerView, this);
        uv6.l("after initView 2");
        sc.c(sc.initView);
        uv6.l("after initView");
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3fb5b14", new Object[]{this})).booleanValue();
        }
        if (!m().isAdded() || !m().isResumed() || com.taobao.tao.navigation.a.o() == null || com.taobao.tao.navigation.a.o().getCurrentTab() != 4) {
            return false;
        }
        return true;
    }

    @Override // tb.hqb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803d8ea1", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(i());
        suv.a I = BasementFeedDataProvider.INSTANCE.I(ish.g().c());
        m().setUTPageName(I.f28289a);
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(i(), I.f28289a);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(i(), I.f28289a);
        HashMap hashMap = new HashMap();
        if (com.taobao.mytaobao.basement.a.d()) {
            hashMap.put("isWeex", "true");
        }
        suv.j(BasementViewController.class.getName(), i(), I.f28289a, I.b, hashMap);
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("spm-url", I.b);
        suv.l(hashMap2);
        if (m().isResumed()) {
            s32.c().k("changeToBasementStatus");
        } else {
            s32.c().j("changeToBasementStatus", "-1", "");
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        BasementViewController basementViewController = this.q;
        if (basementViewController != null) {
            basementViewController.R(this);
            k().n(this.q);
        }
        this.i.e(this);
        this.j.m(new e());
    }

    @Override // tb.uoc
    public DXWidgetNode b(String str) {
        RecyclerView.LayoutManager layoutManager;
        DXWidgetNode flattenWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c707e44c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (layoutManager = l().getLayoutManager()) == null) {
            return null;
        }
        for (int i2 = 0; i2 < layoutManager.getItemCount(); i2++) {
            View findViewByPosition = layoutManager.findViewByPosition(i2);
            if (!(!(findViewByPosition instanceof DXRootView) || (flattenWidgetNode = ((DXRootView) findViewByPosition).getFlattenWidgetNode()) == null || (queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str)) == null)) {
                return queryWidgetNodeByUserId;
            }
        }
        return null;
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1eb63a", new Object[]{this});
            return;
        }
        Activity i2 = i();
        if (i2 instanceof TBMainActivity) {
            ((TBMainActivity) i2).registerOnKeyDownListener(new i());
        }
    }

    @Override // tb.hqb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db88d65a", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(i());
        m().setUTPageName(u3j.b);
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(i(), m().getUTPageName());
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(i(), u3j.b);
        HashMap hashMap = new HashMap();
        hashMap.put("scm", "20140623.1.20.2");
        hashMap.put("spm-cnt", "a2141.7631743");
        if (com.taobao.mytaobao.basement.a.d()) {
            hashMap.put("isWeex", "true");
        }
        suv.n(i(), hashMap);
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("spm-url", "a2141.7631743");
        suv.l(hashMap2);
    }

    public void c0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe400b9", new Object[]{this, new Integer(i2)});
            return;
        }
        boolean d2 = com.taobao.mytaobao.basement.a.d();
        BasementViewController basementViewController = this.q;
        if (basementViewController != null && d2 && basementViewController.J()) {
            this.q.X(i2);
        }
    }

    @Override // tb.uoc
    public JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c49e2c0", new Object[]{this, str});
        }
        BasementViewController basementViewController = this.q;
        if (basementViewController == null) {
            return null;
        }
        return basementViewController.G().f(str);
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5da239", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.o;
        if (broadcastReceiver != null) {
            kgj.c(true, broadcastReceiver);
            kgj.c(false, this.o);
        }
        BroadcastReceiver broadcastReceiver2 = this.p;
        if (broadcastReceiver2 != null) {
            kgj.c(true, broadcastReceiver2);
        }
        if (this.A != null) {
            ((t1c) n78.a(t1c.class)).removeChangeVersionListener(this.A);
        }
    }

    @Override // tb.uoc
    public void e(String str, JSONObject jSONObject) {
        BasementViewController.i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758866ee", new Object[]{this, str, jSONObject});
            return;
        }
        BasementViewController basementViewController = this.q;
        if (basementViewController == null) {
            iVar = null;
        } else {
            iVar = basementViewController.G();
        }
        if (iVar != null) {
            iVar.k(str, jSONObject);
        }
    }

    @Override // tb.uoc
    public Pair<Rect, Boolean> f() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5e426f69", new Object[]{this});
        }
        FrameLayout flEndViewContainer = l().getFlEndViewContainer();
        if (flEndViewContainer == null || !com.taobao.mytaobao.basement.a.d()) {
            return null;
        }
        Rect rect = new Rect();
        if (flEndViewContainer.getGlobalVisibleRect(rect) && flEndViewContainer.isShown()) {
            z = true;
        }
        return new Pair<>(rect, Boolean.valueOf(z));
    }

    @Override // tb.uoc
    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.u;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // tb.ew
    public void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        }
    }

    @Override // tb.ew
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        MtbGlobalEnv.i = null;
        this.j.e();
        RecyclerViewScrollListenerExposure recyclerViewScrollListenerExposure = this.l;
        if (recyclerViewScrollListenerExposure != null) {
            recyclerViewScrollListenerExposure.w();
        }
        this.h.U();
        BasementViewController basementViewController = this.q;
        if (basementViewController != null) {
            basementViewController.L();
        }
        qsh qshVar = this.i;
        if (qshVar != null) {
            qshVar.c();
        }
        sb7.b(Login.getUserId()).g();
        try {
            d0();
        } catch (Exception unused) {
        }
        Activity i2 = i();
        if (i2 instanceof TBMainActivity) {
            ((TBMainActivity) i2).registerOnKeyDownListener(null);
        }
        lqw.d().h(this.y);
        n().m();
    }

    @Override // tb.ew
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        BasementViewController basementViewController = this.q;
        if (basementViewController != null) {
            basementViewController.M();
        }
    }

    @Override // tb.ew
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ggj.a();
        RecyclerViewScrollListenerExposure recyclerViewScrollListenerExposure = this.l;
        if (recyclerViewScrollListenerExposure != null) {
            recyclerViewScrollListenerExposure.z(l());
        }
        BehaviR.getInstance().commitLeave(u3j.b, null, i(), "");
        t32.b().f(S());
    }

    @Override // tb.ew
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.ew
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.m = true;
        RecyclerViewScrollListenerExposure recyclerViewScrollListenerExposure = this.l;
        if (recyclerViewScrollListenerExposure != null) {
            recyclerViewScrollListenerExposure.onStop();
        }
    }

    @Override // tb.ew
    public void y(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ee6d49", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        MtbGlobalEnv.o = System.currentTimeMillis();
        this.x.d(activity);
        l3j.INSTANCE.u();
        p3j.g(new b(n().l(activity), activity));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements MTBPresenter.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.mytaobao.ultron.MTBPresenter.j
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7060b02a", new Object[]{this});
            } else if (MtbBizProxy.I(MtbBizProxy.this) != null) {
                MtbBizProxy.I(MtbBizProxy.this).z(MtbBizProxy.this.l());
            }
        }

        @Override // com.taobao.mytaobao.ultron.MTBPresenter.j
        public void b(int i, int i2, int i3, JSONObject jSONObject) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb547786", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
                return;
            }
            TLog.loge("mtbMainLink", "onRequestPageFinish,requestType=" + i);
            if (i2 == 0) {
                TitleBarHelper titleBarHelper = MtbBizProxy.this.j;
                if (i != 0) {
                    z = false;
                }
                titleBarHelper.d(z, jSONObject);
                if (MtbBizProxy.I(MtbBizProxy.this) != null) {
                    MtbBizProxy.I(MtbBizProxy.this).w();
                    if (i != 0) {
                        MtbBizProxy.I(MtbBizProxy.this).z(MtbBizProxy.this.l());
                    }
                }
            }
        }
    }

    @Override // tb.ew
    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        uv6.d("mtbOnCreateView");
        uv6.m();
        if (this.u == null) {
            sc.b(sc.outerFragmentOnCreateView);
            B(viewGroup);
            if (MtbGlobalEnv.x()) {
                this.u = layoutInflater.inflate(R.layout.mtb_ovs_activity_layout, viewGroup, false);
            } else {
                this.u = layoutInflater.inflate(R.layout.mtb_activity_layout, viewGroup, false);
            }
            uv6.l("step 1");
            sc.b(sc.viewInflate);
            sc.c(sc.viewInflate);
            U();
            uv6.l("step 2");
            igj.b(new ijf(this));
            a0();
            b0();
            sc.c(sc.outerFragmentOnCreateView);
            uv6.l("step 4");
            W();
            this.h.d.postDelayed(new c(), 2000L);
        }
        uv6.f();
        sc.c("myTaobaoOnCreate");
        uv6.l("step 5");
        return this.u;
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        uv6.l("beforeInitData");
        sc.b("mytaobaoInitData");
        sc.b("ultronDXContainerInit");
        a e2 = this.x.e();
        uv6.l("beforeInitData 1");
        ko5 g2 = this.x.g();
        if (g2 == null) {
            g2 = new ko5();
        }
        this.h.A(this, this.r, e2, g2);
        uv6.l("beforeInitData 2");
        this.h.N(m(), this.f, l(), this.g);
        uv6.l("beforeInitData 3");
        sc.c("ultronDXContainerInit");
        sc.b(sc.initSnapshot);
        g gVar = new g();
        this.z = gVar;
        this.h.o0(gVar);
        this.l = new RecyclerViewScrollListenerExposure(this.h.L(), l());
        l().addOnScrollListener(this.l);
        uv6.l("beforeInitData 4");
        this.h.Q();
        uv6.l("beforeInitData 5");
        uv6.l("beforeInitData 6");
        z6t.T(this.r).e("PageInit", null);
        sc.c(sc.initSnapshot);
        if (com.taobao.mytaobao.basement.a.d()) {
            sc.b(sc.initWindWeexBasement);
            String b2 = com.taobao.mytaobao.basement.a.b();
            if (!TextUtils.isEmpty(b2)) {
                z6t.T(this.r).a(true);
                if (this.q != null) {
                    com.taobao.mytaobao.basement.a.p();
                    uv6.l("beforeInitData 6.1");
                    this.q.G().h("initByCache", b2);
                }
            } else {
                z6t.W("【错误】首次预加载，weexUrl=null");
            }
            sc.c(sc.initWindWeexBasement);
        } else {
            z6t.T(this.r).a(false);
        }
        this.h.S();
        this.h.w();
        uv6.l("beforeInitData 7");
        this.i = new qsh();
        sc.c("mytaobaoInitData");
        uv6.l("beforeInitData 8");
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55dfb94", new Object[]{this});
            return;
        }
        this.o = new MyTaobaoPageBroadcastReceiver();
        PageBroadcastReceiver pageBroadcastReceiver = new PageBroadcastReceiver();
        this.p = pageBroadcastReceiver;
        kgj.a(true, pageBroadcastReceiver, FestivalMgr.ACTION_FESTIVAL_CHANGE);
        kgj.a(false, this.o, "MyTaobao_Order_Refresh", "EDITON_SWITCHER_EDITTION_CODE_CHANGED", kgj.ACTION_REFRESH_PAGE, "AVATAR_CHANGED_SUCCESS");
        kgj.a(true, this.o, "MyTaobao_Order_Refresh", kgj.ACTION_REFRESH_PAGE, kgj.ACTION_SCROLL_TO_CARD, "taobao.action.ACTION_REVISION_SWITCH_CHANGE", kgj.ACTION_REFRESH_PAGE_WHEN_SHOW);
        this.A = new a(this);
        ((t1c) n78.a(t1c.class)).addChangeVersionListener(this.A);
    }

    @Override // tb.ew
    public void q(Bundle bundle) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        sc.b("myTaobaoOnCreate");
        sc.b(sc.outerFragmentOnCreate);
        m().setUTPageName(u3j.b);
        s32.c().d(bundle);
        this.t = System.currentTimeMillis();
        if (MtbGlobalEnv.o == 0) {
            MtbGlobalEnv.o = System.currentTimeMillis();
        }
        if (bundle != null) {
            z = true;
        }
        this.r = z;
        z6t.T(z).g(1);
        z6t.T(this.r).b("PageInit");
        sc.c(sc.outerFragmentOnCreate);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    @Override // tb.ew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.ultron.MtbBizProxy.v():void");
    }

    @Override // tb.ew
    public void o(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
        } else if (loginAction != null) {
            if (loginAction.equals(LoginAction.NOTIFY_LOGOUT)) {
                this.h.u();
                z6t.T(this.r).f(1);
                TLog.loge("mtbMainLink", "收到NOTIFY_LOGOUT, thread=" + Thread.currentThread().getName());
                this.s = true;
            } else if (loginAction.equals(LoginAction.NOTIFY_LOGIN_SUCCESS) && !sgj.b(i())) {
                TLog.loge("mtbMainLink", "收到NOTIFY_LOGIN_SUCCESS, thread=" + Thread.currentThread().getName() + " isLogout=" + this.s);
                if (this.s) {
                    z6t.T(this.r).g(2);
                    BasementViewController basementViewController = this.q;
                    if (basementViewController != null && basementViewController.J()) {
                        A("changeAccount", false);
                        this.q.O();
                    }
                }
                this.h.R();
                l3j.INSTANCE.i();
                this.m = true;
                this.s = false;
            }
        }
    }
}
