package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cl9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355099);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52433a52", new Object[]{str})).booleanValue();
        }
        return new File(ey1.SWITCH_FILE_DIR, str).exists();
    }
}
