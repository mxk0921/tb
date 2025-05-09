package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.h.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class q5y<T> implements e4y<T>, tzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cyx<? super T> f26531a;
    public tzx b;
    public boolean c;
    public nux<Object> d;
    public volatile boolean e;

    static {
        t2o.a(628097481);
        t2o.a(628097386);
        t2o.a(628097526);
    }

    public q5y(cyx<? super T> cyxVar) {
        this(cyxVar, false);
    }

    @Override // tb.tzx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public void b() {
        nux<Object> nuxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
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
        } while (!nuxVar.c((cyx<? super T>) this.f26531a));
    }

    @Override // tb.cyx
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
                        this.f26531a.onComplete();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.cyx
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
                        this.f26531a.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // tb.cyx
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (!this.e) {
            if (t == null) {
                this.b.a();
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
                        this.f26531a.onNext(t);
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.cyx
    public void onSubscribe(tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f24cb1", new Object[]{this, tzxVar});
        } else if (tao.reactivex.d.g.g.a(this.b, tzxVar)) {
            this.b = tzxVar;
            this.f26531a.onSubscribe(this);
        }
    }

    public q5y(cyx<? super T> cyxVar, boolean z) {
        this.f26531a = cyxVar;
    }

    @Override // tb.tzx
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b.a(j);
        }
    }
}
