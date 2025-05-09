package com.taobao.weex.adapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IWXInitTaskAdapter {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Callback {
        void onRemoteFailed(String str, String str2);

        void onRemoteInstalled();
    }

    void doInit(Callback callback);

    boolean hasInit();
}
