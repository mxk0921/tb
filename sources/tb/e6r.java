package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.anr.TBAnrConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e6r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18325a = false;
    public static TBAnrConfig b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18326a;

        public a(String str) {
            this.f18326a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e6r.a() && !TextUtils.isEmpty(this.f18326a)) {
                String str = this.f18326a;
                AppMonitor.Alarm.commitSuccess(lur.MONITOR_MODULE, "anr_dump", "event:ANR_DUMP;" + str);
                Log.e("TBAnrStatistic", this.f18326a);
            }
        }
    }

    static {
        t2o.a(824180782);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f18325a;
    }

    public static void b(TBAnrConfig tBAnrConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed36f70", new Object[]{tBAnrConfig});
            return;
        }
        b = tBAnrConfig;
        if (tBAnrConfig == null || !y74.d(tBAnrConfig.dumpStatisticSample)) {
            urr.b("TBAnrStatistic", "Can't start anr statistic. sample: %d", Long.valueOf(b.dumpStatisticSample));
        } else {
            f18325a = true;
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b0d515", new Object[0]);
        } else {
            k("type:3");
        }
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{str});
        } else {
            mur.b().a(new a(str));
        }
    }

    public static void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab868f27", new Object[]{new Integer(i)});
        } else {
            k(String.format("type:7;l1:%d", Integer.valueOf(i)));
        }
    }

    public static void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf9012d", new Object[]{new Integer(i)});
        } else {
            k(String.format("type:0;l1:%d", Integer.valueOf(i)));
        }
    }

    public static void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc94711", new Object[]{new Boolean(z)});
        } else {
            k(String.format("type:4;l1:%d", Integer.valueOf(z ? 1 : 0)));
        }
    }

    public static void c(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a678aa6", new Object[]{new Long(j), str});
        } else {
            k(String.format("type:2;l1:%d;l2:%d", Long.valueOf(j), Integer.valueOf((str == null || "null".equals(str)) ? 0 : 1)));
        }
    }

    public static void e(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48dfdfce", new Object[]{new Long(j), new Integer(i)});
        } else {
            k(String.format("type:1;l1:%d;l2:%d", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    public static void f(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f392ea", new Object[]{new Boolean(z), new Long(j)});
        } else {
            k(String.format("type:5;l1:%d;l2:%d", Integer.valueOf(z ? 1 : 0), Long.valueOf(j)));
        }
    }

    public static void j(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1eeb14", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        TBAnrConfig tBAnrConfig = b;
        if (tBAnrConfig != null && f18325a && y74.d(tBAnrConfig.traceStatisticSample)) {
            k(String.format("type:6;l1:%d;l2:%d", Long.valueOf(j), Integer.valueOf(z ? 1 : 0)));
        }
    }
}
