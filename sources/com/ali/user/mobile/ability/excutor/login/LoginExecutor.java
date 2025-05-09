package com.ali.user.mobile.ability.excutor.login;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginExecutor extends BaseExecutor<LoginExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206051);
    }

    public static /* synthetic */ Object ipc$super(LoginExecutor loginExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/login/LoginExecutor");
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public /* bridge */ /* synthetic */ void asyncExecute(ExecutorContext executorContext, LoginExecutorParams loginExecutorParams, DataCallback dataCallback) {
        asyncExecute2(executorContext, loginExecutorParams, (DataCallback<ExecutorResult>) dataCallback);
    }

    /* renamed from: asyncExecute  reason: avoid collision after fix types in other method */
    public void asyncExecute2(final ExecutorContext executorContext, LoginExecutorParams loginExecutorParams, final DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30748690", new Object[]{this, executorContext, loginExecutorParams, dataCallback});
        } else if (executorContext == null || executorContext.context == null || loginExecutorParams == null || loginExecutorParams.params == null || TextUtils.isEmpty(loginExecutorParams.type)) {
            callback(dataCallback, ExecutorResult.buildParamError(executorContext));
        } else {
            LoginTasksCallback<LoginReturnData> loginTasksCallback = new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.ability.excutor.login.LoginExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        LoginExecutor.this.callback(dataCallback, ExecutorResult.buildCancelError(executorContext));
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else if (loginException == null) {
                        LoginExecutor loginExecutor = LoginExecutor.this;
                        DataCallback<ExecutorResult> dataCallback2 = dataCallback;
                        ExecutorContext executorContext2 = executorContext;
                        if (loginException == null) {
                            str = "";
                        } else {
                            str = loginException.getMsg();
                        }
                        loginExecutor.callback(dataCallback2, ExecutorResult.buildEmptyResultError(executorContext2, str));
                    } else {
                        int code = loginException.getCode();
                        String msg = loginException.getMsg();
                        HashMap hashMap = new HashMap();
                        if (loginException.getOrinResponse() != null) {
                            hashMap.put("data", loginException.getOrinResponse());
                        }
                        LoginExecutor.this.callback(dataCallback, ExecutorResult.buildError(executorContext, hashMap, code, msg));
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", rpcResponse);
                    LoginExecutor.this.callback(dataCallback, ExecutorResult.buildSuccess(executorContext, hashMap));
                }
            };
            SNSPlatform convertSNSPlatform = SNSPlatform.convertSNSPlatform(loginExecutorParams.type);
            if (convertSNSPlatform != null) {
                Context context = executorContext.context;
                if (!(context instanceof Activity)) {
                    callback(dataCallback, ExecutorResult.buildParamError(executorContext));
                } else {
                    LoginApi.snsLogin(convertSNSPlatform, loginExecutorParams.params, (Activity) context, loginExecutorParams.obj, loginTasksCallback);
                }
            } else {
                LoginApi.commonLogin(loginExecutorParams.type, loginExecutorParams.params, executorContext.mView, loginTasksCallback);
            }
        }
    }
}
