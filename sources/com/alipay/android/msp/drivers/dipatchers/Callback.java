package com.alipay.android.msp.drivers.dipatchers;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface Callback {
    void onFailure(Call call, Exception exc);

    void onResponse(Call call, MspResponse mspResponse) throws Exception;
}
