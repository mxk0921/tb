package com.taobao.android.live.plugin.atype.flexalocal.good.business.getredpacket;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GetPacketRequest implements INetDataObject {
    public String anchorId;
    public String asac;
    public String entryLiveSource;
    public String entrySpm;
    public String liveId;
    public String spmCnt;
    public String spmUrl;
    public JSONObject transParams;
    public String API_NAME = "mtop.tblive.right.room.issuesimplerights";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String liveSource = "";

    static {
        t2o.a(295698916);
        t2o.a(806355930);
    }
}
