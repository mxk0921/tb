package com.ali.user.mobile.ability.excutor.base;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OpenH5Executor extends BaseExecutor<OpenH5Params> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class OpenH5Params extends ExecutorParams {
        public UrlParam params;

        static {
            t2o.a(69206046);
        }
    }

    static {
        t2o.a(69206045);
    }

    public static /* synthetic */ Object ipc$super(OpenH5Executor openH5Executor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/base/OpenH5Executor");
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public /* bridge */ /* synthetic */ void asyncExecute(ExecutorContext executorContext, OpenH5Params openH5Params, DataCallback dataCallback) {
        asyncExecute2(executorContext, openH5Params, (DataCallback<ExecutorResult>) dataCallback);
    }

    /* renamed from: asyncExecute  reason: avoid collision after fix types in other method */
    public void asyncExecute2(ExecutorContext executorContext, OpenH5Params openH5Params, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5564d115", new Object[]{this, executorContext, openH5Params, dataCallback});
        } else if (openH5Params == null || openH5Params.params == null) {
            callback(dataCallback, ExecutorResult.buildParamError(executorContext));
        } else {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(DataProviderFactory.getApplicationContext(), openH5Params.params);
        }
    }
}
