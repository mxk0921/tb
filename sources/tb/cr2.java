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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 7;
    public static final int BIT64 = 8;
    public static final int UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    public static Set<String> f17254a = null;
    public static int b = -1;

    static {
        t2o.a(511705597);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4ccb44b", new Object[]{context})).intValue();
        }
        Set<String> d = d(context.getApplicationInfo());
        if (Build.SUPPORTED_64_BIT_ABIS.length == 0) {
            return 7;
        }
        if (d != null && !d.isEmpty()) {
            for (String str : d) {
                if (!kgd.ABI_ARM64.endsWith(str)) {
                    if (!"x86_64".equals(str)) {
                        if ("mips64".equals(str)) {
                        }
                    }
                }
            }
            return 7;
        }
        return 8;
    }

    public static int b(String str) {
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

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b01ee26c", new Object[]{context})).intValue();
        }
        int i = b;
        if (i != -1) {
            return i;
        }
        int b2 = b(context.getApplicationInfo().nativeLibraryDir);
        if (b2 == -1) {
            b2 = a(context);
        }
        b = b2;
        odg.c("CpuArch", "getCpuArchValue " + b2);
        return b2;
    }

    public static Set<String> d(ApplicationInfo applicationInfo) {
        Throwable th;
        IOException e;
        ZipFile zipFile;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("17996de6", new Object[]{applicationInfo});
        }
        Set<String> set = f17254a;
        if (set != null) {
            return set;
        }
        f17254a = new HashSet();
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
                        f17254a.add(parentFile.getName());
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
        return f17254a;
    }
}
