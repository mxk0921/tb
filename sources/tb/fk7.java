package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class fk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ODEX_SUFFIX = ".odex";
    public static final String VDEX_SUFFIX = ".vdex";

    /* renamed from: a  reason: collision with root package name */
    public static String f19351a = null;

    static {
        t2o.a(989855821);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r6.equals("x86_64") == false) goto L_0x0041;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "mips"
            java.lang.String r1 = "x86"
            java.lang.String r2 = "x86_64"
            java.lang.String r3 = "mips64"
            r4 = 1
            r5 = 0
            java.lang.String r6 = tb.fk7.f19351a
            if (r6 == 0) goto L_0x0013
            return r6
        L_0x0013:
            java.lang.String r6 = "dalvik.system.VMRuntime"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: all -> 0x0033
            java.lang.String r7 = "getCurrentInstructionSet"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: all -> 0x0033
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch: all -> 0x0033
            r6.setAccessible(r4)     // Catch: all -> 0x0033
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: all -> 0x0033
            r8 = 0
            java.lang.Object r6 = r6.invoke(r8, r7)     // Catch: all -> 0x0033
            java.lang.String r6 = (java.lang.String) r6     // Catch: all -> 0x0033
            tb.fk7.f19351a = r6     // Catch: all -> 0x0033
            goto L_0x00b6
        L_0x0033:
            java.lang.String r6 = android.os.Build.CPU_ABI
            r6.hashCode()
            r7 = -1
            int r8 = r6.hashCode()
            switch(r8) {
                case -1073971299: goto L_0x007d;
                case -806050265: goto L_0x0076;
                case -738963905: goto L_0x006b;
                case 117110: goto L_0x0062;
                case 3351711: goto L_0x0059;
                case 145444210: goto L_0x004e;
                case 1431565292: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r4 = -1
            goto L_0x0085
        L_0x0043:
            java.lang.String r4 = "arm64-v8a"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r4 = 6
            goto L_0x0085
        L_0x004e:
            java.lang.String r4 = "armeabi-v7a"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            r4 = 5
            goto L_0x0085
        L_0x0059:
            boolean r4 = r6.equals(r0)
            if (r4 != 0) goto L_0x0060
            goto L_0x0041
        L_0x0060:
            r4 = 4
            goto L_0x0085
        L_0x0062:
            boolean r4 = r6.equals(r1)
            if (r4 != 0) goto L_0x0069
            goto L_0x0041
        L_0x0069:
            r4 = 3
            goto L_0x0085
        L_0x006b:
            java.lang.String r4 = "armeabi"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0074
            goto L_0x0041
        L_0x0074:
            r4 = 2
            goto L_0x0085
        L_0x0076:
            boolean r5 = r6.equals(r2)
            if (r5 != 0) goto L_0x0085
            goto L_0x0041
        L_0x007d:
            boolean r4 = r6.equals(r3)
            if (r4 != 0) goto L_0x0084
            goto L_0x0041
        L_0x0084:
            r4 = 0
        L_0x0085:
            switch(r4) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00b1;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00a1;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported abi: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DexUtils"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "unknown"
            tb.fk7.f19351a = r0
            goto L_0x00b6
        L_0x00a1:
            java.lang.String r0 = "arm64"
            tb.fk7.f19351a = r0
            goto L_0x00b6
        L_0x00a6:
            tb.fk7.f19351a = r0
            goto L_0x00b6
        L_0x00a9:
            tb.fk7.f19351a = r1
            goto L_0x00b6
        L_0x00ac:
            java.lang.String r0 = "arm"
            tb.fk7.f19351a = r0
            goto L_0x00b6
        L_0x00b1:
            tb.fk7.f19351a = r2
            goto L_0x00b6
        L_0x00b4:
            tb.fk7.f19351a = r3
        L_0x00b6:
            java.lang.String r0 = tb.fk7.f19351a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fk7.a():java.lang.String");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4742e714", new Object[0])).booleanValue();
        }
        String a2 = a();
        return "arm".equals(a2) || "x86".equals(a2) || "mips".equals(a2);
    }

    public static boolean d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4441e2cd", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists() || !file.canRead() || !file.isFile() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97abe437", new Object[]{new Integer(i)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }

    public static File b(File file) {
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("fa43ed4d", new Object[]{file});
        }
        String a2 = a();
        if (a2 == null || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            name = name.substring(0, lastIndexOf);
        }
        File file2 = new File(new File(parentFile, "oat"), a2);
        return new File(file2, name + ODEX_SUFFIX);
    }
}
