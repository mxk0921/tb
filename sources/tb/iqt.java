package tb;

import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final File f21514a = new File("/proc/" + Process.myPid() + "/task/");

    public static int a() {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ca0c4e9", new Object[0])).intValue();
        }
        try {
            File file = f21514a;
            if (file.isDirectory() && (list = file.list()) != null) {
                return list.length;
            }
        } catch (Exception e) {
            Log.e("ThreadHelperUtils", "getThreadCount", e);
        }
        return 0;
    }

    static {
        t2o.a(824180793);
        Process.myPid();
        try {
            Process.class.getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class).setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
