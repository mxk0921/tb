package com.alibaba.triver.triver_shop.newShop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.ckf;
import tb.d1a;
import tb.dun;
import tb.g1a;
import tb.glk;
import tb.ic1;
import tb.kew;
import tb.khu;
import tb.mjn;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopView extends ShopSwipeListenerLayout implements ShopSwipeListenerLayout.a {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATMOSPHERE_IMG_PATH = "atmosphere_img_path";
    public static final float BABY_SECOND_HEADER_HEIGHT = 166.0f;
    public static final float BABY_SECOND_VIEW_HEIGHT = 48.0f;
    public static final float COMMON_SECOND_VIEW_HEIGHT = 74.0f;
    public static final float COMMON_TOP_HEADER_HEIGHT = 44.0f;
    public static final a Companion = new a(null);
    public static final String DEFAULT_BG_IMAGE_PATH = "default_bg_img_path";
    public static final String DEFAULT_BG_IMG_URL = "https://img.alicdn.com/imgextra/i3/O1CN01biYZKy1dlSGR6Z0Z6_!!6000000003776-2-tps-750-2500.png";
    public static final float HOMEPAGE_SECOND_HEADER_HEIGHT = 118.0f;
    public static final long SHOP_ANIMATION_TIME_MS = 200;
    public static final String SP_NAMESPACE = "nativeShop";
    private int animationUpReservedHeight;
    private boolean atmosphere;
    public TUrlImageView atmosphereImageView;
    public View babySecondView;
    public View babyTopView;
    public TUrlImageView backgroundImage;
    private boolean bigCardMode;
    public View bigCardModeHeaderBG;
    public FrameLayout bottomContainer;
    private d1a<Boolean> canSwipeDownDetector;
    private boolean carShopMode;
    public ShopSwipeListenerLayout centerContainer;
    public View commonSecondView;
    public View commonTopView;
    public Guideline contentBottomLine;
    public View contentTopLine;
    private int contentTopMargin;
    private boolean doingAnimation;
    private boolean enableShopLoft;
    public FrameLayout firstHeadContainer;
    private boolean hasLoft;
    private boolean hasViewPagerScrolling;
    private u1a<? super Boolean, ? super Integer, xhv> headCollapsedCallback;
    private boolean headerHide;
    private final mjn inBabyTab$delegate;
    private boolean inHomePage;
    private boolean isPullDownShopLoftView;
    private long lastAnimationTime;
    private int lastSecondHeaderMoveUpY;
    private long lastSwipeJumpToShopLoftTime;
    public ConstraintLayout rootView;
    public LinearLayout secondHeadContainer;
    public Guideline secondHeaderTopLine;
    public ShopDataParser shopData;
    public View shopLoftEntranceView;
    public View shopLoftPullDownView;
    private int shopLoftViewPullDownDistance;
    private int statusBarSize;
    public View statusBarView;
    private boolean stopScrollAnimation;
    private boolean videoShopMode;
    public View videoShopTabView;
    private g1a<? super Boolean, xhv> willHeadCollapsedCallback;
    private final c shopContentMaxHeightGetter = new b(this);
    private int shopLoftViewPullDownMaxDistance = kew.p(90);
    private final ViewPager.OnPageChangeListener viewPageChangeListener = new ViewPager.OnPageChangeListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.ShopView$viewPageChangeListener$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
            } else if (i2 == 1) {
                ShopView.access$setHasViewPagerScrolling$p(ShopView.this, true);
            } else {
                ShopView.access$setHasViewPagerScrolling$p(ShopView.this, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f2), new Integer(i3)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766509711);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopView f3154a;

        static {
            t2o.a(766509712);
            t2o.a(766509713);
        }

        public b(ShopView shopView) {
            ckf.g(shopView, "this$0");
            this.f3154a = shopView;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView.c
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("14331b55", new Object[]{this})).intValue();
            }
            return this.f3154a.getOtherPageContentMaxHeight();
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView.c
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d48121a", new Object[]{this})).intValue();
            }
            return this.f3154a.getContentMaxHeight();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        int a();

        int b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kew.T(ShopView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements ShopSwipeListenerLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeCancel(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
                return;
            }
            ckf.g(motionEvent, "event");
            if (ShopView.this.getVideoShopMode() && ShopView.this.getInHomePage() && ShopExtKt.H(ShopView.this.getContext())) {
                ShopView.this.onSwipeCancel(motionEvent);
            }
            ShopView.access$pullShopLoftViewStop(ShopView.this, true);
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeDown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            } else {
                ShopView.this.onContainerSwipeDown();
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeUp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
            } else {
                ShopView.this.onContainerSwipeUp();
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeDown(View view, MotionEvent motionEvent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74251660", new Object[]{this, view, motionEvent, new Integer(i)});
                return;
            }
            ckf.g(view, "fromTargetView");
            ckf.g(motionEvent, "event");
            boolean H = ShopExtKt.H(ShopView.this.getContext());
            if (ShopView.this.getVideoShopMode() && ShopView.this.getInHomePage() && H) {
                ShopView.this.onSwipeDown(view, motionEvent, i);
            }
            if (!ShopView.access$getDoingAnimation$p(ShopView.this) && !ShopView.this.getHeaderHide() && H) {
                ShopView.access$pullShopLoftView(ShopView.this, i, true);
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeUp(View view, MotionEvent motionEvent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0e512d9", new Object[]{this, view, motionEvent, new Integer(i)});
                return;
            }
            ckf.g(view, "fromTargetView");
            ckf.g(motionEvent, "event");
            boolean H = ShopExtKt.H(ShopView.this.getContext());
            if (ShopView.this.getVideoShopMode() && ShopView.this.getInHomePage() && H) {
                ShopView.this.onSwipeUp(view, motionEvent, i);
            }
            ShopView.access$pullShopLoftView(ShopView.this, i, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ int c;

        public f(float f, int i) {
            this.b = f;
            this.c = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ShopView.this.getSecondHeadContainer().setTranslationY(this.b + intValue);
                if (!ShopView.this.getBigCardMode() || !ShopView.this.getInHomePage() || ShopView.this.getVideoShopMode()) {
                    kew.d0(ShopView.this.getContentTopLine(), this.c + intValue);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public g(int i) {
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == 977295137) {
                super.onAnimationStart((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopView$onContainerSwipeDown$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            ShopView.this.setHeaderHide(false);
            if ((!ShopView.this.getBigCardMode() || !ShopView.this.getInHomePage()) && !ShopView.this.getVideoShopMode()) {
                kew.d0(ShopView.this.getContentTopLine(), ShopView.this.getContentTopMargin());
            }
            ShopView.this.swipeDownEnd();
            ShopView.access$onCenterContainerAnimationEnd(ShopView.this);
            u1a<Boolean, Integer, xhv> headCollapsedCallback = ShopView.this.getHeadCollapsedCallback();
            if (headCollapsedCallback != null) {
                headCollapsedCallback.invoke(Boolean.TRUE, Integer.valueOf(this.b));
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationStart(animator);
            g1a<Boolean, xhv> willHeadCollapsedCallback = ShopView.this.getWillHeadCollapsedCallback();
            if (willHeadCollapsedCallback != null) {
                willHeadCollapsedCallback.invoke(Boolean.TRUE);
            }
            kew.g0(ShopView.this.getSecondHeadContainer());
            if (ShopView.this.getAtmosphere()) {
                kew.T(ShopView.this.getFirstHeadContainer());
                kew.T(ShopView.this.getStatusBarView());
            }
            ShopView.this.swipeDownStart();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ int c;

        public h(float f, int i) {
            this.b = f;
            this.c = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ShopView.this.getSecondHeadContainer().setTranslationY(this.b - intValue);
                if (!ShopView.this.getBigCardMode() || !ShopView.this.getInHomePage() || ShopView.this.getVideoShopMode()) {
                    kew.d0(ShopView.this.getContentTopLine(), this.c - intValue);
                }
                ShopView.this.swipeUpProgressing(intValue);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public i(int i) {
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 977295137) {
                super.onAnimationStart((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopView$onContainerSwipeUp$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            ShopView.this.setHeaderHide(true);
            ShopView.this.getFirstHeadContainer().setAlpha(1.0f);
            kew.C(ShopView.this.getSecondHeadContainer());
            ShopView.this.swipeUpEnd();
            ShopView.access$onCenterContainerAnimationEnd(ShopView.this);
            u1a<Boolean, Integer, xhv> headCollapsedCallback = ShopView.this.getHeadCollapsedCallback();
            if (headCollapsedCallback != null) {
                headCollapsedCallback.invoke(Boolean.FALSE, Integer.valueOf(this.b));
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationStart(animator);
            ShopView.this.swipeUpStart();
            g1a<Boolean, xhv> willHeadCollapsedCallback = ShopView.this.getWillHeadCollapsedCallback();
            if (willHeadCollapsedCallback != null) {
                willHeadCollapsedCallback.invoke(Boolean.FALSE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j extends glk<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.b = shopView;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopView$special$$inlined$observable$1");
        }

        @Override // tb.glk
        public void c(a0g<?> a0gVar, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48721c3a", new Object[]{this, a0gVar, bool, bool2});
                return;
            }
            ckf.g(a0gVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class k extends glk<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.b = shopView;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopView$special$$inlined$observable$2");
        }

        @Override // tb.glk
        public void c(a0g<?> a0gVar, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48721c3a", new Object[]{this, a0gVar, bool, bool2});
                return;
            }
            ckf.g(a0gVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l extends glk<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.b = shopView;
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopView$special$$inlined$observable$3");
        }

        @Override // tb.glk
        public void c(a0g<?> a0gVar, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48721c3a", new Object[]{this, a0gVar, bool, bool2});
                return;
            }
            ckf.g(a0gVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class m extends glk<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.b = shopView;
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopView$special$$inlined$observable$4");
        }

        @Override // tb.glk
        public void c(a0g<?> a0gVar, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48721c3a", new Object[]{this, a0gVar, bool, bool2});
                return;
            }
            ckf.g(a0gVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context) {
        super(context);
        ckf.g(context, "context");
        Boolean bool = Boolean.FALSE;
        this.inBabyTab$delegate = new j(bool, bool, this);
        init();
    }

    public static final /* synthetic */ boolean access$getDoingAnimation$p(ShopView shopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d522985", new Object[]{shopView})).booleanValue();
        }
        return shopView.doingAnimation;
    }

    public static final /* synthetic */ void access$onCenterContainerAnimationEnd(ShopView shopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a73196", new Object[]{shopView});
        } else {
            shopView.onCenterContainerAnimationEnd();
        }
    }

    public static final /* synthetic */ void access$pullShopLoftView(ShopView shopView, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee571f4", new Object[]{shopView, new Integer(i2), new Boolean(z)});
        } else {
            shopView.pullShopLoftView(i2, z);
        }
    }

    public static final /* synthetic */ void access$pullShopLoftViewStop(ShopView shopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82df63cf", new Object[]{shopView, new Boolean(z)});
        } else {
            shopView.pullShopLoftViewStop(z);
        }
    }

    public static final /* synthetic */ void access$setHasViewPagerScrolling$p(ShopView shopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ee4c7", new Object[]{shopView, new Boolean(z)});
        } else {
            shopView.hasViewPagerScrolling = z;
        }
    }

    private final void bindingView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620aae1", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.shopView_top_header_container);
        ckf.f(findViewById, "rootView.findViewById(R.id.shopView_top_header_container)");
        setFirstHeadContainer((FrameLayout) findViewById);
        View findViewById2 = view.findViewById(R.id.shopView_second_header_container);
        ckf.f(findViewById2, "rootView.findViewById(R.id.shopView_second_header_container)");
        setSecondHeadContainer((LinearLayout) findViewById2);
        View findViewById3 = view.findViewById(R.id.shopView_bottom_container);
        ckf.f(findViewById3, "rootView.findViewById(R.id.shopView_bottom_container)");
        setBottomContainer((FrameLayout) findViewById3);
        View findViewById4 = view.findViewById(R.id.shopView_center_container);
        ckf.f(findViewById4, "rootView.findViewById(R.id.shopView_center_container)");
        setCenterContainer((ShopSwipeListenerLayout) findViewById4);
        View findViewById5 = view.findViewById(R.id.shopView_statusBar);
        ckf.f(findViewById5, "rootView.findViewById(R.id.shopView_statusBar)");
        setStatusBarView(findViewById5);
        View findViewById6 = view.findViewById(R.id.shopView_background_img);
        ckf.f(findViewById6, "rootView.findViewById(R.id.shopView_background_img)");
        setBackgroundImage((TUrlImageView) findViewById6);
        View findViewById7 = view.findViewById(R.id.shopView_content_bottom_line);
        ckf.f(findViewById7, "rootView.findViewById(R.id.shopView_content_bottom_line)");
        setContentBottomLine((Guideline) findViewById7);
        View findViewById8 = view.findViewById(R.id.shopView_atmosphereTabBgPic);
        ckf.f(findViewById8, "rootView.findViewById(R.id.shopView_atmosphereTabBgPic)");
        setAtmosphereImageView((TUrlImageView) findViewById8);
        View findViewById9 = view.findViewById(R.id.shopView_content_top_line);
        ckf.f(findViewById9, "rootView.findViewById(R.id.shopView_content_top_line)");
        setContentTopLine(findViewById9);
        View findViewById10 = view.findViewById(R.id.shopView_second_header_top_line);
        ckf.f(findViewById10, "rootView.findViewById(R.id.shopView_second_header_top_line)");
        setSecondHeaderTopLine((Guideline) findViewById10);
        View findViewById11 = view.findViewById(R.id.shopView_bigCardMode_header_background);
        ckf.f(findViewById11, "rootView.findViewById(R.id.shopView_bigCardMode_header_background)");
        setBigCardModeHeaderBG(findViewById11);
        View findViewById12 = view.findViewById(R.id.shopView_shop_loft_pull_down_view);
        ckf.f(findViewById12, "rootView.findViewById(R.id.shopView_shop_loft_pull_down_view)");
        setShopLoftPullDownView(findViewById12);
    }

    private final void initContentViewScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f565f702", new Object[]{this});
        } else {
            getCenterContainer().setSwipeListener(new e());
        }
    }

    private final void initShopLoftPullDownViewBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe6404f", new Object[]{this});
        } else {
            kew.S(getShopLoftPullDownView(), new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ic1.h0(new Integer[]{-16777216, -16777216, 0})));
        }
    }

    public static /* synthetic */ Object ipc$super(ShopView shopView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopView");
    }

    private final boolean isSecondBabyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff531ef", new Object[]{this})).booleanValue();
        }
        if (this.babySecondView != null) {
            return true;
        }
        return false;
    }

    private final void onCenterContainerAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0271ab", new Object[]{this});
            return;
        }
        this.doingAnimation = false;
        this.lastAnimationTime = System.currentTimeMillis();
    }

    private final void pullShopLoftView(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9d2e09", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (this.enableShopLoft) {
            if (z) {
                kew.C(getShopLoftEntranceView());
                kew.g0(getShopLoftPullDownView());
                this.isPullDownShopLoftView = true;
                int i3 = this.shopLoftViewPullDownDistance;
                if (i3 + i2 >= this.shopLoftViewPullDownMaxDistance) {
                    pullShopLoftViewStop$default(this, false, 1, null);
                    return;
                }
                this.shopLoftViewPullDownDistance = i3 + i2;
            } else if (this.isPullDownShopLoftView) {
                kew.C(getShopLoftEntranceView());
                int i4 = this.shopLoftViewPullDownDistance;
                if (i4 - i2 <= 0) {
                    this.shopLoftViewPullDownDistance = 0;
                } else {
                    this.shopLoftViewPullDownDistance = i4 - i2;
                }
            } else {
                return;
            }
            getCenterContainer().setTranslationY(this.shopLoftViewPullDownDistance);
            Drawable background = getShopLoftPullDownView().getBackground();
            if (background != null) {
                background.setAlpha((int) ((this.shopLoftViewPullDownDistance / this.shopLoftViewPullDownMaxDistance) * 255));
            }
        }
    }

    private final void pullShopLoftViewStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd7d39a", new Object[]{this, new Boolean(z)});
        } else if (this.enableShopLoft) {
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastSwipeJumpToShopLoftTime >= 500) {
                    this.lastSwipeJumpToShopLoftTime = currentTimeMillis;
                    Context context = getContext();
                    ckf.f(context, "context");
                    khu.h(context, getShopData().B0(null));
                }
            }
            this.isPullDownShopLoftView = false;
            getCenterContainer().setTranslationY(0.0f);
            this.shopLoftViewPullDownDistance = 0;
            kew.C(getShopLoftPullDownView());
            kew.g0(getShopLoftEntranceView());
        }
    }

    public static /* synthetic */ void pullShopLoftViewStop$default(ShopView shopView, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6851f88d", new Object[]{shopView, new Boolean(z), new Integer(i2), obj});
        } else if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            shopView.pullShopLoftViewStop(z);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullShopLoftViewStop");
        }
    }

    public static /* synthetic */ void updateContentTopMargin$default(ShopView shopView, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386ca2ed", new Object[]{shopView, new Boolean(z), new Integer(i2), obj});
        } else if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            shopView.updateContentTopMargin(z);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateContentTopMargin");
        }
    }

    public final void addBottomSubscribeGuidView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a25bff", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        int p = kew.p(9);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, kew.p(50), 80);
        layoutParams.bottomMargin = getBottomContainer().getHeight() + p;
        layoutParams.leftMargin = p;
        layoutParams.rightMargin = p;
        layoutParams.setMarginStart(p);
        layoutParams.setMarginEnd(p);
        addView(view, layoutParams);
    }

    public boolean canDoAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f785f954", new Object[]{this})).booleanValue();
        }
        if (!this.stopScrollAnimation && !this.isPullDownShopLoftView) {
            return isAnimationTimeValid();
        }
        return false;
    }

    public boolean canSwipeUpDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48ca8d2", new Object[]{this})).booleanValue();
        }
        return ShopSwipeListenerLayout.a.C0102a.a(this);
    }

    public void changeToBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6db2f", new Object[]{this});
        } else {
            setBigCardMode(true);
        }
    }

    public final void clearCenterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a3e7ce", new Object[]{this});
        } else {
            getCenterContainer().removeAllViews();
        }
    }

    public final int getAnimationUpReservedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb78752", new Object[]{this})).intValue();
        }
        return this.animationUpReservedHeight;
    }

    public final boolean getAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2384da3", new Object[]{this})).booleanValue();
        }
        return this.atmosphere;
    }

    public final TUrlImageView getAtmosphereImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("f1a65aad", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.atmosphereImageView;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("atmosphereImageView");
        throw null;
    }

    public final View getBabySecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d08e2ee", new Object[]{this});
        }
        View view = this.babySecondView;
        if (view != null) {
            return view;
        }
        ckf.y("babySecondView");
        throw null;
    }

    public final View getBabyTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("335aed37", new Object[]{this});
        }
        View view = this.babyTopView;
        if (view != null) {
            return view;
        }
        ckf.y("babyTopView");
        throw null;
    }

    public final TUrlImageView getBackgroundImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("7c99879e", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.backgroundImage;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("backgroundImage");
        throw null;
    }

    public boolean getBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e57d26c8", new Object[]{this})).booleanValue();
        }
        return this.bigCardMode;
    }

    public final View getBigCardModeHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9882f738", new Object[]{this});
        }
        View view = this.bigCardModeHeaderBG;
        if (view != null) {
            return view;
        }
        ckf.y("bigCardModeHeaderBG");
        throw null;
    }

    public final FrameLayout getBottomContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("233b7792", new Object[]{this});
        }
        FrameLayout frameLayout = this.bottomContainer;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("bottomContainer");
        throw null;
    }

    public final d1a<Boolean> getCanSwipeDownDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("12470e6e", new Object[]{this});
        }
        return this.canSwipeDownDetector;
    }

    public boolean getCarShopMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13bfa582", new Object[]{this})).booleanValue();
        }
        return this.carShopMode;
    }

    public final ShopSwipeListenerLayout getCenterContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("294868b5", new Object[]{this});
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.centerContainer;
        if (shopSwipeListenerLayout != null) {
            return shopSwipeListenerLayout;
        }
        ckf.y("centerContainer");
        throw null;
    }

    public final View getCommonSecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("11362e83", new Object[]{this});
        }
        View view = this.commonSecondView;
        if (view != null) {
            return view;
        }
        ckf.y("commonSecondView");
        throw null;
    }

    public final View getCommonTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b78251c2", new Object[]{this});
        }
        View view = this.commonTopView;
        if (view != null) {
            return view;
        }
        ckf.y("commonTopView");
        throw null;
    }

    public final Guideline getContentBottomLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Guideline) ipChange.ipc$dispatch("32176f5", new Object[]{this});
        }
        Guideline guideline = this.contentBottomLine;
        if (guideline != null) {
            return guideline;
        }
        ckf.y("contentBottomLine");
        throw null;
    }

    public int getContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7bec322", new Object[]{this})).intValue();
        }
        if (getBigCardMode() || getCarShopMode() || getHeight() == 0 || getFirstHeadContainer().getHeight() == 0 || getBottomContainer().getHeight() == 0 || getSecondHeadContainer().getHeight() == 0) {
            return 0;
        }
        return ((getHeight() - this.statusBarSize) - getFirstHeadContainer().getHeight()) - getBottomContainer().getHeight();
    }

    public final View getContentTopLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dbb8c1af", new Object[]{this});
        }
        View view = this.contentTopLine;
        if (view != null) {
            return view;
        }
        ckf.y("contentTopLine");
        throw null;
    }

    public final int getContentTopMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8dbeda", new Object[]{this})).intValue();
        }
        return this.contentTopMargin;
    }

    public final boolean getEnableShopLoft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbebb1cb", new Object[]{this})).booleanValue();
        }
        return this.enableShopLoft;
    }

    public final FrameLayout getFirstHeadContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("400db6b", new Object[]{this});
        }
        FrameLayout frameLayout = this.firstHeadContainer;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("firstHeadContainer");
        throw null;
    }

    public final boolean getHasLoft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc841d20", new Object[]{this})).booleanValue();
        }
        return this.hasLoft;
    }

    public final u1a<Boolean, Integer, xhv> getHeadCollapsedCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("172c4b4e", new Object[]{this});
        }
        return this.headCollapsedCallback;
    }

    public final boolean getHeaderHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df882770", new Object[]{this})).booleanValue();
        }
        return this.headerHide;
    }

    public final boolean getInBabyTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b46925cf", new Object[]{this})).booleanValue();
        }
        return ((Boolean) this.inBabyTab$delegate.b(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getInHomePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8143b054", new Object[]{this})).booleanValue();
        }
        return this.inHomePage;
    }

    public final long getLastAnimationTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b8da2c0", new Object[]{this})).longValue();
        }
        return this.lastAnimationTime;
    }

    public int getOtherPageContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14331b55", new Object[]{this})).intValue();
        }
        if (getCarShopMode() || getHeight() == 0 || getFirstHeadContainer().getHeight() == 0 || getBottomContainer().getHeight() == 0 || getSecondHeadContainer().getHeight() == 0) {
            return 0;
        }
        return ((getHeight() - this.statusBarSize) - getFirstHeadContainer().getHeight()) - getBottomContainer().getHeight();
    }

    @Override // android.view.View
    public final ConstraintLayout getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintLayout) ipChange.ipc$dispatch("db507d45", new Object[]{this});
        }
        ConstraintLayout constraintLayout = this.rootView;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    public final LinearLayout getSecondHeadContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("6dc03895", new Object[]{this});
        }
        LinearLayout linearLayout = this.secondHeadContainer;
        if (linearLayout != null) {
            return linearLayout;
        }
        ckf.y("secondHeadContainer");
        throw null;
    }

    public final Guideline getSecondHeaderTopLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Guideline) ipChange.ipc$dispatch("44f13a05", new Object[]{this});
        }
        Guideline guideline = this.secondHeaderTopLine;
        if (guideline != null) {
            return guideline;
        }
        ckf.y("secondHeaderTopLine");
        throw null;
    }

    public final c getShopContentMaxHeightGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9c7b714e", new Object[]{this});
        }
        return this.shopContentMaxHeightGetter;
    }

    public final ShopDataParser getShopData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.shopData;
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopData");
        throw null;
    }

    public final View getShopLoftEntranceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a1031541", new Object[]{this});
        }
        View view = this.shopLoftEntranceView;
        if (view != null) {
            return view;
        }
        ckf.y("shopLoftEntranceView");
        throw null;
    }

    public final View getShopLoftPullDownView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd3e93d2", new Object[]{this});
        }
        View view = this.shopLoftPullDownView;
        if (view != null) {
            return view;
        }
        ckf.y("shopLoftPullDownView");
        throw null;
    }

    public final int getStatusBarSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d074ed26", new Object[]{this})).intValue();
        }
        return this.statusBarSize;
    }

    public final View getStatusBarView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a4bc659", new Object[]{this});
        }
        View view = this.statusBarView;
        if (view != null) {
            return view;
        }
        ckf.y(a5.f2660a);
        throw null;
    }

    public final boolean getStopScrollAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d4d90aa", new Object[]{this})).booleanValue();
        }
        return this.stopScrollAnimation;
    }

    public int getSwipeDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue();
        }
        return this.lastSecondHeaderMoveUpY;
    }

    public boolean getVideoShopMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b7c2d29", new Object[]{this})).booleanValue();
        }
        return this.videoShopMode;
    }

    public final View getVideoShopTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3ece37c8", new Object[]{this});
        }
        View view = this.videoShopTabView;
        if (view != null) {
            return view;
        }
        ckf.y("videoShopTabView");
        throw null;
    }

    public final ViewPager.OnPageChangeListener getViewPageChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("f7c48704", new Object[]{this});
        }
        return this.viewPageChangeListener;
    }

    public final g1a<Boolean, xhv> getWillHeadCollapsedCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ea6a5621", new Object[]{this});
        }
        return this.willHeadCollapsedCallback;
    }

    public void inBabyTabStatusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b19a5", new Object[]{this, new Boolean(z)});
        } else if (isSecondBabyInit()) {
            if (z) {
                kew.g0(getBabySecondView());
            } else {
                kew.B(getBabySecondView());
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout
    public boolean inCenterContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fa114d2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setSwipeListener(this);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_new_native_shop_container, (ViewGroup) null);
        if (inflate != null) {
            setRootView((ConstraintLayout) inflate);
            getRootView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            bindingView(getRootView());
            initShopLoftPullDownViewBG();
            addView(getRootView());
            initContentViewScroll();
            post(new d());
            r54.F(new ShopView$init$2(this));
            Context context = getContext();
            ckf.f(context, "context");
            int y = kew.y(context);
            this.statusBarSize = y;
            updateSecondHeaderTopPosition(y + kew.P(88));
            kew.e(getFirstHeadContainer(), kew.P(88));
            updateBottomGuidLineEnd(kew.d(77));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
    }

    public final boolean isAnimationTimeValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc7162e0", new Object[]{this})).booleanValue();
        }
        if (System.currentTimeMillis() - this.lastAnimationTime <= 400) {
            return false;
        }
        return true;
    }

    public void liveCardExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfd5158", new Object[]{this, new Boolean(z)});
        }
    }

    public void notifyAllTemplateReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc8fa98", new Object[]{this});
            return;
        }
        npp.Companion.b("all template load ready");
        updateContentTopMargin(this.inHomePage);
    }

    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        }
    }

    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
        }
    }

    public void onAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b57976c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.atmosphere = z;
        if (z) {
            kew.g0(getAtmosphereImageView());
            kew.T(getSecondHeadContainer());
            kew.T(getFirstHeadContainer());
            kew.T(getStatusBarView());
            return;
        }
        kew.C(getAtmosphereImageView());
    }

    public void onContainerSwipeDown() {
        boolean z;
        Boolean invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d7c741", new Object[]{this});
        } else if (!this.hasViewPagerScrolling) {
            d1a<Boolean> d1aVar = this.canSwipeDownDetector;
            if (d1aVar == null || (invoke = d1aVar.invoke()) == null) {
                z = true;
            } else {
                z = invoke.booleanValue();
            }
            if (z && this.headerHide && !this.doingAnimation && canDoAnimation()) {
                this.doingAnimation = true;
                getSecondHeadContainer().setVisibility(0);
                int swipeDownDistance = getSwipeDownDistance();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, swipeDownDistance);
                ofInt.addUpdateListener(new f(getSecondHeadContainer().getTranslationY(), kew.z(getContentTopLine())));
                ofInt.addListener(new g(swipeDownDistance));
                ofInt.setDuration(200L);
                ofInt.start();
            }
        }
    }

    public void onContainerSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f2ba", new Object[]{this});
        } else if (!this.hasViewPagerScrolling && !this.headerHide && !this.doingAnimation && canDoAnimation()) {
            this.doingAnimation = true;
            int height = getSecondHeadContainer().getHeight() - this.animationUpReservedHeight;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, height);
            this.lastSecondHeaderMoveUpY = height;
            ofInt.addUpdateListener(new h(getSecondHeadContainer().getTranslationY(), kew.z(getContentTopLine())));
            ofInt.addListener(new i(height));
            ofInt.setDuration(200L);
            ofInt.start();
        }
    }

    public void onHomePageWebViewScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153aca28", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
        } else {
            ShopSwipeListenerLayout.a.C0102a.b(this, motionEvent);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0102a.c(this);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0102a.e(this);
        }
    }

    public void renderAtmosphereImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c285299c", new Object[]{this, str});
        } else if (str != null) {
            getAtmosphereImageView().setImageUrl(str);
        }
    }

    public void renderBgImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7bedcf", new Object[]{this});
            return;
        }
        TUrlImageView backgroundImage = getBackgroundImage();
        String S0 = getShopData().S0();
        if (S0 == null) {
            S0 = "https://img.alicdn.com/imgextra/i3/O1CN01biYZKy1dlSGR6Z0Z6_!!6000000003776-2-tps-750-2500.png";
        }
        backgroundImage.setImageUrl(S0);
    }

    public final void resetScrollContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7bd8ec", new Object[]{this});
        } else {
            this.stopScrollAnimation = false;
        }
    }

    public final void setAnimationUpReservedHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5156a790", new Object[]{this, new Integer(i2)});
        } else {
            this.animationUpReservedHeight = i2;
        }
    }

    public final void setAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba8b289", new Object[]{this, new Boolean(z)});
        } else {
            this.atmosphere = z;
        }
    }

    public final void setAtmosphereImageView(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865a6dc9", new Object[]{this, tUrlImageView});
            return;
        }
        ckf.g(tUrlImageView, "<set-?>");
        this.atmosphereImageView = tUrlImageView;
    }

    public final void setBabySecondView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50e1a", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.babySecondView = view;
    }

    public final void setBabyTopView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64aec89", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.babyTopView = view;
    }

    public final void setBackgroundImage(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b08b8f8", new Object[]{this, tUrlImageView});
            return;
        }
        ckf.g(tUrlImageView, "<set-?>");
        this.backgroundImage = tUrlImageView;
    }

    public void setBigCardMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e24f99c", new Object[]{this, new Boolean(z)});
        } else {
            this.bigCardMode = z;
        }
    }

    public final void setBigCardModeHeaderBG(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cf56a8", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.bigCardModeHeaderBG = view;
    }

    public final void setBottomContainer(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbad55e", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.bottomContainer = frameLayout;
    }

    public final void setBottomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec6ff39", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        getBottomContainer().addView(view);
        kew.L(this, new ShopView$setBottomView$1(this, view));
        getBottomContainer().setElevation(kew.p(50));
        getBottomContainer().setBackgroundColor(-1);
    }

    public final void setCanSwipeDownDetector(d1a<Boolean> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4898862", new Object[]{this, d1aVar});
        } else {
            this.canSwipeDownDetector = d1aVar;
        }
    }

    public void setCarShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8325222", new Object[]{this, new Boolean(z)});
        } else {
            this.carShopMode = z;
        }
    }

    public final void setCenterContainer(ShopSwipeListenerLayout shopSwipeListenerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733ecb7", new Object[]{this, shopSwipeListenerLayout});
            return;
        }
        ckf.g(shopSwipeListenerLayout, "<set-?>");
        this.centerContainer = shopSwipeListenerLayout;
    }

    public final void setCenterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643dc2cf", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        getCenterContainer().addView(view, kew.s(this));
    }

    public final void setCommonSecondView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b86825", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.commonSecondView = view;
    }

    public final void setCommonTopView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273dc65e", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.commonTopView = view;
    }

    public final void setContentBottomLine(Guideline guideline) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d409a6c5", new Object[]{this, guideline});
            return;
        }
        ckf.g(guideline, "<set-?>");
        this.contentBottomLine = guideline;
    }

    public final void setContentTopLine(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33310779", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.contentTopLine = view;
    }

    public final void setContentTopMargin(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933d4370", new Object[]{this, new Integer(i2)});
        } else {
            this.contentTopMargin = i2;
        }
    }

    public final void setEnableShopLoft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcff961", new Object[]{this, new Boolean(z)});
        } else {
            this.enableShopLoft = z;
        }
    }

    public final void setFirstHeadContainer(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826e753d", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.firstHeadContainer = frameLayout;
    }

    public final void setFirstHeaderView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c467029", new Object[]{this, view, new Boolean(z)});
            return;
        }
        ckf.g(view, "view");
        if (z) {
            setBabyTopView(view);
        } else {
            setCommonTopView(view);
        }
        getFirstHeadContainer().addView(view, kew.s(this));
    }

    public final void setHasLoft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca493444", new Object[]{this, new Boolean(z)});
        } else {
            this.hasLoft = z;
        }
    }

    public final void setHeadCollapsedCallback(u1a<? super Boolean, ? super Integer, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf4b826", new Object[]{this, u1aVar});
        } else {
            this.headCollapsedCallback = u1aVar;
        }
    }

    public final void setHeaderHide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4854125c", new Object[]{this, new Boolean(z)});
        } else {
            this.headerHide = z;
        }
    }

    public final void setInBabyTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b2ae75", new Object[]{this, new Boolean(z)});
        } else {
            this.inBabyTab$delegate.a(this, $$delegatedProperties[0], Boolean.valueOf(z));
        }
    }

    public final void setInHomePage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de09a5f8", new Object[]{this, new Boolean(z)});
        } else {
            this.inHomePage = z;
        }
    }

    public final void setLastAnimationTime(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886ac984", new Object[]{this, new Long(j2)});
        } else {
            this.lastAnimationTime = j2;
        }
    }

    public final void setRootView(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89ec9c1", new Object[]{this, constraintLayout});
            return;
        }
        ckf.g(constraintLayout, "<set-?>");
        this.rootView = constraintLayout;
    }

    public final void setSecondHeadContainer(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e72875", new Object[]{this, linearLayout});
            return;
        }
        ckf.g(linearLayout, "<set-?>");
        this.secondHeadContainer = linearLayout;
    }

    public final void setSecondHeaderTopLine(Guideline guideline) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218ef8b5", new Object[]{this, guideline});
            return;
        }
        ckf.g(guideline, "<set-?>");
        this.secondHeaderTopLine = guideline;
    }

    public final void setSecondHeaderView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45177631", new Object[]{this, view, new Boolean(z)});
            return;
        }
        ckf.g(view, "view");
        if (z) {
            setBabySecondView(view);
        } else {
            setCommonSecondView(view);
        }
        getSecondHeadContainer().addView(view);
    }

    public final void setShopData(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "<set-?>");
        this.shopData = shopDataParser;
    }

    public void setShopLoftEntrance(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497e740c", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        setShopLoftEntranceView(view);
        getSecondHeadContainer().addView(view);
    }

    public final void setShopLoftEntranceView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3647f27", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.shopLoftEntranceView = view;
    }

    public final void setShopLoftPullDownView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe98d2b6", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.shopLoftPullDownView = view;
    }

    public final void setStatusBarHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c3896", new Object[]{this, new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getStatusBarView().getLayoutParams();
        layoutParams.height = i2;
        getStatusBarView().setLayoutParams(layoutParams);
        this.statusBarSize = i2;
    }

    public final void setStatusBarSize(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554ae3c", new Object[]{this, new Integer(i2)});
        } else {
            this.statusBarSize = i2;
        }
    }

    public final void setStatusBarView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da2e4a7", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.statusBarView = view;
    }

    public final void setStopScrollAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c31fffa", new Object[]{this, new Boolean(z)});
        } else {
            this.stopScrollAnimation = z;
        }
    }

    public void setTabViewInVideoShop(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2166837", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        getSecondHeadContainer().addView(view);
        setVideoShopTabView(view);
    }

    public void setVideoShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb35ac5b", new Object[]{this, new Boolean(z)});
        } else {
            this.videoShopMode = z;
        }
    }

    public final void setVideoShopTabView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76218780", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.videoShopTabView = view;
    }

    public final void setWillHeadCollapsedCallback(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d63d15", new Object[]{this, g1aVar});
        } else {
            this.willHeadCollapsedCallback = g1aVar;
        }
    }

    public final void stopScrollContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59789359", new Object[]{this});
        } else {
            this.stopScrollAnimation = true;
        }
    }

    public void swipeDownEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a680146", new Object[]{this});
        } else if (!getBigCardMode()) {
            kew.T(getFirstHeadContainer());
            kew.T(getStatusBarView());
        }
    }

    public void swipeDownProgressing(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f4103", new Object[]{this, new Integer(i2)});
        }
    }

    public void swipeDownStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f9584d", new Object[]{this});
        }
    }

    public void swipeUpEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3047ead", new Object[]{this});
        }
    }

    public void swipeUpProgressing(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbe77c", new Object[]{this, new Integer(i2)});
        }
    }

    public void swipeUpStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686c17f4", new Object[]{this});
        } else if (!this.atmosphere) {
            getFirstHeadContainer().setBackgroundColor(-1);
            getStatusBarView().setBackgroundColor(-1);
        }
    }

    public void switchToBabyBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1dc2ac", new Object[]{this});
            return;
        }
        setInBabyTab(true);
        kew.C(getCommonTopView());
        kew.g0(getCommonSecondView());
        kew.g0(getBabyTopView());
        kew.g0(getBabySecondView());
    }

    public void switchToHomePageBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96961df4", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        kew.g0(getCommonTopView());
        kew.g0(getCommonSecondView());
        kew.C(getBabyTopView());
        kew.B(getBabySecondView());
    }

    public void switchToOtherBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd69eef0", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        kew.C(getCommonTopView());
        kew.g0(getCommonSecondView());
        kew.g0(getBabyTopView());
        kew.B(getBabySecondView());
    }

    public final void updateBottomGuidLineEnd(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03bed12", new Object[]{this, new Integer(i2)});
        } else {
            getContentBottomLine().setGuidelineEnd(i2);
        }
    }

    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
            return;
        }
        this.inHomePage = z;
        r54.F(new ShopView$updateContentTopMargin$1(this));
    }

    public final void updateSecondHeaderTopPosition(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de6bc28", new Object[]{this, new Integer(i2)});
        } else {
            getSecondHeaderTopLine().setGuidelineBegin(i2);
        }
    }

    public void updateSubPageChanged(boolean z, String str) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79f7009", new Object[]{this, new Boolean(z), str});
            return;
        }
        updateContentTopMargin(z);
        if (z && getBigCardMode() && !this.headerHide) {
            d1a<Boolean> d1aVar = this.canSwipeDownDetector;
            ckf.d(d1aVar);
            if (!d1aVar.invoke().booleanValue()) {
                getSecondHeadContainer().setBackgroundColor(-1);
                getFirstHeadContainer().setBackgroundColor(-1);
                getStatusBarView().setBackgroundColor(-1);
            }
        }
        if (!this.hasLoft || (z && getBigCardMode())) {
            z2 = false;
        }
        this.enableShopLoft = z2;
    }

    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, view, motionEvent, new Integer(i2)});
        } else {
            ShopSwipeListenerLayout.a.C0102a.d(this, view, motionEvent, i2);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, view, motionEvent, new Integer(i2)});
        } else {
            ShopSwipeListenerLayout.a.C0102a.f(this, view, motionEvent, i2);
        }
    }

    static {
        t2o.a(766509710);
        t2o.a(766509708);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(dun.b(ShopView.class), "inBabyTab", "getInBabyTab()Z");
        dun.f(mutablePropertyReference1Impl);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        Boolean bool = Boolean.FALSE;
        this.inBabyTab$delegate = new k(bool, bool, this);
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ckf.g(context, "context");
        Boolean bool = Boolean.FALSE;
        this.inBabyTab$delegate = new l(bool, bool, this);
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        ckf.g(context, "context");
        Boolean bool = Boolean.FALSE;
        this.inBabyTab$delegate = new m(bool, bool, this);
        init();
    }
}
