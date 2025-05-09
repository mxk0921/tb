package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.icons.IconView;
import tb.lfe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jeo extends lfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int x = -o1p.a(1.0f);
    public final View h;
    public final knh i;
    public int j;
    public int k;
    public float l;
    public float m;
    public final tfe q;
    public int s;
    public float t;
    public int u;
    public final Paint v;
    public boolean w;
    public final TextPaint n = new TextPaint(1);
    public int o = -16777216;
    public int p = -16777216;
    public final Paint r = new Paint(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792385);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792384);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jeo(xfe xfeVar, View view, knh knhVar) {
        super(xfeVar, view);
        ckf.g(xfeVar, "itemInfo");
        ckf.g(view, "view");
        ckf.g(knhVar, "infoProvider");
        this.h = view;
        this.i = knhVar;
        this.q = new tfe(view, null, 2, null);
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(lfe.Companion.a());
    }

    public static /* synthetic */ Object ipc$super(jeo jeoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/icons/RichItemDrawable");
    }

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        k(canvas);
        if (this.l > 0.0f) {
            if (this.w) {
                f2 = lfe.Companion.d() + 0.0f;
            } else {
                f2 = 0.0f;
            }
            this.n.setColor(this.p);
            TextPaint textPaint = this.n;
            String c = h().c();
            ckf.d(c);
            kw1.a(canvas, textPaint, f2, c, 0.0f, this.h.getHeight());
            f = ((f2 + this.l) + lfe.Companion.d()) - x;
        } else {
            f = 0.0f;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            canvas.translate(f, 0.0f);
        }
        this.q.c(canvas);
        if (i > 0) {
            canvas.translate(-f, 0.0f);
        }
        float f3 = f + this.k;
        if (this.m > 0.0f) {
            float d = f3 + lfe.Companion.d();
            this.n.setColor(this.o);
            TextPaint textPaint2 = this.n;
            String d2 = h().d();
            ckf.d(d2);
            kw1.a(canvas, textPaint2, d, d2, 0.0f, this.h.getHeight());
        }
        l(canvas);
    }

    @Override // tb.gtd
    public int getWidth() {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.j == 0) {
            this.k = (int) ((h().a().width / h().a().height) * IconView.Companion.a());
            int b = qrl.b(h().a().backgroundColor, 0);
            this.s = b;
            this.r.setColor(b);
            if (h().a().borderRadius > 0) {
                f = o1p.b(h().a().borderRadius);
            } else {
                f = lfe.Companion.b();
            }
            this.t = f;
            int b2 = qrl.b(h().a().borderColor, 0);
            this.u = b2;
            this.v.setColor(b2);
            TextPaint textPaint = this.n;
            if (h().a().textSize > 0.0f) {
                f2 = o1p.a(h().a().textSize) / 2.0f;
            } else {
                f2 = lfe.Companion.c();
            }
            textPaint.setTextSize(f2);
            this.o = qrl.b(h().a().textColor, -16777216);
            this.p = qrl.b(h().a().prefixColor, -16777216);
            int i2 = this.s;
            if (!((i2 == 0 || i2 == this.i.getCardBackgroundColor()) && ((i = this.u) == 0 || i == this.i.getCardBackgroundColor()))) {
                z = true;
            }
            this.w = z;
            if (TextUtils.isEmpty(h().c())) {
                f3 = 0.0f;
            } else {
                f3 = ilt.Companion.a(h().c(), this.n);
            }
            this.l = f3;
            float f5 = f3 + 0.0f;
            if (f3 > 0.0f) {
                lfe.a aVar = lfe.Companion;
                f5 = (f5 - x) + aVar.d();
                if (this.w) {
                    f5 += aVar.d();
                }
            }
            float f6 = f5 + this.k;
            if (TextUtils.isEmpty(h().d())) {
                f4 = 0.0f;
            } else {
                f4 = ilt.Companion.a(h().d(), this.n);
            }
            this.m = f4;
            if (f4 > 0.0f) {
                lfe.a aVar2 = lfe.Companion;
                f6 += aVar2.d();
                if (this.w) {
                    f6 += aVar2.d();
                }
            }
            this.j = (int) (f6 + this.m);
        }
        return this.j;
    }

    @Override // tb.lfe
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06da122", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    @Override // tb.lfe
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
        } else {
            this.q.d(h().a().image, this.k, IconView.Companion.a());
        }
    }

    public final void k(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0e726c", new Object[]{this, canvas});
        } else if (this.s != 0) {
            if (this.t > 0.0f) {
                float f = this.t;
                canvas.drawRoundRect(0.0f, 0.0f, getWidth(), this.h.getMeasuredHeight(), f, f, this.r);
                return;
            }
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.h.getMeasuredHeight(), this.r);
        }
    }

    public final void l(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f8ca2e", new Object[]{this, canvas});
        } else if (this.u != 0) {
            float a2 = lfe.Companion.a() / 2;
            if (this.t > 0.0f) {
                float f = this.t;
                canvas.drawRoundRect(a2, a2, getWidth() - a2, this.h.getMeasuredHeight() - a2, f, f, this.v);
                return;
            }
            canvas.drawRect(a2, a2, getWidth() - a2, this.h.getMeasuredHeight() - a2, this.v);
        }
    }

    @Override // tb.l32, tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.q.e();
        }
    }
}
