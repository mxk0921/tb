package com.zoloz.zhub.common.factor.facade;

import com.alipay.vi.mobile.framework.service.annotation.OperationType;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface HummerGWFacade {
    @OperationType("com.zoloz.zhub.factor.next")
    FactorNextResponse forward(FactorNextRequest factorNextRequest);
}
