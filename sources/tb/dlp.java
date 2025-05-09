package tb;

import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class dlp {
    public static final u1r NO_VALUE = new u1r("NO_VALUE");

    public static final /* synthetic */ Object a(Object[] objArr, long j) {
        return d(objArr, j);
    }

    public static final /* synthetic */ void b(Object[] objArr, long j, Object obj) {
        e(objArr, j, obj);
    }

    public static final <T> qp9<T> c(clp<? extends T> clpVar, d dVar, int i, BufferOverflow bufferOverflow) {
        if ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return clpVar;
        }
        return new qi3(clpVar, dVar, i, bufferOverflow);
    }

    public static final Object d(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    public static final void e(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
