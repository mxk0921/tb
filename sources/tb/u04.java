package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u04 extends x4g<Integer> {
    public u04(List<w4g<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(w4g<Integer> w4gVar, float f) {
        if (w4gVar.b == null || w4gVar.c == null) {
            zhh.b("Missing values for keyframe.");
            return 0;
        }
        fmh<A> fmhVar = this.e;
        if (fmhVar != 0) {
            Integer num = (Integer) fmhVar.b(w4gVar.g, w4gVar.h.floatValue(), w4gVar.b, w4gVar.c, f, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return p4a.c(uvi.c(f, 0.0f, 1.0f), w4gVar.b.intValue(), w4gVar.c.intValue());
    }

    /* renamed from: r */
    public Integer i(w4g<Integer> w4gVar, float f) {
        return Integer.valueOf(q(w4gVar, f));
    }
}
