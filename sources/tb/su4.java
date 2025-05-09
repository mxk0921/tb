package tb;

import kotlin.coroutines.d;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class su4 {
    public static final void a(d dVar, Throwable th) {
        for (pu4 pu4Var : ru4.a()) {
            try {
                pu4Var.A(dVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                ru4.b(tu4.b(th, th2));
            }
        }
        try {
            sm8.a(th, new DiagnosticCoroutineContextException(dVar));
        } catch (Throwable unused2) {
        }
        ru4.b(th);
    }
}
