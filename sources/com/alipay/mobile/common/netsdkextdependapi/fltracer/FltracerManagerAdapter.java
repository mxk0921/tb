package com.alipay.mobile.common.netsdkextdependapi.fltracer;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FltracerManagerAdapter implements FltracerManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.fltracer.FltracerManager
    public void reportException(FLExceptionModel fLExceptionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c461193a", new Object[]{this, fLExceptionModel});
        }
    }
}
