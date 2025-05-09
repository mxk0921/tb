package com.alipay.mobile.common.transport.concurrent;

import android.content.Context;
import com.alipay.mobile.common.transport.concurrent.NetThreadPoolExeFactory;
import com.alipay.mobile.common.transport.http.HttpTask;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TaskExecutorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaskExecutorManager";
    public static final int TASK_TYPE_AMR = 3;
    public static final int TASK_TYPE_AMR_URGENT = 8;
    public static final int TASK_TYPE_BG_RPC = 1;
    public static final int TASK_TYPE_FG_MULTIMEDIA = 5;
    public static final int TASK_TYPE_FG_RPC = 0;
    public static final int TASK_TYPE_H5 = 6;
    public static final int TASK_TYPE_IMG = 2;
    public static final int TASK_TYPE_LOG = 7;
    public static final int TASK_TYPE_URGENT = 4;
    public static TaskExecutorManager m;

    /* renamed from: a  reason: collision with root package name */
    public ActThreadPoolExecutor f4053a = null;
    public ActThreadPoolExecutor b = null;
    public ActThreadPoolExecutor c = null;
    public ActThreadPoolExecutor d = null;
    public ActThreadPoolExecutor e = null;
    public ActThreadPoolExecutor f = null;
    public ActThreadPoolExecutor g = null;
    public ActThreadPoolExecutor h = null;
    public ActThreadPoolExecutor i = null;
    public FIFOPolicy j = null;
    public final Context k;
    public TaskDoneObserver l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class FIFOPolicy implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public FIFOPolicy() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
            } else if (!threadPoolExecutor.isShutdown()) {
                Runnable poll = threadPoolExecutor.getQueue().poll();
                if (poll instanceof ZFutureTask) {
                    ZFutureTask zFutureTask = (ZFutureTask) poll;
                    zFutureTask.fail(new Exception("Time out."));
                    LogCatUtil.debug(TaskExecutorManager.TAG, "FIFOPolicy give up, taskId: " + zFutureTask.getTaskId());
                }
                threadPoolExecutor.execute(runnable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class TaskDoneObserver implements Observer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public TaskDoneObserver() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            }
        }
    }

    public TaskExecutorManager() {
    }

    public static TaskExecutorManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskExecutorManager) ipChange.ipc$dispatch("162a0676", new Object[]{context});
        }
        TaskExecutorManager taskExecutorManager = m;
        if (taskExecutorManager != null) {
            return taskExecutorManager;
        }
        synchronized (TaskExecutorManager.class) {
            try {
                if (m == null) {
                    m = new TaskExecutorManager(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m;
    }

    public final ActThreadPoolExecutor a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("b32cce05", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 0:
                ActThreadPoolExecutor fgExecutor = getFgExecutor();
                fgExecutor.setTaskTypeName("TASK_TYPE_FG_RPC");
                fgExecutor.setTaskType(i);
                return fgExecutor;
            case 1:
                ActThreadPoolExecutor bgExecutor = getBgExecutor();
                bgExecutor.setTaskTypeName("TASK_TYPE_BG_RPC");
                bgExecutor.setTaskType(i);
                return bgExecutor;
            case 2:
                ActThreadPoolExecutor imgExecutor = getImgExecutor();
                imgExecutor.setTaskTypeName("TASK_TYPE_IMG");
                imgExecutor.setTaskType(i);
                return imgExecutor;
            case 3:
            default:
                ActThreadPoolExecutor amrExecutor = getAmrExecutor();
                amrExecutor.setTaskTypeName("TASK_TYPE_AMR");
                amrExecutor.setTaskType(i);
                return amrExecutor;
            case 4:
                ActThreadPoolExecutor urgentExecutor = getUrgentExecutor();
                urgentExecutor.setTaskTypeName("TASK_TYPE_URGENT");
                urgentExecutor.setTaskType(i);
                return urgentExecutor;
            case 5:
                ActThreadPoolExecutor fgMultimediaExecutor = getFgMultimediaExecutor();
                fgMultimediaExecutor.setTaskTypeName("TASK_TYPE_FG_MULTIMEDIA");
                fgMultimediaExecutor.setTaskType(i);
                return fgMultimediaExecutor;
            case 6:
                ActThreadPoolExecutor h5Executor = getH5Executor();
                h5Executor.setTaskTypeName("TASK_TYPE_H5");
                h5Executor.setTaskType(i);
                return h5Executor;
            case 7:
                ActThreadPoolExecutor logExecutor = getLogExecutor();
                logExecutor.setTaskTypeName("TASK_TYPE_LOG");
                logExecutor.setTaskType(i);
                return logExecutor;
            case 8:
                ActThreadPoolExecutor amrUrgentExecutor = getAmrUrgentExecutor();
                amrUrgentExecutor.setTaskTypeName("TASK_TYPE_AMR_URGENT");
                amrUrgentExecutor.setTaskType(i);
                return amrUrgentExecutor;
        }
    }

    public final ActThreadPoolExecutor b(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("e63e2523", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.f4053a;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.f4053a == null) {
                    this.f4053a = NetThreadPoolExeFactory.getBgThreadPool(context, rejectedExecutionHandler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f4053a;
    }

    public final FIFOPolicy c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FIFOPolicy) ipChange.ipc$dispatch("fc673eec", new Object[]{this});
        }
        FIFOPolicy fIFOPolicy = this.j;
        if (fIFOPolicy != null) {
            return fIFOPolicy;
        }
        FIFOPolicy fIFOPolicy2 = new FIFOPolicy();
        this.j = fIFOPolicy2;
        return fIFOPolicy2;
    }

    public synchronized void closeAllSingleThreadPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023ff5e", new Object[]{this});
            return;
        }
        closeThreadPool(this.f4053a);
        this.f4053a = null;
        closeThreadPool(this.b);
        this.b = null;
        closeThreadPool(this.c);
        this.c = null;
        closeThreadPool(this.d);
        this.d = null;
        closeThreadPool(this.f);
        this.f = null;
        closeThreadPool(this.h);
        this.h = null;
        closeThreadPool(this.i);
        this.i = null;
        closeThreadPool(this.e);
        this.e = null;
    }

    public void closeThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceaef66b", new Object[]{this, threadPoolExecutor});
        } else if (threadPoolExecutor != null) {
            try {
                threadPoolExecutor.shutdown();
            } catch (Exception e) {
                LogCatUtil.warn(TAG, "closeThreadPool exception : " + e.toString());
            }
        }
    }

    public final String d(ActThreadPoolExecutor actThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b0f68e", new Object[]{this, actThreadPoolExecutor});
        }
        try {
            return String.format(getClass().getSimpleName() + "#" + hashCode() + ": TaskTypeName = %s, Active Task = %d, Completed Task = %d, All Task = %d, Queue Size = %d", actThreadPoolExecutor.getTaskTypeName(), Integer.valueOf(actThreadPoolExecutor.getActiveCount()), Long.valueOf(actThreadPoolExecutor.getCompletedTaskCount()), Long.valueOf(actThreadPoolExecutor.getTaskCount()), Integer.valueOf(actThreadPoolExecutor.getQueue().size()));
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "dumpPerf log exception : " + e.toString());
            return "";
        }
    }

    public final void e(ZFutureTask zFutureTask, ActThreadPoolExecutor actThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e899eaff", new Object[]{this, zFutureTask, actThreadPoolExecutor});
            return;
        }
        String d = d(actThreadPoolExecutor);
        LogCatUtil.info(TAG, d + "  TaskId: " + zFutureTask.getTaskId());
    }

    public FutureTask execute(ZFutureTask zFutureTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("951b6d18", new Object[]{this, zFutureTask});
        }
        ActThreadPoolExecutor a2 = a(zFutureTask.getTaskType());
        if (zFutureTask instanceof HttpTask) {
            ((HttpTask) zFutureTask).setCurrentThreadPoolExecutor(a2);
        }
        e(zFutureTask, a2);
        zFutureTask.addDoneObserver(g());
        try {
            a2.execute(zFutureTask);
            return zFutureTask;
        } catch (Exception e) {
            LogCatUtil.error(TAG, "execute ex:" + a2.toString(), e);
            throw new RuntimeException(e);
        }
    }

    public final ActThreadPoolExecutor f(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("1ec6f324", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.i;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.i == null) {
                    ActThreadPoolExecutor bgThreadPool = NetThreadPoolExeFactory.getBgThreadPool(context, rejectedExecutionHandler);
                    this.i = bgThreadPool;
                    bgThreadPool.setThreadFactory(new NetThreadPoolExeFactory.NetThreadFactory("log"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.i;
    }

    public final TaskDoneObserver g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskDoneObserver) ipChange.ipc$dispatch("5004d0cc", new Object[]{this});
        }
        if (this.l == null) {
            this.l = new TaskDoneObserver();
        }
        return this.l;
    }

    public ActThreadPoolExecutor getAmrExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("562e3574", new Object[]{this});
        }
        return l(this.k, c());
    }

    public ActThreadPoolExecutor getAmrUrgentExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("11465ed5", new Object[]{this});
        }
        return m(this.k, c());
    }

    public ActThreadPoolExecutor getBgExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("6ad7971f", new Object[]{this});
        }
        return b(this.k, c());
    }

    public ActThreadPoolExecutor getFgExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("259d3f9b", new Object[]{this});
        }
        return h(this.k, c());
    }

    public ActThreadPoolExecutor getFgMultimediaExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("4ffecb46", new Object[]{this});
        }
        return j(this.k, c());
    }

    public ActThreadPoolExecutor getH5Executor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("ab4d47a7", new Object[]{this});
        }
        return i(this.k, c());
    }

    public ActThreadPoolExecutor getImgExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("ecd65171", new Object[]{this});
        }
        return k(this.k, c());
    }

    public ActThreadPoolExecutor getLogExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("40acb2f2", new Object[]{this});
        }
        return f(this.k, c());
    }

    public ActThreadPoolExecutor getUrgentExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("42341b1b", new Object[]{this});
        }
        return n(this.k, c());
    }

    public final ActThreadPoolExecutor h(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("574fc125", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.b;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = NetThreadPoolExeFactory.getFgThreadPool(context, rejectedExecutionHandler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.b;
    }

    public final ActThreadPoolExecutor i(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("8fd88f26", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.h;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.h == null) {
                    ActThreadPoolExecutor h5ThreadPool = NetThreadPoolExeFactory.getH5ThreadPool(context, rejectedExecutionHandler);
                    this.h = h5ThreadPool;
                    h5ThreadPool.setThreadFactory(new NetThreadPoolExeFactory.NetThreadFactory("h5"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.h;
    }

    public final ActThreadPoolExecutor j(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("c8615d27", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.g;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = NetThreadPoolExeFactory.getFgMultimediaThreadPool(context, rejectedExecutionHandler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.g;
    }

    public final ActThreadPoolExecutor k(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("ea2b28", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.c;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = NetThreadPoolExeFactory.getImgThreadPool(context, rejectedExecutionHandler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.c;
    }

    public final ActThreadPoolExecutor l(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("3972f929", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.d;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = NetThreadPoolExeFactory.getAmrThreadPool(context, rejectedExecutionHandler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.d;
    }

    public final ActThreadPoolExecutor m(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("71fbc72a", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.e;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = NetThreadPoolExeFactory.getAmrUrgentThreadPool(context, rejectedExecutionHandler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.e;
    }

    public final ActThreadPoolExecutor n(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("aa84952b", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.f;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = NetThreadPoolExeFactory.getUrgentThreadPool(context, rejectedExecutionHandler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f;
    }

    public TaskExecutorManager(Context context) {
        this.k = context;
    }
}
