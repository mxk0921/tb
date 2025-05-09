package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.privacyguard.minors.TBPrivacyComplianceBridge;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class thl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(757071876);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            shl.b().d(application, hashMap);
            rhl.d().f(application);
            xpr.u(application);
            fsw.h("TBPrivacyComplianceBridge", TBPrivacyComplianceBridge.class);
        } catch (Throwable th) {
            Log.e("PGInitTask", "init: init occur exception " + th);
            th.printStackTrace();
        }
    }
}
