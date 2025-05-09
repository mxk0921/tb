package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.prefork.ViewFactory;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j3b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809331);
    }

    public static /* synthetic */ Object ipc$super(j3b j3bVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomePreCreateViewLauncher");
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
        if (!vxl.b().u()) {
            bqa.d("HomePreCreateViewLauncher", "HomePreCreateViewLauncher do it");
            c(application, hashMap);
            return;
        }
        bqa.d("HomePreCreateViewLauncher", "HomePreCreateViewLauncher empty");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ab53f9", new Object[]{this});
            return;
        }
        this.f33099a.c("HomePreCreateViewLauncher");
        this.f33099a.c("homeLauncher");
        this.f33099a.p("homeFragmentBefore", 1);
    }

    public void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84a0bcf", new Object[]{this, application, hashMap});
            return;
        }
        this.f33099a.p("HomePreCreateViewLauncher", 4);
        super.a(application, hashMap);
        if (TBDeviceUtils.G(application)) {
            b();
            return;
        }
        application.getApplicationContext();
        ViewFactory.f().j();
        uqa.b("LauncherTask", "HomePreCreateViewLauncher", "HomePreCreateViewLauncher.init; 预创建dx视图");
        b();
    }
}
