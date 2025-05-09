package android.taobao.windvane.extra.uc;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import tb.dpw;
import tb.h8s;
import tb.lqw;
import tb.t2o;
import tb.v7t;
import tb.x7j;
import tb.xrw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCSoInjectTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UCSoInjectTask";

    static {
        t2o.a(989856089);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (h8s.a(application.getApplicationContext())) {
            TMSLogger.b("TMSEarlyInitializer", "skip UCSoInjectTask");
        } else {
            v7t.d(TAG, "init");
            dpw.a();
            x7j.a();
            lqw.d().c(xrw.getInstance(), lqw.e);
        }
    }
}
