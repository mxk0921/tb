package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class aqr implements ovc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aqr INSTANCE = new aqr();

    @Override // tb.ovc
    public void a(String str, String str2, Set<String> set, Set<String> set2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c1a336", new Object[]{this, str, str2, set, set2, new Boolean(z)});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "monitorPoint");
        ckf.g(set, "measures");
        ckf.g(set2, "dimensions");
        if (!set.isEmpty() && !set2.isEmpty()) {
            MeasureSet create = MeasureSet.create();
            for (String str3 : set) {
                create.addMeasure(new Measure(str3));
            }
            DimensionSet create2 = DimensionSet.create();
            for (String str4 : set2) {
                create2.addDimension(new Dimension(str4));
            }
            AppMonitor.register(str, str2, create, create2, z);
        }
    }

    @Override // tb.ovc
    public void commitFail(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c1ffee", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "monitorPoint");
        AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
    }

    @Override // tb.ovc
    public void commitStat(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d01226", new Object[]{this, str, str2, map, map2});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "monitorPoint");
        ckf.g(map, "dimensionValues");
        ckf.g(map2, "measureValues");
        if (!map.isEmpty()) {
            DimensionValueSet create = DimensionValueSet.create();
            ckf.f(create, "DimensionValueSet.create()");
            for (String str3 : map.keySet()) {
                create.setValue(str3, map.get(str3));
            }
            MeasureValueSet create2 = MeasureValueSet.create();
            ckf.f(create2, "MeasureValueSet.create()");
            for (String str4 : map2.keySet()) {
                Double d = map2.get(str4);
                create2.setValue(str4, d != null ? d.doubleValue() : vu3.b.GEO_NOT_SUPPORT);
            }
            AppMonitor.Stat.commit(str, str2, create, create2);
        }
    }

    @Override // tb.ovc
    public void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "monitorPoint");
        AppMonitor.Alarm.commitSuccess(str, str2, str3);
    }
}
