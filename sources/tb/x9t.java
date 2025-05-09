package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x9t implements RejectedExecutionHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public x9t(w9t w9tVar) {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
        } else {
            rbn.e("error_v_task_manager", "task dropped");
        }
    }
}
