package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yd7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159089);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(application.getFilesDir().getAbsolutePath());
            String str = File.separator;
            sb.append(str);
            sb.append("desktop");
            sb.append(str);
            sb.append("configs");
            if (!new File(sb.toString()).exists()) {
                yv8.a("DesktopTaskTriggerInit.noLocalConfigFile.cancel", new Object[0]);
                return;
            }
            yv8.a("DesktopTaskTriggerInit.start", new Object[0]);
            Object obj = hashMap.get("isDebuggable");
            if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                z = false;
            }
            yv8.d(z);
            oft g = oft.g();
            g.f(application);
            g.m(2, null);
            yv8.a("DesktopTaskTriggerInit.done", new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
