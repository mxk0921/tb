package android.taobao.windvane.packageapp.adaptive;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import tb.apx;
import tb.bpx;
import tb.gpx;
import tb.h8s;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitZCacheTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856357);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (h8s.a(application.getApplicationContext())) {
            TMSLogger.b("TMSEarlyInitializer", "skip InitZCacheTask");
        } else {
            bpx.a().b(new apx());
            gpx.d().g();
            v7t.i("ZCache", "zcache 3.0 startQueue");
        }
    }
}
