package com.taobao.taolive.sdk.model.message;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GoodMsgNew implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String action;
    public boolean callbackServer;
    public Map<String, ItemSortInfo> categoryItemSortInfo;
    public ItemSortInfo itemSortInfo;
    public LiveItem liveItemDO;
    public boolean needChangeSort;

    static {
        t2o.a(806356319);
        t2o.a(806355930);
    }

    public static GoodMsgNew constructGoodMsg(LiveItem liveItem, ItemSortInfo itemSortInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodMsgNew) ipChange.ipc$dispatch("35ac4972", new Object[]{liveItem, itemSortInfo, str});
        }
        GoodMsgNew goodMsgNew = new GoodMsgNew();
        goodMsgNew.liveItemDO = liveItem;
        goodMsgNew.itemSortInfo = itemSortInfo;
        goodMsgNew.action = str;
        return goodMsgNew;
    }
}
