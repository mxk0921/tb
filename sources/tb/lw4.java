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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 7;
    public static final int BIT64 = 8;
    public static final int UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f23606a = new HashSet();
    public static int b = -1;

    static {
        t2o.a(950009905);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9dd34a0", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return -1;
        }
        String lowerCase = file.getName().toLowerCase();
        if (lowerCase.startsWith("arm64")) {
            return 8;
        }
        if (lowerCase.equals("arm")) {
            return 7;
        }
        return -1;
    }

    public static int getCpuArch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af213e62", new Object[0])).intValue();
        }
        if (getCurrentRuntimeCpuArchValue(kjv.sContext) == 8) {
            return 8;
        }
        return getCurrentCpuArchValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getCpuArchValueFromApk(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.lw4.$ipChange
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
            java.util.Set r4 = getSupportedAbis(r4)
            java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r0 = r0.length
            r1 = 7
            if (r0 != 0) goto L_0x0028
            return r1
        L_0x0028:
            r0 = 8
            if (r4 == 0) goto L_0x005f
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0033
            goto L_0x005f
        L_0x0033:
            java.util.Iterator r4 = r4.iterator()
        L_0x0037:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "arm64-v8a"
            boolean r3 = r3.endsWith(r2)
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = "x86_64"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = "mips64"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0037
        L_0x005d:
            return r0
        L_0x005e:
            return r1
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lw4.getCpuArchValueFromApk(android.content.Context):int");
    }

    public static int getCurrentCpuArchValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92483c50", new Object[0])).intValue();
        }
        String str = Build.SUPPORTED_ABIS[0];
        if (str.toLowerCase().startsWith("arm64") || str.toLowerCase().startsWith("x86_64") || str.toLowerCase().startsWith("mips64")) {
            return 8;
        }
        return (str.toLowerCase().startsWith("armeabi") || str.toLowerCase().startsWith(kgd.ABI_ARM) || str.toLowerCase().startsWith("x86")) ? 7 : -1;
    }

    public static int getCurrentRuntimeCpuArchValue(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b01ee26c", new Object[]{context})).intValue();
        }
        int i = b;
        if (i != -1) {
            return i;
        }
        int a2 = a(context.getApplicationInfo().nativeLibraryDir);
        if (a2 == -1) {
            a2 = getCpuArchValueFromApk(context);
        }
        b = a2;
        return a2;
    }

    public static int getInstalledApkCpuArchValue(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("807af029", new Object[]{context})).intValue();
        }
        Set<String> supportedAbis = getSupportedAbis(context.getApplicationInfo());
        boolean contains = supportedAbis.contains(kgd.ABI_ARM64);
        boolean contains2 = supportedAbis.contains(kgd.ABI_ARM);
        if (contains2 && contains) {
            return -1;
        }
        if (contains) {
            return 8;
        }
        if (contains2) {
            return 7;
        }
        return -1;
    }

    public static synchronized Set<String> getSupportedAbis(ApplicationInfo applicationInfo) {
        Throwable th;
        IOException e;
        ZipFile zipFile;
        File parentFile;
        synchronized (lw4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("17996de6", new Object[]{applicationInfo});
            }
            Set<String> set = f23606a;
            if (set != null && !((HashSet) set).isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(applicationInfo.sourceDir);
            String[] strArr = applicationInfo.splitSourceDirs;
            if (strArr != null) {
                hashSet.addAll(Arrays.asList(strArr));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ZipFile zipFile2 = null;
                try {
                    try {
                        zipFile = new ZipFile((String) it.next());
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        String name = ((ZipEntry) entries.nextElement()).getName();
                        if (!name.contains("../") && (parentFile = new File(name).getParentFile()) != null && parentFile.getPath().startsWith("lib/")) {
                            ((HashSet) f23606a).add(parentFile.getName());
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                    }
                } catch (IOException e4) {
                    e = e4;
                    zipFile2 = zipFile;
                    e.printStackTrace();
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (IOException e5) {
                            e = e5;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zipFile2 = zipFile;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            return f23606a;
        }
    }
}
