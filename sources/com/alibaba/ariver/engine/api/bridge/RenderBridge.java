package com.alibaba.ariver.engine.api.bridge;

import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RenderBridge {
    void executeByteCodeToRenderSync(byte[] bArr, String str);

    void executeJSToRenderSync(String str, String str2);

    void sendToRender(RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback);

    void sendToRender(RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback, boolean z);

    SendToRenderCallback takeCallback(String str);
}
