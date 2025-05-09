package tb;

import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x07 implements fz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31048a;

    public x07() {
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f31048a = true;
        } catch (Exception unused) {
            f31048a = false;
            ALog.e("falco.DefaultFalcoMetrics", "AppMonitor not support.", null, new Object[0]);
        }
    }

    @Override // tb.fz8
    public void a(String str, String str2, Set<String> set, Set<String> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfeab1d", new Object[]{this, str, str2, set, set2});
        } else if (f31048a) {
            try {
                AppMonitor.register(str, str2, MeasureSet.create(set), DimensionSet.create(set2));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.fz8
    public void onCommit(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76ac5b1", new Object[]{this, str, str2, map, map2});
            return;
        }
        try {
            DimensionValueSet create = DimensionValueSet.create();
            create.setMap(map2);
            MeasureValueSet create2 = MeasureValueSet.create();
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                create2.setValue(entry.getKey(), entry.getValue().doubleValue());
            }
            AppMonitor.Stat.commit(str, str2, create, create2);
        } catch (Throwable unused) {
        }
    }
}
