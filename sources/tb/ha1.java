package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ha1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f20495a = new HashMap(2);

    public final synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2d715", new Object[]{this, str});
        } else if (((HashMap) this.f20495a).get(str) == null) {
            ((HashMap) this.f20495a).put(str, Boolean.TRUE);
            AppMonitor.register("applicationInit", str, MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("bundleName").addDimension("applicationName").addDimension("callFrom"));
        }
    }

    public void b(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d6e921", new Object[]{this, str, str2, str3, str4, new Long(j)});
            return;
        }
        a(str);
        AppMonitor.Stat.commit("applicationInit", str, DimensionValueSet.create().setValue("bundleName", str2).setValue("applicationName", str3).setValue("callFrom", str4), MeasureValueSet.create().setValue("cost", j));
    }
}
