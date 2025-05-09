package tb;

import android.text.TextUtils;
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
public class pzl implements jjd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_PERMISSION_REQUEST = "PermissionRequest";
    public static final String TAG = "PermRequestReporter";
    public static final String[] proxyName = {"android.app.Fragment.requestPermissions(java.lang.String[],int)", "android.app.Activity.requestPermissions(java.lang.String[],int)"};

    static {
        t2o.a(757071916);
        t2o.a(757071913);
    }

    @Override // tb.jjd
    public boolean b(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f8c14f", new Object[]{this, invocation})).booleanValue();
        }
        for (String str : proxyName) {
            if (TextUtils.equals(invocation.getProxyName(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.jjd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("privacyName");
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
        AppMonitor.register(xhl.MONITOR_MODULE, MONITOR_PERMISSION_REQUEST, create2, create);
    }

    @Override // tb.jjd
    public void a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4675afe", new Object[]{this, invocation});
        } else if (invocation != null) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("privacyName", ((String[]) invocation.args[0])[0]);
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
                InvocationConfig invocationConfig = invocation.invocationConfig;
                if (invocationConfig != null) {
                    create.setValue("ruleID", invocationConfig.getRuleId() + "");
                    create.setValue("strategyID", invocationConfig.matchedStrategyId + "");
                }
                create.setValue("appStartUuid", qhl.d().l());
                create.setValue("stageUuid", qhl.d().j());
                long nanoTime = System.nanoTime();
                long currentTimeMillis = System.currentTimeMillis();
                create.setValue("appStartInterval", (currentTimeMillis - qhl.d().c()) + "");
                create.setValue("switchStageInterval", (currentTimeMillis - qhl.d().e()) + "");
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("invokeTimeCost", (double) invocation.invokeTimeCost);
                create2.setValue("stackTimeCost", (double) invocation.stackTimeCost);
                create2.setValue("basicIncTimeCost", invocation.basicIncTimeCost);
                create2.setValue("fullProxyTimeCost", (nanoTime - invocation.aopStartTime) / 1000);
                AppMonitor.Stat.commit(xhl.MONITOR_MODULE, MONITOR_PERMISSION_REQUEST, create, create2);
                String proxyName2 = invocation.getProxyName();
                String k = qhl.d().k();
                int i = qhl.d().i();
                Log.e(TAG, "report: report request permission, API name: [" + proxyName2 + "], page name: [" + k + "], app stage: [" + i + "]");
            } catch (Throwable th) {
                Log.e(TAG, "report: occur error when report PermissionRequestReporter! ");
                th.printStackTrace();
            }
        }
    }
}
