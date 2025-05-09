package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class JoinNotifyMessage implements INetDataObject {
    public Map<String, String> addUsers;
    public int onlineCount;
    public long pageViewCount;
    public int totalCount;
    public String viewCountFormat;

    static {
        t2o.a(806356323);
        t2o.a(806355930);
    }
}
