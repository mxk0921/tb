package tb;

import android.graphics.RectF;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class trl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296435);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72f8c33e", new Object[]{new Integer(i)});
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    public static float b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b28e69b6", new Object[]{str, new Float(f)})).floatValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                agh.c("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return f;
    }

    public static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                agh.c("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return i;
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66c9f198", new Object[]{str, new Long(j)})).longValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
                agh.c("ParseUtil", "error while parsing ".concat(str));
            }
        }
        return j;
    }

    public static RectF e(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("a4b357c7", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length != 4) {
            return null;
        }
        float f = i;
        float f2 = i2;
        return new RectF(b(split[0], 0.0f) * f, b(split[1], 0.0f) * f2, b(split[2], 0.0f) * f, b(split[3], 0.0f) * f2);
    }

    public static String f(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3285d6ba", new Object[]{rectF});
        }
        if (rectF == null) {
            return "0,0,0,0";
        }
        return rectF.left + "," + rectF.top + "," + rectF.right + "," + rectF.bottom;
    }

    public static RectF g(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("1c679ca0", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length != 4) {
            return null;
        }
        if (i <= 0) {
            i = 1;
        }
        if (i2 <= 0) {
            i2 = 1;
        }
        float f = i;
        float f2 = i2;
        return new RectF(b(split[0], 0.0f) / f, b(split[2], 0.0f) / f2, b(split[1], 0.0f) / f, b(split[3], 0.0f) / f2);
    }

    public static String h(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c8da96f", new Object[]{new Integer(i)});
        }
        int i3 = i / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        int i4 = (i - (i3 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
        String str = a(i4) + ":" + a(i2 - (i4 * 60));
        if (i3 == 0) {
            return str;
        }
        return a(i3) + ":" + str;
    }
}
