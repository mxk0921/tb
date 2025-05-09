package com.taobao.login4android.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginConstants {
    public static final String BROWSER_REF_URL = "browserRefUrl";
    public static final String EVENT_SESSION_INVALID = "SESSION_INVALID";
    public static final String H5_SEND_CANCEL_BROADCAST = "sendCancelBroadcast";
    public static final String JSBRIDGE_REF_URL = "jsbrigeRefUrl";
    public static final String LOGIN_ACCOUNT = "login_account";
    public static final String LOGIN_EXT_DATA = "loginExtData";
    public static final String LOGIN_FAIL_BY_APPKEY = "loginFailNullAppkey";
    public static final String LOGIN_FAIL_REASON = "loginFailReason";
    public static final String LOGIN_FROM = "loginFrom";
    public static final String LOGIN_FROM_MULTI_ACCOUNT = "multiAccount";
    public static final String LOGIN_SOURCE = "source";
    public static final String LOGIN_TYPE = "loginType";
    public static final String LOGOUT_TYPE = "logoutType";
    public static final String MTOP_API_REFERENCE = "apiReferer";
    public static final String SHOW_TOAST = "showToast";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum LogoutType {
        NORMAL_LOGOUT("logout"),
        CHANGE_ACCOUNT("changeAccount");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String type;

        LogoutType(String str) {
            this.type = str;
        }

        public static /* synthetic */ Object ipc$super(LogoutType logoutType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/constants/LoginConstants$LogoutType");
        }

        public static LogoutType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogoutType) ipChange.ipc$dispatch("35f69508", new Object[]{str});
            }
            return (LogoutType) Enum.valueOf(LogoutType.class, str);
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }
    }

    static {
        t2o.a(516947974);
    }
}
