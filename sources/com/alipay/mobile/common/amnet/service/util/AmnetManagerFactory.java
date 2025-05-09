package com.alipay.mobile.common.amnet.service.util;

import com.alipay.mobile.common.amnet.api.AmnetManager;
import com.alipay.mobile.common.amnet.api.AmnetManagerBeanFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetManagerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated
    public static final AmnetManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("91a27906", new Object[0]);
        }
        return AmnetManagerBeanFactory.getSingletonAmnetManager();
    }
}
