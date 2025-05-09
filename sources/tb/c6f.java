package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c6f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256366);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        hgh.d(" InitTBWidget-reqWidgetDataBackground");
        dcx.I(application).S(hashMap);
        ekz.d(application).n(hashMap);
    }
}
