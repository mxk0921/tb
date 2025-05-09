package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.openid.device.HonorDeviceIdSupplier;
import com.alibaba.openid.device.HuaweiDeviceIdSupplier;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bi7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(147849227);
    }

    public static izb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (izb) ipChange.ipc$dispatch("3a7acf8e", new Object[0]);
        }
        String str = Build.BRAND;
        shh.a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (dj7.b()) {
            return new HonorDeviceIdSupplier();
        }
        if (dj7.c()) {
            return new HuaweiDeviceIdSupplier();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase(TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE) || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new snx();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new kjw();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase(DeviceProperty.ALIAS_ONEPLUS) || str.equalsIgnoreCase("realme")) {
            return new g7l();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new umg();
        }
        if (str.equalsIgnoreCase(DeviceProperty.ALIAS_NUBIA)) {
            return new eak();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new uqo();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu") || dj7.d()) {
            return new zji();
        }
        return null;
    }
}
