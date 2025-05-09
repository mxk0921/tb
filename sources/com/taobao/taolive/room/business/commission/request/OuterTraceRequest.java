package com.taobao.taolive.room.business.commission.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OuterTraceRequest implements INetDataObject {
    public String actionSource;
    public JSONObject context;
    public String entryLiveSource;
    public String fromType;
    public String liveId;
    public String liveSource;
    public String API_NAME = "mtop.com.taobao.tbtrace.commission.outertrace";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(779092799);
        t2o.a(806355930);
    }
}
