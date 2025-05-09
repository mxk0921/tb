package com.taobao.message.launcher.server_time;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GetTimeStampResponse extends BaseOutDo implements IMTOPDataObject {
    private GetTimeStampData data;

    static {
        t2o.a(529531036);
        t2o.a(589299906);
    }

    public void setData(GetTimeStampData getTimeStampData) {
        this.data = getTimeStampData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public GetTimeStampData getData() {
        return this.data;
    }
}
