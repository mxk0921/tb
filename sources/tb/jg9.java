package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = 1048576;

    public static void a(File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13188d46", new Object[]{file, file2});
        } else {
            b(file, file2, true);
        }
    }

    public static void b(File file, File file2, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff9ce4e", new Object[]{file, file2, new Boolean(z)});
        } else if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        } else if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Destination '" + parentFile + "' directory cannot be created");
            } else if (!file2.exists() || file2.canWrite()) {
                g(file, file2, z);
            } else {
                throw new IOException("Destination '" + file2 + "' exists but is read-only");
            }
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void c(InputStream inputStream, File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9238f7", new Object[]{inputStream, file});
            return;
        }
        try {
            FileOutputStream n = n(file);
            y1d.b(inputStream, n);
            if (n != null) {
                n.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea1b3067", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                z &= d(file2);
            }
            if (!file2.delete()) {
                new StringBuilder("Failed to delete ").append(file2);
                z = false;
            }
        }
        return z;
    }

    public static boolean e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4677927d", new Object[]{file})).booleanValue();
        }
        if (d(file)) {
            return file.delete();
        }
        return false;
    }

    public static boolean f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53f33ed8", new Object[]{file})).booleanValue();
        }
        if (file.isFile()) {
            return file.delete();
        }
        return e(file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.io.File r17, java.io.File r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jg9.g(java.io.File, java.io.File, boolean):void");
    }

    public static void h(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65a66c2", new Object[]{file});
        } else if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " exists and is not a directory. Unable to create directory.");
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Unable to create directory " + file);
        }
    }

    public static void i(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157eaa0c", new Object[]{file});
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            h(parentFile);
        }
    }

    public static void j(Collection<File> collection, File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a03ee2", new Object[]{collection, file, new Boolean(z)});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (z) {
                        collection.add(file2);
                    }
                    j(collection, file2, z);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    public static Collection<File> k(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("16e612f3", new Object[]{file, new Boolean(z)});
        }
        LinkedList linkedList = new LinkedList();
        j(linkedList, file, z);
        return linkedList;
    }

    public static void l(File file, List<File> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95af54a4", new Object[]{file, list});
        } else if (file == null) {
            RSoLog.g("collectDirectChild(), dir == null");
        } else if (!file.isDirectory()) {
            RSoLog.g("collectDirectChild(), !dir.isDirectory(), path=" + file.getPath());
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length < 1) {
                RSoLog.g("collectDirectChild(), children == null || children.length < 1, path=" + file.getPath());
                return;
            }
            for (File file2 : listFiles) {
                if (file2 == null || !file2.exists()) {
                    RSoLog.g("file == null in dir=" + file.getPath());
                } else {
                    list.add(file2);
                }
            }
        }
    }

    public static FileInputStream m(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileInputStream) ipChange.ipc$dispatch("222f709d", new Object[]{file});
        }
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            throw new IOException("File '" + file + "' cannot be read");
        }
    }

    public static FileOutputStream n(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileOutputStream) ipChange.ipc$dispatch("adc10603", new Object[]{file});
        }
        return o(file, false);
    }

    public static FileOutputStream o(File file, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileOutputStream) ipChange.ipc$dispatch("6ee444e1", new Object[]{file, new Boolean(z)});
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file, z);
    }

    public static byte[] p(File file) throws IOException {
        Throwable th;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d98c81fb", new Object[]{file});
        }
        try {
            fileInputStream = m(file);
            try {
                byte[] g = y1d.g(fileInputStream, file.length());
                y1d.a(fileInputStream);
                return g;
            } catch (Throwable th2) {
                th = th2;
                y1d.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static void q(File file, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488be80f", new Object[]{file, str});
        } else {
            r(file, str, Charset.defaultCharset(), false);
        }
    }

    public static void r(File file, String str, Charset charset, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2074d7", new Object[]{file, str, charset, new Boolean(z)});
            return;
        }
        FileOutputStream o = o(file, z);
        try {
            y1d.h(str, o, charset);
            if (o != null) {
                o.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (o != null) {
                    try {
                        o.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
