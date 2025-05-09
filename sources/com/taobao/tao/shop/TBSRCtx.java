package com.taobao.tao.shop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.mvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum TBSRCtx {
    INSTANCE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IShopRouterMonitor routerMonitor;

    public static /* synthetic */ Object ipc$super(TBSRCtx tBSRCtx, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/TBSRCtx");
    }

    public static void safeMonitor(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae35928", new Object[]{new Integer(i), monitorException});
            return;
        }
        IShopRouterMonitor iShopRouterMonitor = INSTANCE.routerMonitor;
        if (iShopRouterMonitor == null) {
            mvr.a("IShopRouterMonitor has not init !!!");
        } else {
            iShopRouterMonitor.a(i, monitorException);
        }
    }

    public static TBSRCtx valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSRCtx) ipChange.ipc$dispatch("518c5289", new Object[]{str});
        }
        return (TBSRCtx) Enum.valueOf(TBSRCtx.class, str);
    }

    public void setRouterMonitor(IShopRouterMonitor iShopRouterMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9c7f36", new Object[]{this, iShopRouterMonitor});
        } else {
            this.routerMonitor = iShopRouterMonitor;
        }
    }
}
