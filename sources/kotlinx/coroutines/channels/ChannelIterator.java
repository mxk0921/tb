package kotlinx.coroutines.channels;

import tb.ar4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface ChannelIterator<E> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ java.lang.Object a(kotlinx.coroutines.channels.ChannelIterator r4, tb.ar4 r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelIterator$next0$1
                if (r0 == 0) goto L_0x0013
                r0 = r5
                kotlinx.coroutines.channels.ChannelIterator$next0$1 r0 = (kotlinx.coroutines.channels.ChannelIterator$next0$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.channels.ChannelIterator$next0$1 r0 = new kotlinx.coroutines.channels.ChannelIterator$next0$1
                r0.<init>(r5)
            L_0x0018:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = tb.dkf.d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                kotlin.b.b(r5)
                goto L_0x0043
            L_0x002d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0035:
                kotlin.b.b(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r4.a(r0)
                if (r5 != r1) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0050
                java.lang.Object r4 = r4.next()
                return r4
            L_0x0050:
                kotlinx.coroutines.channels.ClosedReceiveChannelException r4 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.a(kotlinx.coroutines.channels.ChannelIterator, tb.ar4):java.lang.Object");
        }
    }

    Object a(ar4<? super Boolean> ar4Var);

    E next();
}
