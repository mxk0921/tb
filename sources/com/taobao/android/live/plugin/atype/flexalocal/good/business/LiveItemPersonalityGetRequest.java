package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveItemPersonalityGetRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.item.personality.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String itemIds = null;
    public long creatorId = 0;
    public long liveId = 0;

    static {
        t2o.a(295698886);
        t2o.a(806355930);
    }
}
