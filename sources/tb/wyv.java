package tb;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Random;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wyv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK_CLASS_2_G = "2G";
    public static final String NETWORK_CLASS_3_G = "3G";
    public static final String NETWORK_CLASS_4_G = "4G";
    public static final String NETWORK_CLASS_UNKNOWN = "Unknown";
    public static final String NETWORK_CLASS_WIFI = "Wi-Fi";

    /* renamed from: a  reason: collision with root package name */
    public static Application f31023a;
    public static final Random b = new Random();

    static {
        t2o.a(961544387);
    }

    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86e7d4db", new Object[]{context, str})).intValue();
        }
        if (str != null) {
            try {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            } catch (RuntimeException e) {
                ku0.j("Utils.checkSelfPermission", e);
                return -1;
            }
        } else {
            throw new IllegalArgumentException("permission is null");
        }
    }

    public static synchronized Application b() {
        synchronized (wyv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (f31023a == null) {
                f31023a = f();
            }
            return f31023a;
        }
    }

    public static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4623af24", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    public static String d(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794dbb71", new Object[]{context});
        }
        if (context == null) {
            return "Unknown";
        }
        try {
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0 && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "Wi-Fi";
                }
                if (activeNetworkInfo.getType() == 0) {
                    return c(activeNetworkInfo.getSubtype());
                }
            }
        } catch (Throwable th) {
            ku0.j("Utils.getNetworkType", th);
        }
        return "Unknown";
    }

    public static Uri e(Uri uri, Uri uri2, Uri uri3) {
        String str;
        String str2;
        String str3;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("fc2fd1ac", new Object[]{uri, uri2, uri3});
        }
        try {
            String path = uri.getPath();
            if (TextUtils.equals(path, "/UTABTEST-ANY")) {
                str = uri2.toString().replace("/UTABTEST-ANY", uri3.getPath());
            } else {
                String path2 = uri3.getPath();
                int indexOf = path.indexOf("UTABTEST-ANY");
                if (indexOf > 1) {
                    str2 = path.substring(0, indexOf - 1);
                } else {
                    str2 = null;
                }
                int i = indexOf + 12;
                if (i < path.length()) {
                    str3 = path.substring(i);
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    path2 = path2.replace(str2, "");
                }
                if (!TextUtils.isEmpty(str3) && (lastIndexOf = path2.lastIndexOf(str3)) != -1) {
                    path2 = path2.substring(0, lastIndexOf);
                }
                str = uri2.toString().replace("/UTABTEST-ANY", path2);
            }
            return Uri.parse(str);
        } catch (Throwable th) {
            ku0.j("Utils.getRedirectUrlOperatorAny", th);
            return null;
        }
    }

    public static String g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98875689", new Object[]{uri});
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.startsWith("http")) {
            scheme = "http";
        }
        return scheme + ":" + uri.getAuthority() + ":" + uri.getPath();
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e0580", new Object[]{context})).booleanValue();
        }
        if (context == null || a(context, "android.permission.ACCESS_NETWORK_STATE") == -1) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            ku0.j("Utils.isNetworkConnected", th);
        }
        return false;
    }

    public static String i(Collection collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4402534", new Object[]{collection, str});
        }
        if (collection == null) {
            return null;
        }
        return j(collection.toArray(), str);
    }

    public static String j(Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd8ae536", new Object[]{objArr, str});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0 && str != null) {
                sb.append(str);
            }
            Object obj = objArr[i];
            if (obj != null) {
                sb.append(obj.toString());
            }
        }
        return sb.toString();
    }

    public static int k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d870c76", new Object[]{new Integer(i)})).intValue();
        }
        try {
            return Math.abs(b.nextInt(i));
        } catch (Exception e) {
            ogh.h("Utils", "random fail", e);
            return i;
        }
    }

    public static String[] l(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d5bcc04e", new Object[]{str, str2, new Boolean(z)});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        int countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i = 0; i < countTokens; i++) {
            if (z) {
                strArr[i] = stringTokenizer.nextToken().trim();
            } else {
                strArr[i] = stringTokenizer.nextToken();
            }
        }
        return strArr;
    }

    public static long[] m(String str) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("7a843d57", new Object[]{str});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int countTokens = stringTokenizer.countTokens();
        long[] jArr = new long[countTokens];
        for (int i = 0; i < countTokens; i++) {
            jArr[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        return jArr;
    }

    public static int n(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81d8ac91", new Object[]{str, new Integer(i)})).intValue();
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                ogh.h("Utils", "to int fail", e);
            }
        }
        return i;
    }

    public static long o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfcef2dc", new Object[]{str})).longValue();
        }
        return p(str, 0L);
    }

    public static long p(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a0fe0d0", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            ogh.h("Utils", "to long fail", e);
            return j;
        }
    }

    public static Application f() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            ku0.j("Utils.getSystemApp", e);
            return null;
        }
    }
}
