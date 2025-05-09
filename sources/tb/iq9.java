package tb;

import android.os.Process;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_OUTGOING_AUTHORIZED = "mgr_flow_lost_fly";
    public static final String ARG1_OUTGOING_BLOCKED = "mgr_flow_lost_handle";
    public static final int EVENT_ID_19999 = 19999;
    public static final String MGR_FLOW_BROWSER_FLY = "mgr_flow_browser_fly";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f21504a = new AtomicBoolean(false);

    static {
        t2o.a(744489077);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcde243", new Object[0]);
            return;
        }
        MeasureSet create = MeasureSet.create();
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("pageName");
        create2.addDimension("pageUrl");
        create2.addDimension(rg0.JUMP_URL);
        create2.addDimension("openTimestamp");
        create2.addDimension("jumpTimestamp");
        create2.addDimension("processId");
        create2.addDimension("sampleId");
        create2.addDimension("isRisk");
        create.addMeasure("riskCost");
        AppMonitor.register("tbFlowCustoms", "flowoutSC", create, create2, false);
    }

    public static void b(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a31a345", new Object[]{new Integer(i), str, str2, str3, map});
            return;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(ah0.PAGE_FLOWCUSTOMS, i, str, str2, str3, map);
        vp9.a("linkx", "eventId: " + i + "  arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + "  properties: " + map);
        ah0.g(str, uTOriginalCustomHitBuilder.build());
    }

    public static void c(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dc7a3a", new Object[]{new Integer(i), str, map});
        } else {
            b(i, str, null, null, map);
        }
    }

    public static void d(pp9 pp9Var, String str, long j, boolean z, long j2, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5577b228", new Object[]{pp9Var, str, new Long(j), new Boolean(z), new Long(j2), str2});
            return;
        }
        if (f21504a.compareAndSet(false, true)) {
            a();
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("pageName", pp9Var.f26224a);
        create.setValue("pageUrl", pp9Var.b);
        create.setValue(rg0.JUMP_URL, str);
        create.setValue("openTimestamp", String.valueOf(pp9Var.c));
        create.setValue("jumpTimestamp", String.valueOf(j));
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        create.setValue("isRisk", str3);
        create.setValue("processId", String.valueOf(Process.myPid()));
        create.setValue("sampleId", str2);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("riskCost", j2);
        AppMonitor.Stat.commit("tbFlowCustoms", "flowoutSC", create, create2);
    }
}
