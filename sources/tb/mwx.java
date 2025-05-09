package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24358a;

        static {
            int[] iArr = new int[AuthStatus.values().length];
            f24358a = iArr;
            try {
                iArr[AuthStatus.SHOULD_SHOW_RATIONALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24358a[AuthStatus.FIRST_TIME_OR_NEVER_AGAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24358a[AuthStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24358a[AuthStatus.GRANTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int a(AuthStatus authStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17ed6d9b", new Object[]{authStatus})).intValue();
        }
        int i = a.f24358a[authStatus.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return -1;
        }
        if (i != 4) {
            return -3;
        }
        return 1;
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return TextUtils.isEmpty(str) ? i : Integer.parseInt(str);
        } catch (Exception e) {
            g01.d("CommonUtils", "strToInt error", e);
            return i;
        }
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }

    public static String d(Context context) {
        PackageManager packageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        PackageInfo packageInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Exception e) {
            g01.d("CommonUtils", "getAppVersion error", e);
        }
        if (packageManager == null) {
            return null;
        }
        packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return "";
    }

    public static String e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable th) {
            g01.d("CommonUtils", "toJSON error:", th);
            return "";
        }
    }

    public static <T> List<T> f(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f26a7d9c", new Object[]{str, cls});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseArray(str, cls);
        } catch (Throwable th) {
            g01.d("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    public static JSONObject h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable th) {
            g01.d("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    public static <T> T i(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("47724a48", new Object[]{str, cls});
        }
        if (str == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Throwable th) {
            g01.d("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String j(android.content.Context r4) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.mwx.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "31400281"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r2, r3)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r1 = 0
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: Exception -> 0x0028
            if (r2 != 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r4 = r4.getPackageName()     // Catch: Exception -> 0x0026
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r4, r0)     // Catch: Exception -> 0x0026
            goto L_0x0031
        L_0x0026:
            r4 = move-exception
            goto L_0x002a
        L_0x0028:
            r4 = move-exception
            r2 = r1
        L_0x002a:
            java.lang.String r0 = "CommonUtils"
            java.lang.String r3 = "getApplicationName error"
            tb.g01.d(r0, r3, r4)
        L_0x0031:
            if (r1 == 0) goto L_0x003a
            java.lang.CharSequence r4 = r2.getApplicationLabel(r1)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x003c
        L_0x003a:
            java.lang.String r4 = ""
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mwx.j(android.content.Context):java.lang.String");
    }

    public static Map<String, Object> k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("567fb0fa", new Object[]{obj});
        }
        try {
            if (obj instanceof String) {
                return (Map) JSON.parseObject((String) obj, Map.class);
            }
            return (Map) JSON.toJSON(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("18b2c50a", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseArray(str);
        } catch (Throwable th) {
            g01.d("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    public static String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        int identifier = context.getResources().getIdentifier("ttid", "string", context.getPackageName());
        if (identifier > 0) {
            return context.getString(identifier);
        }
        return "";
    }

    public static boolean n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        String utdid = UTDevice.getUtdid(context);
        if (str == null) {
            return false;
        }
        return g(utdid, Long.parseLong("1000"), str);
    }

    public static boolean g(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa210a20", new Object[]{str, new Long(j), str2})).booleanValue();
        }
        try {
            long parseLong = Long.parseLong(str2);
            long c = c(str) % j;
            StringBuilder sb = new StringBuilder("grayCompute result: ");
            int i = (c > parseLong ? 1 : (c == parseLong ? 0 : -1));
            sb.append(i < 0);
            g01.a("CommonUtils", sb.toString());
            return i < 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
