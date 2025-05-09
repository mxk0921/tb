package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodsItemCardQueryRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.item.callback.query";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String VERSION = "1.0";
    public String entryLiveSource;
    public String itemIdList;
    public String liveId;
    public String liveSource;
    public String scene;
    public String smallCardItemType;

    static {
        t2o.a(295698865);
        t2o.a(806355930);
    }
}
