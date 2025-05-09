package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveEndMessage implements INetDataObject {
    public String messageText;
    public String replayUrl;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MessageText implements INetDataObject {
        public String nextLiveId;
        public boolean nextLiveIsIntelligence;

        static {
            t2o.a(806356326);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356325);
        t2o.a(806355930);
    }
}
