package tb;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qhp implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f26762a;
    public final int b;
    public final qx0 c;
    public final boolean d;

    public qhp(String str, int i, qx0 qx0Var, boolean z) {
        this.f26762a = str;
        this.b = i;
        this.c = qx0Var;
        this.d = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new fhp(lottieDrawable, aVar, this);
    }

    public String b() {
        return this.f26762a;
    }

    public qx0 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f26762a + ", index=" + this.b + '}';
    }
}
