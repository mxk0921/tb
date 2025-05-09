package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IHeartBeat {
    void onPingSuccess(String str) throws IPCException;

    void onPingTimeout(String str) throws IPCException;
}
