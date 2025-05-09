package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i35 extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f21066a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        boolean v(j35 j35Var);
    }

    public i35(int i, int i2, a aVar, ThreadFactory threadFactory) {
        super(i, i2, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactory);
        allowCoreThreadTimeOut(true);
        this.f21066a = aVar;
    }

    public static /* synthetic */ Object ipc$super(i35 i35Var, String str, Object... objArr) {
        if (str.hashCode() == 1173060588) {
            super.beforeExecute((Thread) objArr[0], (Runnable) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/DAGExecutor");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
            return;
        }
        if (this.f21066a != null) {
            j35 j35Var = new j35();
            j35Var.b = getMaximumPoolSize();
            j35Var.c = thread.getPriority();
            j35Var.f21733a = getCorePoolSize();
            if (this.f21066a.v(j35Var)) {
                setCorePoolSize(j35Var.f21733a);
                setMaximumPoolSize(j35Var.b);
                Process.setThreadPriority(j35Var.c);
            }
        }
        super.beforeExecute(thread, runnable);
    }
}
