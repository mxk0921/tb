package tb;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.stat.AbnormalFlowStatistic;
import com.taobao.orange.OrangeConfig;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.bs;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LinkedHashMap<Long, d> i = new LinkedHashMap<>();
    public static double j = 0.8d;
    public static double k = 0.8d;
    public static volatile zr l;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f32958a;
    public long b;
    public boolean c = true;
    public double d = vu3.b.GEO_NOT_SUPPORT;
    public double e = vu3.b.GEO_NOT_SUPPORT;
    public final HashMap<String, bs> f = new HashMap<>();
    public final HashMap<String, bs> g = new HashMap<>();
    public int h = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                caj.c().d(GlobalAppRuntimeInfo.getContext());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32960a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ int g;

        public b(String str, String str2, String str3, boolean z, long j, long j2, int i) {
            this.f32960a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = j;
            this.f = j2;
            this.g = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (TextUtils.isEmpty(this.f32960a) || this.f32960a.length() <= 128) {
                    str = this.f32960a;
                } else {
                    str = srj.b(this.f32960a);
                }
                zr.this.f(new d(new rp9(this.b, this.c, str, this.d, this.e, this.f), new URI(this.f32960a).getHost(), this.g));
            } catch (Throwable th) {
                ALog.e("AbnormalFlowMonitor", "run putData failed", null, th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(zr zrVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "[network_multi_path_flow]");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public volatile rp9 f32961a;
        public volatile Double b;
        public volatile Double c;
        public volatile String d;
        public volatile int e;

        public d(rp9 rp9Var, String str, int i) {
            Double valueOf = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
            this.b = valueOf;
            this.c = valueOf;
            this.f32961a = rp9Var;
            this.d = str;
            if (rp9Var.d) {
                this.b = Double.valueOf((((rp9Var.g + rp9Var.f) * 1.0d) / 1024.0d) / 1024.0d);
            } else {
                this.c = Double.valueOf((((rp9Var.g + rp9Var.f) * 1.0d) / 1024.0d) / 1024.0d);
            }
            this.e = i;
        }
    }

    public zr() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new c(this));
        this.f32958a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5da7f", new Object[]{str});
            return;
        }
        j = Double.parseDouble(OrangeConfig.getInstance().getConfig(str, "maxUnitTimeMultiPathBgFlow", "0.5"));
        k = Double.parseDouble(OrangeConfig.getInstance().getConfig(str, "maxUnitTimeMultiPathFgFlow", "0.5"));
    }

    public static zr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zr) ipChange.ipc$dispatch("67a47962", new Object[0]);
        }
        if (l == null) {
            synchronized (zr.class) {
                try {
                    if (l == null) {
                        l = new zr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l;
    }

    public final void a(long j2, double d2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413e8555", new Object[]{this, new Long(j2), new Double(d2), new Integer(i2)});
            return;
        }
        for (Map.Entry<Long, d> entry : i.entrySet()) {
            d value = entry.getValue();
            if (value.e == 1) {
                bs bsVar = this.f.get(value.f32961a.f27528a);
                if (bsVar == null) {
                    bsVar = new bs();
                }
                bsVar.a(value, bsVar.f16585a);
                this.f.put(value.f32961a.f27528a, bsVar);
            }
            if (value.e == 2) {
                bs bsVar2 = this.g.get(value.f32961a.f27528a);
                if (bsVar2 == null) {
                    bsVar2 = new bs();
                }
                bsVar2.a(value, bsVar2.f16585a);
                this.g.put(value.f32961a.f27528a, bsVar2);
            }
        }
        b(j2, d2, 1, this.f);
        b(j2, d2, 2, this.g);
        i.clear();
    }

    public final void b(long j2, double d2, int i2, HashMap<String, bs> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb1d6d6", new Object[]{this, new Long(j2), new Double(d2), new Integer(i2), hashMap});
            return;
        }
        for (Map.Entry<String, bs> entry : hashMap.entrySet()) {
            for (Map.Entry<String, bs.a> entry2 : entry.getValue().f16585a.entrySet()) {
                AbnormalFlowStatistic abnormalFlowStatistic = new AbnormalFlowStatistic(entry.getKey(), entry2.getKey(), entry2.getValue(), j2, i2, d2);
                ALog.d("AbnormalFlowMonitor", "handle abnormal flow, refer = [%s] , activityName = [%s]", entry.getKey(), entry2.getKey());
                AppMonitor.getInstance().commitStat(abnormalFlowStatistic);
            }
        }
        hashMap.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0130 A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0027, B:18:0x0038, B:19:0x003d, B:21:0x007a, B:22:0x0081, B:24:0x0093, B:28:0x009f, B:30:0x00a5, B:32:0x00bf, B:33:0x00c4, B:35:0x00ca, B:38:0x00dc, B:40:0x00e7, B:42:0x00ed, B:44:0x0103, B:45:0x0109, B:46:0x010b, B:48:0x0111, B:51:0x0123, B:53:0x0130, B:55:0x013b, B:57:0x0145, B:61:0x014d, B:62:0x0150, B:66:0x0158), top: B:71:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0027, B:18:0x0038, B:19:0x003d, B:21:0x007a, B:22:0x0081, B:24:0x0093, B:28:0x009f, B:30:0x00a5, B:32:0x00bf, B:33:0x00c4, B:35:0x00ca, B:38:0x00dc, B:40:0x00e7, B:42:0x00ed, B:44:0x0103, B:45:0x0109, B:46:0x010b, B:48:0x0111, B:51:0x0123, B:53:0x0130, B:55:0x013b, B:57:0x0145, B:61:0x014d, B:62:0x0150, B:66:0x0158), top: B:71:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void f(tb.zr.d r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zr.f(tb.zr$d):void");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.f32958a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new a());
        }
    }

    public void h(String str, String str2, String str3, boolean z, long j2, long j3, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1365e96d", new Object[]{this, str, str2, str3, new Boolean(z), new Long(j2), new Long(j3), new Integer(i2)});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.f32958a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new b(str3, str, str2, z, j2, j3, i2));
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c284d5", new Object[]{this});
        } else {
            this.b = System.currentTimeMillis();
        }
    }

    public final boolean c(long j2, long j3) {
        long time;
        long j4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4fd023d", new Object[]{this, new Long(j2), new Long(j3)})).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String format = simpleDateFormat.format(Long.valueOf(j3));
        String format2 = simpleDateFormat.format(Long.valueOf(j2));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            time = simpleDateFormat2.parse(format).getTime() - simpleDateFormat2.parse(format2).getTime();
            j4 = time / 86400000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ((time / 60000) - (j4 * 1440)) - (((time / 3600000) - (24 * j4)) * 60) <= 5;
    }
}
