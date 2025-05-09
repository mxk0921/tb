package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ar4;
import tb.dv6;
import tb.ogv;
import tb.qgv;
import tb.uu4;
import tb.vu4;
import tb.zq7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final d a(d dVar, d dVar2, boolean z) {
        boolean c = c(dVar);
        boolean c2 = c(dVar2);
        if (!c && !c2) {
            return dVar.plus(dVar2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = dVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        d dVar3 = (d) dVar.fold(emptyCoroutineContext, new CoroutineContextKt$foldCopies$folded$1(ref$ObjectRef, z));
        if (c2) {
            ref$ObjectRef.element = ((d) ref$ObjectRef.element).fold(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.INSTANCE);
        }
        return dVar3.plus((d) ref$ObjectRef.element);
    }

    public static final String b(d dVar) {
        d dVar2;
        if (!dv6.b() || (dVar2 = (d) dVar.get(d.Key)) == null) {
            return null;
        }
        e eVar = (e) dVar.get(e.Key);
        return "coroutine#" + dVar2.N0();
    }

    public static final boolean c(d dVar) {
        return ((Boolean) dVar.fold(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.INSTANCE)).booleanValue();
    }

    public static final d d(d dVar, d dVar2) {
        if (!c(dVar2)) {
            return dVar.plus(dVar2);
        }
        return a(dVar, dVar2, false);
    }

    public static final d e(uu4 uu4Var, d dVar) {
        d dVar2;
        d a2 = a(uu4Var.getCoroutineContext(), dVar, true);
        if (dv6.b()) {
            dVar2 = a2.plus(new d(dv6.a().incrementAndGet()));
        } else {
            dVar2 = a2;
        }
        if (a2 == zq7.a() || a2.get(c.Key) != null) {
            return dVar2;
        }
        return dVar2.plus(zq7.a());
    }

    public static final ogv<?> f(vu4 vu4Var) {
        while (!(vu4Var instanceof i) && (vu4Var = vu4Var.getCallerFrame()) != null) {
            if (vu4Var instanceof ogv) {
                return (ogv) vu4Var;
            }
        }
        return null;
    }

    public static final ogv<?> g(ar4<?> ar4Var, d dVar, Object obj) {
        if (!(ar4Var instanceof vu4) || dVar.get(qgv.INSTANCE) == null) {
            return null;
        }
        ogv<?> f = f((vu4) ar4Var);
        if (f != null) {
            f.x1(dVar, obj);
        }
        return f;
    }
}
