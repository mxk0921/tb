package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.g4y;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class c<T> extends AtomicInteger implements g4y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097479);
        t2o.a(628097401);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/g/c");
    }

    public abstract /* synthetic */ int a(int i);

    public abstract /* synthetic */ void a();

    public abstract /* synthetic */ void a(long j);

    @Override // tb.u7y
    public final boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ Object c();

    public abstract /* synthetic */ boolean d();

    public abstract /* synthetic */ void e();
}
