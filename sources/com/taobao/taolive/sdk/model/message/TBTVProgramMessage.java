package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.TBTVProgramInfo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBTVProgramMessage implements INetDataObject {
    public long endTime;
    public boolean inTime;
    public TBTVProgramInfo liveDO;
    public String liveId;
    public long startTime;
    public String title;

    static {
        t2o.a(806356341);
        t2o.a(806355930);
    }
}
