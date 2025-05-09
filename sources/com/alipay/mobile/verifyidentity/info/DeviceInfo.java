package com.alipay.mobile.verifyidentity.info;

import android.content.Context;
import android.os.Build;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getMobileBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf2af8a", new Object[0]);
        }
        return Build.BRAND;
    }

    public static String getMobileManufacturer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47e3e710", new Object[0]);
        }
        return Build.MANUFACTURER;
    }

    public static String getMobileModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22c7928", new Object[0]);
        }
        return Build.MODEL;
    }

    public static String getOsVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f114e1b", new Object[0]);
        }
        return Build.VERSION.RELEASE;
    }

    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.ut.device.UTDevice", "getUtdid", new Class[]{Context.class}, new Object[]{context});
        VerifyLogCat.i("DeviceInfo", "getUtdid: " + invokeStaticMethod);
        if (invokeStaticMethod == null) {
            return "";
        }
        return (String) invokeStaticMethod;
    }
}
