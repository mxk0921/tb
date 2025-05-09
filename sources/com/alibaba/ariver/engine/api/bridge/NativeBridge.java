package com.alibaba.ariver.engine.api.bridge;

import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface NativeBridge {
    void bindEngineRouter(EngineRouter engineRouter);

    void release();

    boolean sendToNative(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback);

    boolean sendToNative(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback, boolean z);
}
