package tb;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.speed.SpeedFrameLayout;
import com.taobao.homepage.view.widgets.HomeSwipeRefreshLayout;
import com.taobao.tao.topmultitab.service.bgcontainer.BGContainerView;
import com.taobao.tao.topmultitab.service.searchbar.impl.bgview.HomeSearchBarBgView;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x2b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31098a;

        public a(Context context) {
            this.f31098a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            phg.k("preloadIDResource");
            phg.e("r_color_init");
            int i = R.color.homepage_background;
            phg.d("r_color_init");
            phg.e("getDrawable");
            this.f31098a.getResources().getDrawable(i, null);
            phg.d("getDrawable");
            phg.j("preloadIDResource");
        }
    }

    static {
        t2o.a(729809356);
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03714f", new Object[]{context});
        } else {
            new Thread(new a(context), "preloadIDResource").start();
        }
    }

    public final BGContainerView a(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BGContainerView) ipChange.ipc$dispatch("340fb512", new Object[]{this, context, layoutParams});
        }
        BGContainerView bGContainerView = new BGContainerView(context);
        bGContainerView.setLayoutParams(layoutParams);
        bGContainerView.setId(R.id.home_bg_container);
        bqa.d("optimize", "设置 R.id.home_bg_container");
        return bGContainerView;
    }

    public final ViewStub b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("b20970ca", new Object[]{this, context});
        }
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 5;
        layoutParams.leftMargin = DensityUtil.dip2px(context, 40.0f);
        layoutParams.topMargin = DensityUtil.dip2px(context, 40.0f);
        layoutParams.rightMargin = DensityUtil.dip2px(context, 24.0f);
        viewStub.setLayoutParams(layoutParams);
        viewStub.setId(R.id.home_edition_tips_base);
        viewStub.setLayoutResource(R.layout.home_edition_tips_base);
        viewStub.setVisibility(8);
        return viewStub;
    }

    public final ViewStub c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("10cf2789", new Object[]{this, context});
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.home_edition_tips_old);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.leftMargin = DensityUtil.dip2px(context, 70.0f);
        layoutParams.topMargin = DensityUtil.dip2px(context, 45.0f);
        layoutParams.rightMargin = DensityUtil.dip2px(context, 50.0f);
        viewStub.setLayoutParams(layoutParams);
        viewStub.setLayoutResource(R.layout.home_edition_tips_old);
        viewStub.setVisibility(8);
        return viewStub;
    }

    public final FrameLayout d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7e517a26", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.homepage_float_header);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public final RelativeLayout e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("93fb8100", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        relativeLayout.setId(R.id.search_bar_container);
        relativeLayout.setBackgroundResource(17170445);
        View homeSearchBarBgView = new HomeSearchBarBgView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        homeSearchBarBgView.setLayoutParams(layoutParams);
        homeSearchBarBgView.setId(R.id.search_bg_view);
        homeSearchBarBgView.setVisibility(8);
        relativeLayout.addView(homeSearchBarBgView);
        return relativeLayout;
    }

    public final HomeSwipeRefreshLayout f(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSwipeRefreshLayout) ipChange.ipc$dispatch("ead01a29", new Object[]{this, context, layoutParams});
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = new HomeSwipeRefreshLayout(context);
        homeSwipeRefreshLayout.setLayoutParams(layoutParams);
        homeSwipeRefreshLayout.setId(R.id.home_swipe_refresh);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(R.id.rv_main_container_wrapper);
        homeSwipeRefreshLayout.addView(frameLayout);
        return homeSwipeRefreshLayout;
    }

    public final FrameLayout g(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("fc1c1f5c", new Object[]{this, context, layoutParams});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.layout_home_weex_container);
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setId(R.id.homepage_container_second_floor);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public final LinearLayout h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("b9bc804c", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.homepage_bottom_container);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    public final ViewStub i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("e9a84944", new Object[]{this, context});
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.homepage_tip);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, DensityUtil.dip2px(context, 52.0f));
        layoutParams.topMargin = DensityUtil.dip2px(context, 48.0f);
        viewStub.setLayoutParams(layoutParams);
        viewStub.setLayoutResource(R.layout.home_shake_view);
        viewStub.setVisibility(8);
        return viewStub;
    }

    public FrameLayout k(Context context) {
        FrameLayout frameLayout;
        ViewStub viewStub;
        ViewStub viewStub2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("822591db", new Object[]{this, context});
        }
        boolean b = vxl.b().b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout j = j(context, layoutParams);
        phg.m("layoutHomeWeexContainer");
        FrameLayout g = g(context, layoutParams);
        phg.l("layoutHomeWeexContainer");
        phg.m("homeBgContainer");
        BGContainerView a2 = a(context, layoutParams);
        phg.l("homeBgContainer");
        phg.m("layoutSecondFloorCover");
        FrameLayout l = l(context, layoutParams);
        phg.l("layoutSecondFloorCover");
        phg.m("homeSwipeRefreshLayout");
        HomeSwipeRefreshLayout f = f(context, layoutParams);
        phg.l("homeSwipeRefreshLayout");
        LinearLayout linearLayout = null;
        if (!b) {
            phg.m("homepageFloatHeader");
            frameLayout = d(context);
            phg.l("homepageFloatHeader");
        } else {
            frameLayout = null;
        }
        phg.m("svSearchView");
        RelativeLayout e = e(context);
        phg.l("svSearchView");
        if (!b) {
            phg.m("editionTipsBase");
            viewStub2 = b(context);
            phg.l("editionTipsBase");
            phg.m("homeEditionTipsOld");
            viewStub = c(context);
            phg.l("homeEditionTipsOld");
        } else {
            viewStub2 = null;
            viewStub = null;
        }
        if (!b) {
            phg.m("homepageBottomContainer");
            linearLayout = h(context);
            phg.l("homepageBottomContainer");
        }
        phg.m("homepageTip");
        ViewStub i = i(context);
        phg.l("homepageTip");
        j.addView(g);
        j.addView(a2);
        j.addView(l);
        j.addView(f);
        if (frameLayout != null) {
            j.addView(frameLayout);
        }
        j.addView(e);
        if (viewStub2 != null) {
            j.addView(viewStub2);
            j.addView(viewStub);
        }
        if (linearLayout != null) {
            j.addView(linearLayout);
        }
        j.addView(i);
        return j;
    }

    public final FrameLayout l(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("175ad3a6", new Object[]{this, context, layoutParams});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.layout_second_floor_cover);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public final FrameLayout j(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c93d9c39", new Object[]{this, context, layoutParams});
        }
        SpeedFrameLayout speedFrameLayout = new SpeedFrameLayout(context);
        speedFrameLayout.setLayoutParams(layoutParams);
        phg.e("init_R");
        speedFrameLayout.setId(R.id.homepage_root_layout);
        phg.d("init_R");
        phg.e("setImportantForAccessibility");
        speedFrameLayout.setImportantForAccessibility(1);
        phg.d("setImportantForAccessibility");
        phg.e("setBackgroundResource");
        speedFrameLayout.setBackgroundResource(R.color.homepage_background);
        phg.d("setBackgroundResource");
        return speedFrameLayout;
    }
}
