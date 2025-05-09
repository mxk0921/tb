package com.alipay.android.msp.plugin.engine;

import java.net.InetAddress;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IDnsEngine {
    InetAddress[] getInetAddresses(String str);

    void inscLoopCount();

    boolean isClientConnDegrade();

    void updateDns();
}
