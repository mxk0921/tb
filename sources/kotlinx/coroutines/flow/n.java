package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.c;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.dv6;
import tb.h30;
import tb.jv6;
import tb.m30;
import tb.n30;
import tb.u1r;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class n extends n30<StateFlowImpl<?>> {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "a");
    @Volatile

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f15379a;

    /* renamed from: d */
    public boolean a(StateFlowImpl<?> stateFlowImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, m.f15378a);
        return true;
    }

    public final Object e(ar4<? super xhv> ar4Var) {
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (!h30.a(b, this, m.f15378a, cVar)) {
            cVar.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
        }
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (A == dkf.d()) {
            return A;
        }
        return xhv.INSTANCE;
    }

    /* renamed from: f */
    public ar4<xhv>[] b(StateFlowImpl<?> stateFlowImpl) {
        b.set(this, null);
        return m30.EMPTY_RESUMES;
    }

    public final void g() {
        u1r u1rVar;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != (u1rVar = m.b)) {
                u1r u1rVar2 = m.f15378a;
                if (obj == u1rVar2) {
                    if (h30.a(atomicReferenceFieldUpdater, this, obj, u1rVar)) {
                        return;
                    }
                } else if (h30.a(atomicReferenceFieldUpdater, this, obj, u1rVar2)) {
                    ((c) obj).resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = b.getAndSet(this, m.f15378a);
        ckf.d(andSet);
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (andSet == m.b) {
            return true;
        }
        return false;
    }
}
