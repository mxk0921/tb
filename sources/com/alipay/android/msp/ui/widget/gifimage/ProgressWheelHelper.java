package com.alipay.android.msp.ui.widget.gifimage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProgressWheelHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object F = new Object();
    public ProgressCallback C;
    public final View D;
    public int b;
    public int c;
    public int j;
    public boolean q;

    /* renamed from: a  reason: collision with root package name */
    public int f3745a = 28;
    public boolean d = false;
    public double e = 500.0d;
    public final double f = 460.0d;
    public float g = 0.0f;
    public boolean h = true;
    public long i = 210;
    public int k = 16777215;
    public final Paint l = new Paint();
    public final Paint m = new Paint();
    public RectF n = new RectF();
    public float o = 230.0f;
    public long p = 0;
    public float r = 0.0f;
    public float s = 0.0f;
    public boolean t = false;
    public float u = 0.0f;
    public final Point v = new Point(24, 54);
    public final Point w = new Point(49, 76);
    public final Point x = new Point(87, 35);
    public float y = 0.0f;
    public final float z = 0.1f;
    public boolean A = false;
    public boolean B = false;
    public boolean E = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ProgressCallback {
        void onProgressUpdate(float f);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new Parcelable.Creator<WheelSavedState>() { // from class: com.alipay.android.msp.ui.widget.gifimage.ProgressWheelHelper.WheelSavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WheelSavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState) ipChange.ipc$dispatch("13979c17", new Object[]{this, parcel}) : new WheelSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WheelSavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState[]) ipChange.ipc$dispatch("9c282a0e", new Object[]{this, new Integer(i)}) : new WheelSavedState[i];
            }
        };
        int barColor;
        int barWidth;
        int circleRadius;
        boolean fillRadius;
        boolean isSpinning;
        boolean linearProgress;
        float mProgress;
        float mTargetProgress;
        int rimColor;
        int rimWidth;
        float spinSpeed;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.mProgress);
            parcel.writeFloat(this.mTargetProgress);
            parcel.writeByte(this.isSpinning ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.spinSpeed);
            parcel.writeInt(this.barWidth);
            parcel.writeInt(this.barColor);
            parcel.writeInt(this.rimWidth);
            parcel.writeInt(this.rimColor);
            parcel.writeInt(this.circleRadius);
            parcel.writeByte(this.linearProgress ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.fillRadius ? (byte) 1 : (byte) 0);
        }

        public WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.mProgress = parcel.readFloat();
            this.mTargetProgress = parcel.readFloat();
            boolean z = false;
            this.isSpinning = parcel.readByte() != 0;
            this.spinSpeed = parcel.readFloat();
            this.barWidth = parcel.readInt();
            this.barColor = parcel.readInt();
            this.rimWidth = parcel.readInt();
            this.rimColor = parcel.readInt();
            this.circleRadius = parcel.readInt();
            this.linearProgress = parcel.readByte() != 0;
            this.fillRadius = parcel.readByte() != 0 ? true : z;
        }
    }

    public ProgressWheelHelper(View view, int i, int i2, int i3) {
        this.b = 10;
        this.c = 10;
        this.j = -1426128896;
        this.D = view;
        this.j = i3;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb7c9b5", new Object[]{this});
        } else if (this.C != null) {
            this.C.onProgressUpdate(Math.round((this.r * 100.0f) / 360.0f) / 100.0f);
        }
    }

    public void beginDrawTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304e451", new Object[]{this});
            return;
        }
        this.A = true;
        this.B = false;
        this.y = 0.0f;
        this.D.invalidate();
    }

    public int getBarColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73c26600", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int getBarWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa9d7ae3", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int getCircleRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec49472", new Object[]{this})).intValue();
        }
        return this.f3745a;
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        if (this.t) {
            return -1.0f;
        }
        return this.r / 360.0f;
    }

    public int getRimColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0931c5d", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public int getRimWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("576e3140", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public float getSpinSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ec91766", new Object[]{this})).floatValue();
        }
        return this.o / 360.0f;
    }

    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public boolean isSpinning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a72bcb", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public int[] measure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("83d43b7f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int paddingLeft = (this.f3745a * 2) + this.D.getPaddingLeft() + this.D.getPaddingRight();
        int paddingTop = (this.f3745a * 2) + this.D.getPaddingTop() + this.D.getPaddingBottom();
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
        return new int[]{paddingLeft, paddingTop};
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
        this.r = wheelSavedState.mProgress;
        this.s = wheelSavedState.mTargetProgress;
        this.t = wheelSavedState.isSpinning;
        this.o = wheelSavedState.spinSpeed;
        this.b = wheelSavedState.barWidth;
        this.j = wheelSavedState.barColor;
        this.c = wheelSavedState.rimWidth;
        this.k = wheelSavedState.rimColor;
        this.f3745a = wheelSavedState.circleRadius;
        this.q = wheelSavedState.linearProgress;
        this.d = wheelSavedState.fillRadius;
        this.p = SystemClock.uptimeMillis();
    }

    public Parcelable onSaveInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("1ef1250f", new Object[]{this, parcelable});
        }
        WheelSavedState wheelSavedState = new WheelSavedState(parcelable);
        wheelSavedState.mProgress = this.r;
        wheelSavedState.mTargetProgress = this.s;
        wheelSavedState.isSpinning = this.t;
        wheelSavedState.spinSpeed = this.o;
        wheelSavedState.barWidth = this.b;
        wheelSavedState.barColor = this.j;
        wheelSavedState.rimWidth = this.c;
        wheelSavedState.rimColor = this.k;
        wheelSavedState.circleRadius = this.f3745a;
        wheelSavedState.linearProgress = this.q;
        wheelSavedState.fillRadius = this.d;
        return wheelSavedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        setCircleRadius(i);
        setupBounds(i, i2);
        setupPaints();
        this.D.invalidate();
    }

    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.p = SystemClock.uptimeMillis();
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        synchronized (F) {
            this.E = false;
            this.e = 500.0d;
            this.g = 0.0f;
            this.h = true;
            this.i = 210L;
            this.p = 0L;
            this.r = 0.0f;
            this.s = 0.0f;
        }
    }

    public void preDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Point point;
        int i;
        Point point2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77f0197", new Object[]{this, canvas});
            return;
        }
        synchronized (F) {
            try {
                if (this.E) {
                    float width = ((int) this.n.width()) / 110.0f;
                    float f4 = 0.0f;
                    this.u = width * 0.0f;
                    Point point3 = this.v;
                    RectF rectF = this.n;
                    point3.set((int) ((24.0f * width) + rectF.left), (int) ((54.0f * width) + rectF.top));
                    Point point4 = this.w;
                    RectF rectF2 = this.n;
                    point4.set((int) ((49.0f * width) + rectF2.left), (int) ((76.0f * width) + rectF2.top));
                    Point point5 = this.x;
                    RectF rectF3 = this.n;
                    point5.set((int) ((87.0f * width) + rectF3.left), (int) ((width * 35.0f) + rectF3.top));
                    boolean z2 = this.A;
                    if (z2 && !this.B) {
                        canvas.drawArc(this.n, 360.0f, 360.0f, false, this.l);
                        Point point6 = this.v;
                        int i2 = point6.x;
                        float f5 = i2;
                        float f6 = point6.y;
                        float f7 = this.w.x - i2;
                        float f8 = this.y;
                        canvas.drawLine(f5, f6, (f7 * f8) + f5, f6 + ((point2.y - i) * f8), this.l);
                        float f9 = this.y + this.z;
                        this.y = f9;
                        if (f9 >= 1.0f) {
                            this.y = 0.0f;
                            this.B = true;
                        }
                    } else if (z2) {
                        canvas.drawArc(this.n, 360.0f, 360.0f, false, this.l);
                        float f10 = this.v.y;
                        Point point7 = this.w;
                        canvas.drawLine(point.x, f10, point7.x, point7.y, this.l);
                        Point point8 = this.w;
                        float f11 = this.u;
                        float f12 = point8.x - f11;
                        float f13 = point8.y + f11;
                        Point point9 = this.x;
                        float f14 = this.y;
                        canvas.drawLine(f12, f13, f12 + ((point9.x - f12) * f14), f13 + ((point9.y - f13) * f14), this.l);
                        float f15 = this.y + this.z;
                        this.y = f15;
                        if (f15 >= 1.0f) {
                            this.y = 1.0f;
                        }
                    } else {
                        canvas.drawArc(this.n, 360.0f, 360.0f, false, this.m);
                        if (this.t) {
                            long uptimeMillis = SystemClock.uptimeMillis() - this.p;
                            float f16 = (((float) uptimeMillis) * this.o) / 1000.0f;
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
                                    float f17 = (1.0f - cos) * 254.0f;
                                    this.r += this.g - f17;
                                    this.g = f17;
                                }
                            } else {
                                this.i = j + uptimeMillis;
                            }
                            float f18 = this.r + f16;
                            this.r = f18;
                            if (f18 > 360.0f) {
                                this.r = f18 - 360.0f;
                                ProgressCallback progressCallback = this.C;
                                if (progressCallback != null) {
                                    progressCallback.onProgressUpdate(-1.0f);
                                }
                            }
                            this.p = SystemClock.uptimeMillis();
                            float f19 = this.r - 90.0f;
                            float f20 = this.g + 16.0f;
                            if (this.D.isInEditMode()) {
                                f3 = 0.0f;
                                f2 = 135.0f;
                            } else {
                                f3 = f19;
                                f2 = f20;
                            }
                            canvas.drawArc(this.n, f3, f2, false, this.l);
                        } else {
                            float f21 = this.r;
                            if (f21 != this.s) {
                                this.r = Math.min(this.r + ((((float) (SystemClock.uptimeMillis() - this.p)) / 1000.0f) * this.o), this.s);
                                this.p = SystemClock.uptimeMillis();
                            } else {
                                z = false;
                            }
                            if (f21 != this.r) {
                                a();
                            }
                            float f22 = this.r;
                            if (!this.q) {
                                f4 = ((float) (1.0d - Math.pow(1.0f - (f22 / 360.0f), 4.0d))) * 360.0f;
                                f22 = ((float) (1.0d - Math.pow(1.0f - (this.r / 360.0f), 2.0d))) * 360.0f;
                            }
                            if (this.D.isInEditMode()) {
                                f = 360.0f;
                            } else {
                                f = f22;
                            }
                            canvas.drawArc(this.n, f4 - 90.0f, f, false, this.l);
                        }
                    }
                    if (z) {
                        this.D.invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resetCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab64187", new Object[]{this});
            return;
        }
        this.r = 0.0f;
        this.s = 0.0f;
        this.D.invalidate();
    }

    public void setBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9761350a", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        setupPaints();
        if (!this.t) {
            this.D.invalidate();
        }
    }

    public void setBarWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe8bc87", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        if (!this.t) {
            this.D.invalidate();
        }
    }

    public void setCallback(ProgressCallback progressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a507d7", new Object[]{this, progressCallback});
            return;
        }
        this.C = progressCallback;
        if (!this.t) {
            a();
        }
    }

    public void setCircleRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5647ad8", new Object[]{this, new Integer(i)});
            return;
        }
        this.f3745a = i;
        if (!this.t) {
            this.D.invalidate();
        }
    }

    public void setInstantProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9c512d", new Object[]{this, new Float(f)});
            return;
        }
        if (this.t) {
            this.r = 0.0f;
            this.t = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.s) {
            float min = Math.min(f * 360.0f, 360.0f);
            this.s = min;
            this.r = min;
            this.p = SystemClock.uptimeMillis();
            this.D.invalidate();
        }
    }

    public void setLinearProgress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf61239", new Object[]{this, new Boolean(z)});
            return;
        }
        this.q = z;
        if (!this.t) {
            this.D.invalidate();
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        if (this.t) {
            this.r = 0.0f;
            this.t = false;
            a();
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.s;
        if (f != f2) {
            if (this.r == f2) {
                this.p = SystemClock.uptimeMillis();
            }
            this.s = Math.min(f * 360.0f, 360.0f);
            this.D.invalidate();
        }
    }

    public void setRimColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a74a4d", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        setupPaints();
        if (!this.t) {
            this.D.invalidate();
        }
    }

    public void setRimWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292ed1ca", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        if (!this.t) {
            this.D.invalidate();
        }
    }

    public void setSpinSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250a716", new Object[]{this, new Float(f)});
        } else {
            this.o = f * 360.0f;
        }
    }

    public void setupBounds(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141cf539", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int paddingTop = this.D.getPaddingTop();
        int paddingBottom = this.D.getPaddingBottom();
        int paddingLeft = this.D.getPaddingLeft();
        int paddingRight = this.D.getPaddingRight();
        if (!this.d) {
            int i3 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i3, (i2 - paddingBottom) - paddingTop), (this.f3745a * 2) - (this.b * 2));
            int i4 = ((i3 - min) / 2) + paddingLeft;
            int i5 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i6 = this.b;
            this.n = new RectF(i4 + i6, i5 + i6, (i4 + min) - i6, (i5 + min) - i6);
            return;
        }
        int i7 = this.b;
        this.n = new RectF(paddingLeft + i7, paddingTop + i7, (i - paddingRight) - i7, (i2 - paddingBottom) - i7);
    }

    public void setupPaints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd358439", new Object[]{this});
            return;
        }
        this.l.setColor(this.j);
        this.l.setAntiAlias(true);
        Paint paint = this.l;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.l.setStrokeWidth(this.b);
        this.l.setStrokeCap(Paint.Cap.ROUND);
        this.m.setColor(this.k);
        this.m.setAntiAlias(true);
        this.m.setStyle(style);
        this.m.setStrokeWidth(this.c);
    }

    public void spin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88318bc9", new Object[]{this});
            return;
        }
        this.p = SystemClock.uptimeMillis();
        this.t = true;
        this.D.invalidate();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        synchronized (F) {
            this.E = true;
        }
    }

    public void stopSpinning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f543a29f", new Object[]{this});
            return;
        }
        this.t = false;
        this.r = 0.0f;
        this.s = 0.0f;
        this.D.invalidate();
    }
}
