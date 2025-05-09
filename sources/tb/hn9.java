package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hn9 extends x4g<Float> {
    public hn9(List<w4g<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    public float q(w4g<Float> w4gVar, float f) {
        if (w4gVar.b == null || w4gVar.c == null) {
            zhh.b("Missing values for keyframe.");
            return 0.0f;
        }
        fmh<A> fmhVar = this.e;
        if (fmhVar != 0) {
            Float f2 = (Float) fmhVar.b(w4gVar.g, w4gVar.h.floatValue(), w4gVar.b, w4gVar.c, f, e(), f());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return uvi.k(w4gVar.f(), w4gVar.c(), f);
    }

    /* renamed from: r */
    public Float i(w4g<Float> w4gVar, float f) {
        return Float.valueOf(q(w4gVar, f));
    }
}
