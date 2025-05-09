package com.taobao.android.interactive_common.model;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BeehiveDetailResponse extends BaseOutDo {
    private Map data;

    public void setData(Map map) {
        this.data = map;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Map getData() {
        return this.data;
    }
}
