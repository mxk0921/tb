package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.taobao.infoflow.protocol.model.datamodel.response.IResponseModel;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AwesomeGetResponse extends BaseOutDo implements IResponseModel {
    private AwesomeGetData data;

    static {
        t2o.a(487587887);
        t2o.a(488636517);
    }

    public void setData(AwesomeGetData awesomeGetData) {
        this.data = awesomeGetData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public AwesomeGetData getData() {
        return this.data;
    }
}
