package com.taobao.message.lab.comfrm.inner;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.i1d;
import tb.qqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Schedules {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGIC_THREAD_NAME = "MessageS-logic";
    private static boolean isDebug = ApplicationUtil.isDebug();
    private static ScheduledExecutorService lowBackgroundThreadPool;
    private static ScheduledExecutorService sIo;
    private static ScheduledExecutorService sLogic;
    private static volatile Handler sMainThreadHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class HighThreadNameFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String name;

        static {
            t2o.a(537919567);
        }

        public HighThreadNameFactory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner.Schedules.HighThreadNameFactory.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    i1d.a();
                    runnable.run();
                }
            }, this.name);
            thread.setPriority(10);
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class MyRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Runnable runnable;

        static {
            t2o.a(537919569);
        }

        public MyRunnable(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (Schedules.access$000()) {
                SystemClock.uptimeMillis();
            }
            try {
                this.runnable.run();
            } catch (Throwable th) {
                Logger.e("Schedules", th);
                th.printStackTrace();
                String value = ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "catchExceptionList", "");
                if (!TextUtils.isEmpty(value)) {
                    try {
                        list = JSON.parseArray(value, String.class);
                    } catch (Exception e) {
                        Logger.e("Schedules", Log.getStackTraceString(e));
                        list = null;
                    }
                    String stackTraceString = Log.getStackTraceString(th);
                    if (list != null) {
                        for (String str : list) {
                            if (stackTraceString.contains(str)) {
                                return;
                            }
                        }
                    }
                }
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    defaultUncaughtExceptionHandler.uncaughtException(VExecutors.currentThread(), th);
                }
            }
            if (Schedules.access$000()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                Logger.e("Schedules", this.runnable.getClass().getName() + VExecutors.currentThread().getName() + "|" + uptimeMillis);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class MyThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String name;

        static {
            t2o.a(537919570);
        }

        public MyThreadFactory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.name);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class MyThreadNameFactory implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String name;

        static {
            t2o.a(537919571);
            t2o.a(972029960);
        }

        public MyThreadNameFactory(String str) {
            this.name = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.name;
        }
    }

    static {
        t2o.a(537919566);
        staticInit();
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return isDebug;
    }

    public static ScheduledExecutorService getIO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("b9a70a67", new Object[0]);
        }
        return sIo;
    }

    public static ScheduledExecutorService getLogic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("4c350213", new Object[0]);
        }
        return sLogic;
    }

    public static ScheduledExecutorService getLowBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("bc8f4b57", new Object[0]);
        }
        return lowBackgroundThreadPool;
    }

    public static void io(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5860ab", new Object[]{runnable});
        } else {
            sIo.execute(runnable);
        }
    }

    public static void logic(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6091ae3", new Object[]{runnable});
        } else {
            sLogic.execute(new MyRunnable(runnable));
        }
    }

    public static void logicTryKeep(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f8ee27", new Object[]{runnable});
        } else if (TextUtils.equals(VExecutors.currentThread().getName(), LOGIC_THREAD_NAME)) {
            new MyRunnable(runnable).run();
        } else {
            sLogic.execute(new MyRunnable(runnable));
        }
    }

    public static void lowBackground(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1a5b27", new Object[]{runnable});
        } else {
            lowBackgroundThreadPool.execute(new MyRunnable(runnable));
        }
    }

    @IgnoreVirtualThread
    private static void staticInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884fc625", new Object[0]);
            return;
        }
        ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new MyThreadNameFactory(LOGIC_THREAD_NAME));
        sLogic = newScheduledThreadPool;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(anet.channel.Constants.RECV_TIMEOUT, timeUnit);
        ((ThreadPoolExecutor) sLogic).allowCoreThreadTimeOut(true);
        ScheduledExecutorService newScheduledThreadPool2 = VExecutors.newScheduledThreadPool(8, new MyThreadNameFactory("MessageS-io"));
        sIo = newScheduledThreadPool2;
        ((ThreadPoolExecutor) newScheduledThreadPool2).setKeepAliveTime(3000L, timeUnit);
        ((ThreadPoolExecutor) sIo).allowCoreThreadTimeOut(true);
        ScheduledExecutorService newScheduledThreadPool3 = VExecutors.newScheduledThreadPool(1, new MyThreadNameFactory("MessageS-low"));
        lowBackgroundThreadPool = newScheduledThreadPool3;
        ((ThreadPoolExecutor) newScheduledThreadPool3).setKeepAliveTime(3000L, timeUnit);
        ((ThreadPoolExecutor) lowBackgroundThreadPool).allowCoreThreadTimeOut(true);
    }

    public static void ui(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd667819", new Object[]{runnable});
            return;
        }
        try {
            if (VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
                return;
            }
            if (sMainThreadHandler == null) {
                synchronized (Schedules.class) {
                    try {
                        if (sMainThreadHandler == null) {
                            sMainThreadHandler = new Handler(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            sMainThreadHandler.post(runnable);
        } catch (Exception unused) {
            runnable.run();
        }
    }

    public static void uiPost(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eedad9", new Object[]{runnable});
            return;
        }
        if (sMainThreadHandler == null) {
            synchronized (Schedules.class) {
                try {
                    if (sMainThreadHandler == null) {
                        sMainThreadHandler = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sMainThreadHandler.post(runnable);
    }
}
