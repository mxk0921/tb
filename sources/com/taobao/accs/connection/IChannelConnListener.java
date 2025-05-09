package com.taobao.accs.connection;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IChannelConnListener {
    void onStart() throws IPCException;
}
