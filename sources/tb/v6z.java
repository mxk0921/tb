package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class v6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final v6z INSTANCE = new v6z();

    static {
        t2o.a(598737309);
    }

    public static /* synthetic */ byte[] f(v6z v6zVar, String str, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("72287126", new Object[]{v6zVar, str, new Long(j), new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 268435456;
        }
        return v6zVar.e(str, j);
    }

    public static /* synthetic */ boolean h(v6z v6zVar, File file, File file2, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eee9104e", new Object[]{v6zVar, file, file2, new Integer(i), new Integer(i2), obj})).booleanValue();
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return v6zVar.g(file, file2, i);
    }

    public static /* synthetic */ boolean j(v6z v6zVar, String str, byte[] bArr, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d2c1a9", new Object[]{v6zVar, str, bArr, new Boolean(z), new Integer(i), obj})).booleanValue();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return v6zVar.i(str, bArr, z);
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602541f1", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "pathStr");
        return new File(str).exists();
    }

    public final boolean c(File file) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a9cc153", new Object[]{this, file})).booleanValue();
        }
        try {
            if (!file.exists()) {
                z = file.mkdirs();
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final byte[] d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1a374e75", new Object[]{this, context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "assetFilePath");
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            ckf.f(proxy_open, "inputStream");
            byte[] c = hp2.c(proxy_open);
            lw3.a(proxy_open, null);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final byte[] e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("21204f1c", new Object[]{this, str, new Long(j)});
        }
        ckf.g(str, "filePath");
        try {
            File file = new File(str);
            if (file.length() <= j) {
                return nh9.a(file);
            }
            throw new IllegalArgumentException("文件大小超过限制");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean i(String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c5d2d25", new Object[]{this, str, bArr, new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "filePath");
        ckf.g(bArr, "data");
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                if (parentFile.exists()) {
                    parentFile = null;
                }
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            fileOutputStream.write(bArr);
            xhv xhvVar = xhv.INSTANCE;
            lw3.a(fileOutputStream, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final List<String> b(String str) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("985ed87", new Object[]{this, str});
        }
        ckf.g(str, "pathStr");
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            if (iiz.c()) {
                iiz.Companion.j(ckf.p("目录不存在或不是目录: ", str));
            }
            return yz3.i();
        }
        String[] list = file.list();
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(list.length);
            for (String str2 : list) {
                arrayList2.add(new File(file, str2).getAbsolutePath());
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? yz3.i() : arrayList;
    }

    public final boolean g(File file, File file2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f77c3ee", new Object[]{this, file, file2, new Integer(i)})).booleanValue();
        }
        ckf.g(file, "zipFile");
        ckf.g(file2, "destDir");
        try {
            if (!file2.exists()) {
                c(file2);
            }
            FileOutputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (true) {
                th = null;
                if (nextEntry != null) {
                    File file3 = new File(file2, nextEntry.getName());
                    String canonicalPath = file3.getCanonicalPath();
                    ckf.f(canonicalPath, "file.canonicalPath");
                    String canonicalPath2 = file2.getCanonicalPath();
                    ckf.f(canonicalPath2, "destDir.canonicalPath");
                    if (tsq.I(canonicalPath, canonicalPath2, false, 2, th)) {
                        if (nextEntry.isDirectory()) {
                            INSTANCE.c(file3);
                        } else {
                            File parentFile = file3.getParentFile();
                            if (parentFile != null) {
                                INSTANCE.c(parentFile);
                            }
                            zipInputStream = new FileOutputStream(file3);
                            try {
                                byte[] bArr = new byte[i];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    zipInputStream.write(bArr, 0, read);
                                }
                                xhv xhvVar = xhv.INSTANCE;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                    lw3.a(zipInputStream, th);
                                }
                            }
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        throw new SecurityException(ckf.p("非法ZIP条目路径: ", nextEntry.getName()));
                    }
                } else {
                    zipInputStream.closeEntry();
                    xhv xhvVar2 = xhv.INSTANCE;
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
