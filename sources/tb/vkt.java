package tb;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vkt {
    public final LottieAnimationView b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f30075a = new HashMap();
    public final boolean c = true;

    public vkt(LottieAnimationView lottieAnimationView) {
        this.b = lottieAnimationView;
    }

    public final String a(String str, String str2) {
        Map<String, String> map = this.f30075a;
        boolean z = this.c;
        if (z && ((HashMap) map).containsKey(str2)) {
            return (String) ((HashMap) map).get(str2);
        }
        if (z) {
            ((HashMap) map).put(str2, str2);
        }
        return str2;
    }

    public final void b() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
    }

    public void c(String str, String str2) {
        ((HashMap) this.f30075a).put(str, str2);
        b();
    }
}
