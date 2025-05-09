package com.taobao.taolive.sdk.business.official.heartbeat;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OfficialHeartbeatRequest implements INetDataObject {
    public String encryptAnchorId;
    public String exParam;
    public String liveId;
    private String API_NAME = "mtop.taobao.thoth.sdk.heartbeat";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String topic = null;

    static {
        t2o.a(806356034);
        t2o.a(806355930);
    }
}
