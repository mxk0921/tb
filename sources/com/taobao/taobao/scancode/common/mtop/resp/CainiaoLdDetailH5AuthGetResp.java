package com.taobao.taobao.scancode.common.mtop.resp;

import com.taobao.taobao.scancode.common.mtop.data.CainiaoLdDetailH5AuthGetRespData;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CainiaoLdDetailH5AuthGetResp extends BaseOutDo {
    private CainiaoLdDetailH5AuthGetRespData data;

    static {
        t2o.a(760217647);
    }

    public void setData(CainiaoLdDetailH5AuthGetRespData cainiaoLdDetailH5AuthGetRespData) {
        this.data = cainiaoLdDetailH5AuthGetRespData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public CainiaoLdDetailH5AuthGetRespData getData() {
        return this.data;
    }
}
