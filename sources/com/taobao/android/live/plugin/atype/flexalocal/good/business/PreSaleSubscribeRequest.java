package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PreSaleSubscribeRequest implements INetDataObject {
    public String ctl;
    public long itemId;
    public long liveId;
    public String source;
    public String userId;
    public String API_NAME = "mtop.mediaplatform.live.goods.subscribe.status.change";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(295698898);
        t2o.a(806355930);
    }
}
