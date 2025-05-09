package com.alibaba.ariver.engine.api.bridge.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ApiContext {
    void callBridgeApi(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback, boolean z);

    Activity getActivity();

    Context getAppContext();

    String getAppId();

    Resource getContent(String str);

    String getContextId();

    View getInternalView();

    int getPageId();

    String getPluginId();

    Render getRender();

    int getRenderId();

    String getSourceProcess();

    Bundle getStartParams();

    boolean isFromRemote();

    void sendEvent(String str, JSONObject jSONObject, SendToRenderCallback sendToRenderCallback);

    void startActivity(Intent intent);
}
