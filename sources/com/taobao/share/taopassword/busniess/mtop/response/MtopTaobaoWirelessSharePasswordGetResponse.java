package com.taobao.share.taopassword.busniess.mtop.response;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoWirelessSharePasswordGetResponse extends BaseOutDo {
    private Map<String, String> data;

    static {
        t2o.a(665845889);
    }

    public void setData(Map<String, String> map) {
        this.data = map;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Map<String, String> getData() {
        return this.data;
    }
}
