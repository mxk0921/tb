package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a0p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POINT_NAME = "SearchEnter";

    /* renamed from: a  reason: collision with root package name */
    public static MeasureValueSet f15469a;
    public static boolean b;
    public static boolean c = false;

    static {
        t2o.a(815792224);
    }

    public static void a(String str) {
        MeasureValueSet measureValueSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f003de7a", new Object[]{str});
        } else if (b && (measureValueSet = f15469a) != null) {
            measureValueSet.setValue(str, MeasureValue.create(System.currentTimeMillis()));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        if (!c) {
            c = true;
            MeasureSet create = MeasureSet.create();
            create.addMeasure("whole");
            create.addMeasure("network");
            create.addMeasure("parseData");
            create.addMeasure("uiShown");
            DimensionSet create2 = DimensionSet.create();
            create2.addDimension("mtopSource");
            AppMonitor.register(zzo.MODULE_NAME, POINT_NAME, create, create2);
        }
        DimensionValueSet.create();
        f15469a = MeasureValueSet.create();
    }

    public static void c(String str, long j) {
        MeasureValueSet measureValueSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f003b1", new Object[]{str, new Long(j)});
        } else if (b && (measureValueSet = f15469a) != null) {
            measureValueSet.setValue(str, j);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d47e5b", new Object[0]);
            return;
        }
        b = true;
        b();
    }
}
