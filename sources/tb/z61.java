package tb;

import anet.channel.util.ALog;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z61 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f32563a;
    public static volatile List<Runnable> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32564a;
        public final /* synthetic */ String b;
        public final /* synthetic */ MeasureSet c;
        public final /* synthetic */ DimensionSet d;
        public final /* synthetic */ boolean e;

        public a(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
            this.f32564a = str;
            this.b = str2;
            this.c = measureSet;
            this.d = dimensionSet;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.register(this.f32564a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32565a;
        public final /* synthetic */ String b;
        public final /* synthetic */ DimensionValueSet c;
        public final /* synthetic */ MeasureValueSet d;

        public b(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
            this.f32565a = str;
            this.b = str2;
            this.c = dimensionValueSet;
            this.d = measureValueSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.Stat.commit(this.f32565a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f32566a;

        public c(Runnable runnable) {
            this.f32566a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (z61.a()) {
                z61.b();
                this.f32566a.run();
            } else {
                if (z61.c() == null) {
                    z61.d(new LinkedList());
                }
                if (z61.c().size() < 150) {
                    z61.c().add(this.f32566a);
                } else {
                    ALog.e("falco.AppMonitorAdapter", "Exceeding the maximum value of the cache queue: 150", null, new Object[0]);
                }
            }
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return e();
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            j();
        }
    }

    public static /* synthetic */ List c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61da832e", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ List d(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2f3a18db", new Object[]{list});
        }
        b = list;
        return list;
    }

    public static void f(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f8ffe0", new Object[]{str, str2, dimensionValueSet, measureValueSet});
        } else {
            g(new b(str, str2, dimensionValueSet, measureValueSet));
        }
    }

    public static void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3198ca", new Object[]{runnable});
        } else {
            crt.i(new c(runnable));
        }
    }

    public static void h(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701c9b46", new Object[]{str, str2, measureSet, dimensionSet});
        } else {
            i(str, str2, measureSet, dimensionSet, false);
        }
    }

    public static void i(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377804e", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z)});
        } else {
            g(new a(str, str2, measureSet, dimensionSet, z));
        }
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9e3ba8", new Object[0]);
        } else if (b != null && !b.isEmpty()) {
            List<Runnable> list = b;
            b = null;
            for (Runnable runnable : list) {
                runnable.run();
            }
            ALog.e("falco.AppMonitorAdapter", "cached task count: " + list.size(), null, new Object[0]);
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40d417fe", new Object[0])).booleanValue();
        }
        if (f32563a) {
            return true;
        }
        try {
            f32563a = AnalyticsMgr.p();
            ALog.e("falco.AppMonitorAdapter", "[checkAppMonitorInitialized]", null, "status", Boolean.valueOf(f32563a));
        } catch (Throwable th) {
            f32563a = true;
            ALog.e("falco.AppMonitorAdapter", "[checkAppMonitorInitialized] error:", null, th, new Object[0]);
        }
        return f32563a;
    }
}
