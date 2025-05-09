package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlinx.coroutines.internal.ThreadContextKt;
import tb.ar4;
import tb.dkf;
import tb.gbp;
import tb.j6k;
import tb.jv6;
import tb.kqu;
import tb.qi3;
import tb.qp9;
import tb.sp9;
import tb.u1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a {
    public static final <T> ChannelFlow<T> b(qp9<? extends T> qp9Var) {
        ChannelFlow<T> channelFlow;
        if (qp9Var instanceof ChannelFlow) {
            channelFlow = (ChannelFlow) qp9Var;
        } else {
            channelFlow = null;
        }
        if (channelFlow == null) {
            return new qi3(qp9Var, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    /* JADX WARN: Finally extract failed */
    public static final <T, V> Object c(d dVar, V v, Object obj, u1a<? super V, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        Object c = ThreadContextKt.c(dVar, obj);
        try {
            d dVar2 = new d(ar4Var, dVar);
            kqu.e(u1aVar, 2);
            Object invoke = u1aVar.invoke(v, dVar2);
            ThreadContextKt.a(dVar, c);
            if (invoke == dkf.d()) {
                jv6.c(ar4Var);
            }
            return invoke;
        } catch (Throwable th) {
            ThreadContextKt.a(dVar, c);
            throw th;
        }
    }

    public static /* synthetic */ Object d(d dVar, Object obj, Object obj2, u1a u1aVar, ar4 ar4Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.b(dVar);
        }
        return c(dVar, obj, obj2, u1aVar, ar4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> sp9<T> e(sp9<? super T> sp9Var, d dVar) {
        boolean z;
        if (sp9Var instanceof gbp) {
            z = true;
        } else {
            z = sp9Var instanceof j6k;
        }
        if (z) {
            return sp9Var;
        }
        return new UndispatchedContextCollector(sp9Var, dVar);
    }
}
