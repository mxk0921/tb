package tb;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class nn2 {
    public static final m a(uu4 uu4Var, d dVar, CoroutineStart coroutineStart, u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        a aVar;
        d e = CoroutineContextKt.e(uu4Var, dVar);
        if (coroutineStart.isLazy()) {
            aVar = new rjg(e, u1aVar);
        } else {
            aVar = new dhq(e, true);
        }
        aVar.v1(coroutineStart, aVar, u1aVar);
        return aVar;
    }

    public static /* synthetic */ m b(uu4 uu4Var, d dVar, CoroutineStart coroutineStart, u1a u1aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return mn2.a(uu4Var, dVar, coroutineStart, u1aVar);
    }

    /* JADX WARN: Finally extract failed */
    public static final <T> Object c(d dVar, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        Object obj;
        d context = ar4Var.getContext();
        d d = CoroutineContextKt.d(context, dVar);
        quf.f(d);
        if (d == context) {
            wuo wuoVar = new wuo(d, ar4Var);
            obj = pgv.c(wuoVar, wuoVar, u1aVar);
        } else {
            c.b bVar = c.Key;
            if (ckf.b(d.get(bVar), context.get(bVar))) {
                ogv ogvVar = new ogv(d, ar4Var);
                d context2 = ogvVar.getContext();
                Object c = ThreadContextKt.c(context2, null);
                try {
                    Object c2 = pgv.c(ogvVar, ogvVar, u1aVar);
                    ThreadContextKt.a(context2, c);
                    obj = c2;
                } catch (Throwable th) {
                    ThreadContextKt.a(context2, c);
                    throw th;
                }
            } else {
                i iVar = new i(d, ar4Var);
                u23.e(u1aVar, iVar, iVar, null, 4, null);
                obj = iVar.w1();
            }
        }
        if (obj == dkf.d()) {
            jv6.c(ar4Var);
        }
        return obj;
    }
}
