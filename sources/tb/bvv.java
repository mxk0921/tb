package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.File;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bvv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final bvv INSTANCE = new bvv();
    public static final String LOCAL_PATH_FLAG = "/themis/usr";
    public static final String PATH_PREFIX = "https://usr";

    static {
        t2o.a(839909987);
    }

    @JvmStatic
    public static final String a(Context context, String str, String str2) {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ff8099", new Object[]{context, str, str2});
        }
        ckf.g(context, "context");
        ckf.g(str, gl4.CONFIG_LOCAL_PATH);
        ckf.g(str2, "bizId");
        TMSLogger.a("UsrPathConversionUtils", "localPathToUsrPath, localPath: " + str + ", bizId: " + str2);
        if (str.length() == 0 || str2.length() == 0 || (d = pq7.d(context, ckf.p("usr/", str2))) == null || d.length() == 0 || !tsq.I(str, ckf.p(d, "/"), false, 2, null)) {
            return null;
        }
        boolean b = ckf.b(str, d);
        String str3 = PATH_PREFIX;
        if (!b) {
            String substring = str.substring(d.length());
            ckf.f(substring, "this as java.lang.String).substring(startIndex)");
            str3 = ckf.p(str3, substring);
        }
        TMSLogger.a("UsrPathConversionUtils", ckf.p("localPathToUsrPath, usrPath: ", str3));
        return str3;
    }

    @JvmStatic
    public static final String b(Context context, String str, String str2) {
        int length;
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("342dd8e7", new Object[]{context, str, str2});
        }
        ckf.g(context, "context");
        ckf.g(str, "usrPath");
        ckf.g(str2, "bizId");
        TMSLogger.a("UsrPathConversionUtils", "usrPathToLocalPath，usrPath: " + str + ", bizId: " + str2);
        if (str.length() == 0 || str2.length() == 0 || (length = str.length()) < 11) {
            return null;
        }
        if ((length == 11 && !ckf.b(str, PATH_PREFIX)) || !tsq.I(str, PATH_PREFIX, false, 2, null) || (d = pq7.d(context, ckf.p("usr/", str2))) == null || d.length() == 0) {
            return null;
        }
        File file = new File(d);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (length == 11) {
            return d;
        }
        String substring = str.substring(11);
        ckf.f(substring, "this as java.lang.String).substring(startIndex)");
        String p = ckf.p(d, substring);
        TMSLogger.a("UsrPathConversionUtils", ckf.p("usr local path: ", p));
        return p;
    }
}
