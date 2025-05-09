package com.alibaba.idst.nls.nlsclientsdk.transport;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Connection {
    void close();

    String getId();

    void sendBinary(byte[] bArr);

    void sendText(String str);
}
