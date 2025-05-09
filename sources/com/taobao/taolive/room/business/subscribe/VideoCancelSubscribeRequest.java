package com.taobao.taolive.room.business.subscribe;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoCancelSubscribeRequest implements INetDataObject {
    private String API_NAME = "mtop.mediaplatform.video.cancelSubscribe";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public long accountId = 0;

    static {
        t2o.a(806355695);
        t2o.a(806355930);
    }
}
