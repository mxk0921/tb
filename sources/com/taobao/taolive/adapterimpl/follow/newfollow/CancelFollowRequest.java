package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CancelFollowRequest implements INetDataObject {
    public String accountId;
    public String contentId;
    public String extraFlag;
    private String API_NAME = "mtop.tblive.live.follow.relation.cancel";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(779092294);
        t2o.a(806355930);
    }
}
