package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ExecutorCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HandlerExecutor implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Handler mHandler;

        public HandlerExecutor(Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else if (!this.mHandler.post((Runnable) Preconditions.checkNotNull(runnable))) {
                throw new RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    private ExecutorCompat() {
    }

    public static Executor create(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("b3025af9", new Object[]{handler});
        }
        return new HandlerExecutor(handler);
    }
}
