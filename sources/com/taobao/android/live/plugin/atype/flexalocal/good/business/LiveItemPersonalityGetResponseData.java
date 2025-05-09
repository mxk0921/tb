package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveItemPersonalityGetResponseData implements INetDataObject {
    public ArrayList<LiveItemPersonalityData> personalities;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LiveItemPersonalityData implements INetDataObject {
        public String itemId;
        public JSONObject personalityData;

        static {
            t2o.a(295698889);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295698888);
        t2o.a(806355930);
    }
}
