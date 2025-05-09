package tb;

import android.content.Context;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.FlowCenter;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wmv implements y6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f30784a = new AtomicBoolean(true);

    @Override // tb.y6e
    public void onRegister(String str, String str2, Set<String> set, Set<String> set2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d76b57", new Object[]{this, str, str2, set, set2, new Boolean(z)});
            return;
        }
        try {
            AppMonitor.register(str, str2, MeasureSet.create(set), DimensionSet.create(set2), z);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.y6e
    public void onCommit(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        AtomicBoolean atomicBoolean = this.f30784a;
        try {
            if (atomicBoolean.get()) {
                Double d = map.get("upstream");
                Double d2 = map.get("downstream");
                if (d == null) {
                    d = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                }
                if (d2 == null) {
                    d2 = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                }
                IpChange ipChange = FlowCenter.$ipChange;
                Method method = FlowCenter.class.getMethod("getInstance", new Class[0]);
                Class cls = Long.TYPE;
                FlowCenter.class.getMethod("commitFlow", Context.class, String.class, Boolean.TYPE, String.class, cls, cls).invoke(method.invoke(FlowCenter.class, new Object[0]), pmv.d, "arup", Boolean.FALSE, "arup", Long.valueOf(d.longValue()), Long.valueOf(d2.longValue()));
            }
        } catch (Throwable th) {
            if ((th instanceof ClassNotFoundException) || (th instanceof NoSuchMethodException)) {
                atomicBoolean.compareAndSet(true, false);
            } else {
                th.printStackTrace();
            }
        }
        try {
            DimensionValueSet create = DimensionValueSet.create();
            create.setMap(map2);
            MeasureValueSet create2 = MeasureValueSet.create();
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                create2.setValue(entry.getKey(), entry.getValue().doubleValue());
            }
            AppMonitor.Stat.commit(str, str2, create, create2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
