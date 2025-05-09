package tb;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12eae2d8", new Object[]{str});
        }
        String str2 = LauncherRuntime.e;
        if (trq.e(str2)) {
            return str2;
        }
        String appVersion = TaobaoApplication.getAppVersion();
        if (trq.e(appVersion)) {
            return appVersion;
        }
        return str;
    }

    public static Application b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("88ee50a6", new Object[0]);
        }
        Application application = LauncherRuntime.h;
        if (application != null) {
            return application;
        }
        TLog.loge("RemoteSo", "RemoteSo", "RSo application() from tlog" + Log.getStackTraceString(new Throwable()));
        return (Application) TaobaoApplication.sApplication.getApplicationContext();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86016141", new Object[0])).booleanValue();
        }
        return TextUtils.equals("com.taobao.taobao:channel", f());
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return LauncherRuntime.l;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        String str = LauncherRuntime.b;
        if (trq.c(str)) {
            str = TaobaoApplication.getPackageName(b());
        }
        return TextUtils.equals(str, f());
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e486559f", new Object[0]);
        }
        String str = LauncherRuntime.c;
        if (trq.c(str)) {
            return TaobaoApplication.getProcessName(b());
        }
        return str;
    }
}
