package tb;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ias {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = ":FileUtils";

    static {
        t2o.a(849346569);
    }

    public static long a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c55679", new Object[]{file})).longValue();
        }
        long j = 0;
        if (!d(file)) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                j += a(file2);
            }
        }
        return j;
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f12c3fcc", new Object[]{str})).longValue();
        }
        if (str == null) {
            return 0L;
        }
        return a(new File(str));
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6933ca61", new Object[]{str, str2});
        }
        if (str == null || str.length() == 0) {
            return str2;
        }
        int length = str.length();
        if (str2 != null && str2.length() != 0) {
            if (str2.startsWith("./")) {
                str2 = str2.substring(1);
            }
            if (str.charAt(length - 1) == '/') {
                if (str2.charAt(0) != '/') {
                    return str.concat(str2);
                }
                return str.substring(0, str.length() - 1) + str2;
            } else if (str2.charAt(0) == '/') {
                return str.concat(str2);
            } else {
                return str + "/" + str2;
            }
        } else if (str.charAt(length - 1) == '/') {
            return str;
        } else {
            return str.concat("/");
        }
    }

    public static boolean d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff54ab1e", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        return true;
    }

    public static String e(String str) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3621c886", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(46)) >= 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9656dcf7", new Object[]{str});
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
            return fileExtensionFromUrl;
        }
        String e = e(str);
        if (TextUtils.isEmpty(e) || !MimeTypeMap.getSingleton().hasExtension(e.toLowerCase())) {
            return null;
        }
        return e;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a846ab", new Object[]{str});
        }
        String f = f(str);
        if ("js".equalsIgnoreCase(f)) {
            return "application/javascript";
        }
        if (f != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(f);
        }
        return null;
    }

    public static String h(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6b7a5", new Object[]{str, context});
        }
        if (context == null) {
            return null;
        }
        try {
            return vas.f(AssetsDelegate.proxy_open(context.getAssets(), str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
