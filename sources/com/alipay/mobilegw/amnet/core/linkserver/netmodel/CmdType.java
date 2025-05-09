package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import tb.k1n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum CmdType implements k1n {
    IpListUpdate(1),
    ReConnect(2),
    ConnectionDowngrade(3),
    Crash(4);
    
    private final int value;

    CmdType(int i) {
        this.value = i;
    }

    @Override // tb.k1n
    public int getValue() {
        return this.value;
    }
}
