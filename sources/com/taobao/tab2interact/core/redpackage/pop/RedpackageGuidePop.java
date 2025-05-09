package com.taobao.tab2interact.core.redpackage.pop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.security.realidentity.x2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.base.cyclone.ZipError;
import java.util.HashMap;
import java.util.Map;
import tb.at4;
import tb.ckf;
import tb.mqu;
import tb.t2o;
import tb.xhv;
import tb.yey;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RedpackageGuidePop extends yey<Map<String, ? extends Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean clickOnOpen;
    private final int contentWidth;
    private TUrlImageView handImage;
    private LottieAnimationView lottieView;
    private LinearLayout redpackageContainer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        public a(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageGuidePop$animateHand$$inlined$apply$lambda$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            TUrlImageView access$getHandImage$p = RedpackageGuidePop.access$getHandImage$p(RedpackageGuidePop.this);
            Property property = View.TRANSLATION_X;
            float f = this.b;
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(property, f, this.c, f);
            Property property2 = View.TRANSLATION_Y;
            float f2 = this.d;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(access$getHandImage$p, ofFloat, PropertyValuesHolder.ofFloat(property2, f2, this.e, f2), PropertyValuesHolder.ofFloat(View.ROTATION, 0.0f, -8.0f, 0.0f));
            ofPropertyValuesHolder.setDuration(800L);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RedpackageGuidePop.access$onOpen(RedpackageGuidePop.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RedpackageGuidePop.access$onClose(RedpackageGuidePop.this);
            }
        }
    }

    static {
        t2o.a(689963181);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpackageGuidePop(Context context) {
        super(context);
        ckf.g(context, "context");
        this.contentWidth = at4.a.c(at4.Companion, context, 750, false, 4, null);
    }

    public static final /* synthetic */ TUrlImageView access$getHandImage$p(RedpackageGuidePop redpackageGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("46df9cdf", new Object[]{redpackageGuidePop});
        }
        TUrlImageView tUrlImageView = redpackageGuidePop.handImage;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("handImage");
        throw null;
    }

    public static final /* synthetic */ void access$onClose(RedpackageGuidePop redpackageGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab69b294", new Object[]{redpackageGuidePop});
        } else {
            redpackageGuidePop.onClose();
        }
    }

    public static final /* synthetic */ void access$onOpen(RedpackageGuidePop redpackageGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b8ce84", new Object[]{redpackageGuidePop});
        } else {
            redpackageGuidePop.onOpen();
        }
    }

    public static final /* synthetic */ void access$setHandImage$p(RedpackageGuidePop redpackageGuidePop, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c885d7", new Object[]{redpackageGuidePop, tUrlImageView});
        } else {
            redpackageGuidePop.handImage = tUrlImageView;
        }
    }

    private final void animateHand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29c9b77", new Object[]{this});
            return;
        }
        at4.a aVar = at4.Companion;
        float c2 = at4.a.c(aVar, getContext(), -190, false, 4, null);
        float c3 = at4.a.c(aVar, getContext(), Float.valueOf(-235.0f), false, 4, null);
        float c4 = at4.a.c(aVar, getContext(), Integer.valueOf((int) ZipError.MZ_ZIP_FILE_READ_FAILED), false, 4, null);
        float c5 = at4.a.c(aVar, getContext(), Float.valueOf(-265.0f), false, 4, null);
        TUrlImageView tUrlImageView = this.handImage;
        if (tUrlImageView != null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tUrlImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0.0f, c2), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f, c3));
            ofPropertyValuesHolder.setDuration(500L);
            ofPropertyValuesHolder.addListener(new a(c2, c4, c3, c5));
            ofPropertyValuesHolder.start();
            return;
        }
        ckf.y("handImage");
        throw null;
    }

    public static /* synthetic */ Object ipc$super(RedpackageGuidePop redpackageGuidePop, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode == -893949262) {
            super.onDismiss();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageGuidePop");
        }
    }

    private final void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else {
            dismiss();
        }
    }

    private final void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
            return;
        }
        this.clickOnOpen = true;
        dismiss();
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

    @Override // tb.yey
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        animateRedpackage();
        animateHand();
    }

    public View onCreateView(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("288f1886", new Object[]{this, context, map});
        }
        ckf.g(context, "context");
        ckf.g(map, "data");
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.contentWidth, -1);
        layoutParams.gravity = 17;
        xhv xhvVar = xhv.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(Color.argb(153, 0, 0, 0));
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.lottieView = lottieAnimationView;
        int i = this.contentWidth;
        at4.a aVar = at4.Companion;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, at4.a.c(aVar, context, 1624, false, 4, null));
        layoutParams2.gravity = 17;
        lottieAnimationView.setLayoutParams(layoutParams2);
        LottieAnimationView lottieAnimationView2 = this.lottieView;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setAnimationFromUrl("https://g.alicdn.com/eva-assets/3b535e9e54909232695eb2682e03e23f/0.0.1/tmp/8c503a2/8c503a2.json");
            LottieAnimationView lottieAnimationView3 = this.lottieView;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setRepeatCount(-1);
                LottieAnimationView lottieAnimationView4 = this.lottieView;
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.playAnimation();
                    LottieAnimationView lottieAnimationView5 = this.lottieView;
                    if (lottieAnimationView5 != null) {
                        frameLayout.addView(lottieAnimationView5);
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        this.redpackageContainer = linearLayout;
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.contentWidth, -1);
                        layoutParams3.gravity = 17;
                        linearLayout.setLayoutParams(layoutParams3);
                        LinearLayout linearLayout2 = this.redpackageContainer;
                        if (linearLayout2 != null) {
                            frameLayout.addView(linearLayout2);
                            View view = new View(context);
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams4.weight = 1.0f;
                            view.setLayoutParams(layoutParams4);
                            LinearLayout linearLayout3 = this.redpackageContainer;
                            if (linearLayout3 != null) {
                                linearLayout3.addView(view);
                                TextView textView = new TextView(context);
                                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams5.gravity = 1;
                                textView.setLayoutParams(layoutParams5);
                                textView.setTextSize(0, at4.a.c(aVar, context, 48, false, 4, null));
                                textView.setText(mqu.Companion.i(map.get("redPacketTitle"), ""));
                                textView.setTypeface(null, 1);
                                textView.setTextColor(Color.parseColor("#ffeebe"));
                                LinearLayout linearLayout4 = this.redpackageContainer;
                                if (linearLayout4 != null) {
                                    linearLayout4.addView(textView);
                                    TUrlImageView tUrlImageView = new TUrlImageView(context);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 400, false, 4, null), at4.a.c(aVar, context, Integer.valueOf((int) x2.o), false, 4, null));
                                    layoutParams6.gravity = 1;
                                    layoutParams6.topMargin = at4.a.c(aVar, context, 70, false, 4, null);
                                    layoutParams6.bottomMargin = at4.a.c(aVar, context, 32, false, 4, null);
                                    tUrlImageView.setLayoutParams(layoutParams6);
                                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01IuJJeS23sUWw83KLn_!!6000000007311-2-tps-782-1048.png");
                                    LinearLayout linearLayout5 = this.redpackageContainer;
                                    if (linearLayout5 != null) {
                                        linearLayout5.addView(tUrlImageView);
                                        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
                                        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01KAuciY1IxGinp5bwq_!!6000000000959-2-tps-654-244.png");
                                        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 327, false, 4, null), at4.a.c(aVar, context, 121, false, 4, null));
                                        layoutParams7.gravity = 1;
                                        tUrlImageView2.setLayoutParams(layoutParams7);
                                        tUrlImageView2.setOnClickListener(new b());
                                        LinearLayout linearLayout6 = this.redpackageContainer;
                                        if (linearLayout6 != null) {
                                            linearLayout6.addView(tUrlImageView2);
                                            TUrlImageView tUrlImageView3 = new TUrlImageView(context);
                                            tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN014Ox3dR1OxAGy4cTAH_!!6000000001771-2-tps-73-72.png");
                                            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 72, false, 4, null), at4.a.c(aVar, context, 72, false, 4, null));
                                            layoutParams8.gravity = 1;
                                            layoutParams8.topMargin = at4.a.c(aVar, context, 33, false, 4, null);
                                            tUrlImageView3.setLayoutParams(layoutParams8);
                                            tUrlImageView3.setOnClickListener(new c());
                                            LinearLayout linearLayout7 = this.redpackageContainer;
                                            if (linearLayout7 != null) {
                                                linearLayout7.addView(tUrlImageView3);
                                                View view2 = new View(context);
                                                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
                                                layoutParams9.weight = 1.0f;
                                                view2.setLayoutParams(layoutParams9);
                                                LinearLayout linearLayout8 = this.redpackageContainer;
                                                if (linearLayout8 != null) {
                                                    linearLayout8.addView(view2);
                                                    TUrlImageView tUrlImageView4 = new TUrlImageView(context);
                                                    tUrlImageView4.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN019kfyT21pfkrsjjg7T_!!6000000005388-2-tps-364-378.png");
                                                    this.handImage = tUrlImageView4;
                                                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 150, false, 4, null), at4.a.c(aVar, context, 150, false, 4, null));
                                                    layoutParams10.rightMargin = at4.a.c(aVar, context, -100, false, 4, null);
                                                    layoutParams10.bottomMargin = at4.a.c(aVar, context, 100, false, 4, null);
                                                    layoutParams10.gravity = 85;
                                                    tUrlImageView4.setLayoutParams(layoutParams10);
                                                    TUrlImageView tUrlImageView5 = this.handImage;
                                                    if (tUrlImageView5 != null) {
                                                        frameLayout.addView(tUrlImageView5);
                                                        return frameLayout;
                                                    }
                                                    ckf.y("handImage");
                                                    throw null;
                                                }
                                                ckf.y("redpackageContainer");
                                                throw null;
                                            }
                                            ckf.y("redpackageContainer");
                                            throw null;
                                        }
                                        ckf.y("redpackageContainer");
                                        throw null;
                                    }
                                    ckf.y("redpackageContainer");
                                    throw null;
                                }
                                ckf.y("redpackageContainer");
                                throw null;
                            }
                            ckf.y("redpackageContainer");
                            throw null;
                        }
                        ckf.y("redpackageContainer");
                        throw null;
                    }
                    ckf.y("lottieView");
                    throw null;
                }
                ckf.y("lottieView");
                throw null;
            }
            ckf.y("lottieView");
            throw null;
        }
        ckf.y("lottieView");
        throw null;
    }

    private final void animateRedpackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec0f9dd", new Object[]{this});
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 0.1f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.1f, 1.0f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f);
        LottieAnimationView lottieAnimationView = this.lottieView;
        if (lottieAnimationView != null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(lottieAnimationView, ofFloat, ofFloat2, ofFloat3);
            ofPropertyValuesHolder.setDuration(400L);
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.start();
            LinearLayout linearLayout = this.redpackageContainer;
            if (linearLayout != null) {
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(linearLayout, ofFloat, ofFloat2, ofFloat3);
                ofPropertyValuesHolder2.setDuration(400L);
                ofPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofPropertyValuesHolder2.start();
                return;
            }
            ckf.y("redpackageContainer");
            throw null;
        }
        ckf.y("lottieView");
        throw null;
    }
}
