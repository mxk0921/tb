package tb;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class sc0<E> extends ni3<E> implements ReceiveChannel {
    @Override // kotlinx.coroutines.JobSupport
    public void Y0(Throwable th) {
        c<E> w1 = w1();
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = qm8.a(ov6.a(this).concat(" was cancelled"), th);
            }
        }
        w1.a(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean w0(Throwable th) {
        tu4.a(getContext(), th);
        return true;
    }
}
