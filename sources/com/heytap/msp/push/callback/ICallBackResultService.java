package com.heytap.msp.push.callback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ICallBackResultService {
    void onError(int i, String str);

    void onGetNotificationStatus(int i, int i2);

    void onGetPushStatus(int i, int i2);

    void onRegister(int i, String str);

    void onSetPushTime(int i, String str);

    void onUnRegister(int i);
}
