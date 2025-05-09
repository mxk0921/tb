package tb;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.i;

/* compiled from: Taobao */
@Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface hl2<E> extends i<E> {
    void a(CancellationException cancellationException);

    ReceiveChannel<E> c();
}
