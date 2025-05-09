package com.taobao.message.kit.core;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IObserver<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
