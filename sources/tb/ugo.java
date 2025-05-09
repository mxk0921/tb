package tb;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ugo implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f29363a;
    public final xx0<Float, Float> b;

    public ugo(String str, xx0<Float, Float> xx0Var) {
        this.f29363a = str;
        this.b = xx0Var;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new vgo(lottieDrawable, aVar, this);
    }

    public xx0<Float, Float> b() {
        return this.b;
    }

    public String c() {
        return this.f29363a;
    }
}
