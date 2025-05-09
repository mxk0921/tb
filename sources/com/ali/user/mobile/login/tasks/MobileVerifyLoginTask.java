package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.BackgroundExecutor;
import java.util.HashMap;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MobileVerifyLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206171);
    }

    public static /* synthetic */ Object ipc$super(MobileVerifyLoginTask mobileVerifyLoginTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/tasks/MobileVerifyLoginTask");
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MobileVerifyLoginTask.this.matchHistoryAccount();
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            MobileVerifyLoginTask.this.fetchVerificationToken(commonDataCallback);
                        }
                    });
                }
            });
        }
    }

    public void fetchVerificationToken(final CommonDataCallback commonDataCallback) {
        final String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93a607a", new Object[]{this, commonDataCallback});
            return;
        }
        TrackingModel trackingModel = this.trackingModel;
        if (trackingModel == null) {
            str = UTConstant.PageName.UT_PAGE_EXTEND;
        } else {
            str = trackingModel.pageName;
        }
        if (this.loginParam == null) {
            LoginBaseParam loginBaseParam = new LoginBaseParam();
            this.loginParam = loginBaseParam;
            loginBaseParam.site = DataProviderFactory.getDataProvider().getSite();
        }
        LoginBaseParam loginBaseParam2 = this.loginParam;
        TrackingModel trackingModel2 = this.trackingModel;
        if (trackingModel2 != null) {
            str2 = trackingModel2.traceId;
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
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            UserTrackAdapter.sendUT(str, "sim_access_code_commit", "", getLocalLoginType(), properties);
            final long currentTimeMillis = System.currentTimeMillis();
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getToken(new NumAuthTokenCallback() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                public void onGetAuthTokenFail(int i, final String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("27f95aee", new Object[]{this, new Integer(i), str3});
                        return;
                    }
                    MobileVerifyLoginTask.this.dismissLoading();
                    Properties properties2 = new Properties();
                    properties2.setProperty("monitor", "T");
                    String str4 = str;
                    UserTrackAdapter.sendUT(str4, "sim_access_code_failure", i + "", MobileVerifyLoginTask.this.getLocalLoginType(), properties2);
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            CommonDataCallback commonDataCallback2 = commonDataCallback;
                            if (commonDataCallback2 != null) {
                                commonDataCallback2.onFail(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, str3);
                            }
                        }
                    });
                }

                @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                public void onGetAuthTokenSuccess(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20cbbe7a", new Object[]{this, str3});
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    LoginTLogAdapter.e("login_optimize", "simVerify login getToken=" + (currentTimeMillis2 - currentTimeMillis));
                    MobileVerifyLoginTask.this.dismissLoading();
                    Properties properties2 = new Properties();
                    properties2.setProperty("monitor", "T");
                    UserTrackAdapter.sendUT(str, "sim_access_code_success", "", MobileVerifyLoginTask.this.getLocalLoginType(), properties2);
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", MobileVerifyLoginTask.this.getLocalLoginType(), LoginComponent.getProperties(MobileVerifyLoginTask.this.loginParam));
                    LoginBaseParam loginBaseParam4 = MobileVerifyLoginTask.this.loginParam;
                    loginBaseParam4.token = str3;
                    loginBaseParam4.tokenType = TokenType.NUMBER;
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onSuccess(null);
                    }
                }
            });
        } else if (commonDataCallback != null) {
            commonDataCallback.onFail(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, "");
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        return LoginType.ServerLoginType.MobileVerifyLogin.getType();
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().simLoginWithUserInput(loginBaseParam, rpcRequestCallback);
        }
    }
}
