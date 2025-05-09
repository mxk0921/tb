package com.taobao.android.tbuprofen.adapter.anr;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.tbuprofen.adapter.anr.a;
import com.taobao.android.tbuprofen.util.StackDumpUtils;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.cdw;
import tb.e6r;
import tb.gvr;
import tb.iqt;
import tb.l5r;
import tb.p5r;
import tb.t2o;
import tb.urr;
import tb.wsa;
import tb.y74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String i;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9618a;
    public final TBAnrConfig b;
    public c d;
    public final HandlerThread c = wsa.b("tbp-anr-info-thread");
    public final Queue<gvr> e = new ConcurrentLinkedQueue();
    public long f = 0;
    public long g = 0;
    public final List<String> h = new ArrayList();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tbuprofen.adapter.anr.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0495a implements AnrUncaughtListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0495a() {
        }

        @Override // com.taobao.android.tcrash.AnrUncaughtListener
        public Map<String, Object> onAnrUncaught() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            try {
                a.b(a.this);
                hashMap.put("TBP_RUNNING_INFO", a.c(a.this));
                a.d(a.this).runningInfoCollectConfig.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = countDownLatch;
                a.e(a.this).sendMessage(obtain);
                try {
                    boolean await = countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
                    if (await && a.f() != null) {
                        hashMap.put("TBP_MAIN_THREAD_TRACE", "\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nTBP anr main trace:\n" + a.f() + "\n");
                    }
                    e6r.f(await, SystemClock.uptimeMillis() - uptimeMillis);
                    a.g(null);
                } catch (InterruptedException e) {
                    e6r.f(false, SystemClock.uptimeMillis() - uptimeMillis);
                    urr.b("TBANRInfoCollector", "dump main thread trace error", e);
                }
                e6r.i(true);
                return hashMap;
            } catch (Throwable th) {
                e6r.i(false);
                Log.e("TBANRInfoCollector", "dump anr info error", th);
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements StackDumpUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(a aVar) {
        }

        @Override // com.taobao.android.tbuprofen.util.StackDumpUtils.a
        public void onError(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            } else {
                urr.b("TBANRInfoCollector", "dump main thread trace error", new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f9620a;

        static {
            t2o.a(824180777);
        }

        public c(Looper looper, a aVar) {
            super(looper);
            this.f9620a = aVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/anr/TBANRInfoCollector$TBCollectInfoHandler");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26fd772f", new Object[]{this});
            } else {
                sendEmptyMessageDelayed(3, a.d(this.f9620a).checkTaskInterval);
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bf8094", new Object[]{this});
            } else {
                sendEmptyMessageDelayed(1, a.d(this.f9620a).getRunningInfoInterval);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                a.b(this.f9620a);
                b();
            } else if (i == 2) {
                a.h(this.f9620a);
            } else if (i == 3) {
                a.i(this.f9620a);
                a();
            } else if (i == 4) {
                a.g(a.j(this.f9620a));
                Object obj = message.obj;
                if (obj != null) {
                    ((CountDownLatch) obj).countDown();
                }
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            b();
            a();
            sendEmptyMessageDelayed(2, 20000L);
            urr.b("TBANRInfoCollector", "start collect running info.", new Object[0]);
        }
    }

    static {
        t2o.a(824180774);
    }

    public a(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        this.f9618a = context;
        this.b = aVar.f;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a2029f", new Object[]{aVar});
        } else {
            aVar.m();
        }
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2241162", new Object[]{aVar});
        }
        return aVar.o();
    }

    public static /* synthetic */ TBAnrConfig d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAnrConfig) ipChange.ipc$dispatch("e77c6f2", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ c e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("db0d8a50", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f490db79", new Object[]{str});
        }
        i = str;
        return str;
    }

    public static /* synthetic */ void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc7f07a", new Object[]{aVar});
        } else {
            aVar.l();
        }
    }

    public static /* synthetic */ void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c35ecd9", new Object[]{aVar});
        } else {
            aVar.k();
        }
    }

    public static /* synthetic */ String j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51aea268", new Object[]{aVar});
        }
        return aVar.n();
    }

    public static /* synthetic */ int q(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e49fafea", new Object[]{file, file2})).intValue();
        }
        if (file.lastModified() < file2.lastModified()) {
            return -1;
        }
        return 1;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fdb2c6", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f;
        if (j > 0 && elapsedRealtime - this.g > this.b.checkTaskInterval * 2) {
            String str = "Freeze between " + y74.g(j) + " - " + y74.g(currentTimeMillis);
            ((ArrayList) this.h).add(str);
            urr.b("TBANRInfoCollector", str, new Object[0]);
        }
        this.f = currentTimeMillis;
        this.g = elapsedRealtime;
    }

    public final void l() {
        File[] listFiles;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31e703b", new Object[]{this});
            return;
        }
        File externalFilesDir = this.f9618a.getExternalFilesDir("anrinfo");
        if (externalFilesDir != null && externalFilesDir.exists() && (listFiles = externalFilesDir.listFiles()) != null && (length = listFiles.length) >= this.b.maxAnrFileNum) {
            Arrays.sort(listFiles, new Comparator() { // from class: tb.r5r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int q;
                    q = a.q((File) obj, (File) obj2);
                    return q;
                }
            });
            for (int i2 = 0; i2 < length - (this.b.maxAnrFileNum / 2); i2++) {
                listFiles[i2].delete();
            }
        }
    }

    public final void m() {
        Map runtimeStats;
        HealthStats takeMyUidSnapshot;
        boolean hasStats;
        Map stats;
        long measurement;
        long measurement2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6f5ba3", new Object[]{this});
            return;
        }
        gvr gvrVar = new gvr();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            takeMyUidSnapshot = l5r.a(this.f9618a.getSystemService("systemhealth")).takeMyUidSnapshot();
            hasStats = takeMyUidSnapshot.hasStats(cdw.T_BORDER_WIDTH);
            if (hasStats) {
                stats = takeMyUidSnapshot.getStats(cdw.T_BORDER_WIDTH);
                HealthStats a2 = p5r.a(stats.get(this.f9618a.getPackageName()));
                if (a2 != null) {
                    measurement = a2.getMeasurement(30001);
                    gvrVar.c = measurement;
                    measurement2 = a2.getMeasurement(f.DXError_EngineInitException);
                    gvrVar.b = measurement2;
                }
            }
        }
        long j = Runtime.getRuntime().totalMemory() / 1024;
        gvrVar.e = j;
        gvrVar.d = j - (Runtime.getRuntime().freeMemory() / 1024);
        gvrVar.l = Debug.getNativeHeapSize() / 1024;
        if (i2 >= 23) {
            try {
                runtimeStats = Debug.getRuntimeStats();
                gvrVar.f = (String) runtimeStats.get("art.gc.gc-count");
                gvrVar.g = (String) runtimeStats.get("art.gc.gc-time");
                gvrVar.h = (String) runtimeStats.get("art.gc.blocking-gc-count");
                gvrVar.i = (String) runtimeStats.get("art.gc.blocking-gc-time");
                gvrVar.j = (String) runtimeStats.get("art.gc.bytes-allocated");
                gvrVar.k = (String) runtimeStats.get("art.gc.bytes-freed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ((ConcurrentLinkedQueue) this.e).add(gvrVar);
        int size = ((ConcurrentLinkedQueue) this.e).size();
        TBAnrConfig tBAnrConfig = this.b;
        if (size > tBAnrConfig.monitorTimeScope / tBAnrConfig.getRunningInfoInterval) {
            ((ConcurrentLinkedQueue) this.e).poll();
        }
    }

    public final String n() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddee266b", new Object[]{this});
        }
        if (!y74.e()) {
            return null;
        }
        long myTid = Process.myTid();
        StackDumpUtils.l(myTid, new b(this));
        Thread thread = Looper.getMainLooper().getThread();
        if (this.b.ddmDumpSdkVersion == Build.VERSION.SDK_INT) {
            z = true;
        }
        Object[] dumpRawStackTraceSafely = StackDumpUtils.dumpRawStackTraceSafely(thread, z);
        StackDumpUtils.m(myTid);
        if (dumpRawStackTraceSafely == null) {
            return null;
        }
        return StackDumpUtils.j(StackDumpUtils.h(Looper.getMainLooper().getThread().getName(), dumpRawStackTraceSafely));
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71858020", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nTBP ANR Running Info Start\n\n[Recent runtime info]\n[time][stm/utm][used/total/ratio][nativeHeap][gcCount/gcTime/blockGcCount/blockGcTime][totalAllocate/gcFreed]\n");
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (it.hasNext()) {
            sb.append(((gvr) it.next()).toString());
            sb.append("\n");
        }
        int a2 = iqt.a();
        sb.append("Thread total: [");
        sb.append(a2);
        sb.append("]\n\n[App Freeze info]\n");
        Iterator it2 = ((ArrayList) this.h).iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append("\n");
        }
        sb.append("\n[Extra info]\nTBP ANR Running Info End\n");
        return sb.toString();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c.start();
        c cVar = new c(this.c.getLooper(), this);
        this.d = cVar;
        cVar.c();
        TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY).addHeaderInfo("TBP_RUNNING_INFO_ENABLE", y74.g(System.currentTimeMillis()));
        TCrashSDK.instance().addAnrUncaughtListener(new C0495a());
    }
}
