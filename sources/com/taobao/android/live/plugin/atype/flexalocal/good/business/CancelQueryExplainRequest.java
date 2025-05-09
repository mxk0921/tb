package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CancelQueryExplainRequest implements INetDataObject {
    public String API_NAME = "mtop.mediaplatform.live.goods.subscribe.cancel";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public long itemId = 0;
    public String source = "";
    public long liveId = 0;

    static {
        t2o.a(295698853);
        t2o.a(806355930);
    }
}
