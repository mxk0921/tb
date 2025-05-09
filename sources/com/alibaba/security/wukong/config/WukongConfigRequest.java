package com.alibaba.security.wukong.config;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.AbstractC1173k;

/* compiled from: Taobao */
@AbstractC1173k(apiName = "mtop.alibaba.client.ccrc.fetchConfig", intercept = false, responseType = WukongConfigData.class)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongConfigRequest extends BaseRequest {
    public String configMd5;
    public boolean isTest;
    public long ts;

    public WukongConfigRequest(String str) {
        super(str);
    }
}
