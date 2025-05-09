package com.alipay.mobile.common.transport.ext;

import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ProtobufCodec {
    Object deserialize(Type type, byte[] bArr);

    boolean isPBBean(Class cls);

    boolean isPBBean(Object obj);

    byte[] serialize(Object obj);

    String toString(Object obj);
}
