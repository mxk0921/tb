package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import tb.ar4;
import tb.dkf;
import tb.jv6;
import tb.q23;
import tb.rr7;
import tb.t07;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface h {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object a(h hVar, long j, ar4<? super xhv> ar4Var) {
            if (j <= 0) {
                return xhv.INSTANCE;
            }
            c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
            cVar.E();
            hVar.c(j, cVar);
            Object A = cVar.A();
            if (A == dkf.d()) {
                jv6.c(ar4Var);
            }
            if (A == dkf.d()) {
                return A;
            }
            return xhv.INSTANCE;
        }

        public static rr7 b(h hVar, long j, Runnable runnable, d dVar) {
            return t07.a().b(j, runnable, dVar);
        }
    }

    rr7 b(long j, Runnable runnable, d dVar);

    void c(long j, q23<? super xhv> q23Var);
}
