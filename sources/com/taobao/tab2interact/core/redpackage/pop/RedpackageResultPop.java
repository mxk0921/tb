package com.taobao.tab2interact.core.redpackage.pop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.base.cyclone.ZipError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.at4;
import tb.ckf;
import tb.jpu;
import tb.k7z;
import tb.mqu;
import tb.t2o;
import tb.tsq;
import tb.wsq;
import tb.xhv;
import tb.xz3;
import tb.yey;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RedpackageResultPop extends yey<Map<String, ? extends Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean clickOnOpen;
    private TUrlImageView coinImage;
    private FrameLayout contentView;
    private final int contentWidth;
    private FrameLayout decorView;
    private TUrlImageView handImage;
    private LottieAnimationView lottieView;
    private FrameLayout rootView;
    private int slotWidth;
    private String startPrice = "";
    private String endPrice = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animate2Dismiss$$inlined$apply$lambda$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            RedpackageResultPop.this.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animateCoin$$inlined$apply$lambda$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(RedpackageResultPop.access$getCoinImage$p(RedpackageResultPop.this), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f, at4.a.c(at4.Companion, RedpackageResultPop.access$getContext$p(RedpackageResultPop.this), Float.valueOf(30.0f), false, 4, null), 0.0f));
            ofPropertyValuesHolder.setDuration(1600L);
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        public c(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animateHand$$inlined$apply$lambda$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            TUrlImageView access$getHandImage$p = RedpackageResultPop.access$getHandImage$p(RedpackageResultPop.this);
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
    public static final class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11857a;

        public d(ObjectAnimator objectAnimator) {
            this.f11857a = objectAnimator;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animateRedpackage$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f11857a.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11858a;

        public e(ObjectAnimator objectAnimator) {
            this.f11858a = objectAnimator;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animateRedpackage$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f11858a.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11859a;

        public f(ObjectAnimator objectAnimator) {
            this.f11859a = objectAnimator;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animateRedpackage$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f11859a.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11860a;

        public g(ObjectAnimator objectAnimator) {
            this.f11860a = objectAnimator;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animateRedpackage$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f11860a.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class h extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11861a;

        public h(ObjectAnimator objectAnimator) {
            this.f11861a = objectAnimator;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop$animateRedpackage$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f11861a.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(Context context) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RedpackageResultPop.access$onClose(RedpackageResultPop.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RedpackageResultPop.access$onOpen(RedpackageResultPop.this);
            }
        }
    }

    static {
        t2o.a(689963185);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpackageResultPop(Context context) {
        super(context);
        ckf.g(context, "context");
        this.contentWidth = at4.a.c(at4.Companion, context, 750, false, 4, null);
    }

    public static final /* synthetic */ TUrlImageView access$getCoinImage$p(RedpackageResultPop redpackageResultPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("48400dd0", new Object[]{redpackageResultPop});
        }
        TUrlImageView tUrlImageView = redpackageResultPop.coinImage;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("coinImage");
        throw null;
    }

    public static final /* synthetic */ Context access$getContext$p(RedpackageResultPop redpackageResultPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("310a021f", new Object[]{redpackageResultPop});
        }
        return redpackageResultPop.getContext();
    }

    public static final /* synthetic */ String access$getEndPrice$p(RedpackageResultPop redpackageResultPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("194f8504", new Object[]{redpackageResultPop});
        }
        return redpackageResultPop.endPrice;
    }

    public static final /* synthetic */ TUrlImageView access$getHandImage$p(RedpackageResultPop redpackageResultPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("fe5d2832", new Object[]{redpackageResultPop});
        }
        TUrlImageView tUrlImageView = redpackageResultPop.handImage;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("handImage");
        throw null;
    }

    public static final /* synthetic */ String access$getStartPrice$p(RedpackageResultPop redpackageResultPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d652d5d", new Object[]{redpackageResultPop});
        }
        return redpackageResultPop.startPrice;
    }

    public static final /* synthetic */ void access$onClose(RedpackageResultPop redpackageResultPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e39ebd3", new Object[]{redpackageResultPop});
        } else {
            redpackageResultPop.onClose();
        }
    }

    public static final /* synthetic */ void access$onOpen(RedpackageResultPop redpackageResultPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bce4de3", new Object[]{redpackageResultPop});
        } else {
            redpackageResultPop.onOpen();
        }
    }

    public static final /* synthetic */ void access$setCoinImage$p(RedpackageResultPop redpackageResultPop, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb35529e", new Object[]{redpackageResultPop, tUrlImageView});
        } else {
            redpackageResultPop.coinImage = tUrlImageView;
        }
    }

    public static final /* synthetic */ void access$setEndPrice$p(RedpackageResultPop redpackageResultPop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfaaa5a", new Object[]{redpackageResultPop, str});
        } else {
            redpackageResultPop.endPrice = str;
        }
    }

    public static final /* synthetic */ void access$setHandImage$p(RedpackageResultPop redpackageResultPop, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bb847c", new Object[]{redpackageResultPop, tUrlImageView});
        } else {
            redpackageResultPop.handImage = tUrlImageView;
        }
    }

    public static final /* synthetic */ void access$setStartPrice$p(RedpackageResultPop redpackageResultPop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586ac021", new Object[]{redpackageResultPop, str});
        } else {
            redpackageResultPop.startPrice = str;
        }
    }

    private final void animateCoin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d2a899", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coinImage;
        if (tUrlImageView != null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tUrlImageView, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.1f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.1f, 1.0f));
            ofPropertyValuesHolder.setDuration(100L);
            ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            ofPropertyValuesHolder.addListener(new b());
            ofPropertyValuesHolder.start();
            return;
        }
        ckf.y("coinImage");
        throw null;
    }

    private final void animateHand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29c9b77", new Object[]{this});
            return;
        }
        at4.a aVar = at4.Companion;
        float c2 = at4.a.c(aVar, getContext(), -190, false, 4, null);
        float c3 = at4.a.c(aVar, getContext(), Float.valueOf(-265.0f), false, 4, null);
        float c4 = at4.a.c(aVar, getContext(), Integer.valueOf((int) ZipError.MZ_ZIP_FILE_READ_FAILED), false, 4, null);
        float c5 = at4.a.c(aVar, getContext(), Float.valueOf(-295.0f), false, 4, null);
        TUrlImageView tUrlImageView = this.handImage;
        if (tUrlImageView != null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tUrlImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0.0f, c2), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f, c3));
            ofPropertyValuesHolder.setDuration(1000L);
            ofPropertyValuesHolder.addListener(new c(c2, c4, c3, c5));
            ofPropertyValuesHolder.start();
            return;
        }
        ckf.y("handImage");
        throw null;
    }

    private final void animateRedpackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec0f9dd", new Object[]{this});
            return;
        }
        float parseFloat = Float.parseFloat("-130");
        FrameLayout frameLayout = this.contentView;
        if (frameLayout != null) {
            frameLayout.setRotationY(parseFloat);
            FrameLayout frameLayout2 = this.contentView;
            if (frameLayout2 != null) {
                frameLayout2.setScaleX(0.3f);
                FrameLayout frameLayout3 = this.contentView;
                if (frameLayout3 != null) {
                    frameLayout3.setScaleY(0.3f);
                    FrameLayout frameLayout4 = this.contentView;
                    if (frameLayout4 != null) {
                        Property property = View.ROTATION_Y;
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout4, PropertyValuesHolder.ofFloat(property, parseFloat, 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.3f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.3f, 1.0f));
                        ofPropertyValuesHolder.setDuration(150L);
                        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                        ofPropertyValuesHolder.start();
                        FrameLayout frameLayout5 = this.contentView;
                        if (frameLayout5 != null) {
                            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(frameLayout5, PropertyValuesHolder.ofFloat(property, Float.parseFloat("-18"), Float.parseFloat("12")));
                            ofPropertyValuesHolder2.setDuration(360L);
                            ofPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
                            FrameLayout frameLayout6 = this.contentView;
                            if (frameLayout6 != null) {
                                ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(frameLayout6, PropertyValuesHolder.ofFloat(property, 0.0f, Float.parseFloat("-18")));
                                ofPropertyValuesHolder3.setDuration(230L);
                                ofPropertyValuesHolder3.setInterpolator(new LinearInterpolator());
                                ofPropertyValuesHolder3.addListener(new d(ofPropertyValuesHolder2));
                                FrameLayout frameLayout7 = this.contentView;
                                if (frameLayout7 != null) {
                                    ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(frameLayout7, PropertyValuesHolder.ofFloat(property, Float.parseFloat("12"), Float.parseFloat("-7")));
                                    ofPropertyValuesHolder4.setDuration(360L);
                                    ofPropertyValuesHolder4.setInterpolator(new LinearInterpolator());
                                    ofPropertyValuesHolder2.addListener(new e(ofPropertyValuesHolder4));
                                    FrameLayout frameLayout8 = this.contentView;
                                    if (frameLayout8 != null) {
                                        ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(frameLayout8, PropertyValuesHolder.ofFloat(property, Float.parseFloat("-7"), Float.parseFloat("3")));
                                        ofPropertyValuesHolder5.setDuration(360L);
                                        ofPropertyValuesHolder5.setInterpolator(new LinearInterpolator());
                                        ofPropertyValuesHolder4.addListener(new f(ofPropertyValuesHolder5));
                                        FrameLayout frameLayout9 = this.contentView;
                                        if (frameLayout9 != null) {
                                            ObjectAnimator ofPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(frameLayout9, PropertyValuesHolder.ofFloat(property, Float.parseFloat("3"), 0.0f));
                                            ofPropertyValuesHolder6.setDuration(360L);
                                            ofPropertyValuesHolder6.setInterpolator(new LinearInterpolator());
                                            ofPropertyValuesHolder5.addListener(new g(ofPropertyValuesHolder6));
                                            ofPropertyValuesHolder.addListener(new h(ofPropertyValuesHolder3));
                                            return;
                                        }
                                        ckf.y("contentView");
                                        throw null;
                                    }
                                    ckf.y("contentView");
                                    throw null;
                                }
                                ckf.y("contentView");
                                throw null;
                            }
                            ckf.y("contentView");
                            throw null;
                        }
                        ckf.y("contentView");
                        throw null;
                    }
                    ckf.y("contentView");
                    throw null;
                }
                ckf.y("contentView");
                throw null;
            }
            ckf.y("contentView");
            throw null;
        }
        ckf.y("contentView");
        throw null;
    }

    public static /* synthetic */ Object ipc$super(RedpackageResultPop redpackageResultPop, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode == -893949262) {
            super.onDismiss();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/redpackage/pop/RedpackageResultPop");
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
        animate2Dismiss();
    }

    private final void setPrice(String str, String str2) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6899e122", new Object[]{this, str, str2});
            return;
        }
        int X = wsq.X(str, '.', 0, false, 6, null);
        int X2 = wsq.X(str2, '.', 0, false, 6, null);
        if (X == 0) {
            i2 = str.length();
        } else {
            i2 = X;
        }
        if (X2 == 0) {
            i3 = str2.length();
        } else {
            i3 = X2;
        }
        if (X == 0) {
            i4 = 0;
        } else {
            i4 = str.length() - X;
        }
        if (X2 != 0) {
            i5 = str2.length() - X2;
        }
        int max = Math.max(i2, i3);
        int max2 = Math.max(i4, i5);
        this.startPrice = tsq.A("0", max - i2) + str + tsq.A("0", max2 - i4);
        this.endPrice = tsq.A("0", max - i3) + str2 + tsq.A("0", max2 - i5);
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
        animateHand();
        animateCoin();
        animateRedpackage();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LinearLayout b;

        public i(LinearLayout linearLayout) {
            this.b = linearLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int length = RedpackageResultPop.access$getStartPrice$p(RedpackageResultPop.this).length();
            for (int i = 0; i < length; i++) {
                if (RedpackageResultPop.access$getStartPrice$p(RedpackageResultPop.this).charAt(i) != '.') {
                    mqu.a aVar = mqu.Companion;
                    int d = aVar.d(String.valueOf(RedpackageResultPop.access$getStartPrice$p(RedpackageResultPop.this).charAt(i)), 0);
                    int d2 = aVar.d(String.valueOf(RedpackageResultPop.access$getEndPrice$p(RedpackageResultPop.this).charAt(i)), 0);
                    View childAt = this.b.getChildAt(i);
                    if (childAt != null) {
                        LinearLayout linearLayout = (LinearLayout) childAt;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "translationY", linearLayout.getTranslationY() + ((d - d2) * at4.a.c(at4.Companion, RedpackageResultPop.access$getContext$p(RedpackageResultPop.this), 135, false, 4, null)));
                        ofFloat.setDuration(1150L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.start();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                }
            }
        }
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
        at4.a aVar = at4.Companion;
        frameLayout.setPadding(0, at4.a.c(aVar, context, 114, false, 4, null), 0, 0);
        this.decorView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.contentWidth, -1);
        layoutParams2.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams2);
        this.rootView = frameLayout2;
        FrameLayout frameLayout3 = this.decorView;
        if (frameLayout3 != null) {
            frameLayout3.addView(frameLayout2);
            LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
            this.lottieView = lottieAnimationView;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 1624, false, 4, null), at4.a.c(aVar, context, 1624, false, 4, null));
            layoutParams3.topMargin = at4.a.c(aVar, context, -100, false, 4, null);
            layoutParams3.leftMargin = at4.a.c(aVar, context, -437, false, 4, null);
            lottieAnimationView.setLayoutParams(layoutParams3);
            LottieAnimationView lottieAnimationView2 = this.lottieView;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setAnimationFromUrl("https://g.alicdn.com/eva-assets/df1a1727e6b415516f2f8c422b3de667/0.0.1/tmp/f1c253b/f1c253b.json");
                LottieAnimationView lottieAnimationView3 = this.lottieView;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.setRepeatCount(-1);
                    LottieAnimationView lottieAnimationView4 = this.lottieView;
                    if (lottieAnimationView4 != null) {
                        lottieAnimationView4.playAnimation();
                        FrameLayout frameLayout4 = this.rootView;
                        if (frameLayout4 != null) {
                            LottieAnimationView lottieAnimationView5 = this.lottieView;
                            if (lottieAnimationView5 != null) {
                                frameLayout4.addView(lottieAnimationView5);
                                FrameLayout frameLayout5 = new FrameLayout(context);
                                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(this.contentWidth, at4.a.c(aVar, context, 1625, false, 4, null));
                                layoutParams4.topMargin = at4.a.c(aVar, context, 327, false, 4, null);
                                layoutParams4.gravity = 1;
                                frameLayout5.setLayoutParams(layoutParams4);
                                this.contentView = frameLayout5;
                                FrameLayout frameLayout6 = this.rootView;
                                if (frameLayout6 != null) {
                                    frameLayout6.addView(frameLayout5);
                                    TUrlImageView tUrlImageView = new TUrlImageView(context);
                                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01LLsfan1SfXWkueiuX_!!6000000002274-2-tps-1254-1384.png");
                                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 625, false, 4, null), at4.a.c(aVar, context, 690, false, 4, null));
                                    layoutParams5.gravity = 1;
                                    tUrlImageView.setLayoutParams(layoutParams5);
                                    FrameLayout frameLayout7 = this.contentView;
                                    if (frameLayout7 != null) {
                                        frameLayout7.addView(tUrlImageView);
                                        LinearLayout linearLayout = new LinearLayout(context);
                                        linearLayout.setOrientation(1);
                                        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(this.contentWidth, at4.a.c(aVar, context, 1625, false, 4, null));
                                        layoutParams6.gravity = 17;
                                        linearLayout.setLayoutParams(layoutParams6);
                                        FrameLayout frameLayout8 = this.contentView;
                                        if (frameLayout8 != null) {
                                            frameLayout8.addView(linearLayout);
                                            TextView textView = new TextView(context);
                                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                                            layoutParams7.topMargin = at4.a.c(aVar, context, 67, false, 4, null);
                                            layoutParams7.gravity = 1;
                                            textView.setLayoutParams(layoutParams7);
                                            mqu.a aVar2 = mqu.Companion;
                                            textView.setText(aVar2.i(aVar2.j(map, "title"), ""));
                                            textView.setTextSize(0, at4.a.c(aVar, context, 46, false, 4, null));
                                            textView.setTextColor(Color.rgb(255, 0, 54));
                                            textView.setTypeface(null, 1);
                                            linearLayout.addView(textView);
                                            LinearLayout linearLayout2 = new LinearLayout(context);
                                            linearLayout2.setOrientation(0);
                                            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, at4.a.c(aVar, context, 136, false, 4, null));
                                            layoutParams8.topMargin = at4.a.c(aVar, context, 17, false, 4, null);
                                            layoutParams8.gravity = 1;
                                            linearLayout2.setLayoutParams(layoutParams8);
                                            linearLayout.addView(linearLayout2);
                                            View createSlotView = createSlotView();
                                            if (createSlotView != null) {
                                                linearLayout2.addView(createSlotView);
                                            }
                                            TextView textView2 = new TextView(context);
                                            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
                                            layoutParams9.gravity = 80;
                                            layoutParams9.bottomMargin = at4.a.c(aVar, context, 8, false, 4, null);
                                            textView2.setLayoutParams(layoutParams9);
                                            textView2.setText(aVar2.i(aVar2.j(map, "tokenUnit"), ""));
                                            textView2.setTextSize(0, at4.a.c(aVar, context, 46, false, 4, null));
                                            textView2.setTextColor(Color.rgb(255, 0, 54));
                                            textView2.setTypeface(null, 1);
                                            linearLayout2.addView(textView2);
                                            TextView textView3 = new TextView(context);
                                            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
                                            layoutParams10.topMargin = at4.a.c(aVar, context, 31, false, 4, null);
                                            layoutParams10.gravity = 1;
                                            textView3.setLayoutParams(layoutParams10);
                                            textView3.setText(aVar2.i(aVar2.j(map, "content"), ""));
                                            textView3.setTextSize(0, at4.a.c(aVar, context, 32, false, 4, null));
                                            textView3.setTextColor(Color.argb(127, 255, 0, 55));
                                            linearLayout.addView(textView3);
                                            FrameLayout frameLayout9 = new FrameLayout(context);
                                            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 430, false, 4, null), at4.a.c(aVar, context, 120, false, 4, null));
                                            layoutParams11.topMargin = at4.a.c(aVar, context, 204, false, 4, null);
                                            layoutParams11.gravity = 1;
                                            frameLayout9.setLayoutParams(layoutParams11);
                                            linearLayout.addView(frameLayout9);
                                            TUrlImageView tUrlImageView2 = new TUrlImageView(context);
                                            tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01p3gwej1fphJIts5Hq_!!6000000004056-2-tps-924-304.png");
                                            FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 430, false, 4, null), at4.a.c(aVar, context, 120, false, 4, null));
                                            layoutParams12.gravity = 17;
                                            tUrlImageView2.setLayoutParams(layoutParams12);
                                            frameLayout9.addView(tUrlImageView2);
                                            TextView textView4 = new TextView(context);
                                            FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, -2);
                                            layoutParams13.gravity = 1;
                                            layoutParams13.topMargin = at4.a.c(aVar, context, 25, false, 4, null);
                                            textView4.setLayoutParams(layoutParams13);
                                            textView4.setText(aVar2.i(aVar2.j(map, "buttonTitle"), ""));
                                            textView4.setTextSize(0, at4.a.c(aVar, context, 40, false, 4, null));
                                            textView4.setTextColor(Color.rgb(255, 0, 54));
                                            textView4.setTypeface(null, 1);
                                            frameLayout9.addView(textView4);
                                            frameLayout9.setOnClickListener(new k());
                                            TUrlImageView tUrlImageView3 = new TUrlImageView(context);
                                            tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN014Ox3dR1OxAGy4cTAH_!!6000000001771-2-tps-73-72.png");
                                            FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 72, false, 4, null), at4.a.c(aVar, context, 72, false, 4, null));
                                            layoutParams14.gravity = 1;
                                            layoutParams14.topMargin = at4.a.c(aVar, context, 1050, false, 4, null);
                                            tUrlImageView3.setLayoutParams(layoutParams14);
                                            tUrlImageView3.setOnClickListener(new j(context));
                                            FrameLayout frameLayout10 = this.rootView;
                                            if (frameLayout10 != null) {
                                                frameLayout10.addView(tUrlImageView3);
                                                TUrlImageView tUrlImageView4 = new TUrlImageView(context);
                                                tUrlImageView4.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01zKvDM31KzDc4bX9EH_!!6000000001234-2-tps-117-120.png");
                                                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 118, false, 4, null), at4.a.c(aVar, context, 118, false, 4, null));
                                                layoutParams15.gravity = 5;
                                                layoutParams15.rightMargin = at4.a.c(aVar, context, 18, false, 4, null);
                                                layoutParams15.topMargin = at4.a.c(aVar, context, 875, false, 4, null);
                                                tUrlImageView4.setLayoutParams(layoutParams15);
                                                this.coinImage = tUrlImageView4;
                                                FrameLayout frameLayout11 = this.rootView;
                                                if (frameLayout11 != null) {
                                                    frameLayout11.addView(tUrlImageView4);
                                                    TUrlImageView tUrlImageView5 = new TUrlImageView(context);
                                                    tUrlImageView5.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN019kfyT21pfkrsjjg7T_!!6000000005388-2-tps-364-378.png");
                                                    FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 150, false, 4, null), at4.a.c(aVar, context, 150, false, 4, null));
                                                    layoutParams16.gravity = 85;
                                                    layoutParams16.rightMargin = at4.a.c(aVar, context, -100, false, 4, null);
                                                    layoutParams16.bottomMargin = at4.a.c(aVar, context, 100, false, 4, null);
                                                    tUrlImageView5.setLayoutParams(layoutParams16);
                                                    this.handImage = tUrlImageView5;
                                                    FrameLayout frameLayout12 = this.rootView;
                                                    if (frameLayout12 != null) {
                                                        frameLayout12.addView(tUrlImageView5);
                                                        FrameLayout frameLayout13 = this.decorView;
                                                        if (frameLayout13 != null) {
                                                            return frameLayout13;
                                                        }
                                                        ckf.y("decorView");
                                                        throw null;
                                                    }
                                                    ckf.y("rootView");
                                                    throw null;
                                                }
                                                ckf.y("rootView");
                                                throw null;
                                            }
                                            ckf.y("rootView");
                                            throw null;
                                        }
                                        ckf.y("contentView");
                                        throw null;
                                    }
                                    ckf.y("contentView");
                                    throw null;
                                }
                                ckf.y("rootView");
                                throw null;
                            }
                            ckf.y("lottieView");
                            throw null;
                        }
                        ckf.y("rootView");
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
        ckf.y("decorView");
        throw null;
    }

    private final void animate2Dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959ebfe0", new Object[]{this});
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 0.1f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 0.1f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.ALPHA, 1.0f, 0.1f);
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0.0f, at4.a.c(at4.Companion, getContext(), 320, false, 4, null));
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, ofFloat, ofFloat2, ofFloat3, ofFloat4);
            ofPropertyValuesHolder.setDuration(500L);
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.addListener(new a());
            ofPropertyValuesHolder.start();
            return;
        }
        ckf.y("rootView");
        throw null;
    }

    private final LinearLayout createSlotView() {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("e5246c3d", new Object[]{this});
        }
        mqu.a aVar = mqu.Companion;
        String i3 = aVar.i(getData().get("tokenCountStart"), null);
        String i4 = aVar.i(getData().get("tokenCount"), null);
        if (TextUtils.isEmpty(i3) || TextUtils.isEmpty(i4)) {
            return null;
        }
        ckf.d(i3);
        ckf.d(i4);
        setPrice(i3, i4);
        List<Map<String, Object>> initColumnsPosition = initColumnsPosition(this.startPrice);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        at4.a aVar2 = at4.Companion;
        Context context = linearLayout.getContext();
        ckf.f(context, "context");
        int c2 = at4.a.c(aVar2, context, Integer.valueOf(this.slotWidth), false, 4, null);
        Context context2 = linearLayout.getContext();
        ckf.f(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c2, at4.a.c(aVar2, context2, 135, false, 4, null));
        layoutParams.gravity = 80;
        xhv xhvVar = xhv.INSTANCE;
        linearLayout.setLayoutParams(layoutParams);
        Iterator<T> it = initColumnsPosition.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            at4.a aVar3 = at4.Companion;
            Context context3 = linearLayout2.getContext();
            ckf.f(context3, "context");
            Object obj = map.get("width");
            if (obj != null) {
                int c3 = at4.a.c(aVar3, context3, (Integer) obj, false, 4, null);
                Context context4 = linearLayout2.getContext();
                ckf.f(context4, "context");
                Object obj2 = map.get("height");
                if (obj2 != null) {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(c3, at4.a.c(aVar3, context4, (Integer) obj2, false, 4, null));
                    linearLayout2.setOrientation(i2);
                    xhv xhvVar2 = xhv.INSTANCE;
                    linearLayout2.setLayoutParams(layoutParams2);
                    Object obj3 = map.get("value");
                    if (obj3 != null) {
                        Typeface create = Typeface.create(Typeface.createFromAsset(getContext().getAssets(), k7z.ALIBABA_FONT_MIDDLE), 0);
                        for (Map map2 : (List) obj3) {
                            TextView textView = new TextView(getContext());
                            Object obj4 = map2.get("numValue");
                            if (obj4 != null) {
                                textView.setText((String) obj4);
                                at4.a aVar4 = at4.Companion;
                                Context context5 = textView.getContext();
                                ckf.f(context5, "context");
                                textView.setTextSize(0, at4.a.c(aVar4, context5, 130, false, 4, null));
                                textView.setTextColor(Color.rgb(255, 0, 54));
                                textView.setTypeface(create, 0);
                                textView.setGravity(17);
                                Context context6 = textView.getContext();
                                ckf.f(context6, "context");
                                Object obj5 = map2.get("width");
                                if (obj5 != null) {
                                    int c4 = at4.a.c(aVar4, context6, (Integer) obj5, false, 4, null);
                                    Context context7 = textView.getContext();
                                    ckf.f(context7, "context");
                                    textView.setLayoutParams(new LinearLayout.LayoutParams(c4, at4.a.c(aVar4, context7, 135, false, 4, null)));
                                    linearLayout2.addView(textView);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                        at4.a aVar5 = at4.Companion;
                        Context context8 = getContext();
                        Object obj6 = map.get("top");
                        if (obj6 != null) {
                            linearLayout2.setTranslationY(at4.a.c(aVar5, context8, (Integer) obj6, false, 4, null));
                            linearLayout.addView(linearLayout2);
                            i2 = 1;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        zrt.Companion.d(new i(linearLayout), 100L);
        return linearLayout;
    }

    private final List<Map<String, Object>> initColumnsPosition(String str) {
        ArrayList arrayList;
        int i2;
        Map map;
        int i3;
        RedpackageResultPop redpackageResultPop = this;
        String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f2ed8c60", new Object[]{redpackageResultPop, str2});
        }
        ArrayList arrayList2 = new ArrayList();
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            String str3 = "height";
            String str4 = "numValue";
            if (str2.charAt(i4) == '.') {
                i2 = (int) 36.0d;
                length = length;
                map = kotlin.collections.a.k(jpu.a("id", "numberColumn" + i4), jpu.a("left", Integer.valueOf(i5)), jpu.a("top", 0), jpu.a("value", xz3.e(kotlin.collections.a.j(jpu.a(str4, "."), jpu.a("width", Integer.valueOf(i2)), jpu.a("top", 0)))), jpu.a("width", Integer.valueOf(i2)), jpu.a(str3, 135));
                arrayList = arrayList2;
                i3 = 1;
            } else {
                length = length;
                int parseInt = Integer.parseInt(String.valueOf(str2.charAt(i4)));
                ArrayList arrayList3 = new ArrayList();
                int i6 = 0;
                while (i6 <= 9) {
                    arrayList3.add(kotlin.collections.a.j(jpu.a(str4, String.valueOf(i6)), jpu.a("width", 90), jpu.a("top", Integer.valueOf(i6 * 135))));
                    i6++;
                    str4 = str4;
                    arrayList2 = arrayList2;
                    str3 = str3;
                }
                arrayList = arrayList2;
                i3 = 1;
                map = kotlin.collections.a.k(jpu.a("id", "numberColumn" + i4), jpu.a("left", Integer.valueOf(i5)), jpu.a("top", Integer.valueOf((-parseInt) * 135)), jpu.a("value", arrayList3), jpu.a("width", 90), jpu.a(str3, 1350));
                i2 = 90;
            }
            i5 += i2;
            arrayList.add(map);
            this.slotWidth = i5;
            i4 += i3;
            str2 = str;
            arrayList2 = arrayList;
            redpackageResultPop = this;
        }
        return arrayList2;
    }
}
