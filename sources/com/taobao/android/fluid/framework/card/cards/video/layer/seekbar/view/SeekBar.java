package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.jxv;
import tb.r8p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SeekBar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INDICATOR_ALWAYS_HIDE = 1;
    public static final int INDICATOR_ALWAYS_SHOW = 3;
    public static final int INDICATOR_ALWAYS_SHOW_AFTER_TOUCH = 2;
    public static final int INDICATOR_SHOW_WHEN_TOUCH = 0;
    public static final int MATCH_PARENT = -2;
    public static final int WRAP_CONTENT = -1;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7782a;
    public final RangeSeekBar b;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public Bitmap n;
    public Bitmap o;
    public Bitmap p;
    public ValueAnimator q;
    public int t;
    public int u;
    public int w;
    public int x;
    public int y;
    public int z;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Paint f = new Paint(1);
    public float m = 0.0f;
    public boolean r = false;
    public boolean s = true;
    public boolean v = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface IndicatorModeDef {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            SeekBar.this.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RangeSeekBar rangeSeekBar = SeekBar.this.b;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/seekbar/view/SeekBar$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            SeekBar seekBar = SeekBar.this;
            seekBar.m = 0.0f;
            RangeSeekBar rangeSeekBar = seekBar.b;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    static {
        t2o.a(468714029);
    }

    public SeekBar(RangeSeekBar rangeSeekBar, AttributeSet attributeSet, boolean z) {
        this.b = rangeSeekBar;
        this.f7782a = z;
        r(attributeSet);
        s();
        t();
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae742cd8", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7548c916", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            this.x = i;
            this.p = BitmapFactory.decodeResource(l(), i);
        }
    }

    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362e771a", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.w;
        if (i == 0) {
            this.F = z;
        } else if (i == 1) {
            this.F = false;
        } else if (i == 2 || i == 3) {
            this.F = true;
        }
    }

    public void D(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd5c00f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i != 0 && l() != null && i2 > 0 && i3 > 0) {
            this.B = i;
            this.n = jxv.e(i2, i3, l().getDrawable(i, null));
        }
    }

    public void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8259d40", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0451f61", new Object[]{this, new Integer(i)});
            return;
        }
        this.E = i;
        y();
    }

    public void G(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f83040b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i != 0 && l() != null) {
            this.C = i;
            this.o = jxv.e(i2, i3, l().getDrawable(i, null));
        }
    }

    public void H(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f233230a", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.D == i) {
            z = false;
        }
        this.D = i;
        if (z) {
            y();
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void J(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1c1d08", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.l = f;
    }

    public boolean a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d94089", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        int progressWidth = (int) (this.b.getProgressWidth() * this.l);
        if (f <= this.h + progressWidth || f >= this.i + progressWidth || f2 <= this.j || f2 >= this.k) {
            return false;
        }
        return true;
    }

    public void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.s) {
            canvas.save();
            canvas.translate((int) (this.b.getProgressWidth() * this.l), 0.0f);
            canvas.translate(this.h, 0.0f);
            if (this.F) {
                v(canvas, this.f, c(null));
            }
            w(canvas);
            canvas.restore();
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec917775", new Object[]{this, str});
        }
        r8p[] rangeSeekBarState = this.b.getRangeSeekBarState();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (this.f7782a) {
            return rangeSeekBarState[0].f27195a;
        }
        return rangeSeekBarState[1].f27195a;
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.b.getContext();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8465b44b", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca59a5a", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("294df361", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("826e2590", new Object[]{this})).intValue();
        }
        if (this.p != null) {
            return jxv.g("8", this.y).height();
        }
        return jxv.g("8", this.y).height();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed3c6cb3", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9d", new Object[]{this})).intValue();
        }
        return (int) (this.b.getMinProgress() + ((this.b.getMaxProgress() - this.b.getMinProgress()) * this.l));
    }

    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3ec68b0", new Object[]{this})).floatValue();
        }
        return f() + e() + g() + n();
    }

    public Resources l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        if (d() != null) {
            return d().getResources();
        }
        return null;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("758eb661", new Object[]{this})).intValue();
        }
        return this.E;
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607e96c8", new Object[]{this})).floatValue();
        }
        return this.E * this.g;
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2ac2d18", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb0ab553", new Object[]{this})).floatValue();
        }
        return this.D * this.g;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4d4b00", new Object[]{this})).intValue();
        }
        return this.D;
    }

    public final void r(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ed4775", new Object[]{this, attributeSet});
            return;
        }
        this.x = 0;
        this.w = 1;
        this.y = jxv.b(d(), 14.0f);
        this.z = -1;
        this.A = ContextCompat.getColor(d(), 17170443);
        this.B = R.drawable.fluid_sdk_ict_seekbar_thumb;
        this.D = jxv.b(d(), 26.0f);
        this.E = jxv.b(d(), 26.0f);
        this.g = 1.0f;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce987366", new Object[]{this});
            return;
        }
        B(this.x);
        D(this.B, this.D, this.E);
        G(this.C, this.D, this.E);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b627f34e", new Object[]{this});
            return;
        }
        this.t = this.D;
        this.u = this.E;
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559db46e", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m, 0.0f);
        this.q = ofFloat;
        ofFloat.addUpdateListener(new a());
        this.q.addListener(new b());
        this.q.start();
    }

    public void v(Canvas canvas, Paint paint, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5f7cd1", new Object[]{this, canvas, paint, str});
        } else if (str != null) {
            paint.setTextSize(this.y);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A);
            paint.getTextBounds(str, 0, str.length(), this.d);
            int width = this.d.width();
            if (width < 0) {
                width = 0;
            }
            int height = this.d.height();
            if (height >= 0) {
                i = height;
            }
            Rect rect = this.e;
            int i2 = this.t;
            int i3 = (int) ((i2 / 2.0f) - (width / 2.0f));
            rect.left = i3;
            int i4 = (this.k - i) - this.u;
            rect.top = i4;
            rect.right = i3 + width;
            int i5 = i4 + i;
            rect.bottom = i5;
            if (this.p == null) {
                this.c.reset();
                float f = i2 / 2;
                float f2 = i5;
                this.c.moveTo(f, f2);
                this.c.lineTo(f, f2);
                this.c.lineTo(f, f2);
                this.c.close();
                canvas.drawPath(this.c, paint);
                Rect rect2 = this.e;
                rect2.bottom = rect2.bottom;
                rect2.top = rect2.top;
            }
            int b2 = jxv.b(d(), 1.0f);
            int width2 = (((this.e.width() / 2) - ((int) (this.b.getProgressWidth() * this.l))) - this.b.getProgressLeft()) + b2;
            int width3 = (((this.e.width() / 2) - ((int) (this.b.getProgressWidth() * (1.0f - this.l)))) - this.b.getProgressPaddingRight()) + b2;
            if (width2 > 0) {
                Rect rect3 = this.e;
                rect3.left += width2;
                rect3.right += width2;
            } else if (width3 > 0) {
                Rect rect4 = this.e;
                rect4.left -= width3;
                rect4.right -= width3;
            }
            Bitmap bitmap = this.p;
            if (bitmap != null) {
                jxv.c(canvas, paint, bitmap, this.e);
            } else {
                canvas.drawRect(this.e, paint);
            }
            int width4 = this.e.left + ((width - this.d.width()) / 2);
            paint.setColor(this.z);
            canvas.drawText(str, width4, (this.e.bottom - ((i - this.d.height()) / 2)) + 1, paint);
        }
    }

    public void w(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a463cb", new Object[]{this, canvas});
        } else if (this.v) {
            Bitmap bitmap = this.o;
            if (bitmap == null || this.r) {
                Bitmap bitmap2 = this.n;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, 0.0f, this.b.getProgressTop() + ((this.b.getProgressHeight() - this.u) / 2.0f), (Paint) null);
                    return;
                }
                return;
            }
            canvas.drawBitmap(bitmap, 0.0f, this.b.getProgressTop() + ((this.b.getProgressHeight() - this.u) / 2.0f), (Paint) null);
        }
    }

    public void x(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        t();
        s();
        float f = i;
        this.h = (int) (f - (p() / 2.0f));
        this.i = (int) (f + (p() / 2.0f));
        this.j = i2 - (m() / 2);
        this.k = i2 + (m() / 2);
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5966e6ce", new Object[]{this});
            return;
        }
        this.t = q();
        this.u = m();
        int progressBottom = this.b.getProgressBottom();
        int i = this.u;
        int i2 = i / 2;
        this.j = progressBottom - i2;
        this.k = progressBottom + i2;
        D(this.B, this.t, i);
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b44533", new Object[]{this});
            return;
        }
        this.t = (int) p();
        this.u = (int) n();
        int progressBottom = this.b.getProgressBottom();
        int i = this.u;
        this.j = progressBottom - (i / 2);
        this.k = progressBottom + (i / 2);
        D(this.B, this.t, i);
    }
}
