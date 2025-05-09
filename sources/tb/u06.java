package tb;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u06 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ConcurrentHashMap<String, String> f29054a = new ConcurrentHashMap<>(50);

    static {
        t2o.a(444596994);
    }

    public static boolean a(File file, long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c928ef3", new Object[]{file, jArr})).booleanValue();
        }
        if (jArr.length < 1 || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            jArr[0] = jArr[0] + file.length();
            return file.delete();
        } else if (!file.isDirectory()) {
            return true;
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return file.delete();
            }
            boolean z = false;
            for (File file2 : listFiles) {
                z = a(file2, jArr);
            }
            if (z) {
                return file.delete();
            }
            return z;
        }
    }

    public static String[] b(String str) {
        AssetManager assets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3047929e", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (assets = DinamicXEngine.x().getAssets()) == null) {
            return null;
        }
        try {
            return AssetsDelegate.proxy_list(assets, str);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23792f9", new Object[]{file});
        }
        try {
            return new String(g(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("447dc807", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (inputStream == null) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(2048);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused4) {
                }
            }
            try {
                inputStream.close();
            } catch (IOException unused5) {
            }
            throw th;
        }
    }

    public static byte[] e(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3548bd6c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(wh6.ASSET_DIR)) {
            return f(str);
        }
        return h(str);
    }

    public static byte[] f(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("865056a4", new Object[]{str});
        }
        return d(AssetsDelegate.proxy_open(DinamicXEngine.x().getAssets(), str));
    }

    public static byte[] g(File file) throws IOException {
        int read;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9716e563", new Object[]{file});
        }
        long length = file.length();
        if (length <= 2147483639) {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = (int) length;
            byte[] bArr = new byte[i2];
            while (true) {
                int read2 = fileInputStream.read(bArr, i, i2 - i);
                if (read2 > 0) {
                    i += read2;
                } else if (read2 < 0 || (read = fileInputStream.read()) < 0) {
                    break;
                } else {
                    if (i2 <= 2147483639 - i2) {
                        i2 = Math.max(i2 << 1, 8192);
                    } else if (i2 != 2147483639) {
                        i2 = 2147483639;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    bArr = Arrays.copyOf(bArr, i2);
                    bArr[i] = (byte) read;
                    i++;
                }
            }
            fileInputStream.close();
            if (i2 == i) {
                return bArr;
            }
            return Arrays.copyOf(bArr, i);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public static byte[] h(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fe32c10b", new Object[]{str});
        }
        return g(new File(str));
    }

    public static JSONObject i(String str, String str2) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("faa6e138", new Object[]{str, str2});
        }
        try {
            bArr = e(wh6.ASSET_DIR + str + str2);
        } catch (Throwable unused) {
            if (DinamicXEngine.j0()) {
                StringBuilder sb = new StringBuilder(str);
                sb.append("未使用内置模板索引文件" + str2);
                h36.w("DXTemplateInfoManager", sb.toString());
            }
            bArr = null;
        }
        if (!(bArr == null || bArr.length == 0)) {
            try {
                return JSON.parseObject(new String(bArr));
            } catch (Throwable th) {
                if (DinamicXEngine.j0()) {
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append("内置模板索引文件格式错误" + str2);
                    h36.e("DXTemplateInfoManager", th, sb2.toString());
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static boolean k(String str, byte[] bArr, boolean z) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9c9b50", new Object[]{str, bArr, new Boolean(z)})).booleanValue();
        }
        if (!zg5.B2() || !f29054a.containsKey(str)) {
            File file = new File(str);
            File file2 = new File(file.getParent());
            BufferedOutputStream bufferedOutputStream = null;
            int i = -1;
            int i2 = -1;
            try {
                try {
                    if (zg5.B2()) {
                        f29054a.put(str, "");
                    }
                    if (!file2.exists()) {
                        i2 = file2.mkdirs();
                    }
                    if (!zg5.n3() || !file.exists() || z) {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                        try {
                            bufferedOutputStream2.write(bArr);
                            try {
                                bufferedOutputStream2.close();
                                if (zg5.B2()) {
                                    f29054a.remove(str);
                                }
                            } catch (IOException unused) {
                            }
                            return true;
                        } catch (Exception e2) {
                            e = e2;
                            bufferedOutputStream = bufferedOutputStream2;
                            i = i2;
                            if (file.exists()) {
                                file.delete();
                            }
                            f fVar = new f("DinamicX_File");
                            f.a aVar = new f.a("Template", "Template_Write", f.DX_TEMPLATE_IO_WRITE_ERROR);
                            aVar.e = Thread.currentThread().getName() + " " + str + " dir.exist？ " + file2.exists() + "   mkdirRet " + i + " getFreeSpace " + file2.getFreeSpace() + str + xv5.a(e);
                            fVar.c.add(aVar);
                            ic5.p(fVar);
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused2) {
                                    return false;
                                }
                            }
                            if (zg5.B2()) {
                                f29054a.remove(str);
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused3) {
                                    throw th;
                                }
                            }
                            if (zg5.B2()) {
                                f29054a.remove(str);
                            }
                            throw th;
                        }
                    } else {
                        la6.b(str + "file 已经存在，无需在进行写入");
                        try {
                            if (zg5.B2()) {
                                f29054a.remove(str);
                            }
                        } catch (IOException unused4) {
                        }
                        return true;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            la6.b("存在正在写的文件 " + str);
            DinamicXEngine.j0();
            f fVar2 = new f("dinamicx");
            f.a aVar2 = new f.a("Template", "Template_Write", f.DX_TEMPLATE_IO_WRITE_ERROR_60039);
            aVar2.e = Thread.currentThread().getName() + "存在正在写的文件 " + str;
            fVar2.c.add(aVar2);
            ic5.p(fVar2);
            return false;
        }
    }

    public static boolean j(DXTemplateItem dXTemplateItem, byte[] bArr, String str, vwb vwbVar, f fVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8fbd2c1", new Object[]{dXTemplateItem, bArr, str, vwbVar, fVar})).booleanValue();
        }
        if (dXTemplateItem == null || bArr == null || vwbVar == null || TextUtils.isEmpty(str)) {
            fVar.c.add(new f.a("Downloader", "Downloader_download", 60002));
            return false;
        }
        HashMap hashMap = new HashMap();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new ByteArrayInputStream(bArr)));
            z = false;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                byte[] bArr2 = new byte[8192];
                String name = nextEntry.getName();
                if (!nextEntry.getName().contains("../") && !nextEntry.isDirectory()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    String str2 = str + name;
                    File file = new File(new File(str2).getParent());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    while (true) {
                        int read = zipInputStream.read(bArr2, 0, 8192);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (dXTemplateItem.k == null) {
                        dXTemplateItem.k = new xh6();
                    }
                    if (wh6.DX_MAIN_TEMPLATE_NAME.equalsIgnoreCase(name)) {
                        dXTemplateItem.k.f31396a = str2;
                    } else {
                        xh6 xh6Var = dXTemplateItem.k;
                        if (xh6Var.b == null) {
                            xh6Var.b();
                        }
                        dXTemplateItem.k.b.put(name, str2);
                    }
                    hashMap.put(str2, byteArray);
                    byteArrayOutputStream.flush();
                    z = true;
                }
            }
            zipInputStream.close();
        } catch (Throwable th) {
            hashMap.clear();
            f.a aVar = new f.a("Downloader", "Downloader_download", f.DX_TEMPLATE_UNZIP_ERROR);
            aVar.e = xv5.a(th);
            fVar.c.add(aVar);
            z = false;
        }
        if (z) {
            xh6 xh6Var2 = dXTemplateItem.k;
            if (xh6Var2 == null || TextUtils.isEmpty(xh6Var2.f31396a)) {
                f.a aVar2 = new f.a("Downloader", "Downloader_download", f.DX_TEMPLATE_UNZIP_ERROR);
                aVar2.e = "模板zip中缺少main.dx";
                fVar.c.add(aVar2);
                return false;
            } else if (zg5.g5()) {
                boolean a2 = vwbVar.a(dXTemplateItem, hashMap);
                la6.b(dXTemplateItem.d() + "onUnzipFinished " + a2);
                return a2;
            } else {
                vwbVar.a(dXTemplateItem, hashMap);
            }
        }
        return z;
    }
}
