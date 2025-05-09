package tb;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.price.M3PriceView;
import tb.mwm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class swm implements mwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final M3PriceView f28326a;
    public String c;
    public int d;
    public final TextPaint b = new TextPaint(1);
    public final Rect e = new Rect();

    static {
        t2o.a(815792438);
        t2o.a(815792431);
    }

    public swm(M3PriceView m3PriceView) {
        ckf.g(m3PriceView, "view");
        this.f28326a = m3PriceView;
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

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        String str = this.c;
        if (str != null) {
            canvas.drawText(str, 0.0f, (this.f28326a.getTextHeight() - this.e.height()) - this.e.top, this.b);
        }
    }

    @Override // tb.gtd
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        String str = this.c;
        if (str == null) {
            return 0;
        }
        if (this.d == 0) {
            TextPaint textPaint = this.b;
            ckf.d(str);
            String str2 = this.c;
            ckf.d(str2);
            textPaint.getTextBounds(str, 0, str2.length(), this.e);
            this.d = this.e.width();
        }
        return this.d;
    }

    @Override // tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public final void b(String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5af825", new Object[]{this, str, new Integer(i), new Float(f)});
            return;
        }
        ckf.g(str, "text");
        c(str, i, f, false);
    }

    public final void c(String str, int i, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c04bf4f", new Object[]{this, str, new Integer(i), new Float(f), new Boolean(z)});
            return;
        }
        ckf.g(str, "text");
        if (!ckf.b(this.c, str)) {
            this.c = str;
            this.b.setColor(i);
            this.b.setTextSize(f);
            this.b.setStrikeThruText(z);
            this.d = 0;
        }
    }
}
