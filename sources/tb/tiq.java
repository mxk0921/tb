package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217694);
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a6c6", new Object[]{str, new Long(j)});
            return;
        }
        AppMonitor.Stat.commit("TaoBao_ScanCode", "recognitionTime", DimensionValueSet.create().setValue("maType", str), MeasureValueSet.create().setValue("recognitionTime", j));
        gso.c("Monitor:recognitionTime->[recognitionTime]:%s,[maType]:%s", Long.valueOf(j), str);
    }
}
