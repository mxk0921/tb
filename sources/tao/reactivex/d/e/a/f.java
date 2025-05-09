package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tao.reactivex.d.f.b;
import tao.reactivex.d.g.c;
import tao.reactivex.d.g.g;
import tb.cyx;
import tb.e4y;
import tb.fux;
import tb.gux;
import tb.i6y;
import tb.jux;
import tb.jzx;
import tb.k4y;
import tb.qzx;
import tb.t2o;
import tb.tzx;
import tb.uxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class f<T> extends jux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int d;
    public final boolean e;
    public final fux f;
    public final boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends c<T> implements e4y<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cyx<? super T> f15428a;
        public final i6y<T> b;
        public final boolean c;
        public final fux d;
        public tzx e;
        public volatile boolean f;
        public volatile boolean g;
        public Throwable h;
        public final AtomicLong i = new AtomicLong();
        public boolean j;

        static {
            t2o.a(628097428);
            t2o.a(628097386);
        }

        public a(cyx<? super T> cyxVar, int i, boolean z, boolean z2, fux fuxVar) {
            i6y<T> i6yVar;
            this.f15428a = cyxVar;
            this.d = fuxVar;
            this.c = z2;
            if (z) {
                i6yVar = new qzx<>(i);
            } else {
                i6yVar = new b<>(i);
            }
            this.b = i6yVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/f$a");
        }

        @Override // tao.reactivex.d.g.c, tb.nzx
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if ((i & 2) == 0) {
                return 0;
            }
            this.j = true;
            return 2;
        }

        public void b() {
            int i;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (getAndIncrement() == 0) {
                i6y<T> i6yVar = this.b;
                cyx<? super T> cyxVar = this.f15428a;
                int i2 = 1;
                while (!a(this.g, i6yVar.d(), cyxVar)) {
                    long j = this.i.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z2 = this.g;
                        Object obj = (T) i6yVar.c();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!a(z2, z, cyxVar)) {
                            if (z) {
                                break;
                            }
                            cyxVar.onNext(obj);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !a(this.g, i6yVar.d(), cyxVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.i.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // tao.reactivex.d.g.c, tb.u7y
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            return this.b.c();
        }

        @Override // tao.reactivex.d.g.c, tb.u7y
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            return this.b.d();
        }

        @Override // tao.reactivex.d.g.c, tb.u7y
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.b.e();
            }
        }

        @Override // tb.cyx
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.g = true;
            if (this.j) {
                this.f15428a.onComplete();
            } else {
                b();
            }
        }

        @Override // tb.cyx
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            this.h = th;
            this.g = true;
            if (this.j) {
                this.f15428a.onError(th);
            } else {
                b();
            }
        }

        @Override // tb.cyx
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.b.a(t)) {
                this.e.a();
                tao.reactivex.b.c cVar = new tao.reactivex.b.c("Buffer is full");
                try {
                    ((gux.a) this.d).a();
                } catch (Throwable th) {
                    uxx.a(th);
                    cVar.initCause(th);
                }
                onError(cVar);
            } else if (this.j) {
                this.f15428a.onNext(null);
            } else {
                b();
            }
        }

        @Override // tb.cyx
        public void onSubscribe(tzx tzxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f24cb1", new Object[]{this, tzxVar});
            } else if (g.a(this.e, tzxVar)) {
                this.e = tzxVar;
                this.f15428a.onSubscribe(this);
                tzxVar.a(Long.MAX_VALUE);
            }
        }

        @Override // tao.reactivex.d.g.c, tb.tzx
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!this.f) {
                this.f = true;
                this.e.a();
                if (getAndIncrement() == 0) {
                    this.b.e();
                }
            }
        }

        @Override // tao.reactivex.d.g.c, tb.tzx
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else if (!this.j && g.b(j)) {
                k4y.b(this.i, j);
                b();
            }
        }

        public boolean a(boolean z, boolean z2, cyx<? super T> cyxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("592fa4e0", new Object[]{this, new Boolean(z), new Boolean(z2), cyxVar})).booleanValue();
            }
            if (this.f) {
                this.b.e();
                return true;
            }
            if (z) {
                if (!this.c) {
                    Throwable th = this.h;
                    if (th != null) {
                        this.b.e();
                        cyxVar.onError(th);
                        return true;
                    } else if (z2) {
                        cyxVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.h;
                    if (th2 != null) {
                        cyxVar.onError(th2);
                    } else {
                        cyxVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    static {
        t2o.a(628097427);
    }

    public f(jzx<T> jzxVar, int i, boolean z, boolean z2, fux fuxVar) {
        super(jzxVar);
        this.d = i;
        this.e = z;
        this.g = z2;
        this.f = fuxVar;
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/f");
    }

    @Override // tb.jzx
    public void l(cyx<? super T> cyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dee43b", new Object[]{this, cyxVar});
        } else {
            this.b.j(new a(cyxVar, this.d, this.e, this.g, this.f));
        }
    }
}
