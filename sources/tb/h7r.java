package tb;

import android.app.Application;
import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceInfo;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.orientation.FoldPosture;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h7r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEVICE_BRAND = "device_brand";
    public static final String DEVICE_MODEL = "device_model";
    public static final String DEVICE_TYPE = "device_type";
    public static final String MANUFACTURER = "manufacture";

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322787bb", new Object[]{application});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue(DEVICE_BRAND, Build.BRAND);
        create.setValue(DEVICE_MODEL, Build.MODEL);
        create.setValue(MANUFACTURER, Build.MANUFACTURER.toLowerCase());
        create.setValue(DEVICE_TYPE, TBDeviceInfo.b(TBDeviceInfo.a(application)));
        create.setValue("support_hinge_angle_sensor", String.valueOf(xxa.g().h()));
        create.setValue("easygo_opened", String.valueOf(TBDeviceUtils.D(TBAutoSizeConfig.x().y())));
        create.setValue("is_in_multi_window_mode", String.valueOf(TBDeviceUtils.E(TBAutoSizeConfig.x().y())));
        if (TBDeviceUtils.P(application)) {
            create.setValue("type_from_manufacture", String.valueOf(TBDeviceUtils.R(application)));
            create.setValue("type_from_system_properties", String.valueOf(TBDeviceUtils.S()));
            create.setValue("type_from_layout", String.valueOf(TBDeviceUtils.Q(application)));
        }
        create.setValue("characteristics", a());
        create.setValue("foldStatus", FoldPosture.f(TBDeviceUtils.a(application)));
        create.setValue("isPortraitLayout", String.valueOf(TBAutoSizeConfig.x().T(application)));
        AppMonitor.Stat.commit("auto_size", "auto_size_pv", create, MeasureValueSet.create());
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[0]);
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension(DEVICE_BRAND);
        create.addDimension(DEVICE_MODEL);
        create.addDimension(DEVICE_TYPE);
        create.addDimension(MANUFACTURER);
        create.addDimension("support_hinge_angle_sensor");
        create.addDimension("easygo_opened");
        create.addDimension("is_in_multi_window_mode");
        create.addDimension("type_from_manufacture");
        create.addDimension("type_from_system_properties");
        create.addDimension("type_from_layout");
        create.addDimension("characteristics");
        create.addDimension("foldStatus");
        create.addDimension("isPortraitLayout");
        AppMonitor.register("auto_size", "auto_size_pv", MeasureSet.create(), create);
    }

    public static String a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, "ro.build.characteristics");
        } catch (Exception unused) {
            return "";
        }
    }
}
