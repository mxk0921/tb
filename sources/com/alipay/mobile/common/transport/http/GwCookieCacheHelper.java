package com.alipay.mobile.common.transport.http;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class GwCookieCacheHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "GwCookieCacheHelper";
    public static final Map<String, Map<String, String>> cookieCacheMaps = new LinkedHashMap(4);

    public static void cookieStringToMap(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34b7a08", new Object[]{str, map});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn(TAG, "[cookieStringToMap] localCookie is empty.");
        } else if (map == null) {
            LogCatUtil.warn(TAG, "[cookieStringToMap] map is null.");
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if (TextUtils.isEmpty(trim)) {
                    LogCatUtil.warn(TAG, "[cookieStringToMap] kvPairStr is empty.");
                } else {
                    int indexOf = trim.indexOf("=", 0);
                    if (indexOf < 0) {
                        LogCatUtil.warn(TAG, "[cookieStringToMap] Not find '=' symbol.");
                    } else {
                        String substring = trim.substring(0, indexOf);
                        int i = indexOf + 1;
                        if (trim.length() - i > 0) {
                            str2 = trim.substring(i);
                        } else {
                            str2 = "";
                        }
                        map.put(substring, str2);
                    }
                }
            }
        }
    }

    public static final synchronized String getCookie(String str) {
        synchronized (GwCookieCacheHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{str});
            }
            Map<String, Map<String, String>> map = cookieCacheMaps;
            if (!map.isEmpty() && map.get(str) != null) {
                if (map.get(str).isEmpty()) {
                    return "";
                }
                return toCookieString(map.get(str));
            }
            return "";
        }
    }

    public static final Map<String, String> getCookieMapByDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18d1fc43", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn(TAG, "[getCookieMapByDomain] domain is empty.");
            return null;
        }
        Map<String, Map<String, String>> map = cookieCacheMaps;
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            return map2;
        }
        synchronized (GwCookieCacheHelper.class) {
            if (map2 == null) {
                try {
                    map2 = new LinkedHashMap<>();
                    map.put(str, map2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map2;
    }

    public static final String getCookieWrapper(Context context, String str, TransportContext transportContext) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("893b12ab", new Object[]{context, str, transportContext});
        }
        if (TextUtils.isEmpty(str) || context == null) {
            return "";
        }
        String topDomain = MiscUtils.getTopDomain(str);
        if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.COOKIE_CACHE_SWITCH, "T") || transportContext == null || transportContext.bizType != 1) {
            z = false;
        } else {
            String cookie = getCookie(topDomain);
            if (!TextUtils.isEmpty(cookie)) {
                LogCatUtil.info(TAG, "[getCookieWrapper] Use old cache cookie. add cookie=[" + cookie + "]. url=" + str);
                return cookie;
            }
        }
        if (!MiscUtils.isInAlipayClient(context) || !MiscUtils.isPushProcess(context)) {
            if (z) {
                synchronized (GwCookieCacheHelper.class) {
                    try {
                        String cookie2 = getCookie(topDomain);
                        if (!TextUtils.isEmpty(cookie2)) {
                            LogCatUtil.info(TAG, "[getCookieWrapper] Use new cache cookie. add cookie=[" + cookie2 + "]. url=" + str);
                            return cookie2;
                        }
                        str2 = CookieAccessHelper.getCookie(str, context);
                        LogCatUtil.info(TAG, "[getCookieWrapper] get from CookieManager complete");
                        if (TextUtils.isEmpty(str2)) {
                            return "";
                        }
                        cookieStringToMap(str2, getCookieMapByDomain(topDomain));
                        LogCatUtil.info(TAG, "[getCookieWrapper] Cookie Cache load finish.");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                str2 = CookieAccessHelper.getCookie(str, context);
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
            }
            LogCatUtil.debug(TAG, "[getCookieWrapper] Use cookie manager. add cookie=[" + str2 + "] . url=" + str);
            return str2;
        }
        LogCatUtil.info(TAG, "[getCookieWrapper] Another process is not operating a cookie.");
        return "";
    }

    public static final synchronized void removeAllCookie() {
        synchronized (GwCookieCacheHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88e96b48", new Object[0]);
            } else {
                cookieCacheMaps.clear();
            }
        }
    }

    public static final synchronized void setCookies(String str, Map<String, String> map) {
        synchronized (GwCookieCacheHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ab48d27", new Object[]{str, map});
                return;
            }
            if (!TextUtils.isEmpty(str) && !map.isEmpty()) {
                getCookieMapByDomain(str).putAll(map);
            }
        }
    }

    public static final String toCookieString(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("738901f2", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("; ");
        }
        return sb.deleteCharAt(sb.length() - 2).toString().trim();
    }
}
