package com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface SpeechSynthesizerCallback {
    void onBinaryReceived(byte[] bArr, int i);

    void onChannelClosed(String str, int i);

    void onSynthesisCompleted(String str, int i);

    void onSynthesisStarted();

    void onTaskFailed(String str, int i);
}
