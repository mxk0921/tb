package com.alibaba.ariver.engine.api.bridge.extension;

import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface BridgeCallback {
    void sendBridgeResponse(BridgeResponse bridgeResponse);

    void sendJSONResponse(JSONObject jSONObject);

    void sendJSONResponse(JSONObject jSONObject, boolean z);
}
