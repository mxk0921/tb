package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.huawei.secure.android.common.util.LogsUtil;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class onv {
    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : b(str);
        }
        LogsUtil.f("UriUtil", "whiteListUrl is null");
        return null;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogsUtil.f("UriUtil", "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            LogsUtil.d("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e) {
            LogsUtil.d("UriUtil", "getHostByURI error  MalformedURLException : " + e.getMessage());
            return "";
        }
    }

    public static boolean d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str.contains("..") || str.contains("@")) {
                Log.e("UriUtil", "url contains unsafe char");
            } else if (str2.equals(str) || str.startsWith(str2.concat("?")) || str.startsWith(str2.concat("#"))) {
                return true;
            } else {
                if (!str2.endsWith("/")) {
                    return false;
                }
                if (Uri.parse(str).getPathSegments().size() - Uri.parse(str2).getPathSegments().size() != 1) {
                    return false;
                }
                return str.startsWith(str2);
            }
        }
        return false;
    }

    public static boolean f(String str, String str2) {
        String b = b(str);
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(str2)) {
            LogsUtil.d("UriUtil", "url or whitelist is null");
            return false;
        }
        String a2 = a(str2);
        if (TextUtils.isEmpty(a2)) {
            Log.e("UriUtil", "whitelist host is null");
            return false;
        } else if (a2.equals(b)) {
            return true;
        } else {
            if (b.endsWith(a2)) {
                try {
                    String substring = b.substring(0, b.length() - a2.length());
                    if (!substring.endsWith(".")) {
                        return false;
                    }
                    return substring.matches("^[A-Za-z0-9.-]+$");
                } catch (IndexOutOfBoundsException e) {
                    LogsUtil.d("UriUtil", "IndexOutOfBoundsException" + e.getMessage());
                } catch (Exception e2) {
                    LogsUtil.d("UriUtil", "Exception : " + e2.getMessage());
                    return false;
                }
            }
            return false;
        }
    }

    public static boolean g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(b(str), a(str2));
        }
        Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
        return false;
    }

    public static boolean c(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.d("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.d("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (f(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.d("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (g(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
