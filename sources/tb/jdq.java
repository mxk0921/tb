package tb;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jdq implements jvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, Boolean> c = new ConcurrentHashMap();
    private static Map<String, Long> d = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public Context f21934a;
    private Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
                AppMonitor.register(jvc.MODULE, jvc.MODULE_POINT, MeasureSet.create().addMeasure("cost").addMeasure("retainSize").addMeasure("splitSize").addMeasure("launchTime").addMeasure("fullCost"), DimensionSet.create().addDimension("splitVersion").addDimension("splitName").addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("isFullNewInstall").addDimension("isFirstLaunch").addDimension("isFirstUpdate").addDimension("installedFrom").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21936a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ long i;
        public final /* synthetic */ long j;
        public final /* synthetic */ long k;
        public final /* synthetic */ long l;
        public final /* synthetic */ long m;

        public b(String str, String str2, String str3, boolean z, int i, String str4, boolean z2, boolean z3, long j, long j2, long j3, long j4, long j5) {
            this.f21936a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = i;
            this.f = str4;
            this.g = z2;
            this.h = z3;
            this.i = j;
            this.j = j2;
            this.k = j3;
            this.l = j4;
            this.m = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AppMonitor.Stat.commit(jvc.MODULE, jvc.MODULE_POINT, DimensionValueSet.create().setValue("splitName", this.f21936a).setValue("splitVersion", String.valueOf(this.b)).setValue(v4s.PARAM_UPLOAD_STAGE, this.c).setValue("success", String.valueOf(this.d)).setValue("error_code", String.valueOf(this.e)).setValue(MUSAppMonitor.ERROR_MSG, this.f).setValue("isFirstUpdate", String.valueOf(bcq.a().e().s())).setValue("installedFrom", bcq.a().e().k()).setValue("isFullNewInstall", String.valueOf(this.g)).setValue("isFirstLaunch", String.valueOf(this.h)), MeasureValueSet.create().setValue("cost", this.i).setValue("splitSize", this.j).setValue("retainSize", this.k).setValue("fullCost", this.l).setValue("launchTime", this.m));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public jdq() {
        HandlerThread a2 = wsa.a("SplitLoader-report");
        a2.start();
        Handler handler = new Handler(a2.getLooper());
        this.b = handler;
        handler.postDelayed(new a(), 500L);
    }

    private String d(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("477a4d86", new Object[]{this, str, str2, new Boolean(z)});
        }
        return str + "-" + str2 + "-" + z;
    }

    @Override // tb.jvc
    public void a(String str, boolean z, String str2, long j, int i, String str3, String str4, long j2, long j3, long j4, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e0d97b", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, str4, new Long(j2), new Long(j3), new Long(j4), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (str2.equals(jvc.ARG_DEFFERED_INSTALL) || str2.equals(jvc.ARG_START_INSTALL)) {
            d.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        long currentTimeMillis = d.containsKey(str) ? System.currentTimeMillis() - d.get(str).longValue() : 0L;
        if (!c.containsKey(d(str, str2, z))) {
            c.put(d(str, str2, z), Boolean.TRUE);
            this.b.postDelayed(new b(str, str4, str2, z, i, str3, z2, z3, j, j2, j3, currentTimeMillis, j4), 500L);
        }
    }

    @Override // tb.jvc
    public void b(String str, boolean z, String str2, long j, int i, String str3, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b6cac5", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, new Long(j2)});
        } else {
            a(str, z, str2, j, i, str3, x49.c().b(str), x49.c().a(str), oaq.a(), h21.a(), h21.c(), h21.b());
        }
    }

    @Override // tb.jvc
    public void c(String str, boolean z, int i, long j, int i2, String str2, long j2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de53244", new Object[]{this, str, new Boolean(z), new Integer(i), new Long(j), new Integer(i2), str2, new Long(j2)});
            return;
        }
        if (i == 2) {
            str3 = "download";
        } else if (i != 4) {
            str3 = "verify";
            if (i != 10 && i == 11) {
                str3 = "load";
            }
            a(str, z, str3, j, i2, str2, x49.c().b(str), x49.c().a(str), oaq.a(), h21.a(), h21.c(), h21.b());
        } else {
            str3 = "install";
        }
        a(str, z, str3, j, i2, str2, x49.c().b(str), x49.c().a(str), oaq.a(), h21.a(), h21.c(), h21.b());
    }
}
