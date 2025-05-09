package com.taobao.android.live.plugin.proxy.evocation;

import com.taobao.android.live.plugin.proxy.IProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IEvocationProxy extends IProxy {
    public static final String KEY = "IEvocationProxy";

    void appLinkRegisterPlugin();

    void appLinkRegisterWXModule();

    void initTaoLiveEvocation();
}
