package com.taobao.android.live.plugin.atype.flexalocal.push.business.requests;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReportRequest implements INetDataObject {
    public String reportInfo;
    public String scene;
    public String API_NAME = "mtop.iliad.live.push.reportPushAction";
    public String VERSION = "1.0";
    private final boolean NEED_ECODE = true;
    private final boolean NEED_SESSION = true;

    static {
        t2o.a(295699632);
        t2o.a(806355930);
    }
}
