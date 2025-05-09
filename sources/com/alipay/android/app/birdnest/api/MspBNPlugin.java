package com.alipay.android.app.birdnest.api;

import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface MspBNPlugin {
    void destroy();

    int getBizId();

    View getView();

    void sendMessage(String str, JSONObject jSONObject, MessageListener messageListener);
}
