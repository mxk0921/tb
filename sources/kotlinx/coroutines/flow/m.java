package kotlinx.coroutines.flow;

import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import tb.ajq;
import tb.dlp;
import tb.dv6;
import tb.hfj;
import tb.iak;
import tb.qp9;
import tb.u1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final u1r f15378a = new u1r("NONE");
    public static final u1r b = new u1r("PENDING");

    public static final <T> hfj<T> a(T t) {
        if (t == null) {
            t = (T) iak.NULL;
        }
        return new StateFlowImpl(t);
    }

    public static final <T> qp9<T> b(ajq<? extends T> ajqVar, d dVar, int i, BufferOverflow bufferOverflow) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) {
            return dlp.c(ajqVar, dVar, i, bufferOverflow);
        }
        return ajqVar;
    }
}
