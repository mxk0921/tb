package com.taobao.login4android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.concurrent.Executor;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BackgroundExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Executor executor = Coordinator.sThreadPoolExecutor;

    static {
        t2o.a(516948003);
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
            LoginTLogAdapter.e("login.BackgroundExecutor", "BackgroundExecutor.excute failed.", e);
            e.printStackTrace();
        }
    }
}
