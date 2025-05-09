package tb;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g4b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809339);
    }

    public static /* synthetic */ Object ipc$super(g4b g4bVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomeSwitchLauncher");
    }

    @Override // tb.zya
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (dvh.o()) {
            dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
        }
        this.f33099a.p("HomeSwitchLauncher", 4);
        this.f33099a.m(mop.KEY_APP_START);
        g0b.k(SystemClock.uptimeMillis());
        this.f33099a.p("homeLauncher", 1);
        super.a(application, hashMap);
        qy8.d().e(application);
        if (vxl.j()) {
            qy8.d().f();
        }
        x9u.H(false);
        x9u.u(wzi.LAUNCHER, true);
        if (!vxl.j()) {
            t98.b();
        }
        this.f33099a.c("HomeSwitchLauncher");
    }
}
