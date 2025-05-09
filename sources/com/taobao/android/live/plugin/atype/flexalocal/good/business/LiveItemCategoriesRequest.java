package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveItemCategoriesRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.item.getLiveItemCategories";
    public String VERSION = "1.0";
    public String anchorId;
    public List<String> clientDefaultCategoryIds;
    public String defaultCategoryId;
    public String entryLiveSource;
    public String holdItemIds;
    public boolean isFirst;
    public String itemTransferInfo;
    public String liveId;
    public String liveSource;
    public String matchNewVersion;
    public boolean needPcg;
    public String userId;

    static {
        t2o.a(295698881);
        t2o.a(806355930);
    }
}
