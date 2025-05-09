package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QuerySimpleRightsInfoRequest implements INetDataObject {
    public String entryLiveSource;
    public boolean isNewPrivilege;
    public String liveSource;
    public String spm;
    public JSONObject transParams;
    public String API_NAME = "mtop.tblive.right.room.querySimpleRightsInfo";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String liveId = "";
    public String anchorId = "";
    public String interactTypes = "";

    static {
        t2o.a(295698902);
        t2o.a(806355930);
    }
}
