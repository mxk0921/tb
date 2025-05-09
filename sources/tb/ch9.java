package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ch9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(396361826);
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list == null || list.length <= 0) {
                file.delete();
                return true;
            }
            for (String str : list) {
                if (!a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }
}
