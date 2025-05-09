package com.ali.user.mobile.login.service.impl;

import android.os.Build;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.AccountType;
import com.ali.user.mobile.login.model.GetVerifyTokenResponseData;
import com.ali.user.mobile.login.presenter.ExtRiskData;
import com.ali.user.mobile.login.presenter.ScanFaceWSecurityData;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.ali.user.mobile.rpc.filter.IAfterFilter;
import com.ali.user.mobile.rpc.login.model.ApplyTokenRequest;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.EmailLoginRequest;
import com.ali.user.mobile.rpc.login.model.LoginRequestBase;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.LoginTokenResponseData;
import com.ali.user.mobile.rpc.login.model.MLoginTokenReturnValue;
import com.ali.user.mobile.rpc.login.model.MemberRequestBase;
import com.ali.user.mobile.rpc.login.model.PasswordLoginRequest;
import com.ali.user.mobile.rpc.login.model.SimLoginRequest;
import com.ali.user.mobile.rpc.login.model.TokenLoginRequest;
import com.ali.user.mobile.rpc.login.model.UmidIvLoginRequest;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import com.ali.user.mobile.rpc.safe.RSAKey;
import com.ali.user.mobile.rpc.safe.Rsa;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SnsLoginRequest;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.cookies.LoginCookieUtils;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;
import tb.amo;
import tb.hsq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UserLoginServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.UserLoginServiceImpl";
    private static UserLoginServiceImpl instance;

    static {
        t2o.a(69206143);
    }

    private UserLoginServiceImpl() {
    }

    public static void addOuterExt(LoginBaseParam loginBaseParam, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca88289", new Object[]{loginBaseParam, map});
        } else if (map != null && loginBaseParam != null) {
            map.put("alipayInstalled", String.valueOf(loginBaseParam.alipayInstalled));
        }
    }

    private void addPwd(LoginBaseParam loginBaseParam, PasswordLoginRequest passwordLoginRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545f61a1", new Object[]{this, loginBaseParam, passwordLoginRequest});
            return;
        }
        if (!TextUtils.isEmpty(loginBaseParam.password)) {
            try {
                String rsaPubkey = RSAKey.getRsaPubkey();
                if (!TextUtils.isEmpty(rsaPubkey)) {
                    passwordLoginRequest.password = Rsa.encrypt(loginBaseParam.password, rsaPubkey);
                } else {
                    LoginTLogAdapter.e(TAG, "RSAKey == null");
                    throw new RpcException("getRsaKeyResult is null");
                }
            } catch (RpcException e) {
                throw new RpcException("get RSA exception===> " + e.getMessage());
            }
        }
        passwordLoginRequest.pwdEncrypted = true;
    }

    public static void buildBaseRequest(LoginBaseParam loginBaseParam, LoginRequestBase loginRequestBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b32b7f", new Object[]{loginBaseParam, loginRequestBase});
        } else {
            buildBaseRequest(loginBaseParam, loginRequestBase, false);
        }
    }

    public static void buildExt(LoginBaseParam loginBaseParam, MemberRequestBase memberRequestBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5282911", new Object[]{loginBaseParam, memberRequestBase});
            return;
        }
        try {
            if (memberRequestBase.ext == null) {
                memberRequestBase.ext = new HashMap();
            }
            if (loginBaseParam != null && loginBaseParam.regXianyu) {
                memberRequestBase.ext.put("unionReg", "xianyu");
            }
            boolean isEmpty = TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId());
            LoginStatus.firstLogin = isEmpty;
            memberRequestBase.ext.put("firstLogin", String.valueOf(isEmpty));
            memberRequestBase.ext.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.getApiRefer());
            memberRequestBase.ext.put("sdkSessionTraceID", LoginStatus.sdkSessionTraceID);
            if (!TextUtils.isEmpty(LoginStatus.source)) {
                memberRequestBase.ext.put("aFrom", LoginStatus.source);
            } else if (!TextUtils.isEmpty(LoginStatus.mtopApiReferer)) {
                JSONObject jSONObject = new JSONObject(LoginStatus.mtopApiReferer);
                String string = jSONObject.getString("apiName");
                String string2 = jSONObject.getString("v");
                String optString = jSONObject.optString("eventName");
                StringBuilder sb = new StringBuilder();
                if ("BX_RETRY".equals(optString)) {
                    sb.append("bx:");
                } else {
                    sb.append("mtop:");
                }
                if (!TextUtils.isEmpty(string)) {
                    sb.append(string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    sb.append("/");
                    sb.append(string2);
                }
                memberRequestBase.ext.put("aFrom", sb.toString());
            } else if (!TextUtils.isEmpty(LoginStatus.jsbridgeRefUrl)) {
                if (CommonUtil.isInABTestRegion("aFromUrl2", 10000)) {
                    Map<String, String> map = memberRequestBase.ext;
                    map.put("aFrom", "jsbridge:" + CommonUtil.getDomainAndPath(LoginStatus.jsbridgeRefUrl));
                } else {
                    memberRequestBase.ext.put("aFrom", "jsbridge");
                }
            } else if (TextUtils.isEmpty(LoginStatus.browserRefUrl)) {
                memberRequestBase.ext.put("aFrom", "native");
            } else if (CommonUtil.isInABTestRegion("aFromUrl2", 10000)) {
                Map<String, String> map2 = memberRequestBase.ext;
                map2.put("aFrom", "container:" + CommonUtil.getDomainAndPath(LoginStatus.browserRefUrl));
            } else {
                memberRequestBase.ext.put("aFrom", "container");
            }
            if (DataProviderFactory.getDataProvider().getExternalData() != null) {
                memberRequestBase.ext.putAll(DataProviderFactory.getDataProvider().getExternalData());
            }
            String value = LoginCookieUtils.getValue("miid");
            if (!TextUtils.isEmpty(value)) {
                memberRequestBase.ext.put("miid", value);
                LoginTLogAdapter.e("Ext", "miid =" + value);
                return;
            }
            LoginTLogAdapter.e("Ext", "miid is null");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private Map<String, String> buildExtForLoginMtopApi(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61fc44e9", new Object[]{this, loginBaseParam});
        }
        if (loginBaseParam == null) {
            return new HashMap();
        }
        Map<String, String> map = loginBaseParam.ext;
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("apiVersion", "2.0");
        try {
            map.put("deviceName", Build.MODEL);
            map.put("sdkTraceId", loginBaseParam.sdkTraceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String str = loginBaseParam.h5QueryString;
        if (str != null) {
            map.put(ApiConstants.ApiField.H5_QUERY_STRING, str);
        }
        if (!TextUtils.isEmpty(loginBaseParam.snsTrustLoginToken)) {
            map.put(ApiConstants.ApiField.SNS_TRUST_LOGIN_TOKEN, loginBaseParam.snsTrustLoginToken);
        }
        addOuterExt(loginBaseParam, map);
        return map;
    }

    private RpcRequest buildScanRequest(LoginBaseParam loginBaseParam, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("a3597ba6", new Object[]{this, loginBaseParam, str});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = str;
        rpcRequest.VERSION = "1.0";
        rpcRequest.NEED_ECODE = false;
        rpcRequest.NEED_SESSION = false;
        LoginRequestBase loginRequestBase = new LoginRequestBase();
        HashMap hashMap = new HashMap();
        hashMap.put("apiVersion", "2.0");
        buildExt(hashMap);
        loginRequestBase.hid = loginBaseParam.hid + "";
        buildBaseRequest(loginBaseParam, loginRequestBase, true);
        loginRequestBase.t = System.currentTimeMillis();
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(loginRequestBase));
        return rpcRequest;
    }

    public static UserLoginServiceImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserLoginServiceImpl) ipChange.ipc$dispatch("f3514d45", new Object[0]);
        }
        if (instance == null) {
            instance = new UserLoginServiceImpl();
        }
        return instance;
    }

    public static ScanFaceWSecurityData getScanFaceWSecurityData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScanFaceWSecurityData) ipChange.ipc$dispatch("dec49657", new Object[0]) : getScanFaceWSecurityData(null);
    }

    public static void loginRpcEntranceTracker(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f2e21b", new Object[]{loginBaseParam});
        } else if (loginBaseParam != null) {
            UserTrackAdapter.sendUT(loginBaseParam.utPageName, UTConstant.CustomEvent.UT_LOGIN_RPC, "", loginBaseParam.loginSourceType, LoginComponent.getProperties(loginBaseParam));
            AppMonitorAdapter.commitSuccess("Page_Member_Login", "loginMonitorPoint", "action=loginRpc;biz=" + loginBaseParam.loginSourceType + ";page=" + loginBaseParam.utPageName);
        }
    }

    private static <V extends RpcResponse<?>> void requestWithRemoteBusiness(RpcRequest rpcRequest, V v, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe6d058", new Object[]{rpcRequest, v, rpcRequestCallback});
        } else {
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, v.getClass(), rpcRequestCallback);
        }
    }

    private void sendEmailFailUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a503ed", new Object[]{this, loginBaseParam, rpcResponse, new Boolean(z)});
            return;
        }
        if (rpcResponse != null) {
            str = String.valueOf(rpcResponse.code);
        } else {
            str = UTConstant.CustomEvent.UT_NETWORK_FAIL;
        }
        if (loginBaseParam == null) {
            str2 = "";
        } else {
            str2 = loginBaseParam.utPageName;
        }
        Properties properties = new Properties();
        if (loginBaseParam != null) {
            properties.setProperty("sdkTraceId", loginBaseParam.sdkTraceId + "");
        }
        properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
        UserTrackAdapter.sendUT(str2, UTConstans.CustomEvent.UT_EMAIL_SEND_FAIL, str, "emailLogin", properties);
        AppMonitorAdapter.commitFail("Page_Member_Login", "loginMonitorPoint", str, "action=result;biz=emailsend;page=" + str2);
    }

    private void tokenLoginFailure(String str, LoginBaseParam loginBaseParam, RpcResponse rpcResponse, boolean z) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b50c3f20", new Object[]{this, str, loginBaseParam, rpcResponse, new Boolean(z)});
            return;
        }
        Properties properties = new Properties();
        if (loginBaseParam != null) {
            properties.setProperty("sdkTraceId", loginBaseParam.sdkTraceId + "");
            if (z) {
                str4 = "T";
            } else {
                str4 = UTConstant.Args.UT_SUCCESS_F;
            }
            properties.setProperty("continueLogin", str4);
            properties.setProperty("loginId", loginBaseParam.loginId + "");
            properties.setProperty("site", loginBaseParam.site + "");
        }
        if (loginBaseParam != null) {
            str2 = UTConstant.getLoginTypeByTraceId(loginBaseParam.sdkTraceId);
            if (TextUtils.isEmpty(str2)) {
                str2 = UTConstant.getLoginTypeByTokenType(loginBaseParam.tokenType);
            }
        } else {
            str2 = "";
        }
        if (rpcResponse == null) {
            str3 = "-1";
        } else {
            str3 = rpcResponse.code + "";
        }
        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_FAIL, str3, str2, properties);
        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str3, str2, LoginComponent.getProperties(loginBaseParam));
    }

    public RpcRequest buildLoginByTokenRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("38cba12c", new Object[]{this, loginBaseParam});
        }
        loginRpcEntranceTracker(loginBaseParam);
        return getTokenLoginRpcRequest(loginBaseParam);
    }

    public RpcRequest buildSimLoginRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("3108f9c5", new Object[]{this, loginBaseParam});
        }
        return buildSimLoginRequestInner(loginBaseParam, ApiConstants.ApiName.API_SIM_LOGIN, "", null);
    }

    public RpcRequest buildSimLoginRequestInner(LoginBaseParam loginBaseParam, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("d22e6b74", new Object[]{this, loginBaseParam, str, str2, map});
        }
        loginRpcEntranceTracker(loginBaseParam);
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = str;
        rpcRequest.VERSION = "1.0";
        rpcRequest.setNewMtopApi();
        SimLoginRequest simLoginRequest = new SimLoginRequest();
        buildBaseRequest(loginBaseParam, simLoginRequest);
        simLoginRequest.deviceId = DataProviderFactory.getDataProvider().getDeviceId();
        simLoginRequest.accessCode = loginBaseParam.token;
        if (!TextUtils.isEmpty(str2)) {
            simLoginRequest.loginId = loginBaseParam.loginId;
        }
        simLoginRequest.hid = loginBaseParam.hid + "";
        if (loginBaseParam.ext != null && ApiConstants.ApiName.UNINSTALL_LOGIN.equals(str)) {
            simLoginRequest.ext = loginBaseParam.ext;
        }
        Map map2 = loginBaseParam.ext;
        if (map2 == null) {
            map2 = new HashMap();
        }
        if (ApiConstants.ApiName.API_SIM_LOGIN.equals(str)) {
            map2.put("syncMobileReopenCheck", "true");
        }
        map2.put("apiVersion", "2.0");
        try {
            map2.put("deviceName", Build.MODEL);
            map2.put("newSimLogin", "true");
            map2.put("sdkTraceId", loginBaseParam.sdkTraceId);
            if (map != null) {
                map2.putAll(map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(loginBaseParam.snsTrustLoginToken)) {
            map2.put(ApiConstants.ApiField.SNS_TRUST_LOGIN_TOKEN, loginBaseParam.snsTrustLoginToken);
        }
        addOuterExt(loginBaseParam, map2);
        rpcRequest.addParam("ext", JSON.toJSONString(map2));
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(simLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        return rpcRequest;
    }

    public RpcRequest buildSimLoginWithUserInputRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("a9f4387e", new Object[]{this, loginBaseParam});
        }
        return buildSimLoginRequestInner(loginBaseParam, ApiConstants.ApiName.API_SIM_MOBILE_LOGIN, loginBaseParam.loginId, null);
    }

    public RpcRequest buildUmidTokenLoginRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("b8386276", new Object[]{this, loginBaseParam});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.VERSION = "1.0";
        rpcRequest.API_NAME = ApiConstants.ApiName.UMID_TOKEN_LOGIN;
        rpcRequest.requestSite = loginBaseParam.site;
        UmidIvLoginRequest umidIvLoginRequest = new UmidIvLoginRequest();
        buildExtForLoginMtopApi(loginBaseParam);
        umidIvLoginRequest.umidLoginToken = loginBaseParam.token;
        buildBaseRequest(loginBaseParam, umidIvLoginRequest);
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(umidIvLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        return rpcRequest;
    }

    public RpcRequest buildUnifySsoTokenLoginRequest(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("d7113d60", new Object[]{this, loginParam});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.UNIFY_SSO_LOGIN;
        rpcRequest.VERSION = "1.0";
        TokenLoginRequest tokenLoginRequest = new TokenLoginRequest();
        buildBaseRequest(loginParam, tokenLoginRequest);
        tokenLoginRequest.token = loginParam.token;
        rpcRequest.requestSite = loginParam.site;
        rpcRequest.addParam(ApiConstants.ApiField.TOKEN_INFO, JSON.toJSONString(tokenLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        return rpcRequest;
    }

    public RpcRequest buildUninstallGenToken(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("35d331d7", new Object[]{this, loginBaseParam});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.UNINSTALL_GEN_TOKEN;
        rpcRequest.VERSION = "1.0";
        PasswordLoginRequest passwordLoginRequest = new PasswordLoginRequest();
        buildBaseRequest(loginBaseParam, passwordLoginRequest);
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(passwordLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(getScanFaceWSecurityData(loginBaseParam)));
        return rpcRequest;
    }

    public RpcRequest buildUninstallReloginRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("b9e13ac7", new Object[]{this, loginBaseParam});
        }
        return buildSimLoginRequestInner(loginBaseParam, ApiConstants.ApiName.UNINSTALL_LOGIN, "", loginBaseParam.ext);
    }

    public void emailLoginFailUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fa5dae", new Object[]{this, loginBaseParam, rpcResponse});
            return;
        }
        Properties properties = LoginComponent.getProperties(loginBaseParam);
        properties.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
        if (rpcResponse != null) {
            str = String.valueOf(rpcResponse.code);
        } else {
            str = UTConstant.CustomEvent.UT_NETWORK_FAIL;
        }
        if (loginBaseParam == null) {
            str2 = "";
        } else {
            str2 = loginBaseParam.utPageName;
        }
        UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_LOGIN_FAIL, str, "emailLogin", properties);
        UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str, "emailLogin", LoginComponent.getProperties(loginBaseParam));
    }

    public void emailLoginUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a857ac", new Object[]{this, loginBaseParam, rpcResponse});
            return;
        }
        if (rpcResponse != null) {
            try {
                String str2 = rpcResponse.actionType;
                if (str2 != null) {
                    if (loginBaseParam == null) {
                        str = "";
                    } else {
                        str = loginBaseParam.utPageName;
                    }
                    if ("SUCCESS".equals(str2)) {
                        Properties properties = LoginComponent.getProperties(loginBaseParam);
                        properties.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, "T");
                        if (!TextUtils.isEmpty(loginBaseParam.source)) {
                            if (TextUtils.equals("Page_Login5-Reg", loginBaseParam.source)) {
                                properties.setProperty("source", "Page_Login5-RegistSuc");
                            } else if (TextUtils.equals("Page_Login5-Login", loginBaseParam.source)) {
                                properties.setProperty("source", "Page_Login5-LoginSuc");
                            }
                        }
                        properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_SUCCESS, null, "emailLogin", properties);
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", "emailLogin", LoginComponent.getProperties(loginBaseParam));
                        return;
                    } else if ("H5".equals(rpcResponse.actionType)) {
                        Properties properties2 = LoginComponent.getProperties(loginBaseParam);
                        properties2.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_FAIL, String.valueOf(rpcResponse.code), "emailLogin", properties2);
                        return;
                    } else {
                        emailLoginFailUT(loginBaseParam, rpcResponse);
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                emailLoginFailUT(loginBaseParam, rpcResponse);
                return;
            }
        }
        emailLoginFailUT(loginBaseParam, rpcResponse);
    }

    public void getScanToken(LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1b7795", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildScanRequest = buildScanRequest(loginBaseParam, ApiConstants.ApiName.FETCH_LOING_SCAN_TOKEN);
        HashMap hashMap = new HashMap();
        hashMap.put("apiVersion", "2.0");
        try {
            hashMap.put("deviceName", Build.MODEL);
            hashMap.put("sdkTraceId", loginBaseParam.sdkTraceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        addOuterExt(loginBaseParam, hashMap);
        buildScanRequest.addParam("ext", JSON.toJSONString(hashMap));
        buildScanRequest.addParam("riskControlInfo", JSON.toJSONString(getScanFaceWSecurityData(loginBaseParam)));
        requestWithRemoteBusiness(buildScanRequest, new GetVerifyTokenResponseData(), rpcRequestCallback);
    }

    public RpcRequest getTokenLoginRpcRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("e9c1e684", new Object[]{this, loginBaseParam});
        }
        RpcRequest rpcRequest = new RpcRequest();
        TokenLoginRequest tokenLoginRequest = new TokenLoginRequest();
        Map map = loginBaseParam.ext;
        if (map == null) {
            map = new HashMap();
        }
        map.put("apiVersion", "2.0");
        try {
            map.put("deviceName", Build.MODEL);
            map.put("sdkTraceId", loginBaseParam.sdkTraceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String str = loginBaseParam.h5QueryString;
        if (str != null) {
            map.put(ApiConstants.ApiField.H5_QUERY_STRING, str);
        }
        rpcRequest.API_NAME = ApiConstants.ApiName.TOKEN_LOGIN;
        rpcRequest.VERSION = "1.0";
        if (hsq.g(loginBaseParam.token) && loginBaseParam.token.startsWith("sm2_")) {
            rpcRequest.setNewMtopApi();
        }
        if (!TextUtils.isEmpty(loginBaseParam.snsTrustLoginToken)) {
            map.put(ApiConstants.ApiField.SNS_TRUST_LOGIN_TOKEN, loginBaseParam.snsTrustLoginToken);
        }
        addOuterExt(loginBaseParam, map);
        rpcRequest.addParam("ext", JSON.toJSONString(map));
        rpcRequest.requestSite = loginBaseParam.site;
        buildBaseRequest(loginBaseParam, tokenLoginRequest);
        tokenLoginRequest.tokenType = TokenType.MLOGIN_TOKEN;
        tokenLoginRequest.scene = loginBaseParam.scene;
        tokenLoginRequest.token = loginBaseParam.token;
        rpcRequest.addParam(ApiConstants.ApiField.TOKEN_INFO, JSON.toJSONString(tokenLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        return rpcRequest;
    }

    public RpcResponse<LoginReturnData> loginByAlipaySSOToken(String str, Map<String, String> map, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("bfaf3afa", new Object[]{this, str, map, loginParam});
        }
        loginRpcEntranceTracker(loginParam);
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.ALIPAY_SSO_LOGIN;
        rpcRequest.VERSION = "2.0";
        rpcRequest.setNewMtopApi();
        TokenLoginRequest tokenLoginRequest = new TokenLoginRequest();
        tokenLoginRequest.ext = map;
        buildBaseRequest(loginParam, tokenLoginRequest);
        tokenLoginRequest.token = str;
        rpcRequest.requestSite = tokenLoginRequest.site;
        rpcRequest.addParam(ApiConstants.ApiField.TOKEN_INFO, JSON.toJSONString(tokenLoginRequest));
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("deviceName", Build.MODEL);
            hashMap.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.getApiRefer());
            if (loginParam != null) {
                hashMap.put("sdkTraceId", loginParam.sdkTraceId);
            }
            addOuterExt(loginParam, map);
            rpcRequest.addParam("ext", JSON.toJSONString(hashMap));
        } catch (Exception e) {
            e.printStackTrace();
        }
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(getScanFaceWSecurityData(loginParam)));
        return ((RpcService) ServiceFactory.getService(RpcService.class)).post(rpcRequest, DefaultLoginResponseData.class);
    }

    public RpcResponse loginByToken(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("8fff013a", new Object[]{this, loginParam});
        }
        loginRpcEntranceTracker(loginParam);
        RpcResponse post = ((RpcService) ServiceFactory.getService(RpcService.class)).post(getTokenLoginRpcRequest(loginParam), DefaultLoginResponseData.class, String.valueOf(loginParam.hid));
        tokenLoginUT(post, loginParam, true);
        return post;
    }

    public void pwdFailUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ffb19e", new Object[]{this, loginBaseParam, rpcResponse});
            return;
        }
        Properties properties = LoginComponent.getProperties(loginBaseParam);
        properties.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
        if (rpcResponse != null) {
            str = String.valueOf(rpcResponse.code);
        } else {
            str = UTConstant.CustomEvent.UT_NETWORK_FAIL;
        }
        if (loginBaseParam != null && !TextUtils.isEmpty(loginBaseParam.utPageName)) {
            str2 = loginBaseParam.utPageName;
        } else if (loginBaseParam == null || !loginBaseParam.isFromAccount) {
            properties.setProperty("type", "TbLoginFailure");
            str2 = UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
        } else {
            properties.setProperty("type", "NoFirstLoginFailure");
            str2 = UTConstant.PageName.UT_PAGE_HISTORY_LOGIN;
        }
        UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_LOGIN_FAIL, str, LoginType.LocalLoginType.PWD_LOGIN, properties);
        UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str, LoginType.LocalLoginType.PWD_LOGIN, LoginComponent.getProperties(loginBaseParam));
    }

    public void pwdLoginUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ed000d", new Object[]{this, loginBaseParam, rpcResponse});
            return;
        }
        if (rpcResponse != null) {
            try {
                if (rpcResponse.actionType != null) {
                    if (loginBaseParam != null && !TextUtils.isEmpty(loginBaseParam.utPageName)) {
                        str = loginBaseParam.utPageName;
                    } else if (loginBaseParam == null || !loginBaseParam.isFromAccount) {
                        str = UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
                    } else {
                        str = UTConstant.PageName.UT_PAGE_HISTORY_LOGIN;
                    }
                    if ("SUCCESS".equals(rpcResponse.actionType)) {
                        Properties properties = LoginComponent.getProperties(loginBaseParam);
                        properties.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, "T");
                        if (!TextUtils.isEmpty(loginBaseParam.source)) {
                            if (TextUtils.equals("Page_Login5-Reg", loginBaseParam.source)) {
                                properties.setProperty("source", "Page_Login5-RegistSuc");
                            } else if (TextUtils.equals("Page_Login5-Login", loginBaseParam.source)) {
                                properties.setProperty("source", "Page_Login5-LoginSuc");
                            }
                        }
                        properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                        if (loginBaseParam.isFromAccount) {
                            properties.setProperty("type", "NoFirstLoginSuccessByTb");
                        } else {
                            properties.setProperty("type", "TbLoginSuccess");
                        }
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_SUCCESS, null, LoginType.LocalLoginType.PWD_LOGIN, properties);
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.PWD_LOGIN, LoginComponent.getProperties(loginBaseParam));
                        return;
                    } else if ("H5".equals(rpcResponse.actionType)) {
                        Properties properties2 = LoginComponent.getProperties(loginBaseParam);
                        properties2.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
                        properties2.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                        if (loginBaseParam.isFromAccount) {
                            properties2.setProperty("type", "NoFirstLoginH5");
                        } else {
                            properties2.setProperty("type", "TbLoginH5");
                        }
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_FAIL, String.valueOf(rpcResponse.code), LoginType.LocalLoginType.PWD_LOGIN, properties2);
                        return;
                    } else {
                        pwdFailUT(loginBaseParam, rpcResponse);
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                pwdFailUT(loginBaseParam, rpcResponse);
                return;
            }
        }
        pwdFailUT(loginBaseParam, rpcResponse);
    }

    public void sendEmailUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb1e52f", new Object[]{this, loginBaseParam, rpcResponse, new Boolean(z)});
            return;
        }
        if (loginBaseParam == null) {
            str = "";
        } else {
            try {
                str = loginBaseParam.utPageName;
            } catch (Exception unused) {
                sendEmailFailUT(loginBaseParam, rpcResponse, z);
                return;
            }
        }
        if (rpcResponse == null || (str2 = rpcResponse.actionType) == null) {
            sendEmailFailUT(loginBaseParam, rpcResponse, z);
        } else if ("SUCCESS".equals(str2)) {
            Properties properties = LoginComponent.getProperties(loginBaseParam);
            properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
            UserTrackAdapter.sendUT(str, UTConstans.CustomEvent.UT_EMAIL_SEND_SUCCESS, "", "emailLogin", properties);
        } else {
            sendEmailFailUT(loginBaseParam, rpcResponse, z);
        }
    }

    public void snslogin(LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a8e80a", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.SNS_LOGIN;
        rpcRequest.VERSION = "1.0";
        rpcRequest.setNewMtopApi();
        SnsLoginRequest snsLoginRequest = new SnsLoginRequest();
        rpcRequest.requestSite = DataProviderFactory.getDataProvider().getSite();
        snsLoginRequest.snsType = loginBaseParam.snsType;
        snsLoginRequest.token = loginBaseParam.snsTrustLoginToken;
        snsLoginRequest.appId = loginBaseParam.appId;
        buildBaseRequest(loginBaseParam, snsLoginRequest);
        if (DataProviderFactory.getDataProvider().getExternalData() != null) {
            if (snsLoginRequest.ext == null) {
                snsLoginRequest.ext = new HashMap();
            }
            snsLoginRequest.ext.putAll(DataProviderFactory.getDataProvider().getExternalData());
        }
        rpcRequest.addParam(ApiConstants.ApiField.SNS_LOGIN_INFO, JSON.toJSONString(snsLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        HashMap hashMap = new HashMap();
        addOuterExt(loginBaseParam, hashMap);
        rpcRequest.addParam("ext", JSON.toJSONString(hashMap));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, DefaultLoginResponseData.class, rpcRequestCallback);
    }

    public void tokenLoginUT(RpcResponse rpcResponse, LoginBaseParam loginBaseParam, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c51f8f", new Object[]{this, rpcResponse, loginBaseParam, new Boolean(z)});
            return;
        }
        if (loginBaseParam == null) {
            try {
                loginBaseParam = new LoginParam();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        String str2 = UTConstant.PageName.UT_PAGE_EXTEND;
        if (!TextUtils.isEmpty(loginBaseParam.utPageName)) {
            str2 = loginBaseParam.utPageName;
        }
        if (rpcResponse == null || (str = rpcResponse.actionType) == null) {
            tokenLoginFailure(str2, loginBaseParam, rpcResponse, z);
            return;
        }
        boolean equals = "SUCCESS".equals(str);
        String str3 = UTConstant.Args.UT_SUCCESS_F;
        if (equals) {
            Properties properties = new Properties();
            properties.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, "T");
            properties.setProperty("type", "ContinueLoginSuccess");
            if (!TextUtils.isEmpty(loginBaseParam.source)) {
                if (TextUtils.equals("Page_Login5-Reg", loginBaseParam.source)) {
                    properties.setProperty("source", "Page_Login5-RegistSuc");
                } else if (TextUtils.equals("Page_Login5-Login", loginBaseParam.source)) {
                    properties.setProperty("source", "Page_Login5-LoginSuc");
                }
            }
            properties.setProperty("sdkTraceId", loginBaseParam.sdkTraceId + "");
            if (z) {
                str3 = "T";
            }
            properties.setProperty("continueLogin", str3);
            String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(loginBaseParam.sdkTraceId);
            if (TextUtils.isEmpty(loginTypeByTraceId)) {
                loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(loginBaseParam.tokenType);
            }
            properties.setProperty("loginId", loginBaseParam.loginId + "");
            properties.setProperty("site", loginBaseParam.site + "");
            UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_LOGIN_SUCCESS, null, loginTypeByTraceId, properties);
            UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", loginTypeByTraceId, LoginComponent.getProperties(loginBaseParam));
        } else if ("H5".equals(rpcResponse.actionType)) {
            Properties properties2 = LoginComponent.getProperties(loginBaseParam);
            properties2.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, str3);
            properties2.setProperty("type", "ContinueLoginH5");
            if (z) {
                str3 = "T";
            }
            properties2.setProperty("continueLogin", str3);
            String loginTypeByTraceId2 = UTConstant.getLoginTypeByTraceId(loginBaseParam.sdkTraceId);
            if (TextUtils.isEmpty(loginTypeByTraceId2)) {
                loginTypeByTraceId2 = UTConstant.getLoginTypeByTokenType(loginBaseParam.tokenType);
            }
            UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_LOGIN_FAIL, rpcResponse.code + "", loginTypeByTraceId2, properties2);
        } else if (!ApiConstants.ResultActionType.TOKENLOGIN.equals(rpcResponse.actionType)) {
            tokenLoginFailure(str2, loginBaseParam, rpcResponse, z);
        }
    }

    public void unifySsoTokenLogin(LoginParam loginParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114c0f90", new Object[]{this, loginParam, rpcRequestCallback});
        } else {
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildUnifySsoTokenLoginRequest(loginParam), DefaultLoginResponseData.class, String.valueOf(loginParam.hid), rpcRequestCallback);
        }
    }

    public static void buildBaseRequest(LoginBaseParam loginBaseParam, LoginRequestBase loginRequestBase, boolean z) {
        Map<String, String> authInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b2f735", new Object[]{loginBaseParam, loginRequestBase, new Boolean(z)});
            return;
        }
        loginRequestBase.appName = DataProviderFactory.getDataProvider().getAppkey();
        loginRequestBase.sdkVersion = AppInfo.getInstance().getSdkVersion();
        loginRequestBase.ttid = DataProviderFactory.getDataProvider().getTTID();
        loginRequestBase.utdid = AppInfo.getInstance().getUtdid();
        loginRequestBase.deviceId = DataProviderFactory.getDataProvider().getDeviceId();
        loginRequestBase.site = DataProviderFactory.getDataProvider().getSite();
        loginRequestBase.locale = ResourceUtil.getLocaleStr();
        loginRequestBase.t = System.currentTimeMillis();
        if (z && loginBaseParam != null && loginBaseParam.hid != 0 && !TextUtils.isEmpty(loginBaseParam.deviceTokenKey)) {
            loginRequestBase.deviceTokenKey = loginBaseParam.deviceTokenKey;
            DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
            deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
            deviceTokenSignParam.addAppVersion(AppInfo.getInstance().getAndroidAppVersion());
            deviceTokenSignParam.addHavanaId(String.valueOf(loginBaseParam.hid));
            deviceTokenSignParam.addTimestamp(String.valueOf(loginRequestBase.t));
            deviceTokenSignParam.addSDKVersion(loginRequestBase.sdkVersion);
            loginRequestBase.deviceTokenSign = AlibabaSecurityTokenService.sign(loginRequestBase.deviceTokenKey, deviceTokenSignParam.build());
            loginRequestBase.hid = loginBaseParam.hid + "";
        }
        if (ServiceFactory.getService(FingerprintService.class) != null) {
            if (((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintSetable()) {
                loginRequestBase.supportBiometricType = "fingerprint";
            }
            if (((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintAvailable()) {
                loginRequestBase.biometricState = amo.a.POINT_NAME;
            }
        }
        NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (!(numberAuthService == null || (authInfoMap = numberAuthService.getAuthInfoMap()) == null)) {
            loginRequestBase.maskMobile = authInfoMap.get("number");
        }
        buildExt(loginBaseParam, loginRequestBase);
    }

    public static ScanFaceWSecurityData getScanFaceWSecurityData(LoginBaseParam loginBaseParam) {
        WSecurityData wSecurityData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScanFaceWSecurityData) ipChange.ipc$dispatch("162ce565", new Object[]{loginBaseParam});
        }
        ScanFaceWSecurityData scanFaceWSecurityData = new ScanFaceWSecurityData();
        if (loginBaseParam == null || (wSecurityData = loginBaseParam.wua) == null) {
            wSecurityData = SecurityGuardManagerWraper.buildWSecurityData();
        }
        scanFaceWSecurityData.apdId = wSecurityData.apdId;
        scanFaceWSecurityData.t = wSecurityData.t;
        scanFaceWSecurityData.umidToken = wSecurityData.umidToken;
        scanFaceWSecurityData.wua = wSecurityData.wua;
        try {
            ExtRiskData extRiskData = new ExtRiskData();
            scanFaceWSecurityData.extRiskData = extRiskData;
            extRiskData.scanfaceWua = SecurityGuardManagerWraper.buildRPSecurityData().wua;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        scanFaceWSecurityData.foreignLocation = wSecurityData.foreignLocation;
        return scanFaceWSecurityData;
    }

    public RpcResponse<MLoginTokenReturnValue> applyToken(int i, String str, Map<String, String> map) {
        HistoryAccount findHistoryAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("7078b467", new Object[]{this, new Integer(i), str, map});
        }
        RpcRequest rpcRequest = new RpcRequest();
        if (map == null) {
            map = new HashMap<>();
        }
        rpcRequest.requestSite = i;
        rpcRequest.API_NAME = "com.taobao.mtop.mLoginTokenService.applySsoToken";
        rpcRequest.VERSION = "1.1";
        rpcRequest.addParam("ext", JSON.toJSONString(map));
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        ApplyTokenRequest applyTokenRequest = new ApplyTokenRequest();
        applyTokenRequest.appName = DataProviderFactory.getDataProvider().getAppkey();
        applyTokenRequest.t = System.currentTimeMillis();
        applyTokenRequest.appVersion = AppInfo.getInstance().getAndroidAppVersion();
        applyTokenRequest.sdkVersion = AppInfo.getInstance().getSdkVersion();
        applyTokenRequest.site = i;
        if (!TextUtils.isEmpty(str) && (findHistoryAccount = SecurityGuardManagerWraper.findHistoryAccount(Long.parseLong(str))) != null) {
            applyTokenRequest.deviceTokenKey = findHistoryAccount.tokenKey;
            DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
            if (!TextUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
                deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
            }
            deviceTokenSignParam.addAppVersion(AppInfo.getInstance().getAndroidAppVersion());
            deviceTokenSignParam.addHavanaId(str);
            deviceTokenSignParam.addTimestamp(String.valueOf(applyTokenRequest.t));
            deviceTokenSignParam.addSDKVersion(AppInfo.getInstance().getSdkVersion());
            if (!TextUtils.isEmpty(findHistoryAccount.tokenKey)) {
                applyTokenRequest.deviceTokenSign = AlibabaSecurityTokenService.sign(findHistoryAccount.tokenKey, deviceTokenSignParam.build());
            }
        }
        rpcRequest.addParam("request", JSON.toJSONString(applyTokenRequest));
        return ((RpcService) ServiceFactory.getService(RpcService.class)).post(rpcRequest, LoginTokenResponseData.class, str);
    }

    public RpcRequest buildPwdLoginRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("7599551f", new Object[]{this, loginBaseParam});
        }
        loginRpcEntranceTracker(loginBaseParam);
        RpcRequest rpcRequest = new RpcRequest();
        PasswordLoginRequest passwordLoginRequest = new PasswordLoginRequest();
        Map<String, String> buildExtForLoginMtopApi = buildExtForLoginMtopApi(loginBaseParam);
        if (LoginSwitch.getSwitch("pwd2sms_pwdpage2", "true") && !TextUtils.isEmpty(loginBaseParam.fromRecommendLogin)) {
            buildExtForLoginMtopApi.put("scene", "recommendLogin");
            buildExtForLoginMtopApi.remove("dialogTitle");
            buildExtForLoginMtopApi.remove("dialogContent");
        }
        rpcRequest.API_NAME = ApiConstants.ApiName.PW_LOGIN;
        rpcRequest.VERSION = "1.0";
        rpcRequest.setNewMtopApi();
        passwordLoginRequest.loginType = AccountType.TAOBAO_ACCOUNT.getType();
        passwordLoginRequest.pageType = loginBaseParam.pageType;
        addOuterExt(loginBaseParam, buildExtForLoginMtopApi);
        rpcRequest.addParam("ext", JSON.toJSONString(buildExtForLoginMtopApi));
        rpcRequest.requestSite = loginBaseParam.site;
        passwordLoginRequest.loginId = loginBaseParam.loginId;
        addPwd(loginBaseParam, passwordLoginRequest);
        buildBaseRequest(loginBaseParam, passwordLoginRequest, true);
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(passwordLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(getScanFaceWSecurityData(loginBaseParam)));
        return rpcRequest;
    }

    public void emailLogin(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1449084e", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.API_EMAIL_LOGNI;
        rpcRequest.VERSION = "1.0";
        rpcRequest.setNewMtopApi();
        EmailLoginRequest emailLoginRequest = new EmailLoginRequest();
        rpcRequest.addParam("ext", JSON.toJSONString(buildExtForLoginMtopApi(loginBaseParam)));
        rpcRequest.requestSite = loginBaseParam.site;
        buildBaseRequest(loginBaseParam, emailLoginRequest, true);
        addPwd(loginBaseParam, emailLoginRequest);
        emailLoginRequest.emailSid = loginBaseParam.emailSid;
        emailLoginRequest.emailCode = loginBaseParam.emailCode;
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(emailLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        rpcRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.service.impl.UserLoginServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().emailLoginUT(loginBaseParam, rpcResponse);
                return FilterManager.STOP;
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, DefaultLoginResponseData.class, rpcRequestCallback);
    }

    public void sendEmailCode(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5339fa", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        if (loginBaseParam != null) {
            UserTrackAdapter.sendUT(loginBaseParam.utPageName, UTConstans.CustomEvent.UT_EMAIL_SEND, "", "emailLogin", LoginComponent.getProperties(loginBaseParam));
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.API_SEND_EMAIL_CODE;
        rpcRequest.VERSION = "1.0";
        rpcRequest.setNewMtopApi();
        EmailLoginRequest emailLoginRequest = new EmailLoginRequest();
        emailLoginRequest.emailSid = loginBaseParam.emailSid;
        String str = loginBaseParam.loginId;
        emailLoginRequest.nick = str;
        emailLoginRequest.email = str;
        rpcRequest.addParam("ext", JSON.toJSONString(buildExtForLoginMtopApi(loginBaseParam)));
        rpcRequest.requestSite = loginBaseParam.site;
        buildBaseRequest(loginBaseParam, emailLoginRequest, true);
        addPwd(loginBaseParam, emailLoginRequest);
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(emailLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        rpcRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.service.impl.UserLoginServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.this.sendEmailUT(loginBaseParam, rpcResponse, false);
                return FilterManager.STOP;
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, DefaultLoginResponseData.class, rpcRequestCallback);
    }

    private void buildExt(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2367c6b", new Object[]{this, map});
            return;
        }
        try {
            map.put("deviceName", Build.MODEL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
