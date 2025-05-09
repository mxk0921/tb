package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemActionQueryRequest implements INetDataObject {
    public String asac;
    public String entryLiveSource;
    public JSONObject itemActionData;
    public String liveSource;
    public String API_NAME = "mtop.tblive.live.item.itemaction.query";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String recordId = "";
    public String itemId = "";
    public String anchorId = "";
    public String liveId = "";

    static {
        t2o.a(295698868);
        t2o.a(806355930);
    }
}
