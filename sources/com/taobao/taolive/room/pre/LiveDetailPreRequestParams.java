package com.taobao.taolive.room.pre;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveDetailPreRequestParams implements INetDataObject {
    public String adImpId;
    public JSONObject extJson;
    public String feedId;
    public String holdType;
    public String itemId;
    public String itemIds;
    public String itemid;
    public String keyPointId;
    public String liveSource;
    public String needRecommend;
    public String outerParam;
    public String productType;
    public String rcmd;
    public LiveEmbedType shopEmbedType;
    public String sjsdItemId;
    public JSONObject tcpParams;
    public String timeMovingItemId;
    public Map<String, String> transMap;
    public String transParams;
    public String userId;
    public String useLiveFandom = "false";
    public String forceFandom = "false";

    static {
        t2o.a(806355768);
        t2o.a(806355930);
    }
}
