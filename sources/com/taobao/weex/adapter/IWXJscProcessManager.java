package com.taobao.weex.adapter;

import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWXJscProcessManager {
    boolean enableBackUpThreadCache();

    boolean enableBackupThread();

    long rebootTimeout();

    boolean shouldReboot();

    boolean withException(WXSDKInstance wXSDKInstance);
}
