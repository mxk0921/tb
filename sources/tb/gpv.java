package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.report.ReportType;
import com.android.taobao.aop.report.ResModel;
import com.taobao.accs.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gpv f20157a = new gpv();

        static {
            t2o.a(497025036);
        }

        public static /* synthetic */ gpv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gpv) ipChange.ipc$dispatch("46f5b7a1", new Object[0]);
            }
            return f20157a;
        }
    }

    public static gpv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gpv) ipChange.ipc$dispatch("e8e84cbc", new Object[0]);
        }
        return b.a();
    }

    public void b(ReportType reportType, ResModel resModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767f6977", new Object[]{this, reportType, resModel, new Integer(i)});
            return;
        }
        String name = reportType.name();
        String jSONString = JSON.toJSONString(resModel);
        Log.e("UsageReporter", name + jSONString + "->" + i);
        if (reportType.name().equals("RESOURCE")) {
            DimensionValueSet value = DimensionValueSet.create().setValue("packageName", resModel.packageName);
            AppMonitor.Stat.commit("ResourceUsage", Constants.SEND_TYPE_RES, value.setValue("resValue", resModel.resType + "/" + resModel.resName + "=" + i), MeasureValueSet.create());
        }
    }

    public gpv() {
    }

    static {
        t2o.a(497025034);
        t2o.a(497025031);
        AppMonitor.register("ResourceUsage", Constants.SEND_TYPE_RES, MeasureSet.create(), DimensionSet.create().addDimension("packageName").addDimension("resValue"));
    }
}
