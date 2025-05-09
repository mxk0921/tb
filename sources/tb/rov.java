package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(335544328);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa6dd8af", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.endsWith(".heic") || !str.contains(".jpg")) {
            return str;
        }
        return str.substring(0, str.lastIndexOf(".jpg") + 4);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("101e5cf9", new Object[]{str});
        }
        if (!f(str)) {
            return str;
        }
        if (!str.startsWith(itw.URL_SEPARATOR)) {
            str = itw.URL_SEPARATOR.concat(str);
        }
        return uyv.HTTPS_SCHEMA + str;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96e13678", new Object[]{str});
        }
        if (f(str)) {
            str = b(str);
        }
        if (d(str)) {
            return a(str);
        }
        return str;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbc97ea3", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".heic");
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8c02c52", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !str.contains("http:") && !str.contains(uyv.HTTPS_SCHEMA)) {
            return new File(str).exists();
        }
        return false;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1a34c72", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http:") && !str.startsWith(uyv.HTTPS_SCHEMA)) {
            return true;
        }
        return false;
    }
}
