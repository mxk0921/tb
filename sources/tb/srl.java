package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class srl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792580);
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38b9f828", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb35cd2", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Exception unused) {
                b4p.g("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return z;
    }

    public static float d(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b28e69b6", new Object[]{str, new Float(f)})).floatValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                b4p.g("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return f;
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                b4p.g("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return i;
    }

    public static int f(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7da64dd", new Object[]{str, new Integer(i), str2, str3})).intValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                b4p.g(str2, str3 + " --- parsing: " + str);
            }
        }
        return i;
    }

    public static long g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66c9f198", new Object[]{str, new Long(j)})).longValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
                b4p.g("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return j;
    }

    public static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{str, new Integer(i)})).intValue();
        }
        if (!(str == null || str.length() == 0)) {
            if ("transparent".equalsIgnoreCase(str)) {
                return 0;
            }
            try {
                return Color.parseColor(str);
            } catch (Exception unused) {
                b4p.g("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return i;
    }
}
