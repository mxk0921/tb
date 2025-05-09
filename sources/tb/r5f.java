package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r5f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797293);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            int a2 = pjp.a();
            if (a2 == 1) {
                fwr.d("新分享初始化 toggle=" + a2);
                ov3 ov3Var = new ov3();
                ov3Var.j(application.getApplicationContext(), LauncherRuntime.d);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                }
                hashMap.put("initShareMode", "null");
                hashMap.put("optReflow", "true");
                ov3Var.k(hashMap);
                PanguApplication panguApplication = (PanguApplication) application;
                panguApplication.registerCrossActivityLifecycleCallback(ov3Var);
                panguApplication.registerActivityLifecycleCallbacks(ov3Var);
            }
        } catch (Throwable unused) {
        }
    }
}
