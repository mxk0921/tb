package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;
import tb.xxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class b<T> extends AtomicInteger implements xxx<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097406);
        t2o.a(628097399);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/d/b");
    }

    @Override // tb.nzx
    public abstract /* synthetic */ int a(int i);

    @Override // tb.u7y
    public final boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // tb.sxx
    public abstract /* synthetic */ boolean b();

    @Override // tb.sxx
    public abstract /* synthetic */ void b_();

    @Override // tb.u7y
    public abstract /* synthetic */ Object c();

    @Override // tb.u7y
    public abstract /* synthetic */ boolean d();

    @Override // tb.u7y
    public abstract /* synthetic */ void e();
}
