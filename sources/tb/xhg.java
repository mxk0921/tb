package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489107);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        vp9.a("linkx", "Launcher_InitHomePageTask === executeHomePageTask");
        if (hashMap.containsKey("currentLocale") && !Locale.CHINESE.getLanguage().equals((String) hashMap.get("currentLocale"))) {
            z = false;
        }
        z2b.c(application, z);
    }
}
