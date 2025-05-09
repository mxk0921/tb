package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MemberCheckRequest implements INetDataObject {
    public String anchorId;
    public String liveId;
    public String API_NAME = "mtop.tblive.live.amto.real";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String queryType = "member";

    static {
        t2o.a(295698891);
        t2o.a(806355930);
    }
}
