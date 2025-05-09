package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b9f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(634388483);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (application == null) {
            w6n.a("qualityInitializer", "quality init failed");
        } else {
            w6n.a("qualityInitializer", "quality start init");
            uur.a().b(application);
            uur.a().c();
        }
    }
}
