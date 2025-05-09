package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RequestExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DefaultThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mPriority;
        private String mThreadName;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class ProcessPriorityThread extends Thread {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final int mPriority;

            public ProcessPriorityThread(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.mPriority = i;
            }

            public static /* synthetic */ Object ipc$super(ProcessPriorityThread processPriorityThread, String str, Object... objArr) {
                if (str.hashCode() == 1548812690) {
                    super.run();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/provider/RequestExecutor$DefaultThreadFactory$ProcessPriorityThread");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Process.setThreadPriority(this.mPriority);
                super.run();
            }
        }

        public DefaultThreadFactory(String str, int i) {
            this.mThreadName = str;
            this.mPriority = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new ProcessPriorityThread(runnable, this.mThreadName, this.mPriority);
        }
    }

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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ReplyRunnable<T> implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Callable<T> mCallable;
        private Consumer<T> mConsumer;
        private Handler mHandler;

        public ReplyRunnable(Handler handler, Callable<T> callable, Consumer<T> consumer) {
            this.mCallable = callable;
            this.mConsumer = consumer;
            this.mHandler = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            final T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                t = this.mCallable.call();
            } catch (Exception unused) {
                t = null;
            }
            final Consumer<T> consumer = this.mConsumer;
            this.mHandler.post(new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        consumer.accept(t);
                    }
                }
            });
        }
    }

    private RequestExecutor() {
    }

    public static ThreadPoolExecutor createDefaultExecutor(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("a1fcaa29", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor createHandlerExecutor(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("a5f5de", new Object[]{handler});
        }
        return new HandlerExecutor(handler);
    }

    public static <T> void execute(Executor executor, Callable<T> callable, Consumer<T> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72405051", new Object[]{executor, callable, consumer});
        } else {
            executor.execute(new ReplyRunnable(CalleeHandler.create(), callable, consumer));
        }
    }

    public static <T> T submit(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9411ba7c", new Object[]{executorService, callable, new Integer(i)});
        }
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
