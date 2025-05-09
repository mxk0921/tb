package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabPagerAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.TabBundleInfo$NativeDXTabBundle;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.header.RecyclerViewAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.NonPreheatTabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqs;
import tb.cia;
import tb.csb;
import tb.dia;
import tb.fkx;
import tb.ge0;
import tb.hha;
import tb.i3u;
import tb.ikr;
import tb.iv1;
import tb.iw0;
import tb.kbc;
import tb.lac;
import tb.m3a;
import tb.mt6;
import tb.mug;
import tb.nw0;
import tb.o3s;
import tb.p2e;
import tb.p3a;
import tb.pfa;
import tb.q4g;
import tb.t2o;
import tb.u3u;
import tb.vvs;
import tb.wda;
import tb.x4h;
import tb.xea;
import tb.yga;
import tb.zha;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodsView extends iv1<GoodsViewPresenter> implements kbc, p2e {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public i3u e;
    public RecyclerView g;
    public FrameLayout h;
    public NoScrollViewPager i;
    public m3a j;
    public List<aqs> k;
    public GoodsMultiTabPagerAdapter l;
    public p3a m;
    public lac n;
    public final Handler q;
    public int r;
    public JSONObject s;
    public boolean f = false;
    public boolean o = false;
    public long p = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            GoodsView.this.d.setVisibility(4);
            if (GoodsView.this.f22944a.M()) {
                GoodsView goodsView = GoodsView.this;
                goodsView.c = (ViewGroup) goodsView.d.getParent();
                GoodsView goodsView2 = GoodsView.this;
                ViewGroup viewGroup = goodsView2.c;
                if (viewGroup != null) {
                    viewGroup.removeView(goodsView2.d);
                }
            }
            hha.c("GoodsView", "hide | onAnimationEnd, state=" + GoodsView.this.d.getVisibility());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                return;
            }
            hha.c("GoodsView", "hide | onAnimationStart | state=" + GoodsView.this.d.getVisibility());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8501a;

        public b(String str) {
            this.f8501a = str;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXWidgetNode f8502a;

            public a(DXWidgetNode dXWidgetNode) {
                this.f8502a = dXWidgetNode;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                JSONArray jSONArray;
                int i = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ((GoodsViewPresenter) GoodsView.this.b).f0(false);
                JSONObject i2 = this.f8502a.getDXRuntimeContext().i();
                if (i2 != null && i2.containsKey("fields") && (jSONObject = i2.getJSONObject("fields")) != null && jSONObject.containsKey("topRightEntranceList") && (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) != null) {
                    while (true) {
                        if (i >= jSONArray.size()) {
                            break;
                        }
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (TextUtils.equals(u3u.ENTRY_TYPE_LIVE_CART, jSONObject2.getString("type"))) {
                            String string = jSONObject2.getString("realCount");
                            if (!TextUtils.isEmpty(string)) {
                                jSONObject2.put("count", (Object) string);
                            }
                            jSONObject2.put("animatedIcon", (Object) Boolean.TRUE);
                            hha.c("GoodsView", "onAddCart | refresh, realCountS=" + string);
                        } else {
                            i++;
                        }
                    }
                    ikr.f().i(this.f8502a.queryRootWidgetNode());
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            DXWidgetNode dXWidgetNode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!GoodsView.this.B()) {
                hha.b("GoodsView", "onAddCart | list not show.");
                ((GoodsViewPresenter) GoodsView.this.b).f0(false);
            } else if (GoodsView.this.C()) {
                hha.b("GoodsView", "onAddCart | search is show.");
                ((GoodsViewPresenter) GoodsView.this.b).f0(false);
            } else {
                if (wda.e()) {
                    dXWidgetNode = ge0.d(GoodsView.this.d.findViewById(R.id.taolive_good_view_header_lv), "goods_top_liveCart");
                } else {
                    dXWidgetNode = ge0.b(GoodsView.this.g, "goods_top_liveCart");
                }
                GoodsView goodsView = GoodsView.this;
                ge0.a(goodsView.f22944a, this.f8501a, goodsView.c, GoodsView.n(goodsView), dXWidgetNode == null ? null : dXWidgetNode.getDXRuntimeContext().D(), ge0.e(this.f8501a, GoodsView.o(GoodsView.this), GoodsView.this.f22944a));
                if (dXWidgetNode != null) {
                    GoodsView goodsView2 = GoodsView.this;
                    if (goodsView2.f22944a.l.l) {
                        GoodsView.p(goodsView2).postDelayed(new a(dXWidgetNode), 500L);
                        return;
                    }
                }
                ((GoodsViewPresenter) GoodsView.this.b).f0(false);
            }
        }
    }

    static {
        t2o.a(295699017);
        t2o.a(295699032);
        t2o.a(295699054);
    }

    public GoodsView(xea xeaVar, ViewGroup viewGroup) {
        super(xeaVar, viewGroup);
        if (!(xeaVar == null || xeaVar.j() == null)) {
            xeaVar.j().v(this);
        }
        yga.F();
        this.q = new Handler();
    }

    public static /* synthetic */ Object ipc$super(GoodsView goodsView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodviewnew/GoodsView");
    }

    public static /* synthetic */ long j(GoodsView goodsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("560c516", new Object[]{goodsView})).longValue();
        }
        return goodsView.p;
    }

    public static /* synthetic */ long k(GoodsView goodsView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41b2a14", new Object[]{goodsView, new Long(j)})).longValue();
        }
        goodsView.p = j;
        return j;
    }

    public static /* synthetic */ boolean l(GoodsView goodsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acdc9ee7", new Object[]{goodsView})).booleanValue();
        }
        return goodsView.o;
    }

    public static /* synthetic */ void m(GoodsView goodsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545878a4", new Object[]{goodsView});
        } else {
            goodsView.G();
        }
    }

    public static /* synthetic */ NoScrollViewPager n(GoodsView goodsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NoScrollViewPager) ipChange.ipc$dispatch("95d343e7", new Object[]{goodsView});
        }
        return goodsView.i;
    }

    public static /* synthetic */ p3a o(GoodsView goodsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p3a) ipChange.ipc$dispatch("f1efb741", new Object[]{goodsView});
        }
        return goodsView.m;
    }

    public static /* synthetic */ Handler p(GoodsView goodsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7abff97f", new Object[]{goodsView});
        }
        return goodsView.q;
    }

    /* renamed from: A */
    public GoodsViewPresenter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodsViewPresenter) ipChange.ipc$dispatch("6cb51798", new Object[]{this});
        }
        return new GoodsViewPresenter(this.f22944a);
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6188b632", new Object[]{this})).booleanValue();
        }
        if (!D() || !this.f) {
            return false;
        }
        return true;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12efc29a", new Object[]{this})).booleanValue();
        }
        if (this.h.getVisibility() != 0 || this.h.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (this.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0a589c", new Object[]{this});
            return;
        }
        UltronInstanceViewModel u = pfa.u((ViewModelStoreOwner) this.f22944a.i());
        String str = u.b;
        if (TextUtils.isEmpty(str)) {
            hha.b("VMUltronInstance", "奥创配置配置没有拉取成功！");
            return;
        }
        hha.c("VMUltronInstance", "奥创配置数据源：" + u.c.name());
        com.alibaba.android.ultron.vfw.instance.a D = this.f22944a.D();
        D.D().q(fkx.d(str));
        D.T(new mt6());
        this.r = pfa.k(new JSONObject(), this.f22944a, "TaoLiveGoodsTitleContainer", -1);
    }

    public void H(LiveItemCategoriesResponseData liveItemCategoriesResponseData, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3723dd5b", new Object[]{this, liveItemCategoriesResponseData, str, list});
            return;
        }
        this.m.l(this.i, this.l, liveItemCategoriesResponseData.extraGoodsTabList);
        TabBundleInfo$NativeDXTabBundle g = this.m.g();
        if (g != null) {
            if (g.stateMultiTabView == null) {
                hha.b("GoodsView", "refreshCategory | stateMultiTabView is empty.");
                return;
            }
            List<ItemCategory> list2 = liveItemCategoriesResponseData.itemCategoryList;
            if (list2 == null || list2.size() <= 0) {
                g.stateMultiTabView.clearCategoriesNav();
            } else {
                g.stateMultiTabView.refreshCategoriesNav(liveItemCategoriesResponseData.itemCategoryList, str, list);
            }
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        ((GoodsViewPresenter) this.b).e0();
        hha.b("GoodsView", "resume | resume.");
    }

    public void J(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c11a635", new Object[]{this, hashMap});
            return;
        }
        p3a p3aVar = new p3a(this.f22944a, this.k);
        this.m = p3aVar;
        ((GoodsViewPresenter) this.b).g0(p3aVar);
        y(hashMap);
    }

    public void K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef640d17", new Object[]{this, jSONObject});
            return;
        }
        this.s = jSONObject;
        ((GoodsViewPresenter) this.b).j = jSONObject;
    }

    public void L(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fc8cf4", new Object[]{this, str, new Long(j), str2});
            return;
        }
        hha.b("GoodsView", "showPackage | defaultCategoryId=" + str + "  topItemId=" + j + " openFrom=" + str2);
        this.f22944a.m.c(str, j, str2);
        if (wda.e()) {
            G();
            return;
        }
        final UltronInstanceViewModel u = pfa.u((ViewModelStoreOwner) c());
        final LiveData<Boolean> liveData = u.f;
        final long currentTimeMillis = System.currentTimeMillis();
        liveData.observe((LifecycleOwner) this.f22944a.i(), new Observer<Boolean>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7286f3f1", new Object[]{this, bool});
                } else if (bool != null && bool.booleanValue()) {
                    u.h();
                    GoodsView.k(GoodsView.this, System.currentTimeMillis() - currentTimeMillis);
                    if (!GoodsView.l(GoodsView.this)) {
                        hha.b("GoodsView", "onChanged | consumeTime=" + GoodsView.j(GoodsView.this));
                    }
                    GoodsView.m(GoodsView.this);
                    liveData.removeObserver(this);
                }
            }
        });
    }

    public void M(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee872ab9", new Object[]{this, jSONObject});
        } else if (!B()) {
            K(jSONObject);
        } else {
            r(jSONObject);
        }
    }

    public void O() {
        List<aqs> h;
        GoodsLiveStateMutitabView goodsLiveStateMutitabView;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e5d148", new Object[]{this});
            return;
        }
        p3a p3aVar = this.m;
        if (!(p3aVar == null || (h = p3aVar.h()) == null)) {
            while (true) {
                if (i >= h.size()) {
                    goodsLiveStateMutitabView = null;
                    break;
                }
                aqs aqsVar = h.get(i);
                if (aqsVar instanceof TabBundleInfo$NativeDXTabBundle) {
                    goodsLiveStateMutitabView = ((TabBundleInfo$NativeDXTabBundle) aqsVar).stateMultiTabView;
                    break;
                }
                i++;
            }
            if (goodsLiveStateMutitabView != null) {
                for (SingleTabBaseView singleTabBaseView : goodsLiveStateMutitabView.getLiveStateViewList()) {
                    if (singleTabBaseView instanceof NonPreheatTabView) {
                        for (x4h x4hVar : singleTabBaseView.getAdapter().N()) {
                            x4hVar.c = 1L;
                        }
                    }
                }
            }
        }
    }

    @Override // tb.p2e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c0f1b6", new Object[]{this});
            return;
        }
        xea xeaVar = this.f22944a;
        if (xeaVar != null && xeaVar.l.m) {
            O();
        }
    }

    @Override // tb.iv1
    public View i(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(c()).inflate(R.layout.taolive_good_view_flexalocal, (ViewGroup) null);
        this.d = viewGroup2;
        this.g = (RecyclerView) viewGroup2.findViewById(R.id.taolive_good_view_header);
        this.i = (NoScrollViewPager) this.d.findViewById(R.id.taolive_goods_view_viewpager);
        this.k = new ArrayList();
        GoodsMultiTabPagerAdapter goodsMultiTabPagerAdapter = new GoodsMultiTabPagerAdapter(this.k);
        this.l = goodsMultiTabPagerAdapter;
        this.i.setAdapter(goodsMultiTabPagerAdapter);
        this.i.setScrollable(false);
        this.h = (FrameLayout) this.d.findViewById(R.id.taolive_goods_view_search_container);
        i3u i3uVar = new i3u(this.f22944a, this.h, (ViewGroup) this.d.findViewById(R.id.taolive_goods_view_entry_pop_container));
        this.e = i3uVar;
        i3uVar.q(this.i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        viewGroup.addView(this.d, layoutParams);
        q(0);
        this.d.requestLayout();
        return this.d;
    }

    public void q(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e4d3d5", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        if (layoutParams != null) {
            if (this.f22944a.O()) {
                i2 = nw0.f(this.f22944a.i()) - iw0.a(c(), 48.0f);
            } else {
                i2 = (int) (nw0.f(this.f22944a.i()) * 0.725f);
            }
            layoutParams.width = this.f22944a.l.k;
            layoutParams.gravity = 85;
            int i3 = this.r;
            if (i3 <= 0) {
                i3 = 47;
            }
            hha.b("GoodsView", "adapterWidthAndHeight | dm=" + i2 + "  headHeight=" + i3 + "   compressHeight" + i);
            this.i.getLayoutParams().height = (i2 - nw0.c(ikr.f().e(), this.f22944a.i(), (float) i3)) - i;
            this.h.getLayoutParams().height = i2 - i;
        }
    }

    public final void r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f074c7", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("itemsList");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("userBuyList", (Object) jSONArray);
        ((GoodsViewPresenter) this.b).h0(jSONObject2);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        hha.b("GoodsView", "destroy | mIsShow=" + this.f);
        if (!(this.d == null || this.c == null || !yga.c())) {
            this.c.removeView(this.d);
            hha.b("GoodsView", "destroy | remove contentView.");
        }
        this.f = false;
        this.q.removeCallbacksAndMessages(-1);
        lac lacVar = this.n;
        if (lacVar != null) {
            lacVar.destroy();
            this.n = null;
        }
        i3u i3uVar = this.e;
        if (i3uVar != null) {
            i3uVar.destroy();
        }
        p3a p3aVar = this.m;
        if (p3aVar != null) {
            p3aVar.b();
            this.l.notifyDataSetChanged();
        }
        xea xeaVar = this.f22944a;
        if (!(xeaVar == null || xeaVar.j() == null)) {
            this.f22944a.j().X(this);
        }
        ((GoodsViewPresenter) this.b).S();
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e38d1a", new Object[]{this})).intValue();
        }
        return this.m.f();
    }

    public GoodsViewPresenter u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodsViewPresenter) ipChange.ipc$dispatch("5fa6c126", new Object[]{this});
        }
        return (GoodsViewPresenter) this.b;
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a653b0", new Object[]{this, new Boolean(z)});
            return;
        }
        T t = this.b;
        if (t == 0) {
            return;
        }
        if (z) {
            ((GoodsViewPresenter) t).h0(this.s);
            GoodsViewPresenter goodsViewPresenter = (GoodsViewPresenter) this.b;
            if (goodsViewPresenter.g) {
                goodsViewPresenter.b0(this.s);
                return;
            }
            return;
        }
        ((GoodsViewPresenter) t).W();
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.f = false;
        this.f22944a.m.a();
        if (this.d != null) {
            Animation g = g();
            g.setAnimationListener(new a());
            this.d.startAnimation(g);
        }
        this.e.i();
        q4g.a(this.c, null);
    }

    public final void x(List<aqs> list) {
        GoodsLiveStateMutitabView goodsLiveStateMutitabView;
        xea xeaVar = this.f22944a;
        if ((iw0.j(xeaVar.i()) || pfa.N(".gl_debug")) && list != null && !list.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    goodsLiveStateMutitabView = null;
                    break;
                }
                aqs aqsVar = list.get(i);
                if (aqsVar instanceof TabBundleInfo$NativeDXTabBundle) {
                    goodsLiveStateMutitabView = ((TabBundleInfo$NativeDXTabBundle) aqsVar).stateMultiTabView;
                    break;
                }
                i++;
            }
            lac lacVar = this.n;
            if (lacVar == null) {
                try {
                    Class<?> cls = Class.forName("com.taobao.android.live.debug.DebugTools");
                    Method method = cls.getMethod("createGoodDebugView", new Class[0]);
                    o3s.a("GoodsView", "initDebugView | class=" + cls + "  method=" + method);
                    lac lacVar2 = (lac) method.invoke(null, new Object[0]);
                    this.n = lacVar2;
                    lacVar2.b(xeaVar, (ViewStub) this.d.findViewById(R.id.taolive_goods_view_debug), goodsLiveStateMutitabView);
                } catch (Exception e) {
                    hha.b("GoodsView", "initDebugView | e=" + e);
                }
            } else {
                lacVar.a();
            }
        }
    }

    public final void y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e4edd3", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.m.j(map);
            this.l.notifyDataSetChanged();
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb4d6389", new Object[]{this});
        } else if (!this.o) {
            if (wda.e()) {
                this.d.findViewById(R.id.taolive_good_view_header).setVisibility(8);
                ViewGroup viewGroup = this.d;
                int i = R.id.taolive_good_view_header_lv;
                viewGroup.findViewById(i).setVisibility(0);
                this.j = new m3a(this.f22944a, this, (ViewGroup) this.d.findViewById(i));
                return;
            }
            this.d.findViewById(R.id.taolive_good_view_header).setVisibility(0);
            this.d.findViewById(R.id.taolive_good_view_header_lv).setVisibility(8);
            F();
            List<IDMComponent> h = this.f22944a.D().z().h();
            xea xeaVar = this.f22944a;
            if (h == null) {
                h = new ArrayList<>();
            }
            final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(xeaVar, h, this, this.g);
            this.g.setAdapter(recyclerViewAdapter);
            this.g.setLayoutManager(new LinearLayoutManager(this.f22944a.i()));
            this.g.setOverScrollMode(2);
            this.g.setItemAnimator(null);
            if (this.f22944a.I() != null) {
                this.f22944a.I().j().s((RecyclerViewAdapter) this.g.getAdapter());
            }
            hha.b("GoodsView", "initHeaderView | size=" + recyclerViewAdapter.getData().size());
            final List<IDMComponent> data = recyclerViewAdapter.getData();
            this.g.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r3, String str, Object... objArr) {
                    if (str.hashCode() == -2066002230) {
                        super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodviewnew/GoodsView$6");
                }

                public final boolean a(IDMComponent iDMComponent, View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("430dd0ea", new Object[]{this, iDMComponent, view})).booleanValue();
                    }
                    if ((view instanceof FrameLayout) && wda.D()) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() > 0 && !(frameLayout.getChildAt(0) instanceof DXRootView)) {
                            hha.b("GoodsView", "idmComponentRender | component=" + iDMComponent.getKey());
                            return false;
                        }
                    }
                    for (IDMComponent iDMComponent2 : recyclerViewAdapter.O(iDMComponent)) {
                        if (csb.a(iDMComponent2)) {
                            hha.c("GoodsView", "idmComponentRender | name=" + iDMComponent2.getKey());
                            return true;
                        }
                    }
                    return false;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
                        return;
                    }
                    super.getItemOffsets(rect, view, recyclerView, state);
                    int childPosition = recyclerView.getChildPosition(view);
                    if (childPosition >= data.size()) {
                        zha.m(GoodsView.this.f22944a, "getItemOffsets", null);
                        hha.b("GoodsView", "getItemOffsets | pos=" + childPosition + "  components.size=" + data.size());
                        return;
                    }
                    IDMComponent iDMComponent = (IDMComponent) data.get(childPosition);
                    JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields");
                    if (jSONObject != null && jSONObject.containsKey("overlap") && a(iDMComponent, view)) {
                        rect.bottom = -nw0.d(GoodsView.this.f22944a.i(), zqq.g(jSONObject.getString("overlap"), 0));
                    }
                }
            });
            this.o = true;
        }
    }

    public void N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc25d256", new Object[]{this, new Integer(i)});
            return;
        }
        hha.c("GoodsView", "switchToTargetTabByIndex | index=" + i);
        if (i >= 0 && i < this.l.getCount()) {
            int f = this.m.f();
            hha.c("GoodsView", "switchToTargetTabByIndex | oldIndex=" + f + "   index=" + i);
            this.m.m(i);
            this.i.setCurrentItem(i, true);
            if (f != i) {
                ((GoodsViewPresenter) this.b).d0();
            }
        }
    }

    @Override // tb.p2e
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8def3d93", new Object[]{this, str});
        } else if (!vvs.b("goodlist", "enableCartAnim", true)) {
            hha.b("GoodsView", "addCartAnim | orange is false.");
        } else {
            hha.b("GoodsView", "onAddCart.");
            ((GoodsViewPresenter) this.b).f0(true);
            this.q.postDelayed(new b(str), 500L);
        }
    }

    public boolean E() {
        LiveItemCategoriesResponseData liveItemCategoriesResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9b3421", new Object[]{this})).booleanValue();
        }
        xea xeaVar = this.f22944a;
        if (xeaVar == null || (liveItemCategoriesResponseData = xeaVar.k) == null) {
            hha.b("GoodsView", "openLiveCart | categoryData is empty.");
            return false;
        }
        List<JSONObject> list = liveItemCategoriesResponseData.topRightEntranceList;
        if (list == null || list.isEmpty()) {
            hha.b("GoodsView", "openLiveCart | entryList is empty.");
            return false;
        }
        for (JSONObject jSONObject : list) {
            if (TextUtils.equals(u3u.ENTRY_TYPE_LIVE_CART, jSONObject.getString("type"))) {
                this.e.l(jSONObject);
                return true;
            }
        }
        return false;
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379ed8c2", new Object[]{this});
            return;
        }
        hha.b("GoodsView", "realShow | defaultCategoryId=");
        this.f = true;
        if (this.c != null && this.d != null) {
            int i = 0;
            while (true) {
                if (i >= this.c.getChildCount()) {
                    this.c.addView(this.d);
                    break;
                } else if (this.d == this.c.getChildAt(i)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.d;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
            Animation f = f();
            f.setAnimationListener(new cia(this));
            this.d.startAnimation(f);
        }
        z();
        x(this.m.h());
        aqs e = this.m.e();
        if (e == null) {
            HashMap hashMap = new HashMap();
            String str = "" + this.m.f();
            hashMap.put("curIndex", str);
            zha.m(this.f22944a, "tabBundle_empty", hashMap);
            hha.b("GoodsView", "realShow | tabBundle is null. index=" + str);
            return;
        }
        if (e instanceof TabBundleInfo$NativeDXTabBundle) {
            GoodsLiveStateMutitabView goodsLiveStateMutitabView = ((TabBundleInfo$NativeDXTabBundle) e).stateMultiTabView;
            if (vvs.b("goodlist", "glshowdelay2", true) && !wda.F()) {
                this.q.postDelayed(new dia(this, goodsLiveStateMutitabView), 75L);
            } else if (goodsLiveStateMutitabView != null) {
                this.f22944a.T.d();
                mug.c(this.p);
                hha.c("GoodsView", "realShow | showPackage.");
                goodsLiveStateMutitabView.showPackage();
            }
        } else {
            TextUtils.equals("h5", e.tabType);
        }
        ((GoodsViewPresenter) this.b).d0();
        JSONObject jSONObject = this.s;
        if (jSONObject != null) {
            r(jSONObject);
        }
    }
}
