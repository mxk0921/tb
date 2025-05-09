package tb;

import com.loc.at;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.internal.ThreadContextKt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ltb/ogv;", "T", "Ltb/wuo;", "Lkotlin/coroutines/d;", "context", "Ltb/ar4;", "uCont", "<init>", "(Lkotlin/coroutines/d;Ltb/ar4;)V", "", "oldValue", "Ltb/xhv;", "x1", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "", "w1", "()Z", "state", "r1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", at.f, "Ljava/lang/ThreadLocal;", "threadStateToRecover", "h", "Z", "threadLocalIsSet", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ogv<T> extends wuo<T> {
    private final ThreadLocal<Pair<d, Object>> g;
    private volatile boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ogv(kotlin.coroutines.d r3, tb.ar4<? super T> r4) {
        /*
            r2 = this;
            tb.qgv r0 = tb.qgv.INSTANCE
            kotlin.coroutines.d$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.d r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.g = r0
            kotlin.coroutines.d r4 = r4.getContext()
            kotlin.coroutines.c$b r0 = kotlin.coroutines.c.Key
            kotlin.coroutines.d$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.c(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r4)
            r2.x1(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ogv.<init>(kotlin.coroutines.d, tb.ar4):void");
    }

    @Override // tb.wuo, kotlinx.coroutines.a
    public void r1(Object obj) {
        if (this.h) {
            Pair<d, Object> pair = this.g.get();
            if (pair != null) {
                ThreadContextKt.a(pair.component1(), pair.component2());
            }
            this.g.remove();
        }
        Object a2 = ia4.a(obj, this.f);
        ar4<T> ar4Var = this.f;
        d context = ar4Var.getContext();
        ogv<?> ogvVar = null;
        Object c = ThreadContextKt.c(context, null);
        if (c != ThreadContextKt.NO_THREAD_ELEMENTS) {
            ogvVar = CoroutineContextKt.g(ar4Var, context, c);
        }
        try {
            this.f.resumeWith(a2);
            xhv xhvVar = xhv.INSTANCE;
        } finally {
            if (ogvVar == null || ogvVar.w1()) {
                ThreadContextKt.a(context, c);
            }
        }
    }

    public final boolean w1() {
        boolean z;
        if (!this.h || this.g.get() != null) {
            z = false;
        } else {
            z = true;
        }
        this.g.remove();
        return !z;
    }

    public final void x1(d dVar, Object obj) {
        this.h = true;
        this.g.set(jpu.a(dVar, obj));
    }
}
