package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import tb.aqp;
import tb.c8c;
import tb.ckf;
import tb.pps;
import tb.r54;
import tb.t2o;
import tb.uop;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class HomePageTabFragmentViewProvider implements c8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pps f3271a;
    public ViewPager b;
    public final HashSet<ViewPager.OnPageChangeListener> c = new HashSet<>();
    public final PageChangeListener d = new PageChangeListener(this);
    public int e;
    public Fragment f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class PageChangeListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomePageTabFragmentViewProvider f3272a;

        static {
            t2o.a(766510120);
        }

        public PageChangeListener(HomePageTabFragmentViewProvider homePageTabFragmentViewProvider) {
            ckf.g(homePageTabFragmentViewProvider, "this$0");
            this.f3272a = homePageTabFragmentViewProvider;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            HomePageTabFragmentViewProvider homePageTabFragmentViewProvider = this.f3272a;
            if (homePageTabFragmentViewProvider.b != null) {
                PagerAdapter adapter = homePageTabFragmentViewProvider.k().getAdapter();
                if (!(adapter instanceof ShopContainerPageAdapter)) {
                    r54.C(new HomePageTabFragmentViewProvider$PageChangeListener$onPageSelected$2(this, i));
                    return;
                }
                if (HomePageTabFragmentViewProvider.f(this.f3272a) != i) {
                    ((ShopContainerPageAdapter) adapter).j(HomePageTabFragmentViewProvider.f(this.f3272a));
                }
                ((ShopContainerPageAdapter) adapter).i(i);
                HomePageTabFragmentViewProvider.h(this.f3272a, i);
            }
        }
    }

    static {
        t2o.a(766510119);
        t2o.a(766510108);
    }

    public HomePageTabFragmentViewProvider(pps ppsVar) {
        this.f3271a = ppsVar;
    }

    public static final /* synthetic */ int f(HomePageTabFragmentViewProvider homePageTabFragmentViewProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("338032c", new Object[]{homePageTabFragmentViewProvider})).intValue();
        }
        return homePageTabFragmentViewProvider.e;
    }

    public static final /* synthetic */ void g(HomePageTabFragmentViewProvider homePageTabFragmentViewProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b3f706", new Object[]{homePageTabFragmentViewProvider});
        } else {
            homePageTabFragmentViewProvider.m();
        }
    }

    public static final /* synthetic */ void h(HomePageTabFragmentViewProvider homePageTabFragmentViewProvider, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a220275e", new Object[]{homePageTabFragmentViewProvider, new Integer(i)});
        } else {
            homePageTabFragmentViewProvider.e = i;
        }
    }

    @Override // tb.c8c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb1a91f", new Object[]{this});
            return;
        }
        c8c.a.e(this);
        if (this.b != null) {
            PagerAdapter adapter = k().getAdapter();
            if (adapter instanceof ShopContainerPageAdapter) {
                ((ShopContainerPageAdapter) adapter).j(k().getCurrentItem());
            }
        }
    }

    @Override // tb.c8c
    public View b(Context context, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dab1df30", new Object[]{this, context, fragment});
        }
        ckf.g(fragment, "outerFragment");
        this.f = fragment;
        View findViewById = LayoutInflater.from(context).inflate(R.layout.view_viewpager_layout, (ViewGroup) null).findViewById(R.id.view_viewpager);
        ckf.f(findViewById, "basicView.findViewById<ViewPager>(R.id.view_viewpager)");
        n((ViewPager) findViewById);
        Iterator<ViewPager.OnPageChangeListener> it = this.c.iterator();
        while (it.hasNext()) {
            k().addOnPageChangeListener(it.next());
        }
        pps ppsVar = this.f3271a;
        if (ppsVar == null || ppsVar.b() == 0) {
            return k();
        }
        if (aqp.Companion.I()) {
            m();
        } else {
            l();
        }
        return k();
    }

    @Override // tb.c8c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0f96ed4", new Object[]{this})).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return k().getCurrentItem();
    }

    @Override // tb.c8c
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f15f3f8", new Object[]{this, new Integer(i)});
        } else if (this.b == null) {
            r54.F(new HomePageTabFragmentViewProvider$switchSubTabTo$2(this, i));
        } else {
            pps ppsVar = this.f3271a;
            if (ppsVar != null && i < ppsVar.b()) {
                k().setCurrentItem(i, true);
            }
        }
    }

    @Override // tb.c8c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cc24e6", new Object[]{this});
            return;
        }
        c8c.a.d(this);
        if (this.b != null) {
            this.d.onPageSelected(k().getCurrentItem());
        } else {
            r54.F(new HomePageTabFragmentViewProvider$onViewSelected$2(this));
        }
    }

    public final void i(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a6ce3d", new Object[]{this, onPageChangeListener});
            return;
        }
        ckf.g(onPageChangeListener, "onPageChangeListener");
        if (this.b == null) {
            this.c.add(onPageChangeListener);
        } else {
            k().addOnPageChangeListener(onPageChangeListener);
        }
    }

    public final Fragment j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("6290c33d", new Object[]{this, new Integer(i)});
        }
        try {
            PagerAdapter adapter = k().getAdapter();
            if (adapter instanceof ShopContainerPageAdapter) {
                return ((ShopContainerPageAdapter) adapter).h().getItem(i);
            }
            Result.m1108constructorimpl(xhv.INSTANCE);
            return null;
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
            return null;
        }
    }

    public final ViewPager k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b97c6756", new Object[]{this});
        }
        ViewPager viewPager = this.b;
        if (viewPager != null) {
            return viewPager;
        }
        ckf.y(OrderConfigs.VIEWPAGER);
        throw null;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5a40ef", new Object[]{this});
            return;
        }
        Fragment fragment = this.f;
        ckf.d(fragment);
        if (r54.e(fragment)) {
            l();
        } else {
            r54.F(new HomePageTabFragmentViewProvider$initViewPagerSafely$1(this));
        }
    }

    public final void n(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0412f4", new Object[]{this, viewPager});
            return;
        }
        ckf.g(viewPager, "<set-?>");
        this.b = viewPager;
    }

    @Override // tb.c8c
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else if (this.b != null) {
            k().setAdapter(null);
            k().clearOnPageChangeListeners();
        }
    }

    @Override // tb.c8c
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            c8c.a.b(this);
        }
    }

    @Override // tb.c8c
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            c8c.a.c(this);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755edc80", new Object[]{this});
            return;
        }
        Fragment fragment = this.f;
        ckf.d(fragment);
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        ckf.f(childFragmentManager, "outerFragment!!.childFragmentManager");
        ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(childFragmentManager);
        shopContainerPageAdapter.k(new uop(this.f3271a));
        ViewPager k = k();
        pps ppsVar = this.f3271a;
        ckf.d(ppsVar);
        k.setOffscreenPageLimit(ppsVar.b() - 1);
        k().setAdapter(shopContainerPageAdapter);
        k().addOnPageChangeListener(this.d);
    }
}
