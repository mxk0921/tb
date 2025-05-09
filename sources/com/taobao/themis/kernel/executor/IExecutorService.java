package com.taobao.themis.kernel.executor;

import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import tb.n8s;

/* compiled from: Taobao */
@DefaultAdapterImpl("com.taobao.themis.inside.adapter.TMSExecutorImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IExecutorService extends n8s {
    Executor getExecutor(ExecutorType executorType);

    ScheduledExecutorService getScheduledExecutor();
}
