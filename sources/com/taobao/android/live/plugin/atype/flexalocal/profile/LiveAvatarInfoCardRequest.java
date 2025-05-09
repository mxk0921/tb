package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveAvatarInfoCardRequest implements INetDataObject {
    private final String API_NAME = "mtop.mediaplatform.new.anchor.info.card";
    private final String VERSION = "2.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;
    public long anchorId = 0;
    public long liveId = 0;
    public String encodeAccountId = "";
    public String sourceType = "";
    public boolean isFandom = false;
    public boolean isPublic = false;

    static {
        t2o.a(295699556);
        t2o.a(806355930);
    }
}
