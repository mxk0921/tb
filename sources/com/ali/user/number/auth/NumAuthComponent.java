package com.ali.user.number.auth;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.NumAuthCallback;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.OnLoginPhoneListener;
import com.mobile.auth.gatewayauth.PhoneNumberAuthHelper;
import com.mobile.auth.gatewayauth.PnsLoggerHandler;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.TokenResultListener;
import com.mobile.auth.gatewayauth.model.LoginPhoneInfo;
import com.mobile.auth.gatewayauth.model.TokenRet;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.BackgroundExecutor;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NumAuthComponent implements NumberAuthService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String LOGIN_TOKEN_TIMEOUT = "loginTokenTimout";
    public static String PREFETCH_TIMEOUT = "preFetchTimout";
    private String lastErrorCode;
    private PhoneNumberAuthHelper mAuthHelper;
    private String TAG = "numAuth";
    private boolean isInited = false;
    private boolean support4G = false;
    public boolean hasPreFecthMaskPhone = false;
    private final Map<String, String> authInfoMap = new HashMap();
    private final List<NumberAuthService.PrefetchResultObserver> observers = new CopyOnWriteArrayList();
    private String MISS_ARG1 = "num_miss_cache";
    private String CACHE_ARG1 = "num_cache";

    public static /* synthetic */ void access$000(NumAuthComponent numAuthComponent, NumAuthTokenCallback numAuthTokenCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d70d27", new Object[]{numAuthComponent, numAuthTokenCallback, new Integer(i), str});
        } else {
            numAuthComponent.onFail(numAuthTokenCallback, i, str);
        }
    }

    public static /* synthetic */ String access$100(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f1dbac", new Object[]{numAuthComponent});
        }
        return numAuthComponent.TAG;
    }

    public static /* synthetic */ boolean access$1000(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffe514ca", new Object[]{numAuthComponent})).booleanValue();
        }
        return numAuthComponent.support4G;
    }

    public static /* synthetic */ boolean access$1002(NumAuthComponent numAuthComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbd16ad4", new Object[]{numAuthComponent, new Boolean(z)})).booleanValue();
        }
        numAuthComponent.support4G = z;
        return z;
    }

    public static /* synthetic */ Map access$200(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1e3f6a88", new Object[]{numAuthComponent});
        }
        return numAuthComponent.authInfoMap;
    }

    public static /* synthetic */ void access$300(NumAuthComponent numAuthComponent, LoginPhoneInfo loginPhoneInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a961d81d", new Object[]{numAuthComponent, loginPhoneInfo});
        } else {
            numAuthComponent.cacheAuthInfo(loginPhoneInfo);
        }
    }

    public static /* synthetic */ void access$400(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b61d1", new Object[]{numAuthComponent});
        } else {
            numAuthComponent.notifyObservers();
        }
    }

    public static /* synthetic */ void access$500(NumAuthComponent numAuthComponent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9811489", new Object[]{numAuthComponent, str, new Integer(i)});
        } else {
            numAuthComponent.trackInBackground(str, i);
        }
    }

    public static /* synthetic */ String access$600(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50b94671", new Object[]{numAuthComponent});
        }
        return numAuthComponent.lastErrorCode;
    }

    public static /* synthetic */ String access$602(NumAuthComponent numAuthComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6726eb29", new Object[]{numAuthComponent, str});
        }
        numAuthComponent.lastErrorCode = str;
        return str;
    }

    public static /* synthetic */ void access$700(NumAuthComponent numAuthComponent, String str, TokenRet tokenRet, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e39fe0b", new Object[]{numAuthComponent, str, tokenRet, str2, new Integer(i)});
        } else {
            numAuthComponent.trackFail(str, tokenRet, str2, i);
        }
    }

    public static /* synthetic */ void access$800(NumAuthComponent numAuthComponent, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20277d89", new Object[]{numAuthComponent, properties});
        } else {
            numAuthComponent.addEnv(properties);
        }
    }

    public static /* synthetic */ boolean access$902(NumAuthComponent numAuthComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e90c53ee", new Object[]{numAuthComponent, new Boolean(z)})).booleanValue();
        }
        numAuthComponent.isInited = z;
        return z;
    }

    private void addEnv(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46531cf", new Object[]{this, properties});
            return;
        }
        Context applicationContext = DataProviderFactory.getApplicationContext();
        if (properties != null && applicationContext != null) {
            properties.put("hasSimCard", String.valueOf(NetworkUtil.hasSimCard(applicationContext)));
            properties.put("isAirMode", String.valueOf(NetworkUtil.isAirModeEnable(applicationContext)));
            properties.put("mobileOpen", String.valueOf(NetworkUtil.isMobileNetworkOpen(applicationContext)));
            NetworkUtil.getCarrier(applicationContext, properties);
        }
    }

    private void cacheAuthInfo(LoginPhoneInfo loginPhoneInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ba73ca", new Object[]{this, loginPhoneInfo});
        } else if (loginPhoneInfo != null) {
            try {
                AuthInfo authInfo = new AuthInfo();
                authInfo.protocolName = loginPhoneInfo.getProtocolName();
                authInfo.phoneNumber = loginPhoneInfo.getPhoneNumber();
                authInfo.protocolUrl = loginPhoneInfo.getProtocolUrl();
                authInfo.cacheTimeStamp = System.currentTimeMillis();
                SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "auth_info", JSON.toJSONString(authInfo));
                UserTrackAdapter.sendExtendUT(this.CACHE_ARG1, "success");
            } catch (Exception e) {
                LoginTLogAdapter.e(this.TAG, "save auth info failed", e);
                UserTrackAdapter.sendExtendUT(this.CACHE_ARG1, "failure");
            }
        }
    }

    private Map<String, String> getCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("497e9948", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
        } catch (Throwable th) {
            LoginTLogAdapter.e(this.TAG, "getCacheException: ", th);
            UserTrackAdapter.sendExtendUT(this.MISS_ARG1, "EXCEPTION");
        }
        if (!ResultCode.CODE_ERROR_FUNCTION_TIME_OUT.equals(this.lastErrorCode)) {
            UserTrackAdapter.sendExtendUT(this.MISS_ARG1, this.lastErrorCode);
            return hashMap;
        }
        Context applicationContext = DataProviderFactory.getApplicationContext();
        if (!NetworkUtil.checkEnv(applicationContext)) {
            UserTrackAdapter.sendExtendUT(this.MISS_ARG1, "checkEnvFailed");
            return hashMap;
        }
        AuthInfo authInfo = (AuthInfo) JSON.parseObject((String) SharedPreferencesUtil.getData(applicationContext, "auth_info", "{}"), AuthInfo.class);
        if (authInfo != null && !TextUtils.isEmpty(authInfo.phoneNumber)) {
            if (System.currentTimeMillis() - authInfo.cacheTimeStamp < 86400000) {
                hashMap.put("number", authInfo.phoneNumber);
                hashMap.put("protocolName", authInfo.protocolName);
                hashMap.put("protocolURL", authInfo.protocolName);
                return hashMap;
            }
            UserTrackAdapter.sendExtendUT(this.MISS_ARG1, "timeout");
        }
        return hashMap;
    }

    private void notifyObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb68d9b", new Object[]{this});
            return;
        }
        for (NumberAuthService.PrefetchResultObserver prefetchResultObserver : this.observers) {
            prefetchResultObserver.onResult(this.authInfoMap);
        }
    }

    private void onFail(NumAuthTokenCallback numAuthTokenCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736e3878", new Object[]{this, numAuthTokenCallback, new Integer(i), str});
        } else if (numAuthTokenCallback != null) {
            numAuthTokenCallback.onGetAuthTokenFail(i, str);
        }
    }

    private void trackFail(final String str, final TokenRet tokenRet, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb3cb69", new Object[]{this, str, tokenRet, str2, new Integer(i)});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.number.auth.NumAuthComponent.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Properties properties = new Properties();
                    properties.setProperty("wait_time", String.valueOf(i));
                    if (tokenRet != null) {
                        properties.setProperty("code", tokenRet.getCode() + "");
                        properties.setProperty("cause", tokenRet.getMsg() + "");
                        if (!TextUtils.isEmpty(tokenRet.getCarrierFailedResultData())) {
                            properties.setProperty("carrierFailData", tokenRet.getCarrierFailedResultData());
                        }
                    } else {
                        properties.setProperty("code", "-104");
                        properties.setProperty("cause", str);
                    }
                    properties.setProperty("scene", str2);
                    try {
                        NumAuthComponent.access$800(NumAuthComponent.this, properties);
                        if (TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId())) {
                            str3 = "true";
                        } else {
                            str3 = "false";
                        }
                        properties.setProperty("newUser", str3);
                    } catch (Throwable unused) {
                    }
                    UserTrackAdapter.sendExtendUT("get_onekey_login_number_failure", NumAuthComponent.access$600(NumAuthComponent.this), str2, properties);
                }
            });
        }
    }

    private void trackInBackground(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec9a7b4", new Object[]{this, str, new Integer(i)});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.number.auth.NumAuthComponent.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Properties properties = new Properties();
                    properties.setProperty("scene", str);
                    properties.setProperty("wait_time", String.valueOf(i));
                    try {
                        NumAuthComponent.access$800(NumAuthComponent.this, properties);
                        if (TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId())) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                        properties.setProperty("newUser", str2);
                    } catch (Throwable unused) {
                    }
                    UserTrackAdapter.sendExtendUT("get_onekey_login_number_success", String.valueOf(i), str, properties);
                }
            });
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void addPrefetchResultObserver(NumberAuthService.PrefetchResultObserver prefetchResultObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95efd635", new Object[]{this, prefetchResultObserver});
            return;
        }
        try {
            List<NumberAuthService.PrefetchResultObserver> list = this.observers;
            if (list != null && prefetchResultObserver != null) {
                list.add(prefetchResultObserver);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public Map<String, String> getAuthInfoMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b8ea004c", new Object[]{this}) : getAuthInfoMap(false);
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginMaskPhone(int i, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78348f8", new Object[]{this, new Integer(i), commonDataCallback});
        } else {
            getLoginMaskPhone(i, "openLoginView", commonDataCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginToken(String str, NumAuthTokenCallback numAuthTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe3efe8", new Object[]{this, str, numAuthTokenCallback});
        } else {
            getLoginToken(str, "", numAuthTokenCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getToken(final NumAuthTokenCallback numAuthTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230d0b1b", new Object[]{this, numAuthTokenCallback});
            return;
        }
        initCheck(null);
        if (this.mAuthHelper != null) {
            this.mAuthHelper.getVerifyToken(LoginSwitch.getSwitch(LOGIN_TOKEN_TIMEOUT, 5000), new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str});
                        return;
                    }
                    try {
                        TokenRet tokenRet = (TokenRet) JSON.parseObject(str, TokenRet.class);
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, Integer.parseInt(tokenRet.getCode()), tokenRet.getMsg());
                    } catch (Throwable unused) {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -104, str);
                    }
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str) {
                    NumAuthTokenCallback numAuthTokenCallback2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str});
                    } else if (!TextUtils.isEmpty(str)) {
                        try {
                            TokenRet tokenRet = (TokenRet) JSON.parseObject(str, TokenRet.class);
                            if (tokenRet != null && (numAuthTokenCallback2 = numAuthTokenCallback) != null) {
                                numAuthTokenCallback2.onGetAuthTokenSuccess(tokenRet.getToken());
                            }
                        } catch (Throwable unused) {
                            NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -104, str);
                        }
                    } else {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                    }
                }
            });
        } else {
            onFail(numAuthTokenCallback, -103, NumAuthCallback.INIT_ERROR_MSG);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public boolean hasPreFecthMaskPhone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c9fa4de", new Object[]{this})).booleanValue();
        }
        return this.hasPreFecthMaskPhone;
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public boolean isSupport4G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7a8923", new Object[]{this})).booleanValue();
        }
        return this.support4G;
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public boolean needPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("746edeb8", new Object[]{this})).booleanValue();
        }
        if (this.authInfoMap.size() == 0) {
            return true;
        }
        PhoneNumberAuthHelper phoneNumberAuthHelper = this.mAuthHelper;
        if (phoneNumberAuthHelper != null) {
            return phoneNumberAuthHelper.isNeedUpdateMaskPhone();
        }
        return false;
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void preFecth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e320e6", new Object[]{this, str});
        } else {
            preFecth(str, "");
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void removePrefetchResultObserver(NumberAuthService.PrefetchResultObserver prefetchResultObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64787218", new Object[]{this, prefetchResultObserver});
            return;
        }
        try {
            List<NumberAuthService.PrefetchResultObserver> list = this.observers;
            if (list != null && prefetchResultObserver != null) {
                list.remove(prefetchResultObserver);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public Map<String, String> getAuthInfoMap(boolean z) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("930d16d2", new Object[]{this, new Boolean(z)});
        }
        if (!z || ((map = this.authInfoMap) != null && !map.isEmpty())) {
            return this.authInfoMap;
        }
        return getCache();
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginMaskPhone(int i, String str, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9205ae", new Object[]{this, new Integer(i), str, commonDataCallback});
        } else {
            getLoginMaskPhone(i, str, "", commonDataCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginToken(String str, String str2, final NumAuthTokenCallback numAuthTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884065f2", new Object[]{this, str, str2, numAuthTokenCallback});
            return;
        }
        initCheck(null);
        try {
            PhoneNumberAuthHelper phoneNumberAuthHelper = this.mAuthHelper;
            if (!(phoneNumberAuthHelper == null || phoneNumberAuthHelper.getReporter() == null)) {
                this.mAuthHelper.getReporter().setLogExtension(str);
            }
        } catch (Throwable unused) {
        }
        if (this.mAuthHelper != null) {
            this.mAuthHelper.getLoginToken(LoginSwitch.getSwitch(LOGIN_TOKEN_TIMEOUT, 5000), new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str3});
                        return;
                    }
                    try {
                        TokenRet tokenRet = (TokenRet) JSON.parseObject(str3, TokenRet.class);
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, Integer.parseInt(tokenRet.getCode()), tokenRet.getMsg());
                    } catch (Throwable unused2) {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -104, str3);
                    }
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str3) {
                    NumAuthTokenCallback numAuthTokenCallback2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str3});
                    } else if (!TextUtils.isEmpty(str3)) {
                        try {
                            TokenRet tokenRet = (TokenRet) JSON.parseObject(str3, TokenRet.class);
                            if (tokenRet == null || (numAuthTokenCallback2 = numAuthTokenCallback) == null) {
                                NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                            } else {
                                numAuthTokenCallback2.onGetAuthTokenSuccess(tokenRet.getToken());
                            }
                        } catch (Throwable unused2) {
                            NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                        }
                    } else {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                    }
                }
            });
        } else {
            onFail(numAuthTokenCallback, -103, NumAuthCallback.INIT_ERROR_MSG);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void preFecth(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8341d30", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                initCheck(null);
                PhoneNumberAuthHelper phoneNumberAuthHelper = this.mAuthHelper;
                if (!(phoneNumberAuthHelper == null || phoneNumberAuthHelper.getReporter() == null)) {
                    this.mAuthHelper.getReporter().setLogExtension(str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                getLoginMaskPhone(LoginSwitch.getSwitch(PREFETCH_TIMEOUT, 6000), str, str2, new CommonDataCallback() { // from class: com.ali.user.number.auth.NumAuthComponent.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                    public void onFail(final int i, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str3});
                            return;
                        }
                        try {
                            new Handler().postDelayed(new Runnable() { // from class: com.ali.user.number.auth.NumAuthComponent.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    String str4;
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        String config = LoginSwitch.getConfig("sceneRetry", "init;networkConnected;backToForeground;networkConnected2");
                                        String config2 = LoginSwitch.getConfig("codeRetry", "600015;600008;600012;600010;");
                                        if (config2 != null) {
                                            if (config2.contains(i + ";") && (str4 = str) != null && config != null && config.contains(str4)) {
                                                NumAuthComponent numAuthComponent = NumAuthComponent.this;
                                                numAuthComponent.preFecth(str + "_retry");
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
                                    }
                                }
                            }, 2000L);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            String access$100 = NumAuthComponent.access$100(NumAuthComponent.this);
                            LoginTLogAdapter.e(access$100, "message=" + th2.getMessage());
                        }
                    }

                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                    public void onSuccess(Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        }
                    }
                });
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private void initCheck(final NumAuthCallback numAuthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9454191d", new Object[]{this, numAuthCallback});
            return;
        }
        Properties properties = new Properties();
        if (this.mAuthHelper == null) {
            PhoneNumberAuthHelper instance = PhoneNumberAuthHelper.getInstance(DataProviderFactory.getApplicationContext());
            this.mAuthHelper = instance;
            if (instance != null) {
                UserTrackAdapter.sendExtendUT("sim_sdk_init", "1");
                this.mAuthHelper.setAuthSDKInfo(DataProviderFactory.getDataProvider().getAuthSDKInfo());
                this.mAuthHelper.checkEnvAvailable(2, new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.mobile.auth.gatewayauth.TokenResultListener
                    public void onTokenFailed(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str});
                            return;
                        }
                        NumAuthComponent.access$1002(NumAuthComponent.this, false);
                        NumAuthCallback numAuthCallback2 = numAuthCallback;
                        if (numAuthCallback2 != null) {
                            numAuthCallback2.onInit(NumAuthComponent.access$1000(NumAuthComponent.this));
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.TokenResultListener
                    public void onTokenSuccess(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str});
                            return;
                        }
                        NumAuthComponent.access$902(NumAuthComponent.this, true);
                        NumAuthComponent.access$1002(NumAuthComponent.this, true);
                        NumAuthCallback numAuthCallback2 = numAuthCallback;
                        if (numAuthCallback2 != null) {
                            numAuthCallback2.onInit(NumAuthComponent.access$1000(NumAuthComponent.this));
                        }
                    }
                });
                try {
                    if (this.mAuthHelper.getReporter() != null) {
                        this.mAuthHelper.getReporter().setLoggerEnable(SessionManager.isDebug());
                        this.mAuthHelper.getReporter().setLoggerHandler(new PnsLoggerHandler() { // from class: com.ali.user.number.auth.NumAuthComponent.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                            public void debug(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("966c00a4", new Object[]{this, str});
                                } else {
                                    error(str);
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                            public void error(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("72e35699", new Object[]{this, str});
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                            public void info(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f9dfc8bf", new Object[]{this, str});
                                } else {
                                    error(str);
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                            public void monitor(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7020186b", new Object[]{this, str});
                                    return;
                                }
                                try {
                                    Properties properties2 = new Properties();
                                    if (!TextUtils.isEmpty(str)) {
                                        properties2.put("auth", str);
                                    }
                                    UserTrackAdapter.sendUT("AuthSDK", properties2);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                            public void verbose(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("eaa7c693", new Object[]{this, str});
                                } else {
                                    error(str);
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                            public void warning(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f61d0d2d", new Object[]{this, str});
                                } else {
                                    error(str);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (numAuthCallback != null) {
                        numAuthCallback.onInit(false);
                    }
                }
            } else {
                UserTrackAdapter.sendExtendUT("sim_sdk_init", "0");
                if (numAuthCallback != null) {
                    numAuthCallback.onInit(false);
                }
            }
        } else {
            try {
                UserTrackAdapter.sendUT("sim_check_gateway", properties);
                this.mAuthHelper.checkEnvAvailable(2, new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.mobile.auth.gatewayauth.TokenResultListener
                    public void onTokenFailed(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str});
                            return;
                        }
                        NumAuthComponent.access$1002(NumAuthComponent.this, false);
                        NumAuthCallback numAuthCallback2 = numAuthCallback;
                        if (numAuthCallback2 != null) {
                            numAuthCallback2.onInit(NumAuthComponent.access$1000(NumAuthComponent.this));
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.TokenResultListener
                    public void onTokenSuccess(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str});
                            return;
                        }
                        NumAuthComponent.access$902(NumAuthComponent.this, true);
                        NumAuthComponent.access$1002(NumAuthComponent.this, true);
                        NumAuthCallback numAuthCallback2 = numAuthCallback;
                        if (numAuthCallback2 != null) {
                            numAuthCallback2.onInit(NumAuthComponent.access$1000(NumAuthComponent.this));
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                if (numAuthCallback != null) {
                    numAuthCallback.onInit(false);
                }
            }
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginMaskPhone(final int i, final String str, String str2, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750b40e4", new Object[]{this, new Integer(i), str, str2, commonDataCallback});
            return;
        }
        if (CommonUtil.isInABTestRegion("mask_" + str, 10000)) {
            try {
                initCheck(null);
                PhoneNumberAuthHelper phoneNumberAuthHelper = this.mAuthHelper;
                if (!(phoneNumberAuthHelper == null || phoneNumberAuthHelper.getReporter() == null)) {
                    this.mAuthHelper.getReporter().setLogExtension(str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.mAuthHelper != null) {
                Properties properties = new Properties();
                properties.setProperty("monitor", "T");
                UserTrackAdapter.sendExtendUT("get_onekey_login_number_commit", String.valueOf(i), str, properties);
                this.mAuthHelper.getLoginMaskPhone(i, new OnLoginPhoneListener() { // from class: com.ali.user.number.auth.NumAuthComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.mobile.auth.gatewayauth.OnLoginPhoneListener
                    public void onGetFailed(String str3) {
                        TokenRet tokenRet;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("346427a5", new Object[]{this, str3});
                        } else if (commonDataCallback != null) {
                            try {
                                tokenRet = (TokenRet) JSON.parseObject(str3, TokenRet.class);
                            } catch (Throwable unused) {
                                tokenRet = null;
                            }
                            NumAuthComponent.access$602(NumAuthComponent.this, "-104");
                            if (tokenRet != null) {
                                NumAuthComponent.access$602(NumAuthComponent.this, tokenRet.getCode());
                                commonDataCallback.onFail(Integer.parseInt(NumAuthComponent.access$600(NumAuthComponent.this)), tokenRet.getMsg());
                            } else {
                                commonDataCallback.onFail(-104, str3);
                            }
                            NumAuthComponent.access$700(NumAuthComponent.this, str3, tokenRet, str, i);
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.OnLoginPhoneListener
                    public void onGetLoginPhone(LoginPhoneInfo loginPhoneInfo) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ddf4988e", new Object[]{this, loginPhoneInfo});
                            return;
                        }
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        concurrentHashMap.put("number", loginPhoneInfo.getPhoneNumber());
                        concurrentHashMap.put("protocolName", loginPhoneInfo.getProtocolName());
                        concurrentHashMap.put("protocolURL", loginPhoneInfo.getProtocolUrl());
                        concurrentHashMap.put("scene", str);
                        NumAuthComponent.access$200(NumAuthComponent.this).putAll(concurrentHashMap);
                        NumAuthComponent numAuthComponent = NumAuthComponent.this;
                        numAuthComponent.hasPreFecthMaskPhone = true;
                        NumAuthComponent.access$300(numAuthComponent, loginPhoneInfo);
                        CommonDataCallback commonDataCallback2 = commonDataCallback;
                        if (commonDataCallback2 != null) {
                            commonDataCallback2.onSuccess(concurrentHashMap);
                        }
                        NumAuthComponent.access$400(NumAuthComponent.this);
                        NumAuthComponent.access$500(NumAuthComponent.this, str, i);
                    }
                });
            } else if (commonDataCallback != null) {
                commonDataCallback.onFail(-103, NumAuthCallback.INIT_ERROR_MSG);
            }
        } else if (commonDataCallback != null) {
            commonDataCallback.onFail(-104, NumAuthCallback.ORANGE_MISS_MSG);
        }
    }

    static {
        t2o.a(69206235);
        t2o.a(68157609);
    }
}
