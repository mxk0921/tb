package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nlo implements rlo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793491);
        t2o.a(993002167);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b915867", new Object[]{this, jSONObject});
        }
    }

    public void b(DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6675519", new Object[]{this, dimensionSet});
            return;
        }
        dimensionSet.addDimension("grayLayerBucket");
        dimensionSet.addDimension("device_level");
        dimensionSet.addDimension("good_price");
        dimensionSet.addDimension("bucket");
    }

    public void c(DimensionValueSet dimensionValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9000eb", new Object[]{this, dimensionValueSet});
            return;
        }
        x0p x0pVar = x0p.INSTANCE;
        dimensionValueSet.setValue("grayLayerBucket", x0pVar.a("grayLayerBucket"));
        String a2 = x0pVar.a("base_optimize");
        if (a2 == null) {
            a2 = "-1";
        }
        dimensionValueSet.setValue("bucket", a2);
        dimensionValueSet.setValue("device_level", ri7.a());
        dimensionValueSet.setValue("good_price", String.valueOf(cvr.INSTANCE.d()));
    }

    public String d(m1p m1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1770252", new Object[]{this, m1pVar});
        }
        if (m1pVar != null) {
            return m1pVar.getTrackingName();
        }
        return "search";
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return zzo.MODULE_NAME;
    }
}
