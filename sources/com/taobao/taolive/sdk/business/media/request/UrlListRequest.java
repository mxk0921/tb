package com.taobao.taolive.sdk.business.media.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UrlListRequest implements INetDataObject {
    public String liveId;
    public String API_NAME = "mtop.tblive.live.detail.playurl";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(806356029);
        t2o.a(806355930);
    }
}
