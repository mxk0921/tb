package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CustomProgressWheel extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object w = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f4464a;
    private int b;
    private int c;
    private boolean d;
    private double e;
    private double f;
    private float g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private Paint l;
    private Paint m;
    private RectF n;
    private float o;
    private long p;
    private boolean q;
    private float r;
    private float s;
    private boolean t;
    private ProgressCallback u;
    private boolean v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ProgressCallback {
        void onProgressUpdate(float f);
    }

    public CustomProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4464a = 30;
        this.b = 3;
        this.c = 3;
        this.d = false;
        this.e = 500.0d;
        this.f = 460.0d;
        this.g = 0.0f;
        this.h = true;
        this.i = 210L;
        this.j = Color.parseColor("#1677ff");
        this.k = 16777215;
        this.l = new Paint();
        this.m = new Paint();
        this.n = new RectF();
        this.o = 230.0f;
        this.p = 0L;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = false;
        this.v = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ProgressWheel);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.b = (int) TypedValue.applyDimension(1, this.b, displayMetrics);
        this.c = (int) TypedValue.applyDimension(1, this.c, displayMetrics);
        this.f4464a = (int) TypedValue.applyDimension(1, this.f4464a, displayMetrics);
        spin();
        obtainStyledAttributes.recycle();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.l.setColor(this.j);
        this.l.setAntiAlias(true);
        Paint paint = this.l;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.l.setStrokeWidth(this.b);
        this.m.setColor(this.k);
        this.m.setAntiAlias(true);
        this.m.setStyle(style);
        this.m.setStrokeWidth(this.c);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.u != null) {
            this.u.onProgressUpdate(Math.round((this.r * 100.0f) / 360.0f) / 100.0f);
        }
    }

    public static /* synthetic */ Object ipc$super(CustomProgressWheel customProgressWheel, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/CustomProgressWheel");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        synchronized (w) {
            try {
                if (this.v) {
                    canvas.drawArc(this.n, 360.0f, 360.0f, false, this.m);
                    float f4 = 0.0f;
                    if (this.t) {
                        long uptimeMillis = SystemClock.uptimeMillis() - this.p;
                        float f5 = (((float) uptimeMillis) * this.o) / 1000.0f;
                        long j = this.i;
                        if (j >= 200) {
                            double d = this.e + uptimeMillis;
                            this.e = d;
                            double d2 = this.f;
                            if (d > d2) {
                                this.e = d - d2;
                                this.i = 0L;
                                this.h = !this.h;
                            }
                            float cos = (((float) Math.cos(((this.e / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                            if (this.h) {
                                this.g = cos * 254.0f;
                            } else {
                                float f6 = (1.0f - cos) * 254.0f;
                                this.r += this.g - f6;
                                this.g = f6;
                            }
                        } else {
                            this.i = j + uptimeMillis;
                        }
                        float f7 = this.r + f5;
                        this.r = f7;
                        if (f7 > 360.0f) {
                            this.r = f7 - 360.0f;
                            ProgressCallback progressCallback = this.u;
                            if (progressCallback != null) {
                                progressCallback.onProgressUpdate(-1.0f);
                            }
                        }
                        this.p = SystemClock.uptimeMillis();
                        float f8 = this.r - 90.0f;
                        float f9 = this.g + 16.0f;
                        if (isInEditMode()) {
                            f3 = 0.0f;
                            f2 = 135.0f;
                        } else {
                            f3 = f8;
                            f2 = f9;
                        }
                        canvas.drawArc(this.n, f3, f2, false, this.l);
                    } else {
                        float f10 = this.r;
                        if (f10 != this.s) {
                            this.r = Math.min(this.r + ((((float) (SystemClock.uptimeMillis() - this.p)) / 1000.0f) * this.o), this.s);
                            this.p = SystemClock.uptimeMillis();
                        } else {
                            z = false;
                        }
                        if (f10 != this.r) {
                            b();
                        }
                        float f11 = this.r;
                        if (!this.q) {
                            f4 = ((float) (1.0d - Math.pow(1.0f - (f11 / 360.0f), 4.0d))) * 360.0f;
                            f11 = ((float) (1.0d - Math.pow(1.0f - (this.r / 360.0f), 2.0d))) * 360.0f;
                        }
                        if (isInEditMode()) {
                            f = 360.0f;
                        } else {
                            f = f11;
                        }
                        canvas.drawArc(this.n, f4 - 90.0f, f, false, this.l);
                    }
                    if (z) {
                        invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int paddingLeft = (this.f4464a * 2) + getPaddingLeft() + getPaddingRight();
        int paddingTop = (this.f4464a * 2) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (!this.d) {
            int i5 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i5, (i2 - paddingBottom) - paddingTop), (this.f4464a * 2) - (this.b * 2));
            int i6 = ((i5 - min) / 2) + paddingLeft;
            int i7 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i8 = this.b;
            this.n = new RectF(i6 + i8, i7 + i8, (i6 + min) - i8, (i7 + min) - i8);
        } else {
            int i9 = this.b;
            this.n = new RectF(paddingLeft + i9, paddingTop + i9, (i - paddingRight) - i9, (i2 - paddingBottom) - i9);
        }
        a();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.p = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9761350a", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        a();
        if (!this.t) {
            invalidate();
        }
    }

    public void setCallback(ProgressCallback progressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd88250b", new Object[]{this, progressCallback});
            return;
        }
        this.u = progressCallback;
        if (!this.t) {
            b();
        }
    }

    public void spin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88318bc9", new Object[]{this});
            return;
        }
        this.p = SystemClock.uptimeMillis();
        this.t = true;
        invalidate();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        synchronized (w) {
            this.v = true;
        }
    }

    public CustomProgressWheel(Context context) {
        super(context);
        this.f4464a = 30;
        this.b = 3;
        this.c = 3;
        this.d = false;
        this.e = 500.0d;
        this.f = 460.0d;
        this.g = 0.0f;
        this.h = true;
        this.i = 210L;
        this.j = Color.parseColor("#1677ff");
        this.k = 16777215;
        this.l = new Paint();
        this.m = new Paint();
        this.n = new RectF();
        this.o = 230.0f;
        this.p = 0L;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = false;
        this.v = false;
    }
}
