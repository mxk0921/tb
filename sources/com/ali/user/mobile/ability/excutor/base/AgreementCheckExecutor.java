package com.ali.user.mobile.ability.excutor.base;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.SupportSync;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@SupportSync
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AgreementCheckExecutor extends BaseExecutor<ExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PARAMS_AGREEMENT_CKECKED_KEY = "agreementChecked";

    static {
        t2o.a(69206036);
    }

    public static /* synthetic */ Object ipc$super(AgreementCheckExecutor agreementCheckExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/base/AgreementCheckExecutor");
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public ExecutorResult syncExecute(ExecutorContext executorContext, ExecutorParams executorParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("a0b2e8d1", new Object[]{this, executorContext, executorParams});
        }
        return new ExecutorResult("false".equals(executorContext.pageFields.get(PARAMS_AGREEMENT_CKECKED_KEY)), executorContext);
    }
}
