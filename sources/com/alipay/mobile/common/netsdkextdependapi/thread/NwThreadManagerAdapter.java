package com.alipay.mobile.common.netsdkextdependapi.thread;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NwThreadManagerAdapter implements NwThreadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f4027a;

    @Override // com.alipay.mobile.common.netsdkextdependapi.thread.NwThreadManager
    public boolean addIdleTask(final Runnable runnable, final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fce1515e", new Object[]{this, runnable, str, new Integer(i)})).booleanValue();
        }
        getThreadPoolExecutor().execute(new Runnable() { // from class: com.alipay.mobile.common.netsdkextdependapi.thread.NwThreadManagerAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Thread.currentThread().setName(str);
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Level level = Level.FINEST;
                    if (InnerMiscUtil.isLoggable(level)) {
                        InnerMiscUtil.log(level, "[addIdleTask] Exception = " + th.toString());
                    }
                }
            }
        });
        return false;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.thread.NwThreadManager
    public void executeNormalTask(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c072e6", new Object[]{this, runnable});
        } else {
            getThreadPoolExecutor().execute(new Runnable() { // from class: com.alipay.mobile.common.netsdkextdependapi.thread.NwThreadManagerAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        Level level = Level.FINEST;
                        if (InnerMiscUtil.isLoggable(level)) {
                            InnerMiscUtil.log(level, "[addIdleTask] Exception = " + th.toString());
                        }
                    }
                }
            });
        }
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("1b689816", new Object[]{this});
        }
        ThreadPoolExecutor threadPoolExecutor = this.f4027a;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        synchronized (this) {
            try {
                ThreadPoolExecutor threadPoolExecutor2 = this.f4027a;
                if (threadPoolExecutor2 != null) {
                    return threadPoolExecutor2;
                }
                ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                this.f4027a = threadPoolExecutor3;
                threadPoolExecutor3.allowCoreThreadTimeOut(true);
                return this.f4027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
