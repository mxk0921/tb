package com.taobao.infoflow.protocol.subservice.biz.afterbuy;

import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.arb;
import tb.lrj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IAfterBuyStayTimeService extends ISubService {
    public static final String SERVICE_NAME = "IAfterBuyStayTime";

    void onScrolledByNestedParentEach(lrj lrjVar);

    void updateContainerType(arb arbVar);
}
