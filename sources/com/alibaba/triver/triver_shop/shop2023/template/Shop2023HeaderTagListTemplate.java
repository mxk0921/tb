package com.alibaba.triver.triver_shop.shop2023.template;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.HorizontalScrollView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import tb.ckf;
import tb.kew;
import tb.l77;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023HeaderTagListTemplate extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AutoScrollAndScrollableTagView l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AutoScrollAndScrollableTagView extends HorizontalScrollView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View contentView;
        private Animator scrollAnimation;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                ckf.g(animator, "animation");
                AutoScrollAndScrollableTagView.this.setScrollAnimation(null);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ int b;

            public b(int i) {
                this.b = i;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = AutoScrollAndScrollableTagView.this;
                int i = this.b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    autoScrollAndScrollableTagView.scrollTo(i + ((Integer) animatedValue).intValue(), AutoScrollAndScrollableTagView.this.getScrollY());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
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
                    AutoScrollAndScrollableTagView.access$realStart(AutoScrollAndScrollableTagView.this);
                }
            }
        }

        static {
            t2o.a(766510451);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoScrollAndScrollableTagView(Context context) {
            super(context);
            ckf.g(context, "context");
            setSmoothScrollingEnabled(false);
            setHorizontalScrollBarEnabled(false);
        }

        public static final /* synthetic */ void access$realStart(AutoScrollAndScrollableTagView autoScrollAndScrollableTagView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78056ae2", new Object[]{autoScrollAndScrollableTagView});
            } else {
                autoScrollAndScrollableTagView.realStart();
            }
        }

        public static /* synthetic */ Object ipc$super(AutoScrollAndScrollableTagView autoScrollAndScrollableTagView, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023HeaderTagListTemplate$AutoScrollAndScrollableTagView");
        }

        private final void realStart() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b187ffeb", new Object[]{this});
            } else if (this.scrollAnimation == null && (view = this.contentView) != null && view.getWidth() > getWidth()) {
                startLeftToRight(view.getWidth() - getWidth());
            }
        }

        private final void startLeftToRight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54e021c4", new Object[]{this, new Integer(i)});
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i);
            ofInt.setDuration(15000L);
            ofInt.addListener(new a());
            ofInt.addUpdateListener(new b(getScrollX()));
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            this.scrollAnimation = ofInt;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            Animator animator = this.scrollAnimation;
            if (animator != null) {
                animator.cancel();
                setScrollAnimation(null);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final View getContentView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
            }
            return this.contentView;
        }

        public final Animator getScrollAnimation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator) ipChange.ipc$dispatch("c4c259eb", new Object[]{this});
            }
            return this.scrollAnimation;
        }

        public final void pauseAnimation() {
            xhv xhvVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca8a27b5", new Object[]{this});
                return;
            }
            try {
                Animator scrollAnimation = getScrollAnimation();
                if (scrollAnimation == null) {
                    xhvVar = null;
                } else {
                    scrollAnimation.pause();
                    xhvVar = xhv.INSTANCE;
                }
                Result.m1108constructorimpl(xhvVar);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }

        public final void resumeAnimation() {
            xhv xhvVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef216de", new Object[]{this});
                return;
            }
            try {
                if (getScrollAnimation() == null) {
                    realStart();
                    return;
                }
                Animator scrollAnimation = getScrollAnimation();
                if (scrollAnimation != null && scrollAnimation.isRunning()) {
                    Animator scrollAnimation2 = getScrollAnimation();
                    if (scrollAnimation2 == null) {
                        xhvVar = null;
                    } else {
                        scrollAnimation2.resume();
                        xhvVar = xhv.INSTANCE;
                    }
                    Result.m1108constructorimpl(xhvVar);
                }
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }

        public final void setContentView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            } else {
                this.contentView = view;
            }
        }

        public final void setScrollAnimation(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b39a99", new Object[]{this, animator});
            } else {
                this.scrollAnimation = animator;
            }
        }

        public final void startScroll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75254ad6", new Object[]{this});
                return;
            }
            View view = this.contentView;
            if (view != null) {
                view.postDelayed(new c(), 500L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoScrollAndScrollableTagView I = Shop2023HeaderTagListTemplate.this.I();
            if (I != null) {
                I.pauseAnimation();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoScrollAndScrollableTagView I = Shop2023HeaderTagListTemplate.this.I();
            if (I != null) {
                I.resumeAnimation();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoScrollAndScrollableTagView I = Shop2023HeaderTagListTemplate.this.I();
            if (I != null) {
                I.startScroll();
            }
        }
    }

    static {
        t2o.a(766510450);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023HeaderTagListTemplate(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
    }

    public static /* synthetic */ Object ipc$super(Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023HeaderTagListTemplate");
        }
    }

    public final AutoScrollAndScrollableTagView I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollAndScrollableTagView) ipChange.ipc$dispatch("8c471f00", new Object[]{this});
        }
        return this.l;
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a4c36a", new Object[]{this});
            return;
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.l;
        if (autoScrollAndScrollableTagView != null) {
            autoScrollAndScrollableTagView.post(new a());
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9a4ce1", new Object[]{this});
            return;
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.l;
        if (autoScrollAndScrollableTagView != null) {
            autoScrollAndScrollableTagView.post(new b());
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d88e252", new Object[]{this});
            return;
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.l;
        if (autoScrollAndScrollableTagView != null) {
            autoScrollAndScrollableTagView.post(new c());
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        h().k().b((DXRootView) view, new l77(e(), this));
        super.b(view);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d47995", new Object[]{this});
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.l;
        ckf.d(autoScrollAndScrollableTagView);
        return autoScrollAndScrollableTagView;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void k(Context context, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa62ff67", new Object[]{this, context, shopDataParser, shopDXEngine, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        super.k(context, shopDataParser, shopDXEngine, jSONObject);
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = new AutoScrollAndScrollableTagView(context);
        this.l = autoScrollAndScrollableTagView;
        kew.b(autoScrollAndScrollableTagView, g());
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView2 = this.l;
        if (autoScrollAndScrollableTagView2 != null) {
            autoScrollAndScrollableTagView2.setContentView(g());
        }
        q(D().getDXJSONConfig(), shopDataParser.O0().t(D().getData()), true);
    }
}
