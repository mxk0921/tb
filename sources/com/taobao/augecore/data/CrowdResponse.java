package com.taobao.augecore.data;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CrowdResponse extends BaseOutDo implements Serializable {
    private CrowdResponseData data;

    public void setData(CrowdResponseData crowdResponseData) {
        this.data = crowdResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public CrowdResponseData getData() {
        return this.data;
    }
}
