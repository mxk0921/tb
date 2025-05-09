package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class usl<V> extends FutureTask<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Callable<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Callable
        public V call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            throw new IllegalStateException("this should never be called");
        }
    }

    static {
        t2o.a(744489045);
    }

    public usl() {
        super(new a());
    }

    public static /* synthetic */ Object ipc$super(usl uslVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/utils/PassFuture");
    }

    public void b(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8046e82", new Object[]{this, v});
        } else {
            set(v);
        }
    }
}
