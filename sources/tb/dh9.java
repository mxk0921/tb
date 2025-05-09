package tb;

import android.content.Context;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(464519247);
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ec7fd13", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.canWrite()) {
            return false;
        }
        return true;
    }

    public static File b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ed4b0b31", new Object[]{context});
        }
        File filesDir = context.getFilesDir();
        if (a(filesDir)) {
            return filesDir;
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (a(externalFilesDir)) {
                return externalFilesDir;
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (a(externalCacheDir)) {
                return externalCacheDir;
            }
        }
        File cacheDir = context.getCacheDir();
        if (a(cacheDir)) {
            return cacheDir;
        }
        return null;
    }
}
