package tb;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class br2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 1;
    public static final int BIT64 = 2;
    public static final int UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f16561a = null;
    public static final Object b = new Object();

    static {
        t2o.a(615514140);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.br2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "ac6ed9d4"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L_0x0019:
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r4 = r4.getPackageResourcePath()
            java.io.File r2 = new java.io.File
            r2.<init>(r4)
            boolean r4 = r2.isFile()
            if (r4 == 0) goto L_0x007a
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x007a
            boolean r4 = r2.canRead()
            if (r4 == 0) goto L_0x007a
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: Exception -> 0x0070
            r4.<init>(r2)     // Catch: Exception -> 0x0070
            java.lang.String r2 = "lib/armeabi-v7a/libc++_shared.so"
            java.util.zip.ZipEntry r2 = r4.getEntry(r2)     // Catch: all -> 0x005f
            if (r2 == 0) goto L_0x0048
            r2 = 1
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            java.lang.String r3 = "lib/arm64-v8a/libc++_shared.so"
            java.util.zip.ZipEntry r3 = r4.getEntry(r3)     // Catch: all -> 0x005d
            if (r3 == 0) goto L_0x0053
            r0 = 1
        L_0x0053:
            r4.close()     // Catch: Exception -> 0x0059
            r1 = r0
            r0 = r2
            goto L_0x007b
        L_0x0059:
            r4 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x0072
        L_0x005d:
            r1 = move-exception
            goto L_0x0061
        L_0x005f:
            r1 = move-exception
            r2 = 0
        L_0x0061:
            throw r1     // Catch: all -> 0x0062
        L_0x0062:
            r3 = move-exception
            r4.close()     // Catch: all -> 0x0067
            goto L_0x006b
        L_0x0067:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: Exception -> 0x006c
        L_0x006b:
            throw r3     // Catch: Exception -> 0x006c
        L_0x006c:
            r4 = move-exception
            r0 = r2
        L_0x006e:
            r1 = 0
            goto L_0x0072
        L_0x0070:
            r4 = move-exception
            goto L_0x006e
        L_0x0072:
            java.lang.String r2 = "CPUArchUtil"
            java.lang.String r3 = "getApkType"
            tb.idh.c(r2, r3, r4)
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            if (r1 == 0) goto L_0x007f
            r0 = r0 | 2
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.br2.a(android.content.Context):int");
    }

    public static boolean b() {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e09980e5", new Object[0])).booleanValue();
        }
        Boolean bool = f16561a;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (b) {
            try {
                if (f16561a == null) {
                    f16561a = Boolean.valueOf(c());
                }
                booleanValue = f16561a.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean c() {
        Object invoke;
        Object invoke2;
        boolean is64Bit;
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method a2 = aun.a(cls, "is64Bit", new Class[0]);
            Method a3 = aun.a(cls, "getRuntime", new Class[0]);
            if (!(a2 == null || a3 == null || (invoke = a3.invoke(null, new Object[0])) == null || (invoke2 = a2.invoke(invoke, new Object[0])) == null)) {
                return ((Boolean) invoke2).booleanValue();
            }
        } catch (Throwable th) {
            idh.c("CPUArchUtil", "isRunning64BitInternal", th);
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d79c41a4", new Object[0])).booleanValue();
        }
        String lowerCase = Build.SUPPORTED_ABIS[0].toLowerCase();
        return kgd.ABI_ARM64.equals(lowerCase) || "x86_64".equals(lowerCase) || "mips64".equals(lowerCase);
    }
}
