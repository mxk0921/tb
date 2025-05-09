package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i21 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f21047a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421b04", new Object[0])).booleanValue();
        }
        try {
            return c21.g().getBoolean("isFirstLaunch", false);
        } catch (Throwable th) {
            RSoLog.c("isFirstLaunch", th);
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("767f7a1f", new Object[0])).booleanValue();
        }
        try {
            if (f21047a != 0) {
                return f21047a == 1;
            }
            boolean d = BootstrapMode.d(1024);
            if (d) {
                f21047a = 1;
            } else {
                f21047a = 2;
            }
            RSoLog.d("init isFullNewInstall = " + d);
            return d;
        } catch (Throwable th) {
            RSoLog.c("isFullNewInstall", th);
            return false;
        }
    }
}
