package com.alipay.mobile.common.logging.util;

import android.content.Context;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getUtdid(Context context) {
        try {
            IpChange ipChange = UTDevice.$ipChange;
            return (String) UTDevice.class.getMethod("getUtdid", Context.class).invoke(null, context);
        } catch (Exception unused) {
            return null;
        }
    }
}
