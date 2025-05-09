package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zms {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> switchCache = new ConcurrentHashMap();

    static {
        t2o.a(329253030);
    }

    public static List<String> a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("35e2cb11", new Object[]{str});
        }
        Map<String, String> map = switchCache;
        if (map.containsKey(str)) {
            str2 = map.get(str);
        } else {
            str2 = wms.b("tschedule", str, null);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                return JSON.parseArray(str2, String.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7b2213", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        Map<String, String> map = switchCache;
        if (map.containsKey(str)) {
            return "true".equalsIgnoreCase(map.get(str));
        }
        String b = wms.b("tschedule", str, String.valueOf(z));
        map.put(str, b);
        return "true".equalsIgnoreCase(b);
    }

    public static double c(String str, double d) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dcb64b2", new Object[]{str, new Double(d)})).doubleValue();
        }
        Map<String, String> map = switchCache;
        if (map.containsKey(str)) {
            str2 = map.get(str);
        } else {
            str2 = wms.b("tschedule", str, String.valueOf(d));
            map.put(str, str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Double.parseDouble(map.get(str));
            } catch (Throwable unused) {
            }
        }
        return d;
    }

    public static long d(String str, long j) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd78ae8c", new Object[]{str, new Long(j)})).longValue();
        }
        Map<String, String> map = switchCache;
        if (map.containsKey(str)) {
            str2 = map.get(str);
        } else {
            str2 = wms.b("tschedule", str, String.valueOf(j));
            map.put(str, str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Long.parseLong(map.get(str));
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31d4edc", new Object[]{str, str2});
        }
        Map<String, String> map = switchCache;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        String b = wms.b("tschedule", str, str2);
        map.put(str, b);
        return b;
    }

    public static List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4bd22c6c", new Object[0]);
        }
        return a(wms.CONFIG_KEY_TRIGGER_CUSTOM_WHITE_LIST);
    }

    public static List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18491ecf", new Object[0]);
        }
        return a(wms.CONFIG_KEY_TRIGGER_IDLE_WHITE_LIST);
    }

    public static List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("75f47f84", new Object[0]);
        }
        return a(wms.CONFIG_KEY_TRIGGER_NAV_BLACK_LIST);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb111d5", new Object[0])).booleanValue();
        }
        return b(wms.TS_RENDER_BY_EDITION, false);
    }

    public static void m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839d1d2d", new Object[]{map});
            return;
        }
        zdh.a("TS.Switch", "resetOrangeConfig");
        wms.d("tschedule", map);
        Map<String, String> map2 = switchCache;
        map2.clear();
        map2.putAll(map);
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("333c1bb3", new Object[]{context})).booleanValue();
        }
        return b(wms.TS_PREDICT_ENABLE, false);
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3272091", new Object[]{context})).booleanValue();
        }
        return b(wms.TS_RENDER_HIT_ENABLE, false);
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953cd1a1", new Object[]{context})).booleanValue();
        }
        return b("tsEnable", false);
    }
}
