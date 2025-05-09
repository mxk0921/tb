package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(297795588);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d7afbce", new Object[]{context});
        }
        if (context instanceof i2e) {
            return ((i2e) context).t1();
        }
        return "";
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb015301", new Object[]{str, str2, map});
        } else if (gcl.b() != null) {
            gcl.b().b(str, str2, map);
        }
    }

    public static void c(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c8e900", new Object[]{context, str, map});
        } else if (gcl.b() != null) {
            String a2 = a(context);
            jkb b = gcl.b();
            b.a(a2, a2 + str, map);
        }
    }

    public static void d(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a51144", new Object[]{str, str2, map});
        } else if (gcl.b() != null) {
            gcl.b().a(str, str2, map);
        }
    }

    public static void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b853f3b", new Object[]{str, obj});
        } else if (gcl.b() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageObject", obj);
            gcl.b().c(str, hashMap);
        }
    }
}
