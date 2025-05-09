package com.alibaba.security.realidentity.ui.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.security.realidentity.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPDetectCoreView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float A = 0.4f;
    public static final int B = -1;
    public static final String z = "RPDetectCoreView";

    /* renamed from: a  reason: collision with root package name */
    public c f2880a;
    public Paint b;
    public Path c;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public long g = -1;
    public long h = -1;
    public float i = -1.0f;
    public float j = -1.0f;
    public boolean k = false;
    public int l;
    public float m;
    public int n;
    public int o;
    public Paint p;
    public ValueAnimator q;
    public int r;
    public Paint s;
    public ValueAnimator t;
    public int u;
    public RectF v;
    public Paint w;
    public int x;
    public int y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            RPDetectCoreView.a(RPDetectCoreView.this).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            RPDetectCoreView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            RPDetectCoreView.a(RPDetectCoreView.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            RPDetectCoreView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a();

        void b();
    }

    public RPDetectCoreView(Context context) {
        super(context);
        b();
    }

    public static /* synthetic */ Paint a(RPDetectCoreView rPDetectCoreView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Paint) ipChange.ipc$dispatch("fbc3b1ad", new Object[]{rPDetectCoreView}) : rPDetectCoreView.p;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        setLayerType(1, null);
        int a2 = e.a(getContext());
        if (e.i(getContext())) {
            a2 = (a2 * 2) / 3;
        }
        this.d = a2;
        this.x = e.d(getContext());
        this.y = e.b(getContext());
        this.f = this.x / 2;
        this.e = getDisplayCenterY();
        this.l = -1;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        this.c = new Path();
        this.o = e.a(getContext(), 7.0f);
        Paint paint2 = new Paint(1);
        this.p = paint2;
        paint2.setColor(-65536);
        Paint paint3 = this.p;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        this.p.setStrokeWidth(e.a(getContext(), 5.0f));
        Paint paint4 = new Paint(1);
        this.s = paint4;
        paint4.setColor(tkt.DEFAULT_LINK_COLOR);
        this.s.setStyle(style);
        this.s.setStrokeWidth(e.a(getContext(), 5.0f));
        Paint paint5 = new Paint(1);
        this.w = paint5;
        paint5.setColor(-16777216);
        this.w.setAlpha(127);
        this.w.setStyle(Paint.Style.FILL);
    }

    private float getCurrentScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bb8babe", new Object[]{this})).floatValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.h;
        if (j != -1) {
            long j2 = this.g;
            if (j2 != -1) {
                float f = this.j;
                if (f != -1.0f) {
                    float f2 = this.i;
                    if (f2 != -1.0f) {
                        long j3 = uptimeMillis - j2;
                        if (j3 <= j) {
                            float f3 = ((float) j3) / ((float) j);
                            if (f3 > 0.4f) {
                                return f;
                            }
                            return f2 + (f3 * (f - f2));
                        }
                    }
                }
            }
        }
        return -1.0f;
    }

    private int getDisplayCenterY() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a95594f2", new Object[]{this})).intValue();
        }
        Context context = getContext();
        if (e.i(getContext())) {
            f = 90.0f;
        } else {
            f = 125.0f;
        }
        return e.a(context, f) + this.d;
    }

    public static /* synthetic */ Object ipc$super(RPDetectCoreView rPDetectCoreView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/widgets/RPDetectCoreView");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.q == null) {
            ValueAnimator duration = ValueAnimator.ofInt(100, 0).setDuration(1000L);
            this.q = duration;
            duration.setRepeatCount(-1);
            this.q.addUpdateListener(new a());
            this.q.start();
        }
        invalidate();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.t == null) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 360).setDuration(2000L);
            this.t = duration;
            duration.setRepeatCount(-1);
            this.t.addUpdateListener(new b());
            this.t.start();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p.setAlpha(0);
            this.q = null;
            invalidate();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.t = null;
            invalidate();
        }
    }

    public int getCircleBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f514d8b", new Object[]{this})).intValue();
        }
        return this.e + this.d;
    }

    public int getCircleCenterY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d52ea178", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int getRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9581002", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.l = i;
        invalidate();
    }

    public void setBreatheColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e00a77c", new Object[]{this, new Integer(i)});
            return;
        }
        this.n = i;
        this.p.setColor(i);
    }

    public void setWaitingColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2475bfc4", new Object[]{this, new Integer(i)});
            return;
        }
        this.r = i;
        this.s.setColor(i);
    }

    public static /* synthetic */ int a(RPDetectCoreView rPDetectCoreView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5184eb8", new Object[]{rPDetectCoreView, new Integer(i)})).intValue();
        }
        rPDetectCoreView.u = i;
        return i;
    }

    public void a(float f, float f2, long j, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57134eeb", new Object[]{this, new Float(f), new Float(f2), new Long(j), cVar});
            return;
        }
        this.i = f;
        this.j = f2;
        this.h = j;
        this.f2880a = cVar;
        this.k = false;
        this.g = SystemClock.uptimeMillis();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        try {
            if (!(getWidth() == 0 || getWidth() == this.x)) {
                this.f = getWidth() / 2;
                int width = getWidth();
                String str = z;
                com.alibaba.security.realidentity.a.a(str, "mViewWidth:" + width);
                this.d = (Math.min(e.b(getContext()), width) / 2) - e.a(getContext(), 50.0f);
                this.e = getDisplayCenterY();
            }
            if (this.v == null) {
                int i = this.f;
                int i2 = this.d;
                int i3 = this.o;
                int i4 = this.e;
                this.v = new RectF((i - i2) - i3, (i4 - i2) - i3, i + i2 + i3, i4 + i2 + i3);
            }
            this.m = getCurrentScale();
            this.c.addCircle(this.f, this.e, this.d, Path.Direction.CW);
            canvas.drawColor(this.l);
            ValueAnimator valueAnimator = this.q;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                canvas.drawCircle(this.f, this.e, this.d + this.o, this.p);
            }
            this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.c, this.b);
            this.b.setXfermode(null);
            ValueAnimator valueAnimator2 = this.t;
            if (valueAnimator2 != null && valueAnimator2.isStarted()) {
                canvas.drawArc(this.v, this.u - 90, 45.0f, false, this.s);
                canvas.drawCircle(this.f, this.e, this.d, this.w);
            }
            if (this.m != -1.0f) {
                invalidate();
                if (!this.k && (cVar = this.f2880a) != null) {
                    cVar.a();
                    this.k = true;
                    return;
                }
                return;
            }
            c cVar2 = this.f2880a;
            if (cVar2 != null) {
                cVar2.b();
                this.f2880a = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e();
        f();
    }

    public RPDetectCoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public RPDetectCoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
