package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class QueryFollowRequest implements INetDataObject {
    public String keyName;
    public String targetUserIdStr;
    private String API_NAME = "mtop.taobao.social.follow.guang.get.all";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(779092302);
        t2o.a(806355930);
    }
}
