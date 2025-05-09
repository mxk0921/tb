package com.alipay.mobile.common.netsdkextdependapi.beaninfo;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BeanInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final String getBeanClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acb07cf2", new Object[]{str});
        }
        return BeanInfoManagerFactory.getInstance().getDefaultBean().getBeanClassName(str);
    }
}
