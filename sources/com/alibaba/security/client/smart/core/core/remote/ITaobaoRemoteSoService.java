package com.alibaba.security.client.smart.core.core.remote;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ITaobaoRemoteSoService {
    boolean isRemoteSoLoaded(String str);

    void loadRemoteSo(String str, OnRemoteSoLoadListener onRemoteSoLoadListener);
}
