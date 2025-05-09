package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.widget.titlebar.Irp2024TitleBarWidget;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.dmf;
import tb.ylf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class anf extends ViewWidget<ScrollInterceptView, IrpDatasource, anf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ScrollInterceptView.b l;
    public final ylf.a m;
    public final dmf.a n;
    public boolean o;
    public FrameLayout p;
    public View q;
    public TUrlImageView r;
    public View s;
    public hmf t;
    public ylf u;
    public LottieAnimationView v;
    public boolean w = true;
    public boolean x;
    public boolean y;
    public float z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements ulh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f15876a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f15876a = lottieAnimationView;
        }

        @Override // tb.ulh
        public final void onCompositionLoaded(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0909eda", new Object[]{this, kkhVar});
            } else {
                this.f15876a.playAnimation();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            ylf j0 = anf.j0(anf.this);
            if (j0 != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, j0.l0());
                FrameLayout l0 = anf.l0(anf.this);
                if (l0 != null) {
                    l0.addView(view, layoutParams);
                    FrameLayout l02 = anf.l0(anf.this);
                    if (l02 != null) {
                        return l02;
                    }
                    ckf.y("mainContainerParent");
                    throw null;
                }
                ckf.y("mainContainerParent");
                throw null;
            }
            ckf.y("irpTitleBarWidget");
            throw null;
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout l0 = anf.l0(anf.this);
            if (l0 != null) {
                l0.removeView(view);
                FrameLayout l02 = anf.l0(anf.this);
                if (l02 != null) {
                    return l02;
                }
                ckf.y("mainContainerParent");
                throw null;
            }
            ckf.y("mainContainerParent");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements ScrollInterceptView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.a
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("81a01aca", new Object[]{this})).booleanValue();
            }
            if (anf.k0(anf.this)) {
                return false;
            }
            ylf j0 = anf.j0(anf.this);
            if (j0 == null) {
                ckf.y("irpTitleBarWidget");
                throw null;
            } else if (j0.s0()) {
                return false;
            } else {
                hmf i0 = anf.i0(anf.this);
                if (i0 != null) {
                    return i0.k0();
                }
                ckf.y("irpHybridWidget");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScrollInterceptView f15880a;

        public g(ScrollInterceptView scrollInterceptView) {
            this.f15880a = scrollInterceptView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i8 - i6 != i4 - i2 && this.f15880a.getChildState() == 0) {
                ScrollInterceptView scrollInterceptView = this.f15880a;
                scrollInterceptView.moveChildTo(scrollInterceptView.getDownStateOffset());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/IrpScrollInterceptWidget$operateBgCorner$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (outline != null) {
                if (view == null) {
                    i = 0;
                } else {
                    i = view.getWidth();
                }
                if (view == null) {
                    i2 = 0;
                } else {
                    i2 = view.getHeight();
                }
                outline.setRoundRect(0, 0, i, i2, p1p.b(6.5f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public i(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FrameLayout l0 = anf.l0(anf.this);
            if (l0 != null) {
                FrameLayout l02 = anf.l0(anf.this);
                if (l02 != null) {
                    int paddingLeft = l02.getPaddingLeft();
                    int i = this.b;
                    FrameLayout l03 = anf.l0(anf.this);
                    if (l03 != null) {
                        int paddingRight = l03.getPaddingRight();
                        FrameLayout l04 = anf.l0(anf.this);
                        if (l04 != null) {
                            l0.setPadding(paddingLeft, i, paddingRight, l04.getPaddingBottom());
                            View h0 = anf.h0(anf.this);
                            if (h0 != null) {
                                anf anfVar = anf.this;
                                int i2 = this.b;
                                FrameLayout l05 = anf.l0(anfVar);
                                if (l05 != null) {
                                    int height = l05.getHeight() - i2;
                                    if (!anf.n0(anfVar)) {
                                        ylf j0 = anf.j0(anfVar);
                                        if (j0 != null) {
                                            height -= j0.l0();
                                        } else {
                                            ckf.y("irpTitleBarWidget");
                                            throw null;
                                        }
                                    }
                                    ViewGroup.LayoutParams layoutParams = h0.getLayoutParams();
                                    layoutParams.height = height;
                                    h0.setLayoutParams(layoutParams);
                                    return;
                                }
                                ckf.y("mainContainerParent");
                                throw null;
                            }
                            return;
                        }
                        ckf.y("mainContainerParent");
                        throw null;
                    }
                    ckf.y("mainContainerParent");
                    throw null;
                }
                ckf.y("mainContainerParent");
                throw null;
            }
            ckf.y("mainContainerParent");
            throw null;
        }
    }

    static {
        t2o.a(481297205);
    }

    public static final /* synthetic */ View h0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9fb37ca1", new Object[]{anfVar});
        }
        return anfVar.s;
    }

    public static final /* synthetic */ hmf i0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmf) ipChange.ipc$dispatch("5e710cc2", new Object[]{anfVar});
        }
        return anfVar.t;
    }

    public static /* synthetic */ Object ipc$super(anf anfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/IrpScrollInterceptWidget");
    }

    public static final /* synthetic */ ylf j0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylf) ipChange.ipc$dispatch("4116d122", new Object[]{anfVar});
        }
        return anfVar.u;
    }

    public static final /* synthetic */ boolean k0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd48eea7", new Object[]{anfVar})).booleanValue();
        }
        return anfVar.o;
    }

    public static final /* synthetic */ FrameLayout l0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e19cd957", new Object[]{anfVar});
        }
        return anfVar.p;
    }

    public static final /* synthetic */ TUrlImageView m0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b69c010c", new Object[]{anfVar});
        }
        return anfVar.r;
    }

    public static final /* synthetic */ boolean n0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e34ce85", new Object[]{anfVar})).booleanValue();
        }
        return anfVar.w;
    }

    public static final /* synthetic */ boolean o0(anf anfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad9dae7", new Object[]{anfVar})).booleanValue();
        }
        return anfVar.x;
    }

    public static final /* synthetic */ void p0(anf anfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482a7435", new Object[]{anfVar, new Boolean(z)});
        } else {
            anfVar.L0(z);
        }
    }

    public static final /* synthetic */ void q0(anf anfVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177db0c7", new Object[]{anfVar, view});
        } else {
            anfVar.s = view;
        }
    }

    public final void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da039917", new Object[]{this});
            return;
        }
        hmf hmfVar = new hmf(E(), this, W(), new b(), this.n);
        this.t = hmfVar;
        ViewWidget.T(hmfVar, null, 1, null);
    }

    public final boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("706f726", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public final boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6cd452e", new Object[]{this})).booleanValue();
        }
        ScrollInterceptView X = X();
        if (X == null) {
            return false;
        }
        return X.isReachTop();
    }

    public final void F0(float f2, long j, hpk hpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69163639", new Object[]{this, new Float(f2), new Long(j), hpkVar});
            return;
        }
        ScrollInterceptView X = X();
        if (X != null) {
            X.movePageToAssignPageLocationRatioWithAnim(f2, j, hpkVar);
        }
    }

    public final void H0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
            return;
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            ylfVar.v0(num);
        } else {
            ckf.y("irpTitleBarWidget");
            throw null;
        }
    }

    public final void I0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95acc3a2", new Object[]{this, new Integer(i2)});
            return;
        }
        View view = this.q;
        if (view != null) {
            view.setBackgroundColor(i2);
        } else {
            ckf.y("titleBarBgView");
            throw null;
        }
    }

    public final void L0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e15c28", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Window window = E().getWindow();
            window.setStatusBarColor(Color.parseColor("#F3F6F8"));
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            }
        } else {
            Window window2 = E().getWindow();
            window2.setStatusBarColor(0);
            if (Build.VERSION.SDK_INT >= 23) {
                window2.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility() & (-8193));
            }
        }
    }

    public final void N0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc47e42a", new Object[]{this, new Integer(i2)});
        } else if (i2 > 0) {
            FrameLayout frameLayout = this.p;
            if (frameLayout != null) {
                frameLayout.post(new i(i2));
            } else {
                ckf.y("mainContainerParent");
                throw null;
            }
        }
    }

    public final void O0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2264df", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public final void P0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160e272a", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public final void Q0(g1a<? super MotionEvent, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e527663e", new Object[]{this, g1aVar});
            return;
        }
        ScrollInterceptView X = X();
        if (X != null) {
            X.setDispatchEventListener(g1aVar);
        }
    }

    public final void R0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd49b306", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o = z;
        ScrollInterceptView X = X();
        ckf.d(X);
        X.setViewLockUp(Boolean.valueOf(z));
    }

    public final void r0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55454bfe", new Object[]{this, new Boolean(z)});
            return;
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            ylfVar.D();
            FrameLayout frameLayout = this.p;
            if (frameLayout != null) {
                ylf ylfVar2 = this.u;
                if (ylfVar2 != null) {
                    frameLayout.removeView(ylfVar2.X());
                    FrameLayout frameLayout2 = this.p;
                    if (frameLayout2 != null) {
                        hmf hmfVar = this.t;
                        if (hmfVar != null) {
                            frameLayout2.removeView(hmfVar.X());
                            ScrollInterceptView X = X();
                            ckf.d(X);
                            C0(z, X);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            hmf hmfVar2 = this.t;
                            if (hmfVar2 != null) {
                                FrameLayout X2 = hmfVar2.X();
                                if (X2 != null) {
                                    ylf ylfVar3 = this.u;
                                    if (ylfVar3 != null) {
                                        X2.setTranslationY(ylfVar3.l0());
                                    } else {
                                        ckf.y("irpTitleBarWidget");
                                        throw null;
                                    }
                                }
                                FrameLayout frameLayout3 = this.p;
                                if (frameLayout3 != null) {
                                    hmf hmfVar3 = this.t;
                                    if (hmfVar3 != null) {
                                        frameLayout3.addView(hmfVar3.X(), layoutParams);
                                    } else {
                                        ckf.y("irpHybridWidget");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("mainContainerParent");
                                    throw null;
                                }
                            } else {
                                ckf.y("irpHybridWidget");
                                throw null;
                            }
                        } else {
                            ckf.y("irpHybridWidget");
                            throw null;
                        }
                    } else {
                        ckf.y("mainContainerParent");
                        throw null;
                    }
                } else {
                    ckf.y("irpTitleBarWidget");
                    throw null;
                }
            } else {
                ckf.y("mainContainerParent");
                throw null;
            }
        } else {
            ckf.y("irpTitleBarWidget");
            throw null;
        }
    }

    public final void s0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4028dd6", new Object[]{this, new Integer(i2)});
            return;
        }
        ScrollInterceptView X = X();
        ckf.d(X);
        X.flyChildTo(i2);
    }

    public final boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce5e0825", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public final float u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ffe4074", new Object[]{this})).floatValue();
        }
        return this.z;
    }

    public final float v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba889ec3", new Object[]{this})).floatValue();
        }
        ScrollInterceptView X = X();
        ckf.d(X);
        return X.getDownStateOffset();
    }

    public final hmf w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmf) ipChange.ipc$dispatch("31422f81", new Object[]{this});
        }
        hmf hmfVar = this.t;
        if (hmfVar != null) {
            return hmfVar;
        }
        ckf.y("irpHybridWidget");
        throw null;
    }

    public final ylf x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylf) ipChange.ipc$dispatch("e2052561", new Object[]{this});
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            return ylfVar;
        }
        ckf.y("irpTitleBarWidget");
        throw null;
    }

    public final String y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("222c9c9f", new Object[]{this});
        }
        ScreenType g2 = ScreenType.g(E());
        if (g2 == null) {
            return "https://g.alicdn.com/ani-assets/73f74cc0f46bd27a6056158fe4c7d703/0.0.1/lottie.json";
        }
        if (caa.s() && g2.c() == 3) {
            return "https://g.alicdn.com/ani-assets/7f87652353529bd5a5d34476e3f627a8/0.0.1/lottie.json";
        }
        if (!caa.t()) {
            return "https://g.alicdn.com/ani-assets/73f74cc0f46bd27a6056158fe4c7d703/0.0.1/lottie.json";
        }
        if (g2.c() == 2) {
            return "https://g.alicdn.com/ani-assets/0c9f0828a319252ecb391debaf34d201/0.0.1/lottie.json";
        }
        return "https://g.alicdn.com/ani-assets/bb330b24257c3a2bd53a5bce17749f37/0.0.1/lottie.json";
    }

    public final void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47d4b6d", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.v;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            LottieAnimationView lottieAnimationView2 = this.v;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setVisibility(8);
            } else {
                ckf.y("irpLoadingSketchLottieView");
                throw null;
            }
        } else {
            ckf.y("irpLoadingSketchLottieView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements qnd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.qnd
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d6b3c2b", new Object[]{this, new Boolean(z)});
                return;
            }
            hmf i0 = anf.i0(anf.this);
            if (i0 != null) {
                ylf j0 = anf.j0(anf.this);
                if (j0 != null) {
                    i0.A0(j0.l0());
                } else {
                    ckf.y("irpTitleBarWidget");
                    throw null;
                }
            } else {
                ckf.y("irpHybridWidget");
                throw null;
            }
        }

        @Override // tb.qnd
        public void b(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55d1b959", new Object[]{this, jSONArray});
                return;
            }
            hmf i0 = anf.i0(anf.this);
            if (i0 != null) {
                i0.B0(jSONArray);
            } else {
                ckf.y("irpHybridWidget");
                throw null;
            }
        }

        @Override // tb.qnd
        public void c(boolean z) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edaecd18", new Object[]{this, new Boolean(z)});
                return;
            }
            hmf i0 = anf.i0(anf.this);
            if (i0 != null) {
                i0.x0(z);
                anf.this.R0(z);
                if (anf.o0(anf.this)) {
                    TUrlImageView m0 = anf.m0(anf.this);
                    if (m0 != null) {
                        if (z) {
                            i = 8;
                        }
                        m0.setVisibility(i);
                    } else {
                        ckf.y("titleBarBgImageView");
                        throw null;
                    }
                }
                anf.this.J0(true ^ z);
                anf.p0(anf.this, z);
                return;
            }
            ckf.y("irpHybridWidget");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar, ScrollInterceptView.b bVar, ylf.a aVar, dmf.a aVar2, a aVar3) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.l = bVar;
        this.m = aVar;
        this.n = aVar2;
    }

    public final void B0(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6d0d13", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.lav_loading_sketch);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        if (W().Q()) {
            if (((oxb) E()).E1()) {
                str = "#222222";
            } else {
                str = "#FFFFFF";
            }
            lottieAnimationView.setBackgroundColor(Color.parseColor(str));
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setImageAssetsFolder("");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.addLottieOnCompositionLoadedListener(new c(lottieAnimationView));
            lottieAnimationView.setAnimationFromUrl(y0());
        } else {
            lottieAnimationView.setVisibility(8);
        }
        ckf.f(findViewById, "rootView.findViewById<Lo…ew.GONE\n        }\n      }");
        this.v = (LottieAnimationView) findViewById;
    }

    public final void C0(boolean z, ScrollInterceptView scrollInterceptView) {
        ylf ylfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff0602c", new Object[]{this, new Boolean(z), scrollInterceptView});
            return;
        }
        d dVar = new d();
        e eVar = new e();
        String k = W().w().k();
        if (ckf.b(k, "text")) {
            ylfVar = new ulf(E(), this, W(), dVar);
        } else if (ckf.b(k, "placeholder")) {
            ylfVar = new rmf(E(), this, W(), dVar);
        } else {
            ylfVar = new Irp2024TitleBarWidget(E(), this, W(), dVar, z, eVar);
        }
        this.u = ylfVar;
        ylfVar.w0(this.m);
        ylf ylfVar2 = this.u;
        if (ylfVar2 != null) {
            ViewWidget.T(ylfVar2, null, 1, null);
            ylf ylfVar3 = this.u;
            if (ylfVar3 != null) {
                scrollInterceptView.setHeaderHeight(ylfVar3.l0());
                float h2 = W().w().h();
                this.z = h2;
                scrollInterceptView.setDownContentHeight(p1p.a(h2));
                P0(!W().w().o());
                N0(p1p.a(W().w().j()));
                LottieAnimationView lottieAnimationView = this.v;
                if (lottieAnimationView != null) {
                    if (lottieAnimationView.getVisibility() == 0) {
                        LottieAnimationView lottieAnimationView2 = this.v;
                        if (lottieAnimationView2 != null) {
                            lottieAnimationView2.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
                            LottieAnimationView lottieAnimationView3 = this.v;
                            if (lottieAnimationView3 != null) {
                                ylf ylfVar4 = this.u;
                                if (ylfVar4 != null) {
                                    lottieAnimationView3.setTranslationY(ylfVar4.l0());
                                } else {
                                    ckf.y("irpTitleBarWidget");
                                    throw null;
                                }
                            } else {
                                ckf.y("irpLoadingSketchLottieView");
                                throw null;
                            }
                        } else {
                            ckf.y("irpLoadingSketchLottieView");
                            throw null;
                        }
                    }
                    ylf ylfVar5 = this.u;
                    if (ylfVar5 == null) {
                        ckf.y("irpTitleBarWidget");
                        throw null;
                    } else if (ylfVar5 instanceof ulf) {
                        L0(true);
                    }
                } else {
                    ckf.y("irpLoadingSketchLottieView");
                    throw null;
                }
            } else {
                ckf.y("irpTitleBarWidget");
                throw null;
            }
        } else {
            ckf.y("irpTitleBarWidget");
            throw null;
        }
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4780846", new Object[]{this});
            return;
        }
        ylf ylfVar = this.u;
        if (ylfVar == null) {
            ckf.y("irpTitleBarWidget");
            throw null;
        } else if (ylfVar.a0()) {
            ylf ylfVar2 = this.u;
            if (ylfVar2 != null) {
                ylfVar2.D();
                hmf hmfVar = this.t;
                if (hmfVar != null) {
                    hmfVar.A0(0.0f);
                    ScrollInterceptView X = X();
                    if (X != null) {
                        X.setHeaderHeight(0);
                    }
                    E().getWindow().setStatusBarColor(Color.parseColor("#F7F7F7"));
                    return;
                }
                ckf.y("irpHybridWidget");
                throw null;
            }
            ckf.y("irpTitleBarWidget");
            throw null;
        }
    }

    /* renamed from: G0 */
    public ScrollInterceptView b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollInterceptView) ipChange.ipc$dispatch("6fedd6c1", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_irp_scroll_intercept, V(), false);
        if (inflate != null) {
            ScrollInterceptView scrollInterceptView = (ScrollInterceptView) inflate;
            View findViewById = scrollInterceptView.findViewById(R.id.container);
            ckf.f(findViewById, "rootView.findViewById(R.id.container)");
            this.p = (FrameLayout) findViewById;
            View findViewById2 = scrollInterceptView.findViewById(R.id.view_title_bg);
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = caa.g(E()) / 2;
                layoutParams2.setMargins(0, p1p.a(W().w().j()), 0, 0);
                findViewById2.setLayoutParams(layoutParams2);
                if (W().X()) {
                    findViewById2.setVisibility(8);
                }
                this.q = findViewById2;
                View findViewById3 = scrollInterceptView.findViewById(R.id.tiv_bg);
                ckf.f(findViewById3, "rootView.findViewById(R.id.tiv_bg)");
                this.r = (TUrlImageView) findViewById3;
                J0(true);
                B0(scrollInterceptView);
                C0(false, scrollInterceptView);
                A0();
                hmf hmfVar = this.t;
                if (hmfVar != null) {
                    hmfVar.u0();
                    scrollInterceptView.setStateProvider(new f());
                    scrollInterceptView.setOffsetCallback(this.l);
                    scrollInterceptView.addOnLayoutChangeListener(new g(scrollInterceptView));
                    return scrollInterceptView;
                }
                ckf.y("irpHybridWidget");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.result.ScrollInterceptView");
    }

    public final void J0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.q;
            if (view != null) {
                view.setClipToOutline(true);
                View view2 = this.q;
                if (view2 != null) {
                    view2.setOutlineProvider(new h());
                } else {
                    ckf.y("titleBarBgView");
                    throw null;
                }
            } else {
                ckf.y("titleBarBgView");
                throw null;
            }
        } else {
            View view3 = this.q;
            if (view3 != null) {
                view3.setClipToOutline(false);
            } else {
                ckf.y("titleBarBgView");
                throw null;
            }
        }
    }

    public final void K0(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bccd076", new Object[]{this, new Boolean(z), str});
        } else if (!z) {
            this.x = false;
            TUrlImageView tUrlImageView = this.r;
            if (tUrlImageView != null) {
                tUrlImageView.setVisibility(8);
            } else {
                ckf.y("titleBarBgImageView");
                throw null;
            }
        } else if (!TextUtils.isEmpty(str)) {
            this.x = true;
            TUrlImageView tUrlImageView2 = this.r;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(str);
                TUrlImageView tUrlImageView3 = this.r;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setVisibility(0);
                } else {
                    ckf.y("titleBarBgImageView");
                    throw null;
                }
            } else {
                ckf.y("titleBarBgImageView");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout l0 = anf.l0(anf.this);
            if (l0 != null) {
                l0.removeView(view);
                FrameLayout l02 = anf.l0(anf.this);
                if (l02 != null) {
                    return l02;
                }
                ckf.y("mainContainerParent");
                throw null;
            }
            ckf.y("mainContainerParent");
            throw null;
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            anf.q0(anf.this, view);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (!anf.this.W().X()) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.parseColor("#F3F6F8"));
                gradientDrawable.setShape(0);
                float b = p1p.b(6.5f);
                gradientDrawable.setCornerRadii(new float[]{b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f});
                view.setBackground(gradientDrawable);
            }
            ylf j0 = anf.j0(anf.this);
            if (j0 != null) {
                view.setTranslationY(j0.l0());
                FrameLayout l0 = anf.l0(anf.this);
                if (l0 != null) {
                    l0.addView(view, layoutParams);
                    FrameLayout l02 = anf.l0(anf.this);
                    if (l02 != null) {
                        return l02;
                    }
                    ckf.y("mainContainerParent");
                    throw null;
                }
                ckf.y("mainContainerParent");
                throw null;
            }
            ckf.y("irpTitleBarWidget");
            throw null;
        }
    }
}
