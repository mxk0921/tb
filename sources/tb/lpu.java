package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lpu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(768606210);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        hi2.b();
        if (t.a(application, "turbotBootBackground")) {
            hi2.c(application, hashMap, "background");
        }
    }
}
