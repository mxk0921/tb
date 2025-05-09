package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4982f5d2", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("page_key", str);
        create.setValue("config_version", String.valueOf(i));
        create.setValue("error_code", str2);
        create.setValue(MUSAppMonitor.ERROR_MSG, str3);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("success", vu3.b.GEO_NOT_SUPPORT);
        AppMonitor.Stat.commit("tbsearch", "roman_preload", create, create2);
    }

    public static void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3772f246", new Object[]{str, new Integer(i)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("page_key", str);
        create.setValue("config_version", String.valueOf(i));
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("success", 1.0d);
        AppMonitor.Stat.commit("tbsearch", "roman_preload", create, create2);
    }

    static {
        t2o.a(993001940);
        AppMonitor.register("tbsearch", "roman_preload", MeasureSet.create(new String[]{"success"}), DimensionSet.create(new String[]{"page_key", "config_version", "error_code", MUSAppMonitor.ERROR_MSG}));
    }
}
