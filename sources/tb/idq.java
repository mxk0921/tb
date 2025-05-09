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
public class idq implements jvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, Boolean> c = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public Context f21256a;
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
                AppMonitor.register(jvc.MODULE, jvc.MODULE_POINT, MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("splitVersion").addDimension("splitName").addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21258a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;

        public b(String str, long j, String str2, boolean z, int i, String str3, long j2) {
            this.f21258a = str;
            this.b = j;
            this.c = str2;
            this.d = z;
            this.e = i;
            this.f = str3;
            this.g = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.Stat.commit(jvc.MODULE, jvc.MODULE_POINT, DimensionValueSet.create().setValue("splitName", this.f21258a).setValue("splitVersion", String.valueOf(this.b)).setValue(v4s.PARAM_UPLOAD_STAGE, this.c).setValue("success", String.valueOf(this.d)).setValue("error_code", String.valueOf(this.e)).setValue(MUSAppMonitor.ERROR_MSG, this.f), MeasureValueSet.create().setValue("cost", this.g));
            }
        }
    }

    public idq() {
        HandlerThread handlerThread = new HandlerThread("SplitLoader-report");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
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
        }
    }

    @Override // tb.jvc
    public void b(String str, boolean z, String str2, long j, int i, String str3, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b6cac5", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, new Long(j2)});
        } else if (!c.containsKey(d(str, str2, z))) {
            c.put(d(str, str2, z), Boolean.TRUE);
            this.b.postDelayed(new b(str, j2, str2, z, i, str3, j), 500L);
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
        if (i != 10) {
            if (i == 4) {
                str3 = "install";
            } else if (i == 2) {
                str3 = "download";
            } else if (i == 11) {
                str3 = "load";
            }
            b(str, z, str3, j, i2, str2, j2);
        }
        str3 = "verify";
        b(str, z, str3, j, i2, str2, j2);
    }
}
