package com.taobao.appbundle.remote.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CirclePointLoadingView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator mAnimation;
    private CirclePointView mLeftCircle;
    private CirclePointView mMiddleCircle;
    private CirclePointView mRightCircle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class CirclePointView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Paint mPaint;

        static {
            t2o.a(377487409);
        }

        public CirclePointView(Context context) {
            super(context);
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setDither(true);
            this.mPaint.setColor(Color.parseColor("#999999"));
        }

        public static /* synthetic */ Object ipc$super(CirclePointView circlePointView, String str, Object... objArr) {
            if (str.hashCode() == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/remote/view/CirclePointLoadingView$CirclePointView");
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, getHeight() / 2, this.mPaint);
        }

        public void setEnable(boolean z) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
                return;
            }
            Paint paint = this.mPaint;
            if (z) {
                i = 255;
            } else {
                i = 153;
            }
            paint.setAlpha(i);
            invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (intValue == 0) {
                CirclePointLoadingView.access$000(CirclePointLoadingView.this).setEnable(true);
                CirclePointLoadingView.access$100(CirclePointLoadingView.this).setEnable(false);
                CirclePointLoadingView.access$200(CirclePointLoadingView.this).setEnable(false);
            } else if (intValue == 1) {
                CirclePointLoadingView.access$000(CirclePointLoadingView.this).setEnable(false);
                CirclePointLoadingView.access$100(CirclePointLoadingView.this).setEnable(true);
                CirclePointLoadingView.access$200(CirclePointLoadingView.this).setEnable(false);
            } else {
                CirclePointLoadingView.access$000(CirclePointLoadingView.this).setEnable(false);
                CirclePointLoadingView.access$100(CirclePointLoadingView.this).setEnable(false);
                CirclePointLoadingView.access$200(CirclePointLoadingView.this).setEnable(true);
            }
        }
    }

    static {
        t2o.a(377487407);
    }

    public CirclePointLoadingView(Context context) {
        super(context);
        initView();
        initAnim();
    }

    public static /* synthetic */ CirclePointView access$000(CirclePointLoadingView circlePointLoadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CirclePointView) ipChange.ipc$dispatch("90e7c218", new Object[]{circlePointLoadingView});
        }
        return circlePointLoadingView.mLeftCircle;
    }

    public static /* synthetic */ CirclePointView access$100(CirclePointLoadingView circlePointLoadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CirclePointView) ipChange.ipc$dispatch("1d5bfef7", new Object[]{circlePointLoadingView});
        }
        return circlePointLoadingView.mMiddleCircle;
    }

    public static /* synthetic */ CirclePointView access$200(CirclePointLoadingView circlePointLoadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CirclePointView) ipChange.ipc$dispatch("a9d03bd6", new Object[]{circlePointLoadingView});
        }
        return circlePointLoadingView.mRightCircle;
    }

    private void initAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579f8f48", new Object[]{this});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 3);
        this.mAnimation = ofInt;
        ofInt.setDuration(1000L);
        this.mAnimation.addUpdateListener(new a());
        this.mAnimation.setRepeatCount(-1);
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        setOrientation(0);
        int dip2px = DensityUtil.dip2px(getContext(), 4.0f);
        this.mLeftCircle = new CirclePointView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip2px, dip2px);
        layoutParams.rightMargin = DensityUtil.dip2px(getContext(), 6.0f);
        addView(this.mLeftCircle, layoutParams);
        CirclePointView circlePointView = new CirclePointView(getContext());
        this.mMiddleCircle = circlePointView;
        addView(circlePointView, layoutParams);
        CirclePointView circlePointView2 = new CirclePointView(getContext());
        this.mRightCircle = circlePointView2;
        addView(circlePointView2, new LinearLayout.LayoutParams(dip2px, dip2px));
    }

    public static /* synthetic */ Object ipc$super(CirclePointLoadingView circlePointLoadingView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/remote/view/CirclePointLoadingView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mAnimation.end();
    }

    public void startAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8157c9a", new Object[]{this});
        } else {
            this.mAnimation.start();
        }
    }

    public void stopAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93203a", new Object[]{this});
        } else {
            this.mAnimation.end();
        }
    }
}
