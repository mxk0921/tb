package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p4b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809341);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (dvh.o()) {
            dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
        }
        String c = dvh.c(dvh.TASK_INIT_GATEWAY_MGR);
        phg.i("initGatewayMgr");
        m5a.a();
        phg.h("initGatewayMgr");
        dvh.g(c, true);
    }
}
