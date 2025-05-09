package com.taobao.tao.log.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.qqt;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum MainAnrOptThreadPool {
    INSTANCE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int QUEUE_SIZE = 8192;
    private static final String TAG = "TLog.MainAnrOpt";
    private final ThreadPoolExecutor anrOptMainLogExecutor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(MainAnrOptThreadPool mainAnrOptThreadPool) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "tlog-main-thread-anr-opt";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends ThreadPoolExecutor.CallerRunsPolicy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f12495a = 0;

        static {
            t2o.a(767557736);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1083873583) {
                super.rejectedExecution((Runnable) objArr[0], (ThreadPoolExecutor) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/utils/MainAnrOptThreadPool$MainAnrOptHandler");
        }

        @Override // java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy, java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            super.rejectedExecution(runnable, threadPoolExecutor);
            if (this.f12495a >= Long.MAX_VALUE) {
                this.f12495a = 0L;
            }
            long j = this.f12495a;
            if (j % 100 == 1) {
                this.f12495a = j + 1;
                TLogEventHelper.c(v4s.DP2_TLOG_ERROR_EVENT, v4s.TLOG_ERROR_THREADPOOL_REJECTED, "totalTask=" + threadPoolExecutor.getTaskCount() + ", completedTask=" + threadPoolExecutor.getCompletedTaskCount() + ", queueSize=" + threadPoolExecutor.getQueue().size());
            }
        }
    }

    MainAnrOptThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(1, 1, 10L, TimeUnit.SECONDS, new ArrayBlockingQueue(8192), new a(this), new b());
        this.anrOptMainLogExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            INSTANCE.anrOptMainLogExecutor.execute(runnable);
        }
    }

    public static /* synthetic */ Object ipc$super(MainAnrOptThreadPool mainAnrOptThreadPool, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/utils/MainAnrOptThreadPool");
    }

    public static MainAnrOptThreadPool valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainAnrOptThreadPool) ipChange.ipc$dispatch("5c868c34", new Object[]{str});
        }
        return (MainAnrOptThreadPool) Enum.valueOf(MainAnrOptThreadPool.class, str);
    }
}
