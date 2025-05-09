package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IAgooAppReceiver extends IAppReceiverV1 {
    String getAppkey() throws IPCException;

    @Override // com.taobao.accs.IAppReceiverV1
    void onBindApp(int i, String str) throws IPCException;
}
