package kotlin.coroutines;

import kotlin.coroutines.c;
import kotlin.coroutines.d;
import tb.ckf;
import tb.u1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static d b(d dVar, d dVar2) {
            ckf.g(dVar2, "context");
            if (dVar2 == EmptyCoroutineContext.INSTANCE) {
                return dVar;
            }
            return (d) dVar2.fold(dVar, new u1a() { // from class: tb.nu4
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    d c;
                    c = d.a.c((d) obj, (d.b) obj2);
                    return c;
                }
            });
        }

        public static d c(d dVar, b bVar) {
            CombinedContext combinedContext;
            ckf.g(dVar, "acc");
            ckf.g(bVar, "element");
            d minusKey = dVar.minusKey(bVar.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (minusKey == emptyCoroutineContext) {
                return bVar;
            }
            c.b bVar2 = kotlin.coroutines.c.Key;
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) minusKey.get(bVar2);
            if (cVar == null) {
                combinedContext = new CombinedContext(minusKey, bVar);
            } else {
                d minusKey2 = minusKey.minusKey(bVar2);
                if (minusKey2 == emptyCoroutineContext) {
                    return new CombinedContext(bVar, cVar);
                }
                combinedContext = new CombinedContext(new CombinedContext(minusKey2, bVar), cVar);
            }
            return combinedContext;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface b extends d {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class a {
            public static <R> R a(b bVar, R r, u1a<? super R, ? super b, ? extends R> u1aVar) {
                ckf.g(u1aVar, "operation");
                return (R) u1aVar.invoke(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                ckf.g(cVar, "key");
                if (ckf.b(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static d c(b bVar, c<?> cVar) {
                ckf.g(cVar, "key");
                if (ckf.b(bVar.getKey(), cVar)) {
                    return EmptyCoroutineContext.INSTANCE;
                }
                return bVar;
            }

            public static d d(b bVar, d dVar) {
                ckf.g(dVar, "context");
                return a.b(bVar, dVar);
            }
        }

        c<?> getKey();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r, u1a<? super R, ? super b, ? extends R> u1aVar);

    <E extends b> E get(c<E> cVar);

    d minusKey(c<?> cVar);

    d plus(d dVar);
}
