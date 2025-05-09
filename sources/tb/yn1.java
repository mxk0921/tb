package tb;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.stat.BgFlowReportStatistic;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static volatile int p = 60;
    public static boolean q = true;
    public static volatile yn1 r;

    /* renamed from: a  reason: collision with root package name */
    public String f32208a;
    public String b;
    public boolean c = false;
    public final HashMap<String, Integer> d = new HashMap<>();
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = System.currentTimeMillis();
    public double j = vu3.b.GEO_NOT_SUPPORT;
    public double k = vu3.b.GEO_NOT_SUPPORT;
    public double l = vu3.b.GEO_NOT_SUPPORT;
    public long m = 0;
    public int n = 0;
    public final ThreadPoolExecutor o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(yn1 yn1Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "falco.BackgroundFlowReport");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f32209a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        public b(boolean z, String str, long j, long j2, long j3, long j4) {
            this.f32209a = z;
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                yn1.a(yn1.this, this.f32209a, this.b, this.c, this.d, this.e, this.f);
            } catch (Throwable th) {
                ALog.e("falco.BackgroundFlowReport", "run commitBackgroundFlowReport failed", null, th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yn1.b(yn1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32211a;

        public d(String str) {
            this.f32211a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AtomicInteger atomicInteger = new AtomicInteger(0);
                Iterator it = yn1.c(yn1.this).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).equals(this.f32211a)) {
                        entry.setValue(Integer.valueOf(((Integer) entry.getValue()).intValue() + 1));
                        atomicInteger.set(1);
                        break;
                    }
                }
                if (atomicInteger.get() == 0) {
                    yn1.c(yn1.this).put(this.f32211a, 1);
                }
            } catch (Throwable th) {
                ALog.e("falco.BackgroundFlowReport", "createConnectCount failed", null, th, new Object[0]);
            }
        }
    }

    public yn1() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new a(this));
        this.o = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void a(yn1 yn1Var, boolean z, String str, long j, long j2, long j3, long j4) throws URISyntaxException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3435a5", new Object[]{yn1Var, new Boolean(z), str, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else {
            yn1Var.k(z, str, j, j2, j3, j4);
        }
    }

    public static /* synthetic */ void b(yn1 yn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0386678", new Object[]{yn1Var});
        } else {
            yn1Var.g();
        }
    }

    public static /* synthetic */ HashMap c(yn1 yn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5ceea2ba", new Object[]{yn1Var});
        }
        return yn1Var.d;
    }

    public static yn1 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yn1) ipChange.ipc$dispatch("66ec0b32", new Object[0]);
        }
        if (r == null) {
            synchronized (yn1.class) {
                try {
                    if (r == null) {
                        r = new yn1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return r;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eb4386b", new Object[0])).booleanValue();
        }
        return q;
    }

    public static void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b259e5", new Object[]{new Integer(i)});
        } else {
            p = i;
        }
    }

    public static void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748a5685", new Object[]{new Boolean(z)});
        } else {
            q = z;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.j = vu3.b.GEO_NOT_SUPPORT;
        this.l = vu3.b.GEO_NOT_SUPPORT;
        this.b = null;
        this.d.clear();
        this.k = vu3.b.GEO_NOT_SUPPORT;
        this.i = System.currentTimeMillis();
        this.m = 0L;
    }

    public void e(boolean z, String str, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90215130", new Object[]{this, new Boolean(z), str, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.o;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new b(z, str, j, j2, j3, j4));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec57545a", new Object[]{this});
        } else {
            this.o.submit(new c());
        }
    }

    public void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0ed546", new Object[]{this, str, str2, str3});
        } else {
            this.o.submit(new d(str3));
        }
    }

    public final int i() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79be2bb5", new Object[]{this})).intValue();
        }
        for (Map.Entry<String, Integer> entry : this.d.entrySet()) {
            i += entry.getValue().intValue();
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(boolean r19, java.lang.String r20, long r21, long r23, long r25, long r27) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yn1.k(boolean, java.lang.String, long, long, long, long):void");
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ca1cf1", new Object[]{this});
        } else if (this.j != vu3.b.GEO_NOT_SUPPORT) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Integer> entry : this.d.entrySet()) {
                    if (entry.getKey() != null) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    } else {
                        jSONObject.put("unknown", entry.getValue());
                    }
                }
                AppMonitor.getInstance().commitStat(new BgFlowReportStatistic(jSONObject.toString(), this.b, this.j, (this.l * 1.0d) / 1000.0d, this.n, i()));
                d();
            } catch (JSONException unused) {
                ALog.e("falco.BackgroundFlowReport", "commitNetworkInfoBg JSONObject failed", null, new Object[0]);
            }
        }
    }
}
