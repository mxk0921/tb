package com.taobao.accs.asp;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
interface OnDataUpdateListener {
    void onDataUpdate(ModifiedRecord modifiedRecord) throws IPCException;
}
