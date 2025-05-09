package com.alipay.android.phone.mobilesdk.socketcraft;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface WrappedByteChannel extends ByteChannel {
    boolean isBlocking();

    boolean isNeedRead();

    boolean isNeedWrite();

    int readMore(ByteBuffer byteBuffer);

    void writeMore();
}
