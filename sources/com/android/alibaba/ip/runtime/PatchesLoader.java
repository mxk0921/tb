package com.android.alibaba.ip.runtime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface PatchesLoader {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ClassLoaderListener {
        void onLoadResult(String str, boolean z, Throwable th);

        boolean onPrePareLoad(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface PatchLoaderListener extends ClassLoaderListener {
        void onLoadAllFinish(boolean z);
    }

    void addClassLoadListener(ClassLoaderListener classLoaderListener);

    boolean load();
}
