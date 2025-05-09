package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("feecc11f", new Object[]{obj, str});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    public static boolean b(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d5900", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj == null) {
            return z;
        }
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                return Boolean.parseBoolean((String) obj);
            }
            String obj2 = obj.toString();
            if (TextUtils.isEmpty(obj2)) {
                return z;
            }
            return Boolean.parseBoolean(obj2);
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    public static float c(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe865e4", new Object[]{obj, new Float(f)})).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        try {
            String a2 = a(obj, null);
            if (!TextUtils.isEmpty(a2)) {
                return Float.parseFloat(a2);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return f;
    }

    public static int d(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be0f5ef7", new Object[]{obj, new Integer(i)})).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj == null) {
            return i;
        }
        return e(obj.toString(), i);
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static long f(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("423edc6", new Object[]{obj, new Long(j)})).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        try {
            String a2 = a(obj, null);
            if (!TextUtils.isEmpty(a2)) {
                return Long.parseLong(a2);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return j;
    }
}
