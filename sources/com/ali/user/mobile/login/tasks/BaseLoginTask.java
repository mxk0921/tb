package com.ali.user.mobile.login.tasks;

import android.text.TextUtils;
import android.widget.Toast;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.BaseView;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.eventbus.Event;
import com.ali.user.mobile.eventbus.EventBus;
import com.ali.user.mobile.eventbus.EventBusEnum;
import com.ali.user.mobile.eventbus.EventListener;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.service.impl.UrlUtil;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.BackgroundExecutor;
import com.taobao.login4android.utils.LoginSwitch;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.mop;
import tb.o0v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = BaseLoginTask.class.getSimpleName();
    public WeakReference<BaseView> baseView;
    public LoginBaseParam loginParam;
    public TrackingModel trackingModel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class LoginRpcRequestCallback implements RpcRequestCallback<LoginReturnData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final LoginBaseParam loginParam;
        private final LoginTasksCallback<LoginReturnData> loginResultCallback;

        static {
            t2o.a(69206158);
            t2o.a(68157468);
        }

        public LoginRpcRequestCallback(LoginBaseParam loginBaseParam, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
            this.loginParam = loginBaseParam;
            this.loginResultCallback = loginTasksCallback;
        }

        @Override // com.ali.user.mobile.callback.RpcRequestCallback
        public void onError(RpcResponse<LoginReturnData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                return;
            }
            BaseLoginTask.this.dismissLoading();
            BaseLoginTask.this.processLoginResult(this.loginParam, rpcResponse, this.loginResultCallback);
        }

        @Override // com.ali.user.mobile.callback.RpcRequestCallback
        public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
            } else if (rpcResponse == null || !"SUCCESS".equals(rpcResponse.actionType)) {
                onError(rpcResponse);
            } else {
                if (LoginSwitch.getSwitch("dismissOrange", "false")) {
                    BaseLoginTask.this.dismissLoading();
                }
                BaseLoginTask.this.processLoginResult(this.loginParam, rpcResponse, this.loginResultCallback);
            }
        }
    }

    static {
        t2o.a(69206146);
    }

    public static /* synthetic */ void access$000(BaseLoginTask baseLoginTask, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da10a578", new Object[]{baseLoginTask, new Boolean(z)});
        } else {
            baseLoginTask.doBuild(z);
        }
    }

    public static /* synthetic */ RpcRequestCallback access$100(BaseLoginTask baseLoginTask, LoginBaseParam loginBaseParam, LoginTasksCallback loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequestCallback) ipChange.ipc$dispatch("164aeb0c", new Object[]{baseLoginTask, loginBaseParam, loginTasksCallback});
        }
        return baseLoginTask.createLoginRpcCallback(loginBaseParam, loginTasksCallback);
    }

    private String calLoginType(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4619b636", new Object[]{this, loginBaseParam});
        }
        String loginType = getLoginType();
        if (TextUtils.isEmpty(loginType) && loginBaseParam != null && !TextUtils.isEmpty(loginBaseParam.snsType)) {
            loginType = o0v.b(loginBaseParam.snsType);
        }
        if (!TextUtils.isEmpty(loginType) || loginBaseParam == null || TextUtils.isEmpty(loginBaseParam.nativeLoginType)) {
            return loginType;
        }
        return loginBaseParam.nativeLoginType;
    }

    private RpcRequestCallback<LoginReturnData> createLoginRpcCallback(LoginBaseParam loginBaseParam, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequestCallback) ipChange.ipc$dispatch("cf4899a3", new Object[]{this, loginBaseParam, loginTasksCallback});
        }
        return new LoginRpcRequestCallback(loginBaseParam, loginTasksCallback);
    }

    private void doBuild(boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e880c46a", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            TrackingModel trackingModel = this.trackingModel;
            if (trackingModel == null) {
                str = UTConstant.PageName.UT_PAGE_EXTEND;
            } else {
                str = trackingModel.pageName;
            }
            LoginBaseParam loginBaseParam = this.loginParam;
            if (loginBaseParam.ext == null) {
                loginBaseParam.ext = new HashMap();
            }
            this.loginParam.ext.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.generateApiReferer());
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
            if (z) {
                UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", getLocalLoginType(), LoginComponent.getProperties(this.loginParam));
            }
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "doBuildException ", th);
        }
    }

    private void showToast(RpcResponse<LoginReturnData> rpcResponse, String str) {
        LoginReturnData loginReturnData;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a58fda6", new Object[]{this, rpcResponse, str});
        } else if (rpcResponse != null && (loginReturnData = rpcResponse.returnValue) != null && (map = loginReturnData.extMap) != null && map.containsKey(str)) {
            Toast.makeText(DataProviderFactory.getApplicationContext(), loginReturnData.extMap.get(str), 0).show();
        }
    }

    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        commonDataCallback.onSuccess(null);
                    }
                }
            });
        }
    }

    public void buildLoginParamWithCommit(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fcab6f", new Object[]{this, commonDataCallback});
        } else {
            buildLoginParamWithCommit(commonDataCallback, true);
        }
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    WeakReference<BaseView> weakReference = BaseLoginTask.this.baseView;
                    if (weakReference != null && weakReference.get() != null) {
                        BaseLoginTask.this.baseView.get().dismissLoading();
                    }
                }
            });
        }
    }

    public abstract String getLocalLoginType();

    public abstract String getLoginType();

    public abstract void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback);

    public void invokeTokenLoginRpc(LoginBaseParam loginBaseParam, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db65b6a3", new Object[]{this, loginBaseParam, loginTasksCallback});
            return;
        }
        showLoading();
        LoginDataRepository.getInstance().loginByToken(loginBaseParam, createLoginRpcCallback(loginBaseParam, loginTasksCallback));
    }

    public void login(LoginBaseParam loginBaseParam, TrackingModel trackingModel, BaseView baseView, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600518df", new Object[]{this, loginBaseParam, trackingModel, baseView, loginTasksCallback});
            return;
        }
        this.loginParam = loginBaseParam;
        this.trackingModel = trackingModel;
        this.baseView = new WeakReference<>(baseView);
        buildLoginParam(new CommonDataCallback() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                if (loginTasksCallback2 != null) {
                    if (i == 3007) {
                        loginTasksCallback2.onCancel();
                    } else {
                        loginTasksCallback2.onFail(new LoginException(i, str));
                    }
                }
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                BaseLoginTask baseLoginTask = BaseLoginTask.this;
                baseLoginTask.startLogin(baseLoginTask.loginParam, loginTasksCallback);
            }
        });
    }

    public void matchHistoryAccount() {
        HistoryAccount historyAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fff9da5", new Object[]{this});
            return;
        }
        LoginBaseParam loginBaseParam = this.loginParam;
        if (loginBaseParam != null && loginBaseParam.isFromAccount) {
            long j = loginBaseParam.hid;
            if (j != 0) {
                historyAccount = SecurityGuardManagerWraper.findHistoryAccount(j);
            } else {
                historyAccount = null;
            }
            if (historyAccount != null) {
                LoginBaseParam loginBaseParam2 = this.loginParam;
                loginBaseParam2.deviceTokenKey = historyAccount.tokenKey;
                loginBaseParam2.hid = historyAccount.userId;
                loginBaseParam2.isFromAccount = true;
            }
        }
    }

    public void navToWebViewPage(LoginBaseParam loginBaseParam, final RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5ffbe7", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        EventBus.getDefault().registerEventListener(EventBusEnum.EventName.ACTION_H5, new EventListener() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.eventbus.EventListener
            public void onEvent(Event event) {
                Map<String, Object> map;
                LoginTasksCallback loginTasksCallback2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91b32698", new Object[]{this, event});
                    return;
                }
                EventBus.getDefault().unregisterEventListener(EventBusEnum.EventName.ACTION_H5, this);
                if (event == null || (map = event.params) == null) {
                    LoginTasksCallback loginTasksCallback3 = loginTasksCallback;
                    if (loginTasksCallback3 != null) {
                        String str = rpcResponse.message;
                        if (str == null) {
                            str = ResourceUtil.getNetworkError();
                        }
                        loginTasksCallback3.onFail(new LoginException(605, str, rpcResponse));
                        return;
                    }
                    return;
                }
                String str2 = (String) map.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                String str3 = (String) event.params.get("result");
                if (!TextUtils.isEmpty(str2) && TextUtils.equals(str3, "success")) {
                    LoginBaseParam loginBaseParam2 = (LoginBaseParam) JSON.parseObject(str2, LoginBaseParam.class);
                    if (loginBaseParam2 == null) {
                        loginBaseParam2 = new LoginBaseParam();
                    }
                    BaseLoginTask.this.invokeTokenLoginRpc(loginBaseParam2, loginTasksCallback);
                } else if (!TextUtils.equals(str3, "cancel") || (loginTasksCallback2 = loginTasksCallback) == null) {
                    LoginTasksCallback loginTasksCallback4 = loginTasksCallback;
                    if (loginTasksCallback4 != null) {
                        String str4 = rpcResponse.message;
                        if (str4 == null) {
                            str4 = ResourceUtil.getNetworkError();
                        }
                        loginTasksCallback4.onFail(new LoginException(604, str4, rpcResponse));
                    }
                } else {
                    loginTasksCallback2.onCancel();
                }
            }
        });
        if (loginBaseParam == null) {
            loginBaseParam = new LoginBaseParam();
        }
        loginBaseParam.scene = loginReturnData.scene;
        loginBaseParam.token = loginReturnData.token;
        loginBaseParam.site = loginReturnData.site;
        loginBaseParam.h5QueryString = null;
        Map<String, String> map = loginReturnData.extMap;
        if (map != null) {
            if (loginBaseParam.ext == null) {
                loginBaseParam.ext = map;
            } else {
                loginBaseParam.ext = new HashMap();
                for (Map.Entry<String, String> entry : loginReturnData.extMap.entrySet()) {
                    loginBaseParam.ext.put(entry.getKey(), entry.getValue());
                }
            }
        }
        UrlParam urlParam = new UrlParam();
        urlParam.url = loginReturnData.h5Url;
        urlParam.token = loginReturnData.token;
        urlParam.scene = loginReturnData.scene;
        urlParam.loginId = loginReturnData.showLoginId;
        urlParam.loginParam = loginBaseParam;
        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToWebViewPage(EventBusEnum.EventName.ACTION_H5, urlParam);
    }

    public void onReceiveAlert(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cadf435", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback != null) {
            if (rpcResponse == null) {
                str = ResourceUtil.getNetworkError();
            } else {
                str = rpcResponse.message;
            }
            loginTasksCallback.onFail(new LoginException<>(700, str, rpcResponse));
        }
    }

    public void onReceiveAlertWithH5(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6b4508", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback != null) {
            if (rpcResponse == null) {
                str = ResourceUtil.getNetworkError();
            } else {
                str = rpcResponse.message;
            }
            loginTasksCallback.onFail(new LoginException<>(1000, str, rpcResponse));
        }
    }

    public void onReceiveH5(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bc23ee", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        if (loginReturnData != null && !TextUtils.isEmpty(loginReturnData.h5Url)) {
            showToast(rpcResponse, ApiConstants.ApiField.SMS_LOGIN_REMIND_TIPS);
            navToWebViewPage(loginBaseParam, rpcResponse, loginTasksCallback);
        } else if (loginTasksCallback != null) {
            String str = rpcResponse.message;
            if (str == null) {
                str = ResourceUtil.getNetworkError();
            }
            loginTasksCallback.onFail(new LoginException<>(ErrorCode.SERVER_DATA_ERROR, str, rpcResponse));
        }
    }

    public void onReceiveNotSuccessActionType(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fd4eb4", new Object[]{this, loginBaseParam, rpcResponse});
        } else if (rpcResponse != null) {
            String valueOf = String.valueOf(rpcResponse.code);
            String str = rpcResponse.message;
            if (str == null) {
                str = "";
            }
            AppMonitorAdapter.commitFail("Page_Login", "login", valueOf, str);
        }
    }

    public void onReceiveNotify(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02b1e6a", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback != null) {
            if (rpcResponse == null) {
                str = ResourceUtil.getNetworkError();
            } else {
                str = rpcResponse.message;
            }
            loginTasksCallback.onFail(new LoginException<>(900, str, rpcResponse));
        }
    }

    public void onReceiveSuccess(final LoginBaseParam loginBaseParam, final RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        LoginReturnData loginReturnData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5be85c", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        AppMonitorAdapter.commitSuccess("Page_Login", "login");
        if (rpcResponse == null || (loginReturnData = rpcResponse.returnValue) == null || loginReturnData.extMap == null || TextUtils.isEmpty(loginReturnData.extMap.get("loginPostUrl"))) {
            onSuccessCall(loginBaseParam, rpcResponse, loginTasksCallback);
            return;
        }
        boolean equals = "true".equals(rpcResponse.returnValue.extMap.get(mop.KEY_IS_TRANSPARENT));
        UserTrackAdapter.sendUT("", "after_login_handle_commit", rpcResponse.returnValue.loginType, "", null);
        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToLoginPostPage(DataProviderFactory.getApplicationContext(), rpcResponse.returnValue.extMap.get("loginPostUrl"), equals, new LoginFilterCallback() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.filter.LoginFilterCallback
            public void onFail(int i, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i), map});
                } else {
                    onSuccess();
                }
            }

            @Override // com.ali.user.mobile.filter.LoginFilterCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                UserTrackAdapter.sendUT("", "after_login_handle_success", ((LoginReturnData) rpcResponse.returnValue).loginType, "", null);
                BaseLoginTask.this.onSuccessCall(loginBaseParam, rpcResponse, loginTasksCallback);
            }
        });
    }

    public void onReceiveToast(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1281f380", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback != null) {
            if (rpcResponse == null) {
                str = ResourceUtil.getNetworkError();
            } else {
                str = rpcResponse.message;
            }
            loginTasksCallback.onFail(new LoginException<>(800, str, rpcResponse));
        }
    }

    public void onReceiveTokenLogin(final LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53375291", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        Map<String, String> map = loginReturnData.extMap;
        if (map != null && !TextUtils.isEmpty(map.get("syncWaitTime"))) {
            try {
                j = Long.parseLong(loginReturnData.extMap.get("syncWaitTime"));
            } catch (Throwable th) {
                th.printStackTrace();
                j = 1000;
            }
            loginBaseParam.token = loginReturnData.token;
            loginBaseParam.scene = loginReturnData.scene;
            MainThreadExecutor.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BaseLoginTask.this.invokeTokenLoginRpc(loginBaseParam, loginTasksCallback);
                    }
                }
            }, j);
        }
    }

    public void onReceiveUCCH5(final LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2adf1b", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        String str = rpcResponse.returnValue.h5Url;
        UrlParam urlParam = new UrlParam();
        urlParam.url = str;
        urlParam.loginType = calLoginType(loginBaseParam);
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        if (loginReturnData != null) {
            urlParam.token = loginReturnData.token;
            urlParam.scene = loginReturnData.scene;
        }
        urlParam.loginParam = loginBaseParam;
        UrlUtil.OpenUCC(DataProviderFactory.getApplicationContext(), urlParam, new CommonDataCallback() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                    return;
                }
                LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                if (loginTasksCallback2 != null) {
                    loginTasksCallback2.onCancel();
                }
            }

            /* JADX WARN: Type inference failed for: r5v5, types: [com.ali.user.mobile.rpc.login.model.LoginReturnData, T] */
            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                } else if (map == null || TextUtils.isEmpty(map.get(UccConstants.PARAM_LOGIN_DATA))) {
                    LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                    if (loginTasksCallback2 != null) {
                        loginTasksCallback2.onCancel();
                    }
                } else {
                    RpcResponse<LoginReturnData> rpcResponse2 = new RpcResponse<>();
                    rpcResponse2.returnValue = (LoginReturnData) JSON.parseObject(map.get(UccConstants.PARAM_LOGIN_DATA), LoginReturnData.class);
                    rpcResponse2.actionType = "SUCCESS";
                    BaseLoginTask.this.onReceiveSuccess(loginBaseParam, rpcResponse2, loginTasksCallback);
                }
            }
        });
    }

    public void onReceiverOtherError(RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8574615", new Object[]{this, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback != null) {
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
        }
    }

    public void onSuccessCall(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd68451f", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        processLoginSessionData(loginBaseParam, rpcResponse);
        if (loginTasksCallback != null) {
            showToast(rpcResponse, ApiConstants.ApiField.SMS_LOGIN_REMIND_TIPS);
            loginTasksCallback.onSuccess(rpcResponse);
        }
    }

    public void processLoginResult(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a173f4", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (rpcResponse != null) {
            String str = rpcResponse.actionType;
            if (TextUtils.isEmpty(str)) {
                onReceiveNotSuccessActionType(loginBaseParam, rpcResponse);
                onReceiverOtherError(rpcResponse, loginTasksCallback);
            } else if ("SUCCESS".equals(str)) {
                onReceiveSuccess(loginBaseParam, rpcResponse, loginTasksCallback);
            } else {
                onReceiveNotSuccessActionType(loginBaseParam, rpcResponse);
                if ("H5".equals(str)) {
                    onReceiveH5(loginBaseParam, rpcResponse, loginTasksCallback);
                } else if (ApiConstants.ResultActionType.TOAST.equals(str)) {
                    onReceiveToast(loginBaseParam, rpcResponse, loginTasksCallback);
                } else if (ApiConstants.ResultActionType.ALERT.equals(str)) {
                    onReceiveAlert(loginBaseParam, rpcResponse, loginTasksCallback);
                } else if (ApiConstants.ResultActionType.NOTIFY.equals(str)) {
                    onReceiveNotify(loginBaseParam, rpcResponse, loginTasksCallback);
                } else if (ApiConstants.ResultActionType.UCC_H5.equals(str)) {
                    onReceiveUCCH5(loginBaseParam, rpcResponse, loginTasksCallback);
                } else if (ApiConstants.ResultActionType.ALERT_WITH_H5.equals(str)) {
                    onReceiveAlertWithH5(loginBaseParam, rpcResponse, loginTasksCallback);
                } else if (ApiConstants.ResultActionType.TOKENLOGIN.equals(str)) {
                    onReceiveTokenLogin(loginBaseParam, rpcResponse, loginTasksCallback);
                } else {
                    onReceiverOtherError(rpcResponse, loginTasksCallback);
                }
            }
        } else {
            onReceiveNotSuccessActionType(loginBaseParam, null);
            onReceiverOtherError(null, loginTasksCallback);
        }
    }

    public void processLoginSessionData(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33ec532", new Object[]{this, loginBaseParam, rpcResponse});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        if (loginReturnData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(LoginConstants.LOGIN_TYPE, calLoginType(loginBaseParam));
            LoginDataHelper.processLoginReturnData(true, loginReturnData, loginBaseParam, hashMap);
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    WeakReference<BaseView> weakReference = BaseLoginTask.this.baseView;
                    if (weakReference != null && weakReference.get() != null) {
                        BaseLoginTask.this.baseView.get().showLoading();
                    }
                }
            });
        }
    }

    public void startLogin(final LoginBaseParam loginBaseParam, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964b279", new Object[]{this, loginBaseParam, loginTasksCallback});
            return;
        }
        showLoading();
        LoginTLogAdapter.e("login_optimize", "before getWSecurityData");
        if (!CommonUtil.isInABTestRegion("useWuaCache", 10000) || loginBaseParam == null || loginBaseParam.wua == null) {
            SecurityGuardManagerWraper.getWSecurityData(new DataCallback<WSecurityData>() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void result(WSecurityData wSecurityData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50beb2da", new Object[]{this, wSecurityData});
                        return;
                    }
                    LoginBaseParam loginBaseParam2 = loginBaseParam;
                    if (loginBaseParam2 != null) {
                        loginBaseParam2.wua = wSecurityData;
                    }
                    LoginTLogAdapter.e("login_optimize", "before invokeLoginRpcOld");
                    BaseLoginTask baseLoginTask = BaseLoginTask.this;
                    LoginBaseParam loginBaseParam3 = loginBaseParam;
                    baseLoginTask.invokeLoginRpc(loginBaseParam3, BaseLoginTask.access$100(baseLoginTask, loginBaseParam3, loginTasksCallback));
                }
            });
            return;
        }
        LoginTLogAdapter.e("login_optimize", "before invokeLoginRpcNew");
        invokeLoginRpc(loginBaseParam, createLoginRpcCallback(loginBaseParam, loginTasksCallback));
    }

    public void buildLoginParamWithCommit(final CommonDataCallback commonDataCallback, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85997545", new Object[]{this, commonDataCallback, new Boolean(z)});
            return;
        }
        LoginTLogAdapter.e("login_optimize", "start buildLoginParamWithCommit");
        if (this.loginParam == null) {
            LoginBaseParam loginBaseParam = new LoginBaseParam();
            this.loginParam = loginBaseParam;
            loginBaseParam.site = DataProviderFactory.getDataProvider().getSite();
        }
        if (LoginSwitch.getSwitch("historyBackground", "true")) {
            LoginBaseParam loginBaseParam2 = this.loginParam;
            if (loginBaseParam2.isFromAccount && loginBaseParam2.hid != 0) {
                BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BaseLoginTask.access$000(BaseLoginTask.this, z);
                        BaseLoginTask.this.matchHistoryAccount();
                        MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                LoginTLogAdapter.e("login_optimize", "in callback.onSuccessOld");
                                commonDataCallback.onSuccess(null);
                            }
                        });
                    }
                });
                return;
            }
        }
        doBuild(z);
        LoginTLogAdapter.e("login_optimize", "in callback.onSuccessNew");
        commonDataCallback.onSuccess(null);
    }
}
