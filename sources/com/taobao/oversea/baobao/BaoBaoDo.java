package com.taobao.oversea.baobao;

import java.io.Serializable;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BaoBaoDo extends BaseOutDo implements Serializable {
    public BaobaoResult data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class BaobaoResult implements Serializable {
        public String backgroundPic;
        public String callCartSuccess;
        public String firstPagePvid;
        public String itemCurrency;
        public String itemPic;
        public String itemPrice;
        public String itemTitle;
        public String itemUrl;
        public String jumpUrl;
        public String pvid;
        public String recommend;
        public String totalPrice;
        public String totalQuantity;
        public Map<String, String> utLogMap;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Object getData() {
        return this.data;
    }
}
