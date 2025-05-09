package com.alipay.mobile.verifyidentity.log;

import android.content.Context;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface BaseDebugViewer {
    void addVerifyLogger(String str, String str2);

    void getEnvironParams(String str);

    void gotRpcResult(Long l, MICRpcResponse mICRpcResponse);

    void init(Context context);

    void sendRpc(Long l, Object obj);

    void start();

    void unregisterSensorListener();
}
