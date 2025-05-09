package com.alipay.android.msp.core.callback;

import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.dipatchers.Call;
import com.alipay.android.msp.drivers.dipatchers.Callback;
import com.alipay.android.msp.drivers.dipatchers.MspResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetActionCallback implements Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NetActionCallback(MspContext mspContext) {
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Callback
    public void onFailure(Call call, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf48ae4f", new Object[]{this, call, exc});
        }
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Callback
    public void onResponse(Call call, MspResponse mspResponse) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e8ab36", new Object[]{this, call, mspResponse});
        }
    }
}
