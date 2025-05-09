package com.alipay.mobile.common.netsdkextdependapi.network;

import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManagerAdapter;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CustDeviceInfoManager extends DeviceInfoManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CustDeviceInfoManager custDeviceInfoManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1905550839) {
            return super.getImsi();
        }
        if (hashCode == 2142582907) {
            return super.getImei();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/netsdkextdependapi/network/CustDeviceInfoManager");
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        try {
            if (TextUtils.equals(MiscNetUtils.getAppId(), "TAOBAO_AND")) {
                return "";
            }
            return UTDevice.getUtdid(TransportEnvUtil.getContext());
        } catch (Throwable th) {
            LogCatUtil.debug("CustDeviceInfoManager", "getDeviceId ex= " + th.toString());
            return "";
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getImei() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5387b", new Object[]{this});
        }
        return super.getImei();
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManager
    public String getImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e6b9a09", new Object[]{this});
        }
        return super.getImsi();
    }
}
