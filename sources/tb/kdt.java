package tb;

import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kdt<TResult> extends bdt<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f22599a = new Object();
    public final pdt<TResult> b = new pdt<>();
    public boolean c;
    public TResult d;
    public Exception e;

    static {
        t2o.a(677380277);
    }

    public static /* synthetic */ Object ipc$super(kdt kdtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/tasks/TaskDetail");
    }

    @Override // tb.bdt
    public final bdt<TResult> a(ypk<TResult> ypkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("7b586d77", new Object[]{this, ypkVar});
        }
        return h(iet.MAIN_THREAD, ypkVar);
    }

    @Override // tb.bdt
    public final bdt<TResult> b(rqk rqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("ba93da61", new Object[]{this, rqkVar});
        }
        return i(iet.MAIN_THREAD, rqkVar);
    }

    @Override // tb.bdt
    public final bdt<TResult> c(gvk<TResult> gvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("8e80c041", new Object[]{this, gvkVar});
        }
        return j(iet.MAIN_THREAD, gvkVar);
    }

    @Override // tb.bdt
    public final Exception d() {
        Exception exc;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Exception) ipChange.ipc$dispatch("9ad20156", new Object[]{this});
        }
        synchronized (this.f22599a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // tb.bdt
    public final TResult e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TResult) ipChange.ipc$dispatch("5be12058", new Object[]{this});
        }
        synchronized (this.f22599a) {
            try {
                n();
                if (this.e != null) {
                    return null;
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.bdt
    public final boolean f() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba1c638e", new Object[]{this})).booleanValue();
        }
        synchronized (this.f22599a) {
            z = this.c;
        }
        return z;
    }

    @Override // tb.bdt
    public final boolean g() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        synchronized (this.f22599a) {
            try {
                if (this.c && this.e == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final bdt<TResult> h(Executor executor, ypk<TResult> ypkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("7261ca49", new Object[]{this, executor, ypkVar});
        }
        this.b.a(new aa4(executor, ypkVar));
        m();
        return this;
    }

    public final bdt<TResult> i(Executor executor, rqk rqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("8bd1ae0d", new Object[]{this, executor, rqkVar});
        }
        this.b.a(new ky8(executor, rqkVar));
        m();
        return this;
    }

    public final bdt<TResult> j(Executor executor, gvk<TResult> gvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("1e1cc75b", new Object[]{this, executor, gvkVar});
        }
        this.b.a(new nwq(executor, gvkVar));
        m();
        return this;
    }

    public final boolean k(TResult tresult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1f08ec9", new Object[]{this, tresult})).booleanValue();
        }
        synchronized (this.f22599a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = tresult;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d91b4dc1", new Object[]{this, exc})).booleanValue();
        }
        ObjectInvoker.notNull(exc, "Exception must not be null");
        synchronized (this.f22599a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67e1532", new Object[]{this});
            return;
        }
        synchronized (this.f22599a) {
            try {
                if (this.c) {
                    this.b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f717e02", new Object[]{this});
        } else {
            ObjectInvoker.notFalse(this.c, "Task is not yet complete");
        }
    }
}
