package com.taobao.android.virtual_thread;

import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface VRejectedExecutionHandler {
    void vRejectedExecution(Runnable runnable, ExecutorService executorService);
}
