package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544372);
    }

    public static boolean a(File file) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("807b73c9", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z2 = true;
            for (File file2 : listFiles) {
                z2 &= a(file2);
            }
            z = z2;
        }
        return file.delete() & z;
    }
}
