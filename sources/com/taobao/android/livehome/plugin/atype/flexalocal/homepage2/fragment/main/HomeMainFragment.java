package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.appbar.AppBarLayout;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeMainBaseFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.LiveListRequest;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component.HomeSecondTabView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component.HomeSwipeRefreshLayout;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.feedback.FeedbackCtrl;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainSecondFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout;
import com.taobao.login4android.api.Login;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.b0h;
import tb.b2b;
import tb.d1b;
import tb.fp8;
import tb.j5h;
import tb.js8;
import tb.lqc;
import tb.lrq;
import tb.mbu;
import tb.nlc;
import tb.nvs;
import tb.o1b;
import tb.oqc;
import tb.p0;
import tb.p0h;
import tb.p9m;
import tb.qfi;
import tb.qw0;
import tb.qyg;
import tb.r0h;
import tb.sj7;
import tb.t2o;
import tb.u1b;
import tb.v0b;
import tb.yj4;
import tb.ytc;
import tb.z1b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeMainFragment extends HomeMainBaseFragment implements lqc, oqc, nlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d0 = HomeMainFragment.class.getSimpleName();
    public FrameLayout A;
    public b2b B;
    public LiveHomeTabLayout C;
    public ViewPager D;
    public ViewGroup E;
    public TUrlImageView F;
    public ImageView G;
    public LinearLayout H;
    public o1b I;
    public ViewStub J;
    public ViewStub K;
    public v0b L;
    public v0b M;
    public p0h N;
    public LiveListRequest O;
    public SecondViewPagerAdapter R;
    public HomeSecondTabView S;
    public Handler U;
    public z1b V;
    public JSONObject W;
    public FeedbackCtrl Y;
    public TabManager.TabBottom Z;
    public List<TabManager.TabUp> a0;
    public HomeMainSecondFragment b0;
    public View t;
    public HomeSwipeRefreshLayout u;
    public AppBarLayout v;
    public FrameLayout w;
    public u1b x;
    public String y = "jingxuan";
    public String z = "all";
    public boolean P = false;
    public boolean Q = false;
    public int T = 0;
    public boolean X = true;
    public boolean c0 = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SecondViewPagerAdapter extends FragmentStatePagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<HomeSecondTabView.SecondTab> f8823a = new ArrayList();
        public b0h b;

        static {
            t2o.a(310378687);
        }

        public SecondViewPagerAdapter(FragmentManager fragmentManager, List<HomeSecondTabView.SecondTab> list) {
            super(fragmentManager);
            i(list);
        }

        public static /* synthetic */ Object ipc$super(SecondViewPagerAdapter secondViewPagerAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/HomeMainFragment$SecondViewPagerAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return ((ArrayList) this.f8823a).size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            HomeSecondTabView.SecondTab secondTab;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
            }
            List<HomeSecondTabView.SecondTab> list = this.f8823a;
            if (list == null || ((ArrayList) list).size() <= i || ((ArrayList) this.f8823a).get(i) == null || (secondTab = (HomeSecondTabView.SecondTab) ((ArrayList) this.f8823a).get(i)) == null) {
                return null;
            }
            return new HomeMainSecondFragment(this.b, secondTab);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)});
            }
            return ((HomeSecondTabView.SecondTab) ((ArrayList) this.f8823a).get(i)).name;
        }

        public void h(b0h b0hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e78edcc", new Object[]{this, b0hVar});
            } else {
                this.b = b0hVar;
            }
        }

        public void i(List<HomeSecondTabView.SecondTab> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f0a7ddf", new Object[]{this, list});
                return;
            }
            this.f8823a.clear();
            if (list != null) {
                this.f8823a.addAll(list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (HomeMainFragment.g3(HomeMainFragment.this) != null) {
                HomeMainFragment.g3(HomeMainFragment.this).o(false, HomeMainFragment.this.z);
            }
            if (HomeMainFragment.h3(HomeMainFragment.this) != null && HomeMainFragment.u3(HomeMainFragment.this).q() != null && HomeMainFragment.A3(HomeMainFragment.this).q().getDinamicSdkManager() != null && HomeMainFragment.B3(HomeMainFragment.this).e() != null) {
                HomeMainFragment.D3(HomeMainFragment.this).q().getDinamicSdkManager().downloadTemplates(HomeMainFragment.C3(HomeMainFragment.this).e());
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
            } else {
                HomeMainFragment.E3(HomeMainFragment.this).m().b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (HomeMainFragment.F3(HomeMainFragment.this) != null) {
                HomeMainFragment.F3(HomeMainFragment.this).z();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements HomeSecondTabView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component.HomeSecondTabView.d
        public void a(LiveHomeTabLayout.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9702b8be", new Object[]{this, hVar});
            } else if (HomeMainFragment.G3(HomeMainFragment.this) != null && hVar != null) {
                HomeMainFragment.this.p0(hVar.n());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements AppBarLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float[] f8828a;
        public final /* synthetic */ boolean[] b;

        public e(float[] fArr, boolean[] zArr) {
            this.f8828a = fArr;
            this.b = zArr;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1579d24", new Object[]{this, appBarLayout, new Integer(i)});
                return;
            }
            float f = i;
            if (this.f8828a[0] != f) {
                if (HomeMainFragment.i3(HomeMainFragment.this) != null) {
                    HomeMainFragment.i3(HomeMainFragment.this).f();
                }
                int height = HomeMainFragment.j3(HomeMainFragment.this).getHeight();
                if (HomeMainFragment.k3(HomeMainFragment.this) != null) {
                    if (Math.abs(i) == height) {
                        if (!this.b[0]) {
                            HomeMainFragment.k3(HomeMainFragment.this).setBackgroundResource(R.drawable.live_home_main_secondtab_fold_bg_flexalocal);
                            this.b[0] = true;
                        }
                    } else if (this.b[0]) {
                        HomeMainFragment.k3(HomeMainFragment.this).setBackgroundResource(R.drawable.live_home_main_secondtab_bg_flexalocal);
                        this.b[0] = false;
                    }
                }
                if (!(HomeMainFragment.l3(HomeMainFragment.this) == null || this.f8828a[0] == f)) {
                    HomeMainFragment.l3(HomeMainFragment.this).g(800, -i, HomeMainFragment.l3(HomeMainFragment.this).a());
                }
                this.f8828a[0] = f;
                if (i >= 0) {
                    if (!HomeMainFragment.m3(HomeMainFragment.this)) {
                        HomeMainFragment.n3(HomeMainFragment.this, true);
                        HomeMainFragment.o3(HomeMainFragment.this).enablePullRefresh(true);
                        HomeMainFragment.this.T3();
                        r0h.b(HomeMainFragment.p3(), "appBarLayout enablePullRefresh is true");
                    }
                } else if (HomeMainFragment.m3(HomeMainFragment.this)) {
                    HomeMainFragment.n3(HomeMainFragment.this, false);
                    HomeMainFragment.o3(HomeMainFragment.this).enablePullRefresh(false);
                    r0h.b(HomeMainFragment.p3(), "appBarLayout enablePullRefresh is false");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeMainSecondFragment f8829a;
        public final /* synthetic */ BaseOutDo b;

        public f(HomeMainSecondFragment homeMainSecondFragment, BaseOutDo baseOutDo) {
            this.f8829a = homeMainSecondFragment;
            this.b = baseOutDo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new d1b(HomeMainFragment.q3(HomeMainFragment.this), this.f8829a.e3()).a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (HomeMainFragment.r3(HomeMainFragment.this) != null) {
                if (HomeMainFragment.s3(HomeMainFragment.this) == null) {
                    HomeMainFragment.t3(HomeMainFragment.this, new v0b(HomeMainFragment.r3(HomeMainFragment.this), HomeMainFragment.this.getContext(), HomeMainFragment.v3(HomeMainFragment.this)));
                    HomeMainFragment.s3(HomeMainFragment.this).a();
                }
                HomeMainFragment.s3(HomeMainFragment.this).h("taolive_channel_platform_task");
                HomeMainFragment.s3(HomeMainFragment.this).f(null, false);
            }
            if (HomeMainFragment.w3(HomeMainFragment.this) != null) {
                if (HomeMainFragment.x3(HomeMainFragment.this) == null) {
                    HomeMainFragment.y3(HomeMainFragment.this, new v0b(HomeMainFragment.w3(HomeMainFragment.this), HomeMainFragment.this.getContext(), HomeMainFragment.z3(HomeMainFragment.this)));
                    HomeMainFragment.x3(HomeMainFragment.this).a();
                }
                HomeMainFragment.x3(HomeMainFragment.this).h("taolive_channel_bottom_red_packet_new");
                HomeMainFragment.x3(HomeMainFragment.this).f(null, false);
            }
        }
    }

    static {
        t2o.a(310378678);
        t2o.a(310378801);
        t2o.a(310378805);
        t2o.a(310378804);
        t2o.a(806355483);
    }

    public static /* synthetic */ b0h A3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("dc3c3577", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ b0h B3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("c3ea4338", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ b0h C3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("ab9850f9", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ b0h D3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("93465eba", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ b0h E3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("7af46c7b", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ o1b F3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1b) ipChange.ipc$dispatch("6a40c168", new Object[]{homeMainFragment});
        }
        return homeMainFragment.I;
    }

    public static /* synthetic */ ViewPager G3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("4960053f", new Object[]{homeMainFragment});
        }
        return homeMainFragment.D;
    }

    public static HomeMainFragment Q3(Bundle bundle, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeMainFragment) ipChange.ipc$dispatch("a2c42591", new Object[]{bundle, b0hVar});
        }
        HomeMainFragment homeMainFragment = new HomeMainFragment();
        homeMainFragment.setArguments(bundle);
        homeMainFragment.f3(b0hVar);
        return homeMainFragment;
    }

    public static /* synthetic */ p0h g3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p0h) ipChange.ipc$dispatch("c6b4fd36", new Object[]{homeMainFragment});
        }
        return homeMainFragment.N;
    }

    public static /* synthetic */ b0h h3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("ce019f5", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ b2b i3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2b) ipChange.ipc$dispatch("7daf53ce", new Object[]{homeMainFragment});
        }
        return homeMainFragment.B;
    }

    public static /* synthetic */ Object ipc$super(HomeMainFragment homeMainFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2049624054:
                super.X2();
                return null;
            case -1990827289:
                super.W2();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 303778162:
                super.T2();
                return null;
            case 999033108:
                super.U2();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/HomeMainFragment");
        }
    }

    public static /* synthetic */ FrameLayout j3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c590183a", new Object[]{homeMainFragment});
        }
        return homeMainFragment.A;
    }

    public static /* synthetic */ LiveHomeTabLayout k3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveHomeTabLayout) ipChange.ipc$dispatch("2af1540c", new Object[]{homeMainFragment});
        }
        return homeMainFragment.C;
    }

    public static /* synthetic */ z1b l3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z1b) ipChange.ipc$dispatch("3ba76781", new Object[]{homeMainFragment});
        }
        return homeMainFragment.V;
    }

    public static /* synthetic */ boolean m3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6ee03c6", new Object[]{homeMainFragment})).booleanValue();
        }
        return homeMainFragment.X;
    }

    public static /* synthetic */ boolean n3(HomeMainFragment homeMainFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87eca814", new Object[]{homeMainFragment, new Boolean(z)})).booleanValue();
        }
        homeMainFragment.X = z;
        return z;
    }

    public static /* synthetic */ HomeSwipeRefreshLayout o3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSwipeRefreshLayout) ipChange.ipc$dispatch("9802f7d7", new Object[]{homeMainFragment});
        }
        return homeMainFragment.u;
    }

    public static /* synthetic */ String p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb779f4", new Object[0]);
        }
        return d0;
    }

    public static /* synthetic */ View q3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("378d5747", new Object[]{homeMainFragment});
        }
        return homeMainFragment.t;
    }

    public static /* synthetic */ ViewStub r3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("922a52fa", new Object[]{homeMainFragment});
        }
        return homeMainFragment.J;
    }

    public static /* synthetic */ v0b s3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0b) ipChange.ipc$dispatch("9bd01fdc", new Object[]{homeMainFragment});
        }
        return homeMainFragment.L;
    }

    public static /* synthetic */ v0b t3(HomeMainFragment homeMainFragment, v0b v0bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0b) ipChange.ipc$dispatch("e74fca11", new Object[]{homeMainFragment, v0bVar});
        }
        homeMainFragment.L = v0bVar;
        return v0bVar;
    }

    public static /* synthetic */ b0h u3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("f48e27b6", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ b0h v3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("2154e942", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    public static /* synthetic */ ViewStub w3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("fa98c512", new Object[]{homeMainFragment});
        }
        return homeMainFragment.K;
    }

    public static /* synthetic */ v0b x3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0b) ipChange.ipc$dispatch("982bd5f4", new Object[]{homeMainFragment});
        }
        return homeMainFragment.M;
    }

    public static /* synthetic */ v0b y3(HomeMainFragment homeMainFragment, v0b v0bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0b) ipChange.ipc$dispatch("365cf4f9", new Object[]{homeMainFragment, v0bVar});
        }
        homeMainFragment.M = v0bVar;
        return v0bVar;
    }

    public static /* synthetic */ b0h z3(HomeMainFragment homeMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("d85f1285", new Object[]{homeMainFragment});
        }
        return homeMainFragment.p;
    }

    @Override // tb.lqc
    public void A(String str) {
        HomeMainSecondFragment J3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9928bbe", new Object[]{this, str});
            return;
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.setRefreshing(false);
        }
        if (!lrq.a(str) && (J3 = J3(str)) != null) {
            J3.onPageEnd();
        }
    }

    @Override // tb.lqc
    public void G1(LiveListRequest liveListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8680bea8", new Object[]{this, liveListRequest});
        } else {
            this.O = P3();
        }
    }

    public final JSONObject H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("71cca22a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pad", (Object) Boolean.valueOf(sj7.w(getContext())));
        jSONObject.put("foldDevice", (Object) Boolean.valueOf(sj7.s(getContext())));
        jSONObject.put("loadImgImprove", (Object) "true");
        jSONObject.put("hasTBLHomeAnimatedView", (Object) "true");
        jSONObject.put("hasLiveEqualAltitude", (Object) "true");
        jSONObject.put("enableNewSmartCard", (Object) "true");
        jSONObject.put("newChannel", (Object) "true");
        jSONObject.put("channelType", (Object) "jingxuan");
        jSONObject.put("channelId", (Object) "0");
        return jSONObject;
    }

    public void I3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa6bc9f", new Object[]{this});
        } else {
            this.U.postDelayed(new g(), 1000L);
        }
    }

    public final HomeMainSecondFragment J3(String str) {
        HomeSecondTabView homeSecondTabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeMainSecondFragment) ipChange.ipc$dispatch("967c0772", new Object[]{this, str});
        }
        if (this.R == null || this.D == null || (homeSecondTabView = this.S) == null || homeSecondTabView.k() == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return K3(this.D.getCurrentItem());
        }
        return K3(this.S.j(str));
    }

    public final HomeMainSecondFragment K3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeMainSecondFragment) ipChange.ipc$dispatch("16891080", new Object[]{this, new Integer(i)});
        }
        try {
            SecondViewPagerAdapter secondViewPagerAdapter = this.R;
            if (secondViewPagerAdapter == null || this.D == null || i == -1 || secondViewPagerAdapter.getCount() <= i) {
                return null;
            }
            Object instantiateItem = this.R.instantiateItem((ViewGroup) this.D, i);
            if (instantiateItem instanceof HomeMainSecondFragment) {
                return (HomeMainSecondFragment) instantiateItem;
            }
            return null;
        } catch (Exception e2) {
            String str = d0;
            r0h.b(str, "getCurrentSecondFragmentByPos exp：" + e2.getMessage());
            return null;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeMainBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return d0;
    }

    public final void N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ad4484", new Object[]{this});
            return;
        }
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setOnClickListener(new b());
        }
        if (this.H != null) {
            this.I = new o1b(getContext(), this.f10969a, this.H, this.p);
            List<TabManager.TabUp> list = this.a0;
            if (list != null && list.size() > 1) {
                this.I.F(this.a0.get(1));
            }
            if (qw0.a() || qw0.b()) {
                this.U.postDelayed(new c(), 2000L);
            } else {
                o1b o1bVar = this.I;
                if (o1bVar != null) {
                    o1bVar.z();
                }
            }
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.init();
            this.u.setLiveHomeContext(this.p);
            this.u.setRefreshListener(this);
        }
        if (this.C != null) {
            HomeSecondTabView homeSecondTabView = new HomeSecondTabView(this.C, getContext(), this.p);
            this.S = homeSecondTabView;
            homeSecondTabView.a();
            this.S.q(new d());
        }
        this.v.addOnOffsetChangedListener((AppBarLayout.d) new e(new float[1], new boolean[]{false}));
        if (this.A != null) {
            this.B = new b2b(this.A, getContext(), this.p);
        }
        if (this.w != null) {
            u1b u1bVar = new u1b(this.w, getContext(), this.p);
            this.x = u1bVar;
            u1bVar.a();
            this.x.m(this.V);
        }
    }

    public final void O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98db924", new Object[]{this});
            return;
        }
        qyg.c().f(this);
        this.p.J(this);
        this.V = new z1b(this.t, getContext(), this.p);
        this.p.E(new fp8());
        FeedbackCtrl feedbackCtrl = new FeedbackCtrl();
        this.Y = feedbackCtrl;
        this.p.F(feedbackCtrl);
        this.p.S(new qfi(this.p.k));
    }

    public p0h R3(Bundle bundle, LiveListRequest liveListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p0h) ipChange.ipc$dispatch("b3161aa3", new Object[]{this, bundle, liveListRequest});
        }
        p0h p0hVar = new p0h();
        p0hVar.N(this.z, this.O);
        p0hVar.K(H3());
        p0hVar.M(this);
        p0hVar.L(this.p);
        return p0hVar;
    }

    public LiveListRequest S3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveListRequest) ipChange.ipc$dispatch("66605667", new Object[]{this, bundle});
        }
        P3();
        return this.O;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.T2();
        b2b b2bVar = this.B;
        if (b2bVar != null) {
            b2bVar.g(true);
        }
        HomeMainSecondFragment homeMainSecondFragment = this.b0;
        if (homeMainSecondFragment != null) {
            homeMainSecondFragment.v2();
        }
    }

    public void T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede548eb", new Object[]{this});
        } else if (this.D != null && this.R != null && this.v != null) {
            U3(0);
            for (int i = 0; i < this.D.getChildCount(); i++) {
                Fragment fragment = (Fragment) this.R.instantiateItem((ViewGroup) this.D, i);
                if (fragment instanceof HomeMainSecondFragment) {
                    ((HomeMainSecondFragment) fragment).v3();
                }
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.U2();
        b2b b2bVar = this.B;
        if (b2bVar != null) {
            b2bVar.g(false);
        }
        HomeMainSecondFragment homeMainSecondFragment = this.b0;
        if (homeMainSecondFragment != null) {
            homeMainSecondFragment.onPause();
        }
    }

    public final void U3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be8a89a", new Object[]{this, new Integer(i)});
            return;
        }
        AppBarLayout appBarLayout = this.v;
        if (appBarLayout != null) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof AppBarLayout.Behavior) {
                AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
                int a2 = behavior2.a();
                if (i != 0 || a2 != 0) {
                    behavior2.d(i);
                }
            }
        }
    }

    public final void V3(int i) {
        try {
            IpChange ipChange = ViewPager.$ipChange;
            Field declaredField = ViewPager.class.getDeclaredField("mCurItem");
            declaredField.setAccessible(true);
            declaredField.setInt(this.D, i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.W2();
        HomeMainSecondFragment homeMainSecondFragment = this.b0;
        if (homeMainSecondFragment != null) {
            homeMainSecondFragment.onPause();
        }
    }

    public final void W3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81d5c52", new Object[]{this, new Boolean(z)});
            return;
        }
        HomeSecondTabView homeSecondTabView = this.S;
        if (homeSecondTabView != null && homeSecondTabView.k() != null) {
            this.T = this.S.l();
            List<HomeSecondTabView.SecondTab> k = this.S.k();
            this.R = new SecondViewPagerAdapter(getChildFragmentManager(), k);
            this.D.setOffscreenPageLimit(k.size());
            this.R.h(this.p);
            this.D.setAdapter(this.R);
            V3(this.T);
            this.p.M(z);
            this.p.B(k.get(this.T).subChannelType);
            LiveHomeTabLayout liveHomeTabLayout = this.C;
            if (liveHomeTabLayout != null) {
                liveHomeTabLayout.setupWithViewPager(this.D);
            }
            this.D.addOnPageChangeListener(new ViewPager.OnPageChangeListener(this) { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.HomeMainFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f2, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    } else {
                        r0h.b(HomeMainFragment.p3(), "onPageSelected");
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        super.X2();
        o1b o1bVar = this.I;
        if (o1bVar != null) {
            o1bVar.x();
        }
        HomeMainSecondFragment homeMainSecondFragment = this.b0;
        if (homeMainSecondFragment != null) {
            homeMainSecondFragment.onResume();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
            return;
        }
        U3(0);
        v();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeMainBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public String getUTPageName() {
        TabManager.TabUp tabUp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        List<TabManager.TabUp> list = this.a0;
        if (list == null || list.size() <= 1 || (tabUp = this.a0.get(1)) == null) {
            return "";
        }
        return tabUp.pageName;
    }

    @Override // tb.lqc
    public void h(String str) {
        HomeMainSecondFragment J3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab936a30", new Object[]{this, str});
            return;
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.setRefreshing(false);
        }
        if (!lrq.a(str) && (J3 = J3(str)) != null) {
            J3.o3();
        }
    }

    @Override // tb.lqc
    public void k(BaseOutDo baseOutDo, String str) {
        HomeMainSecondFragment J3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3539f3", new Object[]{this, baseOutDo, str});
            return;
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.setRefreshing(false);
        }
        if (!lrq.a(str) && (J3 = J3(str)) != null) {
            J3.q3(baseOutDo);
        }
    }

    @Override // tb.lqc
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3737f3f5", new Object[]{this, str});
        } else if (!lrq.a(str) && J3(str) != null) {
            this.N.u(str, this.O);
            this.N.o(true, str);
        }
    }

    @Override // tb.lqc
    public void m(BaseOutDo baseOutDo, boolean z, String str) {
        String str2;
        HomeMainSecondFragment J3;
        long j;
        HomeSecondTabView homeSecondTabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49eb79c9", new Object[]{this, baseOutDo, new Boolean(z), str});
            return;
        }
        if (z) {
            str2 = "homeMain_cache_render_start";
        } else {
            str2 = "homeMain_mtop_render_start";
        }
        mbu.b(str2, this.p);
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.setRefreshing(false);
        }
        b2b b2bVar = this.B;
        if (b2bVar != null) {
            b2bVar.a();
            this.B.e(baseOutDo, z);
        }
        if (this.x != null && (!z || !sj7.a())) {
            this.x.l(baseOutDo, z);
        }
        if (!(this.C == null || (homeSecondTabView = this.S) == null)) {
            homeSecondTabView.s(this.W);
            this.S.n(baseOutDo, z);
            W3(z);
        }
        if (!lrq.a(str) && (J3 = J3(str)) != null) {
            J3.n3(baseOutDo, z);
            if (!z && !this.c0 && "all".equals(J3.f3())) {
                this.c0 = true;
                this.b0 = J3;
                J3.t3();
                I3();
                Handler handler = this.U;
                f fVar = new f(J3, baseOutDo);
                if (qw0.a()) {
                    j = 2000;
                } else {
                    j = 1500;
                }
                handler.postDelayed(fVar, j);
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        HomeMainSecondFragment homeMainSecondFragment = this.b0;
        if (homeMainSecondFragment != null) {
            homeMainSecondFragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TabManager.TabBottom tabBottom = (TabManager.TabBottom) arguments.getSerializable("tab_bottom");
            this.Z = tabBottom;
            if (tabBottom != null) {
                this.a0 = L3();
            }
            this.y = arguments.getString("START_CHANNEL_TYPE", "jingxuan");
        }
        c3();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        mbu.b("homeMain_create", this.p);
        if (this.t == null) {
            this.P = true;
            this.U = new Handler();
            View inflate = layoutInflater.inflate(R.layout.live_selected_main_fragment_flexalocal, viewGroup, false);
            this.t = inflate;
            this.H = (LinearLayout) inflate.findViewById(R.id.live_home_main_search);
            this.J = (ViewStub) this.t.findViewById(R.id.live_home_main_right_platform_task_stub);
            this.K = (ViewStub) this.t.findViewById(R.id.live_home_main_bottom_float_stub);
            this.u = (HomeSwipeRefreshLayout) this.t.findViewById(R.id.live_home_main_refresh_layout);
            this.v = (AppBarLayout) this.t.findViewById(R.id.live_home_main_appbar);
            this.w = (FrameLayout) this.t.findViewById(R.id.live_home_main_topBack);
            this.A = (FrameLayout) this.t.findViewById(R.id.live_home_main_headArea);
            this.C = (LiveHomeTabLayout) this.t.findViewById(R.id.live_home_main_tabLayout);
            this.E = (ViewGroup) this.t.findViewById(R.id.live_home_main_topNav);
            this.F = (TUrlImageView) this.t.findViewById(R.id.live_home_main_top_nav_back);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin += qw0.d(this.f10969a, this.p.m);
                this.E.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.F.getLayoutParams();
                layoutParams2.height = layoutParams.topMargin + qw0.d(getContext(), 46.0f);
                this.F.setLayoutParams(layoutParams2);
            }
            this.G = (ImageView) this.t.findViewById(R.id.live_home_main_back);
            this.D = (ViewPager) this.t.findViewById(R.id.live_home_main_vp);
            O3();
            N3();
        }
        return this.t;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mbu.g(this.p);
        b0h b0hVar = this.p;
        if (b0hVar != null) {
            if (!(b0hVar.g() == null || this.N == null)) {
                this.p.g().h(this.N.q());
            }
            if (this.p.r() != null) {
                this.p.r().e();
            }
        }
        qyg.c().j(this);
    }

    @Override // tb.lqc
    public void onLoadMore() {
        HomeMainSecondFragment homeMainSecondFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a87be1", new Object[]{this});
            return;
        }
        p0h p0hVar = this.N;
        if (p0hVar != null && (homeMainSecondFragment = this.b0) != null) {
            p0hVar.A(homeMainSecondFragment.f3());
        }
    }

    @Override // tb.oqc
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        z1b z1bVar = this.V;
        if (z1bVar != null) {
            z1bVar.f(800, i);
        }
    }

    @Override // tb.lqc
    public void q(BaseOutDo baseOutDo, String str) {
        HomeMainSecondFragment J3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e47cba", new Object[]{this, baseOutDo, str});
            return;
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.setRefreshing(false);
        }
        if (!lrq.a(str) && (J3 = J3(str)) != null) {
            J3.r3(baseOutDo);
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615f50a9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        this.Q = z;
    }

    @Override // tb.lqc
    public void u(String str, String str2) {
        HomeMainSecondFragment J3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ca1db5", new Object[]{this, str, str2});
            return;
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.setRefreshing(false);
        }
        if (!lrq.a(str2) && (J3 = J3(str2)) != null) {
            J3.p3();
        }
    }

    @Override // tb.lqc
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed24ef51", new Object[]{this});
            return;
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = this.u;
        if (homeSwipeRefreshLayout != null) {
            homeSwipeRefreshLayout.setRefreshing(true);
        }
        HomeMainSecondFragment homeMainSecondFragment = this.b0;
        if (homeMainSecondFragment != null) {
            this.N.H(homeMainSecondFragment.f3());
        }
    }

    public final List<TabManager.TabUp> M3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bf74916", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (!lrq.a(this.h) && j5h.a("jingxuan", this.h)) {
            TabManager.TabUp tabUp = new TabManager.TabUp();
            tabUp.name = "发现";
            tabUp.channelId = 0;
            tabUp.channelType = "jingxuan";
            arrayList.add(tabUp);
        }
        return arrayList;
    }

    public final LiveListRequest P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveListRequest) ipChange.ipc$dispatch("b2aa2afd", new Object[]{this});
        }
        LiveListRequest liveListRequest = new LiveListRequest();
        this.O = liveListRequest;
        liveListRequest.s = 0L;
        if (p0.i(this.p.f(), this.p.t(), this.z)) {
            this.O.n = 7L;
        } else {
            this.O.n = 20L;
        }
        LiveListRequest liveListRequest2 = this.O;
        liveListRequest2.moduleIndex = 0;
        liveListRequest2.appVersion = TaoLiveHomePageX.getAppVersion(null);
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            this.O.contentId = jSONObject.getString("contentId");
            this.O.subContentId = this.n.getString(yj4.PARAM_SUB_CONTENT_ID);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AB2025", (Object) this.p.t());
        jSONObject2.put("realS", (Object) 0);
        if (nvs.h()) {
            jSONObject2.put("needFollowRecentWatch", (Object) "true");
        }
        if (nvs.v0()) {
            jSONObject2.put("enableNewSmartCard", (Object) "true");
        }
        this.O.clientParam = jSONObject2.toJSONString();
        this.O.extendParams = JSON.toJSONString(js8.c(getContext(), this.p, this.m));
        this.O.extendCommonParams = JSON.toJSONString(js8.b(getContext(), this.p));
        return this.O;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        if (this.Q && this.P) {
            if (this.y.equals("followTab")) {
                p9m.e("tbLiveNewChannel_selectedfollowTab");
            } else {
                this.z = "all";
            }
            if (this.N == null) {
                this.N = R3(getArguments(), S3(getArguments()));
            }
            this.N.n(this.z);
            if (this.t != null) {
                if (sj7.a()) {
                    i = 800;
                } else {
                    i = sj7.t() ? 100 : 600;
                }
                this.t.postDelayed(new a(), i);
                return;
            }
            this.N.o(false, this.z);
        }
    }

    @Override // tb.nlc
    public void onLiveEvent(String str, Object obj) {
        HomeMainSecondFragment homeMainSecondFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.main.follow.number.changed".equals(str)) {
            if ((obj instanceof JSONObject) && !lrq.a(this.h) && this.y.equals("jingxuan")) {
                this.W = (JSONObject) obj;
            }
        } else if ("com.taobao.taolive.main.card.feedback".equals(str)) {
            FeedbackCtrl feedbackCtrl = this.Y;
            if (feedbackCtrl != null && (obj instanceof DXRootView)) {
                feedbackCtrl.showFeedBackView(getContext(), (DXRootView) obj);
                b0h b0hVar = this.p;
                if (b0hVar != null && b0hVar.r() != null) {
                    this.p.r().h();
                }
            }
        } else if (j5h.a("com.taobao.taolive.faxian.insertCard", str)) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                HomeMainSecondFragment homeMainSecondFragment2 = this.b0;
                if (homeMainSecondFragment2 != null) {
                    homeMainSecondFragment2.A3(jSONObject);
                }
            }
        } else if ("com.taobao.taolive.login.success".equals(str) && Login.checkSessionValid() && this.D != null && this.R != null && (homeMainSecondFragment = this.b0) != null && homeMainSecondFragment.f3().equals("subChannelFollow")) {
            this.N.u(this.b0.f3(), this.O);
            this.N.o(true, this.b0.f3());
        }
    }

    public void p0(int i) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec0d40b", new Object[]{this, new Integer(i)});
            return;
        }
        this.D.setCurrentItem(i);
        HomeMainSecondFragment K3 = K3(i);
        this.b0 = K3;
        if (K3 != null) {
            K3.t3();
            if (!TextUtils.isEmpty(this.b0.f3()) && this.b0.f3().equals("subChannelFollow") && (frameLayout = this.A) != null) {
                U3(-frameLayout.getHeight());
            }
            if (!this.b0.h3() && this.T != i) {
                if (!this.b0.f3().equals("subChannelFollow") || Login.checkSessionValid()) {
                    LiveListRequest liveListRequest = this.O;
                    liveListRequest.contentId = "";
                    liveListRequest.subContentId = "";
                    this.N.u(this.b0.f3(), this.O);
                    this.N.o(true, this.b0.f3());
                } else {
                    Login.login(true);
                    return;
                }
            }
            this.T = i;
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public Map<String, String> p2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap(1);
        List<TabManager.TabUp> list = this.a0;
        if (list != null && list.size() > 1) {
            TabManager.TabUp tabUp = this.a0.get(1);
            if (tabUp != null) {
                str = tabUp.spm;
            } else {
                str = "";
            }
            if (str != null) {
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("spm-url", str);
                s2(hashMap2);
                hashMap.put("spm-cnt", str);
            }
            b0h b0hVar = this.p;
            if (b0hVar != null) {
                hashMap.put("entryLiveSource", b0hVar.f);
                hashMap.put("entrySpm", this.p.g);
            }
            hashMap.put("pad", sj7.w(this.f10969a) + "");
            hashMap.put(ytc.TYPE_FOLD, sj7.s(this.f10969a) + "");
        }
        return hashMap;
    }

    public final List<TabManager.TabUp> L3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2fbe61df", new Object[]{this});
        }
        List<TabManager.TabUp> list = this.Z.topTab;
        if (list == null) {
            list = M3();
        }
        if (list.size() > 2) {
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if ("singleLiveTab".equals(list.get(i).channelType)) {
                    list.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
        return list;
    }
}
