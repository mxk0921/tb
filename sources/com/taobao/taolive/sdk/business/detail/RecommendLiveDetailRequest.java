package com.taobao.taolive.sdk.business.detail;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;
import tb.zxg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RecommendLiveDetailRequest implements INetDataObject {
    public String creatorId;
    public String extendJson;
    public String liveId;
    public String liveSource;
    public String sjsdItemId;
    public String timeMovingItemId;
    public String type;
    private String API_NAME = zxg.RECOMMEND_DETAIL;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String ignoreH265 = "false";

    static {
        t2o.a(806355997);
        t2o.a(806355930);
    }
}
