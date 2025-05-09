package tb;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class zpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855746);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String cookie = CookieManager.getInstance().getCookie(str);
        v7t.d("WVCookieManager", "getCookie url=" + str + ",cookieStr=" + cookie);
        return cookie;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67ea346", new Object[]{context});
        } else {
            CookieSyncManager.createInstance(context);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && str2 != null) {
            v7t.d("WVCookieManager", "setCookie url=" + str + ",cookieStr=" + str2);
            if (!CookieManager.getInstance().acceptCookie()) {
                CookieManager.getInstance().setAcceptCookie(true);
            }
            CookieManager.getInstance().setCookie(str, str2);
        }
    }
}
