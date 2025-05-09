package tb;

import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class u23 {
    public static final void a(ar4<?> ar4Var, Throwable th) {
        ar4Var.resumeWith(Result.m1108constructorimpl(b.a(th)));
        throw th;
    }

    public static final void b(ar4<? super xhv> ar4Var, ar4<?> ar4Var2) {
        try {
            vq7.b(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), Result.m1108constructorimpl(xhv.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            a(ar4Var2, th);
            throw null;
        }
    }

    public static final <T> void c(g1a<? super ar4<? super T>, ? extends Object> g1aVar, ar4<? super T> ar4Var) {
        try {
            vq7.b(IntrinsicsKt__IntrinsicsJvmKt.c(IntrinsicsKt__IntrinsicsJvmKt.a(g1aVar, ar4Var)), Result.m1108constructorimpl(xhv.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            a(ar4Var, th);
            throw null;
        }
    }

    public static final <R, T> void d(u1a<? super R, ? super ar4<? super T>, ? extends Object> u1aVar, R r, ar4<? super T> ar4Var, g1a<? super Throwable, xhv> g1aVar) {
        try {
            vq7.a(IntrinsicsKt__IntrinsicsJvmKt.c(IntrinsicsKt__IntrinsicsJvmKt.b(u1aVar, r, ar4Var)), Result.m1108constructorimpl(xhv.INSTANCE), g1aVar);
        } catch (Throwable th) {
            a(ar4Var, th);
            throw null;
        }
    }

    public static /* synthetic */ void e(u1a u1aVar, Object obj, ar4 ar4Var, g1a g1aVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            g1aVar = null;
        }
        d(u1aVar, obj, ar4Var, g1aVar);
    }
}
