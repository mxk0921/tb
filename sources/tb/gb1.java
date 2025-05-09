package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gb1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 32;
    public static final int BIT64 = 64;
    public static final int UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    public static int f19859a = -1;

    static {
        t2o.a(790626325);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da0a182c", new Object[]{context})).intValue();
        }
        try {
            if (e(context) == 8) {
                return 64;
            }
            return d();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.gb1.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = "a4ccb44b"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L_0x0019:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.util.Set r4 = f(r4)
            java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r0 = r0.length
            r1 = 32
            if (r0 != 0) goto L_0x0029
            return r1
        L_0x0029:
            r0 = 64
            if (r4 == 0) goto L_0x0060
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0034
            goto L_0x0060
        L_0x0034:
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "arm64-v8a"
            boolean r3 = r3.endsWith(r2)
            if (r3 != 0) goto L_0x005e
            java.lang.String r3 = "x86_64"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x005e
            java.lang.String r3 = "mips64"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0038
        L_0x005e:
            return r0
        L_0x005f:
            return r1
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gb1.b(android.content.Context):int");
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9dd34a0", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                return -1;
            }
            String lowerCase = file.getName().toLowerCase();
            if (lowerCase.startsWith("arm64")) {
                return 64;
            }
            if (lowerCase.equals("arm")) {
                return 32;
            }
            return -1;
        } catch (Throwable th) {
            wdm.h("ArchUtils.getCpuArchValueFromNativeLibraryDir.error", th);
            return -1;
        }
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92483c50", new Object[0])).intValue();
        }
        String lowerCase = Build.SUPPORTED_ABIS[0].toLowerCase();
        if (lowerCase.startsWith("arm64") || lowerCase.startsWith("x86_64") || lowerCase.startsWith("mips64")) {
            return 64;
        }
        return (lowerCase.startsWith("armeabi") || lowerCase.startsWith(kgd.ABI_ARM) || lowerCase.startsWith("x86")) ? 32 : -1;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b01ee26c", new Object[]{context})).intValue();
        }
        int i = f19859a;
        if (i != -1) {
            return i;
        }
        int c = c(context.getApplicationInfo().nativeLibraryDir);
        if (c == -1) {
            c = b(context);
        }
        f19859a = c;
        return c;
    }

    public static Set<String> f(ApplicationInfo applicationInfo) {
        Throwable th;
        IOException e;
        ZipFile zipFile;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("17996de6", new Object[]{applicationInfo});
        }
        HashSet hashSet = new HashSet();
        hashSet.add(applicationInfo.sourceDir);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ZipFile zipFile2 = null;
            try {
                try {
                    zipFile = new ZipFile((String) it.next());
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    String name = ((ZipEntry) entries.nextElement()).getName();
                    if (!name.contains("../") && (parentFile = new File(name).getParentFile()) != null && parentFile.getPath().startsWith("lib/")) {
                        hashSet2.add(parentFile.getName());
                    }
                }
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e = e4;
                zipFile2 = zipFile;
                e.printStackTrace();
                if (zipFile2 != null) {
                    zipFile2.close();
                }
            } catch (Throwable th3) {
                th = th3;
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }
        return hashSet2;
    }
}
