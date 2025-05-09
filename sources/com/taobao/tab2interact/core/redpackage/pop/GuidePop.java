package com.taobao.tab2interact.core.redpackage.pop;

import android.content.Context;
import android.graphics.Color;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import tb.at4;
import tb.ckf;
import tb.cpr;
import tb.m7r;
import tb.mh1;
import tb.mqu;
import tb.rx7;
import tb.t2o;
import tb.v4s;
import tb.xhv;
import tb.yey;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GuidePop extends yey<Map<String, ? extends Object>> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean clickOnOpen;
    private ImageView closeButton;
    private LinearLayout containerView;
    private final int contentWidth;
    private LinearLayout guideLayout;
    private View leftBand;
    private LinearLayout leftMoneyLayout;
    private LottieAnimationView lottie;
    private FrameLayout openButton;
    private FrameLayout progress;
    private FrameLayout redpackageLayout;
    private ImageView redpackageLeftImage;
    private ImageView redpackageRightImage;
    private View rightBand;
    private LinearLayout rightMoneyLayout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GuidePop.access$getProgress$p(GuidePop.this).animate().scaleX(130.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11843a;
        public final /* synthetic */ LinearLayout b;
        public final /* synthetic */ ImageView c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.f11843a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).start();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tab2interact.core.redpackage.pop.GuidePop$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class RunnableC0668b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0668b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).start();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).start();
                }
            }
        }

        public b(View view, LinearLayout linearLayout, ImageView imageView) {
            this.f11843a = view;
            this.b = linearLayout;
            this.c = imageView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f11843a.animate().scaleX(1.1f).scaleY(1.1f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new a()).start();
            this.b.animate().scaleX(1.1f).scaleY(1.1f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new RunnableC0668b()).start();
            this.c.animate().scaleX(1.1f).scaleY(1.1f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new c()).start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GuidePop.access$getLottie$p(GuidePop.this).playAnimation();
            }
        }
    }

    static {
        t2o.a(689963170);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidePop(Context context) {
        super(context);
        ckf.g(context, "context");
        this.contentWidth = at4.Companion.b(context, 750, false);
    }

    public static final /* synthetic */ LottieAnimationView access$getLottie$p(GuidePop guidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("3220e53", new Object[]{guidePop});
        }
        LottieAnimationView lottieAnimationView = guidePop.lottie;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        ckf.y("lottie");
        throw null;
    }

    public static final /* synthetic */ FrameLayout access$getProgress$p(GuidePop guidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("33de30ba", new Object[]{guidePop});
        }
        FrameLayout frameLayout = guidePop.progress;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("progress");
        throw null;
    }

    public static final /* synthetic */ void access$setLottie$p(GuidePop guidePop, LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f42615", new Object[]{guidePop, lottieAnimationView});
        } else {
            guidePop.lottie = lottieAnimationView;
        }
    }

    public static final /* synthetic */ void access$setProgress$p(GuidePop guidePop, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203614ce", new Object[]{guidePop, frameLayout});
        } else {
            guidePop.progress = frameLayout;
        }
    }

    private final void animateProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d8a5b5", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.progress;
        if (frameLayout != null) {
            frameLayout.postDelayed(new a(), 500L);
        } else {
            ckf.y("progress");
            throw null;
        }
    }

    private final void animateRedpackage(View view, LinearLayout linearLayout, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d9166c", new Object[]{this, view, linearLayout, imageView});
        } else {
            view.postDelayed(new b(view, linearLayout, imageView), 500L);
        }
    }

    private final void animationLottie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0580f4a", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottie;
        if (lottieAnimationView != null) {
            lottieAnimationView.postDelayed(new c(), 1000L);
        } else {
            ckf.y("lottie");
            throw null;
        }
    }

    public static /* synthetic */ Object ipc$super(GuidePop guidePop, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode == -893949262) {
            super.onDismiss();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/redpackage/pop/GuidePop");
        }
    }

    private final void notifyGuideStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaac1d0c", new Object[]{this});
        } else {
            WVStandardEventCenter.postNotificationToJS("ggshowfakepush", JSON.toJSONString(getData().get("rewardPopInfo")));
        }
    }

    private final void setupCloseButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96dfa94", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        at4.a aVar = at4.Companion;
        Context context = tUrlImageView.getContext();
        ckf.f(context, "context");
        int c2 = at4.a.c(aVar, context, 48, false, 4, null);
        Context context2 = tUrlImageView.getContext();
        ckf.f(context2, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2, at4.a.c(aVar, context2, 48, false, 4, null));
        Context context3 = tUrlImageView.getContext();
        ckf.f(context3, "context");
        layoutParams.leftMargin = at4.a.c(aVar, context3, 676, false, 4, null);
        Context context4 = tUrlImageView.getContext();
        ckf.f(context4, "context");
        layoutParams.bottomMargin = at4.a.c(aVar, context4, 36, false, 4, null);
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN014Ox3dR1OxAGy4cTAH_!!6000000001771-2-tps-73-72.png");
        tUrlImageView.setOnClickListener(this);
        this.closeButton = tUrlImageView;
        LinearLayout linearLayout = this.containerView;
        if (linearLayout != null) {
            linearLayout.addView(tUrlImageView);
        } else {
            ckf.y("containerView");
            throw null;
        }
    }

    private final void setupContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e373350", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        int i = this.contentWidth;
        at4.a aVar = at4.Companion;
        Context context = linearLayout.getContext();
        ckf.f(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, at4.a.c(aVar, context, Integer.valueOf((int) m7r.ACTIONBAR_HAS_MENU), false, 4, null));
        layoutParams.gravity = 80;
        linearLayout.setOrientation(1);
        xhv xhvVar = xhv.INSTANCE;
        linearLayout.setLayoutParams(layoutParams);
        this.containerView = linearLayout;
    }

    private final void setupLottie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8558b03", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        this.lottie = lottieAnimationView;
        at4.a aVar = at4.Companion;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(at4.a.c(aVar, getContext(), Integer.valueOf((int) Configuration.INTERVAL_MAX), false, 4, null), at4.a.c(aVar, getContext(), 320, false, 4, null));
        layoutParams.gravity = 17;
        layoutParams.topMargin = at4.a.c(aVar, getContext(), 49, false, 4, null);
        xhv xhvVar = xhv.INSTANCE;
        lottieAnimationView.setLayoutParams(layoutParams);
        LottieAnimationView lottieAnimationView2 = this.lottie;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setAnimationFromUrl("https://g.alicdn.com/eva-assets/04ca8d652e7356eb3d266ed6b5eccfe8/0.0.1/tmp/878e4bc/878e4bc.json?spm=a21714.homepage.0.0.6fdd3fe0nRPy7a&file=878e4bc.json");
            LottieAnimationView lottieAnimationView3 = this.lottie;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setRepeatCount(-1);
                LinearLayout linearLayout = this.guideLayout;
                if (linearLayout != null) {
                    LottieAnimationView lottieAnimationView4 = this.lottie;
                    if (lottieAnimationView4 != null) {
                        linearLayout.addView(lottieAnimationView4);
                    } else {
                        ckf.y("lottie");
                        throw null;
                    }
                } else {
                    ckf.y("guideLayout");
                    throw null;
                }
            } else {
                ckf.y("lottie");
                throw null;
            }
        } else {
            ckf.y("lottie");
            throw null;
        }
    }

    private final void setupProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba762351", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        at4.a aVar = at4.Companion;
        Context context = frameLayout.getContext();
        ckf.f(context, "context");
        int c2 = at4.a.c(aVar, context, 130, false, 4, null);
        Context context2 = frameLayout.getContext();
        ckf.f(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c2, at4.a.c(aVar, context2, 15, false, 4, null));
        Context context3 = frameLayout.getContext();
        ckf.f(context3, "context");
        layoutParams.topMargin = at4.a.c(aVar, context3, 218, false, 4, null);
        Context context4 = frameLayout.getContext();
        ckf.f(context4, "context");
        layoutParams.leftMargin = at4.a.c(aVar, context4, 168, false, 4, null);
        frameLayout.setBackgroundColor(Color.parseColor("#FFDAC9"));
        xhv xhvVar = xhv.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        Context context5 = frameLayout2.getContext();
        ckf.f(context5, "context");
        int c3 = at4.a.c(aVar, context5, 2, false, 4, null);
        Context context6 = frameLayout2.getContext();
        ckf.f(context6, "context");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c3, at4.a.c(aVar, context6, 15, false, 4, null));
        frameLayout2.setBackgroundColor(Color.parseColor("#FF5000"));
        frameLayout2.setLayoutParams(layoutParams2);
        this.progress = frameLayout2;
        frameLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = this.redpackageLayout;
        if (frameLayout3 != null) {
            frameLayout3.addView(frameLayout);
        } else {
            ckf.y("redpackageLayout");
            throw null;
        }
    }

    private final void setupRedpackageLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35787543", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        at4.a aVar = at4.Companion;
        Context context = frameLayout.getContext();
        ckf.f(context, "context");
        int c2 = at4.a.c(aVar, context, 466, false, 4, null);
        Context context2 = frameLayout.getContext();
        ckf.f(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c2, at4.a.c(aVar, context2, 254, false, 4, null));
        frameLayout.setClipChildren(false);
        Context context3 = frameLayout.getContext();
        ckf.f(context3, "context");
        layoutParams.topMargin = at4.a.c(aVar, context3, 47, false, 4, null);
        layoutParams.gravity = 1;
        xhv xhvVar = xhv.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        this.redpackageLayout = frameLayout;
        LinearLayout linearLayout = this.guideLayout;
        if (linearLayout != null) {
            linearLayout.addView(frameLayout);
        } else {
            ckf.y("guideLayout");
            throw null;
        }
    }

    private final FrameLayout setupRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c6661f2e", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.contentWidth, -1);
        at4.a aVar = at4.Companion;
        Context context = frameLayout.getContext();
        ckf.f(context, "context");
        frameLayout.setPadding(0, at4.a.c(aVar, context, 114, false, 4, null), 0, 0);
        xhv xhvVar = xhv.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(Color.argb(1, 0, 0, 0));
        return frameLayout;
    }

    @Override // tb.yey
    public Pair<Animation, Animation> onCreateAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("34513a7a", new Object[]{this});
        }
        Animation createInAnimation = createInAnimation("bottom");
        ckf.d(createInAnimation);
        Animation createOutAnimation = createOutAnimation("bottom");
        ckf.d(createOutAnimation);
        return new Pair<>(createInAnimation, createOutAnimation);
    }

    @Override // tb.yey
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        HashMap hashMap = new HashMap();
        hashMap.put("status", Integer.valueOf(this.clickOnOpen ? 1 : 0));
        getDismissCallback().invoke(hashMap);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        FrameLayout frameLayout = this.openButton;
        if (frameLayout != null) {
            if (ckf.b(view, frameLayout)) {
                this.clickOnOpen = true;
            }
            dismiss();
            return;
        }
        ckf.y("openButton");
        throw null;
    }

    public View onCreateView(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("288f1886", new Object[]{this, context, map});
        }
        ckf.g(context, "context");
        ckf.g(map, "data");
        FrameLayout frameLayout = setupRootView();
        setupContainerView();
        LinearLayout linearLayout = this.containerView;
        if (linearLayout != null) {
            frameLayout.addView(linearLayout);
            setupCloseButton();
            setupGuideContainer();
            setupRedpackageLayout();
            setupRedpackage(context, map, true);
            setupRedpackage(context, map, false);
            setupProgress();
            setupBand();
            setupLottie();
            setupOpenButton();
            return frameLayout;
        }
        ckf.y("containerView");
        throw null;
    }

    @Override // tb.yey
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        if (mqu.Companion.d(getData().get("currentStage"), 0) == 0) {
            View view = this.leftBand;
            if (view != null) {
                LinearLayout linearLayout = this.leftMoneyLayout;
                if (linearLayout != null) {
                    ImageView imageView = this.redpackageLeftImage;
                    if (imageView != null) {
                        animateRedpackage(view, linearLayout, imageView);
                    } else {
                        ckf.y("redpackageLeftImage");
                        throw null;
                    }
                } else {
                    ckf.y("leftMoneyLayout");
                    throw null;
                }
            } else {
                ckf.y("leftBand");
                throw null;
            }
        } else {
            View view2 = this.rightBand;
            if (view2 != null) {
                LinearLayout linearLayout2 = this.rightMoneyLayout;
                if (linearLayout2 != null) {
                    ImageView imageView2 = this.redpackageRightImage;
                    if (imageView2 != null) {
                        animateRedpackage(view2, linearLayout2, imageView2);
                    } else {
                        ckf.y("redpackageRightImage");
                        throw null;
                    }
                } else {
                    ckf.y("rightMoneyLayout");
                    throw null;
                }
            } else {
                ckf.y("rightBand");
                throw null;
            }
        }
        animateProgress();
        animationLottie();
        notifyGuideStatus();
    }

    private final void setupBand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaa39d9", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        at4.a aVar = at4.Companion;
        Context context = tUrlImageView.getContext();
        ckf.f(context, "context");
        int c2 = at4.a.c(aVar, context, 168, false, 4, null);
        Context context2 = tUrlImageView.getContext();
        ckf.f(context2, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2, at4.a.c(aVar, context2, 72, false, 4, null));
        Context context3 = tUrlImageView.getContext();
        ckf.f(context3, "context");
        layoutParams.leftMargin = at4.a.c(aVar, context3, 5, false, 4, null);
        Context context4 = tUrlImageView.getContext();
        ckf.f(context4, "context");
        layoutParams.bottomMargin = at4.a.c(aVar, context4, 1, false, 4, null);
        layoutParams.gravity = 83;
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        String str = "https://gw.alicdn.com/imgextra/i4/O1CN015XO8fJ28XUR11dAhc_!!6000000007942-2-tps-344-156.png";
        tUrlImageView.setImageUrl(str);
        this.leftBand = tUrlImageView;
        FrameLayout frameLayout = this.redpackageLayout;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
            TUrlImageView tUrlImageView2 = new TUrlImageView(getContext());
            Context context5 = tUrlImageView2.getContext();
            ckf.f(context5, "context");
            int c3 = at4.a.c(aVar, context5, 168, false, 4, null);
            Context context6 = tUrlImageView2.getContext();
            ckf.f(context6, "context");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c3, at4.a.c(aVar, context6, 72, false, 4, null));
            Context context7 = tUrlImageView2.getContext();
            ckf.f(context7, "context");
            layoutParams2.rightMargin = at4.a.c(aVar, context7, 5, false, 4, null);
            Context context8 = tUrlImageView2.getContext();
            ckf.f(context8, "context");
            layoutParams2.bottomMargin = at4.a.c(aVar, context8, 1, false, 4, null);
            layoutParams2.gravity = 85;
            tUrlImageView2.setLayoutParams(layoutParams2);
            if (mqu.Companion.d(getData().get("currentStage"), 0) == 0) {
                str = "https://gw.alicdn.com/imgextra/i4/O1CN018g72iC1rd7q21fKZ8_!!6000000005653-2-tps-344-156.png";
            }
            tUrlImageView2.setImageUrl(str);
            this.rightBand = tUrlImageView2;
            FrameLayout frameLayout2 = this.redpackageLayout;
            if (frameLayout2 != null) {
                frameLayout2.addView(tUrlImageView2);
            } else {
                ckf.y("redpackageLayout");
                throw null;
            }
        } else {
            ckf.y("redpackageLayout");
            throw null;
        }
    }

    private final void setupGuideContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c78849", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        int i = this.contentWidth;
        at4.a aVar = at4.Companion;
        Context context = frameLayout.getContext();
        ckf.f(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, at4.a.c(aVar, context, Integer.valueOf((int) cpr.MSG_TYPE_TOP_ATMOSPHERE), false, 4, null));
        frameLayout.setClipChildren(false);
        Context context2 = frameLayout.getContext();
        ckf.f(context2, "context");
        int c2 = at4.a.c(aVar, context2, 90, false, 4, null);
        rx7.a aVar2 = rx7.Companion;
        frameLayout.setBackground(aVar2.b(Color.parseColor("#FFFBF2"), 0, 0, c2, c2, 0, 0));
        xhv xhvVar = xhv.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout = this.containerView;
        if (linearLayout != null) {
            linearLayout.addView(frameLayout);
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            int i2 = this.contentWidth;
            Context context3 = frameLayout2.getContext();
            ckf.f(context3, "context");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, at4.a.c(aVar, context3, Integer.valueOf((int) cpr.MSG_TYPE_TOP_ATMOSPHERE), false, 4, null));
            Context context4 = frameLayout2.getContext();
            ckf.f(context4, "context");
            int c3 = at4.a.c(aVar, context4, 90, false, 4, null);
            frameLayout2.setBackground(aVar2.b(Color.parseColor("#FFFBF2"), 0, 0, c3, c3, 0, 0));
            frameLayout2.setLayoutParams(layoutParams2);
            FrameLayout frameLayout3 = new FrameLayout(getContext());
            int i3 = this.contentWidth;
            Context context5 = frameLayout3.getContext();
            ckf.f(context5, "context");
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, at4.a.c(aVar, context5, 390, false, 4, null));
            Context context6 = frameLayout3.getContext();
            ckf.f(context6, "context");
            int c4 = at4.a.c(aVar, context6, 90, false, 4, null);
            frameLayout3.setBackground(aVar2.c(new int[]{Color.parseColor("#FFE9B1"), Color.parseColor("#FFFBF2")}, true, c4, c4, 0, 0));
            frameLayout3.setLayoutParams(layoutParams3);
            frameLayout.addView(frameLayout2);
            frameLayout.addView(frameLayout3);
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            int i4 = this.contentWidth;
            Context context7 = linearLayout2.getContext();
            ckf.f(context7, "context");
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, at4.a.c(aVar, context7, Integer.valueOf((int) cpr.MSG_TYPE_TOP_ATMOSPHERE), false, 4, null));
            linearLayout2.setClipChildren(false);
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(layoutParams4);
            this.guideLayout = linearLayout2;
            frameLayout.addView(linearLayout2);
            TUrlImageView tUrlImageView = new TUrlImageView(getContext());
            Context context8 = tUrlImageView.getContext();
            ckf.f(context8, "context");
            int c5 = at4.a.c(aVar, context8, 300, false, 4, null);
            Context context9 = tUrlImageView.getContext();
            ckf.f(context9, "context");
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(c5, at4.a.c(aVar, context9, 60, false, 4, null));
            Context context10 = tUrlImageView.getContext();
            ckf.f(context10, "context");
            layoutParams5.topMargin = at4.a.c(aVar, context10, 48, false, 4, null);
            layoutParams5.gravity = 1;
            tUrlImageView.setLayoutParams(layoutParams5);
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01HMTWz41mPJol24jKR_!!6000000004946-2-tps-296-56.png");
            LinearLayout linearLayout3 = this.guideLayout;
            if (linearLayout3 != null) {
                linearLayout3.addView(tUrlImageView);
                TextView textView = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                Context context11 = textView.getContext();
                ckf.f(context11, "context");
                layoutParams6.topMargin = at4.a.c(aVar, context11, 30, false, 4, null);
                layoutParams6.gravity = 1;
                textView.setLayoutParams(layoutParams6);
                textView.setText(mqu.Companion.i(getData().get(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE), ""));
                textView.setEllipsize(TextUtils.TruncateAt.END);
                Context context12 = textView.getContext();
                ckf.f(context12, "context");
                textView.setMaxWidth(at4.a.c(aVar, context12, 600, false, 4, null));
                Context context13 = textView.getContext();
                ckf.f(context13, "context");
                textView.setTextSize(0, at4.a.c(aVar, context13, 32, false, 4, null));
                textView.setAlpha(0.4f);
                textView.setTypeface(null, 1);
                textView.setTextColor(Color.parseColor("#FF5000"));
                textView.setGravity(17);
                LinearLayout linearLayout4 = this.guideLayout;
                if (linearLayout4 != null) {
                    linearLayout4.addView(textView);
                } else {
                    ckf.y("guideLayout");
                    throw null;
                }
            } else {
                ckf.y("guideLayout");
                throw null;
            }
        } else {
            ckf.y("containerView");
            throw null;
        }
    }

    private final void setupOpenButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f75880", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        at4.a aVar = at4.Companion;
        Context context = frameLayout.getContext();
        ckf.f(context, "context");
        int c2 = at4.a.c(aVar, context, Integer.valueOf((int) Configuration.INTERVAL_MAX), false, 4, null);
        Context context2 = frameLayout.getContext();
        ckf.f(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c2, at4.a.c(aVar, context2, 120, false, 4, null));
        Context context3 = frameLayout.getContext();
        ckf.f(context3, "context");
        layoutParams.topMargin = at4.a.c(aVar, context3, 34, false, 4, null);
        layoutParams.gravity = 17;
        xhv xhvVar = xhv.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOnClickListener(this);
        this.openButton = frameLayout;
        LinearLayout linearLayout = this.guideLayout;
        if (linearLayout != null) {
            linearLayout.addView(frameLayout);
            TUrlImageView tUrlImageView = new TUrlImageView(getContext());
            Context context4 = tUrlImageView.getContext();
            ckf.f(context4, "context");
            int c3 = at4.a.c(aVar, context4, Integer.valueOf((int) Configuration.INTERVAL_MAX), false, 4, null);
            Context context5 = tUrlImageView.getContext();
            ckf.f(context5, "context");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c3, at4.a.c(aVar, context5, 120, false, 4, null));
            layoutParams2.gravity = 17;
            tUrlImageView.setLayoutParams(layoutParams2);
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN019OHkss1zUteUyQBPn_!!6000000006718-2-tps-1320-240.png");
            FrameLayout frameLayout2 = this.openButton;
            if (frameLayout2 != null) {
                frameLayout2.addView(tUrlImageView);
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 17;
                linearLayout2.setOrientation(0);
                linearLayout2.setLayoutParams(layoutParams3);
                FrameLayout frameLayout3 = this.openButton;
                if (frameLayout3 != null) {
                    frameLayout3.addView(linearLayout2);
                    mqu.a aVar2 = mqu.Companion;
                    String i = aVar2.i(getData().get("warnButtonIcon"), null);
                    if (!TextUtils.isEmpty(i)) {
                        TUrlImageView tUrlImageView2 = new TUrlImageView(getContext());
                        Context context6 = tUrlImageView2.getContext();
                        ckf.f(context6, "context");
                        int c4 = at4.a.c(aVar, context6, 32, false, 4, null);
                        Context context7 = tUrlImageView2.getContext();
                        ckf.f(context7, "context");
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(c4, at4.a.c(aVar, context7, 37, false, 4, null));
                        Context context8 = tUrlImageView2.getContext();
                        ckf.f(context8, "context");
                        layoutParams4.rightMargin = at4.a.c(aVar, context8, 12, false, 4, null);
                        layoutParams4.gravity = 16;
                        tUrlImageView2.setLayoutParams(layoutParams4);
                        tUrlImageView2.setImageUrl(i);
                        linearLayout2.addView(tUrlImageView2);
                    }
                    TextView textView = new TextView(getContext());
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams5.gravity = 16;
                    textView.setLayoutParams(layoutParams5);
                    textView.setText(aVar2.i(getData().get("warnButtonText"), ""));
                    textView.setTextColor(-1);
                    Context context9 = textView.getContext();
                    ckf.f(context9, "context");
                    textView.setTextSize(0, at4.a.c(aVar, context9, 42, false, 4, null));
                    textView.setTypeface(null, 1);
                    linearLayout2.addView(textView);
                    return;
                }
                ckf.y("openButton");
                throw null;
            }
            ckf.y("openButton");
            throw null;
        }
        ckf.y("guideLayout");
        throw null;
    }

    private final void setupRedpackage(Context context, Map<String, ? extends Object> map, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e8df5e", new Object[]{this, context, map, new Boolean(z)});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        at4.a aVar = at4.Companion;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 178, false, 4, null), at4.a.c(aVar, context, 229, false, 4, null));
        if (z) {
            layoutParams.gravity = 3;
        } else {
            layoutParams.gravity = 5;
        }
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01O2Og1O1Jor2xZXhMJ_!!6000000001076-2-tps-178-208.png");
        FrameLayout frameLayout = this.redpackageLayout;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
            if (z) {
                this.redpackageLeftImage = tUrlImageView;
            } else {
                this.redpackageRightImage = tUrlImageView;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 178, false, 4, null), at4.a.c(aVar, context, 80, false, 4, null));
            if (z) {
                layoutParams2.gravity = 3;
            } else {
                layoutParams2.gravity = 5;
            }
            layoutParams2.topMargin = at4.a.c(aVar, context, 38, false, 4, null);
            linearLayout.setClipChildren(false);
            linearLayout.setLayoutParams(layoutParams2);
            linearLayout.setOrientation(0);
            FrameLayout frameLayout2 = this.redpackageLayout;
            if (frameLayout2 != null) {
                frameLayout2.addView(linearLayout);
                if (z) {
                    this.leftMoneyLayout = linearLayout;
                } else {
                    this.rightMoneyLayout = linearLayout;
                }
                Object obj2 = map.get(v4s.PARAM_UPLOAD_STAGE);
                if (!(obj2 instanceof List)) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null) {
                    obj = list.get(!z ? 1 : 0);
                } else {
                    obj = null;
                }
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                TextView textView = new TextView(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 16;
                textView.setLayoutParams(layoutParams3);
                mqu.a aVar2 = mqu.Companion;
                textView.setText(aVar2.i(map2 != null ? map2.get("showAmount") : null, ""));
                textView.setTextColor(Color.parseColor("#FF1100"));
                textView.setTextSize(0, at4.a.c(aVar, context, 52, false, 4, null));
                View view = new View(context);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.weight = 1.0f;
                view.setLayoutParams(layoutParams4);
                linearLayout.addView(view);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(context);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.topMargin = at4.a.c(aVar, context, 5, false, 4, null);
                layoutParams5.gravity = 16;
                textView2.setLayoutParams(layoutParams5);
                textView2.setTextColor(Color.parseColor("#FF1100"));
                textView2.setTextSize(0, at4.a.c(aVar, context, 40, false, 4, null));
                textView2.setText(aVar2.i(map2 != null ? map2.get(mh1.PRICE_UNIT) : null, ""));
                linearLayout.addView(textView2);
                View view2 = new View(context);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams6.weight = 1.0f;
                view2.setLayoutParams(layoutParams6);
                linearLayout.addView(view2);
                CharSequence i = aVar2.i(map2 != null ? map2.get("tip") : null, "");
                boolean b2 = aVar2.b(map2 != null ? map2.get("finished") : null, false);
                if (i != null && i.length() != 0 && !b2) {
                    TextView textView3 = new TextView(context);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 68, false, 4, null), at4.a.c(aVar, context, 38, false, 4, null));
                    if (z) {
                        layoutParams7.leftMargin = at4.a.c(aVar, context, 121, false, 4, null);
                        layoutParams7.gravity = 3;
                    } else {
                        layoutParams7.rightMargin = at4.a.c(aVar, context, -7, false, 4, null);
                        layoutParams7.gravity = 5;
                    }
                    layoutParams7.topMargin = at4.a.c(aVar, context, -17, false, 4, null);
                    textView3.setLayoutParams(layoutParams7);
                    textView3.setText(i);
                    textView3.setBackgroundDrawable(rx7.Companion.a(Color.parseColor("#FDF0DA"), Color.parseColor("#ff871a"), 1, at4.a.c(aVar, context, 20, false, 4, null)));
                    textView3.setTextColor(Color.parseColor("#ff5000"));
                    textView3.setTextSize(0, at4.a.c(aVar, context, 24, false, 4, null));
                    textView3.setGravity(17);
                    FrameLayout frameLayout3 = this.redpackageLayout;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(textView3);
                    } else {
                        ckf.y("redpackageLayout");
                        throw null;
                    }
                }
            } else {
                ckf.y("redpackageLayout");
                throw null;
            }
        } else {
            ckf.y("redpackageLayout");
            throw null;
        }
    }
}
