package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.price.M3PriceView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.ilt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dqu extends l32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float k;
    public static final float l;
    public static final int r;
    public static final int s;
    public static final int t;
    public final g1n b;
    public final View c;
    public int d;
    public final TextPaint e;
    public final TextPaint f;
    public final TextPaint g;
    public final ArrayList<String> h = new ArrayList<>();
    public float i;
    public float j;
    public static final a Companion = new a(null);
    public static final float m = o1p.a(12.0f);
    public static final float n = o1p.a(16.0f);
    public static final int o = Color.parseColor("#999999");
    public static final int p = Color.parseColor("#FF5000");
    public static final int q = Color.parseColor("#333333");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792446);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("895f1994", new Object[]{this})).intValue();
            }
            return dqu.d();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6fef14a2", new Object[]{this})).intValue();
            }
            return dqu.e();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792445);
        float a2 = o1p.a(12.0f);
        k = a2;
        float a3 = o1p.a(21.0f);
        l = a3;
        int a4 = o1p.a(5.0f);
        r = a4;
        float f = a4;
        s = (int) (a3 + a2 + f);
        t = (int) ((2 * a2) + f);
    }

    public dqu(g1n g1nVar, View view) {
        ckf.g(g1nVar, "info");
        ckf.g(view, "view");
        this.b = g1nVar;
        this.c = view;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.g = textPaint3;
        textPaint2.setTextSize(m);
        int i = p;
        textPaint2.setColor(i);
        M3PriceView.a aVar = M3PriceView.Companion;
        textPaint2.setTypeface(aVar.a());
        textPaint3.setTextSize(k);
        textPaint.setTypeface(aVar.a());
        textPaint.setColor(i);
    }

    public static final /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e13e84f1", new Object[0])).intValue();
        }
        return t;
    }

    public static final /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b65aeda3", new Object[0])).intValue();
        }
        return s;
    }

    public static /* synthetic */ Object ipc$super(dqu dquVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/property/TwoLineDrawable");
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba5095c", new Object[]{this});
            return;
        }
        ilt.a aVar = ilt.Companion;
        this.d = (int) hfn.b(aVar.a(this.b.b(), this.g), aVar.a(this.b.c(), this.g));
    }

    @Override // tb.gtd
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.d == 0) {
            if (this.b.a()) {
                h();
            } else {
                g();
            }
        }
        return this.d;
    }

    public final void i(Canvas canvas, Paint paint, float f, String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ceff58", new Object[]{this, canvas, paint, new Float(f), str, new Float(f2)});
            return;
        }
        ckf.g(canvas, "canvas");
        ckf.g(paint, "paint");
        ckf.g(str, "text");
        canvas.drawText(str, f, f2, paint);
    }

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.b.a()) {
            boolean isEmpty = TextUtils.isEmpty(this.b.b());
            TextPaint textPaint = this.e;
            float f2 = l;
            textPaint.setTextSize(f2);
            Paint.FontMetrics fontMetrics = this.e.getFontMetrics();
            float height = (((isEmpty ? this.c.getHeight() : f2) - fontMetrics.bottom) - fontMetrics.top) / 2.0f;
            i(canvas, this.f, 0.0f, lwm.unit, height);
            TextPaint textPaint2 = this.e;
            float f3 = this.i;
            String str = this.h.get(0);
            ckf.f(str, "get(...)");
            i(canvas, textPaint2, f3, str, height);
            if (this.h.size() > 1) {
                this.e.setTextSize(n);
                TextPaint textPaint3 = this.e;
                float f4 = this.i + this.j;
                String str2 = this.h.get(1);
                ckf.f(str2, "get(...)");
                i(canvas, textPaint3, f4, str2, height);
            }
            if (!isEmpty) {
                this.g.setColor(o);
                kw1.a(canvas, this.g, 0.0f, this.b.b(), f2 + r, this.c.getHeight());
                return;
            }
            return;
        }
        boolean isEmpty2 = TextUtils.isEmpty(this.b.b());
        this.g.setColor(q);
        TextPaint textPaint4 = this.g;
        String c = this.b.c();
        if (isEmpty2) {
            f = this.c.getHeight();
        } else {
            f = k;
        }
        kw1.a(canvas, textPaint4, 0.0f, c, 0.0f, f);
        if (!isEmpty2) {
            this.g.setColor(o);
            kw1.a(canvas, this.g, 0.0f, this.b.b(), k + r, this.c.getHeight());
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345bdf11", new Object[]{this});
            return;
        }
        int Y = wsq.Y(this.b.c(), ".", 0, false, 6, null);
        if (Y >= 0) {
            String substring = this.b.c().substring(1 + Y, this.b.c().length());
            ckf.f(substring, "substring(...)");
            if (Integer.parseInt(substring) == 0) {
                this.h.add(this.b.c());
                return;
            }
            ArrayList<String> arrayList = this.h;
            String substring2 = this.b.c().substring(0, Y);
            ckf.f(substring2, "substring(...)");
            arrayList.add(substring2);
            this.h.add(".".concat(substring));
            return;
        }
        this.h.add(this.b.c());
    }

    public final void h() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a5150a", new Object[]{this});
            return;
        }
        this.h.clear();
        ilt.a aVar = ilt.Companion;
        float a2 = aVar.a(this.b.b(), this.g);
        float a3 = aVar.a(lwm.unit, this.f);
        this.i = a3;
        this.e.setTextSize(l);
        f();
        Iterator<String> it = this.h.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            String next = it.next();
            ckf.f(next, "next(...)");
            float a4 = ilt.Companion.a(next, this.e);
            if (z) {
                this.j = a4;
                z = false;
            }
            a3 += a4;
            this.e.setTextSize(n);
        }
        this.d = (int) hfn.b(a3, a2);
    }
}
