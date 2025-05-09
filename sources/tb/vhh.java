package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f30015a = q1r.c(".launch_turbo_log_switch");

    static {
        t2o.a(768606216);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (f30015a) {
            Log.e("LaunchTurbo", "[" + str + "] E " + str2);
        } else {
            TLog.loge("LaunchTurbo", str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else if (f30015a) {
            Log.e("LaunchTurbo", "[" + str + "] E " + str2, th);
        } else {
            String message = th.getMessage();
            TLog.loge("LaunchTurbo", str, str2 + ", exception: " + message);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else if (f30015a) {
            Log.e("LaunchTurbo", "[" + str + "] W " + str2);
        } else {
            TLog.logw("LaunchTurbo", str, str2);
        }
    }
}
