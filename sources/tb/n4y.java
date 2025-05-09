package tb;

import com.alibaba.jsi.standard.JNIBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class n4y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f24512a = null;
    public static String b = null;
    public static String c = null;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f = false;
    public static String g = null;
    public static String h = null;
    public static String i = null;
    public static String j = null;

    static {
        t2o.a(921698323);
    }

    public static String a(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        return sb.toString();
                    }
                    sb.append(new String(bArr, 0, read));
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    c(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static Field b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("c522740b", new Object[]{obj, str});
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void c(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static synchronized void d(Object obj) {
        synchronized (n4y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{obj});
            } else if (h == null) {
                h = a0y.b(obj);
                i = h + "/app_jsi";
                j = i + "/shared";
                g = a0y.j(obj);
                c = i + "/sopaths";
                File file = new File(i);
                if (file.isFile()) {
                    file.delete();
                }
                if (!file.exists() && !file.mkdirs()) {
                    a0y.o("Make JSI data dir failed: " + i);
                }
            }
        }
    }

    public static void e(String str) {
        Field b2;
        Object obj;
        if (a0y.p()) {
            try {
                Object l = l(a0y.class.getClassLoader());
                if (!(l == null || (b2 = b(l, "nativeLibraryDirectories")) == null || (obj = b2.get(l)) == null)) {
                    File file = new File(str);
                    if (file.isFile()) {
                        file = file.getParentFile();
                    }
                    File[] fileArr = (File[]) obj;
                    ArrayList arrayList = new ArrayList(fileArr.length + 1);
                    arrayList.add(file);
                    boolean z = false;
                    for (File file2 : fileArr) {
                        if (file2.getPath().contains(a2n.ARCH_BIT64)) {
                            z = true;
                        }
                        if (!file.getPath().equals(file2.getPath())) {
                            arrayList.add(file2);
                        }
                    }
                    if (z) {
                        b2.set(l, arrayList.toArray(new File[0]));
                        a0y.g("Add native library dir succeed: " + file.getPath());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void f(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else if (th != null) {
            th.printStackTrace(new PrintStream(new t5y()));
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean h(File file, String str) {
        Throwable th;
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{file, str})).booleanValue();
        }
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileWriter.write(str, 0, str.length());
            c(fileWriter);
            return true;
        } catch (Throwable th3) {
            th = th3;
            fileWriter2 = fileWriter;
            try {
                th.printStackTrace();
                c(fileWriter2);
                return false;
            } catch (Throwable th4) {
                c(fileWriter2);
                throw th4;
            }
        }
    }

    public static boolean k(boolean z) {
        String a2;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        File file = new File(c);
        if (!file.isFile() || (a2 = a(file)) == null) {
            return false;
        }
        String[] split = a2.trim().split("`");
        if (split.length != 3) {
            return false;
        }
        try {
            j2 = Long.parseLong(split[2]);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            j2 = 0;
        }
        if (j2 == 0) {
            return false;
        }
        File file2 = new File(split[0]);
        if (!file2.isFile() || !file2.getName().equals("libjsi.so") || file2.length() != j2) {
            return false;
        }
        f24512a = split[0];
        if (new File(split[1]).isFile()) {
            b = split[1];
            d = false;
        }
        if (!z || b != null) {
            return true;
        }
        return false;
    }

    public static Object l(Object obj) {
        try {
            Field b2 = b(obj, "pathList");
            if (b2 != null) {
                return b2.get(obj);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean m(File file, boolean z) {
        File[] listFiles;
        File[] listFiles2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("affee538", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        File[] listFiles3 = file.listFiles();
        if (listFiles3 == null) {
            return false;
        }
        for (File file2 : listFiles3) {
            if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                for (File file3 : listFiles) {
                    if (file3.isDirectory() && (listFiles2 = file3.listFiles()) != null) {
                        for (File file4 : listFiles2) {
                            File file5 = new File(file4, "lib");
                            if (n(file5, z)) {
                                return true;
                            }
                            File[] listFiles4 = file5.listFiles();
                            if (listFiles4 != null) {
                                for (File file6 : listFiles4) {
                                    if (n(file6, z)) {
                                        return true;
                                    }
                                }
                                continue;
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public static boolean n(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a0bb97", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        if (!file.isDirectory()) {
            return false;
        }
        File file2 = new File(file, "libjsi.so");
        if (file2.isFile()) {
            f24512a = file2.getPath();
        }
        File file3 = new File(file, "libwebviewuc.so");
        if (file3.isFile()) {
            b = file3.getPath();
        }
        if (f24512a == null || (z && b == null)) {
            return false;
        }
        return true;
    }

    public static boolean g(int i2) {
        String engineType;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i2)})).booleanValue();
        }
        if (!e) {
            return false;
        }
        if ((i2 != 1 || f) && (engineType = hqf.getEngineType()) != null) {
            for (String str : engineType.split(",")) {
                if (Constants.CodeCache.SAVE_PATH.equals(str)) {
                    if ((i2 == 1 || i2 == 0) && f) {
                        return true;
                    }
                } else if ("jsc".equals(str)) {
                    if (i2 == 2 || i2 == 0) {
                        return true;
                    }
                } else if ("qjs".equals(str) && (i2 == 3 || i2 == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(File file, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85d0ed9", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        File file2 = new File(file, "uc");
        if (!file2.isDirectory() || (listFiles = file2.listFiles()) == null) {
            return false;
        }
        for (File file3 : listFiles) {
            if (file3.isDirectory() && n(new File(file3, "so/lib"), z)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (e && f) {
            return true;
        }
        boolean z = str3 == null || str3.isEmpty() || Constants.CodeCache.SAVE_PATH.equals(str3);
        if (f24512a == null && str != null && new File(str).isFile()) {
            f24512a = str;
        }
        if (b == null && str2 != null && new File(str2).isFile()) {
            b = str2;
        }
        if (f24512a != null && (!z || b != null)) {
            d = false;
        } else if (!k(z)) {
            if (f24512a == null) {
                File file = new File(g, "libjsi.so");
                if (file.isFile()) {
                    f24512a = file.getPath();
                }
            }
            if (b == null) {
                File file2 = new File(g, "libwebviewuc.so");
                if (file2.isFile()) {
                    b = file2.getPath();
                }
            }
            if (f24512a == null || (z && b == null)) {
                File file3 = new File(h, "app_h5container");
                if (!file3.isDirectory() || !i(file3, z)) {
                    File file4 = new File(h, "app_ucmsdk");
                    if (file4.isDirectory()) {
                        m(file4, z);
                    }
                }
            }
        }
        String str5 = f24512a;
        if (str5 != null) {
            if (!e) {
                System.load(str5);
                e = true;
                e(f24512a);
            }
            String engineType = hqf.getEngineType();
            boolean z2 = z && engineType != null && engineType.contains(Constants.CodeCache.SAVE_PATH);
            String str6 = b;
            if (str6 != null || !z2) {
                if (z2 && !f) {
                    long nativeCommand = JNIBridge.nativeCommand(1L, 0L, new Object[]{str6});
                    if (nativeCommand == 0) {
                        f = true;
                    } else if (nativeCommand != 1) {
                        StringBuilder sb = new StringBuilder("Load JS engine '");
                        sb.append(b);
                        sb.append("' failed, code: ");
                        sb.append(nativeCommand);
                        sb.append(", message: ");
                        Object[] objArr = new Object[1];
                        if (JNIBridge.nativeCommand(4L, 1L, objArr) == 1) {
                            Object obj = objArr[0];
                            if (obj instanceof String) {
                                str4 = (String) obj;
                                sb.append(str4);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        str4 = null;
                        sb.append(str4);
                        throw new RuntimeException(sb.toString());
                    } else {
                        a0y.g("UC linker is disabled, loaded JS engine so by default.");
                    }
                }
                if (d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f24512a);
                    sb2.append("`");
                    sb2.append(b);
                    sb2.append("`");
                    sb2.append(String.valueOf(new File(f24512a).length()));
                    File file5 = new File(c + ".tmp");
                    h(file5, sb2.toString());
                    File file6 = new File(c);
                    try {
                        file6.delete();
                        file5.renameTo(file6);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            }
            throw new RuntimeException("Can not locate JS engine so: libwebviewuc.so");
        }
        throw new RuntimeException("Can not locate jsi so: libjsi.so");
    }
}
