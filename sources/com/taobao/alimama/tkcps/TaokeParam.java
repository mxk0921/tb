package com.taobao.alimama.tkcps;

import com.alibaba.fastjson.annotation.JSONField;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TaokeParam {
    @JSONField(name = "content")
    public String content;
    @JSONField(name = PushConstants.REGISTER_STATUS_EXPIRE_TIME)
    public Long expireTime;

    static {
        t2o.a(1020264471);
    }
}
