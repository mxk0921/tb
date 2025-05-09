package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.price.M3PriceView;
import tb.mwm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class lwm implements mwm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int o = Color.parseColor("#FF5000");
    public static final float p = o1p.a(12.0f);
    public static final float q = o1p.a(21.0f);
    public static final float r = o1p.a(16.0f);
    public static final int s = o1p.a(1.0f);
    public static final String unit = "¥";

    /* renamed from: a  reason: collision with root package name */
    public final View f23615a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final TextPaint f;
    public final TextPaint g;
    public int i;
    public int j;
    public int m;
    public boolean n;
    public int h = -1;
    public final Rect k = new Rect();
    public final Rect l = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792428);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792427);
        t2o.a(815792431);
    }

    public lwm(View view) {
        ckf.g(view, "view");
        this.f23615a = view;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.g = textPaint2;
        int i = o;
        textPaint.setColor(i);
        M3PriceView.a aVar = M3PriceView.Companion;
        textPaint.setTypeface(aVar.a());
        textPaint2.setColor(i);
        textPaint2.setTextSize(p);
        textPaint2.setTypeface(aVar.a());
    }

    @Override // tb.mwm
    public void a(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fdaa20", new Object[]{this, pwmVar});
        } else {
            mwm.a.a(this, pwmVar);
        }
    }

    public final void c(Canvas canvas, String str, float f, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa50235e", new Object[]{this, canvas, str, new Float(f), paint});
        } else {
            canvas.drawText(str, f, -this.k.top, paint);
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24644214", new Object[]{this})).intValue();
        }
        return this.m;
    }

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.b != null) {
            c(canvas, unit, 0.0f, this.g);
            float f = this.i + 0.0f;
            this.f.setTextSize(q);
            if (this.h < 0 || (str = this.c) == null) {
                String str2 = this.b;
                ckf.d(str2);
                c(canvas, str2, f, this.f);
                return;
            }
            ckf.d(str);
            c(canvas, str, f, this.f);
            float f2 = f + this.j;
            this.f.setTextSize(r);
            String str3 = this.d;
            ckf.d(str3);
            c(canvas, str3, f2 + s, this.f);
        }
    }

    @Override // tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc05d58", new Object[]{this, str});
            return;
        }
        ckf.g(str, "price");
        if (!ckf.b(this.b, str)) {
            this.b = str;
            this.h = wsq.Y(str, ".", 0, false, 6, null);
            this.n = false;
            this.e = 0;
            b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0852ac", new Object[]{this});
            return;
        }
        try {
            if (this.h >= 0) {
                String str = this.b;
                ckf.d(str);
                String substring = str.substring(this.h + 1);
                ckf.f(substring, "substring(...)");
                int parseInt = Integer.parseInt(substring);
                if (parseInt == 0) {
                    String str2 = this.b;
                    ckf.d(str2);
                    String substring2 = str2.substring(0, this.h);
                    ckf.f(substring2, "substring(...)");
                    this.b = substring2;
                    this.h = -1;
                } else if (parseInt % 10 == 0) {
                    this.n = true;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.gtd
    public int getWidth() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        if (this.e <= 0) {
            float a2 = ilt.Companion.a(unit, this.g);
            this.i = (int) a2;
            this.f.setTextSize(q);
            if (this.h < 0) {
                String str = this.b;
                this.c = str;
                TextPaint textPaint = this.f;
                ckf.d(str);
                textPaint.getTextBounds(str, 0, str.length(), this.k);
                i = this.k.width();
                this.j = i;
            } else {
                String str2 = this.b;
                ckf.d(str2);
                String substring = str2.substring(0, this.h);
                ckf.f(substring, "substring(...)");
                this.c = substring;
                this.f.getTextBounds(substring, 0, substring.length(), this.k);
                int width = this.k.width();
                this.j = width;
                float f = a2 + width;
                this.f.setTextSize(r);
                if (this.n) {
                    String str3 = this.b;
                    ckf.d(str3);
                    int i2 = this.h;
                    String str4 = this.b;
                    ckf.d(str4);
                    String substring2 = str3.substring(i2, str4.length() - 1);
                    ckf.f(substring2, "substring(...)");
                    this.d = substring2;
                } else {
                    String str5 = this.b;
                    ckf.d(str5);
                    String substring3 = str5.substring(this.h);
                    ckf.f(substring3, "substring(...)");
                    this.d = substring3;
                }
                TextPaint textPaint2 = this.f;
                String str6 = this.d;
                ckf.d(str6);
                textPaint2.getTextBounds(str6, 0, str6.length(), this.l);
                a2 = f + this.l.width();
                i = s;
            }
            float f2 = a2 + i;
            this.m = this.k.height();
            this.e = (int) f2;
        }
        return this.e;
    }
}
