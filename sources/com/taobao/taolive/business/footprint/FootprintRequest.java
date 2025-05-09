package com.taobao.taolive.business.footprint;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FootprintRequest implements INetDataObject {
    public String API_NAME = "mtop.taobao.mediaplatform.live.footprint.log";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public long footprintTime = 0;
    public long duration = 0;
    public long liveId = 0;
    public long broadcasterId = 0;

    static {
        t2o.a(779092412);
        t2o.a(806355930);
    }
}
