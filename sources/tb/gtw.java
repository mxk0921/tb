package tb;

import android.net.Uri;
import android.taobao.windvane.util.MimeTypeEnum;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class gtw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f20231a = new HashMap();

    static {
        MimeTypeEnum[] values;
        t2o.a(989856447);
        for (MimeTypeEnum mimeTypeEnum : MimeTypeEnum.values()) {
            f20231a.put(mimeTypeEnum.getSuffix(), mimeTypeEnum.getMimeType());
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4495802f", new Object[]{str, str2, str3});
        }
        if (str != null && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str);
                if (!parse.isHierarchical()) {
                    return str;
                }
                if (parse.getQueryParameter(str2) != null) {
                    return str;
                }
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.appendQueryParameter(str2, str3);
                return buildUpon.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7291e70f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replaceAll("^((?i)https:)?//", h1p.HTTP_PREFIX);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c569990", new Object[]{str});
        }
        return b(i(str));
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12cefe5b", new Object[]{str, str2});
        }
        if (str == null || str2 == null) {
            return null;
        }
        return Uri.parse(str).getQueryParameter(str2);
    }

    public static int e(String str) {
        int indexOf;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("677283ea", new Object[]{str})).intValue();
        }
        int length = str.length();
        while (true) {
            indexOf = str.indexOf("?", i);
            if (indexOf == -1) {
                return -1;
            }
            int i2 = indexOf + 1;
            if (i2 >= length || str.charAt(i2) != '?') {
                break;
            }
            i = indexOf + 2;
        }
        return indexOf;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a94dd8c", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (parse.isHierarchical()) {
                    return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).toString();
                }
            } catch (Throwable unused) {
            }
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ca90090", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.indexOf("#") != -1) {
            return str.substring(0, str.indexOf("#"));
        }
        return str;
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("727936c6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String replace = str.startsWith("http:") ? str.replace("http:", "") : null;
        if (str.startsWith(uyv.HTTPS_SCHEMA)) {
            replace = str.replace(uyv.HTTPS_SCHEMA, "");
        }
        return TextUtils.isEmpty(replace) ? str : replace;
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6b5f1c6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int e = e(str);
        if (e != -1) {
            return str.substring(0, e);
        }
        return str.indexOf("#") > 0 ? str.substring(0, str.indexOf("#")) : str;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95031c8f", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase().startsWith(h1p.HTTP_PREFIX) || str.toLowerCase().startsWith(h1p.HTTPS_PREFIX);
        }
        return false;
    }
}
