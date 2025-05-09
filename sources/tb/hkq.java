package tb;

import android.app.Application;
import android.os.SystemClock;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hkq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20708a;
    public static volatile boolean c;
    public static final ConcurrentLinkedQueue<b> b = new ConcurrentLinkedQueue<>();
    public static Long d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                b bVar = (b) hkq.a().poll();
                if (bVar != null) {
                    hkq.b(bVar.f20709a, bVar.b, bVar.c, bVar.d);
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20709a;
        public String b;
        public String c;
        public double d;

        static {
            t2o.a(398458903);
        }

        public static b a(String str, String str2, String str3, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c4d7aeac", new Object[]{str, str2, str3, new Double(d)});
            }
            b bVar = new b();
            bVar.f20709a = str;
            bVar.b = str2;
            bVar.c = str3;
            bVar.d = d;
            return bVar;
        }
    }

    static {
        t2o.a(398458901);
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f20708a = true;
        } catch (Exception unused) {
            f20708a = false;
        }
    }

    public static /* synthetic */ ConcurrentLinkedQueue a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentLinkedQueue) ipChange.ipc$dispatch("6a7c0fc5", new Object[0]);
        }
        return b;
    }

    public static void b(String str, String str2, String str3, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5653f8a1", new Object[]{str, str2, str3, new Double(d2)});
        } else if (f20708a) {
            try {
                if (!AnalyticsMgr.p()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (d == null) {
                        d = Long.valueOf(elapsedRealtime);
                    }
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = b;
                    concurrentLinkedQueue.offer(b.a(str, str2, str3, d2));
                    if (concurrentLinkedQueue.size() >= 100 || elapsedRealtime - d.longValue() > 10000) {
                        AnalyticsMgr.P((Application) o41.a());
                        return;
                    }
                    return;
                }
                if (!c && !b.isEmpty()) {
                    c = true;
                    of.a(1, "atools-statistic").execute(new a());
                }
                AppMonitor.Counter.commit(str, str2, str3, d2);
            } catch (Throwable th) {
                l2u.instance.d("Statistic", "commitCount err", th, new Object[0]);
            }
        }
    }
}
