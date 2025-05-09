package tb;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.SystemClock;
import android.system.OsConstants;
import android.util.SparseLongArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a2n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARCH_BIT32 = "32";
    public static final String ARCH_BIT64 = "64";
    public static final long FATIGUE_DURATION = 30000;
    public static final String UNKNOWN = "unknown";

    /* renamed from: a  reason: collision with root package name */
    public static final long f15511a;
    public static final SparseLongArray warningGeneratedUptimeArray;

    public static boolean a(eyl eylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e8a93d7", new Object[]{eylVar})).booleanValue();
        }
        if (eylVar == null) {
            return false;
        }
        SparseLongArray sparseLongArray = warningGeneratedUptimeArray;
        long j = sparseLongArray.get(eylVar.b);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - j <= 30000) {
            return true;
        }
        sparseLongArray.put(eylVar.b, uptimeMillis);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable, java.io.FileReader, java.io.Reader] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "unknown"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.a2n.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "10070691"
            java.lang.Object r0 = r1.ipc$dispatch(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0015:
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: all -> 0x0066, IOException -> 0x0069
            java.lang.String r3 = "/proc/meminfo"
            r2.<init>(r3)     // Catch: all -> 0x0066, IOException -> 0x0069
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: all -> 0x005e, IOException -> 0x0061
            r3.<init>(r2)     // Catch: all -> 0x005e, IOException -> 0x0061
            java.lang.String r1 = r3.readLine()     // Catch: all -> 0x0059, IOException -> 0x005c
            if (r1 != 0) goto L_0x002f
            tb.alf.a(r2)
            tb.alf.a(r3)
            return r0
        L_0x002f:
            java.lang.String r4 = "\\s+"
            java.lang.String[] r1 = r1.split(r4)     // Catch: all -> 0x0059, IOException -> 0x005c
            int r4 = r1.length     // Catch: all -> 0x0059, IOException -> 0x005c
            r5 = 3
            if (r4 == r5) goto L_0x0040
            tb.alf.a(r2)
            tb.alf.a(r3)
            return r0
        L_0x0040:
            r4 = 1
            r1 = r1[r4]     // Catch: all -> 0x0059, IOException -> 0x005c
            double r4 = java.lang.Double.parseDouble(r1)     // Catch: all -> 0x0059, IOException -> 0x005c
            r6 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)     // Catch: all -> 0x0059, IOException -> 0x005c
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: all -> 0x0059, IOException -> 0x005c
            tb.alf.a(r2)
            tb.alf.a(r3)
            return r0
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            r1 = r2
            goto L_0x0081
        L_0x005c:
            r1 = move-exception
            goto L_0x006d
        L_0x005e:
            r0 = move-exception
            r3 = r1
            goto L_0x005a
        L_0x0061:
            r3 = move-exception
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x006d
        L_0x0066:
            r0 = move-exception
            r3 = r1
            goto L_0x0081
        L_0x0069:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L_0x006d:
            java.lang.String r4 = "ProviderUtils"
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x0059
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: all -> 0x0059
            tb.s9n.a(r4, r1)     // Catch: all -> 0x0059
            tb.alf.a(r2)
            tb.alf.a(r3)
            return r0
        L_0x0081:
            tb.alf.a(r1)
            tb.alf.a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a2n.b():java.lang.String");
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711a305", new Object[]{context});
        }
        if (context == null) {
            return "unknown";
        }
        return String.valueOf(new StatFs(context.getCacheDir().getParentFile().getAbsolutePath()).getTotalBytes() / 1000000000);
    }

    public static long d(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("772451e8", new Object[]{str, str2, new Long(j)})).longValue();
        }
        return j;
    }

    static {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Field declaredField = cls.getDeclaredField("os");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Method method = cls2.getMethod("sysconf", Integer.TYPE);
                method.setAccessible(true);
                Object invoke = method.invoke(obj, Integer.valueOf(OsConstants._SC_CLK_TCK));
                if (invoke instanceof Long) {
                    f15511a = ((Long) invoke).longValue();
                }
            }
        } catch (Exception e) {
            s9n.a("ProviderUtils", "get sJiffyHz failed", e.toString());
        }
        warningGeneratedUptimeArray = new SparseLongArray();
    }
}
