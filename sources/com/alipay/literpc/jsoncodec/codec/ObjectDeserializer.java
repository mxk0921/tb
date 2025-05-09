package com.alipay.literpc.jsoncodec.codec;

import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ObjectDeserializer {
    Object deserialize(Object obj, Type type) throws Exception;

    boolean match(Class<?> cls);
}
