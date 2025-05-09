package com.taobao.themis.kernel.adapter;

import java.util.Map;
import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ICrashCatchAdapter extends n8s {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th);
    }

    void addHeaderInfo(String str, String str2);

    void addJavaCrashListener(a aVar);

    void removeJavaCrashListener(a aVar);
}
