package com.ali.user.mobile.ability.excutor;

import com.ali.user.mobile.ability.excutor.ac.OpenAccountCenterExcutor;
import com.ali.user.mobile.ability.excutor.base.AgreementCheckExecutor;
import com.ali.user.mobile.ability.excutor.base.AlertExecutor;
import com.ali.user.mobile.ability.excutor.base.HideLoadingExecutor;
import com.ali.user.mobile.ability.excutor.base.MtopExecutor;
import com.ali.user.mobile.ability.excutor.base.OpenH5Executor;
import com.ali.user.mobile.ability.excutor.base.ShowLoadingExecutor;
import com.ali.user.mobile.ability.excutor.base.ToastExecutor;
import com.ali.user.mobile.ability.excutor.login.LoginExecutor;
import com.ali.user.mobile.ability.excutor.login.SendLoginCodeExecutor;
import com.ali.user.mobile.callback.DataCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExecutorCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ExecutorCenter executorCenter;
    private Map<String, Executor> executors = new ConcurrentHashMap();

    static {
        t2o.a(69206026);
    }

    public static ExecutorResult execute(String str, ExecutorContext executorContext, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("f2260ac4", new Object[]{str, executorContext, dataCallback});
        }
        return getInstance().excute(str, executorContext, dataCallback);
    }

    public static ExecutorCenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorCenter) ipChange.ipc$dispatch("35b0d6c1", new Object[0]);
        }
        if (executorCenter == null) {
            synchronized (ExecutorCenter.class) {
                try {
                    if (executorCenter == null) {
                        executorCenter = new ExecutorCenter();
                        registerInner();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return executorCenter;
    }

    public static void registerInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a2707a", new Object[0]);
            return;
        }
        getInstance().registerExecutor(AgreementCheckExecutor.class);
        getInstance().registerExecutor(ShowLoadingExecutor.class);
        getInstance().registerExecutor(HideLoadingExecutor.class);
        getInstance().registerExecutor(MtopExecutor.class);
        getInstance().registerExecutor(ToastExecutor.class);
        getInstance().registerExecutor(OpenH5Executor.class);
        getInstance().registerExecutor(AlertExecutor.class);
        getInstance().registerExecutor(SendLoginCodeExecutor.class);
        getInstance().registerExecutor(LoginExecutor.class);
        getInstance().registerExecutor(OpenAccountCenterExcutor.class);
    }

    public ExecutorResult excute(String str, ExecutorContext executorContext, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("f153e9c3", new Object[]{this, str, executorContext, dataCallback});
        }
        Executor findExecutor = findExecutor(str);
        if (findExecutor == null) {
            return null;
        }
        return findExecutor.execute(executorContext, dataCallback);
    }

    public Executor findExecutor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("60cf088b", new Object[]{this, str});
        }
        Executor executor = this.executors.get(str.toLowerCase());
        if (executor != null || str.endsWith(BaseExecutor.EXECUTOR_SUFFIX)) {
            return executor;
        }
        Map<String, Executor> map = this.executors;
        return map.get(str.toLowerCase() + BaseExecutor.EXECUTOR_SUFFIX);
    }

    public void registerExecutor(Class<? extends Executor> cls) {
        Executor executor;
        try {
            executor = (Executor) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            executor = null;
        }
        if (executor != null) {
            this.executors.put(executor.executorName(), executor);
        }
    }
}
