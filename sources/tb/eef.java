package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eef extends x4g<Integer> {
    public eef(List<w4g<Integer>> list) {
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
        return uvi.l(w4gVar.g(), w4gVar.d(), f);
    }

    /* renamed from: r */
    public Integer i(w4g<Integer> w4gVar, float f) {
        return Integer.valueOf(q(w4gVar, f));
    }
}
