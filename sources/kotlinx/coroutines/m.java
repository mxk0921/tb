package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import tb.ar4;
import tb.g1a;
import tb.hr3;
import tb.jr3;
import tb.rr7;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface m extends d.b {
    public static final b Key = b.f15385a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static /* synthetic */ void b(m mVar, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                mVar.a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R c(m mVar, R r, u1a<? super R, ? super d.b, ? extends R> u1aVar) {
            return (R) d.b.a.a(mVar, r, u1aVar);
        }

        public static <E extends d.b> E d(m mVar, d.c<E> cVar) {
            return (E) d.b.a.b(mVar, cVar);
        }

        public static /* synthetic */ rr7 e(m mVar, boolean z, boolean z2, g1a g1aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return mVar.F(z, z2, g1aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static d f(m mVar, d.c<?> cVar) {
            return d.b.a.c(mVar, cVar);
        }

        public static d g(m mVar, d dVar) {
            return d.b.a.d(mVar, dVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements d.c<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f15385a = new b();
    }

    hr3 B0(jr3 jr3Var);

    rr7 D0(g1a<? super Throwable, xhv> g1aVar);

    rr7 F(boolean z, boolean z2, g1a<? super Throwable, xhv> g1aVar);

    void a(CancellationException cancellationException);

    Object f0(ar4<? super xhv> ar4Var);

    m getParent();

    boolean isActive();

    boolean isCancelled();

    boolean start();

    CancellationException u0();
}
