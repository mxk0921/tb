package com.ali.user.mobile.ability.excutor.base;

import android.content.Context;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.SupportSync;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@SupportSync
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ShowLoadingExecutor extends BaseExecutor<LoadingExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LoadingExecutorParams extends ExecutorParams {
        static {
            t2o.a(69206048);
        }
    }

    static {
        t2o.a(69206047);
    }

    public static /* synthetic */ Object ipc$super(ShowLoadingExecutor showLoadingExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/base/ShowLoadingExecutor");
    }

    public ExecutorResult syncExecute(ExecutorContext executorContext, LoadingExecutorParams loadingExecutorParams) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("2e7e005d", new Object[]{this, executorContext, loadingExecutorParams});
        }
        if (executorContext == null || (context = executorContext.context) == null || !(context instanceof BaseActivity)) {
            return ExecutorResult.buildError(executorContext, null, 3002, "");
        }
        ((BaseActivity) context).showProgress("");
        return ExecutorResult.buildSuccess(executorContext);
    }
}
