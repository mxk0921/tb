package tb;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bpv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_URL_CHECK_SWITCH = "url_check_switch";
    public static final String CONFIG_GROUP_WEEX_BLACKURL_GROUP = "weex_config_render_black_urls";
    public static final String CONFIG_GROUP_WEEX_WHITEURL_GROUP = "weex_config_render_white_urls";
    public static final String CONFIG_GROUP_WEEX_WHITE_SCHEME_GROUP = "weex_config_render_white_schema";
    public static final String CONFIG_KEY_IS_CHECK = "is_check";
    public static final String CONFIG_KEY_IS_RENDER = "is_render";
    public static final String CONFIG_KEY_WEEX_BLACKURL = "blackurl";
    public static final String CONFIG_KEY_WEEX_WHITEURL = "whiteurl";
    public static final String CONFIG_KEY_WEEX_WHITE_SCHEME = "white_schema";

    static {
        t2o.a(85983274);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2071a66", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            WXLogUtils.d("checkUrl expectedUrls is empty true");
            return false;
        }
        WXLogUtils.d("checkUrl hostUrl is " + str + "expectedUrls is " + str2);
        if (str2.startsWith("*")) {
            return str.endsWith(str2.substring(1));
        }
        return str.equals(str2);
    }

    public static String b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e115f38e", new Object[]{str});
        }
        try {
            str2 = Uri.parse(str).getHost();
        } catch (Throwable unused) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !str.startsWith("/")) {
            return str2;
        }
        String substring = str.substring(1);
        while (substring.startsWith("/")) {
            substring = substring.substring(1);
        }
        try {
            return Uri.parse(h1p.HTTPS_PREFIX.concat(substring)).getHost();
        } catch (Throwable unused2) {
            return str2;
        }
    }

    public static boolean c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f474e6c", new Object[]{str})).booleanValue();
        }
        if (ssw.b(str)) {
            return false;
        }
        try {
            str2 = b(str);
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
            str2 = null;
        }
        if (e(str2)) {
            return false;
        }
        if (ssw.j(str) || TextUtils.isEmpty(str2) || g(str2)) {
            return true;
        }
        return f(str);
    }

    public static boolean d(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e5607", new Object[]{str})).booleanValue();
        }
        npb b = kr0.e().b();
        if (b != null) {
            boolean booleanValue = Boolean.valueOf(b.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_CHECK, "")).booleanValue();
            boolean booleanValue2 = Boolean.valueOf(b.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_RENDER, "")).booleanValue();
            if (booleanValue) {
                if (ssw.b(str)) {
                    return false;
                }
                try {
                    str2 = b(str);
                } catch (Throwable th) {
                    WXLogUtils.e(WXLogUtils.getStackTrace(th));
                    str2 = null;
                }
                if (e(str2)) {
                    return false;
                }
                if (!ssw.j(str) && !TextUtils.isEmpty(str2) && !g(str2) && !f(str)) {
                    return booleanValue2;
                }
                return true;
            }
        }
        return true;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df7ae2b0", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        if (TextUtils.isEmpty(str)) {
            WXLogUtils.d("urlHost is empty");
            return false;
        }
        npb b = kr0.e().b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(CONFIG_GROUP_WEEX_BLACKURL_GROUP, CONFIG_KEY_WEEX_BLACKURL, "");
        if (TextUtils.isEmpty(config)) {
            return false;
        }
        String[] split = config.split(",");
        if (!(split == null || split.length == 0)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && a(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        WXLogUtils.d("expectedUrls is empty");
        return false;
    }

    public static boolean f(String str) {
        npb b;
        String[] split;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbd0a6c6", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        if (TextUtils.isEmpty(str) || (b = kr0.e().b()) == null) {
            return false;
        }
        String config = b.getConfig(CONFIG_GROUP_WEEX_WHITE_SCHEME_GROUP, CONFIG_KEY_WEEX_WHITE_SCHEME, "");
        if (TextUtils.isEmpty(config) || (split = config.split(",")) == null || split.length == 0) {
            return false;
        }
        try {
            str2 = Uri.parse(str).getScheme();
        } catch (Throwable unused) {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        for (String str3 : split) {
            if (!TextUtils.isEmpty(str3)) {
                if (isEmpty) {
                    if (str.startsWith(str3 + HttpConstant.SCHEME_SPLIT)) {
                        return true;
                    }
                } else if (TextUtils.equals(str3, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(String str) {
        npb b;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815545f8", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        if (TextUtils.isEmpty(str) || (b = kr0.e().b()) == null) {
            return false;
        }
        String config = b.getConfig(CONFIG_GROUP_WEEX_WHITEURL_GROUP, CONFIG_KEY_WEEX_WHITEURL, "*.m.taobao.com,xilivr.ewszjk.m.jaeapp.com,luckygiftphp.ewszjk.m.jaeapp.com,xuan.ews.m.jaeapp.com");
        if (!(TextUtils.isEmpty(config) || (split = config.split(",")) == null || split.length == 0)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && a(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9732cd55", new Object[]{str})).booleanValue();
        }
        npb b = kr0.e().b();
        if (b != null) {
            boolean booleanValue = Boolean.valueOf(b.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_CHECK, "")).booleanValue();
            boolean booleanValue2 = Boolean.valueOf(b.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_RENDER, "")).booleanValue();
            if (booleanValue && !ssw.b(str) && !c(str) && booleanValue2) {
                return true;
            }
        }
        return false;
    }
}
