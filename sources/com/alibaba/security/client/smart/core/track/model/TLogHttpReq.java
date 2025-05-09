package com.alibaba.security.client.smart.core.track.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.AbstractC1173k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
@AbstractC1173k(apiName = "mtop.alibaba.ccrc.sdk.logs.report", intercept = true, responseType = Object.class)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TLogHttpReq extends BaseRequest {
    public String logs;
    public long ts = System.currentTimeMillis();
    @JSONField(serialize = false)
    public List<String> ccrcCodes = new ArrayList();

    public TLogHttpReq() {
        super(null);
    }
}
