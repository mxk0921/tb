package com.taobao.taolive.sdk.model.message;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareGoodMessage implements INetDataObject {
    public String activityIcon;
    public String buyCount;
    public Map<String, String> extendVal;
    public String isDuplicate;
    public String isEdit;
    public Map<String, Object> itemExtData;
    public String itemH5TaokeUrl;
    public String itemIcon;
    public String itemId;
    public String itemName;
    public String itemPic;
    public String itemPrice;
    public String itemUrl;
    public String liveId;
    public Map<String, Object> liveItemStatusData;
    public JSONObject personalityData;

    static {
        t2o.a(806356336);
        t2o.a(806355930);
    }
}
