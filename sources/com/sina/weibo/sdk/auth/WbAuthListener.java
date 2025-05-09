package com.sina.weibo.sdk.auth;

import com.sina.weibo.sdk.common.UiError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface WbAuthListener {
    void onCancel();

    void onComplete(Oauth2AccessToken oauth2AccessToken);

    void onError(UiError uiError);
}
