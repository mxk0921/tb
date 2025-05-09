package com.alipay.mobile.common.utils.config;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ConfigureCtrlManager {
    void addConfigureChangedListener(ConfigureChangedListener configureChangedListener);

    String getConfgureVersion();

    void notifyConfigureChangedEvent();

    void removeConfigureChangedListener(ConfigureChangedListener configureChangedListener);
}
