package com.taobao.login4android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ThreadHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ThreadHelper sInstance;
    private final ScheduledThreadPoolExecutor mScheduledThreadPoolExecutor;

    static {
        t2o.a(516948014);
    }

    private ThreadHelper() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.taobao.login4android.utils.ThreadHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "LoginThread");
            }
        });
        this.mScheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static ThreadHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadHelper) ipChange.ipc$dispatch("5fe044af", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (ThreadHelper.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ThreadHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void executeDelayedInBg(long j, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417cae4", new Object[]{this, new Long(j), runnable});
        } else {
            this.mScheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }
}
