package com.taobao.android.live.plugin.atype.flexalocal.profile.joingroup;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class JoingroupRequest implements INetDataObject {
    private final String API_NAME = "mtop.taobao.chatting.group.user.joingroup";
    private final String VERSION = "1.0";
    private final boolean NEED_ECODE = true;
    private final boolean NEED_SESSION = true;
    public String groupId = null;
    public Map properties = null;

    static {
        t2o.a(295699597);
        t2o.a(806355930);
    }
}
