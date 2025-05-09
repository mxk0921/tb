package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ilt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ld4 extends l32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float j = o1p.a(12.0f);
    public static final int k = Color.parseColor("#333333");
    public static final int l = o1p.a(12.0f);
    public static final int m = o1p.a(2.0f);
    public final nd4 b;
    public final View c;
    public final tfe d;
    public final TextPaint e;
    public int f;
    public String g;
    public final boolean h;
    public int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792339);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792338);
    }

    public ld4(nd4 nd4Var, View view) {
        int i;
        ckf.g(nd4Var, "info");
        ckf.g(view, "view");
        this.b = nd4Var;
        this.c = view;
        this.d = new tfe(view, null, 2, null);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(j);
        Integer c = nd4Var.c();
        if (c != null) {
            i = c.intValue();
        } else {
            i = k;
        }
        textPaint.setColor(i);
        this.h = !TextUtils.isEmpty(nd4Var.a());
    }

    public static /* synthetic */ Object ipc$super(ld4 ld4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/composite/CompositeDrawable");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
        } else if (this.h) {
            tfe tfeVar = this.d;
            String a2 = this.b.a();
            ckf.d(a2);
            int i = l;
            tfeVar.d(a2, i, i);
        }
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
        if (this.h) {
            float height = (this.c.getHeight() - l) >> 1;
            canvas.translate(0.0f, height);
            this.d.c(canvas);
            canvas.translate(0.0f, -height);
        }
        String str = this.g;
        if (str != null) {
            TextPaint textPaint = this.e;
            if (!this.h) {
                f = 0.0f;
            } else {
                f = l + m;
            }
            kw1.a(canvas, textPaint, f, str, 0.0f, this.c.getHeight());
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4d93d", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // tb.l32, tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.d.e();
        }
    }

    @Override // tb.gtd
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.f == 0) {
            float f = 0.0f;
            if (this.h) {
                f = 0.0f + l + m;
            }
            ilt.a aVar = ilt.Companion;
            float a2 = aVar.a(this.b.b(), this.e) + f;
            if (a2 <= this.i) {
                this.g = this.b.b();
            } else {
                float a3 = aVar.a("...", this.e);
                float[] fArr = new float[1];
                int breakText = this.e.breakText(this.b.b(), true, (this.i - f) - a3, fArr);
                if (breakText > 0) {
                    String substring = this.b.b().substring(0, breakText);
                    ckf.f(substring, "substring(...)");
                    this.g = substring.concat("...");
                    a2 = f + fArr[0] + a3;
                } else {
                    a2 = this.i + 1.0f;
                }
            }
            this.f = (int) a2;
        }
        return this.f;
    }
}
