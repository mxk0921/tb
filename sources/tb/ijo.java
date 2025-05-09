package tb;

import android.app.Application;
import android.os.Build;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ijo implements kgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f21351a;
    public volatile String b = null;
    public volatile Boolean c = null;

    public ijo(Application application) {
        this.f21351a = application;
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ce379b0", new Object[]{str})).booleanValue();
        }
        if (!trq.c(str) && str.split("\\.").length == 3) {
            return true;
        }
        return false;
    }

    @Override // tb.kgd
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c30ce012", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean e = qts.e();
        RSoLog.d("runtime -> isMainProcess= + " + e + ",  currentProcessName=" + qts.f());
        this.c = Boolean.valueOf(e);
        return e;
    }

    @Override // tb.kgd
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7dae59b", new Object[]{this, str})).booleanValue();
        }
        return h(str);
    }

    @Override // tb.kgd
    public String d() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f408cbf4", new Object[]{this});
        }
        if (trq.e(this.b)) {
            return this.b;
        }
        synchronized (ijo.class) {
            try {
                if (trq.e(this.b)) {
                    return this.b;
                }
                if (u.a(this.f21351a)) {
                    str = kgd.ABI_ARM64;
                } else {
                    str = kgd.ABI_ARM;
                }
                this.b = str;
                String str2 = Build.CPU_ABI;
                if (!str2.equalsIgnoreCase(this.b) && (str2.equalsIgnoreCase(kgd.ABI_ARM64) || str2.equalsIgnoreCase(kgd.ABI_ARM))) {
                    this.b = str2;
                    rbn.e("runtime,abi,conflict", "ABIUtils=" + this.b + ", CPU_ABI=" + str2);
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.kgd
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dbf3015", new Object[]{this});
        }
        String a2 = qts.a("_");
        if (!c(a2)) {
            return "";
        }
        String e = pno.e(this.f21351a, "rso_common_group", "curr_app_version", "");
        if (!a2.equals(e)) {
            pno.g(this.f21351a, "rso_common_group", "curr_app_version", a2);
            pno.g(this.f21351a, "rso_common_group", "last_app_version", e);
            return e;
        }
        String e2 = pno.e(this.f21351a, "rso_common_group", "last_app_version", "");
        if (trq.c(e2)) {
            String string = PreferenceManager.getDefaultSharedPreferences(this.f21351a).getString("lastInstalledVersionName", "");
            if (c(string)) {
                return string;
            }
        }
        return e2;
    }

    @Override // tb.kgd
    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("355da482", new Object[]{this})).longValue();
        }
        try {
            return this.f21351a.getFilesDir().getFreeSpace();
        } catch (Throwable th) {
            RSoLog.c("getFreeSpaceBytes", th);
            return 0L;
        }
    }

    @Override // tb.kgd
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64f6a21f", new Object[]{this});
        }
        return qts.a("unknown");
    }

    @Override // tb.kgd
    public Application getApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f3384fc1", new Object[]{this});
        }
        return this.f21351a;
    }

    @Override // tb.kgd
    public String getProcessName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[]{this});
        }
        return qts.f();
    }

    @Override // tb.kgd
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ada7e49e", new Object[]{this, str, str2})).booleanValue();
        }
        long b = uos.b();
        boolean d = ebi.d(str, str2);
        RSoLog.d("runtime -> new md5=" + d + ", cost = " + (uos.b() - b) + ", md5=" + str + ", path=" + str2);
        if (d) {
            return true;
        }
        if (trq.c(str) || trq.c(str2)) {
            return false;
        }
        boolean d2 = bbi.d(str, str2);
        RSoLog.d("runtime -> fallback old md5=" + d2 + ", cost = " + (uos.b() - b) + ", md5=" + str + ", path=" + str2);
        return d2;
    }
}
