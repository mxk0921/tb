package anetwork.channel.entity;

import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import tb.pg1;
import tb.qqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RepeatProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ExecutorService[] threadPool = null;
    private static AtomicInteger id = new AtomicInteger(0);

    static {
        t2o.a(607126047);
    }

    public static /* synthetic */ AtomicInteger access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return id;
    }

    public static void submitTask(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b404bd", new Object[]{new Integer(i), runnable});
        } else {
            threadPool[Math.abs(i % getThreadPoolSize())].submit(runnable);
        }
    }

    public static synchronized int getThreadPoolSize() {
        synchronized (RepeatProcessor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36dea157", new Object[0])).intValue();
            }
            ExecutorService[] executorServiceArr = threadPool;
            if (executorServiceArr != null) {
                return executorServiceArr.length;
            }
            int waitThreadCount = AwcnConfig.getWaitThreadCount();
            threadPool = new ExecutorService[waitThreadCount];
            if (AwcnConfig.isUseVirtualThread()) {
                for (int i = 0; i < waitThreadCount; i++) {
                    threadPool[i] = VExecutors.newSingleThreadExecutor(new qqt() { // from class: anetwork.channel.entity.RepeatProcessor.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.qqt
                        public String newThreadName() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                            }
                            return String.format("RepeaterThread:%d", Integer.valueOf(RepeatProcessor.access$000().getAndIncrement()));
                        }
                    });
                }
            } else {
                for (int i2 = 0; i2 < waitThreadCount; i2++) {
                    threadPool[i2] = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: anetwork.channel.entity.RepeatProcessor.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                            }
                            return new Thread(runnable, String.format("RepeaterThread:%d", Integer.valueOf(RepeatProcessor.access$000().getAndIncrement())));
                        }
                    });
                }
            }
            ALog.e("awcn.RepeatProcessor", "getThreadPoolSize!!", null, pg1.ATOM_length, Integer.valueOf(threadPool.length), "isUseVirtualThread", Boolean.valueOf(AwcnConfig.isUseVirtualThread()));
            return threadPool.length;
        }
    }
}
