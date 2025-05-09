package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopShopRuleVersionedRulesResponse extends BaseOutDo {
    private MtopShopRuleVersionedRulesResponseData data;

    static {
        t2o.a(668991566);
    }

    public void setData(MtopShopRuleVersionedRulesResponseData mtopShopRuleVersionedRulesResponseData) {
        this.data = mtopShopRuleVersionedRulesResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopShopRuleVersionedRulesResponseData getData() {
        return this.data;
    }
}
