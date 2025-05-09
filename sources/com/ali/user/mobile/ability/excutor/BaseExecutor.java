package com.ali.user.mobile.ability.excutor;

import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.callback.DataCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseExecutor<T extends ExecutorParams> implements Executor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXECUTOR_SUFFIX = "executor";
    public Class<T> eventClazz = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    public boolean supportSync;

    static {
        t2o.a(69206023);
        t2o.a(69206025);
    }

    public BaseExecutor() {
        this.supportSync = false;
        if (getClass().isAnnotationPresent(SupportSync.class)) {
            this.supportSync = ((SupportSync) getClass().getAnnotation(SupportSync.class)).value();
        }
    }

    public void asyncExecute(ExecutorContext executorContext, T t, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880383d5", new Object[]{this, executorContext, t, dataCallback});
        }
    }

    public void callback(DataCallback<ExecutorResult> dataCallback, ExecutorResult executorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1480f9", new Object[]{this, dataCallback, executorResult});
        } else if (dataCallback != null) {
            dataCallback.result(executorResult);
        }
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public ExecutorResult execute(final ExecutorContext executorContext, final DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("fb23c5ce", new Object[]{this, executorContext, dataCallback});
        }
        ExecutorParams executorParams = executorContext.params;
        if (executorParams != null && !this.eventClazz.isAssignableFrom(executorParams.getClass())) {
            return null;
        }
        if (supportSync()) {
            ExecutorResult syncExecute = syncExecute(executorContext, executorContext.params);
            if (syncExecute == null) {
                syncExecute = ExecutorResult.buildSuccess(executorContext);
            }
            if (dataCallback != null) {
                dataCallback.result(syncExecute);
            }
            return syncExecute;
        }
        asyncExecute(executorContext, executorContext.params, new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.ability.excutor.BaseExecutor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void result(ExecutorResult executorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                } else if (dataCallback != null) {
                    if (executorResult == null) {
                        executorResult = ExecutorResult.buildSuccess(executorContext);
                    }
                    dataCallback.result(executorResult);
                }
            }
        });
        return null;
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public String executorName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0fb33bb", new Object[]{this});
        }
        String lowerCase = getClass().getSimpleName().toLowerCase();
        if (lowerCase.endsWith(EXECUTOR_SUFFIX)) {
            return lowerCase.substring(0, lowerCase.length() - 8);
        }
        return lowerCase;
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public Class paramClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("6595749f", new Object[]{this});
        }
        return this.eventClazz;
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public boolean supportSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45ea7e95", new Object[]{this})).booleanValue();
        }
        return this.supportSync;
    }

    public ExecutorResult syncExecute(ExecutorContext executorContext, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("a0b2e8d1", new Object[]{this, executorContext, t});
        }
        return null;
    }
}
