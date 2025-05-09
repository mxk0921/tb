package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OpenHiglightAccess implements INetDataObject {
    public String accountId;
    public HighlightSkipParams highlightSkipParams;
    public String liveId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class HighlightSkipParams implements INetDataObject {
        public String id;
        public String keyPointId;
        public String productType;
        public String sjsdItemId;

        static {
            t2o.a(806356247);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356246);
        t2o.a(806355930);
    }
}
