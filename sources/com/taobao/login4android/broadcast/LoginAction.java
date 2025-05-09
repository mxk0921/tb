package com.taobao.login4android.broadcast;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum LoginAction {
    NOTIFY_LOGIN_SUCCESS,
    NOTIFY_LOGIN_FAILED,
    NOTIFY_LOGIN_CANCEL,
    NOTIFY_USER_LOGIN,
    NOTIFY_LOGOUT,
    NOTIFY_REGISTER_SUCCESS,
    NOTIFY_REGISTER_CANCEL,
    NOTIFY_ACCOUNT_MERGERED_SUCCESS,
    NOTIFY_LOGINBYKEY_SUCCESS,
    NOTIFY_LOGINBYKEY_FAILED,
    NOTIFY_LOGINBYSECURITY,
    SHARE_SSOTOKEN,
    SSO_LOGIN_ACTION,
    SSO_LOGOUT_ACTION,
    NAV_GETURL_SUCCESS,
    WEB_ACTIVITY_CANCEL,
    WEB_ACTIVITY_SKIP,
    NOTIFY_CHANGE_MOBILE_SUCCESS,
    NOTIFY_BIND_MOBILE_SUCCESS,
    NOTIFY_FOUND_PASSWORD_SUCCESS,
    NOTIFY_CHANGE_PASSWORD_SUCCESS,
    NOTIFY_H5_CANCEL_SITE_ACCOUNT_SUCCESS,
    BIND_ALIPAY_SUCCESS,
    BIND_ALIPAY_FAILED,
    NOTIFY_ALIPAY_SSO_FAIL,
    NOTIFY_ALIPAY_SSO_CANCEL,
    NOTIFY_CLOSE_ALIPAY_RESULT,
    NOTIFY_REFRESH_COOKIES,
    NOTIFY_RESET_STATUS,
    NOTIFY_IV_SUCCESS,
    NOTIFY_IV_FAIL,
    NOTIFY_IV_SKIP,
    NOTIFY_SNS_UNBIND,
    NOTIFY_UCC_LOGIN_SUCCESS,
    NOTIFY_UCC_LOGIN_FAILED,
    NOTIFY_UCC_LOGIN_CANCEL,
    NOTIFY_H5_CANCEL_ACCOUNT_SUCCESS,
    NOTIFY_CLOSE_SCAN_ACTIVITY,
    NOTIFY_UCC_LOGOUT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LoginAction loginAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/broadcast/LoginAction");
    }

    public static LoginAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginAction) ipChange.ipc$dispatch("77d01539", new Object[]{str});
        }
        return (LoginAction) Enum.valueOf(LoginAction.class, str);
    }
}
