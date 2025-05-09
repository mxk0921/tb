package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.util.WeexAppMonitor$Performance$Point;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w3x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "WeexAppMonitor";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30439a = false;

    static {
        t2o.a(982515950);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af50a3e", new Object[0]);
        } else if (!f30439a) {
            f30439a = true;
            WeexAppMonitor$Performance$Point.register();
        }
    }
}
