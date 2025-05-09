package com.alipay.android.msp.content;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface MspContextLifecycleCallbacks {
    void didEnterBackground();

    void onContextCreated();

    void onRestart();

    void onStart();

    void onStop();

    void willEnterForeground();
}
