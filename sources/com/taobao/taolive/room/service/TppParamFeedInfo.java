package com.taobao.taolive.room.service;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TppParamFeedInfo implements INetDataObject {
    public String accountId;
    public Map<String, Object> clientReturnMap;
    public int comment;
    public long enter;
    public String fansLevel;
    public int follow;
    public int followStatus;
    public int like;
    public String liveId;
    public int openComment;
    public int openGoodsList;
    public String recommendBindId;
    public long roomViewCnt;
    public int share;
    public String sjsdItemId;
    public long stay;
    public String timeMovingId;
    public List<Long> gotoDetail = new ArrayList();
    public List<Long> addCart = new ArrayList();

    static {
        t2o.a(779093230);
        t2o.a(806355930);
    }
}
