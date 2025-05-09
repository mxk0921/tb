package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements IShopRouterMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991594);
        t2o.a(668991590);
    }

    @Override // com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce619d16", new Object[]{this, new Integer(i), monitorException});
        }
    }
}
