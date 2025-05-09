package kotlinx.coroutines.internal;

import kotlin.coroutines.d;
import tb.ckf;
import tb.prt;
import tb.u1a;
import tb.u1r;
import tb.upt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ThreadContextKt {
    public static final u1r NO_THREAD_ELEMENTS = new u1r("NO_THREAD_ELEMENTS");

    /* renamed from: a  reason: collision with root package name */
    public static final u1a<Object, d.b, Object> f15383a = ThreadContextKt$countAll$1.INSTANCE;
    public static final u1a<upt<?>, d.b, upt<?>> b = ThreadContextKt$findOne$1.INSTANCE;
    public static final u1a<prt, d.b, prt> c = ThreadContextKt$updateState$1.INSTANCE;

    public static final void a(d dVar, Object obj) {
        if (obj != NO_THREAD_ELEMENTS) {
            if (obj instanceof prt) {
                ((prt) obj).b(dVar);
                return;
            }
            Object fold = dVar.fold(null, b);
            ckf.e(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((upt) fold).g(dVar, obj);
        }
    }

    public static final Object b(d dVar) {
        Object fold = dVar.fold(0, f15383a);
        ckf.d(fold);
        return fold;
    }

    public static final Object c(d dVar, Object obj) {
        if (obj == null) {
            obj = b(dVar);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return dVar.fold(new prt(dVar, ((Number) obj).intValue()), c);
        }
        return ((upt) obj).M0(dVar);
    }
}
