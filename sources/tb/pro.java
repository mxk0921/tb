package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pro extends x4g<rro> {
    public final rro i = new rro();

    public pro(List<w4g<rro>> list) {
        super(list);
    }

    /* renamed from: p */
    public rro i(w4g<rro> w4gVar, float f) {
        rro rroVar;
        rro rroVar2 = w4gVar.b;
        if (rroVar2 == null || (rroVar = w4gVar.c) == null) {
            zhh.b("Missing values for keyframe.");
            return new rro();
        }
        rro rroVar3 = rroVar2;
        rro rroVar4 = rroVar;
        fmh<A> fmhVar = this.e;
        if (fmhVar != 0) {
            rro rroVar5 = (rro) fmhVar.b(w4gVar.g, w4gVar.h.floatValue(), rroVar3, rroVar4, f, e(), f());
            if (rroVar5 != null) {
                return rroVar5;
            }
        }
        float k = uvi.k(rroVar3.b(), rroVar4.b(), f);
        float k2 = uvi.k(rroVar3.c(), rroVar4.c(), f);
        rro rroVar6 = this.i;
        rroVar6.d(k, k2);
        return rroVar6;
    }
}
