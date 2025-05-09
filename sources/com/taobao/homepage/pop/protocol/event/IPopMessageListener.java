package com.taobao.homepage.pop.protocol.event;

import com.alibaba.fastjson.JSONObject;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IPopMessageListener {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PopMessageType {
    }

    void onMessage(String str, IPopData iPopData, JSONObject jSONObject);
}
