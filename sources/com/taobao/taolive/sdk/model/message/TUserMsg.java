package com.taobao.taolive.sdk.model.message;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TUserMsg implements Serializable {
    public Object data;
    public int type;

    static {
        t2o.a(806356343);
    }

    public TUserMsg() {
    }

    public TUserMsg(UserMessageType userMessageType) {
        this.type = userMessageType.getType();
    }

    public TUserMsg(UserMessageType userMessageType, Object obj) {
        this.type = userMessageType.getType();
        this.data = obj;
    }
}
