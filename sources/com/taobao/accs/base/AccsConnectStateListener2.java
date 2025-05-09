package com.taobao.accs.base;

import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface AccsConnectStateListener2 extends AccsConnectStateListener {
    void onConnectFail(TaoBaseService.ConnectInfo connectInfo) throws IPCException;

    @Override // com.taobao.accs.base.AccsConnectStateListener
    void onConnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException;

    @Override // com.taobao.accs.base.AccsConnectStateListener
    void onDisconnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException;
}
