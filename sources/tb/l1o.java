package tb;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l1o implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23058a;
    public final jx0 b;
    public final jx0 c;
    public final vx0 d;
    public final boolean e;

    public l1o(String str, jx0 jx0Var, jx0 jx0Var2, vx0 vx0Var, boolean z) {
        this.f23058a = str;
        this.b = jx0Var;
        this.c = jx0Var2;
        this.d = vx0Var;
        this.e = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new m1o(lottieDrawable, aVar, this);
    }

    public jx0 b() {
        return this.b;
    }

    public String c() {
        return this.f23058a;
    }

    public jx0 d() {
        return this.c;
    }

    public vx0 e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}
