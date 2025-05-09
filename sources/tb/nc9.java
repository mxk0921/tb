package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346587);
    }

    public static final boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06fc9e7", new Object[]{file})).booleanValue();
        }
        ckf.g(file, "<this>");
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
        ckf.g(file, "<this>");
        if (!file.exists()) {
            return 0L;
        }
        return new Date(file.lastModified()).getTime();
    }

    public static final long c(File file) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd30d773", new Object[]{file})).longValue();
        }
        ckf.g(file, "<this>");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            while (i < length) {
                File file2 = listFiles[i];
                i++;
                ckf.f(file2, "file");
                j += c(file2);
            }
        }
        return j;
    }
}
