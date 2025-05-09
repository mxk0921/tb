package com.ali.adapt.api;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface AliServiceFinder {
    <T> T findServiceImpl(Class<T> cls);

    <T> void findServiceImpl(Class<T> cls, AliServiceFindedCallback<T> aliServiceFindedCallback);
}
