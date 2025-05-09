package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.logger")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class eg extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAInputData f18538a;
        public final /* synthetic */ cg b;

        public a(AURAInputData aURAInputData, cg cgVar) {
            this.f18538a = aURAInputData;
            this.b = cgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.P0(eg.this, this.f18538a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAInputData f18539a;
        public final /* synthetic */ cg b;

        public b(AURAInputData aURAInputData, cg cgVar) {
            this.f18539a = aURAInputData;
            this.b = cgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.P0(eg.this, this.f18539a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yk f18540a;
        public final /* synthetic */ cg b;
        public final /* synthetic */ boolean c;

        public c(yk ykVar, cg cgVar, boolean z) {
            this.f18540a = ykVar;
            this.b = cgVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.Q0(eg.this, this.f18540a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yk f18541a;
        public final /* synthetic */ cg b;
        public final /* synthetic */ boolean c;

        public d(yk ykVar, cg cgVar, boolean z) {
            this.f18541a = ykVar;
            this.b = cgVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.Q0(eg.this, this.f18541a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAInputData f18542a;
        public final /* synthetic */ cg b;

        public e(AURAInputData aURAInputData, cg cgVar) {
            this.f18542a = aURAInputData;
            this.b = cgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.R0(eg.this, this.f18542a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAInputData f18543a;
        public final /* synthetic */ cg b;

        public f(AURAInputData aURAInputData, cg cgVar) {
            this.f18543a = aURAInputData;
            this.b = cgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.R0(eg.this, this.f18543a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yk f18544a;
        public final /* synthetic */ cg b;
        public final /* synthetic */ boolean c;

        public g(yk ykVar, cg cgVar, boolean z) {
            this.f18544a = ykVar;
            this.b = cgVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.S0(eg.this, this.f18544a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yk f18545a;
        public final /* synthetic */ cg b;
        public final /* synthetic */ boolean c;

        public h(yk ykVar, cg cgVar, boolean z) {
            this.f18545a = ykVar;
            this.b = cgVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                eg.S0(eg.this, this.f18545a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(81789149);
    }

    public static /* synthetic */ void P0(eg egVar, AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e0f503", new Object[]{egVar, aURAInputData, cgVar});
        } else {
            egVar.W0(aURAInputData, cgVar);
        }
    }

    public static /* synthetic */ void Q0(eg egVar, yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17475bff", new Object[]{egVar, ykVar, cgVar, new Boolean(z)});
        } else {
            egVar.U0(ykVar, cgVar, z);
        }
    }

    public static /* synthetic */ void R0(eg egVar, AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e75dd85", new Object[]{egVar, aURAInputData, cgVar});
        } else {
            egVar.X0(aURAInputData, cgVar);
        }
    }

    public static /* synthetic */ void S0(eg egVar, yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb499181", new Object[]{egVar, ykVar, cgVar, new Boolean(z)});
        } else {
            egVar.V0(ykVar, cgVar, z);
        }
    }

    public static /* synthetic */ Object ipc$super(eg egVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -25033014:
                super.onCreate((lo) objArr[0], (yi) objArr[1]);
                return null;
            case 148614476:
                super.afterServiceExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 418368253:
                super.afterFlowExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1111077198:
                super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
                return null;
            case 1335413541:
                super.beforeFlowExecute((AURAInputData) objArr[0], (cg) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/logger/AURAAspectLifecycleLoggerExtension");
        }
    }

    public final boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2276bc30", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) M0().h("enableLogAsyncThread", Boolean.class, Boolean.FALSE);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void U0(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ed3ff7", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        try {
            ck.b b2 = ck.b.b();
            b2.l("AURAAspectLifecycleLoggerExtension").i("AURA/workflow").j(cgVar.a()).g("bizName", M0().e()).g("event", "AFTER_FLOW_EXECUTE").g("traceId", (String) ykVar.e().get("aura_trace_id", String.class));
            ck.g().e("beforeFlowExecute", b2.a());
        } catch (Throwable unused) {
        }
    }

    public final void V0(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643c132", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        try {
            ck.b b2 = ck.b.b();
            b2.l("AURAAspectLifecycleLoggerExtension").i("AURA/workflow").g("bizName", M0().e()).j(cgVar.a()).k(cgVar.b()).g("event", "AFTER_SERVICE_EXECUTE");
            if (th.c()) {
                b2.g("traceId", (String) ykVar.e().get("aura_trace_id", String.class)).e("outputData", tj.b(ykVar.b()));
            }
            ck.g().e("beforeFlowExecute", b2.a());
        } catch (Throwable unused) {
        }
    }

    public final void W0(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfa628b", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        try {
            ck.b b2 = ck.b.b();
            b2.l("AURAAspectLifecycleLoggerExtension").i("AURA/workflow").j(cgVar.a()).g("bizName", M0().e()).g("event", "BEFORE_FLOW_EXECUTE");
            if (th.c()) {
                b2.g("traceId", (String) aURAInputData.getFlowData().get("aura_trace_id", String.class)).e("inputData", tj.b(aURAInputData.getData()));
            }
            if (cgVar.b().equals(ri.CODE)) {
                b2.g("eventType", ((JSONObject) JSON.toJSON(aURAInputData.getData())).getString("eventType"));
            }
            ck.g().e("beforeFlowExecute", b2.a());
        } catch (Throwable unused) {
        }
    }

    public final void X0(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0872b48", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        try {
            ck.b b2 = ck.b.b();
            b2.l("AURAAspectLifecycleLoggerExtension").i("AURA/workflow").g("bizName", M0().e()).j(cgVar.a()).k(cgVar.b()).g("event", "BEFORE_SERVICE_EXECUTE");
            if (th.c()) {
                b2.g("traceId", (String) aURAInputData.getFlowData().get("aura_trace_id", String.class)).e("inputData", tj.b(aURAInputData.getData()));
            }
            if (cgVar.b().equals(ri.CODE)) {
                b2.g("eventType", ((JSONObject) JSON.toJSON(aURAInputData.getData())).getString("eventType")).e("inputData", tj.b(aURAInputData.getData()));
            }
            ck.g().e("beforeFlowExecute", b2.a());
        } catch (Throwable unused) {
        }
    }

    @Override // tb.ms, tb.xab
    public void afterFlowExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18efcafd", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(ykVar, cgVar, z);
        if (T0()) {
            dn.h(new c(ykVar, cgVar, z));
        } else {
            dn.f(new d(ykVar, cgVar, z), 0L);
        }
    }

    @Override // tb.ms, tb.xab
    public void afterServiceExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbad4c", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(ykVar, cgVar, z);
        if (T0()) {
            dn.h(new g(ykVar, cgVar, z));
        } else {
            dn.f(new h(ykVar, cgVar, z), 0L);
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeFlowExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f98cb25", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, cgVar);
        if (T0()) {
            dn.h(new a(aURAInputData, cgVar));
        } else {
            dn.f(new b(aURAInputData, cgVar), 0L);
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (T0()) {
            dn.h(new e(aURAInputData, cgVar));
        } else {
            dn.f(new f(aURAInputData, cgVar), 0L);
        }
    }

    @Override // tb.ms, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        ck.j(ul.h());
    }

    @Override // tb.ms, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
