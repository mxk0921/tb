package com.ali.user.mobile.login.tasks;

import android.text.TextUtils;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TokenLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206187);
    }

    public static /* synthetic */ Object ipc$super(TokenLoginTask tokenLoginTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/tasks/TokenLoginTask");
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.TOKEN_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        LoginBaseParam loginBaseParam = this.loginParam;
        if (loginBaseParam == null || TextUtils.isEmpty(loginBaseParam.nativeLoginType)) {
            return LoginType.ServerLoginType.TokenLogin.getType();
        }
        return this.loginParam.nativeLoginType;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().loginByToken(loginBaseParam, rpcRequestCallback);
        }
    }
}
