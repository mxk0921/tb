package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.BackgroundExecutor;
import java.util.HashMap;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SimLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206181);
    }

    public static /* synthetic */ Object ipc$super(SimLoginTask simLoginTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/tasks/SimLoginTask");
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.SimLoginTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SimLoginTask.this.matchHistoryAccount();
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.SimLoginTask.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            SimLoginTask.this.fetchSimLoginToken(commonDataCallback);
                        }
                    });
                }
            });
        }
    }

    public void buildTokenParam(LoginBaseParam loginBaseParam, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ad095", new Object[]{this, loginBaseParam, str, str2, str3});
            return;
        }
        if (this.loginParam == null) {
            this.loginParam = new LoginBaseParam();
        }
        this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
        LoginBaseParam loginBaseParam2 = this.loginParam;
        loginBaseParam2.token = str;
        loginBaseParam2.tokenType = str2;
        loginBaseParam2.scene = str3;
        if (loginBaseParam2.ext == null) {
            loginBaseParam2.ext = new HashMap();
        }
        this.loginParam.ext.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.generateApiReferer());
        if (loginBaseParam != null) {
            LoginBaseParam loginBaseParam3 = this.loginParam;
            loginBaseParam3.sdkTraceId = loginBaseParam.sdkTraceId;
            loginBaseParam3.utPageName = loginBaseParam.utPageName;
            loginBaseParam3.loginSourceType = loginBaseParam.loginSourceType;
        }
    }

    public void fetchSimLoginToken(final CommonDataCallback commonDataCallback) {
        final String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909fd571", new Object[]{this, commonDataCallback});
            return;
        }
        if (this.loginParam == null) {
            LoginBaseParam loginBaseParam = new LoginBaseParam();
            this.loginParam = loginBaseParam;
            loginBaseParam.site = DataProviderFactory.getDataProvider().getSite();
        }
        TrackingModel trackingModel = this.trackingModel;
        if (trackingModel == null) {
            str = UTConstant.PageName.UT_PAGE_EXTEND;
        } else {
            str = trackingModel.pageName;
        }
        LoginBaseParam loginBaseParam2 = this.loginParam;
        if (trackingModel != null) {
            str2 = trackingModel.traceId;
        } else {
            str2 = ApiReferer.generateTraceId(getLocalLoginType(), str);
        }
        loginBaseParam2.sdkTraceId = str2;
        this.loginParam.loginSourceType = getLocalLoginType();
        LoginBaseParam loginBaseParam3 = this.loginParam;
        loginBaseParam3.utPageName = str;
        loginBaseParam3.nativeLoginType = getLoginType();
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.loginParam.sdkTraceId + "");
        UserTrackAdapter.control(str, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", getLocalLoginType(), hashMap);
        if (ServiceFactory.getService(NumberAuthService.class) != null) {
            showLoading();
            final Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            UserTrackAdapter.sendUT(str, "get_onekey_login_token_commit", "", getLocalLoginType(), properties);
            final long currentTimeMillis = System.currentTimeMillis();
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginToken("openLoginView", new NumAuthTokenCallback() { // from class: com.ali.user.mobile.login.tasks.SimLoginTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                public void onGetAuthTokenFail(int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("27f95aee", new Object[]{this, new Integer(i), str3});
                        return;
                    }
                    SimLoginTask.this.dismissLoading();
                    Properties properties2 = new Properties();
                    properties2.setProperty("code", i + "");
                    properties2.setProperty("cause", str3 + "");
                    UserTrackAdapter.sendUT(str, "get_login_token_fail", properties2);
                    String str4 = str;
                    UserTrackAdapter.sendUT(str4, "get_onekey_login_token_failure", i + "", SimLoginTask.this.getLocalLoginType(), properties);
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onFail(ErrorCode.SIM_LOGIN_GET_TOKEN_FAIL, str3);
                    }
                }

                @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                public void onGetAuthTokenSuccess(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20cbbe7a", new Object[]{this, str3});
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    LoginTLogAdapter.e("login_optimize", "onekey login getToken=" + (currentTimeMillis2 - currentTimeMillis));
                    UserTrackAdapter.sendUT(str, "get_login_token_success");
                    UserTrackAdapter.sendUT(str, "get_onekey_login_token_success", "", SimLoginTask.this.getLocalLoginType(), properties);
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", SimLoginTask.this.getLocalLoginType(), LoginComponent.getProperties(SimLoginTask.this.loginParam));
                    SimLoginTask simLoginTask = SimLoginTask.this;
                    simLoginTask.buildTokenParam(simLoginTask.loginParam, str3, TokenType.NUMBER, "");
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onSuccess(null);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.SIM_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        return LoginType.ServerLoginType.SimLogin.getType();
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().simLogin(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void onReceiverOtherError(RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8574615", new Object[]{this, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback == null) {
        } else {
            if (rpcResponse == null || rpcResponse.code != 14076) {
                if (rpcResponse == null) {
                    i = 1100;
                } else {
                    i = rpcResponse.code;
                }
                if (rpcResponse == null) {
                    str = ResourceUtil.getNetworkError();
                } else {
                    str = rpcResponse.message;
                }
                loginTasksCallback.onFail(new LoginException<>(i, str, rpcResponse));
                return;
            }
            loginTasksCallback.onFail(new LoginException<>(ErrorCode.SIM_LOGIN_14076_FAIL, rpcResponse.message, rpcResponse));
        }
    }
}
