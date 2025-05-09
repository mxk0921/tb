package com.alipay.tianyan.mobilesdk.coco;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OreoServiceUnlimitedTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE = "Push";
    public static final String SEED_ID = "UnlimitedService";
    public static final String TAG = "OreoServiceUnlimitedTracker";
    public static final int TRACK_STATUS_AFTER_CALL = 1;
    public static final int TRACK_STATUS_BEFORE_CALL = 0;
    public static OreoServiceUnlimitedTracker e;

    /* renamed from: a  reason: collision with root package name */
    public Executor f4552a;
    public List<Pair<String, Long>> c;
    public volatile boolean b = false;
    public final long d = TimeUnit.MINUTES.toMillis(1);

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class TranceRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4553a;
        private int b;
        private long c;

        public TranceRunnable(String str, int i, long j) {
            this.f4553a = str;
            this.b = i;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OreoServiceUnlimitedTracker.access$000(OreoServiceUnlimitedTracker.this, this.f4553a, this.b, this.c);
            }
        }
    }

    public static /* synthetic */ void access$000(OreoServiceUnlimitedTracker oreoServiceUnlimitedTracker, String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80af6c94", new Object[]{oreoServiceUnlimitedTracker, str, new Integer(i), new Long(j)});
        } else if (oreoServiceUnlimitedTracker.c != null) {
            try {
                if (i == 0) {
                    Pair<String, Long> a2 = oreoServiceUnlimitedTracker.a(str);
                    if (a2 != null) {
                        ((ArrayList) oreoServiceUnlimitedTracker.c).remove(a2);
                    }
                    ((ArrayList) oreoServiceUnlimitedTracker.c).add(new Pair(str, Long.valueOf(j)));
                } else if (i == 1) {
                    oreoServiceUnlimitedTracker.c(str, j);
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error(TAG, th);
            }
        }
    }

    public static OreoServiceUnlimitedTracker b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OreoServiceUnlimitedTracker) ipChange.ipc$dispatch("8ff6a3d8", new Object[0]);
        }
        if (e == null) {
            synchronized (OreoServiceUnlimitedTracker.class) {
                try {
                    if (e == null) {
                        e = new OreoServiceUnlimitedTracker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static void startTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164f0210", new Object[0]);
            return;
        }
        OreoServiceUnlimitedTracker b = b();
        if (!b.b) {
            synchronized (b) {
                try {
                    if (!b.b) {
                        b.f4552a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.tianyan.mobilesdk.coco.OreoServiceUnlimitedTracker.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                                }
                                Thread thread = new Thread(Thread.currentThread().getThreadGroup(), runnable, "oreo-unlimited-logger", 0L);
                                if (thread.isDaemon()) {
                                    thread.setDaemon(false);
                                }
                                if (thread.getPriority() != 1) {
                                    thread.setPriority(1);
                                }
                                return thread;
                            }
                        });
                        b.c = new ArrayList(30);
                        b.b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void trackAfterCall(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1416dea0", new Object[]{str});
            return;
        }
        OreoServiceUnlimitedTracker b = b();
        if (b.b && !TextUtils.isEmpty(str)) {
            ((ThreadPoolExecutor) b.f4552a).execute(new TranceRunnable(str, 1, SystemClock.uptimeMillis()));
        }
    }

    public static void trackBeforeCall(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2eeeb9", new Object[]{str});
            return;
        }
        OreoServiceUnlimitedTracker b = b();
        if (b.b && !TextUtils.isEmpty(str)) {
            ((ThreadPoolExecutor) b.f4552a).execute(new TranceRunnable(str, 0, SystemClock.uptimeMillis()));
        }
    }

    public final Pair<String, Long> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str});
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            Pair<String, Long> pair = (Pair) it.next();
            if (str.equals(pair.first)) {
                return pair;
            }
        }
        return null;
    }

    public final void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        Pair<String, Long> a2 = a(str);
        if (a2 != null) {
            ((ArrayList) this.c).remove(a2);
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (Math.abs(j - ((Long) pair.second).longValue()) > this.d) {
                    it.remove();
                    String str2 = (String) pair.first;
                    String valueOf = String.valueOf(j - ((Long) pair.second).longValue());
                    Behavor behavor = new Behavor();
                    behavor.setBehaviourPro(BIZ_TYPE);
                    behavor.setSeedID(SEED_ID);
                    behavor.setParam1(str2);
                    behavor.setParam2(valueOf);
                    behavor.setLoggerLevel(3);
                    LoggerFactory.getBehavorLogger().event(TAG, behavor);
                    TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                    traceLogger.error(TAG, "Found bad call, trackId: " + str2 + ", interval: " + valueOf);
                }
            }
        }
    }
}
