package tb;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils;
import com.taobao.taobao.R;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g6b implements kdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f19751a;
    public final Context b;
    public View c;
    public View d;
    public final FrameLayout e;
    public final LiveLottieAnimationView g;
    public int i;
    public final AnimationUtils f = new AnimationUtils(this);
    public long h = 0;
    public final Runnable l = new b();
    public final Handler j = new Handler(Looper.getMainLooper());
    public final boolean k = nh4.j();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            g6b g6bVar = g6b.this;
            g6b.i(g6bVar, "lottie 下载失败：" + th.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g6b.j(g6b.this).highAtmosphereOnHideAnimation();
            }
        }
    }

    static {
        t2o.a(295699151);
        t2o.a(295699154);
    }

    public g6b(xea xeaVar, Context context, FrameLayout frameLayout, int i) {
        this.i = 0;
        this.f19751a = xeaVar;
        this.b = context;
        this.e = frameLayout;
        frameLayout.removeAllViews();
        this.i = i;
        LiveLottieAnimationView liveLottieAnimationView = new LiveLottieAnimationView(context);
        this.g = liveLottieAnimationView;
        liveLottieAnimationView.setId(R.id.animated_icon_flexallocal);
        liveLottieAnimationView.setAnimationFromUrl(yga.i0());
        liveLottieAnimationView.setRepeatCount(-1);
        liveLottieAnimationView.setShouldUseEnvironmentAwareness(vwl.e().b());
        liveLottieAnimationView.setFailureListener(new a());
    }

    public static /* synthetic */ void i(g6b g6bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc45962", new Object[]{g6bVar, str});
        } else {
            g6bVar.q(str);
        }
    }

    public static /* synthetic */ AnimationUtils j(g6b g6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationUtils) ipChange.ipc$dispatch("7df30d63", new Object[]{g6bVar});
        }
        return g6bVar.f;
    }

    @Override // tb.kdc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb8aba0", new Object[]{this});
        } else if (this.i == 0) {
            k();
        } else {
            t(true);
            o();
            View n = n();
            if (n.getParent() == null) {
                this.e.addView(n);
            }
            try {
                LiveLottieAnimationView liveLottieAnimationView = (LiveLottieAnimationView) this.c.findViewById(R.id.animated_icon_flexallocal);
                xea xeaVar = this.f19751a;
                if (!(xeaVar == null || xeaVar.q() == null)) {
                    liveLottieAnimationView.setAnimationName("AnimationLifeCycle/LowAtmosphere");
                    liveLottieAnimationView.setFrameContext(this.f19751a.q());
                    liveLottieAnimationView.playAnimation();
                }
            } catch (Exception e) {
                q(e.getMessage());
            }
            d();
            v(false);
        }
    }

    @Override // tb.kdc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3962ce8b", new Object[]{this});
            return;
        }
        t(false);
        o();
        p();
        this.j.removeCallbacks(this.l);
        this.f.destroy();
    }

    @Override // tb.kdc
    public void d() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbba6d7", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null && (textView = (TextView) view.findViewById(R.id.tv_items)) != null) {
            textView.setText(this.b.getString(R.string.taolive_project_show_case_atmosphere_prefix) + l());
        }
    }

    @Override // tb.kdc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        t(false);
        this.g.cancelAnimation();
        if (this.g.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.g.getParent()).removeView(this.g);
        }
        this.f.destroy();
        this.j.removeCallbacks(this.l);
        this.d = null;
        this.c = null;
        this.e.removeAllViews();
    }

    @Override // tb.kdc
    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b67a61", new Object[]{this, new Integer(i)})).intValue();
        }
        return nw0.d(this.b, i);
    }

    @Override // tb.kdc
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdc85af", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // tb.kdc
    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bd3a9f1f", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.kdc
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.i;
    }

    @Override // tb.kdc
    public void h() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e060c471", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null && (textView = (TextView) view.findViewById(R.id.tv_items)) != null) {
            textView.setText(this.b.getString(R.string.taolive_project_show_case_atmosphere_prefix) + l());
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.i = 0;
        c();
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85d0d4f5", new Object[]{this});
        }
        int i = this.i;
        if (i <= 5000) {
            return String.valueOf(i);
        }
        if (i < 10000) {
            return (this.i / 1000) + "000+";
        } else if (i >= 100000) {
            return "10万+";
        } else {
            return (this.i / 10000) + "万+";
        }
    }

    public View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("29b82ae8", new Object[]{this});
        }
        if (this.d == null) {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.layout_hot_atmosphere_high_flexalocal, (ViewGroup) null);
            this.d = inflate;
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.iv_background);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(yga.g0());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) this.d.findViewById(R.id.iv_title);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(yga.h0());
            }
        }
        if (this.g.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.g.getParent()).removeView(this.g);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e(80), e(ra.INSTALL_PROVIDER));
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = e(-9);
        ((FrameLayout) this.d).addView(this.g, 1, layoutParams);
        return this.d;
    }

    public View n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23402dee", new Object[]{this});
        }
        if (this.c == null) {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.layout_hot_atmosphere_low_flexalocal, (ViewGroup) null);
            this.c = inflate;
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.iv_background);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(yga.j0());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) this.c.findViewById(R.id.iv_title);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(yga.k0());
            }
        }
        if (this.g.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.g.getParent()).removeView(this.g);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e(28), e(31));
        layoutParams.gravity = 83;
        ((FrameLayout) this.c).addView(this.g, layoutParams);
        return this.c;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ef33cd", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null) {
            try {
                ((LiveLottieAnimationView) view.findViewById(R.id.animated_icon_flexallocal)).cancelAnimation();
                if (this.d.getParent() != null) {
                    this.e.removeView(this.d);
                }
            } catch (Exception e) {
                q(e.getMessage());
            }
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4133dbfb", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            try {
                ((LiveLottieAnimationView) view.findViewById(R.id.animated_icon_flexallocal)).cancelAnimation();
                if (this.c.getParent() != null) {
                    this.e.removeView(this.c);
                }
            } catch (Exception e) {
                q(e.getMessage());
            }
        }
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{this, str});
        } else {
            v2s.o().A().c("HotAtmosphere", str);
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a59b3", new Object[]{this, new Integer(i)});
            return;
        }
        this.j.removeCallbacks(this.l);
        this.f.animateScrollHotAtmosphere(i);
        this.j.postDelayed(this.l, TimeUnit.SECONDS.toMillis(6L) + ((i - this.i) * 250));
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdf83ba", new Object[]{this, new Integer(i)});
        } else {
            this.f.animateScrollScrollLowAtmosphere(i);
        }
    }

    @Override // tb.kdc
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }

    public final void t(boolean z) {
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e772f74b", new Object[]{this, new Boolean(z)});
        } else if (this.k && (xeaVar = this.f19751a) != null && xeaVar.q() != null && this.f19751a.q().j() != null) {
            this.f19751a.q().j().I("showHotAtmosphere", Boolean.valueOf(z));
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0458c8", new Object[]{this});
        } else if (this.i == 0) {
            k();
        } else {
            t(true);
            this.j.removeCallbacks(this.l);
            p();
            View m = m();
            if (m.getParent() == null) {
                this.e.addView(m);
            }
            try {
                LiveLottieAnimationView liveLottieAnimationView = (LiveLottieAnimationView) this.d.findViewById(R.id.animated_icon_flexallocal);
                xea xeaVar = this.f19751a;
                if (!(xeaVar == null || xeaVar.q() == null)) {
                    liveLottieAnimationView.setFrameContext(this.f19751a.q());
                    liveLottieAnimationView.setAnimationName("AnimationLifeCycle/HighAtmosphere");
                    liveLottieAnimationView.playAnimation();
                }
            } catch (Exception e) {
                q(e.getMessage());
            }
            h();
            Animator highAtmosphereOnShowAnimation = this.f.highAtmosphereOnShowAnimation();
            if (highAtmosphereOnShowAnimation != null) {
                highAtmosphereOnShowAnimation.start();
            }
            v(true);
            this.j.postDelayed(this.l, TimeUnit.SECONDS.toMillis(6L));
        }
    }

    public final void v(boolean z) {
        LiveItem liveItem;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109128be", new Object[]{this, new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ((LinearLayout) this.e.getParent()).findViewById(R.id.fl_show_case_card);
        if (frameLayout.getChildCount() > 0 && (frameLayout.getChildAt(0) instanceof DXRootView) && (jSONObject = (liveItem = (LiveItem) fkx.f(((DXRootView) frameLayout.getChildAt(0)).getData().toJSONString(), LiveItem.class)).nativeConfigInfos) != null) {
            jSONObject.put("onHotAtmosphere", (Object) String.valueOf(z));
            sjr.g().c("com.taobao.taolive.goods.showcase.update", liveItem, xea.E(this.f19751a));
        }
    }

    @Override // tb.kdc
    public void a(long j, int i, int i2) {
        View view;
        View view2;
        View view3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ee4dd0", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)});
        } else if (i <= this.i && j == this.h) {
        } else {
            if (i == 0) {
                k();
                return;
            }
            xea xeaVar = this.f19751a;
            if (!(xeaVar == null || xeaVar.q() == null || this.f19751a.q().w() == null)) {
                this.f19751a.q().w().a("hasShowSmallHotAtmosphere", "true");
            }
            if (this.i == 0 || ((((view = this.d) == null || view.getParent() == null) && ((view3 = this.c) == null || view3.getParent() == null)) || j != this.h)) {
                this.h = j;
                this.i = i;
                if (i > 100) {
                    u();
                } else {
                    b();
                }
            } else {
                int i3 = this.i;
                int i4 = i - i3;
                if ((i / 100) - (i3 / 100) > 0 || !((view2 = this.d) == null || view2.getParent() == null)) {
                    u();
                    if (i4 >= 20) {
                        this.i = i - 10;
                    }
                    r(i);
                    return;
                }
                if (i4 >= 20) {
                    this.i = i - 10;
                }
                s(i);
            }
        }
    }
}
