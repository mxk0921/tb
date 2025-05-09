package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$DataPoint;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$PageName;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.adaemon.power.APower;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import com.taobao.android.alinnkit.core.AliNNForwardType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class pq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FEATURE_LOADED = 4;
    public static final int FEATURE_PARTLY_LOADED = 8;
    public static final int FEATURE_UNLOADED = 0;
    public static final int MODEL_INITIALIZING = 8;
    public static final int MODEL_LOADED = 2;
    public static final int MODEL_UNLOADED = 0;

    /* renamed from: a  reason: collision with root package name */
    public AliNNNetInstance f26233a;
    public AliNNNetInstance.d b;
    public AliNNImageProcess.a c;
    public final khj d;
    public int e = 0;

    static {
        t2o.a(482344992);
    }

    public pq0(khj khjVar) {
        this.d = khjVar;
        agh.a("AliNNModel", "AliNNModel: " + toString());
    }

    public static String a(khj khjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baad00ec", new Object[]{khjVar});
        }
        if (khjVar != null && khjVar.e()) {
            try {
                String c = yhv.c(khjVar.b, khjVar.c);
                if (TextUtils.isEmpty(c)) {
                    lxl.b().c("DOWNLOAD_MODEL", -1);
                    c = yhv.b(khjVar.b, false, khjVar.c, khjVar.d());
                    lhj.b(lxl.b().a("DOWNLOAD_MODEL"), khjVar.d());
                }
                if (TextUtils.isEmpty(c)) {
                    lhj.c("downloadFailed", khjVar.d());
                }
                return c;
            } catch (Exception unused) {
                lhj.c("downloadException", khjVar.d());
            }
        }
        return "";
    }

    public final AliNNForwardType b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNForwardType) ipChange.ipc$dispatch("7de1e1c1", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return AliNNForwardType.FORWARD_CPU;
        }
        if (i == 1) {
            return AliNNForwardType.FORWARD_OPENCL;
        }
        if (i != 2) {
            return AliNNForwardType.FORWARD_CPU;
        }
        return AliNNForwardType.FORWARD_NPU;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceefb19c", new Object[]{this})).booleanValue();
        }
        if ((this.e & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e0409c9", new Object[]{this})).booleanValue();
        }
        if (!d() || !f()) {
            return false;
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecc7538f", new Object[]{this})).booleanValue();
        }
        if ((this.e & 2) == 2) {
            return true;
        }
        return false;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdf55e25", new Object[]{this});
        }
        khj khjVar = this.d;
        if (khjVar != null) {
            return khjVar.d();
        }
        return "";
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        l();
        k();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f099f6", new Object[]{this});
        } else {
            this.e &= -13;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7755d2e9", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    if (!lg4.A4()) {
                        this.b.c();
                    }
                    this.b = null;
                }
                AliNNNetInstance aliNNNetInstance = this.f26233a;
                if (aliNNNetInstance != null) {
                    aliNNNetInstance.release();
                    this.f26233a = null;
                }
                this.e &= -3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        AliNNNetInstance.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b7d4e5", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (!(this.f26233a == null || (dVar = this.b) == null)) {
                try {
                    dVar.d();
                } catch (Exception unused) {
                    lhj.c("runNetException", i());
                }
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ModelId = " + this.d.c() + " ModelName = " + this.d.d();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c8611ea", new Object[]{this});
        }
        int i = this.d.d;
        if (i == 1) {
            return "gpu-opencl";
        }
        if (i != 2) {
            return APower.TYPE_CPU;
        }
        return "npu";
    }

    public int g() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc2d40dd", new Object[]{this})).intValue();
        }
        if (this.b != null) {
            if (!lg4.A4()) {
                this.b.c();
            }
            this.b = null;
        }
        AliNNNetInstance aliNNNetInstance = this.f26233a;
        if (aliNNNetInstance != null) {
            aliNNNetInstance.release();
            this.f26233a = null;
        }
        try {
            a2 = a(this.d);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(a2)) {
            return h(a2, this.d.d);
        }
        jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint$DataPoint.IRP_NETWORK_BUILD_FAILED.getPoint(), "network", this.d.d(), "reason", "emptyPath");
        return 0;
    }

    public int h(String str, int i) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68193542", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            synchronized (this) {
                lxl.b().c("INIT_MODEL", -1);
                if (this.d.b()) {
                    this.f26233a = wq0.b(caa.c(), str, this.d.a());
                } else {
                    Application c = caa.c();
                    if (this.d.a() != null) {
                        str3 = this.d.a();
                    } else {
                        str3 = NetConfig.AUTH_CODE;
                    }
                    this.f26233a = AliNNNetInstance.e(c, str, str3, NetConfig.ALINN_BIZ_NAME, this.d.c(), this.d.d());
                }
                AliNNNetInstance.c cVar = new AliNNNetInstance.c();
                cVar.f6334a = b(i).type;
                cVar.b = 4;
                AliNNNetInstance aliNNNetInstance = this.f26233a;
                if (aliNNNetInstance != null) {
                    try {
                        this.b = aliNNNetInstance.g(cVar);
                    } catch (Exception unused) {
                        this.b = this.f26233a.f(cVar);
                    }
                }
                long a2 = lxl.b().a("INIT_MODEL");
                lhj.a(a2, this.d.d(), c());
                if (this.b != null) {
                    str2 = "0";
                } else {
                    str2 = "ALINN_UNCOMMIT_VALUE";
                }
                qq0.h(NetConfig.ALINN_BIZ_NAME, this.d.c(), this.d.d(), str2, this.f26233a != null, (float) a2);
                if (this.f26233a == null) {
                    lhj.c("createNetInstanceFailed", i());
                }
            }
            return this.f26233a != null ? 2 : 0;
        } catch (Exception unused2) {
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint$DataPoint.IRP_NETWORK_BUILD_FAILED.getPoint(), "network", i(), "reason", "createNetException");
            lhj.c("createNetInstanceException", i());
            return 0;
        }
    }
}
