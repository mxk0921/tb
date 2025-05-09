package com.taobao.taolive.room.business.goodcard;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveRecommendGoodCardRequest implements INetDataObject {
    public String tppParam;
    private String API_NAME = "mtop.tblive.recommend.updown.direct.down.query";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(779092810);
        t2o.a(806355930);
    }
}
