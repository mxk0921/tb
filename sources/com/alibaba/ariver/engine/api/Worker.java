package com.alibaba.ariver.engine.api;

import android.os.Bundle;
import android.os.Handler;
import com.alibaba.ariver.engine.api.bridge.SendToWorkerCallback;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Worker {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface JsContextReadyListener {
        void onJsContextReady();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface WorkerReadyListener {
        void onWorkerReady();
    }

    void destroy();

    Handler getWorkerHandler();

    String getWorkerId();

    boolean isDestroyed();

    boolean isWorkerReady();

    void loadPlugin(String str);

    @Deprecated
    void postMessage(String str, SendToWorkerCallback sendToWorkerCallback);

    void registerWorkerReadyListener(WorkerReadyListener workerReadyListener);

    void sendJsonToWorker(JSONObject jSONObject, SendToWorkerCallback sendToWorkerCallback);

    @Deprecated
    void sendMessageToWorker(String str, String str2, String str3, SendToWorkerCallback sendToWorkerCallback);

    void setRenderReady();

    void setStartupParams(Bundle bundle);

    void setWorkerId(String str);

    void tryToInjectStartupParamsAndPushWorker();
}
