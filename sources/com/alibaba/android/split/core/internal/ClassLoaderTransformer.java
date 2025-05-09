package com.alibaba.android.split.core.internal;

import java.lang.ClassLoader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ClassLoaderTransformer<T extends ClassLoader> {
    T transform(ClassLoader classLoader) throws Exception;
}
