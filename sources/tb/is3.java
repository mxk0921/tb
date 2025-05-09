package tb;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class is3 implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21543a;
    public final xx0<PointF, PointF> b;
    public final ox0 c;
    public final boolean d;
    public final boolean e;

    public is3(String str, xx0<PointF, PointF> xx0Var, ox0 ox0Var, boolean z, boolean z2) {
        this.f21543a = str;
        this.b = xx0Var;
        this.c = ox0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new bb8(lottieDrawable, aVar, this);
    }

    public String b() {
        return this.f21543a;
    }

    public xx0<PointF, PointF> c() {
        return this.b;
    }

    public ox0 d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
