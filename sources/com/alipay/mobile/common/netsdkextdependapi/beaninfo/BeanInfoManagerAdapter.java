package com.alipay.mobile.common.netsdkextdependapi.beaninfo;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BeanInfoManagerAdapter implements BeanInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.beaninfo.BeanInfoManager
    public String getBeanClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acb07cf2", new Object[]{this, str});
        }
        return "";
    }
}
