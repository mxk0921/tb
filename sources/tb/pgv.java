package tb;

import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.d;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ThreadContextKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class pgv {
    public static final <T> void a(g1a<? super ar4<? super T>, ? extends Object> g1aVar, ar4<? super T> ar4Var) {
        jv6.a(ar4Var);
        try {
            d context = ar4Var.getContext();
            Object c = ThreadContextKt.c(context, null);
            kqu.e(g1aVar, 1);
            Object invoke = g1aVar.invoke(ar4Var);
            ThreadContextKt.a(context, c);
            if (invoke != dkf.d()) {
                ar4Var.resumeWith(Result.m1108constructorimpl(invoke));
            }
        } catch (Throwable th) {
            ar4Var.resumeWith(Result.m1108constructorimpl(b.a(th)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T> void b(u1a<? super R, ? super ar4<? super T>, ? extends Object> u1aVar, R r, ar4<? super T> ar4Var) {
        jv6.a(ar4Var);
        try {
            d context = ar4Var.getContext();
            Object c = ThreadContextKt.c(context, null);
            kqu.e(u1aVar, 2);
            Object invoke = u1aVar.invoke(r, ar4Var);
            ThreadContextKt.a(context, c);
            if (invoke != dkf.d()) {
                ar4Var.resumeWith(Result.m1108constructorimpl(invoke));
            }
        } catch (Throwable th) {
            ar4Var.resumeWith(Result.m1108constructorimpl(b.a(th)));
        }
    }

    public static final <T, R> Object c(wuo<? super T> wuoVar, R r, u1a<? super R, ? super ar4<? super T>, ? extends Object> u1aVar) {
        Object obj;
        Throwable i;
        try {
            kqu.e(u1aVar, 2);
            obj = u1aVar.invoke(r, wuoVar);
        } catch (Throwable th) {
            obj = new fa4(th, false, 2, null);
        }
        if (obj == dkf.d()) {
            return dkf.d();
        }
        Object P0 = wuoVar.P0(obj);
        if (P0 == suf.COMPLETING_WAITING_CHILDREN) {
            return dkf.d();
        }
        if (!(P0 instanceof fa4)) {
            return suf.b(P0);
        }
        Throwable th2 = ((fa4) P0).f19137a;
        ar4<? super T> ar4Var = wuoVar.f;
        if (!dv6.c() || !(ar4Var instanceof vu4)) {
            throw th2;
        }
        i = rgq.i(th2, (vu4) ar4Var);
        throw i;
    }

    public static final <T, R> Object d(wuo<? super T> wuoVar, R r, u1a<? super R, ? super ar4<? super T>, ? extends Object> u1aVar) {
        Object obj;
        Throwable i;
        Throwable i2;
        try {
            kqu.e(u1aVar, 2);
            obj = u1aVar.invoke(r, wuoVar);
        } catch (Throwable th) {
            obj = new fa4(th, false, 2, null);
        }
        if (obj == dkf.d()) {
            return dkf.d();
        }
        Object P0 = wuoVar.P0(obj);
        if (P0 == suf.COMPLETING_WAITING_CHILDREN) {
            return dkf.d();
        }
        if (P0 instanceof fa4) {
            Throwable th2 = ((fa4) P0).f19137a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != wuoVar) {
                ar4<? super T> ar4Var = wuoVar.f;
                if (!dv6.c() || !(ar4Var instanceof vu4)) {
                    throw th2;
                }
                i = rgq.i(th2, (vu4) ar4Var);
                throw i;
            } else if (obj instanceof fa4) {
                Throwable th3 = ((fa4) obj).f19137a;
                ar4<? super T> ar4Var2 = wuoVar.f;
                if (!dv6.c() || !(ar4Var2 instanceof vu4)) {
                    throw th3;
                }
                i2 = rgq.i(th3, (vu4) ar4Var2);
                throw i2;
            }
        } else {
            obj = suf.b(P0);
        }
        return obj;
    }
}
