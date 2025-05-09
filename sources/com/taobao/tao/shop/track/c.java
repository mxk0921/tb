package com.taobao.tao.shop.track;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.iiz;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c implements IShopRouterMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f12783a = 0;

    static {
        t2o.a(668991596);
        t2o.a(668991590);
    }

    @Override // com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce619d16", new Object[]{this, new Integer(i), monitorException});
            return;
        }
        switch (i) {
            case 1000:
                AppMonitor.Counter.commit("shop_router", "cache-hit", "hit", 1.0d);
                return;
            case 1001:
                AppMonitor.Counter.commit("shop_router", "cache-hit", iiz.PERF_STAG_TOTAL, 1.0d);
                return;
            case 1002:
                this.f12783a = System.currentTimeMillis();
                return;
            case 1003:
                c(this.f12783a);
                return;
            case 1004:
                b("cache", null);
                return;
            case 1005:
                b("cache", monitorException);
                return;
            case 1006:
                b("mtop-process", null);
                return;
            case 1007:
                b("mtop-process", monitorException);
                return;
            default:
                return;
        }
    }

    public final void b(String str, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5946890b", new Object[]{this, str, monitorException});
        } else if (monitorException == null) {
            AppMonitor.Alarm.commitSuccess("shop_router", str);
        } else {
            AppMonitor.Alarm.commitFail("shop_router", str, monitorException.getErrorCode(), monitorException.getErrorMsg());
        }
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0856c9", new Object[]{this, new Long(j)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("type", "mtop_process");
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("cost", System.currentTimeMillis() - j);
        AppMonitor.Stat.commit("shop_router", "cost", create, create2);
    }
}
