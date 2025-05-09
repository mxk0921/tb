package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.business.getconfig.DefaultRefreshConfig;
import com.taobao.homepage.view.widgets.HomeSwipeRefreshLayout;
import com.taobao.tao.infoflow.multitab.SubMultiPreCreateListener;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.d9j;
import tb.fuq;
import tb.r5a;
import tb.sc;
import tb.t2o;
import tb.vxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PullRefreshViewPagerProvider implements com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBSwipeRefreshLayout f12488a;
    public MultiTabViewPager c;
    public MultiViewPagerAdapter d;
    public List<JSONObject> j;
    public final fuq k;
    public boolean l;
    public final IMultiTabPerformanceListener m;
    public final DefaultRefreshConfig b = new DefaultRefreshConfig();
    public final List<a.b> e = new CopyOnWriteArrayList();
    public final List<a.AbstractC0710a> f = new CopyOnWriteArrayList();
    public final List<a.c> g = new CopyOnWriteArrayList();
    public int h = 0;
    public boolean i = false;
    public boolean n = false;
    public final ViewPager.OnPageChangeListener o = new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.viewpager.PullRefreshViewPagerProvider.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 1) {
                PullRefreshViewPagerProvider pullRefreshViewPagerProvider = PullRefreshViewPagerProvider.this;
                PullRefreshViewPagerProvider.u(pullRefreshViewPagerProvider, PullRefreshViewPagerProvider.v(pullRefreshViewPagerProvider).getCurrentItem());
                PullRefreshViewPagerProvider.x(PullRefreshViewPagerProvider.this, true);
            } else if (i == 0) {
                if (PullRefreshViewPagerProvider.w(PullRefreshViewPagerProvider.this) && PullRefreshViewPagerProvider.v(PullRefreshViewPagerProvider.this).getCurrentItem() != PullRefreshViewPagerProvider.t(PullRefreshViewPagerProvider.this)) {
                    PullRefreshViewPagerProvider pullRefreshViewPagerProvider2 = PullRefreshViewPagerProvider.this;
                    PullRefreshViewPagerProvider.y(pullRefreshViewPagerProvider2, PullRefreshViewPagerProvider.v(pullRefreshViewPagerProvider2).getCurrentItem());
                }
                PullRefreshViewPagerProvider.x(PullRefreshViewPagerProvider.this, false);
            }
            for (a.AbstractC0710a aVar : PullRefreshViewPagerProvider.z(PullRefreshViewPagerProvider.this)) {
                aVar.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            PullRefreshViewPagerProvider.B(PullRefreshViewPagerProvider.this, false);
            for (a.AbstractC0710a aVar : PullRefreshViewPagerProvider.z(PullRefreshViewPagerProvider.this)) {
                aVar.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            PullRefreshViewPagerProvider.v(PullRefreshViewPagerProvider.this).onPageSelected();
            if (!PullRefreshViewPagerProvider.A(PullRefreshViewPagerProvider.this)) {
                for (a.AbstractC0710a aVar : PullRefreshViewPagerProvider.z(PullRefreshViewPagerProvider.this)) {
                    aVar.onPageSelected(i);
                }
            }
        }
    };
    public final TBSwipeRefreshLayout.OnPullRefreshListener p = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            for (a.b bVar : PullRefreshViewPagerProvider.C(PullRefreshViewPagerProvider.this)) {
                bVar.onPullDistance(i);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            for (a.b bVar : PullRefreshViewPagerProvider.C(PullRefreshViewPagerProvider.this)) {
                bVar.onRefresh();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            for (a.b bVar : PullRefreshViewPagerProvider.C(PullRefreshViewPagerProvider.this)) {
                bVar.onRefreshStateChanged(refreshState, refreshState2);
            }
        }
    }

    static {
        t2o.a(729809591);
        t2o.a(729809584);
    }

    public PullRefreshViewPagerProvider(fuq fuqVar, IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        this.k = fuqVar;
        this.m = iMultiTabPerformanceListener;
    }

    public static /* synthetic */ boolean A(PullRefreshViewPagerProvider pullRefreshViewPagerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("322bba6c", new Object[]{pullRefreshViewPagerProvider})).booleanValue();
        }
        return pullRefreshViewPagerProvider.n;
    }

    public static /* synthetic */ boolean B(PullRefreshViewPagerProvider pullRefreshViewPagerProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1199642e", new Object[]{pullRefreshViewPagerProvider, new Boolean(z)})).booleanValue();
        }
        pullRefreshViewPagerProvider.n = z;
        return z;
    }

    public static /* synthetic */ List C(PullRefreshViewPagerProvider pullRefreshViewPagerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("76a2ec3e", new Object[]{pullRefreshViewPagerProvider});
        }
        return pullRefreshViewPagerProvider.e;
    }

    public static /* synthetic */ int t(PullRefreshViewPagerProvider pullRefreshViewPagerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5d2ebd6", new Object[]{pullRefreshViewPagerProvider})).intValue();
        }
        return pullRefreshViewPagerProvider.h;
    }

    public static /* synthetic */ int u(PullRefreshViewPagerProvider pullRefreshViewPagerProvider, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d82231", new Object[]{pullRefreshViewPagerProvider, new Integer(i)})).intValue();
        }
        pullRefreshViewPagerProvider.h = i;
        return i;
    }

    public static /* synthetic */ MultiTabViewPager v(PullRefreshViewPagerProvider pullRefreshViewPagerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabViewPager) ipChange.ipc$dispatch("39ea77dd", new Object[]{pullRefreshViewPagerProvider});
        }
        return pullRefreshViewPagerProvider.c;
    }

    public static /* synthetic */ boolean w(PullRefreshViewPagerProvider pullRefreshViewPagerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8129a4e9", new Object[]{pullRefreshViewPagerProvider})).booleanValue();
        }
        return pullRefreshViewPagerProvider.i;
    }

    public static /* synthetic */ boolean x(PullRefreshViewPagerProvider pullRefreshViewPagerProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a258c951", new Object[]{pullRefreshViewPagerProvider, new Boolean(z)})).booleanValue();
        }
        pullRefreshViewPagerProvider.i = z;
        return z;
    }

    public static /* synthetic */ void y(PullRefreshViewPagerProvider pullRefreshViewPagerProvider, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cb9e5d", new Object[]{pullRefreshViewPagerProvider, new Integer(i)});
        } else {
            pullRefreshViewPagerProvider.D(i);
        }
    }

    public static /* synthetic */ List z(PullRefreshViewPagerProvider pullRefreshViewPagerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ec3f0980", new Object[]{pullRefreshViewPagerProvider});
        }
        return pullRefreshViewPagerProvider.f;
    }

    public final void D(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad6f880", new Object[]{this, new Integer(i)});
            return;
        }
        List<JSONObject> list = this.j;
        if (list != null && !list.isEmpty() && i < list.size() && (jSONObject = list.get(i)) != null && (jSONObject2 = jSONObject.getJSONObject("clickParam")) != null) {
            String string = jSONObject2.getString("page");
            try {
                i2 = jSONObject2.getIntValue("eventId");
            } catch (Exception e) {
                d9j.c("PullRefreshView", "parse eventId error, " + e.getMessage());
                i2 = 2201;
            }
            r5a.h(string, i2, "Page_Home_Slideto-tab", jSONObject2.getJSONObject("args"));
            d9j.c("PullRefreshView", "report slide ut");
        }
    }

    @Override // tb.ywc
    public void d(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5600888b", new Object[]{this, linearLayout});
            return;
        }
        if (!vxl.b().z()) {
            this.f12488a = new TBSwipeRefreshLayout(linearLayout.getContext());
        } else {
            this.f12488a = new HomeSwipeRefreshLayout(linearLayout.getContext());
        }
        TBRefreshHeader refresHeader = this.f12488a.getRefresHeader();
        DefaultRefreshConfig defaultRefreshConfig = this.b;
        refresHeader.setRefreshTips(new String[]{defaultRefreshConfig.pullToRefreshText, defaultRefreshConfig.releaseToRefreshText, defaultRefreshConfig.refreshingText, defaultRefreshConfig.refreshFinishedText});
        this.f12488a.enablePullRefresh(true);
        MultiTabViewPager multiTabViewPager = new MultiTabViewPager(linearLayout.getContext());
        this.c = multiTabViewPager;
        ViewGroup.LayoutParams layoutParams = multiTabViewPager.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.c.setLayoutParams(layoutParams);
        this.f12488a.addView(this.c);
        this.f12488a.setOnPullRefreshListener(this.p);
        linearLayout.addView(this.f12488a, new ViewGroup.LayoutParams(-1, -1));
        MultiViewPagerAdapter multiViewPagerAdapter = new MultiViewPagerAdapter(this.k, this.g);
        this.d = multiViewPagerAdapter;
        this.c.setAdapter(multiViewPagerAdapter);
        this.c.setPageTransformer(false, null);
        this.c.clearOnPageChangeListeners();
        this.c.addOnPageChangeListener(new SubMultiPreCreateListener(this.k));
        this.c.addOnPageChangeListener(this.o);
        this.l = true;
        d9j.c("PullRefreshView", sc.initView);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public List<JSONObject> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8a2b4797", new Object[]{this});
        }
        if (!this.l) {
            return null;
        }
        return this.d.i();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void j(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7906", new Object[]{this, bVar});
        } else {
            ((CopyOnWriteArrayList) this.e).add(bVar);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f601366e", new Object[]{this, new Boolean(z)});
        } else if (this.l) {
            this.c.setEnableAccidentSlide(z);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void l(a.AbstractC0710a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d5e172", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArrayList) this.f).add(aVar);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8263f348", new Object[]{this, new Integer(i)});
            return;
        }
        MultiTabViewPager multiTabViewPager = this.c;
        if (multiTabViewPager != null) {
            this.n = true;
            multiTabViewPager.setCurrentItem(i, false);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void n(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cae5029", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.l) {
            this.d.j(i, z);
            if (!z) {
                this.c.setCurrentItem(i, false);
            }
        }
    }

    @Override // tb.ywc
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ((CopyOnWriteArrayList) this.e).clear();
        ((CopyOnWriteArrayList) this.f).clear();
        ((CopyOnWriteArrayList) this.g).clear();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void q(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d406f2", new Object[]{this, cVar});
        } else {
            ((CopyOnWriteArrayList) this.g).add(cVar);
        }
    }

    @Override // tb.ywc
    public void r(JSONObject jSONObject, List<JSONObject> list, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f32641", new Object[]{this, jSONObject, list, new Boolean(z)});
            return;
        }
        d9j.c("PullRefreshView", "uiRefresh");
        this.j = list;
        this.d.k(list);
        MultiTabViewPager multiTabViewPager = this.c;
        fuq fuqVar = this.k;
        if (z) {
            i = fuqVar.n();
        } else {
            i = fuqVar.o();
        }
        multiTabViewPager.setCurrentItem(i);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388183ba", new Object[]{this, new Boolean(z)});
        } else if (this.l) {
            this.f12488a.enablePullRefresh(z);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void setRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
        } else if (this.l) {
            if (z) {
                this.f12488a.setRefreshing(true, true);
            } else {
                this.f12488a.setRefreshing(false);
            }
        }
    }
}
