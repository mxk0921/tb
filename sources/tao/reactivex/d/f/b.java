package tao.reactivex.d.f;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tb.i6y;
import tb.t2o;
import tb.t9y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class b<E> extends AtomicReferenceArray<E> implements i6y<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public long c;
    public final int e;

    /* renamed from: a  reason: collision with root package name */
    public final int f15442a = length() - 1;
    public final AtomicLong b = new AtomicLong();
    public final AtomicLong d = new AtomicLong();

    static {
        t2o.a(628097475);
        t2o.a(628097403);
    }

    public b(int i) {
        super(t9y.a(i));
        this.e = Math.min(i / 4, f.intValue());
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/f/b");
    }

    public int a(long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c11c71a", new Object[]{this, new Long(j), new Integer(i)})).intValue() : ((int) j) & i;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.d.lazySet(j);
        }
    }

    public int c(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b488d", new Object[]{this, new Long(j)})).intValue() : this.f15442a & ((int) j);
    }

    @Override // tb.u7y
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.b.get() == this.d.get()) {
            return true;
        }
        return false;
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

    public E a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)}) : get(i);
    }

    @Override // tb.u7y
    public E c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        long j = this.d.get();
        int c = c(j);
        E a2 = a(c);
        if (a2 == null) {
            return null;
        }
        b(j + 1);
        a(c, (int) null);
        return a2;
    }

    public void a(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), e});
        } else {
            lazySet(i, e);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b.lazySet(j);
        }
    }

    @Override // tb.u7y
    public boolean a(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, e})).booleanValue();
        }
        if (e != null) {
            int i = this.f15442a;
            long j = this.b.get();
            int a2 = a(j, i);
            if (j >= this.c) {
                long j2 = this.e + j;
                if (a(a(j2, i)) == null) {
                    this.c = j2;
                } else if (a(a2) != null) {
                    return false;
                }
            }
            a(a2, (int) e);
            a(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
