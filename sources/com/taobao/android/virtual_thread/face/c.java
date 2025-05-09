package com.taobao.android.virtual_thread.face;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a<T> {
        T get();
    }

    <T> ThreadLocal<T> a(a<? extends T> aVar);
}
