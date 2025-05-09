package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class br9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE = "FluidSDK";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16566a = false;

    static {
        t2o.a(468713866);
        g();
    }

    public static void a(FluidContext fluidContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f82352e", new Object[]{fluidContext, map});
        } else if (fluidContext != null) {
            map.put("bizName", fluidContext.getInstanceConfig().getBizType());
            map.put(wr9.FLUID_SDK_REMOTE_VERSION, wr9.FLUID_SDK_REMOTE_VERSION_VALUE);
        }
    }

    public static void b(FluidContext fluidContext, ar9 ar9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8852501b", new Object[]{fluidContext, ar9Var, str});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        a(fluidContext, hashMap2);
        hashMap2.put("errorCode", ar9Var.c());
        hashMap2.put("errorMessage", str);
        hashMap2.put("errorArgs", ar9Var.b());
        AppMonitor.Stat.commit("FluidSDK", "FluidException", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.fromStringMap(hashMap));
        ir9.b("FluidFrameworkMonitor", "FluidFrameworkMonitor 上报错误码统计, errorCode = " + ar9Var + ", errorMessage = " + str);
    }

    public static void c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977fdd22", new Object[]{list});
            return;
        }
        list.add(wr9.FLUID_SDK_REMOTE_VERSION);
        list.add("bizName");
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cddd81e7", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c(arrayList2);
        arrayList2.add("errorCode");
        arrayList2.add("errorMessage");
        arrayList2.add("errorArgs");
        AppMonitor.register("FluidSDK", "FluidException", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebdc9d", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("costTime");
        ArrayList arrayList2 = new ArrayList();
        c(arrayList2);
        arrayList2.add(FluidException.OBSERVER_NAME);
        arrayList2.add(FluidException.METHOD_NAME);
        AppMonitor.register("FluidSDK", "FluidObserverProfiler", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d43d3ca", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("costTime");
        ArrayList arrayList2 = new ArrayList();
        c(arrayList2);
        arrayList2.add(FluidException.SERVICE_NAME);
        arrayList2.add(FluidException.METHOD_NAME);
        AppMonitor.register("FluidSDK", "FluidServiceProfiler", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b3809e", new Object[0]);
        } else if (!f16566a) {
            d();
            e();
            f();
            s0j.z();
            s0j.A();
            f16566a = true;
            ir9.b("FluidFrameworkMonitor", "FluidFrameworkMonitor 注册 APP Monitor Stat 成功");
        }
    }
}
