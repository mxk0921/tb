package com.ali.user.mobile.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.eventbus.EventBus;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.AppLaunchDataPresenter;
import com.ali.user.mobile.login.presenter.NeedLoginPresenter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.LoginHistory;
import com.ali.user.mobile.rpc.safe.AES;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.verify.VerifyApi;
import com.ali.user.mobile.webview.LoginAgreementHelper;
import com.ali.user.mobile.webview.LoginH5Handler;
import com.ali.user.mobile.webview.LoginPostHandler;
import com.ali.user.mobile.webview.TransparentWebViewActivity;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginSceneConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.scan.QrScanActivity;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobaocompat.lifecycle.AppForgroundObserver;
import java.util.HashMap;
import java.util.Properties;
import tb.hsq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NavigatorServiceImpl implements NavigatorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Login.NavigatorServiceImpl";

    static {
        t2o.a(70254810);
        t2o.a(68157608);
    }

    public static /* synthetic */ boolean access$000(NavigatorServiceImpl navigatorServiceImpl, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4baee41d", new Object[]{navigatorServiceImpl, context, str})).booleanValue();
        }
        return navigatorServiceImpl.isProcessSupportLogin(context, str);
    }

    public static /* synthetic */ void access$100(NavigatorServiceImpl navigatorServiceImpl, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bf9e64c", new Object[]{navigatorServiceImpl, str, str2});
        } else {
            navigatorServiceImpl.notifyFailed(str, str2);
        }
    }

    public static /* synthetic */ void access$200(NavigatorServiceImpl navigatorServiceImpl, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08fc335", new Object[]{navigatorServiceImpl, str, str2, str3});
        } else {
            navigatorServiceImpl.hitBlackList(str, str2, str3);
        }
    }

    private void hitBlackList(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e03618f", new Object[]{this, str, str2, str3});
            return;
        }
        UserTrackAdapter.sendUT(str2, str);
        notifyFailed(str3, str2);
    }

    private void notifyFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ea101", new Object[]{this, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", str);
        intent.putExtra("message", str2);
        intent.setAction(LoginAction.NOTIFY_LOGIN_FAILED.name());
        BroadCastHelper.doSendBroadcast(intent);
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void fingerIV(final Context context, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ad9dbc", new Object[]{this, context, commonCallback});
        } else if (commonCallback != null) {
            try {
                UserTrackAdapter.sendUT("fingerIV");
                new AES().checkValid(new CommonCallback() { // from class: com.ali.user.mobile.navigation.NavigatorServiceImpl.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onFail(int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                            return;
                        }
                        UserTrackAdapter.sendExtendUT("fingerIV_checkFail", String.valueOf(i));
                        commonCallback.onFail(1602, ResourceUtil.getStringById("aliuser_finger_iv_failed"));
                        VerifyApi.invalidAll();
                    }

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            return;
                        }
                        UserTrackAdapter.sendUT("fingerIV_checkSuccess");
                        NavigatorManager.getInstance().navToFinger(context, 3, commonCallback);
                    }
                });
            } catch (Throwable unused) {
                commonCallback.onFail(1602, ResourceUtil.getStringById("aliuser_finger_iv_failed"));
            }
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void fingerLogin(final Context context, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec148b52", new Object[]{this, context, commonCallback});
            return;
        }
        try {
            UserTrackAdapter.sendUT("fingerLogin");
            new AES().checkValid(new CommonCallback() { // from class: com.ali.user.mobile.navigation.NavigatorServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    UserTrackAdapter.sendExtendUT("fingerLogin_checkFail", String.valueOf(i));
                    commonCallback.onFail(1602, ResourceUtil.getStringById("aliuser_finger_login_failed"));
                    VerifyApi.invalidAll();
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    UserTrackAdapter.sendUT("fingerLogin_checkSuccess");
                    NavigatorManager.getInstance().navToFingerLogin(context, commonCallback);
                }
            });
        } catch (Throwable th) {
            UserTrackAdapter.sendExtendUT("fingerLogin_checkFail", th.getMessage());
            th.printStackTrace();
            commonCallback.onFail(1602, ResourceUtil.getStringById("aliuser_finger_login_failed"));
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void fingerSet(Context context, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268e1a79", new Object[]{this, context, commonCallback});
        } else {
            NavigatorManager.getInstance().navToFingerSet(context, commonCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void navToAgreement(Context context, LoginFilterCallback loginFilterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b161e1ad", new Object[]{this, context, loginFilterCallback});
        } else {
            LoginAgreementHelper.openAgreement(context, loginFilterCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void navToLoginPostPage(Context context, String str, boolean z, LoginFilterCallback loginFilterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917264bb", new Object[]{this, context, str, new Boolean(z), loginFilterCallback});
        } else {
            LoginPostHandler.openPostPage(context, str, z, loginFilterCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void navToLoginUrlPage(Context context, UrlParam urlParam, boolean z, LoginFilterCallback loginFilterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494aeadb", new Object[]{this, context, urlParam, new Boolean(z), loginFilterCallback});
        } else {
            LoginH5Handler.openUrl(context, urlParam, z, loginFilterCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void navToWebViewPage(String str, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f59e1de", new Object[]{this, str, urlParam});
        } else if (DataProviderFactory.getApplicationContext() != null) {
            Intent intent = new Intent(DataProviderFactory.getApplicationContext(), WebViewActivity.class);
            addData(urlParam, intent);
            intent.putExtra("eventName", str);
            intent.addFlags(268435456);
            DataProviderFactory.getApplicationContext().startActivity(intent);
        } else {
            EventBus.getDefault().sendEvent(str);
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void openRegisterPage(Context context, RegistParam registParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e173cd3", new Object[]{this, context, registParam});
        } else {
            NavigatorManager.getInstance().navToRegisterPage(context, registParam);
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void openScanActivity(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e49dd5", new Object[]{this, context, str});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent(context, QrScanActivity.class);
                intent.addFlags(268435456);
                intent.putExtra(LoginConstant.SCAN_KEY, str);
                context.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void openWebViewPage(Context context, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d831ea6", new Object[]{this, context, urlParam});
            return;
        }
        Intent intent = new Intent(context, WebViewActivity.class);
        if (urlParam.isTransparent) {
            intent = new Intent(context, TransparentWebViewActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        int i = urlParam.flags;
        if (i > 0) {
            intent.addFlags(i);
        }
        addData(urlParam, intent);
        context.startActivity(intent);
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void startWebViewForResult(Activity activity, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b9e6b", new Object[]{this, activity, urlParam});
            return;
        }
        Intent intent = new Intent(activity, WebViewActivity.class);
        addData(urlParam, intent);
        activity.startActivityForResult(intent, urlParam.requestCode);
    }

    public static void addData(UrlParam urlParam, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02fe92", new Object[]{urlParam, intent});
            return;
        }
        intent.putExtra(WebConstant.WEBURL, urlParam.url);
        intent.putExtra("requestCode", urlParam.requestCode);
        if (LoginSceneConstants.SCENE_CHANGEPASSWORD.equals(urlParam.scene) || LoginSceneConstants.SCENE_FOUNDPASSWORD.equals(urlParam.scene)) {
            intent.putExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE, TokenType.FIND_PWD);
        } else {
            intent.putExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE, urlParam.tokenType);
        }
        if (!TextUtils.isEmpty(urlParam.ivScene)) {
            intent.putExtra(WebConstant.WEB_IV_SCENE, urlParam.ivScene);
        }
        if (!TextUtils.isEmpty(urlParam.scene)) {
            intent.putExtra("scene", urlParam.scene);
        }
        if (!TextUtils.isEmpty(urlParam.token)) {
            intent.putExtra("token", urlParam.token);
        }
        if (!TextUtils.isEmpty(urlParam.userid)) {
            intent.putExtra("USERID", urlParam.userid);
        }
        LoginBaseParam loginBaseParam = urlParam.loginParam;
        if (loginBaseParam != null) {
            intent.putExtra("loginParam", loginBaseParam);
            intent.putExtra(WebConstant.WEB_NATIVE_LOGIN_TYPE, urlParam.loginParam.nativeLoginType);
            intent.putExtra(WebConstant.WEB_SNS_TRUST_LOGIN_TOKEN, urlParam.loginParam.snsTrustLoginToken);
            intent.putExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE, urlParam.loginParam.tokenType);
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(urlParam.loginParam));
            intent.putExtra(WebConstant.WEB_CANCEL_BROADCAST, urlParam.loginParam.sendLoginFailWhenWebviewCancel);
            if (LoginSceneConstants.SCENE_CHANGEPASSWORD.equals(urlParam.scene) || LoginSceneConstants.SCENE_FOUNDPASSWORD.equals(urlParam.scene)) {
                intent.putExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE, TokenType.FIND_PWD);
            } else {
                intent.putExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE, urlParam.loginParam.tokenType);
            }
            intent.putExtra("site", urlParam.loginParam.site);
        }
        if (urlParam.ext != null) {
            intent.putExtra("ext", new JSONObject(urlParam.ext).toJSONString());
        }
        if (!TextUtils.isEmpty(urlParam.loginId)) {
            intent.putExtra(WebConstant.WEB_LOGIN_ID, urlParam.loginId);
        } else {
            LoginBaseParam loginBaseParam2 = urlParam.loginParam;
            if (loginBaseParam2 != null && !TextUtils.isEmpty(loginBaseParam2.loginId)) {
                intent.putExtra(WebConstant.WEB_LOGIN_ID, urlParam.loginParam.loginId);
            }
        }
        if (urlParam.needTitle) {
            intent.putExtra(WebConstant.WEB_ALLOW_TITLE, true);
        }
        intent.putExtra(WebConstant.WEB_CLOSE_IF_LOAD_FAILED, urlParam.closeIfLoadFailed);
    }

    @Override // com.ali.user.mobile.service.NavigatorService
    public void openLoginPage(final Context context, final String str, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745fb937", new Object[]{this, context, str, bundle});
            return;
        }
        try {
            CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, LoginHistory>() { // from class: com.ali.user.mobile.navigation.NavigatorServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/ali/user/mobile/navigation/NavigatorServiceImpl$1");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public LoginHistory doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (LoginHistory) ipChange2.ipc$dispatch("1b7d89dc", new Object[]{this, objArr});
                    }
                    try {
                        LoginTLogAdapter.e(NavigatorServiceImpl.TAG, "login progress:get login history");
                        return SecurityGuardManagerWraper.getLoginHistory();
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                public void onPostExecute(LoginHistory loginHistory) {
                    LoginTLogAdapter.e(NavigatorServiceImpl.TAG, "login progress:onPostExecute");
                    boolean z = false;
                    try {
                        IpChange ipChange2 = AppForgroundObserver.$ipChange;
                        if (!AppForgroundObserver.class.getField("isForeground").getBoolean(AppForgroundObserver.class)) {
                            Bundle bundle2 = bundle;
                            boolean access$000 = bundle2 != null ? NavigatorServiceImpl.access$000(NavigatorServiceImpl.this, context, bundle2.getString("process_name")) : false;
                            if (DataProviderFactory.getDataProvider().isForbidLoginFromBackground() && !access$000) {
                                NavigatorServiceImpl.access$100(NavigatorServiceImpl.this, "711", "forbidLoginFromBackground");
                                return;
                            }
                        }
                        Bundle bundle3 = bundle;
                        if (bundle3 != null && (TextUtils.equals(bundle3.getString(LoginType.LocalLoginType.SMS_LOGIN), "true") || bundle.getBoolean(LoginConstant.LAUCNH_MOBILE_LOGIN_FRAGMENT_LABEL, false))) {
                            bundle.putString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE, UIBaseConstants.LoginPage.PAGE_SMS_LOGIN);
                        }
                        Bundle bundle4 = bundle;
                        boolean z2 = bundle4 != null && bundle4.getBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, false);
                        Bundle bundle5 = bundle;
                        if (bundle5 != null && bundle5.getBoolean(LoginConstant.LAUCNH_USER_LOGIN_FRAGMENT_LABEL, false)) {
                            bundle.putString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE, UIBaseConstants.LoginPage.PAGE_PWD_LOGIN);
                        }
                        Bundle bundle6 = bundle;
                        LoginParam loginParam = null;
                        String string = bundle6 != null ? bundle6.getString(LoginConstant.LOGINPARAM) : null;
                        if (!TextUtils.isEmpty(string)) {
                            loginParam = (LoginParam) JSON.parseObject(string, LoginParam.class);
                        }
                        if (loginParam == null) {
                            loginParam = new LoginParam();
                        }
                        Bundle bundle7 = bundle;
                        String str2 = "";
                        if (bundle7 != null && bundle7.containsKey("source")) {
                            loginParam.source = bundle.getString("source");
                        } else if (loginParam.source == null) {
                            loginParam.source = str2;
                        }
                        LoginStatus.source = loginParam.source;
                        Bundle bundle8 = bundle;
                        LoginContext.loginUIType = bundle8 != null ? bundle8.getString("loginUIType") : str2;
                        if (!TextUtils.isEmpty(str)) {
                            HashMap hashMap = new HashMap();
                            loginParam.ext = hashMap;
                            hashMap.put(LoginConstants.MTOP_API_REFERENCE, str);
                        }
                        if (CommonUtil.isInABTestRegion("hitBalckList", 10000)) {
                            long currentTimeMillis = System.currentTimeMillis() - LoginStatus.launchTimestamp;
                            String deviceLevel = AppLaunchDataPresenter.getDeviceLevel();
                            String sourceOrApi = CommonUtil.getSourceOrApi();
                            if (CommonUtil.notShowUI(sourceOrApi)) {
                                NavigatorServiceImpl.access$200(NavigatorServiceImpl.this, sourceOrApi, "notShowUILogin", "712");
                                return;
                            }
                            int i = LoginSwitch.getSwitch("showui_time_" + deviceLevel, 10);
                            LoginTLogAdapter.e(NavigatorServiceImpl.TAG, "openTime = " + currentTimeMillis + ",apiOrSource " + sourceOrApi);
                            if (CommonUtil.hasClipboardText()) {
                                if (i > 0 && currentTimeMillis > 0 && currentTimeMillis < i * 1000) {
                                    z = true;
                                }
                                boolean notShowUIByTime = CommonUtil.notShowUIByTime(sourceOrApi);
                                boolean z3 = LoginStatus.WAIT_TB_PASSWORD_NOTIFY;
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("hitTime", String.valueOf(z));
                                hashMap2.put("hitBlackList", String.valueOf(notShowUIByTime));
                                hashMap2.put("waitNotify", String.valueOf(z3));
                                UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "check_login_time_blocker", hashMap2);
                                if (notShowUIByTime && z && LoginStatus.WAIT_TB_PASSWORD_NOTIFY) {
                                    NavigatorServiceImpl.access$200(NavigatorServiceImpl.this, sourceOrApi, "notShowUILoginTime", "713");
                                    return;
                                }
                            }
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - LoginStatus.lastCloseTimeStamp;
                        Log.e(RPCDataItems.SWITCH_TAG_LOG, "freq delta = " + currentTimeMillis2);
                        if (LoginStatus.lastCloseTimeStamp > 0 && currentTimeMillis2 < LoginSwitch.getSwitch("openFrequentDelta", 2000)) {
                            Properties properties = new Properties();
                            properties.setProperty("loginInterval", String.valueOf(currentTimeMillis2));
                            properties.setProperty("cycleTimes", String.valueOf(LoginStatus.openFrequentCount));
                            UserTrackAdapter.sendUT("login_Interval", properties);
                            LoginStatus.openFrequentCount++;
                        }
                        Bundle bundle9 = bundle;
                        if (bundle9 != null) {
                            if (!hsq.e(bundle9.getString("source"))) {
                                str2 = bundle.getString("source");
                            }
                            try {
                                NeedLoginPresenter.updateShowUIRecord(str2);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        NavigatorManager.getInstance().navToLoginPage(context, bundle, JSON.toJSONString(loginParam), z2);
                    }
                }
            }, new Object[0]);
        } catch (Throwable th) {
            notifyFailed("710", TLogTracker.SCENE_EXCEPTION);
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "openLoginPageFailed: message" + th.getMessage());
        }
    }

    private boolean isProcessSupportLogin(Context context, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36727f70", new Object[]{this, context, str})).booleanValue();
        }
        try {
            String config = LoginSwitch.getConfig("process_whitelist", "com.taobao.taobao;com.taobao.taobao:wml");
            if (!TextUtils.isEmpty(config) && (split = config.split(";")) != null && split.length > 0) {
                for (String str2 : split) {
                    if (TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "getProcessWhiteListFailed,message=" + th.getMessage());
        }
        return false;
    }
}
