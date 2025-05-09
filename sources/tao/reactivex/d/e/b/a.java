package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.e.b.q;
import tb.l5y;
import tb.m5y;
import tb.r9y;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a<T> extends l5y<T> implements m5y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final T c;

    static {
        t2o.a(628097460);
        t2o.a(628097402);
    }

    public a(T t) {
        this.c = t;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/n");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
            return;
        }
        q.a aVar = new q.a(r9yVar, this.c);
        r9yVar.onSubscribe(aVar);
        aVar.run();
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        return this.c;
    }
}
