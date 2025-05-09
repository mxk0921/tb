package com.taobao.taolive.sdk.playcontrol.observe;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RoomPlayerEvent implements Serializable {
    public int errCode;
    public String eventName;
    public long time;
    public JSONObject userAction;

    static {
        t2o.a(806356403);
    }

    public RoomPlayerEvent(String str, long j) {
        this.eventName = str;
        this.time = j;
    }
}
