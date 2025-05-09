package com.etao.feimagesearch.result;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.widget.NestedScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView;
import tb.ckf;
import tb.hfn;
import tb.hgw;
import tb.t2o;
import tb.zb7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpOverlaySlice extends MUSOverlaySlice {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean animating;
    private final MUSView childView;
    private final Context ctx;
    private boolean initScrollView;
    private float interceptTouchY;
    private boolean intercepted;
    private final MUSOverlay musOverlay;
    private final MUSOverlayView musOverlayView;
    private NestedScrollView scrollView;
    private final int touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    private float touchY;
    private XslMUSLayout xsearchList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/result/IrpOverlaySlice$onTouchUp$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            IrpOverlaySlice.access$setAnimating$p(IrpOverlaySlice.this, false);
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
            } else {
                IrpOverlaySlice.this.getChildView().setTranslationY(0.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/result/IrpOverlaySlice$onTouchUp$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            IrpOverlaySlice.access$setAnimating$p(IrpOverlaySlice.this, false);
        }
    }

    static {
        t2o.a(481297420);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpOverlaySlice(Context context, MUSView mUSView, MUSOverlay mUSOverlay, MUSOverlayView mUSOverlayView) {
        super(context, mUSView, mUSOverlay, mUSOverlayView);
        ckf.g(context, "ctx");
        ckf.g(mUSView, "childView");
        ckf.g(mUSOverlay, "musOverlay");
        ckf.g(mUSOverlayView, "musOverlayView");
        this.ctx = context;
        this.childView = mUSView;
        this.musOverlay = mUSOverlay;
        this.musOverlayView = mUSOverlayView;
    }

    public static final /* synthetic */ void access$setAnimating$p(IrpOverlaySlice irpOverlaySlice, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b8a028", new Object[]{irpOverlaySlice, new Boolean(z)});
        } else {
            irpOverlaySlice.animating = z;
        }
    }

    public static /* synthetic */ Object ipc$super(IrpOverlaySlice irpOverlaySlice, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/result/IrpOverlaySlice");
    }

    private final void onMoveChild(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3eb3eed", new Object[]{this, new Float(f)});
            return;
        }
        MUSView mUSView = this.childView;
        mUSView.setTranslationY(mUSView.getTranslationY() + f);
        MUSView mUSView2 = this.childView;
        mUSView2.setTranslationY(hfn.b(0.0f, mUSView2.getTranslationY()));
        onScrollChanged(0, 0, 0, 0);
    }

    private final void onTouchUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84367662", new Object[]{this});
        } else if (this.childView.getTranslationY() > 0.1f) {
            if (this.childView.getTranslationY() >= zb7.b(100.0f)) {
                this.musOverlay.fireEvent("close", null);
                this.animating = true;
                MUSView mUSView = this.childView;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mUSView, View.TRANSLATION_Y, mUSView.getTranslationY(), this.childView.getHeight());
                ofFloat.setDuration(300L);
                ofFloat.addListener(new a());
                ofFloat.start();
                new Handler().postDelayed(new b(), 500L);
                return;
            }
            this.animating = true;
            MUSView mUSView2 = this.childView;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mUSView2, View.TRANSLATION_Y, mUSView2.getTranslationY(), 0.0f);
            ofFloat2.addListener(new c());
            ofFloat2.start();
        }
    }

    private final boolean reachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64505a6d", new Object[]{this})).booleanValue();
        }
        if (!this.initScrollView) {
            this.initScrollView = true;
            XslMUSLayout xslMUSLayout = (XslMUSLayout) hgw.d(this, XslMUSLayout.class);
            this.xsearchList = xslMUSLayout;
            if (xslMUSLayout == null) {
                this.scrollView = (NestedScrollView) hgw.d(this, NestedScrollView.class);
            }
        }
        XslMUSLayout xslMUSLayout2 = this.xsearchList;
        if (xslMUSLayout2 != null) {
            return xslMUSLayout2.isReachTop();
        }
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null && nestedScrollView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    public final MUSView getChildView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSView) ipChange.ipc$dispatch("753c1c46", new Object[]{this});
        }
        return this.childView;
    }

    public final Context getCtx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e6adcdf0", new Object[]{this});
        }
        return this.ctx;
    }

    public final MUSOverlay getMusOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlay) ipChange.ipc$dispatch("f157641c", new Object[]{this});
        }
        return this.musOverlay;
    }

    public final MUSOverlayView getMusOverlayView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlayView) ipChange.ipc$dispatch("5b5246bc", new Object[]{this});
        }
        return this.musOverlayView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.animating) {
            return true;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.interceptTouchY = motionEvent.getY();
                this.touchY = motionEvent.getY();
                this.intercepted = false;
            } else if (action == 1) {
                return this.intercepted;
            } else {
                if (action != 2) {
                    if (action == 3) {
                        return this.intercepted;
                    }
                } else if (this.intercepted) {
                    return true;
                } else {
                    float y = this.interceptTouchY - motionEvent.getY();
                    this.interceptTouchY = motionEvent.getY();
                    if (y < 0.0f && Math.abs(y) >= this.touchSlop && reachTop()) {
                        return true;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.animating) {
            return false;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 1) {
                onTouchUp();
            } else if (action == 2) {
                float y = motionEvent.getY() - this.touchY;
                this.touchY = motionEvent.getY();
                if (y > 0.0f) {
                    y *= 0.75f;
                }
                onMoveChild(y);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
