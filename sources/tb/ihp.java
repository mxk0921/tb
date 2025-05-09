package tb;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ihp implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21316a;
    public final Path.FillType b;
    public final String c;
    public final ix0 d;
    public final lx0 e;
    public final boolean f;

    public ihp(String str, boolean z, Path.FillType fillType, ix0 ix0Var, lx0 lx0Var, boolean z2) {
        this.c = str;
        this.f21316a = z;
        this.b = fillType;
        this.d = ix0Var;
        this.e = lx0Var;
        this.f = z2;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new qh9(lottieDrawable, aVar, this);
    }

    public ix0 b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public lx0 e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f21316a + '}';
    }
}
