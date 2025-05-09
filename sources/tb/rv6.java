package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792209);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[0])).booleanValue();
        }
        if (Globals.getApplication() == null || Globals.getApplication().getApplicationInfo() == null || (Globals.getApplication().getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }
}
