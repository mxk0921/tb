package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EnterGoodsData implements INetDataObject {
    public String behavior;
    public List<LiveItem> curItemList;
    public JSONArray expansionRedPacketList;
    public String holdItemIds;
    public JSONObject itemCardTransferInfo;
    public JSONObject itemGroupListInfo;
    public String itemHoldType;
    public String popId;
    public List<LiveItem> popItemCardList;
    public boolean useRecommendItem;

    static {
        t2o.a(295698854);
        t2o.a(806355930);
    }
}
