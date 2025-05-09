package com.alipay.android.msp.drivers.dipatchers;

import com.alipay.android.msp.drivers.actions.Action;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface Call {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Factory {
        Call newCall(Action action);
    }

    void enqueue(Callback callback);

    MspResponse execute();

    Action getAction();
}
