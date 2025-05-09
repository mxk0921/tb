package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.nav.TaoLiveActionUtils;
import com.taobao.android.live.plugin.proxy.taoliveactionutils.ITaoLiveActionUtilsProxy;
import tb.geb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveActionUtilsProxyX implements ITaoLiveActionUtilsProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699619);
        t2o.a(806355264);
    }

    @Override // com.taobao.android.live.plugin.proxy.taoliveactionutils.ITaoLiveActionUtilsProxy
    public geb newActionUtils() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (geb) ipChange.ipc$dispatch("86f88612", new Object[]{this});
        }
        return new TaoLiveActionUtils();
    }
}
