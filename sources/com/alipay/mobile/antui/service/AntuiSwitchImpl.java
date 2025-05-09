package com.alipay.mobile.antui.service;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AntuiSwitchImpl implements IAntuiSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.antui.service.IAntuiSwitch
    public String getConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        return null;
    }
}
