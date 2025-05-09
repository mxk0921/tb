package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.common.NdkCore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f19105a = null;

    static {
        t2o.a(618659863);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            f19105a = context;
        }
    }

    public static String c(String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d2bda37", new Object[]{str, new Integer(i)});
        }
        Context context = f19105a;
        if (context == null) {
            return "";
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            str2 = "/data/data/" + f19105a.getPackageName() + "/files";
        } else {
            str2 = filesDir.getPath();
        }
        return str2 + "/lib" + str + "_bk_" + i + jcq.SO_EXTENSION;
    }

    public static boolean b(String str, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8e0174e", new Object[]{str, new Integer(i)})).booleanValue();
        }
        String c = c(str, i);
        File file = new File(c);
        if (file.exists()) {
            try {
                System.load(c);
            } catch (Throwable unused) {
                file.delete();
            }
            if (!z || NdkCore.a("mips") || NdkCore.a("x86")) {
                return z;
            }
            try {
                return d(str, i);
            } catch (IOException e) {
                e.printStackTrace();
                return z;
            }
        }
        z = false;
        return !z ? z : z;
    }

    public static boolean d(String str, int i) throws IOException {
        String str2;
        Throwable th;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88bf0292", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (f19105a == null) {
            return false;
        }
        String str3 = "lib/armeabi/lib" + str + jcq.SO_EXTENSION;
        String c = c(str, i);
        ApplicationInfo applicationInfo = f19105a.getApplicationInfo();
        if (applicationInfo != null) {
            str2 = applicationInfo.sourceDir;
        } else {
            str2 = "";
        }
        ZipFile zipFile = new ZipFile(str2);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith(str3)) {
                InputStream inputStream = null;
                try {
                    File file = new File(c);
                    if (file.exists()) {
                        file.delete();
                    }
                    InputStream inputStream2 = zipFile.getInputStream(zipEntry);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            int i2 = 0;
                            while (true) {
                                int read = inputStream2.read(bArr);
                                if (read > 0) {
                                    fileOutputStream.write(bArr, 0, read);
                                    i2 += read;
                                } else {
                                    try {
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            inputStream2.close();
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                zipFile.close();
                            } catch (Exception unused3) {
                            }
                            if (i2 > 0) {
                                try {
                                    System.load(c);
                                    return true;
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                }
                            }
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused4) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception unused5) {
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (Exception unused6) {
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                }
            }
        }
        return false;
    }
}
