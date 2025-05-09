package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.business.getconfig.DefaultRefreshConfig;
import com.taobao.homepage.business.getconfig.RefreshConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.searchbar.HomeSearchBarServiceImpl;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBSwipeRefreshLayout f29048a;
    public final wcc b;
    public final Activity c;
    public TBSwipeRefreshLayout.OnPullRefreshListener e;
    public TBSwipeRefreshLayout.RefreshAnimationListener f;
    public boolean g;
    public FrameLayout h;
    public int i;
    public TBRefreshHeader.RefreshState j = TBRefreshHeader.RefreshState.NONE;
    public final vna d = new vna();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements TBSwipeRefreshLayout.RefreshAnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
        public void onRefreshBefore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bc491a2", new Object[]{this});
            } else if (tzq.h(tzq.this) != null) {
                tzq.h(tzq.this).onRefreshBefore();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
        public void onRefreshCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6e8b1d", new Object[]{this});
            } else if (tzq.h(tzq.this) != null) {
                tzq.h(tzq.this).onRefreshCancel();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
        public void onRefreshEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e6df846", new Object[]{this});
            } else if (tzq.h(tzq.this) != null) {
                tzq.h(tzq.this).onRefreshEnd();
            }
        }
    }

    static {
        t2o.a(729810311);
    }

    public tzq(wcc wccVar, TBSwipeRefreshLayout tBSwipeRefreshLayout, Activity activity) {
        this.b = wccVar;
        this.f29048a = tBSwipeRefreshLayout;
        this.c = activity;
        o();
    }

    public static /* synthetic */ TBSwipeRefreshLayout.OnPullRefreshListener a(tzq tzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.OnPullRefreshListener) ipChange.ipc$dispatch("7dcd990", new Object[]{tzqVar});
        }
        return tzqVar.e;
    }

    public static /* synthetic */ TBSwipeRefreshLayout b(tzq tzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout) ipChange.ipc$dispatch("8ea845d6", new Object[]{tzqVar});
        }
        return tzqVar.f29048a;
    }

    public static /* synthetic */ TBRefreshHeader.RefreshState c(tzq tzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBRefreshHeader.RefreshState) ipChange.ipc$dispatch("dda2e4ae", new Object[]{tzqVar});
        }
        return tzqVar.j;
    }

    public static /* synthetic */ TBRefreshHeader.RefreshState d(tzq tzqVar, TBRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBRefreshHeader.RefreshState) ipChange.ipc$dispatch("10c15618", new Object[]{tzqVar, refreshState});
        }
        tzqVar.j = refreshState;
        return refreshState;
    }

    public static /* synthetic */ wcc e(tzq tzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcc) ipChange.ipc$dispatch("22512d8a", new Object[]{tzqVar});
        }
        return tzqVar.b;
    }

    public static /* synthetic */ void f(tzq tzqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5c5656", new Object[]{tzqVar, new Boolean(z)});
        } else {
            tzqVar.r(z);
        }
    }

    public static /* synthetic */ vna g(tzq tzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vna) ipChange.ipc$dispatch("a9b8b7d0", new Object[]{tzqVar});
        }
        return tzqVar.d;
    }

    public static /* synthetic */ TBSwipeRefreshLayout.RefreshAnimationListener h(tzq tzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.RefreshAnimationListener) ipChange.ipc$dispatch("638b2764", new Object[]{tzqVar});
        }
        return tzqVar.f;
    }

    public void A(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3eae21", new Object[]{this, new Float(f)});
            return;
        }
        TBRefreshHeader refresHeader = this.f29048a.getRefresHeader();
        if (refresHeader != null) {
            bqa.d("SwipeRefreshLayoutController", "setRefreshHeaderAlpha: " + f);
            refresHeader.setAlpha(f);
        }
    }

    public void D(JSONObject jSONObject, RefreshConfig refreshConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18e2d88", new Object[]{this, jSONObject, refreshConfig});
            return;
        }
        C(refreshConfig);
        FrameLayout p = p();
        this.d.a(this.c, p, jSONObject);
        this.f29048a.getRefresHeader().setSecondFloorView(p);
        this.f29048a.getRefresHeader().switchStyle(TBRefreshHeader.RefreshHeaderStyle.DARK);
        this.f29048a.setDistanceToSecondFloor(i7p.h(jSONObject) + 80);
        this.f29048a.setAnimateToBottomDuration(600);
        bqa.d("SwipeRefreshLayoutController", "服务端数据回来了");
    }

    public final TBSwipeRefreshLayout.OnPullRefreshListener i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.OnPullRefreshListener) ipChange.ipc$dispatch("2a4ec515", new Object[]{this});
        }
        return new a();
    }

    public final TBSwipeRefreshLayout.RefreshAnimationListener j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.RefreshAnimationListener) ipChange.ipc$dispatch("b81e2084", new Object[]{this});
        }
        return new b();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f29048a.setOnPullRefreshListener(null);
        this.f29048a.setRefreshAnimationListener(null);
        this.e = null;
        this.f = null;
        this.i = 0;
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6efe49", new Object[]{this})).floatValue();
        }
        return this.f29048a.getDistanceToSecondFloor();
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a928aa6", new Object[]{this})).intValue();
        }
        int dip2px = DensityUtil.dip2px(Globals.getApplication(), 77.0f) + HomeSearchBarServiceImpl.STATUS_HEIGHT_PX;
        wcc wccVar = this.b;
        if (wccVar == null) {
            return DensityUtil.px2dip(Globals.getApplication(), dip2px);
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) wccVar.a(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            return DensityUtil.px2dip(Globals.getApplication(), dip2px);
        }
        return DensityUtil.px2dip(Globals.getApplication(), iHomeSearchBarService.getCurrentSearchContainerHeightPX());
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fae1c812", new Object[]{this})).intValue();
        }
        return this.f29048a.getRefreshOffset();
    }

    public final FrameLayout p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("612c033d", new Object[]{this});
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(this.c);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout2.setVisibility(4);
        this.h = frameLayout2;
        return frameLayout2;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        boolean isRefreshing = this.f29048a.isRefreshing();
        bqa.d("SwipeRefreshLayoutController", "isRefreshing: " + isRefreshing);
        return isRefreshing;
    }

    public final void r(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aaf6f8a", new Object[]{this, new Boolean(z)});
        } else if (this.g != z) {
            this.g = z;
            TBRefreshHeader refresHeader = this.f29048a.getRefresHeader();
            if (z) {
                i = m();
            }
            float f = i;
            if (refresHeader.getTranslationY() != f) {
                refresHeader.setTranslationY(f);
            }
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37b2b6f", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.f29048a;
        if (tBSwipeRefreshLayout != null && tBSwipeRefreshLayout.getRefresHeader() != null) {
            TBRefreshHeader.RefreshState currentState = this.f29048a.getRefresHeader().getCurrentState();
            TBRefreshHeader.RefreshState refreshState = TBRefreshHeader.RefreshState.NONE;
            if (currentState != refreshState) {
                bqa.d("SwipeRefreshLayoutController", "resetSecondFloorState");
                this.f29048a.getRefresHeader().changeToState(refreshState);
                t();
            }
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3a2401", new Object[]{this});
        } else {
            C(new DefaultRefreshConfig());
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49396bc", new Object[]{this, new Boolean(z)});
            return;
        }
        bqa.d("SwipeRefreshLayoutController", "setEnablePullRefresh: " + z);
        this.f29048a.enablePullRefresh(z);
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ae6035", new Object[]{this, new Boolean(z)});
            return;
        }
        bqa.d("SwipeRefreshLayoutController", "setEnableToSecondFloor: " + z);
        this.f29048a.enableSecondFloor(z);
    }

    public void y(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f373e3", new Object[]{this, onPullRefreshListener});
        } else {
            this.e = onPullRefreshListener;
        }
    }

    public void z(TBSwipeRefreshLayout.RefreshAnimationListener refreshAnimationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62cdeee", new Object[]{this, refreshAnimationListener});
        } else {
            this.f = refreshAnimationListener;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            } else if (tzq.a(tzq.this) != null) {
                tzq.a(tzq.this).onRefresh();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            tzq.d(tzq.this, refreshState2);
            if (refreshState == TBRefreshHeader.RefreshState.NONE) {
                tzq.this.A(1.0f);
            }
            bqa.d("SwipeRefreshLayoutController", "onRefreshStateChanged oldState:" + refreshState + " newState： " + refreshState2);
            if (tzq.a(tzq.this) != null) {
                tzq.a(tzq.this).onRefreshStateChanged(refreshState, refreshState2);
            }
            tzq.g(tzq.this).e(refreshState, refreshState2);
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            if (tzq.a(tzq.this) != null) {
                tzq.a(tzq.this).onPullDistance(i);
            }
            float min = Math.min(1.0f, (i * 1.0f) / (tzq.b(tzq.this).getHeaderViewHeight() - tzq.b(tzq.this).getRefreshOffset()));
            if (tzq.c(tzq.this) == TBRefreshHeader.RefreshState.REFRESHING && min == 0.0f) {
                bqa.d("SwipeRefreshLayoutController", "当前处于刷新中了，不应该alpha再为0了，不再设置搜索栏alpha");
                return;
            }
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) tzq.e(tzq.this).a(IHomeSearchBarService.class);
            if (iHomeSearchBarService != null) {
                iHomeSearchBarService.setSearchBarAlpha(1.0f - min);
            }
            IBGContainerService iBGContainerService = (IBGContainerService) tzq.e(tzq.this).a(IBGContainerService.class);
            if (iBGContainerService != null && i >= 0) {
                iBGContainerService.updateBGContainerAlpha(i, min);
            }
            tzq tzqVar = tzq.this;
            if (i <= 0) {
                z = false;
            }
            tzq.f(tzqVar, z);
        }
    }

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
            return;
        }
        bqa.d("SwipeRefreshLayoutController", "setRefreshing: " + z);
        this.f29048a.setRefreshing(z, true);
    }

    public final void C(RefreshConfig refreshConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ac78d9", new Object[]{this, refreshConfig});
        } else if (refreshConfig.valid()) {
            this.f29048a.setRefreshOffset(refreshConfig.pullRefreshHeight.intValue());
            int m = m();
            this.f29048a.setCustomRefreshHeight(m);
            bqa.d("SwipeRefreshLayoutController", "setCustomRefreshHeight: " + m);
            this.f29048a.getRefresHeader().setRefreshTips(new String[]{refreshConfig.pullToRefreshText, refreshConfig.releaseToRefreshText, refreshConfig.refreshingText, refreshConfig.refreshFinishedText});
            this.f29048a.getRefresHeader().setRefreshTipColor(refreshConfig.parsePullTextColor.intValue());
            ((RefreshHeadView) this.f29048a.getRefresHeader().getRefreshView()).setRefreshViewColor(refreshConfig.parsePullTextColor.intValue());
            ((TBOldRefreshHeader) this.f29048a.getRefresHeader()).setRefreshTipSize(refreshConfig.pullTextSize.intValue());
            this.f29048a.getRefresHeader().setBackgroundColor(0);
            A(0.0f);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        bqa.d("SwipeRefreshLayoutController", "初始化下拉刷新");
        C(new DefaultRefreshConfig());
        w(true);
        this.f29048a.setOnPullRefreshListener(i());
        this.f29048a.setRefreshAnimationListener(j());
    }

    public final void t() {
        try {
            int i = -this.i;
            bqa.d("SwipeRefreshLayoutController", "resetSecondFloorState...offset:" + i);
            Method declaredMethod = TBSwipeRefreshLayout.class.getDeclaredMethod("updateHeaderPosition", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f29048a, Integer.valueOf(i));
        } catch (Exception e) {
            bqa.b("SwipeRefreshLayoutController", "resetHeaderOffset error", e);
        }
    }
}
