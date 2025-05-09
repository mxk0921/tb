package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodListSearchRequest implements INetDataObject {
    public String entryLiveSource;
    public boolean isHighlight;
    public List<ItemIdentifier> itemIndexIdList;
    public String liveSource;
    public String matchNewVersion;
    public JSONObject searchTransferInfo;
    public String searchType;
    public String searchWord;
    public String transParams;
    public String API_NAME = "mtop.tblive.live.item.searchLiveItem";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String VERSION = "1.0";
    public String anchorId = null;
    public long groupNum = 0;
    public String liveId = null;
    public long n = 0;

    static {
        t2o.a(295698860);
        t2o.a(806355930);
    }
}
