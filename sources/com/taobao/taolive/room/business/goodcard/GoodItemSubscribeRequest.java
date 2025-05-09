package com.taobao.taolive.room.business.goodcard;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GoodItemSubscribeRequest implements INetDataObject {
    public String activityDetailId;
    public String userId;
    public String API_NAME = "mtop.iliad.hotitem.subscribe";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(779092804);
        t2o.a(806355930);
    }
}
