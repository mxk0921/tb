package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b implements IShopRouterMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<IShopRouterMonitor> f12782a = Collections.newSetFromMap(new ConcurrentHashMap());

    static {
        t2o.a(668991595);
        t2o.a(668991590);
    }

    @Override // com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce619d16", new Object[]{this, new Integer(i), monitorException});
            return;
        }
        for (IShopRouterMonitor iShopRouterMonitor : this.f12782a) {
            iShopRouterMonitor.a(i, monitorException);
        }
    }

    public b b(IShopRouterMonitor... iShopRouterMonitorArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1f45d384", new Object[]{this, iShopRouterMonitorArr});
        }
        Collections.addAll(this.f12782a, iShopRouterMonitorArr);
        return this;
    }
}
