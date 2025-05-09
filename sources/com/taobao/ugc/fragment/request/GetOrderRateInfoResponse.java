package com.taobao.ugc.fragment.request;

import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/ugc/fragment/request/GetOrderRateInfoResponse;", "Lmtopsdk/mtop/domain/BaseOutDo;", "<init>", "()V", "Lcom/taobao/ugc/fragment/request/OrderRateInfoData;", "data", "Ltb/xhv;", "setData", "(Lcom/taobao/ugc/fragment/request/OrderRateInfoData;)V", "getData", "()Lcom/taobao/ugc/fragment/request/OrderRateInfoData;", "taobaoOrderRateInfoData", "Lcom/taobao/ugc/fragment/request/OrderRateInfoData;", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class GetOrderRateInfoResponse extends BaseOutDo {
    private OrderRateInfoData taobaoOrderRateInfoData;

    static {
        t2o.a(758120553);
    }

    public final void setData(OrderRateInfoData orderRateInfoData) {
        this.taobaoOrderRateInfoData = orderRateInfoData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public OrderRateInfoData getData() {
        OrderRateInfoData orderRateInfoData = this.taobaoOrderRateInfoData;
        ckf.d(orderRateInfoData);
        return orderRateInfoData;
    }
}
