package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d5d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POINT_ACQUIRE_DEFAULT_PROVIDER = "acq_default_provider";
    public static final String POINT_ACQUIRE_PROVIDER = "acq_provider";
    public static final String POINT_BIND_CHANNEL = "bind_channel";
    public static final String POINT_BIND_IN_MAIN = "bind_in_main";
    public static final String POINT_HOOK = "hook";
    public static final String POINT_RETRY_ACQUIRE_PROVIDER = "retry_acq_provider";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f17590a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean j = false;

        /* renamed from: a  reason: collision with root package name */
        public String f17591a = "ipcState";
        public String b;
        public String c;
        public final int d;
        public int e;
        public int f;
        public long g;
        public long h;
        public long i;

        static {
            t2o.a(393216087);
        }

        public a(int i) {
            this.d = i;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7fed3533", new Object[]{aVar})).booleanValue();
            }
            return aVar.i();
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c37852e4", new Object[]{aVar})).longValue();
            }
            return aVar.g;
        }

        public static /* synthetic */ long c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("70370a5", new Object[]{aVar})).longValue();
            }
            return aVar.h;
        }

        public static /* synthetic */ long d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a8e8e66", new Object[]{aVar})).longValue();
            }
            return aVar.i;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd3dd4cd", new Object[]{aVar});
            }
            return aVar.f17591a;
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (d5d.a()) {
                g5d.b(false, true, new RunnableC0902a());
            }
        }

        public DimensionSet g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DimensionSet) ipChange.ipc$dispatch("d17e007d", new Object[]{this});
            }
            DimensionSet create = DimensionSet.create();
            create.addDimension("type");
            create.addDimension("degrade");
            create.addDimension("result");
            create.addDimension(FluidException.SERVICE_NAME);
            create.addDimension(FluidException.METHOD_NAME);
            return create;
        }

        public DimensionValueSet h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DimensionValueSet) ipChange.ipc$dispatch("e07c35f7", new Object[]{this});
            }
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("type", String.valueOf(this.d));
            create.setValue("degrade", String.valueOf(this.f));
            create.setValue("result", String.valueOf(this.e));
            create.setValue(FluidException.SERVICE_NAME, this.b);
            create.setValue(FluidException.METHOD_NAME, this.c);
            return create;
        }

        public void j(long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edb7f1e1", new Object[]{this, new Long(j2)});
            } else {
                this.g = j2;
            }
        }

        public void k(long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff61cdf0", new Object[]{this, new Long(j2)});
            } else {
                this.i = j2;
            }
        }

        public void l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c16fa79", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z ? 1 : 0;
            }
        }

        public void m(long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d4bb616", new Object[]{this, new Long(j2)});
            } else {
                this.h = j2;
            }
        }

        public void n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("819c491f", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78314669", new Object[]{this, str});
            } else {
                this.f17591a = str;
            }
        }

        public void p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d62fb9d", new Object[]{this, new Integer(i)});
            } else {
                this.e = i;
            }
        }

        public void q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64bb7d2f", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "IpcState{serviceName='" + this.b + "', methodName='" + this.c + "', type=" + this.d + ", result=" + this.e + ", degrade=" + this.f + ", costTime=" + this.g + ", invokeTime=" + this.h + ", dataSize=" + this.i + '}';
        }

        /* compiled from: Taobao */
        /* renamed from: tb.d5d$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0902a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0902a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this)) {
                    b5d.g("IPCMonitor", "[commit]", "IpcState", a.this.toString());
                    try {
                        DimensionValueSet h = a.this.h();
                        MeasureValueSet create = MeasureValueSet.create();
                        create.setValue("costTime", a.b(a.this));
                        create.setValue("invokeTime", a.c(a.this));
                        create.setValue("dataSize", a.d(a.this));
                        AppMonitor.Stat.commit("ARanger", a.e(a.this), h, create);
                    } catch (Exception e) {
                        b5d.h("IPCMonitor", "[commit][AppMonitor Stat commit]", e, new Object[0]);
                    }
                }
            }
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!d5d.a()) {
                return false;
            }
            synchronized (this) {
                if (j) {
                    return true;
                }
                try {
                    DimensionSet g = g();
                    MeasureSet create = MeasureSet.create();
                    create.addMeasure("costTime");
                    create.addMeasure("invokeTime");
                    create.addMeasure("dataSize");
                    AppMonitor.register("ARanger", this.f17591a, create, g, true);
                    j = true;
                } catch (Exception e) {
                    b5d.h("IPCMonitor", "[register][AppMonitor register]", e, new Object[0]);
                }
                return j;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MONITOR_POINT_1 = "ipcState_1";
        public String k;

        static {
            t2o.a(393216089);
        }

        public b(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -780271491) {
                return super.g();
            }
            if (hashCode == -528730633) {
                return super.h();
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/aranger/mit/IPCMonitor$IpcState_1");
        }

        @Override // tb.d5d.a
        public DimensionSet g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DimensionSet) ipChange.ipc$dispatch("d17e007d", new Object[]{this});
            }
            return super.g().addDimension("errMsg");
        }

        @Override // tb.d5d.a
        public DimensionValueSet h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DimensionValueSet) ipChange.ipc$dispatch("e07c35f7", new Object[]{this});
            }
            return super.h().setValue("errMsg", this.k);
        }

        public void r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a26e6ef", new Object[]{this, str});
            } else {
                this.k = str;
            }
        }
    }

    static {
        t2o.a(393216086);
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f17590a = true;
        } catch (Exception unused) {
            f17590a = false;
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f17590a;
    }

    public static void b(String str, boolean z, String... strArr) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff6dcb6", new Object[]{str, new Boolean(z), strArr});
            return;
        }
        if (strArr == null || strArr.length != 1) {
            str2 = "";
        } else {
            str2 = strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (z) {
            str3 = "_succ_";
        } else {
            str3 = "_fail_";
        }
        sb.append(str3);
        sb.append(str2);
        hkq.b("ARanger", "base", sb.toString(), vu3.b.GEO_NOT_SUPPORT);
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfd7aa9", new Object[]{str});
        } else {
            hkq.b("ARanger", abk.FROM_FULL, str, vu3.b.GEO_NOT_SUPPORT);
        }
    }
}
