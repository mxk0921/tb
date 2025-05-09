package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static File f24024a;

    public static String a(onf onfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a32334e7", new Object[]{onfVar});
        }
        if (!TextUtils.isEmpty(onfVar.d)) {
            return onfVar.d;
        }
        try {
            return new File(new URL(onfVar.f25507a).getFile()).getName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6480005", new Object[]{file})).longValue();
        }
        if (file == null || !file.exists()) {
            return 0L;
        }
        return file.length();
    }

    public static String c(String str, onf onfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50c524a9", new Object[]{str, onfVar});
        }
        String a2 = a(onfVar);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        File file = new File(str, a2);
        File file2 = new File(str, a2 + wb9.TEMP_POSTFIX);
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            long j = onfVar.b;
            if ((0 == j || j == file.length()) && bbi.d(onfVar.c, absolutePath)) {
                return file.getAbsolutePath();
            }
        }
        if (file2.exists()) {
            long j2 = onfVar.b;
            if ((0 == j2 || j2 == file2.length()) && bbi.d(onfVar.c, file2.getAbsolutePath())) {
                file2.renameTo(file);
                return file.getAbsolutePath();
            }
        }
        return "";
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6568945", new Object[]{context, str});
        }
        return e(context, str, true);
    }

    public static String e(Context context, String str, boolean z) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7b8c447", new Object[]{context, str, new Boolean(z)});
        }
        if (z) {
            if (f24024a == null) {
                f24024a = context.getExternalCacheDir();
            }
            file = f24024a;
        } else {
            file = null;
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        StringBuilder sb = new StringBuilder();
        String str2 = File.separator;
        sb.append(str2);
        sb.append("downloadsdk");
        sb.append(str2);
        sb.append(str);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getAbsolutePath();
    }

    public static boolean f(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc29e17e", new Object[]{file, file2})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (file2.exists() && !file2.delete()) {
            return false;
        }
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            return false;
        }
        if (!file2.getParentFile().canWrite()) {
            file2.getParentFile().setWritable(true);
        }
        if (file.renameTo(file2)) {
            return true;
        }
        fs7.e(f.f2692a, "mvFile", "rename fail", file.getName());
        return false;
    }
}
