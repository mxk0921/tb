package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o66 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596703);
    }

    public static boolean a(Number number, Number number2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1ee723d", new Object[]{number, number2})).booleanValue();
        }
        if (number.doubleValue() == number2.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18646908", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.indexOf(".") != -1) {
            return true;
        }
        return false;
    }

    public static boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5bf4fef", new Object[]{obj})).booleanValue();
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (((com.alibaba.fastjson.JSONArray) r4).size() > 0) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (((com.alibaba.fastjson.JSONObject) r4).size() > 0) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (((java.lang.Number) r4).intValue() != 0) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.Object r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.o66.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "7c31f4dc"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            if (r4 != 0) goto L_0x001c
            return r0
        L_0x001c:
            boolean r2 = r4 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x0027
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            goto L_0x005b
        L_0x0027:
            boolean r2 = r4 instanceof java.lang.String
            if (r2 == 0) goto L_0x0032
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = i(r4)
            goto L_0x005b
        L_0x0032:
            boolean r2 = r4 instanceof com.alibaba.fastjson.JSONArray
            if (r2 == 0) goto L_0x0041
            com.alibaba.fastjson.JSONArray r4 = (com.alibaba.fastjson.JSONArray) r4
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            r1 = r0
            goto L_0x005b
        L_0x0041:
            boolean r2 = r4 instanceof com.alibaba.fastjson.JSONObject
            if (r2 == 0) goto L_0x004e
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x003f
            goto L_0x003e
        L_0x004e:
            boolean r2 = r4 instanceof java.lang.Number
            if (r2 == 0) goto L_0x005b
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x003e
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o66.d(java.lang.Object):boolean");
    }

    public static double e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43fb87e3", new Object[]{str})).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d449c0", new Object[]{str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static Number h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("d2939a1d", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (b(str)) {
                return Double.valueOf(e(str));
            }
            return Long.valueOf(g(str));
        } else if (c(obj)) {
            return Double.valueOf(((Number) obj).doubleValue());
        } else {
            if ((obj instanceof Integer) || (obj instanceof Long)) {
                return Long.valueOf(((Number) obj).longValue());
            }
            return null;
        }
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f7d2679", new Object[]{str})).booleanValue();
        }
        if (str == null || str.equals("false") || str.equalsIgnoreCase("0") || str.isEmpty()) {
            return false;
        }
        return true;
    }
}
