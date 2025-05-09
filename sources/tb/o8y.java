package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import tao.reactivex.d.a.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class o8y<T> extends l5y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Callable<? extends Throwable> c;

    static {
        t2o.a(628097449);
    }

    public o8y(Callable<? extends Throwable> callable) {
        this.c = callable;
    }

    public static /* synthetic */ Object ipc$super(o8y o8yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/h");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
            return;
        }
        try {
            th = (Throwable) wxx.b(this.c.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            uxx.a(th);
        }
        b.a(th, r9yVar);
    }
}
