package com.alibaba.security.wukong.upload;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.AbstractC1173k;

/* compiled from: Taobao */
@AbstractC1173k(apiName = "mtop.alibaba.client.ccrc.risk.upload")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ClientRiskUploadData extends BaseRequest {
    public String context;
    public String eventId;
    public String extras;
    public String metaId;
    public String riskId;
    public String riskPointIds;
    public String sampleData;
    public String sampleId;
    public String sign;
    public long ts;

    public ClientRiskUploadData(String str) {
        super(str);
    }
}
