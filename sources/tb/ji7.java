package tb;

import android.app.Application;
import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ji7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0ebe61", new Object[]{application});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue(h7r.DEVICE_BRAND, Build.BRAND);
        create.setValue(h7r.DEVICE_MODEL, Build.MODEL);
        create.setValue(h7r.DEVICE_TYPE, TBDeviceInfo.b(TBDeviceInfo.a(application)));
        AppMonitor.Stat.commit("auto_size", "auto_size_device_info", create, MeasureValueSet.create());
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[0]);
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension(h7r.DEVICE_BRAND);
        create.addDimension(h7r.DEVICE_MODEL);
        create.addDimension(h7r.DEVICE_TYPE);
        AppMonitor.register("auto_size", "auto_size_device_info", MeasureSet.create(), create);
    }
}
