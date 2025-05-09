package com.alipay.literpc.jsoncodec.codec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ObjectSerializer {
    boolean match(Class<?> cls);

    Object serialize(Object obj) throws Exception;
}
