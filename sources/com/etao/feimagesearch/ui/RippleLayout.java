package com.etao.feimagesearch.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import tb.a07;
import tb.ckf;
import tb.hfn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RippleLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean animationRunning;
    private AnimatorSet animatorSet;
    private int diameter;
    private boolean hasPrepared;
    private Paint paint;
    private int rippleChildCount;
    private List<RippleCircleView> rippleChildList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RippleCircleView b;
        public final /* synthetic */ FrameLayout.LayoutParams c;

        public a(RippleCircleView rippleCircleView, FrameLayout.LayoutParams layoutParams) {
            this.b = rippleCircleView;
            this.c = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RippleLayout.this.addView(this.b, this.c);
            }
        }
    }

    static {
        t2o.a(481297546);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleLayout(Context context) {
        this(context, 0, 0, null, 14, null);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(RippleLayout rippleLayout, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/RippleLayout");
    }

    private final void prepareRippleConfig() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17f9040", new Object[]{this});
        } else if (!this.hasPrepared) {
            this.hasPrepared = true;
            int f = hfn.f(getWidth(), getHeight());
            if (this.diameter <= 0) {
                this.diameter = f / 2;
            }
            int i2 = this.diameter;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 17;
            float parseFloat = Float.parseFloat(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f / this.diameter)}, 1)));
            ArrayList arrayList = new ArrayList();
            int i3 = this.rippleChildCount;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i4 + 1;
                RippleCircleView rippleCircleView = new RippleCircleView(this);
                post(new a(rippleCircleView, layoutParams));
                rippleCircleView.setAlpha(0.5f);
                this.rippleChildList.add(rippleCircleView);
                float[] fArr = new float[2];
                fArr[0] = 1.0f;
                fArr[i] = parseFloat;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rippleCircleView, "ScaleX", fArr);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(i);
                long j = i4 * 1500;
                ofFloat.setStartDelay(j);
                ofFloat.setDuration(1500L);
                arrayList.add(ofFloat);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rippleCircleView, "ScaleY", 1.0f, parseFloat);
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setRepeatMode(1);
                ofFloat2.setStartDelay(j);
                ofFloat2.setDuration(1500L);
                arrayList.add(ofFloat2);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rippleCircleView, "Alpha", 0.5f, 0.0f);
                ofFloat3.setRepeatCount(-1);
                ofFloat3.setRepeatMode(1);
                ofFloat3.setStartDelay(j);
                ofFloat3.setDuration(1500L);
                arrayList.add(ofFloat3);
                i4 = i5;
                parseFloat = parseFloat;
                i = 1;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.playTogether(arrayList);
            this.animatorSet = animatorSet;
        }
    }

    public final int getDiameter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbfa9cfd", new Object[]{this})).intValue();
        }
        return this.diameter;
    }

    public final Paint getPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("daa8bf5c", new Object[]{this});
        }
        return this.paint;
    }

    public final int getRippleChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("453e8b13", new Object[]{this})).intValue();
        }
        return this.rippleChildCount;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() > 0 || getHeight() > 0) {
            prepareRippleConfig();
        }
    }

    public final void setDiameter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fddad", new Object[]{this, new Integer(i)});
        } else {
            this.diameter = i;
        }
    }

    public final void setPaint(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8629deb8", new Object[]{this, paint});
            return;
        }
        ckf.g(paint, "<set-?>");
        this.paint = paint;
    }

    public final void setRippleChildCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a5fe57", new Object[]{this, new Integer(i)});
        } else {
            this.rippleChildCount = i;
        }
    }

    public final void startRippleAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148fd6a", new Object[]{this});
        } else if (!this.animationRunning) {
            for (RippleCircleView rippleCircleView : this.rippleChildList) {
                rippleCircleView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.start();
            }
            this.animationRunning = true;
        }
    }

    public final void stopRippleAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5690a", new Object[]{this});
        } else if (this.animationRunning) {
            for (RippleCircleView rippleCircleView : this.rippleChildList) {
                rippleCircleView.setVisibility(4);
            }
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.end();
            }
            this.animationRunning = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleLayout(Context context, int i) {
        this(context, i, 0, null, 12, null);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleLayout(Context context, int i, int i2) {
        this(context, i, i2, null, 8, null);
        ckf.g(context, "context");
    }

    public /* synthetic */ RippleLayout(Context context, int i, int i2, AttributeSet attributeSet, int i3, a07 a07Var) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleLayout(Context context, int i, int i2, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        this.diameter = i;
        this.rippleChildCount = i2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#FFFFFF"));
        this.paint = paint;
        this.rippleChildList = new ArrayList();
    }
}
