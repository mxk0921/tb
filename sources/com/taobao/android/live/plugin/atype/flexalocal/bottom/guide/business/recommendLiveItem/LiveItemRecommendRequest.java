package com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.business.recommendLiveItem;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveItemRecommendRequest implements INetDataObject {
    public JSONObject realExpoInfo;
    public String API_NAME = "mtop.tblive.recommend.updown.personal.recommend";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public String userId = "";
    public String liveId = "";
    public String itemId = "";
    public String anchorId = "";
    public String categoryId = "";

    static {
        t2o.a(295698546);
        t2o.a(806355930);
    }
}
