package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SmsLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206185);
    }

    public static /* synthetic */ Object ipc$super(SmsLoginTask smsLoginTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/tasks/SmsLoginTask");
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            buildLoginParamWithCommit(commonDataCallback);
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
            LoginComponent.getInstance().smsLogin(loginBaseParam, rpcRequestCallback);
        }
    }
}
