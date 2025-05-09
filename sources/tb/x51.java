package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x51 extends u10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337ae0c5", new Object[]{new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = w9a.g().k().edit();
        edit.putLong("lastStartProcessTime", j);
        edit.apply();
    }

    public static /* synthetic */ Object ipc$super(x51 x51Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/application/common/data/AppLaunchHelper");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9889dbd6", new Object[]{this, new Boolean(z)});
        } else {
            this.f29068a.c("isFirstLaunch", z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352f00d7", new Object[]{this, new Boolean(z)});
        } else {
            this.f29068a.c("isFullNewInstall", z);
        }
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75328cf9", new Object[]{this, new Long(j)});
        } else {
            this.f29068a.f("lastStartProcessTime", j);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d70b0e0", new Object[]{this, str});
            return;
        }
        if ("WARM".equals(str)) {
            str = "HOT";
        }
        this.f29068a.g("launchType", str);
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de316ded", new Object[]{this, new Long(j)});
        } else {
            this.f29068a.f("startAppOnCreateSystemClockTime", j);
        }
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8b8fa5", new Object[]{this, new Long(j)});
        } else {
            this.f29068a.f("startAppOnCreateSystemTime", j);
        }
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e450fe0", new Object[]{this, new Long(j)});
        } else {
            this.f29068a.f("startProcessSystemClockTime", j);
        }
    }

    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0141d2", new Object[]{this, new Long(j)});
            return;
        }
        this.f29068a.f("startProcessSystemTime", j);
        c(j);
    }
}
