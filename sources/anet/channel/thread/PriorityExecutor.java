package anet.channel.thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PriorityExecutor extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ComparableFutureTask<V> extends FutureTask<V> implements Comparable<ComparableFutureTask<V>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object object;

        static {
            t2o.a(607125918);
        }

        public ComparableFutureTask(Callable<V> callable) {
            super(callable);
            this.object = callable;
        }

        public static /* synthetic */ Object ipc$super(ComparableFutureTask comparableFutureTask, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/thread/PriorityExecutor$ComparableFutureTask");
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((ComparableFutureTask) ((ComparableFutureTask) obj));
        }

        public int compareTo(ComparableFutureTask<V> comparableFutureTask) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5bcb884", new Object[]{this, comparableFutureTask})).intValue();
            }
            if (this == comparableFutureTask) {
                return 0;
            }
            if (comparableFutureTask == null) {
                return -1;
            }
            Object obj = this.object;
            if (!(obj == null || comparableFutureTask.object == null || !obj.getClass().equals(comparableFutureTask.object.getClass()))) {
                Object obj2 = this.object;
                if (obj2 instanceof Comparable) {
                    return ((Comparable) obj2).compareTo(comparableFutureTask.object);
                }
            }
            return 0;
        }

        public ComparableFutureTask(Runnable runnable, V v) {
            super(runnable, v);
            this.object = runnable;
        }
    }

    static {
        t2o.a(607125917);
    }

    public PriorityExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    public static /* synthetic */ Object ipc$super(PriorityExecutor priorityExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/thread/PriorityExecutor");
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RunnableFuture) ipChange.ipc$dispatch("ee2f859e", new Object[]{this, runnable, t}) : new ComparableFutureTask(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RunnableFuture) ipChange.ipc$dispatch("8fd7099f", new Object[]{this, callable}) : new ComparableFutureTask(callable);
    }
}
