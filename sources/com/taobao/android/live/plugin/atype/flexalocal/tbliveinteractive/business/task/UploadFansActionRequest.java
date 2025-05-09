package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.task;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UploadFansActionRequest implements INetDataObject {
    public String action;
    public String params;
    public String scopeId;
    public String subScope;
    public String trackParams;
    private String API_NAME = "mtop.taobao.iliad.task.action";
    private String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(295699857);
        t2o.a(806355930);
    }
}
