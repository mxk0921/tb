package tb;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nrn implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f24908a;
    public final xx0<PointF, PointF> b;
    public final xx0<PointF, PointF> c;
    public final jx0 d;
    public final boolean e;

    public nrn(String str, xx0<PointF, PointF> xx0Var, xx0<PointF, PointF> xx0Var2, jx0 jx0Var, boolean z) {
        this.f24908a = str;
        this.b = xx0Var;
        this.c = xx0Var2;
        this.d = jx0Var;
        this.e = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new krn(lottieDrawable, aVar, this);
    }

    public jx0 b() {
        return this.d;
    }

    public String c() {
        return this.f24908a;
    }

    public xx0<PointF, PointF> d() {
        return this.b;
    }

    public xx0<PointF, PointF> e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
