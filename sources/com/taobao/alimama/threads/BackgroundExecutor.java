package com.taobao.alimama.threads;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BackgroundExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Executor executor = Executors.newCachedThreadPool();

    static {
        t2o.a(1018167402);
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
