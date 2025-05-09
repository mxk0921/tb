package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GetLiveShareConfigRequest implements INetDataObject {
    public String anchorId;
    public String liveId;
    public String liveSource;
    private final String API_NAME = "mtop.tblive.live.detail.getLiveShareConfig";
    private final String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(295698535);
        t2o.a(806355930);
    }
}
