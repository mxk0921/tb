package com.taobao.android.tstudio;

import tb.i9h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface TStudioInterface {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    <T> boolean addDecorView(Class<T> cls, Object obj, boolean z);

    void destroy();

    void enableAssistant(boolean z);

    boolean isEnabled();

    void onCreate();

    void onPause();

    void onResume();

    void register(a aVar);

    void sendMessage(i9h i9hVar);

    void unregister();
}
