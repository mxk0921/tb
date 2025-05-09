package com.alibaba.security.wukong.upload;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.AbstractC1173k;

/* compiled from: Taobao */
@AbstractC1173k(apiName = "mtop.alibaba.client.ccrc.algo.upload")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlgoResultUploadData extends BaseRequest {
    public String algoResultList;
    public boolean encry;
    public long ts;

    public AlgoResultUploadData(String str) {
        super(str);
    }
}
