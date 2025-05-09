package tb;

import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ia4 {
    public static final <T> Object a(Object obj, ar4<? super T> ar4Var) {
        if (!(obj instanceof fa4)) {
            return Result.m1108constructorimpl(obj);
        }
        Throwable th = ((fa4) obj).f19137a;
        if (dv6.c() && (ar4Var instanceof vu4)) {
            th = rgq.i(th, (vu4) ar4Var);
        }
        return Result.m1108constructorimpl(b.a(th));
    }

    public static final <T> Object b(Object obj, q23<?> q23Var) {
        Throwable th = Result.m1111exceptionOrNullimpl(obj);
        if (th != null) {
            if (dv6.c() && (q23Var instanceof vu4)) {
                th = rgq.i(th, (vu4) q23Var);
            }
            obj = new fa4(th, false, 2, null);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, g1a<? super Throwable, xhv> g1aVar) {
        Throwable th = Result.m1111exceptionOrNullimpl(obj);
        if (th != null) {
            return new fa4(th, false, 2, null);
        }
        if (g1aVar != null) {
            return new ga4(obj, g1aVar);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, g1a g1aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            g1aVar = null;
        }
        return c(obj, g1aVar);
    }
}
