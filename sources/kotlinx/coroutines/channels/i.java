package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import tb.ar4;
import tb.g1a;
import tb.h9p;
import tb.rgq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface i<E> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static /* synthetic */ boolean a(i iVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return iVar.s(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean b(i<? super E> iVar, E e) {
            Object m = iVar.m(e);
            if (e.h(m)) {
                return true;
            }
            Throwable c = e.c(m);
            if (c == null) {
                return false;
            }
            throw rgq.j(c);
        }
    }

    h9p<E, i<E>> b();

    Object d(E e, ar4<? super xhv> ar4Var);

    boolean f();

    void k(g1a<? super Throwable, xhv> g1aVar);

    Object m(E e);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e);

    boolean s(Throwable th);
}
