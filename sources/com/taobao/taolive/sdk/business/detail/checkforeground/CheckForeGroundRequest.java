package com.taobao.taolive.sdk.business.detail.checkforeground;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CheckForeGroundRequest implements INetDataObject {
    private String API_NAME = "mtop.taobao.tbcontent.livediscoverypage.liveinfo.get";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public List<String> liveIdList = null;

    static {
        t2o.a(806355999);
        t2o.a(806355930);
    }
}
