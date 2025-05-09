package com.taobao.tao.topmultitab.service.pulldown.request;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SecondFloorGetResultOutDo_ extends BaseOutDo {
    private SecondFloorGetResult data;

    static {
        t2o.a(729810295);
    }

    public void setData(SecondFloorGetResult secondFloorGetResult) {
        this.data = secondFloorGetResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public SecondFloorGetResult getData() {
        return this.data;
    }
}
