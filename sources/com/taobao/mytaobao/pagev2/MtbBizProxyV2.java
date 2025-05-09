package com.taobao.mytaobao.pagev2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.BasementViewController;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.pagev2.architecture.MtbAdapter;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;
import com.taobao.mytaobao.pagev2.presenter.MtbPageExposureProcessor;
import com.taobao.mytaobao.pagev2.presenter.MtbPresenterV2;
import com.taobao.mytaobao.pagev2.ui.TitleBarHelperV2;
import com.taobao.mytaobao.ultron.MTBLayoutManagerV2;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.ut.mini.UTAnalytics;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.ew;
import tb.ggj;
import tb.h3j;
import tb.hqb;
import tb.i04;
import tb.igj;
import tb.ih4;
import tb.ijf;
import tb.iln;
import tb.j3j;
import tb.jpu;
import tb.osh;
import tb.pl4;
import tb.q3j;
import tb.q46;
import tb.qsh;
import tb.qun;
import tb.r32;
import tb.s32;
import tb.s3j;
import tb.sb7;
import tb.sc;
import tb.srk;
import tb.suv;
import tb.t2o;
import tb.t32;
import tb.tz9;
import tb.u3j;
import tb.uib;
import tb.uoc;
import tb.uv6;
import tb.uxo;
import tb.x3j;
import tb.zot;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbBizProxyV2 extends ew implements hqb, uoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View f;
    public final j3j g;
    public final MtbWeexManager h;
    public final MtbAdapter i;
    public qun j;
    public x3j m;
    public long o;
    public qsh q;
    public final zot k = new zot();
    public final TitleBarHelperV2 l = new TitleBarHelperV2();
    public final MtbPresenterV2 n = new MtbPresenterV2(this);
    public final MtbPageExposureProcessor p = new MtbPageExposureProcessor();
    public final u3j r = new u3j();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ qun b;

        public a(qun qunVar) {
            this.b = qunVar;
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            } else {
                MtbBizProxyV2.J(MtbBizProxyV2.this).e(i * (-1));
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            this.b.a().setRefreshing(true);
            MtbDataServiceFacade.y(2);
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
    public static final class b implements uxo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qun f11262a;

        public b(qun qunVar) {
            this.f11262a = qunVar;
        }

        @Override // tb.uxo
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3df347ce", new Object[]{this, new Boolean(z)});
            } else {
                this.f11262a.a().enablePullRefresh(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MTPtrRecyclerView b;

        public c(MTPtrRecyclerView mTPtrRecyclerView) {
            this.b = mTPtrRecyclerView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.b.smoothScrollToPosition(0);
            suv.d(u3j.b, "Page_MyTaobao_click-headbar", "a2141.7631743.1102.1", null, null);
            if (MtbBizProxyV2.G(MtbBizProxyV2.this).a()) {
                MtbBizProxyV2.G(MtbBizProxyV2.this).q("headerTap");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements srk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.srk
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
            }
            if (!MtbBizProxyV2.this.m().isVisible()) {
                return false;
            }
            ckf.c(keyEvent, "event");
            if (keyEvent.getAction() != 0 || i != 4 || !MtbBizProxyV2.G(MtbBizProxyV2.this).a()) {
                return false;
            }
            suv.d(u3j.b, "Page_MyTaobao_slide-basement", "a2141.7631743.567.1", null, null);
            MtbBizProxyV2.this.A("backPress", true);
            return true;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ MTPtrRecyclerView d;
        public final /* synthetic */ RecyclerView.LayoutManager e;

        public e(String str, boolean z, MTPtrRecyclerView mTPtrRecyclerView, RecyclerView.LayoutManager layoutManager) {
            this.b = str;
            this.c = z;
            this.d = mTPtrRecyclerView;
            this.e = layoutManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (MtbBizProxyV2.G(MtbBizProxyV2.this).a()) {
                MtbBizProxyV2.G(MtbBizProxyV2.this).q(this.b);
            }
            if (this.c) {
                this.d.smoothScrollToPosition(0);
                return;
            }
            RecyclerView.LayoutManager layoutManager = this.e;
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
            } else {
                this.d.scrollToPosition(0);
            }
        }
    }

    static {
        t2o.a(745537874);
        t2o.a(745537605);
        t2o.a(745538144);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2(MyTaobaoFragment myTaobaoFragment) {
        super(myTaobaoFragment);
        ckf.h(myTaobaoFragment, "mtbFragment");
        j3j j3jVar = new j3j();
        this.g = j3jVar;
        Lifecycle lifecycle = myTaobaoFragment.getLifecycle();
        ckf.c(lifecycle, "mtbFragment.lifecycle");
        MtbWeexManager mtbWeexManager = new MtbWeexManager(lifecycle, this);
        this.h = mtbWeexManager;
        this.i = new MtbAdapter(j3jVar, mtbWeexManager);
    }

    public static final /* synthetic */ void D(MtbBizProxyV2 mtbBizProxyV2, List list, DiffUtil.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3a87f6", new Object[]{mtbBizProxyV2, list, callback});
        } else {
            mtbBizProxyV2.M(list, callback);
        }
    }

    public static final /* synthetic */ MtbAdapter E(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbAdapter) ipChange.ipc$dispatch("216a80ed", new Object[]{mtbBizProxyV2});
        }
        return mtbBizProxyV2.i;
    }

    public static final /* synthetic */ MtbPageExposureProcessor F(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbPageExposureProcessor) ipChange.ipc$dispatch("817149b0", new Object[]{mtbBizProxyV2});
        }
        return mtbBizProxyV2.p;
    }

    public static final /* synthetic */ MtbWeexManager G(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbWeexManager) ipChange.ipc$dispatch("6f2d5457", new Object[]{mtbBizProxyV2});
        }
        return mtbBizProxyV2.h;
    }

    public static final /* synthetic */ MtbPresenterV2 H(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbPresenterV2) ipChange.ipc$dispatch("10281103", new Object[]{mtbBizProxyV2});
        }
        return mtbBizProxyV2.n;
    }

    public static final /* synthetic */ qun I(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qun) ipChange.ipc$dispatch("43a31ea6", new Object[]{mtbBizProxyV2});
        }
        return mtbBizProxyV2.j;
    }

    public static final /* synthetic */ zot J(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zot) ipChange.ipc$dispatch("7712faea", new Object[]{mtbBizProxyV2});
        }
        return mtbBizProxyV2.k;
    }

    public static final /* synthetic */ void K(MtbBizProxyV2 mtbBizProxyV2, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e1fbb5", new Object[]{mtbBizProxyV2, new Integer(i), jSONObject});
        } else {
            mtbBizProxyV2.V(i, jSONObject);
        }
    }

    public static final /* synthetic */ void L(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92adf3da", new Object[]{mtbBizProxyV2});
        } else {
            mtbBizProxyV2.a0();
        }
    }

    public static /* synthetic */ Object ipc$super(MtbBizProxyV2 mtbBizProxyV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/MtbBizProxyV2");
    }

    @Override // tb.ew
    public void A(String str, boolean z) {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce385b6", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ckf.h(str, "behavior");
        MTPtrRecyclerView l = l();
        if (l != null && (layoutManager = l.getLayoutManager()) != null) {
            e eVar = new e(str, z, l, layoutManager);
            if (l.isAttachedToWindow()) {
                eVar.run();
            } else {
                l.post(eVar);
            }
        }
    }

    public final void M(List<h3j> list, DiffUtil.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bac157", new Object[]{this, list, callback});
            return;
        }
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(callback);
        this.i.setData(list);
        calculateDiff.dispatchUpdatesTo(new ListUpdateCallback() { // from class: com.taobao.mytaobao.pagev2.MtbBizProxyV2$diffUpdateList$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onChanged(int i, int i2, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bdc6818", new Object[]{this, new Integer(i), new Integer(i2), obj});
                    return;
                }
                TLog.loge("mtbMainLink", "onChanged, pos=" + i + " count=" + i2 + " payload=" + obj);
                MtbBizProxyV2.E(MtbBizProxyV2.this).notifyItemRangeChanged(i, i2, obj);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onInserted(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("706b59fe", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                TLog.loge("mtbMainLink", "onInserted, position=" + i + " count=" + i2);
                MtbBizProxyV2.E(MtbBizProxyV2.this).notifyItemRangeInserted(i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onMoved(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bbec943b", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                TLog.loge("mtbMainLink", "onMoved, fromPosition=" + i + " toPosition=" + i2);
                MtbBizProxyV2.E(MtbBizProxyV2.this).notifyItemMoved(i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onRemoved(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("11dc13e8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                TLog.loge("mtbMainLink", "onRemoved, position=" + i + " count=" + i2);
                MtbBizProxyV2.E(MtbBizProxyV2.this).notifyItemRangeRemoved(i, i2);
            }
        });
    }

    public uib O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uib) ipChange.ipc$dispatch("93904eb2", new Object[]{this});
        }
        return this.h;
    }

    public final j3j P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j3j) ipChange.ipc$dispatch("a8797126", new Object[]{this});
        }
        return this.g;
    }

    public final long Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("419475ff", new Object[]{this})).longValue();
        }
        return this.o;
    }

    public final TitleBarHelperV2 R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TitleBarHelperV2) ipChange.ipc$dispatch("1ed2e821", new Object[]{this});
        }
        return this.l;
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c13271e", new Object[]{this});
            return;
        }
        FragmentActivity activity = m().getActivity();
        if (!(activity instanceof TBMainActivity)) {
            activity = null;
        }
        TBMainActivity tBMainActivity = (TBMainActivity) activity;
        if (tBMainActivity != null) {
            tBMainActivity.registerOnKeyDownListener(new d());
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d654163", new Object[]{this});
            return;
        }
        FragmentActivity requireActivity = m().requireActivity();
        ckf.c(requireActivity, "mtbFragment.requireActivity()");
        x3j x3jVar = new x3j(requireActivity, this.k, this.h, this);
        this.m = x3jVar;
        x3jVar.a();
        this.h.C(this);
        qsh qshVar = this.q;
        if (qshVar != null) {
            qshVar.e(this);
        }
        igj.b(new ijf(this));
        W();
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8b7008", new Object[]{this});
            return;
        }
        MtbDataServiceFacade.n(new MtbBizProxyV2$subscribeDataService$1(this));
        MtbDataServiceFacade.o(new MtbBizProxyV2$subscribeDataService$2(this));
        MtbDataServiceFacade.r(new MtbBizProxyV2$subscribeDataService$3(this));
        MtbDataServiceFacade.s(new f());
        MtbDataServiceFacade.p(new MtbBizProxyV2$subscribeDataService$4(this));
        MtbDataServiceFacade.q(new MtbBizProxyV2$subscribeDataService$5(this));
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5067cc4a", new Object[]{this});
            return;
        }
        x3j x3jVar = this.m;
        if (x3jVar != null) {
            x3jVar.b();
        }
        FragmentActivity activity = m().getActivity();
        if (!(activity instanceof TBMainActivity)) {
            activity = null;
        }
        TBMainActivity tBMainActivity = (TBMainActivity) activity;
        if (tBMainActivity != null) {
            tBMainActivity.registerOnKeyDownListener(null);
        }
    }

    @Override // tb.hqb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803d8ea1", new Object[]{this});
        } else {
            this.n.g();
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba0d5bb", new Object[]{this});
        } else {
            this.l.j(MtbDataServiceFacade.l(), MtbDataServiceFacade.f(), MtbDataServiceFacade.g(), MtbDataServiceFacade.j(), MtbDataServiceFacade.k());
        }
    }

    @Override // tb.uoc
    public DXWidgetNode b(String str) {
        MTPtrRecyclerView l;
        RecyclerView.LayoutManager layoutManager;
        View view;
        DXWidgetNode flattenWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c707e44c", new Object[]{this, str});
        }
        if (!(TextUtils.isEmpty(str) || (l = l()) == null || (layoutManager = l.getLayoutManager()) == null)) {
            int itemCount = layoutManager.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                View findViewByPosition = layoutManager.findViewByPosition(i);
                if (!(findViewByPosition instanceof ViewGroup)) {
                    findViewByPosition = null;
                }
                ViewGroup viewGroup = (ViewGroup) findViewByPosition;
                if (viewGroup != null) {
                    view = viewGroup.getChildAt(0);
                } else {
                    view = null;
                }
                if (!(view instanceof DXRootView)) {
                    view = null;
                }
                DXRootView dXRootView = (DXRootView) view;
                if (!(dXRootView == null || (flattenWidgetNode = dXRootView.getFlattenWidgetNode()) == null || (queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str)) == null)) {
                    return queryWidgetNodeByUserId;
                }
            }
        }
        return null;
    }

    @Override // tb.hqb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db88d65a", new Object[]{this});
        } else {
            this.n.h();
        }
    }

    @Override // tb.uoc
    public JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c49e2c0", new Object[]{this, str});
        }
        ckf.h(str, pl4.KEY_NODE_ID);
        return this.h.r(str);
    }

    @Override // tb.uoc
    public void e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758866ee", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.h(str, "eventName");
        this.h.B(str, jSONObject);
    }

    @Override // tb.uoc
    public Pair<Rect, Boolean> f() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5e426f69", new Object[]{this});
        }
        MTBBasementContainerView t = this.h.t();
        if (t == null) {
            return null;
        }
        Rect rect = new Rect();
        if (t.getGlobalVisibleRect(rect) && t.isShown()) {
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
        return this.f;
    }

    @Override // tb.ew
    public void o(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
        } else {
            this.n.m(m().getActivity(), loginAction);
        }
    }

    @Override // tb.ew
    public void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        ckf.h(context, "ctx");
        this.n.q();
    }

    @Override // tb.ew
    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.h(layoutInflater, "inflater");
        this.g.d().n();
        uv6.d("mtbOnCreateView");
        uv6.m();
        if (this.f == null) {
            q3j.INSTANCE.l();
            B(viewGroup);
            uv6.d(sc.initView);
            Context context = layoutInflater.getContext();
            ckf.c(context, "inflater.context");
            U(context);
            uv6.g(sc.initView);
            uv6.d("initData");
            T();
            uv6.g("initData");
        }
        uv6.g("mtbOnCreateView");
        sc.c("myTaobaoOnCreate");
        this.g.d().d();
        return this.f;
    }

    @Override // tb.ew
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.r.i();
        Z();
        this.n.s();
        MtbGlobalEnv.i = null;
        this.l.c();
        this.h.v();
        qsh qshVar = this.q;
        if (qshVar != null) {
            qshVar.c();
        }
        sb7.b(Login.getUserId()).g();
    }

    @Override // tb.ew
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            this.h.w();
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
        BehaviR.getInstance().commitLeave(u3j.b, null, i(), "");
        t32.b().f(O());
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
        } else {
            MtbDataServiceFacade.x();
        }
    }

    @Override // tb.ew
    public void y(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ee6d49", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        ckf.h(activity, "aty");
        this.g.d().r();
        this.n.t(this, activity, z);
        this.g.d().f();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class f implements tz9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.tz9
        public void a(iln ilnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48546e02", new Object[]{this, ilnVar});
                return;
            }
            ckf.h(ilnVar, "reason");
            TLog.loge("mtbMainLink", "listenerFullDataChange reason=" + ilnVar.b());
            if (ckf.b(ilnVar.a().get("refreshBasement"), Boolean.TRUE)) {
                MtbWeexManager G = MtbBizProxyV2.G(MtbBizProxyV2.this);
                String str = r32.b;
                ckf.c(str, "BasementEventSender.EVENT_NOTIFY_MYTAOBAO_REFRESH");
                G.B(str, null);
            }
            MtbBizProxyV2.L(MtbBizProxyV2.this);
            MtbPageExposureProcessor.m(MtbBizProxyV2.F(MtbBizProxyV2.this), false, 1, null);
            if (ilnVar.b() == 3) {
                q46.b();
                uv6.j("fullDataChange");
                MTPtrRecyclerView l = MtbBizProxyV2.this.l();
                if (l != null && l.hasPendingAdapterUpdates()) {
                    MTPtrRecyclerView l2 = MtbBizProxyV2.this.l();
                    if ((l2 != null && l2.getChildCount() == 0) || ih4.c("mtbConsumePendingUpdateV3", false)) {
                        MtbBizProxyV2.E(MtbBizProxyV2.this).notifyDataSetChanged();
                        TLog.loge("mtbMainLink", "mPendingUpdates任务堆积，补偿消费notifyDataSetChanged");
                    }
                } else if (ih4.c("mtbConsumePendingUpdateV4", false)) {
                    MtbBizProxyV2.E(MtbBizProxyV2.this).notifyDataSetChanged();
                }
                q3j.INSTANCE.v(ilnVar);
                MtbBizProxyV2.H(MtbBizProxyV2.this).u();
            }
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463eb469", new Object[]{this});
            return;
        }
        for (h3j h3jVar : this.i.getDataList()) {
            if (ckf.b(h3jVar.a(), "dinamicx")) {
                h3jVar.l(true);
            }
        }
        TLog.loge("mtbMainLink", "adapter forceRefreshDxList notifyDataSetChanged");
        this.i.notifyDataSetChanged();
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6533df98", new Object[]{this});
            return;
        }
        List<h3j> dataList = this.i.getDataList();
        h3j h3jVar = (h3j) i04.d0(dataList, 0);
        if (h3jVar != null) {
            h3jVar.l(true);
        }
        h3j h3jVar2 = (h3j) i04.d0(dataList, 1);
        if (h3jVar2 != null) {
            h3jVar2.l(true);
        }
        TLog.loge("mtbMainLink", "adapter handleThemeChange notifyDataSetChanged");
        this.i.notifyDataSetChanged();
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        uv6.j("开始监听");
        MtbPageExposureProcessor mtbPageExposureProcessor = this.p;
        MTPtrRecyclerView l = l();
        if (l != null) {
            mtbPageExposureProcessor.j(l, this.i);
            s3j i = MtbDataServiceFacade.i();
            List<h3j> b2 = i != null ? i.b() : null;
            JSONObject c2 = i != null ? i.c() : null;
            if (c2 != null) {
                V(i.d(), c2);
            }
            if (b2 != null) {
                this.i.setData(b2);
                q3j.INSTANCE.m();
                this.i.notifyDataSetChanged();
                TLog.loge("mtbMainLink", "adapter initData notifyDataSetChanged");
                if (i.d() == 3) {
                    MtbPageExposureProcessor.m(this.p, false, 1, null);
                }
            }
            a0();
            uv6.d("subscribeDataService");
            Y();
            uv6.g("subscribeDataService");
            this.g.b().h(new MtbBizProxyV2$initData$1(this));
            this.q = new qsh();
            X();
            this.n.y();
            return;
        }
        ckf.s();
        throw null;
    }

    public final void U(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        UserHeaderBgLayout userHeaderBgLayout = new UserHeaderBgLayout(context);
        frameLayout.addView(userHeaderBgLayout, -1, -1);
        qun qunVar = new qun(context);
        qunVar.a().setOnPullRefreshListener(new a(qunVar));
        this.j = qunVar;
        frameLayout.addView(qunVar.a(), -1, -1);
        MTPtrRecyclerView mTPtrRecyclerView = new MTPtrRecyclerView(context);
        if (MtbGlobalEnv.l()) {
            mTPtrRecyclerView.setHasFixedSize(true);
        }
        C(mTPtrRecyclerView);
        mTPtrRecyclerView.v2 = true;
        mTPtrRecyclerView.setLayoutManager(new MTBLayoutManagerV2(context, 1, false));
        mTPtrRecyclerView.setAdapter(this.i);
        qunVar.a().addView(mTPtrRecyclerView, -1, -1);
        mTPtrRecyclerView.onScrollEnableChangeListener = new b(qunVar);
        this.l.f(context, mTPtrRecyclerView);
        this.l.h(new c(mTPtrRecyclerView));
        this.l.i(new MtbBizProxyV2$initView$4(qunVar));
        FrameLayout e2 = this.l.e();
        if (e2 != null) {
            frameLayout.addView(e2);
            this.h.m(mTPtrRecyclerView);
            if (Versions.isDebug()) {
                TextView textView = new TextView(context);
                textView.setText("新");
                textView.setGravity(17);
                textView.setTextColor(-65536);
                frameLayout.addView(textView, -1, 250);
            }
            this.f = frameLayout;
            this.k.d(userHeaderBgLayout, mTPtrRecyclerView);
            this.r.l(this);
            return;
        }
        ckf.s();
        throw null;
    }

    @Override // tb.ew
    public void q(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.g.d().a();
        this.n.r();
        Activity i = i();
        if (!this.n.l() && i != null) {
            this.n.t(this, i, false);
        }
        sc.b("myTaobaoOnCreate");
        sc.b(sc.outerFragmentOnCreate);
        m().setUTPageName(u3j.b);
        s32.c().d(bundle);
        this.o = System.currentTimeMillis();
        MtbPresenterV2 mtbPresenterV2 = this.n;
        if (bundle == null) {
            z = false;
        }
        mtbPresenterV2.z(z);
        sc.c(sc.outerFragmentOnCreate);
        q3j.INSTANCE.k();
        this.g.d().b();
    }

    @Override // tb.ew
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.g.d().i();
        if (this.n.o()) {
            sc.b(sc.outerFragmentOnResume);
        }
        if (this.h.a()) {
            s3j i = MtbDataServiceFacade.i();
            suv.a I = BasementFeedDataProvider.INSTANCE.I(i != null ? i.a() : null);
            m().setUTPageName(I.f28289a);
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.c(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().updatePageName(i(), I.f28289a);
            suv.j(BasementViewController.class.getName(), i(), I.f28289a, I.b, kotlin.collections.a.k(jpu.a("isWeex", "true")));
        } else {
            m().setUTPageName(u3j.b);
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.c(instance2, "UTAnalytics.getInstance()");
            instance2.getDefaultTracker().updatePageName(i(), u3j.b);
            suv.k(MyTaobaoFragment.class.getName(), i(), kotlin.collections.a.k(jpu.a("isWeex", "true")));
        }
        this.n.B(i());
        BehaviR.getInstance().commitEnter(u3j.b, null, i(), "");
        t32.b().e(O());
        osh.b();
        ggj.b();
        if (!this.n.o()) {
            MtbDataServiceFacade.w();
        }
        this.h.x();
        if (this.n.o()) {
            sc.c(sc.outerFragmentOnResume);
        }
        this.n.A(false);
        this.g.d().m();
    }

    public final void V(int i, JSONObject jSONObject) {
        TBSwipeRefreshLayout a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e529d6d6", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        this.n.w(i, jSONObject);
        this.i.Q(jSONObject);
        boolean z = i == 1 || i == 2;
        this.k.b(true, jSONObject.getJSONObject("customSkin"));
        this.k.a(z, jSONObject.getJSONObject("skinConfig"));
        qun qunVar = this.j;
        if (qunVar != null && (a2 = qunVar.a()) != null) {
            a2.setRefreshing(false);
        }
    }
}
