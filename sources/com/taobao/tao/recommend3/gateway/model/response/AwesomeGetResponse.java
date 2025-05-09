package com.taobao.tao.recommend3.gateway.model.response;

import com.taobao.infoflow.protocol.model.datamodel.response.IResponseModel;
import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AwesomeGetResponse extends BaseOutDo implements Serializable, IResponseModel {
    public AwesomeGetData data;

    static {
        t2o.a(729809703);
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
