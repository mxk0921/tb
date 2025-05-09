package com.taobao.message.lab.comfrm.util;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface Observer<T> {
    void onComplete();

    void onData(T t);

    void onError(String str, String str2, Object obj);
}
