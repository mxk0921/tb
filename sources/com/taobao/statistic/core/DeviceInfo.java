package com.taobao.statistic.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.t2o;
import tb.w1m;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Device s_device = null;

    static {
        t2o.a(962593132);
    }

    @Deprecated
    public static Device getDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Device) ipChange.ipc$dispatch("49aafc7c", new Object[]{context});
        }
        Device device = s_device;
        if (device != null) {
            return device;
        }
        Device device2 = new Device();
        device2.setImei(w1m.a(context));
        device2.setImsi(w1m.c(context));
        device2.setUdid(UTDevice.getUtdid(context));
        s_device = device2;
        return device2;
    }
}
