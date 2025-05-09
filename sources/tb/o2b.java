package tb;

import android.app.Application;
import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o2b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809329);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String c = dvh.c(dvh.TASK_TOP_MULTI_TAB_MANAGER);
        phg.e("TopMultiTabManager");
        Log.e("HomePageFrame", "launcher init start");
        p7p.m(application);
        try {
            c4b.i().k();
        } catch (Throwable th) {
            Log.e("HomePageFrame", "HomeServiceCenter init error ", th);
            bqa.b("HomePageFrame", "HomeServiceCenter init error ", th);
            ddv.a("HomePageFrame", th);
        }
        phg.d("TopMultiTabManager");
        Log.e("HomePageFrame", "launcher init finish");
        uqa.b("LauncherTask", "HomePageFrame", "HomePageFrame init:" + (SystemClock.uptimeMillis() - uptimeMillis));
        dvh.g(c, true);
    }
}
