package com.alibaba.ariver.engine.api.bridge.model;

import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface SendToNativeCallback {
    public static final String KEY_CODE = "error";
    public static final String KEY_MESSAGE = "errorMessage";

    void onCallback(JSONObject jSONObject, boolean z);
}
