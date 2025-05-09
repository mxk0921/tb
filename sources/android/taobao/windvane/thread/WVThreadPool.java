package android.taobao.windvane.thread;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;
import tb.usw;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVThreadPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 500;
    private static final int MAX_POOL_SIZE;
    private static String TAG = "WVThreadPool";
    private static WVThreadPool threadManager;
    private ExecutorService executor = null;
    public LinkedHashMap<String, Future> tasks = new LinkedHashMap<>(CORE_POOL_SIZE - 1);

    static {
        t2o.a(989856413);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
        MAX_POOL_SIZE = (availableProcessors * 2) + 1;
    }

    public static WVThreadPool getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVThreadPool) ipChange.ipc$dispatch("6b54d2dd", new Object[0]);
        }
        if (threadManager == null) {
            synchronized (WVThreadPool.class) {
                try {
                    if (threadManager == null) {
                        threadManager = new WVThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return threadManager;
    }

    private void refreshTaskMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7167cc3", new Object[]{this});
        } else if (this.tasks.size() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(((ThreadPoolExecutor) this.executor).getActiveCount());
            for (Map.Entry<String, Future> entry : this.tasks.entrySet()) {
                if (!entry.getValue().isDone()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.tasks.clear();
            this.tasks.putAll(linkedHashMap);
        }
    }

    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            execute(runnable, null);
        }
    }

    public ExecutorService getExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("992aaecb", new Object[]{this});
        }
        if (this.executor == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new usw(TAG));
            this.executor = threadPoolExecutor;
            try {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.executor;
    }

    public void setClientExecutor(Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95df9ef", new Object[]{this, executor});
        } else if (this.executor == null && executor != null && (executor instanceof ExecutorService)) {
            TAG += "tb";
            this.executor = (ExecutorService) executor;
        }
    }

    public void execute(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745a6d44", new Object[]{this, runnable, str});
            return;
        }
        if (this.executor == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new usw(TAG));
            this.executor = threadPoolExecutor;
            try {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (runnable == null) {
            v7t.n(TAG, "execute task is null.");
            return;
        }
        refreshTaskMap();
        if (TextUtils.isEmpty(str)) {
            this.executor.execute(runnable);
        } else if (this.tasks.size() == 0 || this.tasks.size() != CORE_POOL_SIZE - 1 || this.tasks.containsKey(str)) {
            Future put = this.tasks.put(str, this.executor.submit(runnable));
            if (put != null) {
                put.cancel(true);
            }
            String str2 = TAG;
            v7t.a(str2, "overlap the same name task:[" + str + "]");
        } else {
            String str3 = (String) this.tasks.keySet().toArray()[0];
            Future remove = this.tasks.remove(str3);
            if (remove != null) {
                remove.cancel(true);
            }
            this.tasks.put(str, this.executor.submit(runnable));
            String str4 = TAG;
            v7t.a(str4, "remove first task:[" + str3 + "]");
        }
        String str5 = TAG;
        v7t.a(str5, "activeTask count after:" + ((ThreadPoolExecutor) this.executor).getActiveCount());
    }
}
