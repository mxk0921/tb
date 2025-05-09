package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.support.basics.KVStorage;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.CRC32;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class td9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final hr6<Pair<File, Long>, Pair<File, Boolean>> f28646a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a extends hr6<Pair<File, Long>, Pair<File, Boolean>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/support/basics/FileStorage$1");
        }

        /* JADX WARN: Type inference failed for: r6v7, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // tb.hr6
        public Pair<File, Long> a(File file, Pair<File, Boolean> pair) throws Throwable {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, pair});
            }
            Pair<File, Boolean> pair2 = pair;
            if (!file.isFile() && file.equals(pair2.first)) {
                File file2 = (File) pair2.first;
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            Object obj = pair2.first;
            if (((Boolean) pair2.second).booleanValue()) {
                j = fua.a(file);
            } else {
                j = 0;
            }
            return new Pair<>(obj, Long.valueOf(j));
        }

        /* JADX WARN: Type inference failed for: r5v8, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // tb.hr6
        public Pair<File, Long> c(String str, Pair<File, Boolean> pair) throws Throwable {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, pair});
            }
            Pair<File, Boolean> pair2 = pair;
            FileOutputStream fileOutputStream = new FileOutputStream((File) pair2.first);
            try {
                fileOutputStream.write(ConnectionUtils.a(str));
                fileOutputStream.close();
                Object obj = pair2.first;
                if (((Boolean) pair2.second).booleanValue()) {
                    j = fua.b(str);
                } else {
                    j = 0;
                }
                return new Pair<>(obj, Long.valueOf(j));
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // tb.hr6
        public Pair<File, Long> d(String str, Pair<File, Boolean> pair, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, pair, th});
            }
            pgh.m(th, "write data object failed");
            return null;
        }

        /* JADX WARN: Type inference failed for: r6v8, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // tb.hr6
        public Pair<File, Long> e(byte[] bArr, Pair<File, Boolean> pair) throws Throwable {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, pair});
            }
            Pair<File, Boolean> pair2 = pair;
            FileOutputStream fileOutputStream = new FileOutputStream((File) pair2.first);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                Object obj = pair2.first;
                if (((Boolean) pair2.second).booleanValue()) {
                    byte[][] bArr2 = {bArr};
                    CRC32 crc32 = new CRC32();
                    byte[] bArr3 = bArr2[0];
                    if (bArr3 != null) {
                        crc32.update(bArr3);
                    }
                    j = crc32.getValue();
                } else {
                    j = 0;
                }
                return new Pair<>(obj, Long.valueOf(j));
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        }
    }

    public static /* synthetic */ int a(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3abf709", new Object[]{file, file2})).intValue();
        }
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    public static File b(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            pgh.p("empty folder path");
            return null;
        }
        File file = new File(AppContextHolder.f5004a.getFilesDir(), str);
        if (file.isFile() && !file.delete()) {
            pgh.p("exception while deleting " + file);
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            pgh.p("exception while mkdirs " + file);
            return null;
        }
    }

    public static File c(String str, String str2, Object obj, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("be06e711", new Object[]{str, str2, obj, new Boolean(z)});
        }
        jst.a();
        File m = m(str, str2);
        if (m.exists()) {
            m.delete();
        }
        Pair<File, Long> b = f28646a.b(obj, new Pair<>(m, Boolean.valueOf(z)));
        if (b == null) {
            pgh.p("write sync failed");
            return null;
        }
        if (z) {
            if (b.second == null) {
                pgh.p("missing checksum");
            }
            KVStorage.setKeyValue("fb__kv_checksum", str + "_" + str2, String.valueOf(b.second));
        }
        return (File) b.first;
    }

    public static File d(String str, String str2, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b1c38f35", new Object[]{str, str2, new Boolean(z)});
        }
        jst.a();
        try {
            File i = i(str, str2);
            if (z) {
                String keyValue = KVStorage.getKeyValue("fb__kv_checksum", str + "_" + str2);
                if (keyValue == null) {
                    pgh.p("no expected checksum");
                    return null;
                } else if (fua.a(i) != Long.parseLong(keyValue)) {
                    pgh.p("checksum failed");
                    return null;
                }
            }
            return i;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<File> e(String str, String str2, final FileFilter fileFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2110d5cc", new Object[]{str, str2, fileFilter});
        }
        try {
            File[] listFiles = n(str, null).listFiles(new FileFilter() { // from class: tb.rd9
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return td9.h(fileFilter, file);
                }
            });
            if (listFiles != null) {
                List<File> asList = Arrays.asList(listFiles);
                Collections.sort(asList, new Comparator() { // from class: tb.sd9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return td9.a((File) obj, (File) obj2);
                    }
                });
                return asList;
            }
        } catch (Exception e) {
            pgh.f("FileStorage", "error on listFilesByCreate", e);
        }
        return new ArrayList();
    }

    public static void f(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            pgh.p("empty folder path");
        }
        File file = new File(AppContextHolder.f5004a.getFilesDir(), str);
        if (!TextUtils.isEmpty(str2)) {
            file = new File(file, str2);
        }
        if (file.isFile()) {
            if (!file.delete()) {
                pgh.p("error on deleting " + file);
            }
        } else if (file.isDirectory() && !g(file)) {
            pgh.p("error on rm-dir-ing " + file);
        }
    }

    public static boolean g(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    g(file2);
                } else if (file2.isFile()) {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    public static /* synthetic */ boolean h(FileFilter fileFilter, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23772542", new Object[]{fileFilter, file})).booleanValue();
        }
        if (!file.isFile() || !fileFilter.accept(file)) {
            return false;
        }
        return true;
    }

    public static File i(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e4e27fb0", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            pgh.p("empty folder path or filename");
            return null;
        }
        File file = new File(new File(AppContextHolder.f5004a.getFilesDir(), str), str2);
        if (file.isFile()) {
            return file;
        }
        pgh.p(str + " 's file " + str2 + " is not a file");
        return null;
    }

    public static File j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{str});
        }
        jst.a();
        File cacheDir = AppContextHolder.f5004a.getCacheDir();
        String c = fua.c(ConnectionUtils.a(str));
        return new File(cacheDir + File.separator + c);
    }

    public static boolean k(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue();
        }
        jst.a();
        File n = n(str, str2);
        if (n.exists()) {
            return g(n);
        }
        return true;
    }

    public static boolean l(String str, String str2) throws Exception {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{str, str2})).booleanValue();
        }
        jst.a();
        File m = m(str, str2);
        if (!m.exists() || !m.delete()) {
            z = false;
        }
        KVStorage.setKeyValue("fb__kv_checksum", str + "_" + str2, null);
        return z;
    }

    public static File m(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3334fb8d", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            pgh.p("empty file name");
            return null;
        }
        File file = new File(b(str), str2);
        if (!file.isDirectory()) {
            return file;
        }
        pgh.p("file " + str + "  " + str2 + "is a dir");
        return null;
    }

    public static File n(String str, String str2) throws Exception {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4d507a2c", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            pgh.p("empty folder name");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            file = b(str);
        } else {
            file = new File(b(str), str2);
        }
        if (!file.isFile()) {
            return file;
        }
        pgh.p("folder " + str + " " + str2 + "is a file");
        return null;
    }
}
