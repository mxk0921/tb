package com.ta.utdid2.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import com.ta.utdid2.android.utils.StringUtils;
import java.util.zip.Adler32;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Device mDevice = null;
    public static final Object CREATE_DEVICE_METADATA_LOCK = new Object();

    static {
        t2o.a(966787127);
    }

    public static synchronized Device getDevice(Context context) {
        synchronized (DeviceInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Device) ipChange.ipc$dispatch("6049640", new Object[]{context});
            }
            Device device = mDevice;
            if (device != null) {
                return device;
            }
            if (context == null) {
                return null;
            }
            Device initDeviceMetadata = initDeviceMetadata(context);
            mDevice = initDeviceMetadata;
            return initDeviceMetadata;
        }
    }

    public static long getMetadataCheckSum(Device device) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c2cb8e0", new Object[]{device})).longValue();
        }
        if (device == null) {
            return 0L;
        }
        String str = device.getUtdid() + device.getDeviceId() + device.getCreateTimestamp() + device.getImsi() + device.getImei();
        if (StringUtils.isEmpty(str)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        return adler32.getValue();
    }

    private static Device initDeviceMetadata(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Device) ipChange.ipc$dispatch("db4c3ad7", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        synchronized (CREATE_DEVICE_METADATA_LOCK) {
            try {
                String value = UTUtdid.instance(context).getValue();
                if (StringUtils.isEmpty(value)) {
                    return null;
                }
                if (value.endsWith("\n")) {
                    value = value.substring(0, value.length() - 1);
                }
                Device device = new Device();
                long currentTimeMillis = System.currentTimeMillis();
                String imei = PhoneInfoUtils.getImei(context);
                String imsi = PhoneInfoUtils.getImsi(context);
                device.setDeviceId(imei);
                device.setImei(imei);
                device.setCreateTimestamp(currentTimeMillis);
                device.setImsi(imsi);
                device.setUtdid(value);
                device.setCheckSum(getMetadataCheckSum(device));
                return device;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
