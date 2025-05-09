package com.ali.user.mobile.login;

import android.content.Context;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.LoginService;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginServiceImpl implements LoginService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int ONEKEY_LOGIN_FAIL_CODE_LOGIN_DATA_NULL = -1;
    private final int ONEKEY_LOGIN_FAIL_CANCEL = -4;
    private final int SIM_VERIFY_FAIL = -5;
    private final int SIM_VERIFY_CANCEL = -6;
    private final int PWD_VERIFY_FAIL = -7;
    private final int PWD_VERIFY_CANCEL = -8;

    static {
        t2o.a(70254595);
        t2o.a(68157607);
    }

    private String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return UTConstant.PageName.UT_PAGE_EXTEND;
    }

    @Override // com.ali.user.mobile.service.LoginService
    public void onekeyLogin(Context context, Map<String, String> map, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acb8e5", new Object[]{this, context, map, commonCallback});
        } else if (commonCallback != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SIM_LOGIN, getPageName());
            loginParam.loginSourceType = LoginType.LocalLoginType.SIM_LOGIN;
            loginParam.utPageName = getPageName();
            TrackingModel trackingModel = new TrackingModel();
            trackingModel.pageName = getPageName();
            trackingModel.loginType = LoginType.LocalLoginType.SIM_LOGIN;
            trackingModel.traceId = loginParam.sdkTraceId;
            LoginApi.simLogin(loginParam, trackingModel, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.LoginServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        commonCallback.onFail(-4, ResourceUtil.getNetworkError());
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else {
                        commonCallback.onFail(-1, ResourceUtil.getNetworkError());
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        commonCallback.onSuccess();
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.service.LoginService
    public void pwdLogin(LoginParam loginParam, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b4d501", new Object[]{this, loginParam, commonCallback});
            return;
        }
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SIM_LOGIN, getPageName());
        loginParam.loginSourceType = LoginType.LocalLoginType.PWD_LOGIN;
        loginParam.utPageName = getPageName();
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = getPageName();
        trackingModel.loginType = LoginType.LocalLoginType.PWD_LOGIN;
        trackingModel.traceId = loginParam.sdkTraceId;
        LoginApi.pwdLogin(loginParam, trackingModel, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.LoginServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    commonCallback.onFail(-8, ResourceUtil.getNetworkError());
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                } else if (loginException == null || loginException.getOrinResponse() == null || !(loginException.getCode() == 800 || loginException.getCode() == 700)) {
                    commonCallback.onFail(-7, ResourceUtil.getNetworkError());
                } else {
                    commonCallback.onFail(-7, loginException.getOrinResponse().message);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else {
                    commonCallback.onSuccess();
                }
            }
        });
    }

    @Override // com.ali.user.mobile.service.LoginService
    public void touristLogin(String str, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3490b245", new Object[]{this, str, loginParam});
        }
    }

    @Override // com.ali.user.mobile.service.LoginService
    public void mobileVerifyLogin(Context context, LoginParam loginParam, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97b7fc1", new Object[]{this, context, loginParam, commonCallback});
        } else if (commonCallback != null) {
            loginParam.isFromAccount = true;
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, getPageName());
            loginParam.loginSourceType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
            loginParam.utPageName = getPageName();
            TrackingModel trackingModel = new TrackingModel();
            trackingModel.pageName = getPageName();
            trackingModel.loginType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
            trackingModel.traceId = loginParam.sdkTraceId;
            LoginApi.mobileVerifyLogin(loginParam, trackingModel, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.LoginServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        commonCallback.onFail(-6, ResourceUtil.getNetworkError());
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else {
                        commonCallback.onFail(-5, ResourceUtil.getNetworkError());
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        commonCallback.onSuccess();
                    }
                }
            });
        }
    }
}
