package com.taobao.mytaobao.homepage.busniess.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DeliverListResponse extends BaseOutDo implements Serializable {
    private DeliveryData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class DeliveryData {
        public List<DeliverInfoBean> deliveryList;
        public JSONObject events;

        static {
            t2o.a(745537736);
        }
    }

    static {
        t2o.a(745537735);
    }

    public void setData(DeliveryData deliveryData) {
        this.data = deliveryData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public DeliveryData getData() {
        return this.data;
    }
}
