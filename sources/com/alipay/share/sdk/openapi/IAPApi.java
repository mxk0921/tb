package com.alipay.share.sdk.openapi;

import android.content.Intent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IAPApi {
    int getZFBVersionCode();

    boolean handleIntent(Intent intent, IAPAPIEventHandler iAPAPIEventHandler);

    boolean isZFBAppInstalled();

    boolean isZFBSupportAPI();

    boolean openZFBApp();

    boolean sendReq(BaseReq baseReq);
}
