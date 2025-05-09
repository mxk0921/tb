package com.taobao.android.detail.ttdetail.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.mr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LiveIconAnimaView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BAR_COUNT = 3;
    private static final int DELAY = 300;
    private static final int DURATION = 600;
    private boolean hasStarted;
    private ValueAnimator[] mAnimators;
    private float[] mBarHeights;
    private Paint mPaint;
    private RectF[] mRectFs;
    private static final float BAR_WIDTH = mr7.a(2.7f);
    private static final float CORNER_RADIUS = mr7.a(1.6f);
    private static final int BAR_GAP = mr7.a(1.6f);
    private static final int BAR_MARGIN_BOTTOM = mr7.a(4.3f);
    private static final int BAR_MARGIN_LEFT = mr7.a(4.7f);
    private static final int BAR_HEIGHT_START = mr7.a(6.7f);
    private static final int BAR_HEIGHT_END = mr7.a(12.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<LiveIconAnimaView> f6984a;
        private int b;

        static {
            t2o.a(912262904);
        }

        public a(LiveIconAnimaView liveIconAnimaView, int i) {
            this.f6984a = new WeakReference<>(liveIconAnimaView);
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LiveIconAnimaView liveIconAnimaView = this.f6984a.get();
            if (liveIconAnimaView != null) {
                LiveIconAnimaView.access$000(liveIconAnimaView)[this.b] = floatValue;
                liveIconAnimaView.invalidate();
            }
        }
    }

    static {
        t2o.a(912262903);
    }

    public LiveIconAnimaView(Context context) {
        super(context);
        this.mBarHeights = new float[3];
        this.mRectFs = new RectF[3];
        this.mAnimators = new ValueAnimator[3];
        init();
    }

    public static /* synthetic */ float[] access$000(LiveIconAnimaView liveIconAnimaView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("9534030f", new Object[]{liveIconAnimaView});
        }
        return liveIconAnimaView.mBarHeights;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(-1);
    }

    public static /* synthetic */ Object ipc$super(LiveIconAnimaView liveIconAnimaView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/LiveIconAnimaView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        for (int i = 0; i < 3; i++) {
            float height = (getHeight() - BAR_MARGIN_BOTTOM) - this.mBarHeights[i];
            float f = BAR_WIDTH;
            float f2 = BAR_MARGIN_LEFT + ((BAR_GAP + f) * i);
            RectF rectF = this.mRectFs[i];
            if (rectF == null) {
                rectF = new RectF();
            }
            rectF.left = f2;
            rectF.top = height;
            rectF.right = f2 + f;
            rectF.bottom = height + this.mBarHeights[i];
            float f3 = CORNER_RADIUS;
            canvas.drawRoundRect(rectF, f3, f3, this.mPaint);
        }
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else if (!this.hasStarted) {
            for (int i = 0; i < 3; i++) {
                this.mAnimators[i] = ValueAnimator.ofFloat(BAR_HEIGHT_START, BAR_HEIGHT_END);
                this.mAnimators[i].setDuration(600L);
                this.mAnimators[i].setStartDelay(i * 300);
                this.mAnimators[i].setRepeatCount(-1);
                this.mAnimators[i].setRepeatMode(2);
                this.mAnimators[i].addUpdateListener(new a(this, i));
                this.mAnimators[i].start();
            }
            this.hasStarted = true;
        }
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = this.mAnimators[i];
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }

    public LiveIconAnimaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBarHeights = new float[3];
        this.mRectFs = new RectF[3];
        this.mAnimators = new ValueAnimator[3];
        init();
    }
}
