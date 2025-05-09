package tb;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ria implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final GradientType f27402a;
    public final Path.FillType b;
    public final kx0 c;
    public final lx0 d;
    public final ox0 e;
    public final ox0 f;
    public final String g;
    public final boolean h;

    public ria(String str, GradientType gradientType, Path.FillType fillType, kx0 kx0Var, lx0 lx0Var, ox0 ox0Var, ox0 ox0Var2, jx0 jx0Var, jx0 jx0Var2, boolean z) {
        this.f27402a = gradientType;
        this.b = fillType;
        this.c = kx0Var;
        this.d = lx0Var;
        this.e = ox0Var;
        this.f = ox0Var2;
        this.g = str;
        this.h = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new sia(lottieDrawable, aVar, this);
    }

    public ox0 b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public kx0 d() {
        return this.c;
    }

    public GradientType e() {
        return this.f27402a;
    }

    public String f() {
        return this.g;
    }

    public lx0 g() {
        return this.d;
    }

    public ox0 h() {
        return this.e;
    }

    public boolean i() {
        return this.h;
    }
}
