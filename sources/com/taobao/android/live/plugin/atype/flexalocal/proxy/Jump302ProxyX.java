package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.cv1;
import tb.rxf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Jump302ProxyX implements IJump302Proxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699611);
        t2o.a(806355172);
    }

    @Override // com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy
    public void jump302(Context context, cv1 cv1Var, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fdc0cc", new Object[]{this, context, cv1Var, tBLiveDataModel});
        } else {
            rxf.a(context, cv1Var, tBLiveDataModel);
        }
    }
}
