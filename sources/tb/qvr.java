package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import tb.jts;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nvd f26960a;

    static {
        t2o.a(668991597);
    }

    public void a(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b373f5a", new Object[]{this, mtopTaobaoWirelessShopRouteProcessResponseData, str});
        } else if (this.f26960a != null) {
            if (ShopConstants.V_SHOP_RULESET_SHOP.equals(str) || ShopConstants.V_SHOP_RULESET_PERSONAL.equals(str)) {
                ((jts.c) this.f26960a).a(mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl(), mtopTaobaoWirelessShopRouteProcessResponseData.getSellerId(), Boolean.parseBoolean(mtopTaobaoWirelessShopRouteProcessResponseData.getIsTmall()));
            }
        }
    }

    public void b(nvd nvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8bac04", new Object[]{this, nvdVar});
        } else {
            this.f26960a = nvdVar;
        }
    }
}
