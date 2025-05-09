package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareGoodsListMessage implements INetDataObject {
    public Map<String, ItemSortInfo> categoryItemSortInfo;
    public int goodsIndex;
    public ShareGoodMessage[] goodsList;
    public ItemSortInfo itemSortInfo;
    public boolean needChangeSort;
    public int totalCount;

    static {
        t2o.a(806356337);
        t2o.a(806355930);
    }
}
