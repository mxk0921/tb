package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m71 implements wgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267913);
        t2o.a(503316574);
    }

    @Override // tb.wgb
    public void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        MeasureValueSet measureValueSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710c8ea6", new Object[]{this, str, str2, map, map2});
            return;
        }
        DimensionValueSet dimensionValueSet = null;
        if (map != null) {
            measureValueSet = MeasureValueSet.create(map);
        } else {
            measureValueSet = null;
        }
        if (map2 != null) {
            dimensionValueSet = DimensionValueSet.fromStringMap(map2);
        }
        AppMonitor.Stat.commit(str, str2, dimensionValueSet, measureValueSet);
    }

    @Override // tb.wgb
    public void b(String str, String str2, List<String> list, List<String> list2, boolean z) {
        MeasureSet measureSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2bf76c0", new Object[]{this, str, str2, list, list2, new Boolean(z)});
            return;
        }
        DimensionSet dimensionSet = null;
        if (list != null) {
            measureSet = MeasureSet.create(list);
        } else {
            measureSet = null;
        }
        if (list2 != null) {
            dimensionSet = DimensionSet.create(list2);
        }
        AppMonitor.register(str, str2, measureSet, dimensionSet);
    }
}
