package kotlinx.coroutines.internal;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.PropertyReference0Impl;
import tb.ckf;
import tb.h30;
import tb.ov6;
import tb.rxk;
import tb.sch;
import tb.tg1;
import tb.vzn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class LockFreeLinkedListNode {
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "a");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "c");
    @Volatile

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f15382a = this;
    @Volatile
    public volatile Object b = this;
    @Volatile
    public volatile Object c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class a extends tg1<LockFreeLinkedListNode> {
        public final LockFreeLinkedListNode c;
        public LockFreeLinkedListNode d;

        public a(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.c = lockFreeLinkedListNode;
        }

        /* renamed from: e */
        public void b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode3 = this.c;
            if (z) {
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            } else {
                lockFreeLinkedListNode2 = this.d;
            }
            if (lockFreeLinkedListNode2 != null && h30.a(LockFreeLinkedListNode.d, lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z) {
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.d;
                ckf.d(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.g(lockFreeLinkedListNode4);
            }
        }
    }

    public final boolean c(LockFreeLinkedListNode lockFreeLinkedListNode) {
        e.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, this);
        while (h() == this) {
            if (h30.a(atomicReferenceFieldUpdater, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.g(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (tb.h30.a(r5, r4, r3, ((tb.vzn) r6).f30370a) != false) goto L_0x0043;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode e(tb.rxk r10) {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.e
            java.lang.Object r1 = r0.get(r9)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            r3 = r1
        L_0x000a:
            r4 = r2
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeLinkedListNode.d
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            return r3
        L_0x0016:
            boolean r0 = tb.h30.a(r0, r9, r1, r3)
            if (r0 != 0) goto L_0x001d
            goto L_0x0000
        L_0x001d:
            return r3
        L_0x001e:
            boolean r7 = r9.k()
            if (r7 == 0) goto L_0x0025
            return r2
        L_0x0025:
            if (r6 != r10) goto L_0x0028
            return r3
        L_0x0028:
            boolean r7 = r6 instanceof tb.rxk
            if (r7 == 0) goto L_0x0032
            tb.rxk r6 = (tb.rxk) r6
            r6.a(r3)
            goto L_0x0000
        L_0x0032:
            boolean r7 = r6 instanceof tb.vzn
            if (r7 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x0045
            tb.vzn r6 = (tb.vzn) r6
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r6.f30370a
            boolean r3 = tb.h30.a(r5, r4, r3, r6)
            if (r3 != 0) goto L_0x0043
            goto L_0x0000
        L_0x0043:
            r3 = r4
            goto L_0x000a
        L_0x0045:
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            goto L_0x000b
        L_0x004c:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            tb.ckf.e(r6, r4)
            r4 = r6
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.e(tb.rxk):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    public final LockFreeLinkedListNode f(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.k()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) e.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    public final void g(LockFreeLinkedListNode lockFreeLinkedListNode) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        do {
            atomicReferenceFieldUpdater = e;
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (h() != lockFreeLinkedListNode) {
                return;
            }
        } while (!h30.a(atomicReferenceFieldUpdater, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (k()) {
            lockFreeLinkedListNode.e(null);
        }
    }

    public final Object h() {
        while (true) {
            Object obj = d.get(this);
            if (!(obj instanceof rxk)) {
                return obj;
            }
            ((rxk) obj).a(this);
        }
    }

    public final LockFreeLinkedListNode i() {
        return sch.a(h());
    }

    public final LockFreeLinkedListNode j() {
        LockFreeLinkedListNode e2 = e(null);
        if (e2 == null) {
            return f((LockFreeLinkedListNode) e.get(this));
        }
        return e2;
    }

    public boolean k() {
        return h() instanceof vzn;
    }

    public boolean l() {
        if (m() == null) {
            return true;
        }
        return false;
    }

    public final LockFreeLinkedListNode m() {
        Object h;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            h = h();
            if (h instanceof vzn) {
                return ((vzn) h).f30370a;
            }
            if (h == this) {
                return (LockFreeLinkedListNode) h;
            }
            ckf.e(h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) h;
        } while (!h30.a(d, this, h, lockFreeLinkedListNode.n()));
        lockFreeLinkedListNode.e(null);
        return null;
    }

    public final vzn n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        vzn vznVar = (vzn) atomicReferenceFieldUpdater.get(this);
        if (vznVar != null) {
            return vznVar;
        }
        vzn vznVar2 = new vzn(this);
        atomicReferenceFieldUpdater.lazySet(this, vznVar2);
        return vznVar2;
    }

    public final int o(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, a aVar) {
        e.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        aVar.d = lockFreeLinkedListNode2;
        if (!h30.a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, aVar)) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return ov6.a(this.receiver);
            }
        } + '@' + ov6.b(this);
    }
}
