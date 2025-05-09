package com.alipay.mobile.common.netsdkextdependapi.deviceinfo;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceInfoManagerAdapter implements DeviceInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mDeviceId = "";

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getAccessPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a134b63", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getAlipayLocaleDes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0c8f801", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getCellInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73cd413", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getClientId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b6a8bd", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mDeviceId)) {
            this.mDeviceId = UUID.randomUUID().toString().replaceAll("-", "");
        }
        return this.mDeviceId;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public DeviceLevelEnum getDevicePerformanceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceLevelEnum) ipChange.ipc$dispatch("9cd8ede3", new Object[]{this});
        }
        return DeviceLevelEnum.HIGH;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public int getDevicePerformanceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ebf4728", new Object[]{this})).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getImei() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5387b", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e6b9a09", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getLatitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f4fa657", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getLongitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16d079a0", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getMobileBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf2af8a", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getMobileModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22c7928", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getRomVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cc8fcdb", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public int getScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public int getScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getSystemVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2d238e6", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getUserAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a235", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getVmType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77d037d2", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public boolean isLowEndDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df92972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public boolean isRooted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48b0f5d6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public boolean reInitDeviceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9358772", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
