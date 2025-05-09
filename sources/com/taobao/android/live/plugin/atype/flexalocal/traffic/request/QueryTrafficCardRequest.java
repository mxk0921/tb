package com.taobao.android.live.plugin.atype.flexalocal.traffic.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QueryTrafficCardRequest implements INetDataObject {
    public String isp;
    public String ispResult;
    public String API_NAME = "mtop.alibaba.alicom.vtplan.live.flow.check";
    public String VERSION = "1.0";
    private final boolean NEED_ECODE = true;
    private final boolean NEED_SESSION = true;

    static {
        t2o.a(295700069);
        t2o.a(806355930);
    }
}
