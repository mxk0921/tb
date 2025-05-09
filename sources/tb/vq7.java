package tb;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class vq7 {

    /* renamed from: a  reason: collision with root package name */
    public static final u1r f30175a = new u1r("UNDEFINED");
    public static final u1r REUSABLE_CLAIMED = new u1r("REUSABLE_CLAIMED");

    public static final <T> void a(ar4<? super T> ar4Var, Object obj, g1a<? super Throwable, xhv> g1aVar) {
        ogv<?> ogvVar;
        if (ar4Var instanceof uq7) {
            uq7 uq7Var = (uq7) ar4Var;
            Object c = ia4.c(obj, g1aVar);
            if (uq7Var.d.isDispatchNeeded(uq7Var.getContext())) {
                uq7Var.f = c;
                uq7Var.c = 1;
                uq7Var.d.dispatch(uq7Var.getContext(), uq7Var);
                return;
            }
            String str = dv6.DEBUG_PROPERTY_NAME;
            sk8 a2 = mqt.INSTANCE.a();
            if (a2.V0()) {
                uq7Var.f = c;
                uq7Var.c = 1;
                a2.Q0(uq7Var);
                return;
            }
            a2.S0(true);
            try {
                m mVar = (m) uq7Var.getContext().get(m.Key);
                if (mVar == null || mVar.isActive()) {
                    ar4<T> ar4Var2 = uq7Var.e;
                    Object obj2 = uq7Var.g;
                    d context = ar4Var2.getContext();
                    Object c2 = ThreadContextKt.c(context, obj2);
                    if (c2 != ThreadContextKt.NO_THREAD_ELEMENTS) {
                        ogvVar = CoroutineContextKt.g(ar4Var2, context, c2);
                    } else {
                        ogvVar = null;
                    }
                    uq7Var.e.resumeWith(obj);
                    xhv xhvVar = xhv.INSTANCE;
                    if (ogvVar == null || ogvVar.w1()) {
                        ThreadContextKt.a(context, c2);
                    }
                } else {
                    CancellationException u0 = mVar.u0();
                    uq7Var.b(c, u0);
                    uq7Var.resumeWith(Result.m1108constructorimpl(b.a(u0)));
                }
                do {
                } while (a2.Y0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        ar4Var.resumeWith(obj);
    }

    public static /* synthetic */ void b(ar4 ar4Var, Object obj, g1a g1aVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            g1aVar = null;
        }
        a(ar4Var, obj, g1aVar);
    }

    public static final boolean c(uq7<? super xhv> uq7Var) {
        xhv xhvVar = xhv.INSTANCE;
        String str = dv6.DEBUG_PROPERTY_NAME;
        sk8 a2 = mqt.INSTANCE.a();
        if (a2.W0()) {
            return false;
        }
        if (a2.V0()) {
            uq7Var.f = xhvVar;
            uq7Var.c = 1;
            a2.Q0(uq7Var);
            return true;
        }
        a2.S0(true);
        try {
            uq7Var.run();
            do {
            } while (a2.Y0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
