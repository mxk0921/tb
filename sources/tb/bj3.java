package tb;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt;
import kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class bj3 {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void b(ReceiveChannel<?> receiveChannel, Throwable th) {
        ChannelsKt__Channels_commonKt.a(receiveChannel, th);
    }

    public static final <E, C extends i<? super E>> Object s(ReceiveChannel<? extends E> receiveChannel, C c, ar4<? super C> ar4Var) {
        return ChannelsKt__DeprecatedKt.r(receiveChannel, c, ar4Var);
    }

    public static final <E, C extends Collection<? super E>> Object t(ReceiveChannel<? extends E> receiveChannel, C c, ar4<? super C> ar4Var) {
        return ChannelsKt__DeprecatedKt.s(receiveChannel, c, ar4Var);
    }

    public static final <E> Object u(ReceiveChannel<? extends E> receiveChannel, ar4<? super List<? extends E>> ar4Var) {
        return ChannelsKt__Channels_commonKt.d(receiveChannel, ar4Var);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object v(ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, M m, ar4<? super M> ar4Var) {
        return ChannelsKt__DeprecatedKt.t(receiveChannel, m, ar4Var);
    }
}
