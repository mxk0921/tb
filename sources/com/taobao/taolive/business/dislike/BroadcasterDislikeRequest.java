package com.taobao.taolive.business.dislike;

import com.ali.user.mobile.login.model.LoginConstant;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BroadcasterDislikeRequest implements INetDataObject {
    public String anchorIdOrFeedId;
    public String API_NAME = "mtop.mediaplatform.live.follow.broadcasterlist.feedbackList";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String channelType = "jingxuan";
    public String delReason = LoginConstant.ACCOUNT;
    public String templateName = "taolive_live_card_longpress";

    static {
        t2o.a(779092408);
        t2o.a(806355930);
    }
}
