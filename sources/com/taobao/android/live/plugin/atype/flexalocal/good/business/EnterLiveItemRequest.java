package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EnterLiveItemRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.pop.item.card.list";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String VERSION = "1.0";
    public String creatorId;
    public String entryLiveSource;
    public String holdItemIds;
    public String interacts;
    public String itemHoldType;
    public String itemTransferInfo;
    public String liveId;
    public String liveSource;
    public boolean needRecommendItem;
    public String todayExposureCount;

    static {
        t2o.a(295698857);
        t2o.a(806355930);
    }
}
