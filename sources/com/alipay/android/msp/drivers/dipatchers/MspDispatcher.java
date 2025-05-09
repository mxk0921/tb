package com.alipay.android.msp.drivers.dipatchers;

import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.ActionTypes;
import com.alipay.android.msp.drivers.dipatchers.RealCall;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f3567a;
    public final MspContext d;
    public final Deque<RealCall.AsyncCall> b = new ArrayDeque();
    public final Deque<RealCall.AsyncCall> c = new ArrayDeque();
    public boolean e = false;

    public MspDispatcher(MspContext mspContext) {
        this.d = mspContext;
    }

    public static /* synthetic */ MspContext access$000(MspDispatcher mspDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("f7fb8a87", new Object[]{mspDispatcher});
        }
        return mspDispatcher.d;
    }

    public final ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("ae607b3e", new Object[]{this});
        }
        if (this.f3567a == null) {
            synchronized (this) {
                try {
                    if (this.f3567a == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 16, 2L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.drivers.dipatchers.MspDispatcher.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                                }
                                Thread thread = new Thread(runnable, "MspDispatcherThread-" + System.currentTimeMillis());
                                thread.setDaemon(false);
                                return thread;
                            }
                        }, new RejectedExecutionHandler() { // from class: com.alipay.android.msp.drivers.dipatchers.MspDispatcher.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.concurrent.RejectedExecutionHandler
                            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor2});
                                    return;
                                }
                                LogUtil.record(8, "MspDispatcher:rejectedExecution", "coreSize=" + threadPoolExecutor2.getCorePoolSize() + " activeCnt=" + threadPoolExecutor2.getActiveCount() + " poolSize=" + threadPoolExecutor2.getPoolSize());
                                throw new RejectedExecutionException("MspDispatcher:Task " + runnable.toString() + " rejected from " + MspDispatcher.access$000(MspDispatcher.this));
                            }
                        });
                        this.f3567a = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f3567a;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        LogUtil.i("MspDispatcher", "promoteCalls", "runningAsyncCalls.size=" + ((ArrayDeque) this.c).size() + " readyAsyncCalls.size=" + ((ArrayDeque) this.b).size() + ", ctx=" + this.d);
        if (((ArrayDeque) this.c).size() <= 0 && !((ArrayDeque) this.b).isEmpty()) {
            try {
                Iterator it = ((ArrayDeque) this.b).iterator();
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    if (((ArrayDeque) this.c).size() <= 0) {
                        it.remove();
                        ((ArrayDeque) this.c).add(asyncCall);
                        a().execute(asyncCall);
                    }
                    if (((ArrayDeque) this.c).size() > 0) {
                        return;
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public synchronized void enqueue(RealCall.AsyncCall asyncCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726c7680", new Object[]{this, asyncCall});
            return;
        }
        LogUtil.i("MspDispatcher", "enqueue", asyncCall.getAction().hashCode() + " " + asyncCall.getAction().getType().toString() + " runningAsyncCalls: " + ((ArrayDeque) this.c).size());
        if (!(asyncCall.getAction().getType() == ActionTypes.NET_REQUEST || asyncCall.getAction().getType() == ActionTypes.NET_RESPONSE || asyncCall.getAction().getType() == ActionTypes.NET_RETRY)) {
            if (((ArrayDeque) this.c).size() <= 0) {
                ((ArrayDeque) this.c).add(asyncCall);
                a().execute(asyncCall);
                return;
            }
            ((ArrayDeque) this.b).add(asyncCall);
            return;
        }
        a().execute(asyncCall);
    }

    public void finished(RealCall.AsyncCall asyncCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd4666a", new Object[]{this, asyncCall});
            return;
        }
        Deque<RealCall.AsyncCall> deque = this.c;
        if (asyncCall.getAction().getType() != ActionTypes.NET_REQUEST && asyncCall.getAction().getType() != ActionTypes.NET_RESPONSE && asyncCall.getAction().getType() != ActionTypes.NET_RETRY) {
            synchronized (this) {
                try {
                    if (((ArrayDeque) deque).remove(asyncCall)) {
                        b();
                    } else {
                        throw new AssertionError("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean isHasShutDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92ba1531", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspDispatcher:onExit", "onExit, ctx=" + this.d);
        ThreadPoolExecutor threadPoolExecutor = this.f3567a;
        if (threadPoolExecutor != null) {
            this.e = true;
            threadPoolExecutor.shutdown();
        }
        try {
            MspContext mspContext = this.d;
            if (mspContext != null && mspContext.getStoreCenter() != null) {
                this.d.getStoreCenter().cleanJsPlugin();
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
