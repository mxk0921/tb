package tb;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import tb.jzu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tts$i implements jzu.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857501);
        t2o.a(481296439);
    }

    public tts$i() {
    }

    @Override // tb.jzu.b
    public void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832f4a3", new Object[]{this, str, str2, strArr});
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, TaoInit.access$600(strArr));
        }
    }

    @Override // tb.jzu.b
    public void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e60a0f", new Object[]{this, context, map});
            return;
        }
        if (map == null) {
            map = new ArrayMap<>();
        }
        try {
            map.put("rainbow", URLEncoder.encode(oen.j()));
        } catch (Exception unused) {
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
    }

    @Override // tb.jzu.b
    public void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad60b1c", new Object[]{this, str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4);
        }
    }

    @Override // tb.jzu.b
    public void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebb9d3c", new Object[]{this, str, strArr});
        } else {
            TBS.Adv.ctrlClicked(CT.Button, str, TaoInit.access$600(strArr));
        }
    }

    @Override // tb.jzu.b
    public void e(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5faffb67", new Object[]{this, str, str2, strArr});
            return;
        }
        String[] access$700 = TaoInit.access$700(strArr);
        ArrayMap arrayMap = new ArrayMap();
        if (access$700 != null && access$700.length % 2 == 0) {
            String str3 = null;
            for (String str4 : access$700) {
                if (str3 == null) {
                    if (str4 == null) {
                        str4 = "";
                    }
                    str3 = str4;
                } else {
                    arrayMap.put(str3, str4);
                    str3 = null;
                }
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_Show-" + str2, "", "", arrayMap).build());
    }

    @Override // tb.jzu.b
    public void f(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79ed408", new Object[]{this, str, str2, list});
        } else {
            g(str, str2, list, null);
        }
    }

    @Override // tb.jzu.b
    public void g(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b450f9", new Object[]{this, str, str2, list, list2});
            return;
        }
        MeasureSet create = MeasureSet.create();
        if (list != null && list.size() > 0) {
            for (String str3 : list) {
                create.addMeasure(str3);
            }
        }
        DimensionSet create2 = DimensionSet.create();
        if (list2 != null && list2.size() > 0) {
            for (String str4 : list2) {
                create2.addDimension(str4);
            }
        }
        AppMonitor.register(str, str2, create, create2);
    }

    @Override // tb.jzu.b
    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20b45ef", new Object[]{this, str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2);
        }
    }

    @Override // tb.jzu.b
    public void i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc21ca8", new Object[]{this, context, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
        }
    }

    @Override // tb.jzu.b
    public void j(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f817dcbf", new Object[]{this, str, str2, map, map2});
            return;
        }
        MeasureValueSet create = MeasureValueSet.create();
        for (String str3 : map.keySet()) {
            create.setValue(str3, map.get(str3).doubleValue());
        }
        DimensionValueSet create2 = DimensionValueSet.create();
        for (String str4 : map2.keySet()) {
            create2.setValue(str4, map2.get(str4));
        }
        AppMonitor.Stat.commit(str, str2, create2, create);
    }

    @Override // tb.jzu.b
    public void k(String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6baff0", new Object[]{this, str, str2, new Integer(i), map});
            return;
        }
        if (map == null) {
            map = new ArrayMap<>();
        }
        if (!map.containsKey("rainbow")) {
            map.put("rainbow", URLEncoder.encode(oen.j()));
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str + "-" + str2, "", "", map).build());
    }
}
