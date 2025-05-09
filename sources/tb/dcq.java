package tb;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dcq extends pw1<PointF, PointF> {
    public final PointF i = new PointF();
    public final PointF j = new PointF();
    public final pw1<Float, Float> k;
    public final pw1<Float, Float> l;
    public fmh<Float> m;
    public fmh<Float> n;

    public dcq(pw1<Float, Float> pw1Var, pw1<Float, Float> pw1Var2) {
        super(Collections.emptyList());
        this.k = pw1Var;
        this.l = pw1Var2;
        m(f());
    }

    @Override // tb.pw1
    public void m(float f) {
        pw1<Float, Float> pw1Var = this.k;
        pw1Var.m(f);
        pw1<Float, Float> pw1Var2 = this.l;
        pw1Var2.m(f);
        this.i.set(pw1Var.h().floatValue(), pw1Var2.h().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f26347a;
            if (i < arrayList.size()) {
                ((pw1.b) arrayList.get(i)).g();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* renamed from: q */
    public PointF i(w4g<PointF> w4gVar, float f) {
        Float f2;
        pw1<Float, Float> pw1Var;
        w4g<Float> b;
        float f3;
        pw1<Float, Float> pw1Var2;
        w4g<Float> b2;
        float f4;
        Float f5 = null;
        if (this.m == null || (b2 = (pw1Var2 = this.k).b()) == null) {
            f2 = null;
        } else {
            float d = pw1Var2.d();
            Float f6 = b2.h;
            fmh<Float> fmhVar = this.m;
            float f7 = b2.g;
            if (f6 == null) {
                f4 = f7;
            } else {
                f4 = f6.floatValue();
            }
            f2 = fmhVar.b(f7, f4, b2.b, b2.c, f, f, d);
        }
        if (!(this.n == null || (b = (pw1Var = this.l).b()) == null)) {
            float d2 = pw1Var.d();
            Float f8 = b.h;
            fmh<Float> fmhVar2 = this.n;
            float f9 = b.g;
            if (f8 == null) {
                f3 = f9;
            } else {
                f3 = f8.floatValue();
            }
            f5 = fmhVar2.b(f9, f3, b.b, b.c, f, f, d2);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f2 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f2.floatValue(), 0.0f);
        }
        if (f5 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return pointF2;
    }

    public void r(fmh<Float> fmhVar) {
        fmh<Float> fmhVar2 = this.m;
        if (fmhVar2 != null) {
            fmhVar2.c(null);
        }
        this.m = fmhVar;
    }

    public void s(fmh<Float> fmhVar) {
        fmh<Float> fmhVar2 = this.n;
        if (fmhVar2 != null) {
            fmhVar2.c(null);
        }
        this.n = fmhVar;
    }
}
