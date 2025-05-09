package com.taobao.login4android.constants;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginUrlConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BASE_URL = "//login.m.taobao.com";
    private static final String COMMON_SCAN_URL = "login.m.taobao.com/qrcodeCheck.htm?";
    private static final String COMMON_SCAN_URL_PRE = "login.wapa.taobao.com/qrcodeCheck.htm?";
    private static final String LOGIN_URLS = "((https|http)://)login.(m|wapa|waptest).(taobao|tmall).com/(login/){0,1}login.htm(.*);((https|http)://)login.tmall.com(.*);((https|http)://)login.taobao.com/member/login.jhtml(.*);(http|https)://login.(taobao|tmall).com/login/(.*);http://login.m.taobao.com/minisdk/login.htm;https://oauth.m.taobao.com/authorize";
    private static final String LOGOUT_URLS = "((https|http)://)login.(m|wapa|waptest).(taobao|tmall).com/(login/){0,1}logout.htm(.*)";
    private static final String SCAN_LOGIN = "/qrcodeLogin.htm?shortURL=";

    static {
        t2o.a(516947980);
    }

    public static String getLoginUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3f90622", new Object[0]);
        }
        return LOGIN_URLS;
    }

    public static String getLogoutUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("150f33f5", new Object[0]);
        }
        return LOGOUT_URLS;
    }

    public static String getScanLoginUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34850740", new Object[0]);
        }
        return "//login.m.taobao.com/qrcodeLogin.htm?shortURL=";
    }

    public static boolean isCommonScanUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e99c2f12", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(COMMON_SCAN_URL) || str.contains(COMMON_SCAN_URL_PRE);
    }
}
