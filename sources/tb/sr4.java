package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sr4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093347);
    }

    public static int b(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cabe637b", new Object[]{obj, new Integer(i)})).intValue();
        }
        try {
            return c(obj);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int c(Object obj) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("974020af", new Object[]{obj})).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        throw new IllegalArgumentException("" + obj + " is invalid Integer");
    }

    public static Map d(Object obj, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4978fb51", new Object[]{obj, map});
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof String) {
            try {
                return JSON.parseObject((String) obj);
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static String e(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cf3bb6c", new Object[]{obj, str});
        }
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    public static boolean a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40eb4e63", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.equalsIgnoreCase("true")) {
                return true;
            }
            if (str.equalsIgnoreCase("false")) {
                return false;
            }
            try {
                return Float.parseFloat((String) obj) > 0.0f;
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return ((Number) obj).floatValue() > 0.0f;
        } else {
            if (obj instanceof List) {
                return ((List) obj).size() > 0;
            }
            if (obj instanceof Map) {
                return ((Map) obj).size() > 0;
            }
        }
        return z;
    }
}
