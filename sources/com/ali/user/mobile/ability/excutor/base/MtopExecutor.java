package com.ali.user.mobile.ability.excutor.base;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.alipay.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtopExecutor extends BaseExecutor<MtopExcutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MtopExcutorParams<T> extends ExecutorParams {
        public String apiName;
        public String host;
        public Class<T> resultType;
        public String userId;
        public String apiVersion = "1.0";
        public boolean isNeedEcode = false;
        public int option = 0;
        public int timeout = RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND;
        public ArrayList<String> pName = new ArrayList<>();
        public ArrayList<Object> pValue = new ArrayList<>();

        static {
            t2o.a(69206044);
        }
    }

    static {
        t2o.a(69206042);
    }

    public static /* synthetic */ Object ipc$super(MtopExecutor mtopExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/base/MtopExecutor");
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public /* bridge */ /* synthetic */ void asyncExecute(ExecutorContext executorContext, MtopExcutorParams mtopExcutorParams, DataCallback dataCallback) {
        asyncExecute2(executorContext, mtopExcutorParams, (DataCallback<ExecutorResult>) dataCallback);
    }

    public void buildResult(boolean z, RpcResponse rpcResponse, ExecutorContext executorContext, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c6b02c", new Object[]{this, new Boolean(z), rpcResponse, executorContext, dataCallback});
            return;
        }
        ExecutorResult executorResult = new ExecutorResult(z, executorContext);
        if (rpcResponse != null) {
            HashMap hashMap = new HashMap();
            executorResult.bizInfo = hashMap;
            hashMap.put("data", rpcResponse);
            executorResult.code = rpcResponse.code;
            executorResult.msg = rpcResponse.message;
        } else {
            executorResult.code = 406;
        }
        if (dataCallback != null) {
            dataCallback.result(executorResult);
        }
    }

    /* renamed from: asyncExecute  reason: avoid collision after fix types in other method */
    public void asyncExecute2(final ExecutorContext executorContext, MtopExcutorParams mtopExcutorParams, final DataCallback<ExecutorResult> dataCallback) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9878ef9", new Object[]{this, executorContext, mtopExcutorParams, dataCallback});
        } else if (mtopExcutorParams != null && (str = mtopExcutorParams.apiName) != null) {
            if (str.isEmpty() && dataCallback != null) {
                dataCallback.result(new ExecutorResult(false, executorContext));
            }
            RpcRequest rpcRequest = new RpcRequest();
            rpcRequest.API_NAME = mtopExcutorParams.apiName;
            rpcRequest.VERSION = mtopExcutorParams.apiVersion;
            String str2 = mtopExcutorParams.host;
            rpcRequest.dailyDomain = str2;
            rpcRequest.onlineDomain = str2;
            rpcRequest.preDomain = str2;
            rpcRequest.paramNames = mtopExcutorParams.pName;
            rpcRequest.paramValues = mtopExcutorParams.pValue;
            if (mtopExcutorParams.option != 1) {
                z = false;
            }
            rpcRequest.SHOW_LOGIN_UI = z;
            boolean z2 = mtopExcutorParams.isNeedEcode;
            rpcRequest.NEED_ECODE = z2;
            rpcRequest.NEED_SESSION = z2;
            int i = mtopExcutorParams.timeout;
            rpcRequest.connectionTimeoutMilliSecond = i;
            rpcRequest.socketTimeoutMilliSecond = i;
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, (Class) mtopExcutorParams.resultType, new RpcRequestCallback() { // from class: com.ali.user.mobile.ability.excutor.base.MtopExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        MtopExecutor.this.buildResult(false, rpcResponse, executorContext, dataCallback);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        MtopExecutor.this.buildResult(true, rpcResponse, executorContext, dataCallback);
                    }
                }
            });
        }
    }
}
