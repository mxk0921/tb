package com.taobao.login4android.biz.logout;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BeforeLogoutBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206274);
    }

    public static void callBeforeLogout(LogoutParam logoutParam, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cc7cc", new Object[]{logoutParam, commonCallback});
            return;
        }
        try {
            RpcRequest rpcRequest = new RpcRequest();
            rpcRequest.API_NAME = ApiConstants.ApiName.BEFORE_LOGOUT;
            LogoutPreCheckRequest logoutPreCheckRequest = new LogoutPreCheckRequest();
            logoutPreCheckRequest.loggedUserNum = logoutParam.loggedUserNum;
            UserLoginServiceImpl.buildBaseRequest(null, logoutPreCheckRequest);
            rpcRequest.addParam("request", JSON.toJSONString(logoutPreCheckRequest));
            rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, PreLogoutResponse.class, new RpcRequestCallback() { // from class: com.taobao.login4android.biz.logout.BeforeLogoutBiz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        onError(rpcResponse);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        return;
                    }
                    if (rpcResponse != null) {
                        try {
                            if (rpcResponse.returnValue != 0) {
                                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToLoginPostPage(DataProviderFactory.getApplicationContext(), ((LogoutPreResponseData) ((PreLogoutResponse) rpcResponse).returnValue).h5Url, false, new LoginFilterCallback() { // from class: com.taobao.login4android.biz.logout.BeforeLogoutBiz.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.ali.user.mobile.filter.LoginFilterCallback
                                    public void onFail(int i, Map<String, String> map) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i), map});
                                        } else {
                                            BeforeLogoutBiz.callbackSuccess(CommonCallback.this);
                                        }
                                    }

                                    @Override // com.ali.user.mobile.filter.LoginFilterCallback
                                    public void onSuccess() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                        } else {
                                            BeforeLogoutBiz.callbackSuccess(CommonCallback.this);
                                        }
                                    }
                                });
                                return;
                            }
                        } catch (Throwable th) {
                            BeforeLogoutBiz.callbackSuccess(CommonCallback.this);
                            LoginTLogAdapter.w("login.BeforeLogoutBiz", "logout from server failed.", th);
                            return;
                        }
                    }
                    BeforeLogoutBiz.callbackSuccess(CommonCallback.this);
                }
            });
        } catch (Throwable th) {
            LoginTLogAdapter.w("login.BeforeLogoutBiz", "logout from server failed.", th);
            th.printStackTrace();
            callbackSuccess(commonCallback);
        }
    }

    public static void callbackSuccess(CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffcfc36", new Object[]{commonCallback});
        } else if (commonCallback != null) {
            commonCallback.onSuccess();
        }
    }
}
