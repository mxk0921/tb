package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.ConcurrencyHelpers;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConcurrencyHelpers {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Handler28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Handler28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            Handler createAsync;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("24f80428", new Object[]{looper});
            }
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    private ConcurrencyHelpers() {
    }

    public static Executor convertHandlerToExecutor(final Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("af680f22", new Object[]{handler});
        }
        Objects.requireNonNull(handler);
        return new Executor() { // from class: tb.oe4
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public static ThreadPoolExecutor createBackgroundPriorityExecutor(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c74956b2", new Object[]{str});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: tb.pe4
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$createBackgroundPriorityExecutor$0;
                lambda$createBackgroundPriorityExecutor$0 = ConcurrencyHelpers.lambda$createBackgroundPriorityExecutor$0(str, runnable);
                return lambda$createBackgroundPriorityExecutor$0;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$createBackgroundPriorityExecutor$0(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("e22ce48e", new Object[]{str, runnable});
        }
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    public static Handler mainHandlerAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("893a40d4", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler28Impl.createAsync(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }

    public static Executor mainThreadExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("1efa52e3", new Object[0]);
        }
        return convertHandlerToExecutor(mainHandlerAsync());
    }
}
