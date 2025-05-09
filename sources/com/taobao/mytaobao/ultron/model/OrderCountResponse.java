package com.taobao.mytaobao.ultron.model;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OrderCountResponse extends BaseOutDo implements Serializable {
    private Results data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Order implements Serializable {
        public String count;
        public String tabCode;

        static {
            t2o.a(745538149);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Results implements Serializable {
        public List<Order> result;

        static {
            t2o.a(745538150);
        }
    }

    static {
        t2o.a(745538148);
    }

    public void setData(Results results) {
        this.data = results;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Results getData() {
        return this.data;
    }
}
