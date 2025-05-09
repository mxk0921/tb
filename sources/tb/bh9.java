package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Closeable... closeableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e368a0db", new Object[]{closeableArr});
        } else if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f65e294", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                return false;
            }
        } else if (!file.mkdirs()) {
            return false;
        }
        return true;
    }

    public static boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9cde359", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!b(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean d(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("637e4e71", new Object[]{file, list, zipFile, zipEntry, str})).booleanValue();
        }
        File file2 = new File(file + File.separator + str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            if (!b(file2)) {
                return false;
            }
        } else if (!c(file2)) {
            return false;
        } else {
            try {
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                } catch (Throwable th2) {
                    bufferedOutputStream = null;
                    th = th2;
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    a(bufferedInputStream, bufferedOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    a(bufferedInputStream, bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                bufferedOutputStream = null;
                th = th4;
                bufferedInputStream = null;
            }
        }
        return true;
    }

    public static List<File> e(File file, File file2) throws Exception {
        Throwable th;
        Exception e;
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("99ee02ee", new Object[]{file, file2});
        }
        ZipFile zipFile2 = null;
        if (file == null || file2 == null || !file.exists()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                String name = zipEntry.getName();
                if (name != null && !name.contains("..") && !d(file2, arrayList, zipFile, zipEntry, name)) {
                    try {
                        a(zipFile);
                    } catch (Exception unused) {
                    }
                    return arrayList;
                }
            }
            try {
                a(zipFile);
            } catch (Exception unused2) {
            }
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            zipFile2 = zipFile;
            e.printStackTrace();
            throw e;
        } catch (Throwable th3) {
            th = th3;
            zipFile2 = zipFile;
            try {
                a(zipFile2);
            } catch (Exception unused3) {
            }
            throw th;
        }
    }
}
