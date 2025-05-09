package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(106954763);
    }

    public static final boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06fc9e7", new Object[]{file})).booleanValue();
        }
        ckf.g(file, "$this$deleteSafely");
        if (!file.exists()) {
            return false;
        }
        try {
            if (TextUtils.equals(file.getCanonicalPath(), "/")) {
                return false;
            }
            if (TextUtils.equals(file.getAbsolutePath(), "/")) {
                return false;
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public static final long b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9e2bdd1", new Object[]{file})).longValue();
        }
        ckf.g(file, "$this$getCreateTime");
        if (!file.exists()) {
            return 0L;
        }
        return new Date(file.lastModified()).getTime();
    }

    public static final String d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c149273a", new Object[]{file});
        }
        ckf.g(file, "$this$getMD5");
        return c(file, "MD5");
    }

    public static final String e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("801f0747", new Object[]{file});
        }
        ckf.g(file, "$this$getSha1");
        return c(file, "SHA-1");
    }

    public static final long f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd30d773", new Object[]{file})).longValue();
        }
        ckf.g(file, "$this$size");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                ckf.f(file2, "file");
                j += f(file2);
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [tb.k2d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [tb.k2d] */
    /* JADX WARN: Unknown variable types count: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String c(java.io.File r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oc9.c(java.io.File, java.lang.String):java.lang.String");
    }
}
