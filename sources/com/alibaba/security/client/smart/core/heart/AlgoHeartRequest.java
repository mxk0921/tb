package com.alibaba.security.client.smart.core.heart;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.AbstractC1173k;

/* compiled from: Taobao */
@AbstractC1173k(apiName = "mtop.alibaba.ccrc.sdk.heartbeat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlgoHeartRequest extends BaseRequest {
    public String algoList;
    public String dataId;
    public long ts;

    public AlgoHeartRequest(String str) {
        super(str);
    }
}
