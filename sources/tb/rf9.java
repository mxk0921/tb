package tb;

import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rf9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571203);
    }

    public static BigDecimal a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("a7c4fed4", new Object[]{str, str2, new Integer(i)});
        }
        if (i >= 0) {
            try {
                return new BigDecimal(str).divide(new BigDecimal(str2), i, RoundingMode.DOWN);
            } catch (Exception e) {
                jgh.a("divString", e.getMessage());
                return new BigDecimal(0);
            }
        } else {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
    }

    public static File b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c9129967", new Object[]{str, str2});
        }
        try {
            String e = di2.e(str2);
            if (TextUtils.isEmpty(e)) {
                return null;
            }
            File file = new File(di2.k(str), e);
            if (file.exists()) {
                return file;
            }
            jgh.a(cg9.TAG, "hasDownloadedResouce failed url = " + str2);
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("124c7258", new Object[]{str});
        }
        try {
            jgh.a(cg9.TAG, "getUrlLocalPath url=" + str);
            String e = di2.e(str);
            jgh.a(cg9.TAG, "getUrlLocalPath fileName=" + e);
            if (!TextUtils.isEmpty(e)) {
                File file = new File(f(), e);
                if (!file.exists()) {
                    jgh.a(cg9.TAG, "getUrlLocalPath file not exist, fileName=" + e);
                    file = new File(di2.k(nwi.BIZ_CODE), e);
                    if (!file.exists()) {
                        jgh.a(cg9.TAG, "getUrlLocalPath file not exist in bootImage, fileName=" + e);
                        return null;
                    }
                }
                return file.getAbsolutePath();
            }
        } catch (Throwable th) {
            jgh.b(cg9.TAG, "getUrlLocalPath error=", th);
        }
        return null;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af9ab822", new Object[]{str});
        }
        try {
            jgh.a(cg9.TAG, "getUrlLocalPathInBootImage url=" + str);
            String e = di2.e(str);
            jgh.a(cg9.TAG, "getUrlLocalPathInBootImage fileName=" + e);
            if (!TextUtils.isEmpty(e)) {
                File file = new File(di2.k(nwi.BIZ_CODE), e);
                if (file.exists()) {
                    return file.getAbsolutePath();
                }
                jgh.a(cg9.TAG, "getUrlLocalPathInBootImage file not exist, fileName=" + e);
                return null;
            }
        } catch (Throwable th) {
            jgh.b(cg9.TAG, "getUrlLocalPathInBootImage error=", th);
        }
        return null;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f63c27d4", new Object[]{str})).booleanValue();
        }
        try {
            String e = di2.e(str);
            if (!TextUtils.isEmpty(e)) {
                if (!new File(di2.k(nwi.BIZ_CODE), e).exists()) {
                    return false;
                }
                return true;
            }
        } catch (Throwable th) {
            jgh.b(cg9.TAG, "isResourceExist error=", th);
        }
        return false;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b842858", new Object[0]);
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null) {
            return null;
        }
        File file = new File(filesDir, File.separator + "mmadbiz");
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        jgh.a(cg9.TAG, "localResourcesRootPath rootPath=" + absolutePath);
        return absolutePath;
    }
}
