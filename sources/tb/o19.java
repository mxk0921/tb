package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(408944643);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        f1r f1rVar = new f1r(ob9.a().b(new File(application.getFilesDir(), "fastsp.db")));
        y9l.a(application).b();
        mzi.a(application).b(f1rVar);
        uhh.b("FastSpIdleLauncher", "init");
    }
}
