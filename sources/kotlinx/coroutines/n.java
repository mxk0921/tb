package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import tb.juf;
import tb.quf;
import tb.rr7;
import tb.t94;
import tb.wr7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class n {
    public static final t94 a(m mVar) {
        return new juf(mVar);
    }

    public static /* synthetic */ t94 b(m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mVar = null;
        }
        return quf.a(mVar);
    }

    public static final void c(d dVar, CancellationException cancellationException) {
        m mVar = (m) dVar.get(m.Key);
        if (mVar != null) {
            mVar.a(cancellationException);
        }
    }

    public static /* synthetic */ void d(d dVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        quf.c(dVar, cancellationException);
    }

    public static final rr7 e(m mVar, rr7 rr7Var) {
        return mVar.D0(new wr7(rr7Var));
    }

    public static final void f(d dVar) {
        m mVar = (m) dVar.get(m.Key);
        if (mVar != null) {
            quf.g(mVar);
        }
    }

    public static final void g(m mVar) {
        if (!mVar.isActive()) {
            throw mVar.u0();
        }
    }

    public static final m h(d dVar) {
        m mVar = (m) dVar.get(m.Key);
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dVar).toString());
    }
}
