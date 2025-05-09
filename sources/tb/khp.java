package tb;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class khp implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f22675a;
    public final List<tp4> b;
    public final boolean c;

    public khp(String str, List<tp4> list, boolean z) {
        this.f22675a = str;
        this.b = list;
        this.c = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new xo4(lottieDrawable, aVar, this);
    }

    public List<tp4> b() {
        return this.b;
    }

    public String c() {
        return this.f22675a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f22675a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
