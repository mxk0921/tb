package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopBarFrame3;
import com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TopBarProxyX implements ITopBarProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699620);
        t2o.a(806355286);
    }

    @Override // com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy
    public Class<? extends BaseFrame> getTopBarFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("481e3ed2", new Object[]{this});
        }
        return TopBarFrame3.class;
    }
}
