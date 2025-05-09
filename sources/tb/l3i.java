package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705629);
    }

    public static boolean a(Map map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d462be2", new Object[]{map, str, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Boolean.parseBoolean(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    public static float b(Map map, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7e0da6e", new Object[]{map, str, new Float(f)})).floatValue();
        }
        if (!TextUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Float.parseFloat(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    public static int c(Map map, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc2dbf87", new Object[]{map, str, new Integer(i)})).intValue();
        }
        if (!TextUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Integer.parseInt(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    public static long d(Map map, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ec236c2", new Object[]{map, str, new Long(j)})).longValue();
        }
        if (!TextUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Long.parseLong(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static String e(Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa61dcb5", new Object[]{map, str, str2});
        }
        if (!TextUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return String.valueOf(map.get(str));
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    public static void f(Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2297fb0", new Object[]{map, str, str2});
        } else {
            g(map, str, str2, false);
        }
    }

    public static void g(Map map, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83072924", new Object[]{map, str, str2, new Boolean(z)});
        } else if ((!TextUtils.isEmpty(str2) || z) && map != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            map.put(str, str2);
        }
    }
}
