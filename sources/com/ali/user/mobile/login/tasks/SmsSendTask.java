package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SmsSendTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206186);
    }

    public static /* synthetic */ Object ipc$super(SmsSendTask smsSendTask, String str, Object... objArr) {
        if (str.hashCode() == 459008092) {
            super.onReceiveSuccess((LoginBaseParam) objArr[0], (RpcResponse) objArr[1], (LoginTasksCallback) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/tasks/SmsSendTask");
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            buildLoginParamWithCommit(commonDataCallback, false);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.SMS_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        return LoginType.ServerLoginType.SMSLogin.getType();
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginComponent.getInstance().sendSmsByLogin(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void onReceiveSuccess(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5be85c", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else {
            super.onReceiveSuccess(loginBaseParam, rpcResponse, loginTasksCallback);
        }
    }
}
