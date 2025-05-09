package kotlin.coroutines;

import kotlin.coroutines.d;
import tb.ar4;
import tb.ckf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface c extends d.b {
    public static final b Key = b.f15244a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static <E extends d.b> E a(c cVar, d.c<E> cVar2) {
            ckf.g(cVar2, "key");
            if (cVar2 instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar2;
                if (!bVar.a(cVar.getKey())) {
                    return null;
                }
                E e = (E) bVar.b(cVar);
                if (e instanceof d.b) {
                    return e;
                }
                return null;
            } else if (c.Key != cVar2) {
                return null;
            } else {
                ckf.e(cVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return cVar;
            }
        }

        public static d b(c cVar, d.c<?> cVar2) {
            ckf.g(cVar2, "key");
            if (cVar2 instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar2;
                if (!bVar.a(cVar.getKey()) || bVar.b(cVar) == null) {
                    return cVar;
                }
                return EmptyCoroutineContext.INSTANCE;
            } else if (c.Key == cVar2) {
                return EmptyCoroutineContext.INSTANCE;
            } else {
                return cVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements d.c<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f15244a = new b();
    }

    <T> ar4<T> interceptContinuation(ar4<? super T> ar4Var);

    void releaseInterceptedContinuation(ar4<?> ar4Var);
}
