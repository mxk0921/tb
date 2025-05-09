package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rdq extends bet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rdq b = new rdq();

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f27301a;

    static {
        t2o.a(676331603);
    }

    public rdq() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), sdq.INSTANCE);
        this.f27301a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static rdq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rdq) ipChange.ipc$dispatch("44099687", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Object ipc$super(rdq rdqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/executor/SplitTaskExecutor");
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcea15c", new Object[]{this, runnable});
        } else {
            this.f27301a.execute(runnable);
        }
    }
}
