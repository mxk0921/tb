package tb;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.alibaba.wireless.security.aopsdk.InvocationConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class skf implements jjd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_AOP_Bridge = "invocation";
    public static final String TAG = "InvocationReporter";

    static {
        t2o.a(757071914);
        t2o.a(757071913);
    }

    @Override // tb.jjd
    public void a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4675afe", new Object[]{this, invocation});
        } else if (invocation == null) {
            Log.e(TAG, "report: invocation is empty!");
        } else {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("apiName", invocation.getProxyName());
                create.setValue("className", invocation.methodInfo);
                create.setValue("params", qhl.d().f(invocation));
                Object obj = invocation.thiz;
                if (obj != null) {
                    create.setValue("th", obj.toString());
                }
                create.setValue("pageName", qhl.d().k());
                create.setValue("pageUrl", qhl.d().g());
                create.setValue("appStage", qhl.d().i() + "");
                create.setValue(pg1.ATOM_stack, qhl.h(invocation));
                create.setValue("appStartUuid", qhl.d().l());
                create.setValue("stageUuid", qhl.d().j());
                InvocationConfig invocationConfig = invocation.invocationConfig;
                if (invocationConfig != null) {
                    create.setValue("ruleID", invocationConfig.getRuleId() + "");
                    create.setValue("strategyID", invocationConfig.matchedStrategyId + "");
                }
                long nanoTime = System.nanoTime();
                long currentTimeMillis = System.currentTimeMillis();
                create.setValue("appStartInterval", (currentTimeMillis - qhl.d().c()) + "");
                create.setValue("switchStageInterval", (currentTimeMillis - qhl.d().e()) + "");
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("invokeTimeCost", (double) invocation.invokeTimeCost);
                create2.setValue("stackTimeCost", (double) invocation.stackTimeCost);
                create2.setValue("basicIncTimeCost", invocation.basicIncTimeCost);
                create2.setValue("fullProxyTimeCost", (nanoTime - invocation.aopStartTime) / 1000);
                AppMonitor.Stat.commit(xhl.MONITOR_MODULE, MONITOR_AOP_Bridge, create, create2);
                String proxyName = invocation.getProxyName();
                String k = qhl.d().k();
                int i = qhl.d().i();
                Log.e(TAG, "report: report invocation info, API name: [" + proxyName + "], page name: [" + k + "], app stage: [" + i + "]");
            } catch (Throwable th) {
                Log.e(TAG, "report: occur error when report invocation info!");
                th.printStackTrace();
            }
        }
    }

    @Override // tb.jjd
    public boolean b(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f8c14f", new Object[]{this, invocation})).booleanValue();
        }
        return true;
    }

    @Override // tb.jjd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("apiName");
        create.addDimension("className");
        create.addDimension("params");
        create.addDimension("th");
        create.addDimension("pageName");
        create.addDimension("pageUrl");
        create.addDimension("appStage");
        create.addDimension(pg1.ATOM_stack);
        create.addDimension("ruleID");
        create.addDimension("strategyID");
        create.addDimension("appStartUuid");
        create.addDimension("stageUuid");
        create.addDimension("appStartInterval");
        create.addDimension("switchStageInterval");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("invokeTimeCost");
        create2.addMeasure("stackTimeCost");
        create2.addMeasure("basicIncTimeCost");
        create2.addMeasure("fullProxyTimeCost");
        AppMonitor.register(xhl.MONITOR_MODULE, MONITOR_AOP_Bridge, create2, create);
    }
}
