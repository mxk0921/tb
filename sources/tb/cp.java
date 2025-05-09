package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashSet;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;
    public static String e;
    public static Boolean f;
    public static Boolean g;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f17214a = null;
    public static Boolean b = null;
    public static Boolean d = null;

    static {
        t2o.a(398458884);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eafcf261", new Object[0]);
        }
        if (TextUtils.isEmpty(c)) {
            try {
                Context a2 = o41.a();
                c = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionName;
            } catch (Exception e2) {
                l2u.instance.d("AUtil", "getAppVersionName err", e2, new Object[0]);
            }
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cp.b(android.content.Context):java.lang.String");
    }

    public static String c(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("230a88e9", new Object[]{stackTraceElementArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > 0) {
                    for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                        stringBuffer.append(stackTraceElement.toString());
                        stringBuffer.append("\n");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return stringBuffer.toString();
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d915192f", new Object[]{context})).booleanValue();
        }
        if (g == null) {
            g = Boolean.valueOf(b(context).endsWith(":channel"));
        }
        return g.booleanValue();
    }

    public static boolean f() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        Boolean bool = f17214a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((o41.a().getApplicationInfo().flags & 2) == 0 || j()) {
                z = false;
            } else {
                z = true;
            }
            f17214a = Boolean.valueOf(z);
            l2u l2uVar = l2u.instance;
            l2uVar.e("AUtil", "debug = " + f17214a, new Object[0]);
            return f17214a.booleanValue();
        } catch (Throwable th) {
            l2u.instance.d("AUtil", "enable debug err", th, new Object[0]);
            return false;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9bbe86", new Object[0])).booleanValue();
        }
        if (d == null) {
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(o41.a().getFilesDir().getAbsolutePath());
                    String str = File.separator;
                    sb.append(str);
                    sb.append("..");
                    sb.append(str);
                    sb.append("..");
                    d = Boolean.valueOf(new File(sb.toString()).canRead());
                    l2u l2uVar = l2u.instance;
                    l2uVar.e("AUtil", "isDualApp: " + d, new Object[0]);
                } catch (Throwable th) {
                    l2u l2uVar2 = l2u.instance;
                    l2uVar2.e("AUtil", "isDualApp: " + d, new Object[0]);
                    throw th;
                }
            } catch (Throwable unused) {
                d = Boolean.FALSE;
                l2u l2uVar3 = l2u.instance;
                l2uVar3.e("AUtil", "isDualApp: " + d, new Object[0]);
            }
        }
        return d.booleanValue();
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (f == null) {
            f = Boolean.valueOf(b(context).equals(context.getPackageName()));
        }
        return f.booleanValue();
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac8937ef", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2) && a2.split("\\.").length <= 3) {
            z = true;
        }
        b = Boolean.valueOf(z);
        return z;
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e106651a", new Object[]{context})).booleanValue();
        }
        String packageName = context.getPackageName();
        boolean[] i = i(context, packageName, context.getPackageName() + ":channel");
        if (i == null || i.length != 2) {
            return false;
        }
        return i[1] ^ i[0];
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c25d4e5", new Object[0])).booleanValue();
        }
        try {
            String packageName = o41.a().getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) o41.a().getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.startsWith(packageName)) {
                    l2u.instance.e("AUtil", "appForeGround", "process", runningAppProcessInfo.processName);
                    return true;
                }
            }
        } catch (Exception e2) {
            l2u.instance.d("AUtil", "isAppForeGround error ", e2, new Object[0]);
        }
        return false;
    }

    public static boolean[] i(Context context, String... strArr) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("a745656f", new Object[]{context, strArr});
        }
        if (strArr != null) {
            try {
                if (!(strArr.length == 0 || (runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
                    HashSet hashSet = new HashSet();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        hashSet.add(runningAppProcessInfo.processName);
                    }
                    int length = strArr.length;
                    boolean[] zArr = new boolean[length];
                    for (int i = 0; i < length; i++) {
                        zArr[i] = hashSet.contains(strArr[i]);
                    }
                    return zArr;
                }
                return null;
            } catch (Throwable th) {
                l2u.instance.d("AUtil", "isProcessArrAlive err", th, new Object[0]);
            }
        }
        return null;
    }
}
