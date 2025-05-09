package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import com.taobao.tao.Globals;
import com.taobao.tao.log.LogLevel;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.JSLogBridge;
import com.taobao.tlog.adapter.TLogJSBridage;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u6f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "TLog.InitTaoLog";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f29178a;
        public final /* synthetic */ String b;

        public a(Application application, String str) {
            this.f29178a = application;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s4s.e().b(n6s.i(this.f29178a.getResources().getString(R.string.tlog_module)));
            String str = (String) hhg.a("process", null);
            if (TextUtils.isEmpty(str)) {
                str = u6f.q(this.f29178a);
            }
            String str2 = (String) hhg.a("packageName", null);
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f29178a.getPackageName();
            }
            String str3 = TextUtils.isEmpty(str) ? "DEFAULT" : str;
            LogLevel c = n6s.c(this.f29178a.getResources().getString(R.string.tlog_level));
            if (!this.f29178a.getResources().getBoolean(R.bool.tlog_switch)) {
                c = LogLevel.N;
            }
            String r = u6f.r();
            if (r == null) {
                r = "8951ae070be6560f4fc1401e90a83a4e";
            }
            try {
                String str4 = (String) hhg.a("appVersion", null);
                if (TextUtils.isEmpty(str4)) {
                    str4 = Globals.getVersionName();
                }
                String str5 = (String) hhg.a("deviceId", null);
                if (TextUtils.isEmpty(str5)) {
                    str5 = UTDevice.getUtdid(this.f29178a);
                }
                j5s M = j5s.j().b(this.f29178a, c, "logs", str3, this.b, str4).y(this.f29178a).G(r).K(Login.getNick()).L(str5).x("12278902@android").D(str).C(str2).H(new t4s(this.f29178a)).F(new y5s()).M(drx.a());
                if (TextUtils.equals(str, "com.taobao.taobao:channel")) {
                    M.z(200);
                    M.E(300);
                }
                M.t();
                j5s.j().f = "ha-remote-debug";
                j5s.j().d = "motu-debug-log";
                j5s.j().c("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCkljG92+Yqz66N05ou24ZUleqTJspB72jc2jJ2jIAhoXcOVYbc2NR/6lsoAb+LEMP5hYyp8DkVlZOarfDKL3btQdGx/MJP58HRLkwDVeOnqWQ26VLfAgQPN9/isZ1535OqcM9uUJM/P1hk/mtMuAQm0oz6LyOAGTglZFVCuuF9jwIDAQAB\n");
            } catch (Exception e) {
                Log.e(u6f.e, "param is unlegal, tlog plugin start failure ", e);
            }
            try {
                JSLogBridge.init();
                TLogJSBridage.init();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                j5s.j().B(new j6s());
                j5s.j().J(new d6s());
                f6s.b(this.f29178a);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public u6f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(u6f u6fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitTaoLog");
    }

    public static /* synthetic */ String q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cd3348f", new Object[]{context});
        }
        return s(context);
    }

    public static /* synthetic */ String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return t();
    }

    private static String s(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b9d1cf", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.size() == 0)) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("578ce40c", new Object[0]);
        }
        try {
            return UUID.randomUUID().toString().replace("-", "");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        if (!LauncherRuntime.l) {
            y7t.d(false);
            epo.c(false);
            TBSdkLog.setLogEnable(TBSdkLog.LogEnable.ErrorEnable);
        } else {
            y7t.d(true);
            epo.c(true);
        }
        if (application != null) {
            Coordinator.execute(new a(application, (String) hhg.a(OConstant.LAUNCH_ONLINEAPPKEY, null)));
        }
    }
}
