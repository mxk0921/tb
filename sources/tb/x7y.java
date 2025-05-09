package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.a.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class x7y extends l5y<Object> implements m5y<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final l5y<Object> f31201a = new x7y();

    static {
        t2o.a(628097448);
        t2o.a(628097402);
    }

    public static /* synthetic */ Object ipc$super(x7y x7yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/g");
    }

    @Override // tb.l5y
    public void J(r9y<? super Object> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            b.a((r9y<?>) r9yVar);
        }
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        return null;
    }
}
