package com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface DialogCallback {
    void onChannelClosed(String str, int i);

    void onDialogResultGenerated(String str);

    void onRecognizedCompleted(String str);

    void onRecognizedResultChanged(String str);

    void onTaskFailed(String str, int i);

    void onTaskStarted();
}
