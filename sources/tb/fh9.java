package tb;

import android.content.Context;
import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17560f30", new Object[]{context});
        } else if (context != null) {
            File file = new File(context.getFilesDir(), "lib/numpy");
            if (file.exists()) {
                b(file);
            }
        }
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca8dc38", new Object[]{file})).booleanValue();
        }
        try {
            if (!file.isFile() && file.list().length != 0) {
                for (File file2 : file.listFiles()) {
                    b(file2);
                }
                file.delete();
                return true;
            }
            file.delete();
            return true;
        } catch (Throwable th) {
            kgh.t(f.f2692a, "deleteAll failed", th);
            return false;
        }
    }
}
