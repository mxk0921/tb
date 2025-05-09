package tb;

import android.graphics.Color;
import android.graphics.Paint;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g08 implements pw1.b {

    /* renamed from: a  reason: collision with root package name */
    public final pw1.b f19659a;
    public final pw1<Integer, Integer> b;
    public final pw1<Float, Float> c;
    public final pw1<Float, Float> d;
    public final pw1<Float, Float> e;
    public final pw1<Float, Float> f;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends fmh<Float> {
        public final /* synthetic */ fmh c;

        public a(g08 g08Var, fmh fmhVar) {
            this.c = fmhVar;
        }

        /* renamed from: d */
        public Float a(nlh<Float> nlhVar) {
            Float f = (Float) this.c.a(nlhVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public g08(pw1.b bVar, com.airbnb.lottie.model.layer.a aVar, e08 e08Var) {
        this.f19659a = bVar;
        pw1<Integer, Integer> a2 = e08Var.a().a();
        this.b = a2;
        a2.a(this);
        aVar.i(a2);
        pw1<Float, Float> a3 = e08Var.d().a();
        this.c = a3;
        a3.a(this);
        aVar.i(a3);
        pw1<Float, Float> a4 = e08Var.b().a();
        this.d = a4;
        a4.a(this);
        aVar.i(a4);
        pw1<Float, Float> a5 = e08Var.c().a();
        this.e = a5;
        a5.a(this);
        aVar.i(a5);
        pw1<Float, Float> a6 = e08Var.e().a();
        this.f = a6;
        a6.a(this);
        aVar.i(a6);
    }

    public void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double floatValue = this.d.h().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.e.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.b.h().intValue();
            paint.setShadowLayer(this.f.h().floatValue(), sin, cos, Color.argb(Math.round(this.c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void b(fmh<Integer> fmhVar) {
        this.b.n(fmhVar);
    }

    public void c(fmh<Float> fmhVar) {
        this.d.n(fmhVar);
    }

    public void d(fmh<Float> fmhVar) {
        this.e.n(fmhVar);
    }

    public void e(fmh<Float> fmhVar) {
        pw1<Float, Float> pw1Var = this.c;
        if (fmhVar == null) {
            pw1Var.n(null);
        } else {
            pw1Var.n(new a(this, fmhVar));
        }
    }

    public void f(fmh<Float> fmhVar) {
        this.f.n(fmhVar);
    }

    @Override // tb.pw1.b
    public void g() {
        this.g = true;
        this.f19659a.g();
    }
}
