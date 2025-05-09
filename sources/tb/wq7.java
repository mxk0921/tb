package tb;

import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class wq7 {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final <T> void a(j<? super T> jVar, int i) {
        boolean z;
        String str = dv6.DEBUG_PROPERTY_NAME;
        ar4<? super T> d = jVar.d();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(d instanceof uq7) || b(i) != b(jVar.c)) {
            d(jVar, d, z);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((uq7) d).d;
        d context = ((uq7) d).getContext();
        if (coroutineDispatcher.isDispatchNeeded(context)) {
            coroutineDispatcher.dispatch(context, jVar);
        } else {
            e(jVar);
        }
    }

    public static final boolean b(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static final <T> void d(j<? super T> jVar, ar4<? super T> ar4Var, boolean z) {
        Object f;
        ogv<?> ogvVar;
        Object i = jVar.i();
        Throwable e = jVar.e(i);
        if (e != null) {
            f = b.a(e);
        } else {
            f = jVar.f(i);
        }
        Object obj = Result.m1108constructorimpl(f);
        if (z) {
            ckf.e(ar4Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            uq7 uq7Var = (uq7) ar4Var;
            ar4<T> ar4Var2 = uq7Var.e;
            Object obj2 = uq7Var.g;
            d context = ar4Var2.getContext();
            Object c = ThreadContextKt.c(context, obj2);
            if (c != ThreadContextKt.NO_THREAD_ELEMENTS) {
                ogvVar = CoroutineContextKt.g(ar4Var2, context, c);
            } else {
                ogvVar = null;
            }
            try {
                uq7Var.e.resumeWith(obj);
                xhv xhvVar = xhv.INSTANCE;
            } finally {
                if (ogvVar == null || ogvVar.w1()) {
                    ThreadContextKt.a(context, c);
                }
            }
        } else {
            ar4Var.resumeWith(obj);
        }
    }

    public static final void e(j<?> jVar) {
        sk8 a2 = mqt.INSTANCE.a();
        if (a2.V0()) {
            a2.Q0(jVar);
            return;
        }
        a2.S0(true);
        try {
            d(jVar, jVar.d(), true);
            do {
            } while (a2.Y0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
