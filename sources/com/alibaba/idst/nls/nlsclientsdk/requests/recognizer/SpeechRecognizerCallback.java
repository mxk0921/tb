package com.alibaba.idst.nls.nlsclientsdk.requests.recognizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface SpeechRecognizerCallback {
    void onChannelClosed(String str, int i);

    void onRecognizedCompleted(String str, int i);

    void onRecognizedResultChanged(String str, int i);

    void onRecognizedStarted();

    void onTaskFailed(String str, int i);
}
