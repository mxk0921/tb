package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class wpo implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809884);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            TLog.loge("home", "GlobalTrace", "process runnable error", th);
        }
    }
}
