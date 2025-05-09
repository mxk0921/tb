package tb;

import android.graphics.Canvas;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.price.M3PriceView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class nwm implements mwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int e = o1p.a(12.0f);

    /* renamed from: a  reason: collision with root package name */
    public final M3PriceView f24994a;
    public final tfe b;
    public int c;
    public pwm d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792434);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792433);
        t2o.a(815792431);
    }

    public nwm(M3PriceView m3PriceView) {
        ckf.g(m3PriceView, "view");
        this.f24994a = m3PriceView;
        this.b = new tfe(m3PriceView, null, 2, null);
    }

    @Override // tb.mwm
    public void a(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fdaa20", new Object[]{this, pwmVar});
            return;
        }
        ckf.g(pwmVar, "priceInfo");
        this.d = pwmVar;
        if (this.c > 0) {
            tfe tfeVar = this.b;
            owm c = pwmVar.c();
            ckf.d(c);
            tfeVar.d(c.b(), this.c, e);
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
        float textHeight = (this.f24994a.getTextHeight() - e) - M3PriceView.Companion.b();
        canvas.translate(0.0f, textHeight);
        this.b.c(canvas);
        canvas.translate(0.0f, -textHeight);
    }

    @Override // tb.gtd
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        pwm pwmVar = this.d;
        if (pwmVar == null) {
            return 0;
        }
        if (this.c == 0) {
            owm c = pwmVar.c();
            ckf.d(c);
            pwm pwmVar2 = this.d;
            ckf.d(pwmVar2);
            owm c2 = pwmVar2.c();
            ckf.d(c2);
            this.c = (int) ((c.c() / c2.a()) * e);
        }
        return this.c;
    }

    @Override // tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.b.e();
        }
    }
}
