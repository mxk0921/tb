package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ea1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        x0s x0sVar = new x0s(application);
        m1s.a().b(application);
        ovg.b(x0sVar);
        if (njo.f(application)) {
            new amv(x0sVar).execute();
        }
        if (!tn8.a(application, poq.b(x0sVar, hashMap).defaultValue())) {
            nzi.a().b();
            ea1.d a2 = new ea1(application, njo.j(application)).a();
            if (a2 != null) {
                l1s.c().a("LastCrash", a2.f18401a, a2.b);
            }
        }
    }
}
