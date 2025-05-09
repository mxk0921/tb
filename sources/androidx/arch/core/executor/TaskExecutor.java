package androidx.arch.core.executor;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class TaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void executeOnDiskIO(Runnable runnable);

    public void executeOnMainThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e686e4fc", new Object[]{this, runnable});
        } else if (isMainThread()) {
            runnable.run();
        } else {
            postToMainThread(runnable);
        }
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(Runnable runnable);
}
