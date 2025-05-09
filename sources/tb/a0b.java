package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a0b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809321);
    }

    public static /* synthetic */ Object ipc$super(a0b a0bVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomeGatewayLauncher");
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
        String c = dvh.c(dvh.TASK_INIT_GATEWAY);
        this.f33099a.p("HomeGatewayLauncher", 4);
        phg.e("initGateway");
        super.a(application, hashMap);
        yyj.e().n(application, yyj.l(), false);
        wyh.e(new bgt());
        phg.d("initGateway");
        uqa.b("LauncherTask", "HomeGatewayLauncher", "HomeGatewayLauncher.init;网关2.0初始化");
        this.f33099a.c("HomeGatewayLauncher");
        dvh.g(c, true);
    }
}
