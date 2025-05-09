package tb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.icons.IconView;
import tb.lfe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class olt extends lfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean C;
    public int D;
    public int E;
    public LinearGradient F;
    public final View h;
    public final knh i;
    public final tfe j;
    public float k;
    public int l;
    public float n;
    public final Paint s;
    public int t;
    public int u;
    public int v;
    public float w;
    public int x;
    public boolean y;
    public int m = -16777216;
    public int o = -1;
    public final TextPaint p = new TextPaint(1);
    public final Paint q = new Paint(1);
    public final Paint r = new Paint(1);
    public final Path z = new Path();
    public final Path A = new Path();
    public boolean B = true;

    static {
        t2o.a(815792386);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olt(xfe xfeVar, View view, knh knhVar) {
        super(xfeVar, view);
        ckf.g(xfeVar, "itemInfo");
        ckf.g(view, "view");
        ckf.g(knhVar, "infoProvider");
        this.h = view;
        this.i = knhVar;
        this.j = new tfe(view, null, 2, null);
        Paint paint = new Paint(1);
        this.s = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(lfe.Companion.a());
    }

    public static /* synthetic */ Object ipc$super(olt oltVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/icons/TextItemDrawable");
    }

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float d;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.v == 0 || this.k <= 0.0f) {
            int i3 = this.t;
            if (!(i3 == 0 || i3 == this.i.getCardBackgroundColor()) || this.C) {
                if (this.C && this.F == null) {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.o, 0.0f, this.D, this.E, Shader.TileMode.CLAMP);
                    this.F = linearGradient;
                    this.q.setShader(linearGradient);
                }
                float f3 = this.w;
                l(canvas, 0.0f, 0.0f, this.o, IconView.Companion.a(), f3, f3, this.A, false, this.q);
            }
        } else {
            lfe.a aVar = lfe.Companion;
            float d2 = aVar.d() + this.k;
            int i4 = this.x;
            if (i4 > 0) {
                i2 = i4 >> 1;
            } else {
                i2 = aVar.d();
            }
            float f4 = d2 + i2;
            IconView.a aVar2 = IconView.Companion;
            l(canvas, 0.0f, 0.0f, f4, aVar2.a(), this.w, 0.0f, this.z, this.B, this.r);
            if (this.t != 0 || this.C) {
                if (this.C && this.F == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, this.o - f4, 0.0f, this.D, this.E, Shader.TileMode.CLAMP);
                    this.F = linearGradient2;
                    this.q.setShader(linearGradient2);
                }
                l(canvas, f4, 0.0f, this.o, aVar2.a(), 0.0f, this.w, this.A, this.B, this.q);
            }
        }
        if (this.k > 0.0f) {
            lfe.a aVar3 = lfe.Companion;
            this.p.setColor(this.l);
            TextPaint textPaint = this.p;
            float d3 = aVar3.d();
            String c = h().c();
            ckf.d(c);
            kw1.a(canvas, textPaint, d3, c, 0.0f, this.h.getHeight());
            f = aVar3.d() + 0.0f + this.k;
            int i5 = this.x;
            if (i5 > 0) {
                d = i5 / 2.0f;
            } else {
                d = aVar3.d();
            }
            f2 = d + f;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        if (this.n > 0.0f) {
            this.p.setColor(this.m);
            if (this.y || f2 > 0.0f) {
                TextPaint textPaint2 = this.p;
                int i6 = this.x;
                if (i6 <= 0 || this.k <= 0.0f) {
                    i = lfe.Companion.d();
                } else {
                    i = i6 >> 1;
                }
                String d4 = h().d();
                ckf.d(d4);
                kw1.a(canvas, textPaint2, f2 + i, d4, 0.0f, this.h.getHeight());
            } else {
                TextPaint textPaint3 = this.p;
                String d5 = h().d();
                ckf.d(d5);
                kw1.a(canvas, textPaint3, f2, d5, 0.0f, this.h.getHeight());
            }
        }
        if (this.k > 0.0f) {
            int i7 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i7 > 0) {
                canvas.translate(f, 0.0f);
            }
            this.j.c(canvas);
            if (i7 > 0) {
                canvas.translate(-f, 0.0f);
            }
        }
        k(canvas);
        this.B = false;
    }

    @Override // tb.gtd
    public int getWidth() {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        int d;
        float f5;
        float d2;
        int i2;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.o == -1) {
            this.C = false;
            this.B = true;
            TextPaint textPaint = this.p;
            if (h().a().textSize > 0.0f) {
                f = o1p.a(h().a().textSize) / 2.0f;
            } else {
                f = lfe.Companion.c();
            }
            textPaint.setTextSize(f);
            this.m = qrl.b(h().a().textColor, -16777216);
            this.l = qrl.b(h().a().prefixColor, -16777216);
            if (!TextUtils.isEmpty(h().c())) {
                f2 = ilt.Companion.a(h().c(), this.p);
            } else {
                f2 = 0.0f;
            }
            this.k = f2;
            if (h().a().separatorWidth <= 0 || h().a().separatorHeight <= 0) {
                i = 0;
            } else {
                i = (int) ((IconView.Companion.a() / h().a().separatorHeight) * h().a().separatorWidth);
            }
            this.x = i;
            int b = qrl.b(h().a().backgroundColor, 0);
            this.t = b;
            this.q.setColor(b);
            this.D = 0;
            this.E = 0;
            if (!(this.k > 0.0f || h().a().backgroundGradientStart == null || h().a().backgroundGradientEnd == null)) {
                this.D = qrl.b(h().a().backgroundGradientStart, 0);
                int b2 = qrl.b(h().a().backgroundGradientEnd, 0);
                this.E = b2;
                if (this.D == 0 && b2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                this.C = z;
            }
            int b3 = qrl.b(h().a().borderColor, 0);
            this.u = b3;
            this.s.setColor(b3);
            int b4 = qrl.b(h().a().prefixBgColor, 0);
            this.v = b4;
            this.r.setColor(b4);
            if (h().a().borderRadius > 0) {
                f3 = o1p.b(h().a().borderRadius);
            } else {
                f3 = lfe.Companion.b();
            }
            this.w = f3;
            int i3 = this.t;
            if (!((i3 == 0 || i3 == this.i.getCardBackgroundColor()) && ((i2 = this.u) == 0 || i2 == this.i.getCardBackgroundColor()))) {
                z2 = true;
            }
            this.y = z2;
            float f6 = this.k;
            if (f6 > 0.0f) {
                lfe.a aVar = lfe.Companion;
                float d3 = f6 + 0.0f + aVar.d();
                int i4 = this.x;
                if (i4 > 0) {
                    d2 = i4 / 2.0f;
                } else {
                    d2 = aVar.d();
                }
                f4 = d3 + d2;
            } else {
                f4 = 0.0f;
            }
            if (!TextUtils.isEmpty(h().d())) {
                float a2 = ilt.Companion.a(h().d(), this.p);
                this.n = a2;
                f4 += a2;
                if (this.y) {
                    f4 += lfe.Companion.d();
                }
                if (this.k > 0.0f) {
                    int i5 = this.x;
                    if (i5 > 0) {
                        f5 = i5 / 2.0f;
                        f4 += f5;
                    } else {
                        d = lfe.Companion.d();
                    }
                } else if (this.y) {
                    d = lfe.Companion.d();
                }
                f5 = d;
                f4 += f5;
            }
            this.o = (int) f4;
        }
        return this.o;
    }

    @Override // tb.lfe
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06da122", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    @Override // tb.lfe
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
        } else if (!TextUtils.isEmpty(h().c())) {
            this.j.d(h().a().separatorImg, this.x, IconView.Companion.a());
        }
    }

    public final void k(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f8ca2e", new Object[]{this, canvas});
            return;
        }
        int i = this.u;
        if (i != 0 && i != this.i.getCardBackgroundColor()) {
            float a2 = lfe.Companion.a() / 2;
            if (this.w > 0.0f) {
                float f = this.w;
                canvas.drawRoundRect(a2, a2, getWidth() - a2, this.h.getMeasuredHeight() - a2, f, f, this.s);
                return;
            }
            canvas.drawRect(a2, a2, getWidth() - a2, this.h.getMeasuredHeight() - a2, this.s);
        }
    }

    public final void l(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, Path path, boolean z, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb61f01", new Object[]{this, canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), path, new Boolean(z), paint});
            return;
        }
        int i = (int) f5;
        if (i != ((int) f6)) {
            if (z) {
                path.reset();
                path.addRoundRect(f, f2, f3, f4, new float[]{f5, f5, f6, f6, f6, f6, f5, f5}, Path.Direction.CW);
            }
            canvas.drawPath(path, paint);
        } else if (i == 0) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        }
    }

    @Override // tb.l32, tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.j.e();
        }
    }
}
