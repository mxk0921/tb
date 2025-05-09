package tb;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f19660a = -1;
    public static long b = Long.MIN_VALUE;
    public static final AtomicBoolean c = new AtomicBoolean(false);

    static {
        t2o.a(729809880);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6708369", new Object[]{str})).booleanValue();
        }
        if (!kbq.h(Globals.getApplication()) || LauncherRuntime.k != 0 || !TextUtils.equals(str, yyj.e().k())) {
            return false;
        }
        return true;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da514c1", new Object[0]);
        } else {
            c.set(true);
        }
    }

    public static boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e516968", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        chb g = c21.g();
        if (g == null) {
            return z;
        }
        return g.getBoolean(str, z);
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecb9ec1f", new Object[]{str, str2});
        }
        chb g = c21.g();
        if (g == null) {
            return str2;
        }
        return g.getString(str, str2);
    }

    public static long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc72aa1f", new Object[0])).longValue();
        }
        return b;
    }

    public static long f() {
        long j;
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        try {
            long j2 = nca.i;
            if (j2 > 0) {
                return j2;
            }
            long j3 = f19660a;
            if (j3 > 0) {
                return j3;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                startUptimeMillis = Process.getStartUptimeMillis();
                f19660a = startUptimeMillis;
            } else {
                long a2 = xym.a();
                if (a2 != SystemClock.uptimeMillis()) {
                    j = System.currentTimeMillis() - a2;
                } else {
                    j = Process.getElapsedCpuTime();
                }
                f19660a = SystemClock.uptimeMillis() - j;
            }
            return f19660a;
        } catch (Throwable unused) {
            return SystemClock.uptimeMillis();
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("586c5fd1", new Object[]{str});
        }
        return str + "_data";
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6eaeec4", new Object[]{str});
        }
        return str + "_result";
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59421b68", new Object[0])).booleanValue();
        }
        return c.get();
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9065b1d", new Object[]{str});
        } else if (vxl.n()) {
            Log.e("home.GlobalTrace", str);
        } else {
            TLog.loge("home", "GlobalTrace", str);
        }
    }

    public static void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b741ce6", new Object[]{new Long(j)});
        } else {
            b = j;
        }
    }
}
