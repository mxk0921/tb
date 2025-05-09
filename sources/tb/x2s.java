package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x2s implements vgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092395);
        t2o.a(806355946);
    }

    @Override // tb.vgb
    public void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37574d54", new Object[]{this, str, str2, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, d);
        }
    }

    @Override // tb.vgb
    public void b(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea03b232", new Object[]{this, str, str2, map, map2});
        } else {
            AppMonitor.Stat.commit(str, str2, DimensionValueSet.fromStringMap(map), MeasureValueSet.create(map2));
        }
    }

    @Override // tb.vgb
    public void c(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cda834a", new Object[]{this, str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    @Override // tb.vgb
    public void commitFail(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{this, str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4);
        }
    }

    @Override // tb.vgb
    public void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    @Override // tb.vgb
    public void register(String str, String str2, List<szi> list, List<ezi> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e171a0", new Object[]{this, str, str2, list, list2});
            return;
        }
        MeasureSet create = MeasureSet.create();
        if (list != null) {
            for (szi sziVar : list) {
                create.addMeasure(new Measure(sziVar.f28372a, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT)));
            }
        }
        DimensionSet create2 = DimensionSet.create();
        if (list2 != null) {
            for (ezi eziVar : list2) {
                create2.addDimension(new Dimension(eziVar.f18904a, eziVar.b));
            }
        }
        AppMonitor.register(str, str2, create, create2);
    }

    @Override // tb.vgb
    public void commitFail(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c1ffee", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    @Override // tb.vgb
    public void commitSuccess(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{this, str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2);
        }
    }
}
