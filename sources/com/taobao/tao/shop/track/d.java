package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.pdv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991598);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -832463594) {
            super.a(((Number) objArr[0]).intValue(), (IShopRouterMonitor.MonitorException) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/track/TBSRUmbrellaMonitor");
    }

    @Override // com.taobao.tao.shop.track.a, com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce619d16", new Object[]{this, new Integer(i), monitorException});
            return;
        }
        super.a(i, monitorException);
        if (i == 1005) {
            b("dowloadCache", "dowloadCache", monitorException);
        } else if (i == 1004) {
            b("dowloadCache", "dowloadCache", null);
        } else if (i == 1007) {
            b("mtop.taobao.wireless.shop.route.process", "mtop-process", monitorException);
        } else if (i == 1006) {
            b("mtop.taobao.wireless.shop.route.process", "mtop-process", null);
        }
    }

    public final void b(String str, String str2, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce7e4ca", new Object[]{this, str, str2, monitorException});
        } else if (monitorException != null && monitorException.getErrorParam() != null && !"-10901".equals(monitorException.getErrorCode()) && !"-10902".equals(monitorException.getErrorCode())) {
            pdv.a(str2, str, monitorException.getErrorParam(), monitorException.getErrorCode(), monitorException.getErrorMsg());
        } else if (monitorException == null || "-10901".equals(monitorException.getErrorCode()) || "-10902".equals(monitorException.getErrorCode())) {
            pdv.b(str2, str, null);
        } else {
            pdv.a(str2, str, monitorException.getErrorParam(), monitorException.getErrorCode(), monitorException.getErrorMsg());
        }
    }
}
