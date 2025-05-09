package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001971);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb35cd2", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{str, new Integer(i)})).intValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Color.parseColor(str);
            } catch (Exception unused) {
                c4p.n("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return i;
    }

    public static Integer c(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("ab353b51", new Object[]{str, num});
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception unused) {
                c4p.n("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return num;
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
                c4p.m("ParseUtil", "error while parsing ".concat(str));
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
                c4p.m("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return i;
    }

    public static Integer f(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("69fd2402", new Object[]{str, num});
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Exception unused) {
                c4p.m("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return num;
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
                c4p.m("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return j;
    }
}
