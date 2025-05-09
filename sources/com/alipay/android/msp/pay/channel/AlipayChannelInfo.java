package com.alipay.android.msp.pay.channel;

import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayChannelInfo implements IChannelInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "com.alipay.quickpay";
    }

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        return "2013120400002258";
    }

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public void initChannelSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbeaa6e", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public boolean isEnableGuideWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c24f18a", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
