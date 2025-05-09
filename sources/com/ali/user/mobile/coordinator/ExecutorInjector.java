package com.ali.user.mobile.coordinator;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExecutorInjector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThreadPoolExecutor mThreadPoolExecutor = null;

    static {
        t2o.a(68157477);
    }

    public static ThreadPoolExecutor getInjectThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("b3666587", new Object[0]);
        }
        return mThreadPoolExecutor;
    }
}
