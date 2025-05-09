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
public class HideLoadingExecutor extends BaseExecutor<ExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206041);
    }

    public static /* synthetic */ Object ipc$super(HideLoadingExecutor hideLoadingExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/base/HideLoadingExecutor");
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public ExecutorResult syncExecute(ExecutorContext executorContext, ExecutorParams executorParams) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("a0b2e8d1", new Object[]{this, executorContext, executorParams});
        }
        if (executorContext == null || (context = executorContext.context) == null || !(context instanceof BaseActivity)) {
            return ExecutorResult.buildError(executorContext, null, 3002, "");
        }
        ((BaseActivity) context).dismissProgressDialog();
        return ExecutorResult.buildSuccess(executorContext);
    }
}
