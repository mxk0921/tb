package com.taobao.login4android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.model.CommonCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.logout.LogoutParam;
import com.taobao.login4android.jsbridge.SDKJSBridgeService;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.LoginController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginTestBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "LoginTest";

    public static /* synthetic */ String access$000(LoginTestBroadcastReceiver loginTestBroadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6051a9b1", new Object[]{loginTestBroadcastReceiver});
        }
        return loginTestBroadcastReceiver.TAG;
    }

    public static /* synthetic */ Object ipc$super(LoginTestBroadcastReceiver loginTestBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/receiver/LoginTestBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if ("com.ali.user.sdk.login.TEST_ACCOUNT_SSO".equals(action)) {
                    String stringExtra = intent.getStringExtra("token");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("action", (Object) "testAccountSso");
                        jSONObject.put("token", (Object) stringExtra);
                        new SDKJSBridgeService().testSsoLogin(null, jSONObject.toString());
                    }
                } else if ("com.ali.user.sdk.login.PWD".equals(action)) {
                    String stringExtra2 = intent.getStringExtra("id");
                    String stringExtra3 = intent.getStringExtra("pwd");
                    if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3)) {
                        Login.pwdLogin(stringExtra2, stringExtra3, new CommonCallback() { // from class: com.taobao.login4android.receiver.LoginTestBroadcastReceiver.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.model.CommonCallback
                            public void onFail(int i, String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                                    return;
                                }
                                String access$000 = LoginTestBroadcastReceiver.access$000(LoginTestBroadcastReceiver.this);
                                LoginTLogAdapter.e(access$000, "pwdLogin failed , code = " + i + ",msg = " + str);
                            }

                            @Override // com.ali.user.mobile.model.CommonCallback
                            public void onSuccess() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                                } else {
                                    LoginTLogAdapter.e(LoginTestBroadcastReceiver.access$000(LoginTestBroadcastReceiver.this), "pwdLogin success");
                                }
                            }
                        });
                        return;
                    }
                    LoginTLogAdapter.e(this.TAG, "pwd invalid param");
                } else if ("com.ali.user.sdk.login.LOGOUT".equals(action)) {
                    LogoutParam logoutParam = new LogoutParam();
                    logoutParam.pre = false;
                    logoutParam.site = Login.getLoginSite();
                    logoutParam.sid = Login.getSid();
                    logoutParam.autologinToken = Login.getLoginToken();
                    logoutParam.userid = Login.getUserId();
                    LoginController.getInstance().logout(logoutParam, null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
