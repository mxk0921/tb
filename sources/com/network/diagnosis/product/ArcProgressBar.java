package com.network.diagnosis.product;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.f7l;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ArcProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint allArcPaint;
    private int aniSpeed;
    private String bgArcColor;
    private float bgArcWidth;
    private RectF bgRect;
    private float centerX;
    private float centerY;
    private int[] colors;
    private float curValues;
    private float currentAngle;
    private float degree;
    private Paint degreePaint;
    private int degreeProgressDistance;
    private int diameter;
    private String hintColor;
    private Paint hintPaint;
    private float hintSize;
    private String hintString;
    private boolean isNeedContent;
    private boolean isNeedDial;
    private boolean isNeedUnit;
    private float k;
    private float lastAngle;
    private String longDegreeColor;
    private PaintFlagsDrawFilter mDrawFilter;
    private int mHeight;
    private int mWidth;
    private float maxValues;
    private ValueAnimator progressAnimator;
    private Paint progressPaint;
    private float progressWidth;
    private Matrix rotateMatrix;
    private float startAngle;
    private float sweepAngle;
    private SweepGradient sweepGradient;
    private float textSize;
    private Paint vTextPaint;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            ArcProgressBar.access$002(ArcProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            ArcProgressBar arcProgressBar = ArcProgressBar.this;
            ArcProgressBar.access$102(arcProgressBar, ArcProgressBar.access$000(arcProgressBar) / ArcProgressBar.access$200(ArcProgressBar.this));
        }
    }

    public ArcProgressBar(Context context) {
        super(context, null);
        this.diameter = 500;
        this.startAngle = 135.0f;
        this.sweepAngle = 270.0f;
        this.currentAngle = 0.0f;
        this.colors = new int[]{-16711936, InputDeviceCompat.SOURCE_ANY, -65536, -65536};
        this.maxValues = 60.0f;
        this.curValues = 0.0f;
        this.bgArcWidth = dipToPx(2.0f);
        this.progressWidth = dipToPx(10.0f);
        this.textSize = dipToPx(35.0f);
        this.hintSize = dipToPx(35.0f);
        this.aniSpeed = 1000;
        this.degree = dipToPx(5.0f);
        this.degreeProgressDistance = dipToPx(10.0f);
        this.hintColor = "#FF5000";
        this.longDegreeColor = "#EA7D49";
        this.bgArcColor = "#E8E8E8";
        this.diameter = getScreenHeight() / 4;
        initView();
    }

    public static /* synthetic */ float access$000(ArcProgressBar arcProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f413de55", new Object[]{arcProgressBar})).floatValue();
        }
        return arcProgressBar.currentAngle;
    }

    public static /* synthetic */ float access$002(ArcProgressBar arcProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea198aa9", new Object[]{arcProgressBar, new Float(f)})).floatValue();
        }
        arcProgressBar.currentAngle = f;
        return f;
    }

    public static /* synthetic */ float access$102(ArcProgressBar arcProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4350948", new Object[]{arcProgressBar, new Float(f)})).floatValue();
        }
        arcProgressBar.curValues = f;
        return f;
    }

    public static /* synthetic */ float access$200(ArcProgressBar arcProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e894157", new Object[]{arcProgressBar})).floatValue();
        }
        return arcProgressBar.k;
    }

    private int dipToPx(float f) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbbdcbbe", new Object[]{this, new Float(f)})).intValue();
        }
        float f2 = getContext().getResources().getDisplayMetrics().density * f;
        if (f < 0.0f) {
            i = -1;
        }
        return (int) (f2 + (i * 0.5f));
    }

    private int getScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[]{this})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int getScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    private void initConfig(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d010bf", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ArcProgressBar);
        int color = obtainStyledAttributes.getColor(R.styleable.ArcProgressBar_apb_front_color1, -16711936);
        int color2 = obtainStyledAttributes.getColor(R.styleable.ArcProgressBar_apb_front_color2, color);
        this.colors = new int[]{color, color2, color2};
        this.sweepAngle = obtainStyledAttributes.getInteger(R.styleable.ArcProgressBar_apb_total_angle, 270);
        this.bgArcWidth = obtainStyledAttributes.getDimension(R.styleable.ArcProgressBar_apb_back_width, dipToPx(2.0f));
        this.progressWidth = obtainStyledAttributes.getDimension(R.styleable.ArcProgressBar_apb_front_width, dipToPx(10.0f));
        this.diameter = (int) obtainStyledAttributes.getDimension(R.styleable.ArcProgressBar_apb_layout_diameter, getScreenHeight() / 4.0f);
        this.isNeedContent = obtainStyledAttributes.getBoolean(R.styleable.ArcProgressBar_apb_is_need_content, false);
        this.isNeedUnit = obtainStyledAttributes.getBoolean(R.styleable.ArcProgressBar_apb_is_need_unit, false);
        this.isNeedDial = obtainStyledAttributes.getBoolean(R.styleable.ArcProgressBar_apb_is_need_dial, false);
        this.hintString = obtainStyledAttributes.getString(R.styleable.ArcProgressBar_apb_string_unit);
        this.curValues = obtainStyledAttributes.getFloat(R.styleable.ArcProgressBar_apb_current_value, 0.0f);
        this.maxValues = obtainStyledAttributes.getFloat(R.styleable.ArcProgressBar_apb_max_value, 60.0f);
        setCurrentValues(this.curValues);
        setMaxValues(this.maxValues);
        obtainStyledAttributes.recycle();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.bgRect = new RectF();
        this.degreePaint = new Paint();
        this.allArcPaint = new Paint();
        this.progressPaint = new Paint();
        this.vTextPaint = new Paint();
        this.hintPaint = new Paint();
        this.mDrawFilter = new PaintFlagsDrawFilter(0, 3);
        this.rotateMatrix = new Matrix();
        updateView();
    }

    public static /* synthetic */ Object ipc$super(ArcProgressBar arcProgressBar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/network/diagnosis/product/ArcProgressBar");
    }

    private void setAnimation(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3c799a", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.progressAnimator = ofFloat;
        ofFloat.setDuration(i);
        this.progressAnimator.setTarget(Float.valueOf(this.currentAngle));
        this.progressAnimator.addUpdateListener(new a());
        this.progressAnimator.start();
    }

    private void setIsNeedDial(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071fbfb", new Object[]{this, new Boolean(z)});
        } else {
            this.isNeedDial = z;
        }
    }

    private void setIsNeedUnit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53bda67", new Object[]{this, new Boolean(z)});
        } else {
            this.isNeedUnit = z;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        canvas.setDrawFilter(this.mDrawFilter);
        if (this.isNeedDial) {
            for (int i = 0; i < 90; i++) {
                this.degreePaint.setStrokeWidth(dipToPx(1.4f));
                this.degreePaint.setColor(Color.parseColor(this.longDegreeColor));
                float f = this.centerX;
                float f2 = this.progressWidth;
                int i2 = this.degreeProgressDistance;
                canvas.drawLine(f, f2 + i2, f, f2 + i2 + this.degree, this.degreePaint);
                canvas.rotate(4.0f, this.centerX, this.centerY);
            }
        }
        canvas.drawArc(this.bgRect, this.startAngle, this.sweepAngle, false, this.allArcPaint);
        this.rotateMatrix.setRotate(130.0f, this.centerX, this.centerY);
        this.sweepGradient.setLocalMatrix(this.rotateMatrix);
        this.progressPaint.setShader(this.sweepGradient);
        canvas.drawArc(this.bgRect, this.startAngle, this.currentAngle, false, this.progressPaint);
        if (this.isNeedContent) {
            canvas.drawText(String.format("%.0f", Float.valueOf(this.curValues)).concat(f7l.MOD), this.centerX, this.centerY + (this.textSize / 3.0f), this.vTextPaint);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float f = this.progressWidth;
        int i3 = this.diameter;
        setMeasuredDimension((int) (i3 + f), (int) (f + i3));
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.curValues = 0.0f;
        this.lastAngle = this.currentAngle;
        this.currentAngle = 0.0f;
    }

    public void setBgArcWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a77c41", new Object[]{this, new Integer(i)});
        } else {
            this.bgArcWidth = dipToPx(i);
        }
    }

    public void setCurrentValues(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a99500", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.maxValues;
        if (f > f2) {
            f = f2;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.curValues = f;
        float f3 = this.currentAngle;
        this.lastAngle = f3;
        setAnimation(f3, f * this.k, this.aniSpeed);
    }

    public void setDialIntervalWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d62a8d", new Object[]{this, new Integer(i)});
        } else {
            this.degreeProgressDistance = dipToPx(i);
        }
    }

    public void setDialWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951c8de8", new Object[]{this, new Integer(i)});
        } else {
            this.degree = dipToPx(i);
        }
    }

    public void setDiameter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fddad", new Object[]{this, new Integer(i)});
        } else {
            this.diameter = dipToPx(i);
        }
    }

    public void setHintSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1243f2", new Object[]{this, new Integer(i)});
        } else {
            this.hintSize = i;
        }
    }

    public void setMaxValues(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e066d35", new Object[]{this, new Float(f)});
            return;
        }
        this.maxValues = f;
        this.k = this.sweepAngle / f;
    }

    public void setProgressWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e86b65", new Object[]{this, new Integer(i)});
        } else {
            this.progressWidth = dipToPx(i);
        }
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.textSize = i;
        }
    }

    public void setUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f91b17", new Object[]{this, str});
            return;
        }
        this.hintString = str;
        invalidate();
    }

    public void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        RectF rectF = this.bgRect;
        float f = this.progressWidth;
        rectF.top = f / 2.0f;
        rectF.left = f / 2.0f;
        int i = this.diameter;
        rectF.right = i + (f / 2.0f);
        rectF.bottom = i + (f / 2.0f);
        this.centerX = (i + f) / 2.0f;
        this.centerY = (f + i) / 2.0f;
        this.degreePaint.setColor(Color.parseColor(this.longDegreeColor));
        this.allArcPaint.setAntiAlias(true);
        Paint paint = this.allArcPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.allArcPaint.setStrokeWidth(this.bgArcWidth);
        this.allArcPaint.setColor(Color.parseColor(this.bgArcColor));
        Paint paint2 = this.allArcPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.progressPaint.setAntiAlias(true);
        this.progressPaint.setStyle(style);
        this.progressPaint.setStrokeCap(cap);
        this.progressPaint.setStrokeWidth(this.progressWidth);
        this.progressPaint.setColor(-16711936);
        this.vTextPaint.setTextSize(this.textSize);
        this.vTextPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.vTextPaint.setColor(Color.parseColor(this.hintColor));
        Paint paint3 = this.vTextPaint;
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        this.hintPaint.setTextSize(this.hintSize);
        this.hintPaint.setColor(Color.parseColor(this.hintColor));
        this.hintPaint.setTextAlign(align);
        this.sweepGradient = new SweepGradient(this.centerX, this.centerY, this.colors, (float[]) null);
    }

    public ArcProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.diameter = 500;
        this.startAngle = 135.0f;
        this.sweepAngle = 270.0f;
        this.currentAngle = 0.0f;
        this.colors = new int[]{-16711936, InputDeviceCompat.SOURCE_ANY, -65536, -65536};
        this.maxValues = 60.0f;
        this.curValues = 0.0f;
        this.bgArcWidth = dipToPx(2.0f);
        this.progressWidth = dipToPx(10.0f);
        this.textSize = dipToPx(35.0f);
        this.hintSize = dipToPx(35.0f);
        this.aniSpeed = 1000;
        this.degree = dipToPx(5.0f);
        this.degreeProgressDistance = dipToPx(10.0f);
        this.hintColor = "#FF5000";
        this.longDegreeColor = "#EA7D49";
        this.bgArcColor = "#E8E8E8";
        initConfig(context, attributeSet);
        initView();
    }

    public ArcProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.diameter = 500;
        this.startAngle = 135.0f;
        this.sweepAngle = 270.0f;
        this.currentAngle = 0.0f;
        this.colors = new int[]{-16711936, InputDeviceCompat.SOURCE_ANY, -65536, -65536};
        this.maxValues = 60.0f;
        this.curValues = 0.0f;
        this.bgArcWidth = dipToPx(2.0f);
        this.progressWidth = dipToPx(10.0f);
        this.textSize = dipToPx(35.0f);
        this.hintSize = dipToPx(35.0f);
        this.aniSpeed = 1000;
        this.degree = dipToPx(5.0f);
        this.degreeProgressDistance = dipToPx(10.0f);
        this.hintColor = "#FF5000";
        this.longDegreeColor = "#EA7D49";
        this.bgArcColor = "#E8E8E8";
        initConfig(context, attributeSet);
        initView();
    }
}
