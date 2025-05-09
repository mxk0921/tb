package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i81 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static loq a(g1r g1rVar, HashMap<String, Object> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (loq) ipChange.ipc$dispatch("52bffe93", new Object[]{g1rVar, hashMap});
        }
        Object obj = hashMap.get("appVersion");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = "1.0.0";
        }
        if (str.split("\\.").length > 3) {
            return new oja(g1rVar);
        }
        return new loq(g1rVar);
    }

    public static g1r b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1r) ipChange.ipc$dispatch("854fb25d", new Object[]{application});
        }
        return new g1r(application.getSharedPreferences(oo1.ORANGE_NAMESPACE, 0).getAll());
    }

    public static void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        a(b(application), hashMap);
        new wka().b(new xok()).b(new oo1()).a(application);
    }
}
