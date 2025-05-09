package com.taobao.taolive.room.business.trivial;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrivialQueryResponseData implements INetDataObject {
    public String encryptAnchorId;
    public String encryptUserId;
    public ResultVoData resultVO;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ChatItemCommonData implements INetDataObject {
        public String bizType;
        public JSONObject data;
        public boolean isFirstShow;
        public String showType;
        public String templateName;
        public String voName;

        static {
            t2o.a(806355703);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CommonPMV0 implements INetDataObject {
        public List<ChatItemCommonData> pmlist;

        static {
            t2o.a(806355704);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ResultVoData implements INetDataObject {
        public CommonPMV0 commonPMVO;

        static {
            t2o.a(806355705);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806355702);
        t2o.a(806355930);
    }
}
