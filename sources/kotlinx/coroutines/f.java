package kotlinx.coroutines;

import kotlin.coroutines.d;
import tb.ar4;
import tb.dkf;
import tb.jv6;
import tb.oq4;
import tb.pgv;
import tb.t94;
import tb.u1a;
import tb.uu4;
import tb.wuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class f {
    public static final uu4 a(d dVar) {
        t94 b;
        if (dVar.get(m.Key) == null) {
            b = n.b(null, 1, null);
            dVar = dVar.plus(b);
        }
        return new oq4(dVar);
    }

    public static final <R> Object b(u1a<? super uu4, ? super ar4<? super R>, ? extends Object> u1aVar, ar4<? super R> ar4Var) {
        wuo wuoVar = new wuo(ar4Var.getContext(), ar4Var);
        Object c = pgv.c(wuoVar, wuoVar, u1aVar);
        if (c == dkf.d()) {
            jv6.c(ar4Var);
        }
        return c;
    }
}
