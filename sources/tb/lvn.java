package tb;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.regionedit.MaskView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lvn implements fid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f23596a;
    public final Paint b;
    public final float e;
    public MaskView m;
    public boolean n;
    public boolean o;
    public ValueAnimator q;
    public int r;
    public boolean s;
    public final float c = zb7.b(17.0f);
    public final float d = zb7.b(4.0f);
    public final float f = zb7.b(7.0f);
    public final float g = zb7.b(12.0f);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public boolean p = true;
    public float t = 1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "animation");
            lvn lvnVar = lvn.this;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                lvn.e(lvnVar, ((Integer) animatedValue).intValue());
                lvn.f(lvn.this);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    static {
        t2o.a(481297383);
        t2o.a(481297376);
    }

    public lvn(mh7 mh7Var) {
        Paint paint = new Paint(1);
        this.f23596a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        float b = zb7.b(3.0f);
        this.e = b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(b);
        paint2.setStyle(Paint.Style.FILL);
        setScale(1.0f);
    }

    public static final /* synthetic */ void e(lvn lvnVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ba26d6", new Object[]{lvnVar, new Integer(i)});
        } else {
            lvnVar.r = i;
        }
    }

    public static final /* synthetic */ void f(lvn lvnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba2a6", new Object[]{lvnVar});
        } else {
            lvnVar.t();
        }
    }

    @Override // tb.fid
    public void a(MaskView maskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac2014", new Object[]{this, maskView});
            return;
        }
        ckf.g(maskView, "view");
        this.m = null;
    }

    @Override // tb.fid
    public RectF b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("3528cf94", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.fid
    public void c(MaskView maskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfa2646", new Object[]{this, maskView});
            return;
        }
        ckf.g(maskView, "view");
        this.m = maskView;
        s();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8af242c", new Object[]{this});
        } else {
            this.n = true;
        }
    }

    public final void h(Canvas canvas, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1411e25", new Object[]{this, canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        RectF rectF = this.i;
        float f5 = this.d;
        canvas.drawRoundRect(rectF, f5, f5, this.f23596a);
        canvas.restore();
    }

    public final void i(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0d3779", new Object[]{this, canvas});
            return;
        }
        float centerX = this.h.centerX();
        float centerY = this.h.centerY();
        this.b.setColor(mvn.b());
        canvas.drawCircle(centerX, centerY, this.g, this.b);
        this.b.setColor(mvn.a());
        canvas.drawCircle(centerX, centerY, this.f, this.b);
    }

    public final RectF j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("ef722b3d", new Object[]{this});
        }
        return this.j;
    }

    public RectF k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("9f3d45d3", new Object[]{this});
        }
        return this.l;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null) {
            return false;
        }
        ckf.d(valueAnimator);
        if (valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13986015", new Object[]{this});
        } else if (this.s) {
            this.j.set(this.k);
            this.s = false;
            this.k.setEmpty();
            s();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84643f84", new Object[]{this});
        } else if (!this.s) {
            this.s = true;
            this.k.set(this.j);
        }
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d383140d", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public final void p(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d930f8e", new Object[]{this, rectF});
            return;
        }
        ckf.g(rectF, "percentRegion");
        this.j.set(rectF);
    }

    public final void q(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21960a4", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.o != z) {
            this.o = z;
            if (z2) {
                r(z, 300L);
            } else {
                r(z, 0L);
            }
        }
    }

    public final void r(boolean z, long j) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f521f25", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        if (z) {
            valueAnimator = ValueAnimator.ofInt(0, 100);
        } else {
            valueAnimator = ValueAnimator.ofInt(100, 0);
        }
        this.q = valueAnimator;
        ckf.d(valueAnimator);
        valueAnimator.addUpdateListener(new a());
        ValueAnimator valueAnimator2 = this.q;
        ckf.d(valueAnimator2);
        valueAnimator2.setDuration(j);
        ValueAnimator valueAnimator3 = this.q;
        ckf.d(valueAnimator3);
        valueAnimator3.start();
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        MaskView maskView = this.m;
        if (maskView != null) {
            ckf.d(maskView);
            int realWidth = maskView.getRealWidth();
            MaskView maskView2 = this.m;
            ckf.d(maskView2);
            int realHeight = maskView2.getRealHeight();
            RectF rectF = this.l;
            RectF rectF2 = this.j;
            float f = realWidth;
            float f2 = realHeight;
            rectF.set(rectF2.left * f, rectF2.top * f2, rectF2.right * f, rectF2.bottom * f2);
            t();
        }
    }

    @Override // tb.fid
    public void setScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41af11", new Object[]{this, new Float(f)});
            return;
        }
        this.t = f;
        s();
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61979aa0", new Object[]{this});
            return;
        }
        this.h.set(this.l);
        RectF rectF = this.h;
        float f = rectF.left;
        float f2 = this.t;
        rectF.left = f * f2;
        rectF.top *= f2;
        rectF.right *= f2;
        rectF.bottom *= f2;
        float centerX = rectF.centerX();
        float centerY = this.h.centerY();
        float f3 = this.r / 100.0f;
        float width = (this.h.width() * f3) / 2.0f;
        float height = (this.h.height() * f3) / 2.0f;
        this.h.set(centerX - width, centerY - height, centerX + width, centerY + height);
        this.i.set(this.h);
        RectF rectF2 = this.i;
        float f4 = this.e;
        rectF2.inset(f4 / 2.0f, f4 / 2.0f);
        MaskView maskView = this.m;
        if (maskView != null) {
            maskView.invalidate();
        }
    }

    @Override // tb.fid
    public void d(MaskView maskView, Canvas canvas) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0dfae5e", new Object[]{this, maskView, canvas});
            return;
        }
        ckf.g(maskView, f8v.KEY_TARGET_VIEW);
        ckf.g(canvas, "canvas");
        if (this.p) {
            if (this.o || ((valueAnimator = this.q) != null && valueAnimator.isRunning())) {
                float e = hfn.e(this.h.width(), this.h.height());
                float f = this.c;
                if (e <= (this.e + f) * 2) {
                    f = e / 3;
                }
                RectF rectF = this.h;
                float f2 = rectF.left;
                float f3 = rectF.top;
                h(canvas, f2, f3, f2 + f, f3 + f);
                RectF rectF2 = this.h;
                float f4 = rectF2.right;
                float f5 = rectF2.top;
                h(canvas, f4 - f, f5, f4, f5 + f);
                RectF rectF3 = this.h;
                float f6 = rectF3.left;
                float f7 = rectF3.bottom;
                h(canvas, f6, f7 - f, f6 + f, f7);
                RectF rectF4 = this.h;
                float f8 = rectF4.right;
                float f9 = rectF4.bottom;
                h(canvas, f8 - f, f9 - f, f8, f9);
            } else if (!this.n) {
                i(canvas);
            }
        }
    }
}
