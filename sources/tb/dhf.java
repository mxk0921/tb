package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dhf implements gtd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int o = o1p.a(8.0f);
    public static final int p = o1p.a(12.0f);
    public static final int q = o1p.a(2.0f);
    public static final int r = o1p.a(2.0f);
    public static final int s = Color.parseColor("#f7f7f7");
    public static final int t = o1p.a(6.0f);
    public static final int u = o1p.a(8.0f);
    public static final int v = o1p.a(3.0f);
    public static final float w = o1p.a(12.0f);
    public static final int x = Color.parseColor("#333333");
    public static final float y = o1p.a(1.0f);
    public static final float z = o1p.a(4.0f);

    /* renamed from: a  reason: collision with root package name */
    public final dif f17822a;
    public final View b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public final tfe f;
    public final tfe g;
    public int h;
    public float i;
    public float j;
    public final TextPaint k;
    public final TextPaint l;
    public final Paint m = new Paint(1);
    public final boolean n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792406);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792405);
        t2o.a(815792319);
    }

    public dhf(dif difVar, View view, boolean z2, boolean z3) {
        ckf.g(difVar, "info");
        ckf.g(view, "view");
        this.f17822a = difVar;
        this.b = view;
        this.c = z2;
        this.d = z3;
        this.f = new tfe(view, null, 2, null);
        this.g = new tfe(view, null, 2, null);
        TextPaint textPaint = new TextPaint(1);
        this.k = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.l = textPaint2;
        this.n = !TextUtils.isEmpty(difVar.f());
        float f = w;
        textPaint.setTextSize(f);
        textPaint2.setTextSize(f);
    }

    public final void b(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0e726c", new Object[]{this, canvas});
            return;
        }
        int measuredHeight = this.b.getMeasuredHeight();
        if (this.c) {
            f = z;
        } else {
            f = measuredHeight / 2.0f;
        }
        canvas.drawRoundRect(0.0f, 0.0f, this.h, measuredHeight, f, f, this.m);
    }

    public final float c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6e1c442", new Object[]{this, new Integer(i)})).floatValue();
        }
        return (this.b.getMeasuredHeight() - i) / 2.0f;
    }

    public final dif d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dif) ipChange.ipc$dispatch("bd36b174", new Object[]{this});
        }
        return this.f17822a;
    }

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        b(canvas);
        float f = t;
        if (this.n) {
            int i = p;
            float c = c(i);
            canvas.translate(f, c);
            this.g.c(canvas);
            canvas.translate(-f, -c);
            f = f + i + q;
        }
        if (this.i > 0.0f) {
            TextPaint textPaint = this.l;
            String j = this.f17822a.j();
            ckf.d(j);
            kw1.a(canvas, textPaint, f, j, 0.0f, this.b.getHeight());
            float f2 = f + this.i;
            if (this.d) {
                f = f2 + v;
            } else {
                float f3 = u;
                f = f2 + f3;
                canvas.drawCircle(f - (f3 / 2.0f), this.b.getMeasuredHeight() / 2.0f, y, this.k);
            }
        }
        if (this.j > 0.0f) {
            kw1.a(canvas, this.k, f, this.f17822a.h(), 0.0f, this.b.getHeight());
            f = f + this.j + r;
        }
        float c2 = c(o);
        canvas.translate(f, c2);
        this.f.c(canvas);
        canvas.translate(-f, -c2);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.f17822a.e())) {
            tfe tfeVar = this.f;
            int i = o;
            tfeVar.d("https://gw.alicdn.com/imgextra/i3/O1CN01o98VCR1uM7obPMPs0_!!6000000006022-2-tps-24-24.png", i, i);
        } else {
            tfe tfeVar2 = this.f;
            String e = this.f17822a.e();
            int i2 = o;
            tfeVar2.d(e, i2, i2);
        }
        if (!TextUtils.isEmpty(this.f17822a.f())) {
            tfe tfeVar3 = this.g;
            String f = this.f17822a.f();
            int i3 = p;
            tfeVar3.d(f, i3, i3);
        }
    }

    public final void g(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z2)});
        } else {
            this.e = z2;
        }
    }

    @Override // tb.gtd
    public int getWidth() {
        float f;
        int i;
        int i2;
        int i3;
        Integer k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.h == 0) {
            float f2 = t << 1;
            if (this.n) {
                f2 = f2 + p + q;
            }
            if (TextUtils.isEmpty(this.f17822a.j()) || this.f17822a.k() == null || ((k = this.f17822a.k()) != null && k.intValue() == 0)) {
                f = 0.0f;
            } else {
                f = ilt.Companion.a(this.f17822a.j(), this.l);
            }
            this.i = f;
            if (f > 0.0f) {
                float f3 = f2 + f;
                if (this.d) {
                    i3 = v;
                } else {
                    i3 = u;
                }
                f2 = f3 + i3;
                TextPaint textPaint = this.l;
                Integer k2 = this.f17822a.k();
                ckf.d(k2);
                textPaint.setColor(k2.intValue());
            }
            this.j = ilt.Companion.a(this.f17822a.h(), this.k);
            TextPaint textPaint2 = this.k;
            Integer i4 = this.f17822a.i();
            if (i4 != null) {
                i = i4.intValue();
            } else {
                i = x;
            }
            textPaint2.setColor(i);
            this.h = (int) (f2 + this.j + r + o);
            Paint paint = this.m;
            Integer a2 = this.f17822a.a();
            if (a2 != null) {
                i2 = a2.intValue();
            } else {
                i2 = s;
            }
            paint.setColor(i2);
        }
        return this.h;
    }

    @Override // tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f.e();
        }
    }
}
