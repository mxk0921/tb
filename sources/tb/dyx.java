package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.h.g;
import tb.nux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class dyx<T> extends uzx<T> implements nux.a<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final uzx<T> c;
    public boolean d;
    public nux<Object> e;
    public volatile boolean f;

    static {
        t2o.a(628097530);
        t2o.a(628097485);
    }

    public dyx(uzx<T> uzxVar) {
        this.c = uzxVar;
    }

    public static /* synthetic */ Object ipc$super(dyx dyxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/h/b");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            this.c.a(r9yVar);
        }
    }

    public void N() {
        nux<Object> nuxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this) {
                try {
                    nuxVar = this.e;
                    if (nuxVar == null) {
                        this.d = false;
                        return;
                    }
                    this.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            nuxVar.b(this);
        }
    }

    @Override // tb.r9y
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (!this.f) {
            synchronized (this) {
                try {
                    if (!this.f) {
                        this.f = true;
                        if (this.d) {
                            nux<Object> nuxVar = this.e;
                            if (nuxVar == null) {
                                nuxVar = new nux<>(4);
                                this.e = nuxVar;
                            }
                            nuxVar.a(g.a());
                            return;
                        }
                        this.d = true;
                        this.c.onComplete();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.r9y
    public void onError(Throwable th) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.f) {
            oux.a(th);
        } else {
            synchronized (this) {
                try {
                    if (!this.f) {
                        this.f = true;
                        if (this.d) {
                            nux<Object> nuxVar = this.e;
                            if (nuxVar == null) {
                                nuxVar = new nux<>(4);
                                this.e = nuxVar;
                            }
                            nuxVar.e(g.a(th));
                            return;
                        }
                        this.d = true;
                        z = false;
                    }
                    if (z) {
                        oux.a(th);
                    } else {
                        this.c.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // tb.r9y
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (!this.f) {
            synchronized (this) {
                try {
                    if (!this.f) {
                        if (this.d) {
                            nux<Object> nuxVar = this.e;
                            if (nuxVar == null) {
                                nuxVar = new nux<>(4);
                                this.e = nuxVar;
                            }
                            nuxVar.a(g.a(t));
                            return;
                        }
                        this.d = true;
                        this.c.onNext(t);
                        N();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.r9y
    public void onSubscribe(sxx sxxVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (!this.f) {
                        if (this.d) {
                            nux<Object> nuxVar = this.e;
                            if (nuxVar == null) {
                                nuxVar = new nux<>(4);
                                this.e = nuxVar;
                            }
                            nuxVar.a(g.a(sxxVar));
                            return;
                        }
                        this.d = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            sxxVar.b_();
            return;
        }
        this.c.onSubscribe(sxxVar);
        N();
    }

    @Override // tb.f4y
    public boolean test(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a0eabb9", new Object[]{this, obj})).booleanValue();
        }
        return g.a(obj, this.c);
    }
}
