package tb;

import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.canvas.launch_step.TMSGameStopServiceStep;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pas extends a9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public TMSBaseLaunchStep e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666503);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            JSONObject jSONObject;
            String string;
            JSONObject jSONObject2;
            String string2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject a2 = jrVar.a();
                if (!(a2 == null || (jSONObject2 = a2.getJSONObject("data")) == null || (string2 = jSONObject2.getString("value")) == null)) {
                    pas.o(pas.this).S().a("memoryUsageLaunchStart", string2);
                }
                JSONObject a3 = jrVar.a();
                if (a3 != null && (jSONObject = a3.getJSONObject("data")) != null && (string = jSONObject.getString("nativeMemorySize")) != null) {
                    pas.o(pas.this).S().a("nativeMemoryUsageLaunchStart", string);
                }
            }
        }
    }

    static {
        t2o.a(834666502);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pas(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static /* synthetic */ Object ipc$super(pas pasVar, String str, Object... objArr) {
        if (str.hashCode() == -2016635603) {
            super.a((lwd) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/TMSGameLauncher");
    }

    public static final /* synthetic */ bbs o(pas pasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("d3877b08", new Object[]{pasVar});
        }
        return pasVar.c;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9616946e", new Object[]{this});
            return;
        }
        bbs bbsVar = this.c;
        if (bbsVar != null && bbsVar.I() != null) {
            Object b2 = p8s.b(IUserTrackerAdapter.class);
            ckf.d(b2);
            ((IUserTrackerAdapter) b2).updatePageProperties(this.c.I(), jes.c(this.c));
            Object b3 = p8s.b(IUserTrackerAdapter.class);
            ckf.d(b3);
            ((IUserTrackerAdapter) b3).updatePageUtParam(this.c.I(), jes.d(this.c));
            Object b4 = p8s.b(IUserTrackerAdapter.class);
            ckf.d(b4);
            ((IUserTrackerAdapter) b4).updatePageName(this.c.I(), jes.a(this.c));
            Object b5 = p8s.b(IUserTrackerAdapter.class);
            ckf.d(b5);
            ((IUserTrackerAdapter) b5).updatePageUrl(this.c.I(), this.c.e0());
        }
    }

    @Override // tb.a9s, tb.owd
    public void a(lwd lwdVar) {
        TMSBaseLaunchStep tMSBaseLaunchStep;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
            return;
        }
        ckf.g(lwdVar, DataReceiveMonitor.CB_LISTENER);
        super.a(lwdVar);
        E();
        q();
        IBizLaunchAdapter iBizLaunchAdapter = (IBizLaunchAdapter) p8s.b(IBizLaunchAdapter.class);
        if (iBizLaunchAdapter != null) {
            bbs bbsVar = this.c;
            ckf.f(bbsVar, "mInstance");
            tMSBaseLaunchStep = iBizLaunchAdapter.createBizLaunchStep(bbsVar, this);
        } else {
            tMSBaseLaunchStep = null;
        }
        s8s s8sVar = new s8s(this.c, this);
        this.e = s8sVar;
        if (tMSBaseLaunchStep != null) {
            s8sVar.j(tMSBaseLaunchStep);
            this.e = tMSBaseLaunchStep;
        }
        TMSBaseLaunchStep tMSBaseLaunchStep2 = this.e;
        ckf.d(tMSBaseLaunchStep2);
        bbs bbsVar2 = this.c;
        ckf.f(bbsVar2, "mInstance");
        this.e = tMSBaseLaunchStep2.j(new TMSGameStopServiceStep(bbsVar2, this));
        s8sVar.a();
    }

    public final TMSBaseLaunchStep p(TMSBaseLaunchStep tMSBaseLaunchStep) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseLaunchStep) ipChange.ipc$dispatch("d912c856", new Object[]{this, tMSBaseLaunchStep});
        }
        ckf.g(tMSBaseLaunchStep, tl.KEY_STEP);
        TMSBaseLaunchStep tMSBaseLaunchStep2 = this.e;
        TMSBaseLaunchStep j = tMSBaseLaunchStep2 == null ? null : tMSBaseLaunchStep2.j(tMSBaseLaunchStep);
        this.e = j;
        ckf.d(j);
        return j;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ee9efe", new Object[]{this});
            return;
        }
        k8s j = k8s.j();
        bbs bbsVar = this.c;
        ckf.f(bbsVar, "mInstance");
        j.d(bbsVar, "canvas", TMSInstanceExtKt.g(bbsVar), null, "performance", PerformanceAbility.API_GET_MEMORY_INFO, new JSONObject(), new b());
    }
}
