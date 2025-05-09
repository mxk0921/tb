package com.alipay.auth.mobile.api;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IAlipayAuthEventHandler {
    void alipayAuthDidCancel();

    void alipayAuthFailure();

    void alipayAuthSuccess(String str);
}
