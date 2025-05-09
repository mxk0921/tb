package com.taobao.appbundle.scheduler.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tb.pr7;
import tb.qr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, pr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUTURE_INDEX = 1;
    public static final int PARENT_INDEX = 0;
    public static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;
    public static final Object PARENT_DISPOSED = new Object();
    public static final Object SYNC_DISPOSED = new Object();
    public static final Object ASYNC_DISPOSED = new Object();
    public static final Object DONE = new Object();

    static {
        t2o.a(377487431);
        t2o.a(377487426);
    }

    public ScheduledRunnable(Runnable runnable, qr7 qr7Var) {
        super(3);
        this.actual = runnable;
        lazySet(0, qr7Var);
    }

    public static /* synthetic */ Object ipc$super(ScheduledRunnable scheduledRunnable, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/scheduler/internal/ScheduledRunnable");
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

    @Override // tb.pr7
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        while (true) {
            Object obj5 = get(1);
            if (obj5 == DONE || obj5 == (obj3 = SYNC_DISPOSED) || obj5 == (obj4 = ASYNC_DISPOSED)) {
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
            if (obj == DONE || obj == (obj2 = PARENT_DISPOSED) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((qr7) obj).a(this);
    }

    public boolean isDisposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
        }
        Object obj = get(0);
        if (obj == PARENT_DISPOSED || obj == DONE) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
            Object obj3 = get(0);
            if (!(obj3 == PARENT_DISPOSED || !compareAndSet(0, obj3, DONE) || obj3 == null)) {
                ((qr7) obj3).a(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == SYNC_DISPOSED || obj2 == ASYNC_DISPOSED) {
                    break;
                }
            } while (!compareAndSet(1, obj2, DONE));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Object obj4 = get(0);
                if (!(obj4 == PARENT_DISPOSED || !compareAndSet(0, obj4, DONE) || obj4 == null)) {
                    ((qr7) obj4).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == SYNC_DISPOSED || obj == ASYNC_DISPOSED) {
                        break;
                    }
                } while (!compareAndSet(1, obj, DONE));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    public void setFuture(Future<?> future) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792d281a", new Object[]{this, future});
            return;
        }
        do {
            obj = get(1);
            if (obj != DONE) {
                if (obj == SYNC_DISPOSED) {
                    future.cancel(false);
                    return;
                } else if (obj == ASYNC_DISPOSED) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        Object obj = get(1);
        if (obj == DONE) {
            str = "Finished";
        } else if (obj == SYNC_DISPOSED) {
            str = "Disposed(Sync)";
        } else if (obj == ASYNC_DISPOSED) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return ScheduledRunnable.class.getSimpleName() + "[" + str + "]";
    }
}
