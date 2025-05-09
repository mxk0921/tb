package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoWirelessShopRouteProcessResponse extends BaseOutDo {
    private MtopTaobaoWirelessShopRouteProcessResponseData data;

    static {
        t2o.a(668991570);
    }

    public void setData(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        this.data = mtopTaobaoWirelessShopRouteProcessResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessShopRouteProcessResponseData getData() {
        return this.data;
    }
}
