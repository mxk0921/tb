package com.taobao.taolive.room.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.taobao.R;
import tb.t2o;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CircularProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ANIMATION_DURATION = 1500;
    private static final float DEFAULT_MAX_VALUE = 100.0f;
    private static final float DEFAULT_START_ANGLE = 270.0f;
    private Paint backgroundPaint;
    private Paint foregroundPaint;
    private c indeterminateModeChangeListener;
    private Handler indeterminateModeHandler;
    private ValueAnimator progressAnimator;
    private d progressChangeListener;
    private RectF rectF;
    private float progress = 0.0f;
    private float progressMax = 100.0f;
    private float strokeWidth = getResources().getDimension(R.dimen.default_stroke_width);
    private float backgroundStrokeWidth = getResources().getDimension(R.dimen.default_background_stroke_width);
    private int color = -16777216;
    private int backgroundColor = tkt.DEFAULT_SHADOW_COLOR;
    private boolean rightToLeft = true;
    private boolean indeterminateMode = false;
    private float startAngle = DEFAULT_START_ANGLE;
    private Runnable indeterminateModeRunnable = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressBar.access$000(CircularProgressBar.this, floatValue, true);
            if (CircularProgressBar.access$100(CircularProgressBar.this)) {
                float f = (floatValue * 360.0f) / 100.0f;
                CircularProgressBar circularProgressBar = CircularProgressBar.this;
                if (!CircularProgressBar.access$300(circularProgressBar)) {
                    f = -f;
                }
                CircularProgressBar.access$202(circularProgressBar, f + CircularProgressBar.DEFAULT_START_ANGLE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (CircularProgressBar.access$100(CircularProgressBar.this)) {
                CircularProgressBar.access$500(CircularProgressBar.this).postDelayed(CircularProgressBar.access$400(CircularProgressBar.this), 1500L);
                CircularProgressBar circularProgressBar = CircularProgressBar.this;
                CircularProgressBar.access$302(circularProgressBar, true ^ CircularProgressBar.access$300(circularProgressBar));
                if (CircularProgressBar.access$300(CircularProgressBar.this)) {
                    CircularProgressBar.this.setProgressWithAnimation(0.0f);
                    return;
                }
                CircularProgressBar circularProgressBar2 = CircularProgressBar.this;
                circularProgressBar2.setProgressWithAnimation(CircularProgressBar.access$600(circularProgressBar2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
    }

    static {
        t2o.a(779093284);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public static /* synthetic */ void access$000(CircularProgressBar circularProgressBar, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e22046", new Object[]{circularProgressBar, new Float(f), new Boolean(z)});
        } else {
            circularProgressBar.setProgress(f, z);
        }
    }

    public static /* synthetic */ boolean access$100(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd724d15", new Object[]{circularProgressBar})).booleanValue();
        }
        return circularProgressBar.indeterminateMode;
    }

    public static /* synthetic */ float access$202(CircularProgressBar circularProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcb8f6c2", new Object[]{circularProgressBar, new Float(f)})).floatValue();
        }
        circularProgressBar.startAngle = f;
        return f;
    }

    public static /* synthetic */ boolean access$300(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d979e3d3", new Object[]{circularProgressBar})).booleanValue();
        }
        return circularProgressBar.rightToLeft;
    }

    public static /* synthetic */ boolean access$302(CircularProgressBar circularProgressBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("772ee26b", new Object[]{circularProgressBar, new Boolean(z)})).booleanValue();
        }
        circularProgressBar.rightToLeft = z;
        return z;
    }

    public static /* synthetic */ Runnable access$400(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("98651ba6", new Object[]{circularProgressBar});
        }
        return circularProgressBar.indeterminateModeRunnable;
    }

    public static /* synthetic */ Handler access$500(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b9ff0719", new Object[]{circularProgressBar});
        }
        return circularProgressBar.indeterminateModeHandler;
    }

    public static /* synthetic */ float access$600(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb8545dc", new Object[]{circularProgressBar})).floatValue();
        }
        return circularProgressBar.progressMax;
    }

    /* JADX WARN: Finally extract failed */
    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.rectF = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CircularProgressBar, 0, 0);
        try {
            this.progress = obtainStyledAttributes.getFloat(R.styleable.CircularProgressBar_cpb_progress, this.progress);
            this.progressMax = obtainStyledAttributes.getFloat(R.styleable.CircularProgressBar_cpb_progress_max, this.progressMax);
            this.indeterminateMode = obtainStyledAttributes.getBoolean(R.styleable.CircularProgressBar_cpb_indeterminate_mode, this.indeterminateMode);
            this.strokeWidth = obtainStyledAttributes.getDimension(R.styleable.CircularProgressBar_cpb_progressbar_width, this.strokeWidth);
            this.backgroundStrokeWidth = obtainStyledAttributes.getDimension(R.styleable.CircularProgressBar_cpb_background_progressbar_width, this.backgroundStrokeWidth);
            this.color = obtainStyledAttributes.getInt(R.styleable.CircularProgressBar_cpb_progressbar_color, this.color);
            this.backgroundColor = obtainStyledAttributes.getInt(R.styleable.CircularProgressBar_cpb_background_progressbar_color, this.backgroundColor);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setColor(this.backgroundColor);
            Paint paint2 = this.backgroundPaint;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.backgroundPaint.setStrokeWidth(this.backgroundStrokeWidth);
            Paint paint3 = new Paint(1);
            this.foregroundPaint = paint3;
            paint3.setColor(this.color);
            this.foregroundPaint.setStyle(style);
            this.foregroundPaint.setStrokeWidth(this.strokeWidth);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static /* synthetic */ Object ipc$super(CircularProgressBar circularProgressBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/ui/view/CircularProgressBar");
        }
    }

    private void reDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a32ff1e", new Object[]{this});
            return;
        }
        requestLayout();
        invalidate();
    }

    public void enableIndeterminateMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6673e652", new Object[]{this, new Boolean(z)});
            return;
        }
        this.indeterminateMode = z;
        this.rightToLeft = true;
        this.startAngle = DEFAULT_START_ANGLE;
        Handler handler = this.indeterminateModeHandler;
        if (handler != null) {
            handler.removeCallbacks(this.indeterminateModeRunnable);
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler2 = new Handler();
        this.indeterminateModeHandler = handler2;
        if (this.indeterminateMode) {
            handler2.post(this.indeterminateModeRunnable);
        } else {
            setProgress(0.0f, true);
        }
    }

    public int getBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.backgroundColor;
    }

    public float getBackgroundProgressBarWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd86a7b", new Object[]{this})).floatValue();
        }
        return this.backgroundStrokeWidth;
    }

    public int getColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
        }
        return this.color;
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        return this.progress;
    }

    public float getProgressBarWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f8bdfad", new Object[]{this})).floatValue();
        }
        return this.strokeWidth;
    }

    public float getProgressMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d59a22b8", new Object[]{this})).floatValue();
        }
        return this.progressMax;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler = this.indeterminateModeHandler;
        if (handler != null) {
            handler.removeCallbacks(this.indeterminateModeRunnable);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.drawOval(this.rectF, this.backgroundPaint);
        float f = (this.progress * 100.0f) / this.progressMax;
        if (this.rightToLeft) {
            i = 360;
        } else {
            i = AConstants.ArtcErrorAudioDeviceError;
        }
        canvas.drawArc(this.rectF, this.startAngle, (i * f) / 100.0f, false, this.foregroundPaint);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        if (this.indeterminateMode) {
            enableIndeterminateMode(true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
        float f = this.strokeWidth;
        float f2 = this.backgroundStrokeWidth;
        if (f <= f2) {
            f = f2;
        }
        float f3 = f / 2.0f;
        float f4 = 0.0f + f3;
        float f5 = min - f3;
        this.rectF.set(f4, f4, f5, f5);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.backgroundColor = i;
        this.backgroundPaint.setColor(i);
        reDraw();
    }

    public void setBackgroundProgressBarWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b28009", new Object[]{this, new Float(f)});
            return;
        }
        this.backgroundStrokeWidth = f;
        this.backgroundPaint.setStrokeWidth(f);
        reDraw();
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            return;
        }
        this.color = i;
        this.foregroundPaint.setColor(i);
        reDraw();
    }

    public void setOnIndeterminateModeChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5116d1a3", new Object[]{this, cVar});
        }
    }

    public void setOnProgressChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7862b3", new Object[]{this, dVar});
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else {
            setProgress(f, false);
        }
    }

    public void setProgressBarWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52033217", new Object[]{this, new Float(f)});
            return;
        }
        this.strokeWidth = f;
        this.foregroundPaint.setStrokeWidth(f);
        reDraw();
    }

    public void setProgressMax(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a73304", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = 100.0f;
        }
        this.progressMax = f;
        reDraw();
    }

    public void setProgressWithAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f3848a", new Object[]{this, new Float(f)});
        } else {
            setProgressWithAnimation(f, 1500);
        }
    }

    private void setProgress(float f, boolean z) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215a34a", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        if (!z && (valueAnimator = this.progressAnimator) != null) {
            valueAnimator.cancel();
            if (this.indeterminateMode) {
                enableIndeterminateMode(false);
            }
        }
        float f2 = this.progressMax;
        if (f > f2) {
            f = f2;
        }
        this.progress = f;
        invalidate();
    }

    public void setProgressWithAnimation(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7d7fb9", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progress, f);
        this.progressAnimator = ofFloat;
        ofFloat.setDuration(i);
        this.progressAnimator.addUpdateListener(new a());
        this.progressAnimator.start();
    }
}
