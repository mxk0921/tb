package tb;

import android.app.Application;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.monitor.Monitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p19 implements Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(407896102);
        t2o.a(407896106);
    }

    public p19(Application application) {
        AppMonitor.init(application);
        AppMonitor.register("fast_sp", "fast_sp", MeasureSet.create(), DimensionSet.create().addDimension("spName").addDimension("spFactory").addDimension("spType").addDimension("isFirstLoad").addDimension("functionName").addDimension("duration"));
    }

    @Override // com.taobao.android.boutique.fastsp.monitor.Monitor
    public void commit(String str, String str2, String str3, String str4, String str5, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21ad414", new Object[]{this, str, str2, str3, str4, str5, new Long(j)});
            return;
        }
        try {
            AppMonitor.Stat.commit("fast_sp", "fast_sp", DimensionValueSet.create().setValue("spName", str).setValue("spFactory", str2).setValue("spType", str3).setValue("isFirstLoad", str4).setValue("functionName", str5).setValue("duration", String.valueOf(j)), MeasureValueSet.create());
        } catch (Throwable th) {
            uhh.d(th);
        }
    }
}
