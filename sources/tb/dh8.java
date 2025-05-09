package tb;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dh8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331524);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69ef3d13", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (statFs.getAvailableBlocks() * statFs.getBlockSize() < 20971520) {
            return false;
        }
        return true;
    }
}
