package com.taobao.android.live.plugin.atype.flexalocal.liveend;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveEndRecommendRequest implements INetDataObject {
    public String liveId;
    public String tppParam;
    public String API_NAME = "mtop.tblive.recommend.live.end";
    public String VERSION = "1.0";
    private final boolean NEED_ECODE = true;
    private final boolean NEED_SESSION = true;

    static {
        t2o.a(295699510);
        t2o.a(806355930);
    }
}
