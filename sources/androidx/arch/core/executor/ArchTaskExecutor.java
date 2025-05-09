package androidx.arch.core.executor;

import androidx.arch.core.executor.ArchTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ArchTaskExecutor extends TaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ArchTaskExecutor sInstance;
    private final TaskExecutor mDefaultTaskExecutor;
    private TaskExecutor mDelegate;
    private static final Executor sMainThreadExecutor = new Executor() { // from class: tb.eb1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.lambda$static$0(runnable);
        }
    };
    private static final Executor sIOThreadExecutor = new Executor() { // from class: tb.fb1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.lambda$static$1(runnable);
        }
    };

    private ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.mDefaultTaskExecutor = defaultTaskExecutor;
        this.mDelegate = defaultTaskExecutor;
    }

    public static Executor getIOThreadExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("5f47b626", new Object[0]);
        }
        return sIOThreadExecutor;
    }

    public static ArchTaskExecutor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArchTaskExecutor) ipChange.ipc$dispatch("7c8a03c6", new Object[0]);
        }
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (sInstance == null) {
                    sInstance = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sInstance;
    }

    public static Executor getMainThreadExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("5046b759", new Object[0]);
        }
        return sMainThreadExecutor;
    }

    public static /* synthetic */ Object ipc$super(ArchTaskExecutor archTaskExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/arch/core/executor/ArchTaskExecutor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d28783c", new Object[]{runnable});
        } else {
            getInstance().postToMainThread(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a158c53d", new Object[]{runnable});
        } else {
            getInstance().executeOnDiskIO(runnable);
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcea15c", new Object[]{this, runnable});
        } else {
            this.mDelegate.executeOnDiskIO(runnable);
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        return this.mDelegate.isMainThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92b6643", new Object[]{this, runnable});
        } else {
            this.mDelegate.postToMainThread(runnable);
        }
    }

    public void setDelegate(TaskExecutor taskExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72323806", new Object[]{this, taskExecutor});
            return;
        }
        if (taskExecutor == null) {
            taskExecutor = this.mDefaultTaskExecutor;
        }
        this.mDelegate = taskExecutor;
    }
}
