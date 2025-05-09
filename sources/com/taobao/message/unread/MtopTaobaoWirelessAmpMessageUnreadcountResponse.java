package com.taobao.message.unread;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmpMessageUnreadcountResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmpMessageUnreadcountResponseData data;

    static {
        t2o.a(530579500);
    }

    public void setData(MtopTaobaoWirelessAmpMessageUnreadcountResponseData mtopTaobaoWirelessAmpMessageUnreadcountResponseData) {
        this.data = mtopTaobaoWirelessAmpMessageUnreadcountResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessAmpMessageUnreadcountResponseData getData() {
        return this.data;
    }
}
