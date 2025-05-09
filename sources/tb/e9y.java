package tb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class e9y<TResult> extends tct<TResult> {
    public boolean b;
    public volatile boolean c;
    public TResult d;
    public Exception e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f18396a = new Object();
    public List<ym8<TResult>> f = new ArrayList();

    @Override // tb.tct
    public final tct<TResult> a(xpk<TResult> xpkVar) {
        m(jet.b(), xpkVar);
        return this;
    }

    @Override // tb.tct
    public final tct<TResult> b(qqk qqkVar) {
        n(jet.b(), qqkVar);
        return this;
    }

    @Override // tb.tct
    public final tct<TResult> c(fvk<TResult> fvkVar) {
        o(jet.b(), fvkVar);
        return this;
    }

    @Override // tb.tct
    public final Exception d() {
        Exception exc;
        synchronized (this.f18396a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // tb.tct
    public final TResult e() {
        TResult tresult;
        synchronized (this.f18396a) {
            try {
                if (this.e == null) {
                    tresult = this.d;
                } else {
                    throw new RuntimeException(this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // tb.tct
    public final boolean f() {
        return this.c;
    }

    @Override // tb.tct
    public final boolean g() {
        boolean z;
        synchronized (this.f18396a) {
            z = this.b;
        }
        return z;
    }

    @Override // tb.tct
    public final boolean h() {
        boolean z;
        synchronized (this.f18396a) {
            try {
                if (!this.b || f() || this.e != null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final tct<TResult> i(ym8<TResult> ym8Var) {
        boolean g;
        synchronized (this.f18396a) {
            try {
                g = g();
                if (!g) {
                    this.f.add(ym8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g) {
            ym8Var.onComplete(this);
        }
        return this;
    }

    public final void j(Exception exc) {
        synchronized (this.f18396a) {
            try {
                if (!this.b) {
                    this.b = true;
                    this.e = exc;
                    this.f18396a.notifyAll();
                    p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(TResult tresult) {
        synchronized (this.f18396a) {
            try {
                if (!this.b) {
                    this.b = true;
                    this.d = tresult;
                    this.f18396a.notifyAll();
                    p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        synchronized (this.f18396a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.c = true;
                this.f18396a.notifyAll();
                p();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final tct<TResult> m(Executor executor, xpk<TResult> xpkVar) {
        i(new n3y(executor, xpkVar));
        return this;
    }

    public final tct<TResult> n(Executor executor, qqk qqkVar) {
        i(new a6y(executor, qqkVar));
        return this;
    }

    public final tct<TResult> o(Executor executor, fvk<TResult> fvkVar) {
        i(new k8y(executor, fvkVar));
        return this;
    }

    public final void p() {
        synchronized (this.f18396a) {
            for (ym8<TResult> ym8Var : this.f) {
                try {
                    ym8Var.onComplete(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }
}
