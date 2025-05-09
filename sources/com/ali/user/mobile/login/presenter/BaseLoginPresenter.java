package com.ali.user.mobile.login.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.ability.excutor.ExecutorCenter;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.login.LoginExecutorParams;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.BasePresenter;
import com.ali.user.mobile.base.helper.SDKExceptionHelper;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.h5.MtopAccountCenterUrlResponseData;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.ali.user.mobile.url.model.AccountCenterParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.SmsCodeCacheUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BaseLoginPresenter implements BasePresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FACE_LOGIN_REQUEST = 1004;
    public static final int SEND_SMS_NICK_REQUEST = 1003;
    public static final int SEND_SMS_REQUEST = 1001;
    public static final String TAG = "login.".concat(BaseLoginPresenter.class.getSimpleName());
    public AliUserDialog mAliUserDialog;
    public LoginParam mLoginParam;
    public BaseLoginView mViewer;

    static {
        t2o.a(70254697);
        t2o.a(70254593);
    }

    public BaseLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        this.mViewer = baseLoginView;
        this.mLoginParam = loginParam;
        if (loginParam != null && TextUtils.isEmpty(loginParam.token)) {
            this.mLoginParam.site = this.mViewer.getLoginSite();
        }
    }

    public void addControl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144fd397", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.control(str, str2);
        }
    }

    public void addNativeLoginType(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b9642f", new Object[]{this, loginParam});
        } else if (this instanceof UserMobileLoginPresenter) {
            loginParam.nativeLoginType = LoginType.ServerLoginType.SMSLogin.getType();
        } else if (this instanceof UserLoginPresenter) {
            loginParam.nativeLoginType = LoginType.ServerLoginType.PasswordLogin.getType();
        } else if (this instanceof EmailLoginPresenter) {
            loginParam.nativeLoginType = LoginType.ServerLoginType.EmailLogin.getType();
        }
    }

    public void buildLoginParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b28bcd", new Object[]{this, str, str2});
        } else {
            buildLoginParam(str, str2, false);
        }
    }

    public TrackingModel buildTrackingModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackingModel) ipChange.ipc$dispatch("5f618518", new Object[]{this});
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = this.mViewer.getPageName();
        String localLoginType = getLocalLoginType();
        trackingModel.loginType = localLoginType;
        trackingModel.traceId = ApiReferer.generateTraceId(localLoginType, trackingModel.pageName);
        return trackingModel;
    }

    public void callApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b793b963", new Object[]{this});
        } else {
            LoginApi.tokenLogin(this.mLoginParam, null, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    }
                }
            });
        }
    }

    public void cleanDataHodler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d61d36", new Object[]{this});
            return;
        }
        LoginParam loginParam = this.mLoginParam;
        if (loginParam != null && !loginParam.isFromRegister && !loginParam.isFoundPassword) {
            loginParam.scene = null;
            loginParam.token = null;
            Map<String, String> map = loginParam.ext;
            if (map != null) {
                map.remove(LoginConstant.EXT_ACTION);
            }
        }
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            this.mViewer.dismissLoading();
        }
    }

    public void fetchUrlAndToWebView(Context context, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486d40c3", new Object[]{this, context, str, str2, str3});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            int loginSite = this.mViewer.getLoginSite();
            this.mViewer.showLoading();
            BaseLoginView baseLoginView2 = this.mViewer;
            if (baseLoginView2 instanceof BaseLoginFragment) {
                str4 = ((BaseLoginFragment) baseLoginView2).getPageName();
            } else {
                str4 = UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
            }
            String generateTraceId = ApiReferer.generateTraceId(str2, str4);
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", generateTraceId);
            UserTrackAdapter.control(str4, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, hashMap);
            try {
                final AccountCenterParam accountCenterParam = new AccountCenterParam();
                accountCenterParam.userInputName = str;
                accountCenterParam.scene = "foundpassword";
                accountCenterParam.sdkTraceId = generateTraceId;
                accountCenterParam.fromSite = loginSite;
                UrlFetchServiceImpl.getInstance().foundH5urls(accountCenterParam, new RpcRequestCallback() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onError(RpcResponse rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        } else {
                            onSuccess(rpcResponse);
                        }
                    }

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onSuccess(RpcResponse rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        } else {
                            BaseLoginPresenter.this.handleData(accountCenterParam, (MtopAccountCenterUrlResponseData) rpcResponse);
                        }
                    }
                });
            } catch (RpcException | Exception unused) {
            }
        }
    }

    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.PWD_LOGIN;
    }

    public LoginParam getLoginParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginParam) ipChange.ipc$dispatch("ee2f1432", new Object[]{this});
        }
        return this.mLoginParam;
    }

    public void handleData(AccountCenterParam accountCenterParam, MtopAccountCenterUrlResponseData mtopAccountCenterUrlResponseData) {
        BaseLoginView baseLoginView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839ebb62", new Object[]{this, accountCenterParam, mtopAccountCenterUrlResponseData});
            return;
        }
        BaseLoginView baseLoginView2 = this.mViewer;
        if (baseLoginView2 != null && baseLoginView2.isActive()) {
            try {
                try {
                } catch (RpcException e) {
                    SDKExceptionHelper.getInstance().rpcExceptionHandler(e);
                    baseLoginView = this.mViewer;
                    if (baseLoginView == null) {
                        return;
                    }
                } catch (Exception unused) {
                    baseLoginView = this.mViewer;
                    if (baseLoginView == null) {
                        return;
                    }
                }
                if (mtopAccountCenterUrlResponseData == null) {
                    this.mViewer.toast(ResourceUtil.getNetworkError(), 0);
                    BaseLoginView baseLoginView3 = this.mViewer;
                    if (baseLoginView3 != null) {
                        baseLoginView3.dismissLoading();
                        return;
                    }
                    return;
                }
                if (mtopAccountCenterUrlResponseData.h5Url != null) {
                    LoginParam loginParam = new LoginParam();
                    loginParam.tokenType = TokenType.FIND_PWD;
                    loginParam.sdkTraceId = accountCenterParam.sdkTraceId;
                    loginParam.loginSourceType = accountCenterParam.from;
                    BaseLoginView baseLoginView4 = this.mViewer;
                    if (baseLoginView4 instanceof BaseLoginFragment) {
                        loginParam.utPageName = ((BaseLoginFragment) baseLoginView4).getPageName();
                    } else {
                        loginParam.utPageName = UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
                    }
                    LoginReturnData loginReturnData = new LoginReturnData();
                    loginReturnData.site = this.mViewer.getLoginSite();
                    loginParam.errorCode = "0";
                    NavigatorManager.getInstance().navToWebViewPage(this.mViewer.getBaseActivity(), mtopAccountCenterUrlResponseData.h5Url, loginParam, loginReturnData);
                } else {
                    this.mViewer.toast(mtopAccountCenterUrlResponseData.errorMessage, 0);
                }
                baseLoginView = this.mViewer;
                if (baseLoginView == null) {
                    return;
                }
                baseLoginView.dismissLoading();
            } catch (Throwable th) {
                BaseLoginView baseLoginView5 = this.mViewer;
                if (baseLoginView5 != null) {
                    baseLoginView5.dismissLoading();
                }
                throw th;
            }
        }
    }

    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
            return;
        }
        UserTrackAdapter.sendUT("BaseLoginPresenterLogin");
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            LoginApi.tokenLogin(this.mLoginParam.clone(), null, this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        BaseLoginPresenter.this.dismissLoading();
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    BaseLoginView baseLoginView2 = BaseLoginPresenter.this.mViewer;
                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                        BaseLoginPresenter.this.dismissLoading();
                        if (loginException.getCode() == 700) {
                            BaseLoginPresenter baseLoginPresenter = BaseLoginPresenter.this;
                            baseLoginPresenter.onReceiveAlert(baseLoginPresenter.mLoginParam, loginException.getOrinResponse());
                            return;
                        }
                        BaseLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        BaseLoginPresenter.this.dismissLoading();
                    }
                }
            });
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        UserTrackAdapter.sendUT("onActivityResult");
        if (i != 257) {
            return;
        }
        if (i2 == 258 || i2 == 0) {
            onActivityResultForWebView(i2, intent);
            UserTrackAdapter.sendUT("onActivityResultForWebView");
        }
    }

    public void onActivityResultForWebView(int i, Intent intent) {
        LoginParam loginParam;
        LoginParam loginParam2;
        Map<String, String> map;
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29b07be", new Object[]{this, new Integer(i), intent});
        } else if ((intent != null && "quit".equals(intent.getStringExtra("action"))) || i == 0) {
            cleanDataHodler();
        } else if (intent != null) {
            try {
                loginParam = (LoginParam) intent.getSerializableExtra("loginParam");
            } catch (Exception e) {
                e.printStackTrace();
                loginParam = null;
            }
            if (loginParam == null || (map2 = loginParam.ext) == null || !"continueLogin".equals(map2.get(LoginConstant.EXT_ACTION))) {
                LoginParam loginParam3 = this.mLoginParam;
                if (loginParam3 != null && (map = loginParam3.ext) != null && "continueLogin".equals(map.get(LoginConstant.EXT_ACTION))) {
                    this.mLoginParam.h5QueryString = intent.getStringExtra(ApiConstants.ApiField.H5_QUERY_STRING);
                    login();
                } else if (this.mViewer != null && (loginParam2 = this.mLoginParam) != null) {
                    loginParam2.h5QueryString = intent.getStringExtra(ApiConstants.ApiField.H5_QUERY_STRING);
                    login();
                }
            } else {
                this.mLoginParam.h5QueryString = intent.getStringExtra(ApiConstants.ApiField.H5_QUERY_STRING);
                LoginParam loginParam4 = this.mLoginParam;
                loginParam4.scene = loginParam.scene;
                loginParam4.token = loginParam.token;
                login();
            }
        }
    }

    @Override // com.ali.user.mobile.base.BasePresenter
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        } else {
            this.mViewer = null;
        }
    }

    public void onFaceFailed(CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b9dadd", new Object[]{this, commonUICallback});
        } else if (commonUICallback != null) {
            commonUICallback.onResult(5004, null);
        }
    }

    public void onGetAccessTokenFail(CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49100a60", new Object[]{this, commonUICallback});
        } else if (commonUICallback != null) {
            commonUICallback.onResult(5006, null);
        }
    }

    public void onGetOneKeyLoginTokenFail(CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c365602", new Object[]{this, commonUICallback});
        } else if (commonUICallback != null) {
            commonUICallback.onResult(5006, null);
        }
    }

    public void onGetToastAlert(Activity activity, LoginParam loginParam, RpcResponse rpcResponse, CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac35e108", new Object[]{this, activity, loginParam, rpcResponse, commonUICallback});
        } else if (LoginType.LocalLoginType.PWD_LOGIN.equals(getLocalLoginType())) {
            onReceivePwdError(activity, loginParam, rpcResponse, commonUICallback);
        } else {
            onReceiveAlert(loginParam, rpcResponse);
        }
    }

    public void onNeedVerifyMobileForReg(CommonUICallback commonUICallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29eedc09", new Object[]{this, commonUICallback, str});
        } else if (commonUICallback != null) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("mobile", str);
            }
            commonUICallback.onResult(CommonUICallback.ACTION_ONEKEY_SEND_SMS, hashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceiveAlert(com.ali.user.mobile.model.LoginParam r12, com.ali.user.mobile.rpc.RpcResponse<com.ali.user.mobile.rpc.login.model.LoginReturnData> r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.mobile.login.presenter.BaseLoginPresenter.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "3d3ecfd1"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r11
            r4[r0] = r12
            r12 = 2
            r4[r12] = r13
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            com.ali.user.mobile.login.ui.BaseLoginView r12 = r11.mViewer
            if (r12 == 0) goto L_0x008f
            java.lang.String r12 = r13.message
            T r2 = r13.returnValue
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0062
            r4 = r2
            com.ali.user.mobile.rpc.login.model.LoginReturnData r4 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r4
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.extMap
            if (r4 == 0) goto L_0x0062
            com.ali.user.mobile.rpc.login.model.LoginReturnData r2 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r2
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.extMap
            java.lang.String r4 = "dialogTitle"
            boolean r2 = r2.containsKey(r4)
            if (r2 == 0) goto L_0x0044
            T r2 = r13.returnValue
            com.ali.user.mobile.rpc.login.model.LoginReturnData r2 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r2
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.extMap
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0045
        L_0x0044:
            r2 = r3
        L_0x0045:
            T r4 = r13.returnValue
            com.ali.user.mobile.rpc.login.model.LoginReturnData r4 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r4
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.extMap
            java.lang.String r5 = "dialogContent"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x0060
            T r12 = r13.returnValue
            com.ali.user.mobile.rpc.login.model.LoginReturnData r12 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r12
            java.util.Map<java.lang.String, java.lang.String> r12 = r12.extMap
            java.lang.Object r12 = r12.get(r5)
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0064
        L_0x0060:
            r0 = 0
            goto L_0x0064
        L_0x0062:
            r2 = r3
            goto L_0x0060
        L_0x0064:
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L_0x006e
            java.lang.String r12 = com.ali.user.mobile.utils.ResourceUtil.getNetworkError()
        L_0x006e:
            if (r0 != 0) goto L_0x0073
            r5 = r12
            r6 = r3
            goto L_0x0075
        L_0x0073:
            r6 = r12
            r5 = r2
        L_0x0075:
            com.ali.user.mobile.login.ui.BaseLoginView r4 = r11.mViewer
            android.app.Activity r12 = r4.getBaseActivity()
            android.content.res.Resources r12 = r12.getResources()
            int r13 = com.taobao.taobao.R.string.aliuser_common_ok
            java.lang.String r7 = r12.getString(r13)
            com.ali.user.mobile.login.presenter.BaseLoginPresenter$4 r8 = new com.ali.user.mobile.login.presenter.BaseLoginPresenter$4
            r8.<init>()
            r9 = 0
            r10 = 0
            r4.alert(r5, r6, r7, r8, r9, r10)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.presenter.BaseLoginPresenter.onReceiveAlert(com.ali.user.mobile.model.LoginParam, com.ali.user.mobile.rpc.RpcResponse):void");
    }

    public void onReceiveToast(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15a0ba6", new Object[]{this, loginParam, rpcResponse});
        } else {
            onReceiveAlert(loginParam, rpcResponse);
        }
    }

    @Override // com.ali.user.mobile.base.BasePresenter
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        LoginParam loginParam = this.mLoginParam;
        if (loginParam == null) {
            return;
        }
        if (!TextUtils.isEmpty(loginParam.token)) {
            callApi();
        } else if (!TextUtils.isEmpty(this.mLoginParam.loginId)) {
            this.mViewer.setLoginAccountInfo(this.mLoginParam.loginId);
        }
    }

    public void sendToast(ExecutorResult executorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169e92fb", new Object[]{this, executorResult});
            return;
        }
        String str = executorResult.msg;
        if (TextUtils.isEmpty(str)) {
            str = ResourceUtil.getNetworkError();
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null) {
            baseLoginView.toast(str, 0);
        }
    }

    public void buildLoginParam(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9fa0a7", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.isFromAccount = this.mViewer.isHistoryMode();
        this.mLoginParam.site = this.mViewer.getLoginSite();
        this.mLoginParam.utPageName = this.mViewer.getPageName();
        LoginParam loginParam = this.mLoginParam;
        loginParam.loginId = str;
        loginParam.password = str2;
        if (loginParam.ext == null) {
            loginParam.ext = new HashMap();
        }
        this.mLoginParam.ext.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.generateApiReferer());
        if (z) {
            this.mLoginParam.ext.put(ApiConstants.ApiField.MOBILE_CHECK_SIMILARITY, "true");
        } else {
            this.mLoginParam.ext.put(ApiConstants.ApiField.MOBILE_CHECK_SIMILARITY, "false");
        }
        LoginParam loginParam2 = this.mLoginParam;
        loginParam2.deviceTokenKey = "";
        loginParam2.hid = 0L;
        addNativeLoginType(loginParam2);
    }

    public void onReceivePwdError(final Activity activity, final LoginParam loginParam, RpcResponse rpcResponse, final CommonUICallback commonUICallback) {
        AliUserDialog.PositiveClickListener positiveClickListener;
        String str;
        String str2;
        String str3;
        String str4;
        final boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9f3a45", new Object[]{this, activity, loginParam, rpcResponse, commonUICallback});
        } else if (activity != null && !activity.isFinishing()) {
            DefaultLoginResponseData defaultLoginResponseData = (DefaultLoginResponseData) rpcResponse;
            UserLoginActivity userLoginActivity = (UserLoginActivity) activity;
            String string = activity.getResources().getString(R.string.aliuser_common_ok);
            String str5 = "";
            if (defaultLoginResponseData != null && !TextUtils.isEmpty(defaultLoginResponseData.codeGroup) && loginParam != null && !TextUtils.isDigitsOnly(loginParam.loginId) && TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_SMS_ERROR, defaultLoginResponseData.codeGroup)) {
                T t = defaultLoginResponseData.returnValue;
                if (t == 0 || ((LoginReturnData) t).extMap == null) {
                    str4 = str5;
                    str3 = str4;
                } else {
                    str4 = ((LoginReturnData) t).extMap.get("dialogTitle");
                    str3 = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogContent");
                }
                str2 = activity.getResources().getString(R.string.aliuser_login_sms_login2);
                str = activity.getResources().getString(R.string.aliuser_cancel);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        AliUserDialog aliUserDialog = BaseLoginPresenter.this.mAliUserDialog;
                        if (aliUserDialog != null) {
                            aliUserDialog.dismiss();
                        }
                        BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Nick-Sms-Login");
                        CommonUICallback commonUICallback2 = commonUICallback;
                        if (commonUICallback2 != null) {
                            commonUICallback2.onResult(5001, null);
                        }
                    }
                };
            } else if (defaultLoginResponseData == null || TextUtils.isEmpty(defaultLoginResponseData.codeGroup) || loginParam == null || !"1".equals(loginParam.fromRecommendLogin) || !TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_FACE_ERROR, defaultLoginResponseData.codeGroup) || ServiceFactory.getService(FaceService.class) == null) {
                if (defaultLoginResponseData != null && !TextUtils.isEmpty(defaultLoginResponseData.codeGroup) && loginParam != null && userLoginActivity.mAlipayInstall && TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_ALIPAY, defaultLoginResponseData.codeGroup) && CommonUtil.isInABTestRegion(LoginSwitch.PWD_ERROR_TO_ALIPAY, 10000)) {
                    T t2 = defaultLoginResponseData.returnValue;
                    if (t2 == 0 || ((LoginReturnData) t2).extMap == null) {
                        str4 = str5;
                        str3 = str4;
                    } else {
                        str4 = ((LoginReturnData) t2).extMap.get("dialogTitle");
                        str3 = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogContent");
                    }
                    str2 = activity.getResources().getString(R.string.ali_user_alipay_quick_login);
                    str = activity.getResources().getString(R.string.aliuser_re_enter);
                    positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            Activity activity2 = activity;
                            if (activity2 != null && !activity2.isFinishing()) {
                                AliUserDialog aliUserDialog = BaseLoginPresenter.this.mAliUserDialog;
                                if (aliUserDialog != null) {
                                    aliUserDialog.dismiss();
                                }
                                BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Nick-Alipay-Login");
                                CommonUICallback commonUICallback2 = commonUICallback;
                                if (commonUICallback2 != null) {
                                    commonUICallback2.onResult(5003, null);
                                }
                            }
                        }
                    };
                } else if (defaultLoginResponseData == null || TextUtils.isEmpty(defaultLoginResponseData.codeGroup) || loginParam == null || (!TextUtils.equals(ApiConstants.CodeGroup.PWD_ERROR, defaultLoginResponseData.codeGroup) && !TextUtils.equals("noRecord", defaultLoginResponseData.codeGroup))) {
                    positiveClickListener = null;
                    str = string;
                    str4 = str5;
                    str3 = str4;
                    str2 = str3;
                } else {
                    String string2 = activity.getResources().getString(R.string.aliuser_alert_findpwd);
                    positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            Activity activity2 = activity;
                            if (activity2 != null && !activity2.isFinishing()) {
                                BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Alert-ResetPwd");
                                BaseLoginPresenter baseLoginPresenter = BaseLoginPresenter.this;
                                Activity activity3 = activity;
                                LoginParam loginParam2 = loginParam;
                                baseLoginPresenter.fetchUrlAndToWebView(activity3, loginParam2.loginId, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, loginParam2.source);
                                AliUserDialog aliUserDialog = BaseLoginPresenter.this.mAliUserDialog;
                                if (aliUserDialog != null) {
                                    aliUserDialog.dismiss();
                                }
                            }
                        }
                    };
                    str = string;
                    str3 = str5;
                    str2 = string2;
                    str4 = str3;
                }
                z = false;
            } else {
                T t3 = defaultLoginResponseData.returnValue;
                if (t3 == 0 || ((LoginReturnData) t3).extMap == null) {
                    str4 = str5;
                    str3 = str4;
                } else {
                    str4 = ((LoginReturnData) t3).extMap.get("dialogTitle");
                    str3 = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogContent");
                }
                str2 = activity.getResources().getString(R.string.aliuser_scan_login_text);
                str = activity.getResources().getString(R.string.aliuser_cancel);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 != null && !activity2.isFinishing()) {
                            AliUserDialog aliUserDialog = BaseLoginPresenter.this.mAliUserDialog;
                            if (aliUserDialog != null) {
                                aliUserDialog.dismiss();
                            }
                            BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Nick-Face-Login");
                            CommonUICallback commonUICallback2 = commonUICallback;
                            if (commonUICallback2 != null) {
                                commonUICallback2.onResult(5002, null);
                            }
                        }
                    }
                };
            }
            if (TextUtils.isEmpty(str3)) {
                if (defaultLoginResponseData != null) {
                    str3 = defaultLoginResponseData.message;
                    if ("PASSWORD_ERROR_NEED_SMS_LOGIN".equals(str3) || "PASSWORD_ERROR_NEED_FACE_SCAN_LOGIN".equals(str3)) {
                        str3 = ResourceUtil.getStringById("aliuser_pwd_error");
                    }
                } else {
                    str3 = str5;
                }
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = str3;
            } else {
                str5 = str3;
            }
            AliUserDialog.Builder onNegativeClickListener = AliUserDialog.Builder(activity).setTitle(str4).setMessage(str5).setOnNegativeClickListener(str, new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
                public void onClick(View view) {
                    Activity activity2;
                    CommonUICallback commonUICallback2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    AliUserDialog aliUserDialog = BaseLoginPresenter.this.mAliUserDialog;
                    if (aliUserDialog != null) {
                        aliUserDialog.dismiss();
                    }
                    if (z && (activity2 = activity) != null && !activity2.isFinishing() && (commonUICallback2 = commonUICallback) != null) {
                        commonUICallback2.onResult(CommonUICallback.ACTION_PWD_ERROR_SHOW_EYE, null);
                    }
                }
            });
            if (!TextUtils.isEmpty(str2)) {
                onNegativeClickListener.setOnPositiveClickListener(str2, positiveClickListener);
            }
            this.mAliUserDialog = onNegativeClickListener.build().shown();
            HashMap hashMap = new HashMap();
            if (defaultLoginResponseData != null) {
                hashMap.put("code", String.valueOf(defaultLoginResponseData.code));
            }
            if (defaultLoginResponseData != null && !TextUtils.isEmpty(defaultLoginResponseData.codeGroup)) {
                hashMap.put("codeGroup", defaultLoginResponseData.codeGroup);
            }
            UserTrackAdapter.sendUserTrack(loginParam.utPageName, "ShowPwdError", hashMap);
        }
    }

    public void login(final Activity activity, final LoginParam loginParam, final CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4f06fc", new Object[]{this, activity, loginParam, commonUICallback});
            return;
        }
        LoginExecutorParams loginExecutorParams = new LoginExecutorParams();
        loginExecutorParams.type = getLocalLoginType();
        loginExecutorParams.params = loginParam;
        ExecutorCenter.execute("login", new ExecutorContext.ExcutorContextBuilder().context(activity).baseView(this.mViewer).params(loginExecutorParams).build(), new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void result(ExecutorResult executorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                } else if (!executorResult.success) {
                    int i = executorResult.code;
                    if (i == 3002) {
                        BaseLoginView baseLoginView = BaseLoginPresenter.this.mViewer;
                        if (baseLoginView != null) {
                            baseLoginView.toast(executorResult.msg, 0);
                        }
                    } else if (i != 3007) {
                        if (i == 3013) {
                            BaseLoginPresenter.this.onGetAccessTokenFail(commonUICallback);
                        } else if (i == 3010) {
                            BaseLoginPresenter.this.onGetOneKeyLoginTokenFail(commonUICallback);
                        } else if (i == 3008) {
                            BaseLoginPresenter.this.onFaceFailed(commonUICallback);
                        } else {
                            Map<String, Object> map = executorResult.bizInfo;
                            if (map == null || !(map.get("data") instanceof RpcResponse)) {
                                BaseLoginView baseLoginView2 = BaseLoginPresenter.this.mViewer;
                                if (baseLoginView2 != null) {
                                    baseLoginView2.toast(executorResult.msg, 0);
                                    return;
                                }
                                return;
                            }
                            RpcResponse rpcResponse = (RpcResponse) executorResult.bizInfo.get("data");
                            int i2 = rpcResponse.code;
                            if (i2 == 14044 || i2 == 14163) {
                                BaseLoginPresenter.this.onNeedVerifyMobileForReg(commonUICallback, ((LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue).mobile);
                            } else if (i2 == 14047 || i2 == 14076) {
                                BaseLoginPresenter.this.onGetOneKeyLoginTokenFail(commonUICallback);
                            } else if (ApiConstants.isAlertType(rpcResponse)) {
                                BaseLoginPresenter.this.onGetToastAlert(activity, loginParam, rpcResponse, commonUICallback);
                            } else {
                                BaseLoginView baseLoginView3 = BaseLoginPresenter.this.mViewer;
                                if (baseLoginView3 != null) {
                                    baseLoginView3.toast(executorResult.msg, 0);
                                }
                            }
                        }
                    }
                } else if (LoginType.LocalLoginType.SMS_LOGIN.equals(BaseLoginPresenter.this.getLocalLoginType()) || LoginType.LocalLoginType.NICK_SMS_LOGIN.equals(BaseLoginPresenter.this.getLocalLoginType())) {
                    SmsCodeCacheUtils.clearSmsCodeCache();
                }
            }
        });
    }
}
