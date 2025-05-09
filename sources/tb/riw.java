package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class riw implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(969932816);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        return newVirtualThread(runnable);
    }

    public abstract VirtualThread newVirtualThread(Runnable runnable);
}
