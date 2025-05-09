package com.taobao.android.tcrash;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface JvmUncaughtCrashListener {
    Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th);
}
