package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.a.a;
import tao.reactivex.d.h.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class eay<T> implements sxx, r9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r9y<? super T> f18432a;
    public sxx b;
    public boolean c;
    public nux<Object> d;
    public volatile boolean e;

    static {
        t2o.a(628097415);
        t2o.a(628097368);
        t2o.a(628097533);
    }

    public eay(r9y<? super T> r9yVar) {
        this(r9yVar, false);
    }

    public void a() {
        nux<Object> nuxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        do {
            synchronized (this) {
                try {
                    nuxVar = this.d;
                    if (nuxVar == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!nuxVar.d((r9y<? super T>) this.f18432a));
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return this.b.b();
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            this.b.b_();
        }
    }

    @Override // tb.r9y
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        if (this.c) {
                            nux<Object> nuxVar = this.d;
                            if (nuxVar == null) {
                                nuxVar = new nux<>(4);
                                this.d = nuxVar;
                            }
                            nuxVar.a(g.a());
                            return;
                        }
                        this.e = true;
                        this.c = true;
                        this.f18432a.onComplete();
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
        } else if (this.e) {
            oux.a(th);
        } else {
            synchronized (this) {
                try {
                    if (!this.e) {
                        if (this.c) {
                            this.e = true;
                            nux<Object> nuxVar = this.d;
                            if (nuxVar == null) {
                                nuxVar = new nux<>(4);
                                this.d = nuxVar;
                            }
                            nuxVar.e(g.a(th));
                            return;
                        }
                        this.e = true;
                        this.c = true;
                        z = false;
                    }
                    if (z) {
                        oux.a(th);
                    } else {
                        this.f18432a.onError(th);
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
        } else if (!this.e) {
            if (t == null) {
                this.b.b_();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                try {
                    if (!this.e) {
                        if (this.c) {
                            nux<Object> nuxVar = this.d;
                            if (nuxVar == null) {
                                nuxVar = new nux<>(4);
                                this.d = nuxVar;
                            }
                            nuxVar.a(g.a(t));
                            return;
                        }
                        this.c = true;
                        this.f18432a.onNext(t);
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.r9y
    public void onSubscribe(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
        } else if (a.a(this.b, sxxVar)) {
            this.b = sxxVar;
            this.f18432a.onSubscribe(this);
        }
    }

    public eay(r9y<? super T> r9yVar, boolean z) {
        this.f18432a = r9yVar;
    }
}
