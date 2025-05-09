package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopIliadUsertaskTasksEntryRequest implements INetDataObject {
    public String creatorId;
    public String liveId;
    public String API_NAME = "mtop.iliad.usertask.tasks.entry";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String liveSource = null;
    public String entryLiveSource = null;
    public String userTaskParams = null;
    public String appVersion = "";
    public String scene = "live_room";

    static {
        t2o.a(295700109);
        t2o.a(806355930);
    }
}
