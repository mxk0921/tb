package com.taobao.taolive.room.business.liveurl;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveUrlGetRequest implements INetDataObject {
    private String API_NAME = "mtop.mediaplatform.live.liveurl.get";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String feedIdOrTopic = null;

    static {
        t2o.a(779092817);
        t2o.a(806355930);
    }
}
