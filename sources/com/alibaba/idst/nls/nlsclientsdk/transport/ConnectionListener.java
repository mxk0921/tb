package com.alibaba.idst.nls.nlsclientsdk.transport;

import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ConnectionListener {
    void onClose(int i, String str);

    void onError(Exception exc);

    void onFail(int i, String str);

    void onMessage(String str);

    void onMessage(ByteBuffer byteBuffer);

    void onOpen();
}
