package com.taobao.login4android.jsbridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallbackWithCode;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.LoginFrom;
import com.ali.user.mobile.login.presenter.AppLaunchDataPresenter;
import com.ali.user.mobile.login.presenter.NeedLoginPresenter;
import com.ali.user.mobile.login.service.impl.FingerprintLoginServiceImpl;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.WUAData;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.security.SSOSecurityService;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.UIService;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sso.v2.model.SSOSlaveParam;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.getAlipayCookies.mtop.GetThirdCookiesResponseData;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.session.ISession;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.kpw;
import tb.mop;
import tb.nsw;
import tb.rmo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class JSBridgeService extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JSBridgeService";
    private Handler mHandler;
    private BroadcastReceiver mLoginReceiver;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.jsbridge.JSBridgeService$9  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass9 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_REGISTER_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void access$000(JSBridgeService jSBridgeService, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ff74c3", new Object[]{jSBridgeService, wVCallBackContext});
        } else {
            jSBridgeService.tryToFinish(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(JSBridgeService jSBridgeService, WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1fb676", new Object[]{jSBridgeService, wVCallBackContext, str, str2});
        } else {
            jSBridgeService.failCallback(wVCallBackContext, str, str2);
        }
    }

    public static /* synthetic */ void access$200(JSBridgeService jSBridgeService, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f5a001", new Object[]{jSBridgeService, wVCallBackContext});
        } else {
            jSBridgeService.doWhenReceiveSuccess(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$300(JSBridgeService jSBridgeService, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8270b5a0", new Object[]{jSBridgeService, wVCallBackContext});
        } else {
            jSBridgeService.doWhenReceivedCancel(wVCallBackContext);
        }
    }

    private synchronized void checkLogin(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598b410f", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext != null) {
            if (Login.checkSessionValid()) {
                nsw nswVar = new nsw();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isLogin", true);
                } catch (Exception unused) {
                }
                nswVar.h(jSONObject);
                wVCallBackContext.success(nswVar);
            } else {
                nsw nswVar2 = new nsw();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("isLogin", false);
                } catch (Exception unused2) {
                }
                nswVar2.h(jSONObject2);
                wVCallBackContext.success(nswVar2);
            }
        }
    }

    private synchronized void closeNaviBar(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924f2243", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    String str2 = (String) new JSONObject(str).get("hidden");
                    if ("1".equals(str2)) {
                        ((UIService) ServiceFactory.getService(UIService.class)).setWebViewTitleBarVisibility(this.mContext, false);
                        wVCallBackContext.success();
                    } else if ("0".equals(str2)) {
                        ((UIService) ServiceFactory.getService(UIService.class)).setWebViewTitleBarVisibility(this.mContext, true);
                        wVCallBackContext.success();
                    } else {
                        setErrorCallback(wVCallBackContext);
                    }
                } catch (Exception unused) {
                    setErrorCallback(wVCallBackContext);
                }
            } else {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    private void doWhenReceiveSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71be28a9", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
    }

    private void doWhenReceivedCancel(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e383c4", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
    }

    private void failCallback(WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fa1c5b", new Object[]{this, wVCallBackContext, str, str2});
            return;
        }
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("code", str2);
        } catch (Exception unused) {
        }
        nswVar.h(jSONObject);
        nswVar.j("HY_FAILED");
        wVCallBackContext.error(nswVar);
    }

    private synchronized void getAtlasSign(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff76cac0", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    String string = new JSONObject(str).getString("data");
                    if (!TextUtils.isEmpty(string) && string.length() < 64) {
                        SSOSecurityService.getInstace(DataProviderFactory.getApplicationContext());
                        String sign = SSOSecurityService.sign(DataProviderFactory.getDataProvider().getAppkey(), string);
                        if (!TextUtils.isEmpty(sign)) {
                            nsw nswVar = new nsw();
                            nswVar.j("HY_SUCCESS");
                            nswVar.b("signedData", sign);
                            nswVar.b("appKey", DataProviderFactory.getDataProvider().getAppkey());
                            wVCallBackContext.success(nswVar);
                            return;
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            setErrorCallback(wVCallBackContext);
        }
    }

    private void getDeviceInfo(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3307045e", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            nsw nswVar = new nsw();
            nswVar.a("isTablet", Boolean.valueOf(DeviceUtils.isTablet(this.mContext)));
            nswVar.a("isFoldDevice", Boolean.valueOf(DeviceUtils.isFoldDevice(this.mContext)));
            nswVar.a("isPortraitStatus", Boolean.valueOf(DeviceUtils.isPortraitStatus(this.mContext)));
            wVCallBackContext.success(nswVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    private synchronized void getSDKVersion(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9ff542", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            try {
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                nswVar.b("sdkVersion", AppInfo.getInstance().getSdkVersion());
                wVCallBackContext.success(nswVar);
            } catch (Exception unused) {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    private synchronized void getSign(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39587181", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    String string = new JSONObject(str).getString("data");
                    String userId = Login.getUserId();
                    if (!TextUtils.isEmpty(userId) && !TextUtils.isEmpty(string) && string.length() < 128) {
                        HistoryAccount findHistoryAccount = SecurityGuardManagerWraper.findHistoryAccount(Long.parseLong(userId));
                        String sign = AlibabaSecurityTokenService.sign(findHistoryAccount.tokenKey, string);
                        if (!TextUtils.isEmpty(sign)) {
                            nsw nswVar = new nsw();
                            nswVar.j("HY_SUCCESS");
                            nswVar.b("signedData", sign);
                            nswVar.b("tokenKey", findHistoryAccount.tokenKey);
                            wVCallBackContext.success(nswVar);
                            return;
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            setErrorCallback(wVCallBackContext);
        }
    }

    private synchronized void getWuaData(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabe01a5", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            try {
                WUAData wua = SecurityGuardManagerWraper.getWUA();
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                nswVar.b("wua", JSON.toJSONString(wua));
                wVCallBackContext.success(nswVar);
            } catch (Exception unused) {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    private void handleCloseWebView(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22d2117", new Object[]{this, wVCallBackContext, str});
        } else {
            tryToFinish(wVCallBackContext);
        }
    }

    private void handleOpenWebView(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b09575", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                return;
            }
            boolean optBoolean = jSONObject.optBoolean(mop.KEY_IS_TRANSPARENT);
            boolean optBoolean2 = jSONObject.optBoolean(WebConstant.WEB_CLOSE_IF_LOAD_FAILED);
            String optString = jSONObject.optString(ParamsConstants.Key.PARAM_NAVIGATOR_TYPE);
            UrlParam urlParam = new UrlParam();
            urlParam.url = string;
            urlParam.site = DataProviderFactory.getDataProvider().getSite();
            urlParam.isTransparent = optBoolean;
            urlParam.closeIfLoadFailed = optBoolean2;
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(this.mContext, urlParam);
            wVCallBackContext.success();
            if ("cover".equals(optString)) {
                MainThreadExecutor.postDelayed(new Runnable() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            JSBridgeService.access$000(JSBridgeService.this, null);
                        }
                    }
                }, 100L);
            }
        } catch (Throwable th) {
            Log.e(TAG, "handleOpenWebView: ", th);
            th.printStackTrace();
            setErrorCallback(wVCallBackContext);
        }
    }

    private void handleSendEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4385138", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("eventName");
            String optString2 = jSONObject.optString("eventData");
            if (TextUtils.isEmpty(optString)) {
                wVCallBackContext.error(nsw.RET_PARAM_ERR);
            } else {
                WVStandardEventCenter.postNotificationToJS(optString, optString2);
                wVCallBackContext.success();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error(nsw.RET_FAIL);
        }
    }

    private void handleSwitchAccount(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9577e8df", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), new BroadcastReceiver() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/JSBridgeService$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    LoginAction valueOf;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                        if (AnonymousClass9.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()] != 1) {
                            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this);
                            return;
                        }
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 != null) {
                            wVCallBackContext2.success();
                        }
                        LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this);
                    }
                }
            });
            Intent intent = new Intent();
            intent.setAction("android.aliuser.MultiAccount");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(this.mContext.getPackageName());
            this.mContext.startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error(nsw.RET_FAIL);
        }
    }

    public static /* synthetic */ Object ipc$super(JSBridgeService jSBridgeService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/login4android/jsbridge/JSBridgeService");
        }
    }

    private synchronized void isBiometricsOpen(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4d47bd", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            nsw nswVar = new nsw();
            nswVar.j("HY_SUCCESS");
            nswVar.b("enabled", String.valueOf(FingerprintLoginServiceImpl.getInstance().isFingerprintLoginOpen()));
            wVCallBackContext.success(nswVar);
        }
    }

    private synchronized void isBiometricsSupport(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ffb318", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            nsw nswVar = new nsw();
            nswVar.j("HY_SUCCESS");
            nswVar.b("supported", String.valueOf(FingerprintLoginServiceImpl.getInstance().isFingerprintLoginSetable()));
            wVCallBackContext.success(nswVar);
        }
    }

    private synchronized void isMemberSDK(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64fa4c4", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            if (((UIService) ServiceFactory.getService(UIService.class)).isWebViewActivity(this.mContext)) {
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                wVCallBackContext.success(nswVar);
            } else {
                nsw nswVar2 = new nsw();
                nswVar2.j("HY_FAILED");
                wVCallBackContext.error(nswVar2);
            }
        }
    }

    private synchronized void isOldLogin(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f06b10", new Object[]{this, wVCallBackContext});
            return;
        }
        if (TextUtils.isEmpty(Login.getOldUserId())) {
            wVCallBackContext.error();
        } else {
            wVCallBackContext.success();
        }
    }

    private synchronized void miniProgram(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60897cfb", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    LoginController.getInstance().navByScheme(jSONObject.getString(SSOSlaveParam.KEY_APPKEY), jSONObject.getString("packageName"), jSONObject.getString("jumpPage"), null, new CommonCallback() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.model.CommonCallback
                        public void onFail(int i, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                                return;
                            }
                            nsw nswVar = new nsw();
                            nswVar.a("code", Integer.valueOf(i));
                            nswVar.b("msg", str2);
                            wVCallBackContext.error(nswVar);
                        }

                        @Override // com.ali.user.mobile.model.CommonCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                wVCallBackContext.success();
                            }
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    setErrorCallback(wVCallBackContext);
                }
            } else {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    private void needLoginTest(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8985a073", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map<String, Object> cache = NeedLoginPresenter.getCache();
        if (!TextUtils.isEmpty(str)) {
            try {
                String str2 = (String) new JSONObject(str).get("action");
                nsw nswVar = new nsw();
                if ("log".equals(str2)) {
                    Object obj = cache.get("actionPoints");
                    Object obj2 = cache.get("loginShowUI");
                    Object obj3 = cache.get("needLoginInfoData");
                    nswVar.b("行动点记录", JSON.toJSONString(obj));
                    nswVar.b("拉登记录", JSON.toJSONString(obj2));
                    nswVar.b("needLoginInfoData", JSON.toJSONString(obj3));
                    wVCallBackContext.success(nswVar);
                } else if ("removeCache".equals(str2)) {
                    NeedLoginPresenter.clearAllCacheAndSP();
                    AppLaunchDataPresenter.resetStopGetAppLaunchDataTime();
                    wVCallBackContext.success("清除缓存成功");
                }
            } catch (Throwable unused) {
                setErrorCallback(wVCallBackContext);
            }
        } else {
            setErrorCallback(wVCallBackContext);
        }
    }

    private synchronized void refreshAlipayCookieWithRemoteBiz(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdca50c", new Object[]{this, wVCallBackContext, str});
        } else {
            refreshThirdCookie(ApiConstants.ApiName.GET_ALIPAY_COOKIES, wVCallBackContext, str);
        }
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            fsw.h("aluWVJSBridge", JSBridgeService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void registerBroadcast(final WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307df172", new Object[]{this, wVCallBackContext, new Boolean(z)});
            return;
        }
        this.mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/JSBridgeService$6");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LoginAction valueOf;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                    int i = AnonymousClass9.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                    if (i == 1) {
                        JSBridgeService.access$200(JSBridgeService.this, wVCallBackContext);
                    } else if (i == 2) {
                        JSBridgeService.access$300(JSBridgeService.this, wVCallBackContext);
                    } else if (i == 3) {
                        JSBridgeService.access$300(JSBridgeService.this, wVCallBackContext);
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
    }

    private void sdkLogin(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a66f9d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        registerBroadcast(wVCallBackContext, false);
        try {
            Bundle jsonStringToBundle = BundleUtil.jsonStringToBundle(str);
            if (wVCallBackContext.getWebview() == null || TextUtils.isEmpty(wVCallBackContext.getWebview().getUrl())) {
                jsonStringToBundle.putString(LoginConstants.BROWSER_REF_URL, "jsbridge.sdkLogin");
            } else {
                String url = wVCallBackContext.getWebview().getUrl();
                jsonStringToBundle.putString(LoginConstants.JSBRIDGE_REF_URL, url);
                LoginStatus.jsbridgeRefUrl = url;
                jsonStringToBundle.putString(LoginConstants.BROWSER_REF_URL, "jsbridge.sdkLogin:" + url);
            }
            Login.login(true, jsonStringToBundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void sdkLogout(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e78472", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Login.logout();
        wVCallBackContext.success();
    }

    private void sdkRegister(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1ce041", new Object[]{this, wVCallBackContext});
            return;
        }
        registerBroadcast(wVCallBackContext, true);
        RegistParam registParam = new RegistParam();
        registParam.registSite = DataProviderFactory.getDataProvider().getSite();
        Login.goRegister(registParam);
    }

    private void setErrorCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c17fa6f", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
    }

    private synchronized void toggleBiometrics(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2497d", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            if (!TextUtils.isEmpty(str)) {
                if ("1".equals((String) new JSONObject(str).get("action"))) {
                    FingerprintLoginServiceImpl.getInstance().openFingerprintLoginSet();
                } else {
                    FingerprintLoginServiceImpl.getInstance().closeFingerprintLoginSet();
                }
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                wVCallBackContext.success(nswVar);
            } else {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    private void tokenLogin(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d8d3fe", new Object[]{this, wVCallBackContext, str});
            return;
        }
        final nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            LoginParam loginParam = new LoginParam();
            loginParam.scene = jSONObject.getString("scene");
            loginParam.token = jSONObject.getString("token");
            LoginApi.tokenLogin(loginParam, null, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                        return;
                    }
                    nswVar.b("msg", "onCancel");
                    wVCallBackContext.error();
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    nsw nswVar2 = nswVar;
                    if (nswVar2 != null) {
                        nswVar2.b("msg", loginException.getMsg());
                        nswVar.a("code", Integer.valueOf(loginException.getCode()));
                    }
                    wVCallBackContext.error(nswVar);
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        wVCallBackContext.success();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            nswVar.b("msg", e.getMessage());
        }
    }

    private void tryToFinish(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428d510d", new Object[]{this, wVCallBackContext});
            return;
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error(nsw.RET_FAIL);
        }
    }

    public void afterCancelAccount(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a16f425", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                String str2 = (String) new JSONObject(str).get("maskHid");
                if (TextUtils.isEmpty(str2)) {
                    wVCallBackContext.error();
                    return;
                }
                SecurityGuardManagerWraper.afterCancelAccount(str2);
                wVCallBackContext.success();
            } catch (Throwable th) {
                wVCallBackContext.error();
                th.printStackTrace();
            }
        } else {
            setErrorCallback(wVCallBackContext);
        }
    }

    public synchronized void closeWebViewByUrl(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8131165", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            if (!((UIService) ServiceFactory.getService(UIService.class)).finishWebViewActivity(this.mContext)) {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    public void enableHookNativeBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e897a1c8", new Object[]{this, wVCallBackContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = BaseActivity.HOOK_NATIVE_BACK;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void getAppKey(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb85582", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                nswVar.b("aluAppKey", DataProviderFactory.getDataProvider().getAppkey());
                wVCallBackContext.success(nswVar);
            } catch (Exception unused) {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    public void getLoginMaskPhone(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c56dbd", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                Login.getLoginMaskPhone(new JSONObject(str).optInt("timeout", 5000), "jsbridge", new CommonDataCallback() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                    public void onFail(int i, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                        } else {
                            JSBridgeService.access$100(JSBridgeService.this, wVCallBackContext, str2, String.valueOf(i));
                        }
                    }

                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                    public void onSuccess(Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        } else if (map != null) {
                            wVCallBackContext.success(JSON.toJSONString(map));
                        }
                    }
                });
            } catch (Throwable unused) {
                setErrorCallback(wVCallBackContext);
            }
        } else {
            setErrorCallback(wVCallBackContext);
        }
    }

    public void getOneKeyToken(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526a8cb8", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                new JSONObject(str);
                if (ServiceFactory.getService(NumberAuthService.class) != null) {
                    ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginToken("jsbridge", new NumAuthTokenCallback() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                        public void onGetAuthTokenFail(int i, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("27f95aee", new Object[]{this, new Integer(i), str2});
                            } else {
                                JSBridgeService.access$100(JSBridgeService.this, wVCallBackContext, str2, String.valueOf(i));
                            }
                        }

                        @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                        public void onGetAuthTokenSuccess(String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("20cbbe7a", new Object[]{this, str2});
                                return;
                            }
                            nsw nswVar = new nsw();
                            nswVar.b("token", str2);
                            wVCallBackContext.success(nswVar);
                        }
                    });
                } else {
                    failCallback(wVCallBackContext, "sdk not init or don't have auth service", "-199");
                }
            } catch (Throwable th) {
                th.printStackTrace();
                setErrorCallback(wVCallBackContext);
            }
        } else {
            setErrorCallback(wVCallBackContext);
        }
    }

    public void getUMID(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7ae9d7", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                nswVar.b("aluUmid", AppInfo.getInstance().getUmidToken());
                wVCallBackContext.success(nswVar);
            } catch (Exception unused) {
                setErrorCallback(wVCallBackContext);
            } catch (Throwable unused2) {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    public synchronized void getUmid(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf5bdf7", new Object[]{this, wVCallBackContext, str});
        } else {
            getUMID(wVCallBackContext, str);
        }
    }

    public void getUserInfo(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e6b1d3", new Object[]{this, wVCallBackContext});
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("nick", (Object) Login.getNick());
        jSONObject.put("userId", (Object) Login.getUserId());
        jSONObject.put("sid", (Object) Login.getSid());
        wVCallBackContext.success(jSONObject.toJSONString());
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        Context context2 = this.mContext;
        if (context2 instanceof BaseActivity) {
            this.mHandler = ((BaseActivity) context2).getHandler();
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
        }
    }

    public synchronized void openWebViewByUrl(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783ee037", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                UrlParam urlParam = new UrlParam();
                urlParam.scene = "";
                urlParam.url = (String) new JSONObject(str).get("url");
                urlParam.site = DataProviderFactory.getDataProvider().getSite();
                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(this.mContext, urlParam);
                nsw nswVar = new nsw();
                nswVar.j("success !!!");
                wVCallBackContext.success(nswVar);
            } catch (Exception e) {
                e.printStackTrace();
                setErrorCallback(wVCallBackContext);
            }
        } else {
            setErrorCallback(wVCallBackContext);
        }
    }

    private synchronized void getLoginFrom(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50feb6cb", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "Callback is null");
        } else {
            try {
                String loginFrom = LoginFrom.getLoginFrom();
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                nswVar.b("loginEntrance", loginFrom);
                nswVar.a("isLogin", Boolean.valueOf(Login.checkSessionValid()));
                nswVar.a("hasLoginToken", Boolean.valueOf(true ^ TextUtils.isEmpty(Login.getLoginToken())));
                if (Login.checkSessionValid() || !TextUtils.isEmpty(Login.getLoginToken())) {
                    nswVar.a("isNew", Boolean.FALSE);
                } else {
                    nswVar.a("isNew", Boolean.TRUE);
                }
                wVCallBackContext.success(nswVar);
            } catch (Exception unused) {
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    private synchronized void refreshThirdCookie(final String str, final WVCallBackContext wVCallBackContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59286668", new Object[]{this, str, wVCallBackContext, str2});
        } else if (wVCallBackContext == null) {
            LoginTLogAdapter.e(TAG, "callback is null");
        } else if (TextUtils.isEmpty(str2)) {
            setErrorCallback(wVCallBackContext);
        } else {
            try {
                new JSONObject(str2);
                RpcRequest rpcRequest = new RpcRequest();
                rpcRequest.API_NAME = str;
                rpcRequest.VERSION = "1.0";
                rpcRequest.NEED_SESSION = true;
                rpcRequest.NEED_ECODE = true;
                rpcRequest.addParam("umidToken", AppInfo.getInstance().getUmidToken());
                rpcRequest.addParam("ext", str2);
                rpcRequest.requestSite = DataProviderFactory.getDataProvider().getSite();
                ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, GetThirdCookiesResponseData.class, new RpcRequestCallbackWithCode() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.RpcRequestCallbackWithCode
                    public void onError(String str3, RpcResponse rpcResponse) {
                        String str4;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e5b227f3", new Object[]{this, str3, rpcResponse});
                            return;
                        }
                        if (rpcResponse != null) {
                            str4 = String.valueOf(rpcResponse.code);
                        } else {
                            str4 = "-1";
                        }
                        JSBridgeService.access$100(JSBridgeService.this, wVCallBackContext, str3, str4);
                    }

                    @Override // com.ali.user.mobile.callback.RpcRequestCallbackWithCode
                    public void onSystemError(String str3, RpcResponse rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e6a36b02", new Object[]{this, str3, rpcResponse});
                        } else {
                            JSBridgeService.access$100(JSBridgeService.this, wVCallBackContext, str3, "-1");
                        }
                    }

                    @Override // com.ali.user.mobile.callback.RpcRequestCallbackWithCode
                    public void onSuccess(RpcResponse rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        } else if (rpcResponse == null) {
                            JSBridgeService.access$100(JSBridgeService.this, wVCallBackContext, "mtop response=null", "-1");
                        } else if (rpcResponse instanceof GetThirdCookiesResponseData) {
                            final String[] strArr = ((GetThirdCookiesResponseData) rpcResponse).returnValue;
                            if (strArr == null || strArr.length <= 0) {
                                JSBridgeService.access$100(JSBridgeService.this, wVCallBackContext, "mtop response=null", "-1");
                            } else {
                                new CoordinatorWrapper().execute(new AsyncTask<Object, Void, RpcResponse>() { // from class: com.taobao.login4android.jsbridge.JSBridgeService.8.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str3, Object... objArr) {
                                        str3.hashCode();
                                        int hashCode = str3.hashCode();
                                        throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/JSBridgeService$8$1");
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // android.os.AsyncTask
                                    public RpcResponse doInBackground(Object... objArr) {
                                        boolean z = true;
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return (RpcResponse) ipChange3.ipc$dispatch("85055509", new Object[]{this, objArr});
                                        }
                                        boolean z2 = LoginSwitch.getSwitch("alipayHttps", "true");
                                        if (Login.session == null) {
                                            Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
                                        }
                                        ISession iSession = Login.session;
                                        String[] strArr2 = strArr;
                                        if (!z2 || !ApiConstants.ApiName.GET_ALIPAY_COOKIES.equals(str)) {
                                            z = false;
                                        }
                                        iSession.injectExternalCookies(strArr2, false, z);
                                        return null;
                                    }

                                    public void onPostExecute(RpcResponse rpcResponse2) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("e0e04a30", new Object[]{this, rpcResponse2});
                                            return;
                                        }
                                        nsw nswVar = new nsw();
                                        nswVar.j("HY_SUCCESS");
                                        wVCallBackContext.success(nswVar);
                                    }
                                }, new Object[0]);
                            }
                        } else {
                            JSBridgeService.access$100(JSBridgeService.this, wVCallBackContext, "mtop response=null", "-1");
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                setErrorCallback(wVCallBackContext);
            }
        }
    }

    private void snsLogin(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99fefa9f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        registerBroadcast(wVCallBackContext, false);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("source");
            if (SNSPlatform.convertSNSPlatform(string) != null) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("source", string2);
                    rmo.m(SNSPlatform.PLATFORM_ALIPAY, (Activity) context, hashMap);
                    return;
                }
            }
            failCallback(wVCallBackContext, ErrorCode.PARAM_ERROR_MESSAGE, String.valueOf(1003));
        } catch (Throwable th) {
            th.printStackTrace();
            failCallback(wVCallBackContext, ErrorCode.PARAM_ERROR_MESSAGE, String.valueOf(1003));
        }
    }

    private void needManualLogin(WVCallBackContext wVCallBackContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e089c411", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw();
            nswVar.j("HY_SUCCESS");
            if (LoginStatus.isLogining() || Login.checkSessionValid() || !TextUtils.isEmpty(Login.getLoginToken())) {
                z = true;
            }
            nswVar.a("need", Boolean.valueOf(true ^ z));
            wVCallBackContext.success(nswVar);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("execute() called with: action = [");
        sb.append(str);
        sb.append("], params = [");
        sb.append(str2);
        sb.append("]");
        if ("getUserInfo".equals(str)) {
            getUserInfo(wVCallBackContext);
        } else if ("getUmid".equals(str)) {
            getUmid(wVCallBackContext, str2);
        } else if ("getWua".equals(str)) {
            getWuaData(wVCallBackContext, str2);
        } else if ("getAppKey".equals(str)) {
            getAppKey(wVCallBackContext, str2);
        } else if ("getSdkVersion".equals(str)) {
            getSDKVersion(wVCallBackContext, str2);
        } else if ("aluOpenWebViewByUrl".equals(str)) {
            openWebViewByUrl(wVCallBackContext, str2);
        } else if ("aluCloseWebView".equals(str)) {
            closeWebViewByUrl(wVCallBackContext, str2);
        } else if ("refreshAlipayCookie".equals(str)) {
            refreshAlipayCookieWithRemoteBiz(wVCallBackContext, str2);
        } else if ("userIsLogin".equals(str)) {
            checkLogin(wVCallBackContext, str2);
        } else if ("isOldLogin".equals(str)) {
            isOldLogin(wVCallBackContext);
        } else if ("setNaviBarHidden".equals(str)) {
            closeNaviBar(wVCallBackContext, str2);
        } else if ("isMemberSDK".equals(str)) {
            isMemberSDK(wVCallBackContext, str2);
        } else if ("aluGetSign".equals(str)) {
            getSign(wVCallBackContext, str2);
        } else if ("aluGetAtlasSign".equals(str)) {
            getAtlasSign(wVCallBackContext, str2);
        } else if ("miniProgram".equals(str)) {
            miniProgram(wVCallBackContext, str2);
        } else if ("needManualLogin".equals(str)) {
            needManualLogin(wVCallBackContext);
        } else if ("sdkLogin".equals(str)) {
            sdkLogin(wVCallBackContext, str2);
        } else if ("sdkRegister".equals(str)) {
            sdkRegister(wVCallBackContext);
        } else if ("sdkLogout".equals(str)) {
            sdkLogout(wVCallBackContext, str2);
        } else if ("snsLogin".equals(str)) {
            snsLogin(wVCallBackContext, str2);
        } else if ("enableHookNativeBack".equals(str)) {
            enableHookNativeBack(wVCallBackContext);
            return true;
        } else if ("getInfoByNative".equals(str)) {
            getLoginFrom(wVCallBackContext, str2);
        } else if ("toggleBiometrics".equals(str)) {
            toggleBiometrics(wVCallBackContext, str2);
        } else if ("isBiometricsOpen".equals(str)) {
            isBiometricsOpen(wVCallBackContext, str2);
        } else if ("isBiometricsSupport".equals(str)) {
            isBiometricsSupport(wVCallBackContext, str2);
        } else if ("afterCancelAccount".equals(str)) {
            afterCancelAccount(wVCallBackContext, str2);
        } else if ("getLoginMaskPhone".equals(str)) {
            getLoginMaskPhone(wVCallBackContext, str2);
        } else if ("getOneKeyToken".equals(str)) {
            getOneKeyToken(wVCallBackContext, str2);
        } else if ("openWebView".equals(str)) {
            handleOpenWebView(wVCallBackContext, str2);
        } else if ("sendEvent".equals(str)) {
            handleSendEvent(wVCallBackContext, str2);
        } else if ("closeWebView".equals(str)) {
            handleCloseWebView(wVCallBackContext, str2);
        } else if ("switchAccount".equals(str)) {
            handleSwitchAccount(wVCallBackContext, str2);
        } else if (LoginType.LocalLoginType.TOKEN_LOGIN.equals(str)) {
            tokenLogin(wVCallBackContext, str2);
        } else if (DeviceInfoJsBridge.ACTION.equals(str)) {
            getDeviceInfo(wVCallBackContext);
        } else if (!"needLoginTest".equals(str)) {
            return false;
        } else {
            needLoginTest(wVCallBackContext, str2);
        }
        return true;
    }
}
