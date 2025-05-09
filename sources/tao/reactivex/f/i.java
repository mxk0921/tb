package tao.reactivex.f;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tb.kzx;
import tb.sxx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class i extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, sxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f15454a;

    static {
        t2o.a(628097517);
        t2o.a(628097368);
    }

    public i(Runnable runnable, kzx kzxVar) {
        super(3);
        this.f15454a = runnable;
        lazySet(0, kzxVar);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/i");
    }

    public void a(Future<?> future) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            return;
        }
        do {
            obj = get(1);
            if (obj != e) {
                if (obj == c) {
                    future.cancel(false);
                    return;
                } else if (obj == d) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Object obj = get(0);
        if (obj == b || obj == e) {
            return true;
        }
        return false;
    }

    @Override // tb.sxx
    public void b_() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            return;
        }
        while (true) {
            Object obj5 = get(1);
            if (obj5 == e || obj5 == (obj3 = c) || obj5 == (obj4 = d)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == e || obj == (obj2 = b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((kzx) obj).c(this);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean compareAndSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        lazySet(2, Thread.currentThread());
        try {
            this.f15454a.run();
        } finally {
            try {
                lazySet(2, null);
                obj = get(0);
                if (obj == b) {
                    ((kzx) obj).c(this);
                }
                do {
                    obj2 = get(1);
                    if (obj2 == c) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj2, e));
            } catch (Throwable th) {
                do {
                    if (obj3 != obj4) {
                        if (obj3 == obj5) {
                            break;
                        }
                    } else {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj = get(0);
        if (!(obj == b || !compareAndSet(0, obj, e) || obj == null)) {
            ((kzx) obj).c(this);
        }
        do {
            obj2 = get(1);
            if (obj2 == c || obj2 == d) {
                return;
            }
        } while (!compareAndSet(1, obj2, e));
    }
}
