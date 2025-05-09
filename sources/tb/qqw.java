package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class qqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856186);
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4677927d", new Object[]{file})).booleanValue();
        }
        if (a(file)) {
            return file.delete();
        }
        return false;
    }

    public static Uri c(Context context, File file) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("404d07b5", new Object[]{context, file});
        }
        if (!(file == null || context == null)) {
            try {
                if (context.getApplicationInfo().targetSdkVersion < 24 || Build.VERSION.SDK_INT < 24) {
                    return Uri.fromFile(file);
                }
                if (TextUtils.isEmpty(null)) {
                    str = context.getPackageName() + ".interactProvider";
                } else {
                    str = null;
                }
                return FileProvider.getUriForFile(context, str, file);
            } catch (Throwable th) {
                v7t.n("WVUtils", "Failed to get file uri:" + th.getMessage());
            }
        }
        return null;
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea1b3067", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                z &= a(file2);
            }
            if (!file2.delete()) {
                v7t.n("WVFileUtils", "Failed to delete " + file2);
                z = false;
            }
        }
        return z;
    }
}
