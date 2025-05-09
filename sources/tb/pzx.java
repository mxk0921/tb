package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class pzx<T> extends jzx<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final l5y<T> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a<T> implements tzx, r9y<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cyx<? super T> f26417a;
        public sxx b;

        static {
            t2o.a(628097421);
            t2o.a(628097526);
            t2o.a(628097533);
        }

        public a(cyx<? super T> cyxVar) {
            this.f26417a = cyxVar;
        }

        @Override // tb.tzx
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b.b_();
            }
        }

        @Override // tb.r9y
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                this.f26417a.onComplete();
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                this.f26417a.onError(th);
            }
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else {
                this.f26417a.onNext(t);
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
                return;
            }
            this.b = sxxVar;
            this.f26417a.onSubscribe(this);
        }

        @Override // tb.tzx
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            }
        }
    }

    static {
        t2o.a(628097420);
    }

    public pzx(l5y<T> l5yVar) {
        this.b = l5yVar;
    }

    public static /* synthetic */ Object ipc$super(pzx pzxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/c");
    }

    @Override // tb.jzx
    public void l(cyx<? super T> cyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dee43b", new Object[]{this, cyxVar});
        } else {
            this.b.a(new a(cyxVar));
        }
    }
}
