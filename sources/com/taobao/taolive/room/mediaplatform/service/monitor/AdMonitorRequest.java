package com.taobao.taolive.room.mediaplatform.service.monitor;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AdMonitorRequest implements INetDataObject {
    public String action;
    public String adImpId;
    public String adType;
    public String livesource;
    public String pid;
    public String platform;
    public String taskId;
    public String type;
    public String userId;
    public String version;
    private String API_NAME = "mtop.taobao.livex.business.taolive.ad.monitor";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(779092986);
        t2o.a(806355930);
    }
}
