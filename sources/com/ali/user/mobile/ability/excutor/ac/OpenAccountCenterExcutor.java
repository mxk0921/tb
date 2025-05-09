package com.ali.user.mobile.ability.excutor.ac;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.url.AccountCenterApi;
import com.ali.user.mobile.url.model.AcBaseParam;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OpenAccountCenterExcutor extends BaseExecutor<OpenAccountCenterParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class OpenAccountCenterParams extends ExecutorParams {
        public boolean needEcode;
        public AcBaseParam params;

        static {
            t2o.a(69206035);
        }
    }

    static {
        t2o.a(69206033);
    }

    public static /* synthetic */ Object ipc$super(OpenAccountCenterExcutor openAccountCenterExcutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/ac/OpenAccountCenterExcutor");
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public /* bridge */ /* synthetic */ void asyncExecute(ExecutorContext executorContext, OpenAccountCenterParams openAccountCenterParams, DataCallback dataCallback) {
        asyncExecute2(executorContext, openAccountCenterParams, (DataCallback<ExecutorResult>) dataCallback);
    }

    /* renamed from: asyncExecute  reason: avoid collision after fix types in other method */
    public void asyncExecute2(final ExecutorContext executorContext, OpenAccountCenterParams openAccountCenterParams, final DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01abd95", new Object[]{this, executorContext, openAccountCenterParams, dataCallback});
        } else if (executorContext == null || executorContext.context == null || openAccountCenterParams == null || openAccountCenterParams.params == null) {
            callback(dataCallback, ExecutorResult.buildParamError(executorContext));
        } else {
            AccountCenterApi.getInstance().commonAc(openAccountCenterParams.needEcode, openAccountCenterParams.params, new RpcRequestCallback() { // from class: com.ali.user.mobile.ability.excutor.ac.OpenAccountCenterExcutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    String str;
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    String networkError = ResourceUtil.getNetworkError();
                    if (rpcResponse != null) {
                        hashMap.put("data", rpcResponse);
                        i = rpcResponse.code;
                        str = rpcResponse.message;
                    } else {
                        str = networkError;
                        i = 3;
                    }
                    OpenAccountCenterExcutor.this.callback(dataCallback, ExecutorResult.buildError(executorContext, hashMap, i, str));
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (rpcResponse != null) {
                        hashMap.put("data", rpcResponse);
                    }
                    OpenAccountCenterExcutor.this.callback(dataCallback, ExecutorResult.buildSuccess(executorContext, hashMap));
                }
            });
        }
    }
}
