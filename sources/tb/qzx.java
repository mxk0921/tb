package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qzx<T> implements i6y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f27027a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object j = new Object();
    public int c;
    public long d;
    public final int e;
    public AtomicReferenceArray<Object> f;
    public final int g;
    public AtomicReferenceArray<Object> h;
    public final AtomicLong b = new AtomicLong();
    public final AtomicLong i = new AtomicLong();

    static {
        t2o.a(628097476);
        t2o.a(628097403);
    }

    public qzx(int i) {
        int a2 = t9y.a(Math.max(8, i));
        int i2 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        d(a2);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = a2 - 2;
        j(0L);
    }

    public static void e(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b0b3ed", new Object[]{atomicReferenceArray, new Integer(i), obj});
        } else {
            atomicReferenceArray.lazySet(i, obj);
        }
    }

    public static int i(long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c11c71a", new Object[]{new Long(j2), new Integer(i)})).intValue();
        }
        return m(((int) j2) & i);
    }

    public static <E> Object l(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7354f402", new Object[]{atomicReferenceArray, new Integer(i)});
        }
        return atomicReferenceArray.get(i);
    }

    public static int m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        return i;
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.b.get();
    }

    public final T b(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9dc66421", new Object[]{this, atomicReferenceArray, new Long(j2), new Integer(i)});
        }
        this.h = atomicReferenceArray;
        int i2 = i(j2, i);
        T t = (T) l(atomicReferenceArray, i2);
        if (t != null) {
            e(atomicReferenceArray, i2, null);
            n(j2 + 1);
        }
        return t;
    }

    public final AtomicReferenceArray<Object> c(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReferenceArray) ipChange.ipc$dispatch("e4a9212f", new Object[]{this, atomicReferenceArray, new Integer(i)});
        }
        int m = m(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) l(atomicReferenceArray, m);
        e(atomicReferenceArray, m, null);
        return atomicReferenceArray2;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = Math.min(i / 4, f27027a);
        }
    }

    public final void f(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i, T t, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ea4f97", new Object[]{this, atomicReferenceArray, new Long(j2), new Integer(i), t, new Long(j3)});
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j3 + j2) - 1;
        e(atomicReferenceArray2, i, t);
        g(atomicReferenceArray, atomicReferenceArray2);
        e(atomicReferenceArray, i, j);
        j(j2 + 1);
    }

    public final void g(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827712fc", new Object[]{this, atomicReferenceArray, atomicReferenceArray2});
        } else {
            e(atomicReferenceArray, m(atomicReferenceArray.length() - 1), atomicReferenceArray2);
        }
    }

    public final boolean h(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b30fcb91", new Object[]{this, atomicReferenceArray, t, new Long(j2), new Integer(i)})).booleanValue();
        }
        e(atomicReferenceArray, i, t);
        j(j2 + 1);
        return true;
    }

    public final void j(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j2)});
        } else {
            this.b.lazySet(j2);
        }
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        return this.i.get();
    }

    public final void n(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j2)});
        } else {
            this.i.lazySet(j2);
        }
    }

    public final long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        return this.b.get();
    }

    public final long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        return this.i.get();
    }

    @Override // tb.u7y
    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f;
            long o = o();
            int i = this.e;
            int i2 = i(o, i);
            if (o < this.d) {
                return h(atomicReferenceArray, t, o, i2);
            }
            long j2 = this.c + o;
            if (l(atomicReferenceArray, i(j2, i)) == null) {
                this.d = j2 - 1;
                return h(atomicReferenceArray, t, o, i2);
            } else if (l(atomicReferenceArray, i(1 + o, i)) == null) {
                return h(atomicReferenceArray, t, o, i2);
            } else {
                f(atomicReferenceArray, o, i2, t, i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    @Override // tb.u7y
    public T c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long p = p();
        int i = this.g;
        int i2 = i(p, i);
        T t = (T) l(atomicReferenceArray, i2);
        if (t == j) {
            z = true;
        }
        if (t != null && !z) {
            e(atomicReferenceArray, i2, null);
            n(p + 1);
            return t;
        } else if (z) {
            return b(c(atomicReferenceArray, 1 + i), p, i);
        } else {
            return null;
        }
    }

    @Override // tb.u7y
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a() == k();
    }

    @Override // tb.u7y
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        while (true) {
            if (c() == null && d()) {
                return;
            }
        }
    }
}
