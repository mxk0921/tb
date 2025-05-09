package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vhn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_CLICK = "click";
    public static final String EVENT_CUSTOM = "custom";
    public static final String EVENT_EXPOSURE = "exposure";
    public static final Map<String, String> sCommonArgs = new HashMap();

    static {
        t2o.a(758120571);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5635dfb", new Object[]{str, map});
            return;
        }
        f(str, map, 2101, "_Button-");
        ehn.d(str, map);
        if (map != null) {
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(sCommonArgs);
            odg.c("Page_Rate_Button-" + str, hashMap.toString());
            return;
        }
        odg.c("Page_Rate_Button-" + str, sCommonArgs.toString());
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55714cf2", new Object[]{str, map});
        } else {
            f(str, map, 19999, "_");
        }
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b73149c", new Object[]{str, map});
        } else {
            f(str, map, 2201, "_Show-");
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb96666", new Object[]{str, str2});
        } else {
            sCommonArgs.put(str, str2);
        }
    }

    public static String[] e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fa1fff1b", new Object[]{map});
        }
        try {
            String v = ryv.v(map, "=", ",");
            if (!TextUtils.isEmpty(v)) {
                return v.split(",");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void f(String str, Map<String, String> map, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf59104", new Object[]{str, map, new Integer(i), str2});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!str.startsWith("Page_Rate")) {
                str = "Page_Rate" + str2 + str;
            }
            pd0.e().a("Page_Rate", i, str, null, null, e(hashMap));
        }
    }
}
