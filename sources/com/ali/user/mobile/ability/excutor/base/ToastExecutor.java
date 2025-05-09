package com.ali.user.mobile.ability.excutor.base;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.SupportSync;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.ToastUtil;
import tb.t2o;

/* compiled from: Taobao */
@SupportSync
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ToastExecutor extends BaseExecutor<ToastExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ToastExecutorParams extends ExecutorParams {
        public int duration = 3000;
        public String message;

        static {
            t2o.a(69206050);
        }
    }

    static {
        t2o.a(69206049);
    }

    public static /* synthetic */ Object ipc$super(ToastExecutor toastExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/base/ToastExecutor");
    }

    public ExecutorResult syncExecute(ExecutorContext executorContext, ToastExecutorParams toastExecutorParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("7ec00ef0", new Object[]{this, executorContext, toastExecutorParams});
        }
        ToastUtil.showToast(executorContext.context, toastExecutorParams.message, toastExecutorParams.duration);
        return null;
    }
}
