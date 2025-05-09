package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import tb.ar4;
import tb.f9p;
import tb.rgq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface ReceiveChannel<E> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void a(ReceiveChannel receiveChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                receiveChannel.a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E b(ReceiveChannel<? extends E> receiveChannel) {
            E e = (E) receiveChannel.o();
            if (e.h(e)) {
                e.e(e);
                return e;
            }
            Throwable c = e.c(e);
            if (c == null) {
                return null;
            }
            throw rgq.j(c);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <E> java.lang.Object c(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r4, tb.ar4<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                if (r0 == 0) goto L_0x0013
                r0 = r5
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = (kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = new kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                r0.<init>(r5)
            L_0x0018:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = tb.dkf.d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                kotlin.b.b(r5)
                kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.e) r5
                java.lang.Object r4 = r5.j()
                goto L_0x0043
            L_0x002f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0037:
                kotlin.b.b(r5)
                r0.label = r3
                java.lang.Object r4 = r4.i(r0)
                if (r4 != r1) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Object r4 = kotlinx.coroutines.channels.e.d(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.c(kotlinx.coroutines.channels.ReceiveChannel, tb.ar4):java.lang.Object");
        }
    }

    void a(CancellationException cancellationException);

    Object i(ar4<? super e<? extends E>> ar4Var);

    ChannelIterator<E> iterator();

    f9p<E> j();

    f9p<e<E>> n();

    Object o();
}
