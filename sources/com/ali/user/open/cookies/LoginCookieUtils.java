package com.ali.user.open.cookies;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginCookieUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final char COMMA = ',';
    private static final String DISCARD = "discard";
    private static final int DISCARD_LENGTH = 7;
    private static final String DOMAIN = "domain";
    private static final char EQUAL = '=';
    private static final String EXPIRES = "expires";
    private static final String HTTPS = "https";
    private static final String HTTP_ONLY = "httponly";
    private static final int HTTP_ONLY_LENGTH = 8;
    private static final String MAX_AGE = "max-age";
    private static final int MAX_COOKIE_LENGTH = 4096;
    private static final String PATH = "path";
    private static final char PATH_DELIM = '/';
    private static final char PERIOD = '.';
    private static final char QUESTION_MARK = '?';
    private static final char QUOTATION = '\"';
    private static final String SECURE = "secure";
    private static final int SECURE_LENGTH = 6;
    private static final char SEMICOLON = ';';
    private static final String TAG = "login.LoginCookieUtils";
    private static final String VERSION = "version";
    private static final char WHITE_SPACE = ' ';

    public static void expiresCookies(LoginCookie loginCookie) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75295792", new Object[]{loginCookie});
        } else {
            loginCookie.expires = 1000L;
        }
    }

    public static String getHttpDomin(LoginCookie loginCookie) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1437011c", new Object[]{loginCookie});
        }
        String str = loginCookie.domain;
        if (!TextUtils.isEmpty(str) && str.startsWith(".")) {
            str = str.substring(1);
        }
        return h1p.HTTPS_PREFIX + str;
    }

    public static JSONObject getKeyValues(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f59388ea", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            String cookie = CookieManagerService.getWebViewProxy().getCookie(".taobao.com");
            if (!TextUtils.isEmpty(cookie)) {
                for (String str2 : cookie.split(";")) {
                    String[] split2 = str2.split("=");
                    if (split2.length >= 2 && split2[0].contains(str)) {
                        if (split2.length == 2) {
                            jSONObject.put(split2[0].trim(), split2[1].trim());
                        } else {
                            jSONObject.put(split2[0].trim(), str2.substring(str2.indexOf("=") + 1));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
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
            String cookie = CookieManagerService.getWebViewProxy().getCookie(".taobao.com");
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
        if (r20.charAt(r9) == r10) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00df, code lost:
        r8 = ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
        if (r20.charAt(r9) == r10) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0121, code lost:
        if (r20.charAt(r9) == r10) goto L_0x00de;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ali.user.open.cookies.LoginCookie parseCookie(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.cookies.LoginCookieUtils.parseCookie(java.lang.String):com.ali.user.open.cookies.LoginCookie");
    }
}
