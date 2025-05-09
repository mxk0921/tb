package com.alipay.mobile.common.amnet.api.model;

import com.alipay.mobile.common.transportext.Transport;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ActivatingParams {
    public Transport.Activating activating;
    public boolean canUseBifrost;
    public boolean isReconnect;

    public ActivatingParams(Transport.Activating activating, boolean z, boolean z2) {
        this.activating = activating;
        this.isReconnect = z;
        this.canUseBifrost = z2;
    }

    public ActivatingParams() {
    }
}
