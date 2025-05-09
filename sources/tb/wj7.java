package tb;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150893);
    }

    public static String a() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d2564cd", new Object[0]);
        }
        if (Build.VERSION.SDK_INT < 23) {
            return "未知架构";
        }
        is64Bit = Process.is64Bit();
        if (is64Bit) {
            return "64位";
        }
        return "32位";
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aac00d3b", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }
}
