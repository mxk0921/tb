package com.alibaba.android.split.core.internal;

import java.io.File;
import java.util.Set;
import tb.ocq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ApkLoader {
    boolean loadDex(ClassLoader classLoader, File file, ocq ocqVar, boolean z, boolean z2);

    void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z);
}
