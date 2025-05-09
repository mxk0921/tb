package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AddFollowRequest implements INetDataObject {
    public String accountId;
    public String ad;
    public String appKey;
    public String clickId;
    public String contentId;
    public String entryLiveSource;
    public String entrySpm;
    public String extraFlag;
    public String kandianId;
    public String liveSource;
    public String originPage;
    public String pvId;
    public String spmCnt;
    public String spmUrl;
    public String watchId;
    private String API_NAME = "mtop.tblive.live.follow.relation.add";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(779092293);
        t2o.a(806355930);
    }
}
