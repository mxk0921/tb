package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("962b944b", new Object[]{str});
        }
        return Boolean.valueOf(new File(ey1.SWITCH_FILE_DIR, str).exists());
    }
}
