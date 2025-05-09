package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IAppReceiverV1 extends IAppReceiver {
    void onBindApp(int i, String str) throws IPCException;
}
