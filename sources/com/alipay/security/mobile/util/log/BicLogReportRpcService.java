package com.alipay.security.mobile.util.log;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipay.security.mobile.util.log.model.BicLogReportRequestPB;
import com.alipay.security.mobile.util.log.model.BicLogReportResponsePB;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface BicLogReportRpcService {
    @OperationType("alipay.bic.log.report")
    @SignCheck
    BicLogReportResponsePB report(BicLogReportRequestPB bicLogReportRequestPB);
}
