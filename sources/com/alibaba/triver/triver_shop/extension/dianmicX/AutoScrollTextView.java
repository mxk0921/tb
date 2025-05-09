package com.alibaba.triver.triver_shop.extension.dianmicX;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AutoScrollTextView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Animator animator;
    private boolean enableSizeChangeRestartAnimation;
    private long scrollTime = 10000;
    private final TextView textView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
            } else {
                ckf.g(animator, "animation");
            }
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
            AutoScrollTextView autoScrollTextView = AutoScrollTextView.this;
            int i = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                autoScrollTextView.scrollTo(i + ((Integer) animatedValue).intValue(), AutoScrollTextView.this.getScrollY());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
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
            AutoScrollTextView.access$startLeftToRight(AutoScrollTextView.this, this.b);
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
    public static final class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public d(int i) {
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            AutoScrollTextView autoScrollTextView = AutoScrollTextView.this;
            int i = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                autoScrollTextView.scrollTo(i - ((Integer) animatedValue).intValue(), AutoScrollTextView.this.getScrollY());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int width;
            int width2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AutoScrollTextView.access$getAnimator$p(AutoScrollTextView.this) == null && (width = AutoScrollTextView.this.getTextView().getWidth()) > (width2 = AutoScrollTextView.this.getWidth())) {
                AutoScrollTextView.access$startLeftToRight(AutoScrollTextView.this, width - width2);
            }
        }
    }

    static {
        t2o.a(766509313);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollTextView(Context context) {
        super(context);
        ckf.g(context, "context");
        TextView textView = new TextView(getContext());
        this.textView = textView;
        setSmoothScrollingEnabled(false);
        setHorizontalScrollBarEnabled(false);
        textView.setSingleLine();
        addView(textView);
    }

    public static final /* synthetic */ Animator access$getAnimator$p(AutoScrollTextView autoScrollTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("65298876", new Object[]{autoScrollTextView});
        }
        return autoScrollTextView.animator;
    }

    public static final /* synthetic */ void access$startLeftToRight(AutoScrollTextView autoScrollTextView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeac1cb7", new Object[]{autoScrollTextView, new Integer(i)});
        } else {
            autoScrollTextView.startLeftToRight(i);
        }
    }

    public static /* synthetic */ Object ipc$super(AutoScrollTextView autoScrollTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/extension/dianmicX/AutoScrollTextView");
        }
    }

    private final void startLeftToRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e021c4", new Object[]{this, new Integer(i)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i);
        ofInt.setDuration(this.scrollTime);
        ofInt.setRepeatMode(2);
        ofInt.setRepeatCount(-1);
        ofInt.addListener(new a());
        ofInt.addUpdateListener(new b(getScrollX()));
        this.animator = ofInt;
        ofInt.start();
    }

    private final void startRightToLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28ab840", new Object[]{this, new Integer(i)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i);
        ofInt.setDuration(this.scrollTime);
        ofInt.addListener(new c(i));
        ofInt.addUpdateListener(new d(getScrollX()));
        this.animator = ofInt;
        ofInt.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public final boolean getEnableSizeChangeRestartAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a94f7ca", new Object[]{this})).booleanValue();
        }
        return this.enableSizeChangeRestartAnimation;
    }

    public final long getScrollTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1faa3ab", new Object[]{this})).longValue();
        }
        return this.scrollTime;
    }

    public final TextView getTextView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this});
        }
        return this.textView;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.enableSizeChangeRestartAnimation) {
            stopScroll();
            startScroll();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        ckf.g(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (view != this) {
            return;
        }
        if (i == 0) {
            startScroll();
        } else {
            stopScroll();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            startScroll();
        } else {
            stopScroll();
        }
    }

    public final void setEnableSizeChangeRestartAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd71fe42", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSizeChangeRestartAnimation = z;
        }
    }

    public final void setScrollTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b430e361", new Object[]{this, new Long(j)});
        } else {
            this.scrollTime = j;
        }
    }

    public final void startScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75254ad6", new Object[]{this});
        } else {
            this.textView.post(new e());
        }
    }

    public final void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
            return;
        }
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
        }
        this.animator = null;
        scrollTo(0, getScrollY());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attr");
        TextView textView = new TextView(getContext());
        this.textView = textView;
        setSmoothScrollingEnabled(false);
        setHorizontalScrollBarEnabled(false);
        textView.setSingleLine();
        addView(textView);
    }
}
