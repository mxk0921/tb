package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zu9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537771);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40368082", new Object[0])).booleanValue();
        }
        if (new File("/data/local/tmp/.useFontSetting").exists()) {
            return true;
        }
        return false;
    }
}
