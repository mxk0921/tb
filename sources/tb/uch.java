package tb;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class uch<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;

    /* renamed from: a  reason: collision with root package name */
    public final int f29292a;
    public final boolean b;
    public final int c;
    @Volatile
    public volatile Object d;
    @Volatile
    public volatile long e;
    public final AtomicReferenceArray f;
    public static final a Companion = new a(null);
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(uch.class, Object.class, "d");
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(uch.class, "e");
    public static final u1r REMOVE_FROZEN = new u1r("REMOVE_FROZEN");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a(long j) {
            if ((j & 2305843009213693952L) != 0) {
                return 2;
            }
            return 1;
        }

        public final long b(long j, int i) {
            return d(j, uch.HEAD_MASK) | i;
        }

        public final long c(long j, int i) {
            return d(j, uch.TAIL_MASK) | (i << 30);
        }

        public final long d(long j, long j2) {
            return j & (~j2);
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29293a;

        public b(int i) {
            this.f29293a = i;
        }
    }

    public uch(int i, boolean z) {
        this.f29292a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.f = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r13) {
        /*
            r12 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = tb.uch.h
            long r2 = r6.get(r12)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r7 = 0
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0016
            tb.uch$a r13 = tb.uch.Companion
            int r13 = r13.a(r2)
            return r13
        L_0x0016:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r0 = 30
            long r4 = r4 >> r0
            int r9 = (int) r4
            int r0 = r9 + 2
            int r10 = r12.c
            r0 = r0 & r10
            r4 = r1 & r10
            r5 = 1
            if (r0 != r4) goto L_0x0030
            return r5
        L_0x0030:
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r12.f
            boolean r0 = r12.b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L_0x004f
            r0 = r9 & r10
            java.lang.Object r0 = r11.get(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r12.f29292a
            if (r2 < r0) goto L_0x004e
            int r9 = r9 - r1
            r0 = r9 & r4
            int r1 = r2 >> 1
            if (r0 <= r1) goto L_0x0000
        L_0x004e:
            return r5
        L_0x004f:
            int r0 = r9 + 1
            r0 = r0 & r4
            tb.uch$a r1 = tb.uch.Companion
            long r4 = r1.c(r2, r0)
            r0 = r6
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r0 = r9 & r10
            r11.set(r0, r13)
            r0 = r12
        L_0x0066:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x007b
            tb.uch r0 = r0.i()
            tb.uch r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x0066
        L_0x007b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uch.a(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uch<E> b(long j) {
        uch<E> uchVar = new uch<>(this.f29292a * 2, this.b);
        int i = (int) (HEAD_MASK & j);
        int i2 = (int) ((TAIL_MASK & j) >> 30);
        while (true) {
            int i3 = this.c;
            int i4 = i & i3;
            if (i4 != (i3 & i2)) {
                Object obj = this.f.get(i4);
                if (obj == null) {
                    obj = new b(i);
                }
                uchVar.f.set(uchVar.c & i, obj);
                i++;
            } else {
                h.set(uchVar, Companion.d(j, 1152921504606846976L));
                return uchVar;
            }
        }
    }

    public final uch<E> c(long j) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            uch<E> uchVar = (uch) atomicReferenceFieldUpdater.get(this);
            if (uchVar != null) {
                return uchVar;
            }
            h30.a(atomicReferenceFieldUpdater, this, null, b(j));
        }
    }

    public final boolean d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = h;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final uch<E> e(int i, E e) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i2 = this.c;
        Object obj = atomicReferenceArray.get(i & i2);
        if (!(obj instanceof b) || ((b) obj).f29293a != i) {
            return null;
        }
        atomicReferenceArray.set(i & i2, e);
        return this;
    }

    public final int f() {
        long j = h.get(this);
        return 1073741823 & (((int) ((j & TAIL_MASK) >> 30)) - ((int) (HEAD_MASK & j)));
    }

    public final boolean g() {
        long j = h.get(this);
        if (((int) (HEAD_MASK & j)) == ((int) ((j & TAIL_MASK) >> 30))) {
            return true;
        }
        return false;
    }

    public final long h() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        long j2;
        do {
            atomicLongFieldUpdater = h;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    public final uch<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return REMOVE_FROZEN;
            }
            int i = (int) (HEAD_MASK & j);
            int i2 = (int) ((TAIL_MASK & j) >> 30);
            int i3 = this.c;
            int i4 = i & i3;
            if ((i2 & i3) == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = this.b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i5 = (i + 1) & MAX_CAPACITY_MASK;
                if (atomicLongFieldUpdater.compareAndSet(this, j, Companion.b(j, i5))) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                } else if (z) {
                    uch<E> uchVar = this;
                    do {
                        uchVar = uchVar.k(i, i5);
                    } while (uchVar != null);
                    return obj;
                }
            }
        }
    }

    public final uch<E> k(int i, int i2) {
        long j;
        int i3;
        do {
            j = h.get(this);
            i3 = (int) (HEAD_MASK & j);
            String str = dv6.DEBUG_PROPERTY_NAME;
            if ((1152921504606846976L & j) != 0) {
                return i();
            }
        } while (!h.compareAndSet(this, j, Companion.b(j, i2)));
        this.f.set(i3 & this.c, null);
        return null;
    }
}
