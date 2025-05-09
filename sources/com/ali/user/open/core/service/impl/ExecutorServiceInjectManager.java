package com.ali.user.open.core.service.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExecutorServiceInjectManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThreadPoolExecutor mThreadPoolExecutor = null;

    static {
        t2o.a(71303226);
    }

    public static ThreadPoolExecutor getInjectThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("b3666587", new Object[0]);
        }
        return mThreadPoolExecutor;
    }

    public static void setInjectThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3488fc5d", new Object[]{threadPoolExecutor});
        } else {
            mThreadPoolExecutor = threadPoolExecutor;
        }
    }
}
