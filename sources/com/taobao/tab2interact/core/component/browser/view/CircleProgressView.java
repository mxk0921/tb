package com.taobao.tab2interact.core.component.browser.view;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gyv;
import tb.j0r;
import tb.s6o;
import tb.sgw;
import tb.t2o;
import tb.vgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CircleProgressView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CircleProgressView";
    private static final String UI_CIRCLE_PROGRESS_BACKGROUND_COLOR = "#B3000000";
    private static final String UI_CIRCLE_PROGRESS_BACKGROUND_STROKE_COLOR = "#444444";
    private static final String UI_CIRCLE_PROGRESS_COLOR = "#FFB600";
    private static final int UI_CIRCLE_PROGRESS_WIDTH = 4;
    private long mCurrentTime;
    private Paint mPaint;
    private float mProgress = 0.0f;
    private ValueAnimator mProgressAnimator;
    private int mProgressBackgroundColor;
    private int mProgressBackgroundStrokeColor;
    private int mProgressColor;
    private c mProgressListener;
    private int mProgressWidth;
    private RectF mRectF;
    private long mTotalTime;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f11822a;
        public final /* synthetic */ long b;
        public final /* synthetic */ CircleProgressView c;

        public a(CircleProgressView circleProgressView, long j, long j2) {
            super(null);
            this.c = circleProgressView;
            this.f11822a = j;
            this.b = j2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/view/CircleProgressView$1");
        }

        @Override // com.taobao.tab2interact.core.component.browser.view.CircleProgressView.b
        public void c(TimeAnimator timeAnimator, long j, long j2) {
            long j3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("664ac0a", new Object[]{this, timeAnimator, new Long(j), new Long(j2)});
            } else if (CircleProgressView.access$100(this.c) != null) {
                long j4 = this.f11822a + j;
                if (j0r.e()) {
                    long j5 = this.b;
                    long j6 = 1;
                    int i = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
                    if (i > 0) {
                        j3 = j5;
                    } else {
                        j3 = 1;
                    }
                    long j7 = j4 % j3;
                    if (j7 == 0) {
                        if (i > 0) {
                            j6 = j5;
                        }
                        if (j4 / j6 != 0) {
                            j4 = j5;
                        }
                    }
                    j4 = j7;
                }
                long access$200 = j4 - CircleProgressView.access$200(this.c);
                CircleProgressView.access$202(this.c, j4);
                CircleProgressView.access$100(this.c).a(this.c.setProgress(b.a(timeAnimator, j4, this.b)), CircleProgressView.access$200(this.c), CircleProgressView.access$300(this.c), access$200);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class b implements TimeAnimator.TimeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(689963077);
        }

        public b() {
        }

        public static float a(TimeAnimator timeAnimator, long j, long j2) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7da0e6ab", new Object[]{timeAnimator, new Long(j), new Long(j2)})).floatValue();
            }
            if (timeAnimator == null) {
                return 0.0f;
            }
            float f2 = ((float) j) * 1.0f;
            if (j2 <= 0) {
                j2 = timeAnimator.getDuration();
            }
            float f3 = f2 / ((float) j2);
            if (timeAnimator.getRepeatCount() >= 0) {
                f = Math.min(f3, timeAnimator.getRepeatCount() + 1);
            } else {
                f = Float.MAX_VALUE;
            }
            float a2 = gyv.a(f3, 0.0f, f);
            return a2 - b(a2);
        }

        public static int b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("389f1b72", new Object[]{new Float(f)})).intValue();
            }
            double d = f;
            double floor = Math.floor(d);
            if (d == floor && f > 0.0f) {
                floor -= 1.0d;
            }
            return (int) floor;
        }

        public abstract void c(TimeAnimator timeAnimator, long j, long j2);

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
            long j3;
            long j4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e65699cc", new Object[]{this, timeAnimator, new Long(j), new Long(j2)});
                return;
            }
            int repeatCount = timeAnimator.getRepeatCount();
            if (repeatCount >= 0) {
                long duration = (repeatCount + 1) * timeAnimator.getDuration();
                if (j >= duration) {
                    timeAnimator.cancel();
                    j3 = duration - (j - j2);
                    j4 = duration;
                    c(timeAnimator, j4, j3);
                }
            }
            j4 = j;
            j3 = j2;
            c(timeAnimator, j4, j3);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(float f, long j, long j2, long j3);
    }

    static {
        t2o.a(689963075);
    }

    public CircleProgressView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ c access$100(CircleProgressView circleProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f31db773", new Object[]{circleProgressView});
        }
        return circleProgressView.mProgressListener;
    }

    public static /* synthetic */ long access$200(CircleProgressView circleProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ebaf850", new Object[]{circleProgressView})).longValue();
        }
        return circleProgressView.mCurrentTime;
    }

    public static /* synthetic */ long access$202(CircleProgressView circleProgressView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caa72d1a", new Object[]{circleProgressView, new Long(j)})).longValue();
        }
        circleProgressView.mCurrentTime = j;
        return j;
    }

    public static /* synthetic */ long access$300(CircleProgressView circleProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45e3da91", new Object[]{circleProgressView})).longValue();
        }
        return circleProgressView.mTotalTime;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint();
        this.mRectF = new RectF();
        this.mProgressWidth = s6o.S(getContext(), 4);
        sgw sgwVar = sgw.INSTANCE;
        this.mProgressColor = sgwVar.a(UI_CIRCLE_PROGRESS_COLOR);
        this.mProgressBackgroundColor = sgwVar.a(UI_CIRCLE_PROGRESS_BACKGROUND_COLOR);
        this.mProgressBackgroundStrokeColor = sgwVar.a(UI_CIRCLE_PROGRESS_BACKGROUND_STROKE_COLOR);
    }

    public static /* synthetic */ Object ipc$super(CircleProgressView circleProgressView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/component/browser/view/CircleProgressView");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        this.mPaint.setAlpha(153);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(this.mProgressBackgroundColor);
        canvas.drawOval(this.mRectF, this.mPaint);
        Paint paint = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.mPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.mPaint.setStrokeWidth(this.mProgressWidth);
        this.mPaint.setColor(this.mProgressBackgroundStrokeColor);
        canvas.drawOval(this.mRectF, this.mPaint);
        this.mPaint.setAlpha(255);
        this.mPaint.setStyle(style);
        this.mPaint.setStrokeCap(cap);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeWidth(this.mProgressWidth);
        this.mPaint.setColor(this.mProgressColor);
        canvas.drawArc(this.mRectF, -90.0f, this.mProgress * 360.0f, false, this.mPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.mProgressWidth / 2.0f;
        float f2 = 0.0f + f;
        this.mRectF.set(f2, f2, i - f, i2 - f);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mProgressAnimator.pause();
            this.mProgressListener.a(this.mProgress, this.mCurrentTime, this.mTotalTime, 0L);
            vgh.c(this, TAG, "【pause】pause, mProgress:" + this.mProgress);
        }
    }

    public float setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bf028ba", new Object[]{this, new Float(f)})).floatValue();
        }
        this.mProgress = gyv.a(f, 0.0f, 1.0f);
        invalidate();
        return this.mProgress;
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressColor = i;
        }
    }

    public void setProgressListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6de0de", new Object[]{this, cVar});
        } else {
            this.mProgressListener = cVar;
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator == null) {
            vgh.c(this, TAG, "【start】mProgressAnimator is null");
        } else if (valueAnimator.isPaused()) {
            this.mProgressAnimator.resume();
            vgh.c(this, TAG, "【start】resume");
        } else if (this.mProgressAnimator.isStarted()) {
            vgh.c(this, TAG, "【start】The animation is started");
        } else if (this.mProgress == 1.0f) {
            vgh.c(this, TAG, "【start】The animation is end");
            this.mProgressListener.a(1.0f, this.mCurrentTime, this.mTotalTime, 0L);
        } else {
            this.mProgressAnimator.start();
            vgh.c(this, TAG, "【start】start");
        }
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void init(long j, long j2, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54c0d5d", new Object[]{this, new Long(j), new Long(j2), new Boolean(z)});
            return;
        }
        vgh.c(this, TAG, "【init】currentTime: " + j + ", totalTime: " + j2);
        long j3 = j > j2 ? j2 : j;
        float f = j2 != 0 ? ((float) j3) / ((float) j2) : 0.0f;
        vgh.c(this, TAG, "【init】currentTime: " + j3 + ", totalTime: " + j2 + ",progress" + f);
        this.mTotalTime = j2;
        this.mCurrentTime = j3;
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator instanceof TimeAnimator) {
            ((TimeAnimator) valueAnimator).setTimeListener(null);
            this.mProgressAnimator.cancel();
        }
        TimeAnimator timeAnimator = new TimeAnimator();
        this.mProgressAnimator = timeAnimator;
        timeAnimator.setInterpolator(new LinearInterpolator());
        this.mProgressAnimator.setDuration(j2 - j3);
        ValueAnimator valueAnimator2 = this.mProgressAnimator;
        if (z) {
            i = -1;
        }
        valueAnimator2.setRepeatCount(i);
        ((TimeAnimator) this.mProgressAnimator).setTimeListener(new a(this, j3, j2));
        setProgress(f);
    }
}
