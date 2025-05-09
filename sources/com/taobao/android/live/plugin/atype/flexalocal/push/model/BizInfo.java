package com.taobao.android.live.plugin.atype.flexalocal.push.model;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BizInfo implements INetDataObject {
    public final String bizCode;
    public final String taskName;

    static {
        t2o.a(295699637);
        t2o.a(806355930);
    }

    public BizInfo(String str, String str2) {
        this.bizCode = str;
        this.taskName = str2;
    }
}
