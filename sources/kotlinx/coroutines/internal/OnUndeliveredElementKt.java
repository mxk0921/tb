package kotlinx.coroutines.internal;

import kotlin.coroutines.d;
import tb.g1a;
import tb.sm8;
import tb.tu4;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class OnUndeliveredElementKt {
    public static final <E> g1a<Throwable, xhv> a(g1a<? super E, xhv> g1aVar, E e, d dVar) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(g1aVar, e, dVar);
    }

    public static final <E> void b(g1a<? super E, xhv> g1aVar, E e, d dVar) {
        UndeliveredElementException c = c(g1aVar, e, null);
        if (c != null) {
            tu4.a(dVar, c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException c(g1a<? super E, xhv> g1aVar, E e, UndeliveredElementException undeliveredElementException) {
        try {
            g1aVar.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            sm8.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(g1a g1aVar, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(g1aVar, obj, undeliveredElementException);
    }
}
