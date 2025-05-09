package com.taobao.message.subscribe;

import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData implements IMTOPDataObject {
    SubScribeCenterResultDTO model;

    static {
        t2o.a(530579472);
        t2o.a(589299906);
    }

    public SubScribeCenterResultDTO getModel() {
        return this.model;
    }

    public void setModel(SubScribeCenterResultDTO subScribeCenterResultDTO) {
        this.model = subScribeCenterResultDTO;
    }
}
