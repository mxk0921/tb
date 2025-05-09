package tb;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m0f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public m0f(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(m0f m0fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitHomePreRequestLauncher");
    }

    @Override // tb.mss
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd9904d3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.bxk, tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (d && vrg.b(LauncherRuntime.g)) {
            d = false;
        }
        if (!d) {
            return false;
        }
        fxp j = fxp.j();
        String c = fxp.c(j);
        TLog.loge(erj.MODULE, c(), "startup context component = " + c);
        if (j != null && !j.f19614a) {
            TLog.loge(erj.MODULE, c(), "startup context is not from activity");
            return false;
        } else if (!"UNKNOWN".equals(c)) {
            return !t.a(LauncherRuntime.g, "home_pre_request_off");
        } else {
            String h = f4b.h("closeHomePreLauncherByManufacturer", "vivo,oppo");
            StringBuilder sb = new StringBuilder("manufacturers from homepage = ");
            sb.append(h);
            sb.append(", current manufacturer = ");
            String str = Build.MANUFACTURER;
            sb.append(str);
            TLog.loge(erj.MODULE, c(), sb.toString());
            if (!Arrays.asList(h.split(",")).contains(str.toLowerCase())) {
                return true;
            }
            boolean b = f4b.b("closeHomePreLauncherByUnknown", true);
            TLog.loge(erj.MODULE, c(), "switch value from homepage = " + b);
            return !b;
        }
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        xhq c;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        int i = LauncherRuntime.k;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        hashMap2.put("linkLaunch", Boolean.valueOf(z));
        if (z && (c = ppo.b().c()) != null) {
            hashMap2.put("startupUrl", c.h);
            hashMap2.put("startIntent", c.e.getDataString());
        }
        new k3b().a(application, hashMap2);
    }
}
