package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tvn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7136ebcc", new Object[]{map, str, str2});
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    public static float b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf21ff04", new Object[]{str})).floatValue();
        }
        return c(str, -1.0f);
    }

    public static float c(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("251e4b1c", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            if (str.indexOf(".") != str.lastIndexOf(".")) {
                str = str.substring(0, str.lastIndexOf(".")) + str.substring(str.lastIndexOf(".") + 1);
            }
            return Float.valueOf(str).floatValue();
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c190521a", new Object[]{str})).intValue();
        }
        return e(str, -1);
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("707a65af", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
