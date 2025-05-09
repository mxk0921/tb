package tb;

import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class tu4 {
    public static final void a(d dVar, Throwable th) {
        try {
            pu4 pu4Var = (pu4) dVar.get(pu4.Key);
            if (pu4Var != null) {
                pu4Var.A(dVar, th);
            } else {
                su4.a(dVar, th);
            }
        } catch (Throwable th2) {
            su4.a(dVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        sm8.a(runtimeException, th);
        return runtimeException;
    }
}
