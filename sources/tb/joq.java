package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.homepage.dinamic3.view.HStretchView;
import com.taobao.homepage.page.weexv2.WeexSecondFloorFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class joq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f22122a;
    public FrameLayout b;
    public FrameLayout c;
    public FrameLayout d;
    public final wcc e;
    public final Activity f;
    public WeexSecondFloorFragment g;
    public WeakReference<Bitmap> h;
    public WeakReference<Fragment> i;
    public HImageView j;
    public HStretchView k;
    public HImageView l;
    public double m;
    public double n;
    public double o;

    static {
        t2o.a(729810309);
    }

    public joq(View view, wcc wccVar, Activity activity) {
        this.e = wccVar;
        this.f22122a = view;
        this.f = activity;
    }

    public final void a(WeexSecondFloorFragment weexSecondFloorFragment, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7e09c2", new Object[]{this, weexSecondFloorFragment, frameLayout});
            return;
        }
        Fragment currentFragment = TBMainHost.b().getCurrentFragment();
        if (!(currentFragment instanceof HomepageFragment)) {
            bqa.d("StraightSecondFloorWidget", "addWeexFragmentToContainer 当前不是首页");
            return;
        }
        WeakReference<Fragment> weakReference = this.i;
        if (weakReference == null || weakReference.get() == null) {
            this.i = new WeakReference<>(currentFragment);
        }
        FragmentTransaction beginTransaction = currentFragment.getChildFragmentManager().beginTransaction();
        beginTransaction.add(frameLayout.getId(), weexSecondFloorFragment);
        beginTransaction.commitAllowingStateLoss();
    }

    public final void b(int i, float f) {
        FrameLayout frameLayout;
        float f2;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa6adc9", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        double d2 = f;
        float f3 = (float) (0.05d * d2);
        float f4 = i;
        if (f4 > f3 && (frameLayout = this.b) != null) {
            float f5 = (f4 - f3) / (f - f3);
            frameLayout.setAlpha(f5);
            float f6 = (float) ((f5 * 0.3d) + 0.7d);
            if (f6 > 0.95d) {
                this.b.setScaleX(1.0f);
                this.b.setScaleY(1.0f);
            } else {
                this.b.setScaleX(f6);
                this.b.setScaleY(f6);
            }
            if (d2 * 0.6d >= i) {
                this.b.setTranslationY((-((float) ((((float) (f2 / (d - f3))) * (-0.2d)) + 0.2d))) * f);
            } else {
                this.b.setTranslationY(0.0f);
            }
        }
    }

    public final void c(int i, float f) {
        float f2;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23abe661", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.l == null) {
            bqa.d("StraightSecondFloorWidget", "mWeexShadeView == null");
        } else {
            IPullDownService iPullDownService = (IPullDownService) this.e.a(IPullDownService.class);
            if (iPullDownService == null) {
                bqa.d("StraightSecondFloorWidget", "pullDownUpManager == null");
                return;
            }
            float distanceToSecondFloor = iPullDownService.getDistanceToSecondFloor();
            if (i <= distanceToSecondFloor) {
                double d2 = this.m;
                d = d2 - (((d2 - this.n) * i) / distanceToSecondFloor);
            } else {
                double d3 = this.n;
                double d4 = d3 - (((d3 - this.o) * (f2 - distanceToSecondFloor)) / (f - distanceToSecondFloor));
                d = d4 < 0.05d ? vu3.b.GEO_NOT_SUPPORT : d4;
            }
            this.l.setAlpha((float) d);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d786a", new Object[]{this});
        } else if (this.h != null) {
            bqa.d("StraightSecondFloorWidget", "clearSplashBitmap");
            this.h.clear();
        }
    }

    public final HStretchView e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HStretchView) ipChange.ipc$dispatch("137c4bcf", new Object[]{this});
        }
        HStretchView hStretchView = new HStretchView(this.f);
        hStretchView.setScaleType(ImageView.ScaleType.FIT_XY);
        String b = i7p.b();
        if (!TextUtils.isEmpty(b)) {
            hStretchView.setImageUrl(b);
        }
        return hStretchView;
    }

    public final HImageView f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("abe6fa05", new Object[]{this});
        }
        HImageView hImageView = new HImageView(this.f);
        hImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        hImageView.setBackgroundColor(Color.parseColor("#F2F2F2"));
        WeakReference<Bitmap> weakReference = this.h;
        if (weakReference == null || weakReference.get() == null) {
            try {
                IBGContainerService iBGContainerService = (IBGContainerService) this.e.a(IBGContainerService.class);
                IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) this.e.a(IHomeSearchBarService.class);
                if (!(iBGContainerService == null || iHomeSearchBarService == null)) {
                    int currentSearchContainerHeightPX = iHomeSearchBarService.getCurrentSearchContainerHeightPX();
                    Bitmap bGContainerScreenShot = iBGContainerService.getBGContainerScreenShot();
                    Bitmap createBitmap = Bitmap.createBitmap(bGContainerScreenShot, 0, currentSearchContainerHeightPX, bGContainerScreenShot.getWidth(), bGContainerScreenShot.getHeight() - currentSearchContainerHeightPX);
                    this.h = new WeakReference<>(createBitmap);
                    hImageView.setImageBitmap(createBitmap);
                }
            } catch (Exception e) {
                bqa.d("StraightSecondFloorWidget", "createSecondFloorCoverImage：" + e);
            }
            return hImageView;
        }
        hImageView.setImageBitmap(this.h.get());
        return hImageView;
    }

    public final WeexSecondFloorFragment g(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexSecondFloorFragment) ipChange.ipc$dispatch("bf6eb4aa", new Object[]{this, h7pVar});
        }
        String m = i7p.m(h7pVar.e());
        WeexSecondFloorFragment c3 = WeexSecondFloorFragment.c3(i7p.i(m), m, h7pVar.b(), h7pVar.a());
        c3.Q2(new jwh((AppCompatActivity) this.f));
        c3.T2(new kcj(this.e));
        return c3;
    }

    public final HImageView h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("d635bfb", new Object[]{this});
        }
        HImageView hImageView = new HImageView(this.f);
        hImageView.setBackgroundColor(-1);
        hImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        hImageView.setVisibility(0);
        String c = i7p.c();
        if (!TextUtils.isEmpty(c)) {
            hImageView.setImageUrl(c);
        }
        return hImageView;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            l();
        }
    }

    public void j(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24c7ca", new Object[]{this, new Integer(i), str, jSONObject});
        } else if (this.g == null) {
            bqa.d("StraightSecondFloorWidget", "mWeexFragment == null");
        } else {
            bqa.d("StraightSecondFloorWidget", "dispatchEvent,eventName: " + str);
            this.g.p2(i, str, jSONObject);
        }
    }

    public void l() {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.g == null || n()) {
            bqa.d("StraightSecondFloorWidget", "hide mWeexFragment == null 或者有容器没有初始化，mWeexFragment: " + this.g);
        } else {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.d.removeAllViews();
            this.c.removeView(this.l);
            WeakReference<Fragment> weakReference = this.i;
            if (weakReference == null || weakReference.get() == null) {
                fragment = TBMainHost.b().getCurrentFragment();
            } else {
                fragment = this.i.get();
            }
            if (fragment instanceof HomepageFragment) {
                FragmentTransaction beginTransaction = fragment.getChildFragmentManager().beginTransaction();
                beginTransaction.remove(this.g);
                beginTransaction.commitAllowingStateLoss();
                this.g = null;
                bqa.d("StraightSecondFloorWidget", "hide");
            }
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478a599c", new Object[]{this})).booleanValue();
        }
        if (this.b == null || this.c == null || this.d == null) {
            return true;
        }
        return false;
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f78be42", new Object[]{this, new Integer(i)});
        } else if (n()) {
            bqa.d("StraightSecondFloorWidget", "pullDistance 当前有容器没有初始化");
        } else {
            float f = owo.f(this.f);
            b(i, f);
            c(i, f);
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) this.e.a(IHomeSearchBarService.class);
            HImageView hImageView = this.j;
            if (!(hImageView == null || iHomeSearchBarService == null)) {
                hImageView.setTranslationY(iHomeSearchBarService.getCurrentSearchContainerHeightPX() + i);
            }
            HStretchView hStretchView = this.k;
            if (hStretchView != null && iHomeSearchBarService != null) {
                hStretchView.setTranslationY((i + iHomeSearchBarService.getCurrentSearchContainerHeightPX()) - owo.b(this.f, 30.0f));
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f4536a", new Object[]{this});
            return;
        }
        this.m = i7p.l();
        this.n = i7p.k();
        this.o = i7p.j();
    }

    public final void q(h7p h7pVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5507c7a9", new Object[]{this, h7pVar, view});
        } else {
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{h7pVar.d(), h7pVar.c()}));
        }
    }

    public void s() {
        WeexSecondFloorFragment weexSecondFloorFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360cf3f3", new Object[]{this});
        } else if (n()) {
            bqa.d("StraightSecondFloorWidget", "stateToSecondFloor 当前容器没有初始化");
        } else {
            HImageView hImageView = this.l;
            if (hImageView != null) {
                hImageView.setVisibility(8);
            }
            FrameLayout frameLayout = this.b;
            if (frameLayout != null) {
                frameLayout.setScaleX(1.0f);
                this.b.setScaleY(1.0f);
                this.b.setAlpha(1.0f);
                if (h8x.c() && (weexSecondFloorFragment = this.g) != null) {
                    weexSecondFloorFragment.b3();
                }
            }
            this.d.setVisibility(8);
            bqa.d("StraightSecondFloorWidget", "在二楼");
        }
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eea73046", new Object[]{this})).intValue();
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) this.e.a(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            return 0;
        }
        int currentSearchContainerHeightPX = iHomeSearchBarService.getCurrentSearchContainerHeightPX();
        if (currentSearchContainerHeightPX == 0) {
            hrg.a("componentRender", "secondFloorRenderFailed", "1.0", "Page_Home", null, null, "二楼渲染异常", "searchBarContainerHeight == 0");
        }
        return pb6.r(this.f) - currentSearchContainerHeightPX;
    }

    public void r(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744feb51", new Object[]{this, h7pVar});
        } else if (h7pVar == null || !h7pVar.f()) {
            bqa.d("StraightSecondFloorWidget", "show secondFloorConfig == null");
        } else if (this.g != null) {
            bqa.d("StraightSecondFloorWidget", "show mWeexFragment != null");
        } else if (!m()) {
            bqa.d("StraightSecondFloorWidget", "show mWeexFragment 初始化失败了");
        } else {
            WeexSecondFloorFragment g = g(h7pVar);
            this.g = g;
            a(g, this.b);
            q(h7pVar, this.c);
            HImageView f = f();
            this.j = f;
            this.d.addView(f, new ViewGroup.LayoutParams(-1, k()));
            HImageView h = h();
            this.l = h;
            this.c.addView(h, new ViewGroup.LayoutParams(-1, -1));
            this.k = e();
            this.d.addView(this.k, new ViewGroup.LayoutParams(-1, owo.b(this.f, 30.0f)));
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            p();
            bqa.d("StraightSecondFloorWidget", "show");
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede19b", new Object[]{this})).booleanValue();
        }
        if (!n()) {
            return true;
        }
        try {
            this.b = (FrameLayout) this.f22122a.findViewById(R.id.homepage_container_second_floor);
            this.c = (FrameLayout) this.f22122a.findViewById(R.id.layout_home_weex_container);
            this.d = (FrameLayout) this.f22122a.findViewById(R.id.layout_second_floor_cover);
            return true;
        } catch (Exception e) {
            bqa.d("StraightSecondFloorWidget", "初始化异常");
            ddv.a("secondFloor", e);
            return false;
        }
    }
}
