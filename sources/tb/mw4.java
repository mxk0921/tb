package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331693);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b96392a", new Object[]{str});
        }
        if (str == null) {
            return kgd.ABI_ARM;
        }
        File file = new File(str);
        if (file.isDirectory() && file.getName().toLowerCase().startsWith("arm64")) {
            return kgd.ABI_ARM64;
        }
        return kgd.ABI_ARM;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94f0a487", new Object[]{context});
        }
        return a(context.getApplicationInfo().nativeLibraryDir);
    }
}
