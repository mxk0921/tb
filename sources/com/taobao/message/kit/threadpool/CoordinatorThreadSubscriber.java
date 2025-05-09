package com.taobao.message.kit.threadpool;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface CoordinatorThreadSubscriber {
    void beforeExecute(BaseRunnable baseRunnable);

    void runnableInit(BaseRunnable baseRunnable);
}
