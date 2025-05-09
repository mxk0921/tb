package com.taobao.login4android.session.cookies;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginCookieUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final char COMMA = ',';
    private static final String DOMAIN = "domain";
    private static final char EQUAL = '=';
    private static final String EXPIRES = "expires";
    private static final String HTTP_ONLY = "httponly";
    private static final String MAX_AGE = "max-age";
    private static final int MAX_COOKIE_LENGTH = 4096;
    private static final String PATH = "path";
    private static final char PERIOD = '.';
    private static final char QUOTATION = '\"';
    private static final String SECURE = "secure";
    private static final char SEMICOLON = ';';
    private static final String TAG = "login.LoginCookieUtils";
    private static final char WHITE_SPACE = ' ';
    private static final int SECURE_LENGTH = 6;
    private static final int HTTP_ONLY_LENGTH = 8;

    static {
        t2o.a(516947999);
    }

    public static void expiresCookies(LoginCookie loginCookie) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4dc99b", new Object[]{loginCookie});
        } else {
            loginCookie.expiresString = "Thu, 01-Jan-1970 00:00:10 GMT";
        }
    }

    public static String getHttpDomin(LoginCookie loginCookie) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dc590d7", new Object[]{loginCookie});
        }
        String str = loginCookie.domain;
        if (!TextUtils.isEmpty(str) && str.startsWith(".")) {
            str = str.substring(1);
        }
        return h1p.HTTPS_PREFIX + str;
    }

    public static String getValue(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            CookieManager instance = CookieManager.getInstance();
            instance.setAcceptCookie(true);
            String cookie = instance.getCookie("https://.taobao.com");
            if (!TextUtils.isEmpty(cookie)) {
                for (String str2 : cookie.split(";")) {
                    String[] split2 = str2.split("=");
                    if (split2.length >= 2 && str.equals(split2[0].trim())) {
                        int indexOf = str2.indexOf("=");
                        if (split2.length == 2) {
                            return split2[1].trim();
                        }
                        return str2.substring(indexOf + 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
        if (r22.charAt(r9) == r10) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
        if (r22.charAt(r9) == r10) goto L_0x00de;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.login4android.session.cookies.LoginCookie parseCookie(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.session.cookies.LoginCookieUtils.parseCookie(java.lang.String):com.taobao.login4android.session.cookies.LoginCookie");
    }
}
