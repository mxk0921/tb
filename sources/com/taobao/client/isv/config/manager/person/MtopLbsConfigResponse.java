package com.taobao.client.isv.config.manager.person;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopLbsConfigResponse extends BaseOutDo {
    private Map<String, Map<String, String>> data;

    static {
        t2o.a(789577778);
    }

    public void setData(Map<String, Map<String, String>> map) {
        this.data = map;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Map<String, Map<String, String>> getData() {
        return this.data;
    }
}
