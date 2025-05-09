package com.ali.user.mobile.coordinator;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.Coordinator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CoordinatorWrapper<Params> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157476);
    }

    public static void executeSafely(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3f5e34", new Object[]{runnable});
        } else if (runnable != null) {
            try {
                if (ExecutorInjector.getInjectThreadPoolExecutor() != null) {
                    ExecutorInjector.getInjectThreadPoolExecutor().execute(runnable);
                } else {
                    Coordinator.execute(runnable);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else if (runnable != null) {
            try {
                if (ExecutorInjector.getInjectThreadPoolExecutor() != null) {
                    ExecutorInjector.getInjectThreadPoolExecutor().execute(runnable);
                } else {
                    Coordinator.execute(runnable);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static <Params> void executeSafely(AsyncTask asyncTask, Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847f822", new Object[]{asyncTask, paramsArr});
            return;
        }
        try {
            asyncTask.executeOnExecutor(ExecutorInjector.getInjectThreadPoolExecutor() != null ? ExecutorInjector.getInjectThreadPoolExecutor() : Coordinator.sThreadPoolExecutor, paramsArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @SafeVarargs
    public final void execute(AsyncTask asyncTask, Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46e001c", new Object[]{this, asyncTask, paramsArr});
        } else if (asyncTask != null) {
            try {
                if (ExecutorInjector.getInjectThreadPoolExecutor() != null) {
                    asyncTask.executeOnExecutor(ExecutorInjector.getInjectThreadPoolExecutor(), paramsArr);
                } else {
                    asyncTask.executeOnExecutor(Coordinator.sThreadPoolExecutor, paramsArr);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
