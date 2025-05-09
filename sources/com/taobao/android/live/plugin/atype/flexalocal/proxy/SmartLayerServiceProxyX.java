package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import tb.t2o;
import tb.u6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLayerServiceProxyX implements ISmartLayerServiceProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699618);
        t2o.a(806355256);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy
    public ISmartLayerServiceProxy.a getSmartLayerService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLayerServiceProxy.a) ipChange.ipc$dispatch("b5a091ef", new Object[]{this});
        }
        return new u6q();
    }
}
