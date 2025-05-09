package com.taobao.android.live.plugin.atype.flexalocal.topbar.subscribe;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveAddCollectRequest implements INetDataObject {
    public long targetId;
    public int targetType;
    private String API_NAME = "mtop.taobao.livex.vinteract.collect.addcollect";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        t2o.a(295700049);
        t2o.a(806355930);
    }
}
