package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.d.b;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class b<B extends d.b, E extends B> implements d.c<E> {

    /* renamed from: a  reason: collision with root package name */
    public final g1a<d.b, E> f15243a;
    public final d.c<?> b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [tb.g1a<kotlin.coroutines.d$b, E extends B>, tb.g1a<? super kotlin.coroutines.d$b, ? extends E extends B>, java.lang.Object] */
    public b(d.c<B> cVar, g1a<? super d.b, ? extends E> g1aVar) {
        ckf.g(cVar, "baseKey");
        ckf.g(g1aVar, "safeCast");
        this.f15243a = g1aVar;
        this.b = cVar instanceof b ? (d.c<B>) ((b) cVar).b : cVar;
    }

    public final boolean a(d.c<?> cVar) {
        ckf.g(cVar, "key");
        if (cVar == this || this.b == cVar) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/d$b;)TE; */
    public final d.b b(d.b bVar) {
        ckf.g(bVar, "element");
        return (d.b) this.f15243a.invoke(bVar);
    }
}
