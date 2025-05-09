package com.taobao.android.live.plugin.atype.flexalocal.nav;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.k75;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaokeRequest implements INetDataObject {
    public String API_NAME = k75.TAOKE_ITEM_CHECK;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String platform = null;
    public long sourceType = 0;
    public String utdid = null;
    public String accountId = null;
    public String bizType = null;
    public long itemId = 0;
    public String url = null;
    public String sourceId = "taolive";

    static {
        t2o.a(295699529);
        t2o.a(806355930);
    }
}
