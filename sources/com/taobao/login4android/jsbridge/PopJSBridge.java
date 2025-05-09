package com.taobao.login4android.jsbridge;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.model.LoginPopInfo;
import com.ali.user.mobile.login.presenter.AppLaunchDataPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.AUProgressDialog;
import com.ali.user.mobile.utils.CollectionUtils;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.ReloginDelegate;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.ToastUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fsw;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOGIN_ALIPAY = 77;
    private static final String TAG = "login.PopJSBridge";
    private AppLaunchInfo appLaunchInfo;
    private HistoryAccount historyAccount;
    private LoginPopInfo loginPopInfo;
    private BroadcastReceiver mLoginReceiver;
    private String source;
    private static int GET_BAR_PARAM_ERROR = 1700;
    private static int GET_BAR_INFO_EMPTY = SecExceptionCode.SEC_ERROR_AVMP_SAFETOKEN_INVALID_PARAM;
    private static int GET_BAR_INFO_EXCEPTION = 1702;
    private static int GET_BAR_INFO_CHECK_LOGIN_FAILED = 1703;
    public static Boolean homepageFirstResumed = null;
    public static boolean markNotShow = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.jsbridge.PopJSBridge$7  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_ALIPAY_SSO_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_ALIPAY_SSO_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_REGISTER_CANCEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        t2o.a(517996605);
    }

    public static /* synthetic */ void access$000(PopJSBridge popJSBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a838203", new Object[]{popJSBridge, wVCallBackContext});
        } else {
            popJSBridge.doWhenReceiveSuccess(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(PopJSBridge popJSBridge, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b984ea64", new Object[]{popJSBridge, str, hashMap});
        } else {
            popJSBridge.track(str, hashMap);
        }
    }

    public static /* synthetic */ void access$1000(PopJSBridge popJSBridge, WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e2d188", new Object[]{popJSBridge, wVCallBackContext, str, str2});
        } else {
            popJSBridge.failCallback(wVCallBackContext, str, str2);
        }
    }

    public static /* synthetic */ int access$1100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ad12fda", new Object[0])).intValue();
        }
        return GET_BAR_INFO_EXCEPTION;
    }

    public static /* synthetic */ void access$200(PopJSBridge popJSBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355cfc41", new Object[]{popJSBridge, wVCallBackContext});
        } else {
            popJSBridge.doWhenReceivedCancel(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$300(PopJSBridge popJSBridge, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d831741", new Object[]{popJSBridge, str, str2, str3});
        } else {
            popJSBridge.trackFailure(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$400(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf34c42", new Object[]{popJSBridge});
        } else {
            popJSBridge.handleLoginSuccess();
        }
    }

    public static /* synthetic */ String access$500(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f9027df", new Object[]{popJSBridge});
        }
        return popJSBridge.source;
    }

    public static /* synthetic */ void access$600(PopJSBridge popJSBridge, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf91b0ad", new Object[]{popJSBridge, jSONObject, wVCallBackContext});
        } else {
            popJSBridge.requestPopInfo(jSONObject, wVCallBackContext);
        }
    }

    public static /* synthetic */ boolean access$700(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c45c823", new Object[]{popJSBridge})).booleanValue();
        }
        return popJSBridge.iSupportAlipay();
    }

    public static /* synthetic */ Context access$800(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c454cbb6", new Object[]{popJSBridge});
        }
        return popJSBridge.mContext;
    }

    public static /* synthetic */ int access$900() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98ee1cb3", new Object[0])).intValue();
        }
        return GET_BAR_INFO_EMPTY;
    }

    private void callbackNotShow(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3131af", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("showPop", (Object) "false");
            wVCallBackContext.success(jSONObject.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private AUProgressDialog createDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AUProgressDialog) ipChange.ipc$dispatch("9b18ae19", new Object[]{this});
        }
        if (getContext() instanceof Activity) {
            AUProgressDialog aUProgressDialog = new AUProgressDialog(getContext());
            aUProgressDialog.setProgressVisiable(true);
            return aUProgressDialog;
        } else if (LoginBarController.getMainActivity() == null) {
            return null;
        } else {
            AUProgressDialog aUProgressDialog2 = new AUProgressDialog(LoginBarController.getMainActivity());
            aUProgressDialog2.setProgressVisiable(true);
            return aUProgressDialog2;
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
        handleLoginSuccess();
        LoginStatus.source = null;
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
        LoginStatus.source = null;
    }

    private void failCallback(WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fa1c5b", new Object[]{this, wVCallBackContext, str, str2});
            return;
        }
        nsw nswVar = new nsw();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("code", str2);
        } catch (Exception unused) {
        }
        nswVar.h(jSONObject);
        nswVar.j("HY_FAILED");
        wVCallBackContext.error(nswVar);
    }

    private void handleAlipayLogin(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98c2fef", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        try {
            if (getContext() instanceof Activity) {
                activity = (Activity) getContext();
            } else {
                activity = LoginBarController.getMainActivity();
            }
            if (activity == null) {
                wVCallBackContext.error();
                return;
            }
            track("login_pop_alipayLogin_commit", null);
            AUProgressDialog createDialog = createDialog();
            if (createDialog != null) {
                createDialog.show();
            }
            boolean isXianyuReg = isXianyuReg(jSONObject);
            LoginStatus.source = this.source;
            registerBroadcast(wVCallBackContext, 77, createDialog);
            AlipayAuth.alipayAuth("login_pop", activity, isXianyuReg);
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private void handleLoginSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126f9a29", new Object[]{this});
        }
    }

    private void handleSimLogin(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efbee2c", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        try {
            track("login_pop_simLogin_commit", null);
            LoginParam loginParam = new LoginParam();
            String str = this.source;
            loginParam.source = str;
            loginParam.sdkTraceId = ApiReferer.generateTraceId(str, UTConstant.PageName.UT_PAGE_EXTEND);
            LoginStatus.source = this.source;
            final AUProgressDialog createDialog = createDialog();
            if (createDialog != null) {
                createDialog.show();
            }
            loginParam.regXianyu = isXianyuReg(jSONObject);
            LoginApi.simLogin(loginParam, null, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                        return;
                    }
                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_simLogin_cancel", null);
                    wVCallBackContext.error();
                    AUProgressDialog aUProgressDialog = createDialog;
                    if (aUProgressDialog != null) {
                        aUProgressDialog.dismiss();
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_simLogin_success", null);
                    LoginTLogAdapter.e(PopJSBridge.TAG, "onSuccess: login_pop_simLogin_success");
                    wVCallBackContext.success();
                    PopJSBridge.access$400(PopJSBridge.this);
                    AUProgressDialog aUProgressDialog = createDialog;
                    if (aUProgressDialog != null) {
                        aUProgressDialog.dismiss();
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    PopJSBridge popJSBridge = PopJSBridge.this;
                    PopJSBridge.access$300(popJSBridge, "login_pop_simLogin_error", "" + loginException.getCode(), loginException.getMsg());
                    AUProgressDialog aUProgressDialog = createDialog;
                    if (aUProgressDialog != null) {
                        aUProgressDialog.dismiss();
                    }
                    wVCallBackContext.error();
                    if (loginException.getCode() == 3010 || loginException.getCode() == 14076) {
                        ToastUtil.showToast(PopJSBridge.this.getContext(), PopJSBridge.this.getContext().getString(R.string.aliuser_onekey_login_fail_tip), 0);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                        bundle.putBoolean(LoginConstant.FORCE_NORMAL_MODE, true);
                        bundle.putString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE, UIBaseConstants.LoginPage.PAGE_RECOMMEND_LOGIN);
                        bundle.putString("source", PopJSBridge.access$500(PopJSBridge.this));
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(PopJSBridge.this.getContext(), ApiReferer.generateApiReferer(), bundle);
                        return;
                    }
                    ToastUtil.showToast(PopJSBridge.this.getContext(), loginException.getMsg(), 0);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean iSupportAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f04dd9b", new Object[]{this})).booleanValue();
        }
        OauthService oauthService = (OauthService) AliMemberSDK.getService(OauthService.class);
        if (oauthService == null || !oauthService.isAppAuthSurpport(getContext(), "alipay")) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(PopJSBridge popJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/PopJSBridge");
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            fsw.h("aluPopJSBridge", PopJSBridge.class);
        } catch (Exception unused) {
        }
    }

    private void registerBroadcast(final WVCallBackContext wVCallBackContext, final int i, final Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a604d7da", new Object[]{this, wVCallBackContext, new Integer(i), dialog});
            return;
        }
        this.mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/PopJSBridge$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    LoginTLogAdapter.e(PopJSBridge.TAG, "onReceive: " + intent.getAction());
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    if (valueOf != null) {
                        switch (AnonymousClass7.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()]) {
                            case 1:
                                PopJSBridge.access$000(PopJSBridge.this, wVCallBackContext);
                                if (i == 77) {
                                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_alipayLogin_success", null);
                                    break;
                                }
                                break;
                            case 2:
                                if (i == 77) {
                                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_alipayLogin_error", null);
                                }
                                if (LoginSwitch.getSwitch("toastFailBroadcast", "false")) {
                                    ToastUtil.showToast(context, intent.getStringExtra("message"), 0);
                                    break;
                                }
                                break;
                            case 3:
                            case 4:
                            case 5:
                                PopJSBridge.access$200(PopJSBridge.this, wVCallBackContext);
                                if (i == 77) {
                                    PopJSBridge.access$300(PopJSBridge.this, "login_pop_alipayLogin_cancel", "-1113", "login_cancel");
                                    break;
                                }
                                break;
                            case 6:
                                PopJSBridge.access$200(PopJSBridge.this, wVCallBackContext);
                                if (i == 77) {
                                    PopJSBridge.access$300(PopJSBridge.this, "login_pop_alipayLogin_cancel", "-1113", "register_cancel");
                                    break;
                                }
                                break;
                        }
                        try {
                            Dialog dialog2 = dialog;
                            if (dialog2 != null) {
                                dialog2.dismiss();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
    }

    private void track(String str, HashMap<String, String> hashMap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59b4297", new Object[]{this, str, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        Boolean bool = homepageFirstResumed;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        }
        hashMap.put("isFirstTime", String.valueOf(z));
        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, hashMap);
    }

    private void tryToGetLoginMaskPhone(final DataCallback<Map<String, String>> dataCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe08e9a", new Object[]{this, dataCallback, str});
            return;
        }
        NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (numberAuthService == null) {
            dataCallback.result(null);
            return;
        }
        final HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", str);
        final long currentTimeMillis = System.currentTimeMillis();
        track("login_pop_get_mask_phone_commit", hashMap);
        if (!numberAuthService.hasPreFecthMaskPhone() || numberAuthService.needPrefetch()) {
            numberAuthService.getLoginMaskPhone(3000, str, new CommonDataCallback() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onFail(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                        return;
                    }
                    dataCallback.result(null);
                    PopJSBridge popJSBridge = PopJSBridge.this;
                    PopJSBridge.access$300(popJSBridge, "login_pop_get_mask_phone_fail", i + "", str2);
                    if (PopJSBridge.access$700(PopJSBridge.this)) {
                        PopJSBridge popJSBridge2 = PopJSBridge.this;
                        PopJSBridge.access$300(popJSBridge2, "login_pop_get_mask_phone_fail_alipay_installed", i + "", str2);
                        return;
                    }
                    PopJSBridge popJSBridge3 = PopJSBridge.this;
                    PopJSBridge.access$300(popJSBridge3, "login_pop_get_mask_phone_fail_alipay_not_installed", i + "", str2);
                }

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onSuccess(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        return;
                    }
                    hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_get_mask_phone_success", hashMap);
                    dataCallback.result(map);
                }
            });
            return;
        }
        hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        track("login_pop_prefetch_get_mask_phone_success", hashMap);
        dataCallback.result(numberAuthService.getAuthInfoMap());
    }

    private void getBarData(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4237efbf", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (jSONObject == null || !jSONObject.containsKey("checkLogin")) {
            failCallback(wVCallBackContext, ResourceUtil.getInvalidParam(), String.valueOf(GET_BAR_PARAM_ERROR));
        } else {
            try {
                if (!jSONObject.containsKey("checkLogin") || !"true".equals(jSONObject.getString("checkLogin")) || (!LoginStatus.isLogining() && !Login.checkSessionValid() && TextUtils.isEmpty(Login.getLoginToken()))) {
                    CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, AppLaunchInfoResponseData>() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                            if (str.hashCode() == -1325021319) {
                                super.onPostExecute((AnonymousClass6) objArr[0]);
                                return null;
                            }
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/PopJSBridge$6");
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.AsyncTask
                        public AppLaunchInfoResponseData doInBackground(Object... objArr) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (AppLaunchInfoResponseData) ipChange2.ipc$dispatch("6e64cfa4", new Object[]{this, objArr}) : AppLaunchDataPresenter.getAppLaunchData(PopJSBridge.access$800(PopJSBridge.this), true);
                        }

                        public void onPostExecute(AppLaunchInfoResponseData appLaunchInfoResponseData) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a2b69a8b", new Object[]{this, appLaunchInfoResponseData});
                                return;
                            }
                            super.onPostExecute((AnonymousClass6) appLaunchInfoResponseData);
                            if (appLaunchInfoResponseData != null) {
                                try {
                                    T t = appLaunchInfoResponseData.returnValue;
                                    if (!(t == 0 || ((AppLaunchInfo) t).bottomFloatingBarInfo == null)) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        Map<String, String> authInfoMap = ServiceFactory.getService(NumberAuthService.class) != null ? ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() : null;
                                        if (!CollectionUtils.isEmpty(authInfoMap)) {
                                            jSONObject2.put("number", (Object) authInfoMap.get("number"));
                                            jSONObject2.put("protocolName", (Object) authInfoMap.get("protocolName"));
                                            jSONObject2.put("protocolURL", (Object) authInfoMap.get("protocolURL"));
                                        }
                                        jSONObject2.put("alipayInstalled", (Object) String.valueOf(PopJSBridge.access$700(PopJSBridge.this)));
                                        jSONObject2.put("bottomFloatingBarInfo", (Object) ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).bottomFloatingBarInfo);
                                        jSONObject2.put("locatedUmidAccount", (Object) Boolean.valueOf(((AppLaunchInfo) appLaunchInfoResponseData.returnValue).locatedUmidAccount));
                                        jSONObject2.put(LoginConstant.UMID_TOKEN, (Object) ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).umidLoginToken);
                                        wVCallBackContext.success(jSONObject2.toJSONString());
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    PopJSBridge.access$1000(PopJSBridge.this, wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(PopJSBridge.access$1100()));
                                    return;
                                }
                            }
                            PopJSBridge.access$1000(PopJSBridge.this, wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(PopJSBridge.access$900()));
                        }
                    }, new Object[0]);
                    return;
                }
                failCallback(wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(GET_BAR_INFO_CHECK_LOGIN_FAILED));
            } catch (Throwable th) {
                th.printStackTrace();
                failCallback(wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(GET_BAR_INFO_EXCEPTION));
            }
        }
    }

    private void hasLoginCalback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da086a0a", new Object[]{this, wVCallBackContext});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (com.taobao.login4android.Login.canAutoLogin()) {
            track("login_pop_can_autologin", hashMap);
        } else {
            hashMap.put("onceLogined", String.valueOf(true ^ TextUtils.isEmpty(com.taobao.login4android.Login.getOldUserId())));
            track("login_pop_not_can_autologin", hashMap);
        }
        callbackNotShow(wVCallBackContext);
    }

    private static boolean isXianyuReg(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("480eab9d", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            try {
                return "xianyu".equals(jSONObject.getString("unionReg"));
            } catch (Throwable th) {
                LoginTLogAdapter.e(TAG, "parse unionReg Exception ", th);
            }
        }
        return false;
    }

    private void handleGetPopData(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24248bb", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (LoginSwitch.getSwitch("login_pop_enabled", "true")) {
                track("login_pop_call", null);
                if (LoginSwitch.getSwitch("login_pop_new_check_enabled", "true")) {
                    if (!markNotShow) {
                        if (!com.taobao.login4android.Login.canAutoLogin()) {
                            if (com.taobao.login4android.Login.checkSessionValid()) {
                            }
                        }
                    }
                    hasLoginCalback(wVCallBackContext);
                    return;
                }
                if (!markNotShow) {
                    if (TextUtils.isEmpty(com.taobao.login4android.Login.getOldUserId())) {
                        if (com.taobao.login4android.Login.checkSessionValid()) {
                        }
                    }
                }
                track("login_pop_login_once", null);
                LoginTLogAdapter.e(TAG, "handleGetPopData: skip 1");
                callbackNotShow(wVCallBackContext);
                return;
                if (LoginStatus.isLogining()) {
                    track("login_pop_exist_login_0", null);
                    callbackNotShow(wVCallBackContext);
                } else if (isProcessRelogin()) {
                    track("login_pop_relogin_processing", null);
                    callbackNotShow(wVCallBackContext);
                } else {
                    track("login_pop_not_login_once", null);
                    final NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
                    final boolean iSupportAlipay = iSupportAlipay();
                    final JSONObject jSONObject = new JSONObject();
                    Boolean bool = homepageFirstResumed;
                    final boolean z = bool != null && bool.booleanValue();
                    final HashMap hashMap = new HashMap();
                    hashMap.put("onceLogined", String.valueOf(true ^ TextUtils.isEmpty(com.taobao.login4android.Login.getOldUserId())));
                    hashMap.put("alipayInstalled", String.valueOf(iSupportAlipay));
                    tryToGetLoginMaskPhone(new DataCallback<Map<String, String>>() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public void result(Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f55258e1", new Object[]{this, map});
                            } else if (CollectionUtils.isEmpty(map)) {
                                if (!iSupportAlipay) {
                                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_can_show_default", hashMap);
                                    PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                } else if (z) {
                                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_first_time", hashMap);
                                    if (numberAuthService.isSupport4G()) {
                                        PopJSBridge.access$100(PopJSBridge.this, "login_pop_support4g", hashMap);
                                        if (LoginSwitch.getSwitch("login_pop_skip_alipay_first_time", "true")) {
                                            PopJSBridge.access$100(PopJSBridge.this, "login_pop_skip_this_time", hashMap);
                                            UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_pop_skip_alipay_first_time", null);
                                            wVCallBackContext.error();
                                            return;
                                        }
                                        PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                    } else {
                                        PopJSBridge.access$100(PopJSBridge.this, "login_pop_not_support4g", hashMap);
                                        PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                    }
                                } else {
                                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_not_first_time", hashMap);
                                    PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                }
                                PopJSBridge.access$100(PopJSBridge.this, "login_pop_can_show_pop", hashMap);
                            } else {
                                jSONObject.put("maskMobile", (Object) map.get("number"));
                                jSONObject.put("maskMobileProtocolName", (Object) map.get("protocolName"));
                                jSONObject.put("maskMobileProtocolUrl", (Object) map.get("protocolURL"));
                                PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                PopJSBridge.access$100(PopJSBridge.this, "login_pop_get_mask_phone_success", hashMap);
                            }
                        }
                    }, "loginPop");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private boolean isProcessRelogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae17e37c", new Object[]{this})).booleanValue();
        }
        return ReloginDelegate.isProcessing && LoginSwitch.getSwitch("login_pop_check_relogin_status_enabled2", "true");
    }

    private void trackFailure(String str, String str2, String str3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f919c24", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str2);
        hashMap.put("msg", str3);
        Boolean bool = homepageFirstResumed;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        }
        hashMap.put("isFirstTime", String.valueOf(z));
        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, hashMap);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("execute() called with: action = [");
        sb.append(str);
        sb.append("], jsonParams = [");
        sb.append(str2);
        sb.append("], context = [");
        sb.append(getContext());
        sb.append("]");
        try {
            jSONObject = JSON.parseObject(str2);
        } catch (Exception e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if ("getLoginBarData".equals(str)) {
            getBarData(jSONObject, wVCallBackContext);
            return true;
        } else if ("getLoginPopData".equals(str)) {
            try {
                handleGetPopData(str2, wVCallBackContext);
            } catch (Exception e2) {
                e2.printStackTrace();
                wVCallBackContext.error();
            }
            return true;
        } else if (LoginType.LocalLoginType.SIM_LOGIN.equals(str)) {
            handleSimLogin(jSONObject, wVCallBackContext);
            return true;
        } else if (LoginType.LocalLoginType.LOGIN_TYPE_ALIPAY.equals(str)) {
            handleAlipayLogin(jSONObject, wVCallBackContext);
            return true;
        } else if (!"sdkLogin".equals(str)) {
            return false;
        } else {
            try {
                str3 = jSONObject.getString("loginPage");
            } catch (Exception e3) {
                e3.printStackTrace();
                str3 = "";
            }
            registerBroadcast(wVCallBackContext, 0, null);
            LoginStatus.source = this.source;
            Bundle bundle = new Bundle();
            bundle.putString("source", this.source);
            if (TextUtils.equals(str3, "recommendloginpage")) {
                bundle.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                bundle.putBoolean(LoginConstant.FORCE_NORMAL_MODE, true);
                bundle.putString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE, UIBaseConstants.LoginPage.PAGE_RECOMMEND_LOGIN);
                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(getContext(), ApiReferer.generateApiReferer(), bundle);
            } else {
                com.taobao.login4android.Login.login(true, bundle);
            }
            LoginBarController.showLoginBar();
            track("login_pop_sdkLogin_call", null);
            return true;
        }
    }

    private void requestPopInfo(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260288f6", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        try {
            track("login_pop_request_mtop_commit", null);
            LoginParam loginParam = new LoginParam();
            loginParam.alipayInstalled = iSupportAlipay();
            loginParam.scene = "loginPop";
            List<HistoryAccount> historyAccounts = SecurityGuardManagerWraper.getHistoryAccounts();
            if (!CollectionUtils.isEmpty(historyAccounts)) {
                this.historyAccount = historyAccounts.get(0);
            }
            AppLaunchInfoResponseData fireAppLaunchRequest = AppLaunchDataPresenter.fireAppLaunchRequest(loginParam, this.historyAccount);
            T t = fireAppLaunchRequest.returnValue;
            LoginStatus.loginTrackInfo = ((AppLaunchInfo) t).loginTrackInfo;
            AppLaunchInfo appLaunchInfo = (AppLaunchInfo) t;
            this.appLaunchInfo = appLaunchInfo;
            fireAppLaunchRequest.calTime = appLaunchInfo.expireTime + (System.currentTimeMillis() / 1000);
            fireAppLaunchRequest.appVersion = AppInfo.getInstance().getAppVersion();
            AppLaunchInfo appLaunchInfo2 = this.appLaunchInfo;
            this.loginPopInfo = appLaunchInfo2.popInfo;
            jSONObject.put("showPop", (Object) Boolean.valueOf(appLaunchInfo2.showPop));
            HistoryAccount historyAccount = this.historyAccount;
            if (historyAccount != null) {
                jSONObject.put("userHeadImageUrl", (Object) historyAccount.headImg);
                jSONObject.put("userNick", (Object) StringUtil.dataMasking(this.historyAccount.userInputName));
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("showPop", String.valueOf(this.appLaunchInfo.showPop));
            hashMap.put("popLoginType", String.valueOf(this.appLaunchInfo.popLoginType));
            LoginPopInfo loginPopInfo = this.loginPopInfo;
            if (loginPopInfo != null) {
                hashMap.put("benefitBrandText", loginPopInfo.benefitBrandText);
                hashMap.put("benefitLandingUrl", this.loginPopInfo.benefitLandingUrl);
                hashMap.put("benefitType", this.loginPopInfo.benefitType);
                hashMap.put("benefitNumberText", this.loginPopInfo.benefitNumberText);
                hashMap.put("benefitShowNumber", String.valueOf(this.loginPopInfo.benefitShowNumber));
            }
            track("login_pop_request_mtop_success", hashMap);
            AppLaunchInfo appLaunchInfo3 = this.appLaunchInfo;
            if (appLaunchInfo3.showPop) {
                jSONObject.put("popLoginType", (Object) appLaunchInfo3.popLoginType);
                if (this.loginPopInfo != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("benefitBrandText", (Object) this.loginPopInfo.benefitBrandText);
                    jSONObject2.put("benefitLandingUrl", (Object) this.loginPopInfo.benefitLandingUrl);
                    jSONObject2.put("benefitType", (Object) this.loginPopInfo.benefitType);
                    jSONObject2.put("benefitNumberText", (Object) this.loginPopInfo.benefitNumberText);
                    jSONObject2.put("benefitShowNumber", (Object) Boolean.valueOf(this.loginPopInfo.benefitShowNumber));
                    jSONObject2.put("content", (Object) this.loginPopInfo.content);
                    jSONObject.put("popInfo", (Object) jSONObject2);
                    if ("channel".equals(this.loginPopInfo.benefitType)) {
                        this.source = this.appLaunchInfo.popLoginType + "_" + this.loginPopInfo.benefitType + "_" + this.loginPopInfo.benefitShowNumber;
                    } else {
                        this.source = this.appLaunchInfo.popLoginType + "_" + this.loginPopInfo.benefitType;
                    }
                } else {
                    this.source = this.appLaunchInfo.popLoginType;
                }
                if (!com.taobao.login4android.Login.canAutoLogin() && !com.taobao.login4android.Login.checkSessionValid()) {
                    if (isProcessRelogin()) {
                        track("login_pop_relogin_processing", null);
                        callbackNotShow(wVCallBackContext);
                        return;
                    } else if (LoginStatus.isLogining()) {
                        track("login_pop_exist_login", null);
                        callbackNotShow(wVCallBackContext);
                        return;
                    } else {
                        LoginBarController.hideLoginBar();
                        if (LoginSwitch.getSwitch("login_pop_show_login_bar_after_pop", "true")) {
                            MainThreadExecutor.postDelayed(new Runnable() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        LoginBarController.showLoginBar();
                                    }
                                }
                            }, 5000L);
                        }
                        LoginTLogAdapter.e(TAG, "requestPopInfo: 返回给 pop 的数据：" + jSONObject.toJSONString());
                        wVCallBackContext.success(jSONObject.toJSONString());
                        return;
                    }
                }
                hasLoginCalback(wVCallBackContext);
                return;
            }
            markNotShow = true;
            callbackNotShow(wVCallBackContext);
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "login_pop_request_mtop_error", e);
            wVCallBackContext.error();
            LoginBarController.hideLoginBar();
            trackFailure("login_pop_request_mtop_error", "-133", e.getMessage());
        }
    }
}
