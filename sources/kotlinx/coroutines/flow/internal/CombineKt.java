package kotlinx.coroutines.flow.internal;

import tb.ar4;
import tb.d1a;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.up9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CombineKt {
    public static final <R, T> Object a(sp9<? super R> sp9Var, qp9<? extends T>[] qp9VarArr, d1a<T[]> d1aVar, w1a<? super sp9<? super R>, ? super T[], ? super ar4<? super xhv>, ? extends Object> w1aVar, ar4<? super xhv> ar4Var) {
        Object a2 = up9.a(new CombineKt$combineInternal$2(qp9VarArr, d1aVar, w1aVar, sp9Var, null), ar4Var);
        if (a2 == dkf.d()) {
            return a2;
        }
        return xhv.INSTANCE;
    }
}
