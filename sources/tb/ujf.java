package tb;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ujf {
    public static final <T> T b(d dVar, d1a<? extends T> d1aVar) {
        try {
            qrt qrtVar = new qrt(quf.h(dVar));
            qrtVar.d();
            T t = (T) d1aVar.invoke();
            qrtVar.a();
            return t;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
