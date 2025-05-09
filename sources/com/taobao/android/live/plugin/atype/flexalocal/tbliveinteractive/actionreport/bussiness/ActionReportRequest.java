package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.actionreport.bussiness;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ActionReportRequest implements INetDataObject {
    public String actionList;
    public String encodeAnchorId;
    public String liveId;
    private final String API_NAME = "mtop.tblive.room.user.heartbeat.report";
    private final String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(295699839);
        t2o.a(806355930);
    }
}
