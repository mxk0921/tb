package com.ali.user.mobile.base.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginFrom;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.action.OtherActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.utils.CommonUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginSceneConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.BackgroundExecutor;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliuserActionReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.AliuserActionReceiver";

    static {
        t2o.a(69206063);
    }

    private void cleanGlobalResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f75f01", new Object[]{this});
        } else {
            LoginFrom.setCurrentLoginFrom("");
        }
    }

    private void clearLoginConstants() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f47829a", new Object[]{this});
            return;
        }
        LoginStatus.browserRefUrl = "";
        LoginStatus.source = "";
        LoginStatus.jsbridgeRefUrl = "";
        LoginStatus.mtopApiReferer = "";
        LoginStatus.dumpTrace = "";
        LoginStatus.sdkSessionTraceID = "";
    }

    public static /* synthetic */ Object ipc$super(AliuserActionReceiver aliuserActionReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/base/helper/AliuserActionReceiver");
    }

    public void sendBroadcast(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920b6c1c", new Object[]{this, loginAction});
        } else {
            BroadCastHelper.sendBroadcast(loginAction, false, "");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            cleanGlobalResource();
            String action = intent.getAction();
            final SessionManager instance = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            if (action.equals(LoginResActions.LOGIN_SUCCESS_ACTION)) {
                boolean booleanExtra = intent.getBooleanExtra("from_register", false);
                String stringExtra = intent.getStringExtra("message");
                if (booleanExtra) {
                    UTAnalytics.getInstance().userRegister(instance.getNick());
                }
                HashMap hashMap = new HashMap();
                if (intent.hasExtra("nick")) {
                    hashMap.put("nick", intent.getStringExtra("nick"));
                    hashMap.put("uid", intent.getStringExtra("uid"));
                }
                if (intent.hasExtra(LoginConstants.LOGIN_TYPE)) {
                    hashMap.put(LoginConstants.LOGIN_TYPE, intent.getStringExtra(LoginConstants.LOGIN_TYPE));
                }
                if (intent.hasExtra(LoginConstants.LOGIN_FROM)) {
                    hashMap.put(LoginConstants.LOGIN_FROM, intent.getStringExtra(LoginConstants.LOGIN_FROM));
                }
                if (intent.hasExtra(LoginConstants.LOGIN_ACCOUNT)) {
                    hashMap.put(LoginConstants.LOGIN_ACCOUNT, intent.getStringExtra(LoginConstants.LOGIN_ACCOUNT));
                }
                LoginStatus.resetLoginFlag();
                if (!TextUtils.equals(LoginType.ServerLoginType.AutoLogin.getType(), intent.getStringExtra(LoginConstants.LOGIN_TYPE))) {
                    hashMap.put(LoginConstants.LOGIN_EXT_DATA, "true");
                }
                LoginContext.uninstallResponse = null;
                LoginContext.uninstallType = 0;
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_SUCCESS, false, 0, stringExtra, (Map<String, String>) hashMap, "");
                UserTrackAdapter.sendUT("SEND_SUCCESS_BROADCAST");
                clearLoginConstants();
            } else if (action.equals(LoginResActions.LOGIN_FAIL_ACTION)) {
                clearLoginConstants();
                LoginStatus.resetLoginFlag();
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, intent.getIntExtra("errorCode", 0), intent.getStringExtra("message"), "");
            } else if (action.equals(LoginResActions.LOGIN_CANCEL_ACTION)) {
                if (LoginStatus.isFromChangeAccount() && CommonUtil.isInABTestRegion("clearCookieWhenChangeAccount", 10000)) {
                    BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.base.helper.AliuserActionReceiver.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                instance.recoverCookie();
                            }
                        }
                    });
                }
                LoginStatus.resetLoginFlag();
                sendBroadcast(LoginAction.NOTIFY_LOGIN_CANCEL);
                clearLoginConstants();
            } else if (action.equals(LoginResActions.LOGIN_OPEN_ACTION)) {
                LoginTLogAdapter.e(TAG, "clear sessionInfo in AliUserActionReceiver");
                BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.base.helper.AliuserActionReceiver.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!LoginStatus.isFromChangeAccount()) {
                            instance.clearAutoLoginInfo();
                            instance.clearSessionInfo();
                        } else if (CommonUtil.isInABTestRegion("clearCookieWhenChangeAccount", 10000)) {
                            instance.clearCookieManager();
                        }
                    }
                });
                sendBroadcast(LoginAction.NOTIFY_USER_LOGIN);
            } else if (action.equals(LoginConstant.RESET_LOGIN_STATUS)) {
                LoginStatus.resetLoginFlag();
                sendBroadcast(LoginAction.NOTIFY_RESET_STATUS);
            } else if (action.equals(LoginResActions.LOGIN_NETWORK_ERROR)) {
                LoginStatus.resetLoginFlag();
                sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED);
                clearLoginConstants();
            } else if (action.equals(LoginResActions.WEB_ACTIVITY_CANCEL)) {
                if (!intent.getBooleanExtra(LoginConstants.H5_SEND_CANCEL_BROADCAST, false) || LoginStatus.isFromChangeAccount()) {
                    sendBroadcast(LoginAction.WEB_ACTIVITY_CANCEL);
                } else {
                    sendBroadcast(LoginAction.NOTIFY_LOGIN_CANCEL);
                }
            } else if (action.equals(LoginResActions.WEB_ACTIVITY_RESULT)) {
                if ("true".equals(intent.getStringExtra("isSuc"))) {
                    String stringExtra2 = intent.getStringExtra("bizType");
                    if ("changePhoneNum".equals(stringExtra2)) {
                        sendBroadcast(LoginAction.NOTIFY_CHANGE_MOBILE_SUCCESS);
                    } else if ("bindPhoneNum".equals(stringExtra2)) {
                        sendBroadcast(LoginAction.NOTIFY_BIND_MOBILE_SUCCESS);
                    } else if (LoginSceneConstants.SCENE_CHANGEPASSWORD.equals(stringExtra2)) {
                        sendBroadcast(LoginAction.NOTIFY_CHANGE_PASSWORD_SUCCESS);
                    } else if (LoginSceneConstants.SCENE_CANCEL_SITE_ACCOUNT.equals(stringExtra2)) {
                        sendBroadcast(LoginAction.NOTIFY_H5_CANCEL_SITE_ACCOUNT_SUCCESS);
                    } else if (LoginSceneConstants.SCENE_CANCEL_ACCOUNT.equals(stringExtra2)) {
                        sendBroadcast(LoginAction.NOTIFY_H5_CANCEL_ACCOUNT_SUCCESS);
                    } else if (!TextUtils.isEmpty(stringExtra2)) {
                        sendBroadcast(stringExtra2);
                    }
                }
            } else if (action.equals(LoginResActions.REG_CANCEL)) {
                sendBroadcast(LoginAction.NOTIFY_REGISTER_CANCEL);
            } else if (action.equals(LoginResActions.LOGIN_CLOSE_ACTION)) {
                LoginStatus.resetLoginFlag();
                sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED);
            } else if (action.equals(OtherActions.TBPWD_NOT_OPEN)) {
                LoginStatus.WAIT_TB_PASSWORD_NOTIFY = false;
            } else if (action.equals(OtherActions.TBPWD_OPEN)) {
                LoginStatus.WAIT_TB_PASSWORD_NOTIFY = false;
            }
        }
    }

    public void sendBroadcast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3ce3ea", new Object[]{this, str});
        } else {
            BroadCastHelper.sendBroadcast(str, false, 0, "", (Map<String, String>) null, "");
        }
    }
}
